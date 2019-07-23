import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class PostgressApplicationTest {
    @Test
    public void testAppHasAGreeting() {
        PostgressApplication classUnderTest = new PostgressApplication();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }
}