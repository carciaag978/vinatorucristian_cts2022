package acs.ase.teste;

import acs.ase.clase.Persoana;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestGetSex {
    @Test
    public void testRightM() {
        Persoana persoana = new Persoana("Andrei", "5000143297654");
        assertEquals("M", persoana.getSex());
    }
    @Test
    public void testBoundaryInferior(){
        Persoana persoana = new Persoana("Mihai", "1001214072161");
        assertEquals("M", persoana.getSex());
    }

    @Test
    public void testBoundarySuperior(){
        Persoana persoana = new Persoana("Maria", "6000609072161");
        assertEquals("F", persoana.getSex());
    }

    @Test
    public void testCrossCheck(){
        Persoana persoana = new Persoana("Florina", "6000609072161");
        int cifra = persoana.CNP.charAt(0);
        assertEquals(cifra%2 != 0 ? "M" : "F", persoana.getSex());
    }

    @Test(expected = CnpInvalidException.class)
    public void testError(){
        Persoana persoana = new Persoana("Florina", "0000609072161");
        persoana.getSex();
    }

    @Test(expected = CnpInvalidException.class)
    public void testError2(){
        Persoana persoana = new Persoana("Florina", "g000609072161");
        persoana.getSex();
    }

    @Test(timeout = 100)
    public void testPerformance(){
        Persoana persoana = new Persoana("Florina", "6000609072161");
        persoana.getSex();
    }

    @Test
    public void testFormatGetSex(){
        Persoana persoana = new Persoana("Florina", "6000609072161");
        assertEquals(1, persoana.getSex().length());
    }

    @Test
    public void testRange(){
        Persoana persoana = new Persoana("Florina", "9000609072161");
        assertEquals("N/A", persoana.getSex());
    }

    @Test(expected = NullPointerException.class)
    public void testExistence(){
        Persoana persoana = new Persoana("Florina", null);
        persoana.getSex();
    }

}

