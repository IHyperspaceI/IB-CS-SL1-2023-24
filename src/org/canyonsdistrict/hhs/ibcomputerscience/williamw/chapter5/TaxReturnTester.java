package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaxReturnTester {
    @Test
    public void testGetTax_singleRate1(){
        var taxReturn = new TaxReturn(29000, TaxReturn.SINGLE);
        Assertions.assertEquals(2900, taxReturn.getTax());
    }

    @Test
    public void testGetTax_singleRate2(){
        var taxReturn = new TaxReturn(33000, TaxReturn.SINGLE);
        Assertions.assertEquals(3450, taxReturn.getTax());
    }

    @Test
    public void testGetTax_marriedRate1(){
        var taxReturn = new TaxReturn(29000, TaxReturn.MARRIED);
        Assertions.assertEquals(2900, taxReturn.getTax());
    }

    @Test
    public void testGetTax_marriedRate2(){
        var taxReturn = new TaxReturn(29000, TaxReturn.SINGLE);
        Assertions.assertEquals(2900, taxReturn.getTax());
    }
}
