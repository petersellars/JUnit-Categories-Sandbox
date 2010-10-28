package net.catosplace.junit.sandbox.categories;

import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

/**
 * Uses an class that extends Categories to filter out
 * DBIntegration category tests from the Integration category
 * tests.
 * 
 * Also makes use of the AllCategoriesTestSuite to reduce the
 * noise in the SuiteClasses call.
 * 
 * @author ps1336
 *
 */

@RunWith(IntegrationWithoutDBCategories.class)
/*
 @SuiteClasses( { NoClassCategoryTest.class,
				  ClassCategoryTest.class,
				  IntegrationClassCategoryTest.class, 
				  MethodCategoryTest.class } ) 
*/
@SuiteClasses(AllCategoriesTestSuite.class)
public class IntegrationWithoutDBCategoriesTestSuite {

}
