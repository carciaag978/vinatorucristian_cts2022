package acs.ase.teste;

import acs.ase.clase.Persoana;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestGetVarsta {
    @Test
    public void testRightVarsta() {
        Persoana persoana = new Persoana("Andrei", "5000609282025");
        assertEquals(21, persoana.getVarsta());
    }

    @Test
    public void testBoundaryInferior(){
        Persoana persoana = new Persoana("Andrei", "3000101282025");
        assertEquals(222, persoana.getVarsta());
    }
    @Test
    public void testBoundarySuperior(){
        Persoana persoana = new Persoana("Andrei", "5220101282025");
        assertEquals(0, persoana.getVarsta());
    }
    @Test(expected = CnpInvalidException.class)
    public void testVarstaInvalida(){
        Persoana persoana = new Persoana("Andrei", "5250101282025");
        persoana.getVarsta();
    }

    @Test(timeout = 100)
    public void testPerformance(){
        Persoana persoana = new Persoana("Andrei", "5000101282025");
        persoana.getVarsta();
    }

    @Test
    public void testFormat(){
        Persoana persoana = new Persoana("Andrei", "5000101282025");
        assertTrue(persoana.getVarsta() >= 0);
    }

    @Test
    public void testOrder(){
        Persoana persoana1 = new Persoana("Andrei", "2980101282025");
        Persoana persoana2 = new Persoana("Andrei", "5020101282025");
        assertTrue(persoana1.getVarsta() > persoana2.getVarsta());
    }

    @Test(expected = NullPointerException.class)
    public void testGetVarstaExistance(){
        Persoana persoana1 = new Persoana("Andrei", null);
        persoana1.getVarsta();
    }
}
