/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package projeto1;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author enric
 */
public class DisciplinaTest {
    
    public DisciplinaTest() {
    }

    /**
     * Test of adicionarProfessor method, of class Disciplina.
     */
    @Test
    public void testAdicionarProfessor() {
        System.out.println("adicionarProfessor");
        Professor objeto = null;
        Disciplina instance = new Disciplina();
        instance.adicionarProfessor(objeto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removerProfessor method, of class Disciplina.
     */
    @Test
    public void testRemoverProfessor() {
        System.out.println("removerProfessor");
        Professor objeto = null;
        Disciplina instance = new Disciplina();
        instance.removerProfessor(objeto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of conferirProfessor method, of class Disciplina.
     */
    @Test
    public void testConferirProfessor() {
        System.out.println("conferirProfessor");
        String nome = "";
        Disciplina instance = new Disciplina();
        boolean expResult = false;
        boolean result = instance.conferirProfessor(nome);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nomeProfessores method, of class Disciplina.
     */
    @Test
    public void testNomeProfessores() {
        System.out.println("nomeProfessores");
        int index = 0;
        Disciplina instance = new Disciplina();
        String expResult = "";
        String result = instance.nomeProfessores(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class Disciplina.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Disciplina instance = new Disciplina();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Disciplina.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Disciplina instance = new Disciplina();
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEcts method, of class Disciplina.
     */
    @Test
    public void testGetEcts() {
        System.out.println("getEcts");
        Disciplina instance = new Disciplina();
        int expResult = 0;
        int result = instance.getEcts();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEcts method, of class Disciplina.
     */
    @Test
    public void testSetEcts() {
        System.out.println("setEcts");
        int ects = 0;
        Disciplina instance = new Disciplina();
        instance.setEcts(ects);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdioma method, of class Disciplina.
     */
    @Test
    public void testGetIdioma() {
        System.out.println("getIdioma");
        Disciplina instance = new Disciplina();
        String expResult = "";
        String result = instance.getIdioma();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdioma method, of class Disciplina.
     */
    @Test
    public void testSetIdioma() {
        System.out.println("setIdioma");
        String idioma = "";
        Disciplina instance = new Disciplina();
        instance.setIdioma(idioma);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProfessores method, of class Disciplina.
     */
    @Test
    public void testGetProfessores() {
        System.out.println("getProfessores");
        Disciplina instance = new Disciplina();
        ArrayList<Professor> expResult = null;
        ArrayList<Professor> result = instance.getProfessores();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verProfessorIndice method, of class Disciplina.
     */
    @Test
    public void testVerProfessorIndice() {
        System.out.println("verProfessorIndice");
        int index = 0;
        Disciplina instance = new Disciplina();
        instance.verProfessorIndice(index);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuantProfessores method, of class Disciplina.
     */
    @Test
    public void testGetQuantProfessores() {
        System.out.println("getQuantProfessores");
        Disciplina instance = new Disciplina();
        int expResult = 0;
        int result = instance.getQuantProfessores();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuantProfessores method, of class Disciplina.
     */
    @Test
    public void testSetQuantProfessores() {
        System.out.println("setQuantProfessores");
        int quantProfessores = 0;
        Disciplina instance = new Disciplina();
        instance.setQuantProfessores(quantProfessores);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProfessorNome method, of class Disciplina.
     */
    @Test
    public void testSetProfessorNome() {
        System.out.println("setProfessorNome");
        ArrayList<Professor> professores = null;
        String nome = "";
        Disciplina instance = new Disciplina();
        instance.setProfessorNome(professores, nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Disciplina.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Disciplina instance = new Disciplina();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
