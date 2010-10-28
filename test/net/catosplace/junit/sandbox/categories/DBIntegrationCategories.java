package net.catosplace.junit.sandbox.categories;

import org.junit.experimental.categories.Categories;
import org.junit.runner.manipulation.NoTestsRemainException;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.RunnerBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Test class that filters out all tests not marked with a method/class
 * category of type DBIntegrationTests or sub-class.
 * 
 * @author ps1336
 *
 */
public class DBIntegrationCategories extends Categories {

	final Logger logger = LoggerFactory.getLogger(DBIntegrationCategories.class);
	
	public DBIntegrationCategories(Class<?> klass, RunnerBuilder builder)
			throws InitializationError {
		super(klass, builder);
		try {
			CategoryFilter categoryFilter = new CategoryFilter(DBIntegrationTests.class, null);
			logger.info(categoryFilter.describe());
			filter(categoryFilter);
		} catch (NoTestsRemainException e) {
			throw new InitializationError(e);
		}
	}

}
