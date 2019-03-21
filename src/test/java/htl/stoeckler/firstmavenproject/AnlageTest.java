/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package htl.stoeckler.firstmavenproject;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kilian Stoeckler
 */
public class AnlageTest {

    public AnlageTest() {
    }

    /**
     * Test of jahresAfa method, of class Anlage.
     */
    @org.junit.Test
    public void testJahresAfa() {
        Anlage a = new Anlage(2000.0, 10);
        assertEquals(200.0, a.getBuchwert(), 0.01);
    }

    public void testBuchwert2() {
        Anlage a = new Anlage(2000.0, 10);
        a.updateBuchwert(12);
        assertEquals(1.0, a.getBuchwert(), 0.01);
    }

    public void testBuchwert1() {
        Anlage a = new Anlage(2000.0, 10);
        a.updateBuchwert(5);
        assertEquals(1000.0, a.getBuchwert(), 0.01);
    }

}
