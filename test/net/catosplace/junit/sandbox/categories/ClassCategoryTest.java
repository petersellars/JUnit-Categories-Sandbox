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
 * Test class that has a class level category.
 * 
 * @author Peter Sellars
 * 
 */
@Category(UnitTests.class)
public class ClassCategoryTest {

	
	@Rule public MethodRule watchman = new TestWatchman() {
		public void starting(FrameworkMethod method) {
			logger.info("{} being run...", method.getName());
		}
	};
	
	final Logger logger = LoggerFactory.getLogger(ClassCategoryTest.class);
	
	@Test
	public void testA() {
		
	}
	
	@Test
	public void testB() {

	}
}
