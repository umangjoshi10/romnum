package com.roman_numeric.rom_num;

import org.junit.jupiter.api.*;

import com.roman_numeric.rom_num.Service.ConvertServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

public class ConversionTests {
    @Test
    void testDigitsToNumerals() {
        ConvertServiceImpl comp=new ConvertServiceImpl();
        assertEquals("I", comp.getNumericaltoRoman(1));
        assertEquals("IV", comp.getNumericaltoRoman(4));
        assertEquals("V", comp.getNumericaltoRoman(5));
        assertEquals("IX", comp.getNumericaltoRoman(9));
        assertEquals("X", comp.getNumericaltoRoman(10));
    }

    @Test
    void testNumeralsToDigits() {
        ConvertServiceImpl comp=new ConvertServiceImpl();
        assertEquals(1, comp.getRomantoNumerical("I"));
        assertEquals(4, comp.getRomantoNumerical("IV"));
        assertEquals(5, comp.getRomantoNumerical("V"));
        assertEquals(9, comp.getRomantoNumerical("IX"));
        assertEquals(10, comp.getRomantoNumerical("X"));
    }
}
