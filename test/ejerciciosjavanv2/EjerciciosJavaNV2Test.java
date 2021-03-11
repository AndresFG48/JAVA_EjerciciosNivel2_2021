/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjavanv2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Andrés
 */
public class EjerciciosJavaNV2Test {
    
    public EjerciciosJavaNV2Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of esEscaleraDePalabras method, of class EjerciciosJavaNV2.
     */
    @Test
    public void testEsEscaleraDePalabras() {
        System.out.println("esEscaleraDePalabras");
        char[][] listaPalabras = null;
        EjerciciosJavaNV2 instance = new EjerciciosJavaNV2();
        boolean expResult = false;
        boolean result = instance.esEscaleraDePalabras(listaPalabras);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of costeErroresADN method, of class EjerciciosJavaNV2.
     */
    @Test
    public void testCosteErroresADN() {
        System.out.println("costeErroresADN");
        String uno = "";
        String dos = "";
        EjerciciosJavaNV2 instance = new EjerciciosJavaNV2();
        int expResult = 0;
        int result = instance.costeErroresADN(uno, dos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of finDuplicate method, of class EjerciciosJavaNV2.
     */
    @Test
    public void testFinDuplicate() {
        System.out.println("finDuplicate");
        int[] listaNumeros = null;
        EjerciciosJavaNV2 instance = new EjerciciosJavaNV2();
        int expResult = 0;
        int result = instance.finDuplicate(listaNumeros);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of quitaAcentosV2 method, of class EjerciciosJavaNV2.
     */
    @Test
    public void testQuitaAcentosV2() {
        System.out.println("quitaAcentosV2");
        String cadena = "";
        EjerciciosJavaNV2 instance = new EjerciciosJavaNV2();
        String expResult = "";
        String result = instance.quitaAcentosV2(cadena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of StrStr method, of class EjerciciosJavaNV2.
     */
    @Test
    public void testStrStr() {
        System.out.println("StrStr");
        String str1 = "";
        String str2 = "";
        EjerciciosJavaNV2 instance = new EjerciciosJavaNV2();
        int expResult = 0;
        int result = instance.StrStr(str1, str2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class EjerciciosJavaNV2.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        EjerciciosJavaNV2.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
