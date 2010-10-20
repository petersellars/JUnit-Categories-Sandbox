package net.catosplace.junit.sandbox.categories;

import org.junit.BeforeClass;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(ExperimentalCategories.class)
@SuiteClasses( { NoClassCategoryTest.class, 
				 ClassCategoryTest.class,
				 IntegrationClassCategoryTest.class,
				 MethodCategoryTest.class } )
public class ExperimentalCategoryTestSuite {

}
