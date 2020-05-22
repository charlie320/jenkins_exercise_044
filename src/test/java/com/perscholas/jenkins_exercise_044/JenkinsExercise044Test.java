package com.perscholas.jenkins_exercise_044;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class JenkinsExercise044Test 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void sayHelloTest()
    {
        assertTrue(JenkinsExercise044.sayHello().equals("Hello Maven from JenkinsExercise044!!!"));
    }

    @Test
    public void sayGoodbyeTest() {
        assertFalse(JenkinsExercise044.sayHello().equals("Goodbye Maven from JenkinsExercise044!!!"));
        }
}
