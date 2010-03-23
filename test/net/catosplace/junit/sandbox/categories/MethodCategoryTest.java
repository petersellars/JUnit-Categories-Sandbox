/**
 *
 */
package net.catosplace.junit.sandbox.categories;

import org.junit.Rule;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.rules.MethodRule;
import org.junit.rules.TestWatchman;
import org.junit.runners.model.FrameworkMethod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Test class that has a method level categories.
 * 
 * @author Peter Sellars
 * 
 */
public class MethodCategoryTest {

	
	@Rule public MethodRule watchman = new TestWatchman() {
		public void starting(FrameworkMethod method) {
			logger.info("{} being run...", method.getName());
		}
	};
	
	final Logger logger = LoggerFactory.getLogger(MethodCategoryTest.class);
	
	@Category(UnitTests.class)
	@Test
	public void testA() {
		
	}
	
	@Category(IntegrationTests.class)
	@Test
	public void testB() {

	}
	
	@Category(DBIntegrationTests.class)
	@Test
	public void testC() {

	}
}
