/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Algorithm;

import org.junit.Test;
import algorithm.App;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }
}
