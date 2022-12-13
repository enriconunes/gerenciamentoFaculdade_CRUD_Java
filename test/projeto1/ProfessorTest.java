/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package projeto1;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author enric
 */
public class ProfessorTest {
    
    public ProfessorTest() {
    }

    /**
     * Test of getCargo method, of class Professor.
     */
    @Test
    public void testGetCargo() {
        System.out.println("getCargo");
        Professor instance = new Professor();
        String expResult = "";
        String result = instance.getCargo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCargo method, of class Professor.
     */
    @Test
    public void testSetCargo() {
        System.out.println("setCargo");
        String cargo = "";
        Professor instance = new Professor();
        instance.setCargo(cargo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class Professor.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Professor instance = new Professor();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class Professor.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        Professor instance = new Professor();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTelemovel method, of class Professor.
     */
    @Test
    public void testGetTelemovel() {
        System.out.println("getTelemovel");
        Professor instance = new Professor();
        int expResult = 0;
        int result = instance.getTelemovel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTelemovel method, of class Professor.
     */
    @Test
    public void testSetTelemovel() {
        System.out.println("setTelemovel");
        int telemovel = 0;
        Professor instance = new Professor();
        instance.setTelemovel(telemovel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Professor.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Professor instance = new Professor();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
