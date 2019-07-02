package com.olbati.romanNumerals;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RomanNumeralsTest {

    private RomanNumerals romanNumerals = new RomanNumerals();


    @Test
    public void should_return_error_if_input_is_lower_than_1_or_bigger_than_3999(){
        assertThat(romanNumerals.toRoman(-4)).isEqualTo("Invalid input");
        assertThat(romanNumerals.toRoman(0)).isEqualTo("Invalid input");
        assertThat(romanNumerals.toRoman(4001)).isEqualTo("Invalid input");
    }

    @Test
    public void should_return_good_roman() {
        assertThat(romanNumerals.toRoman(5)).isEqualTo("V");
        assertThat(romanNumerals.toRoman(14)).isEqualTo("XIV");
        assertThat(romanNumerals.toRoman(1991)).isEqualTo("MCMXCI");


    }

}

