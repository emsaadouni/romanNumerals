package com.olbati.romanNumerals;

import java.util.TreeMap;

public class RomanNumerals {
    private final static TreeMap<Integer, String> map = new TreeMap<Integer, String>();
    static {

        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");
    }
    public String toRoman(int input) {
        if (input < 1 || input > 3999) {
            return "Invalid input";
        }
        int key =  map.floorKey(input);
        if ( input == key) {
            return map.get(input);
        }
        return map.get(key) + toRoman(input-key);
    }

    }
