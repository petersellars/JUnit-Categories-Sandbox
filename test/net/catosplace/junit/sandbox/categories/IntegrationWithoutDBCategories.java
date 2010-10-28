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
public class IntegrationWithoutDBCategories extends Categories {

	final Logger logger = LoggerFactory.getLogger(IntegrationWithoutDBCategories.class);
	
	public IntegrationWithoutDBCategories(Class<?> klass, RunnerBuilder builder)
			throws InitializationError {
		super(klass, builder);
		try {
			CategoryFilter categoryFilter = new CategoryFilter(IntegrationTests.class, DBIntegrationTests.class);
			logger.info(categoryFilter.describe());
			filter(categoryFilter);
		} catch (NoTestsRemainException e) {
			throw new InitializationError(e);
		}
	}

}
