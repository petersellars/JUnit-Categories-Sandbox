package net.catosplace.junit.sandbox.categories;

import org.junit.experimental.categories.Categories;
import org.junit.runner.manipulation.NoTestsRemainException;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.RunnerBuilder;

public class ExperimentalCategories extends Categories {

	public ExperimentalCategories(Class<?> klass, RunnerBuilder builder)
			throws InitializationError {
		super(klass, builder);
		try {
			filter(new CategoryFilter(DBIntegrationTests.class, null));
		} catch (NoTestsRemainException e) {
			throw new InitializationError(e);
		}
	}

}
