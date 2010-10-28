package net.catosplace.junit.sandbox.categories;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@IncludeCategory(IntegrationTests.class)
@ExcludeCategory(DBIntegrationTests.class)
@SuiteClasses( { NoClassCategoryTest.class,
				 ClassCategoryTest.class,
				 IntegrationClassCategoryTest.class, 
				 MethodCategoryTest.class } ) 
public class IntegrationTestNoDBCategoryTestSuite {

}
