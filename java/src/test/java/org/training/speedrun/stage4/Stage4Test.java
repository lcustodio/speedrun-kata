package org.training.speedrun.stage4;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class Stage4Test {

    @ParameterizedTest
    @CsvSource({
            "aeiou,short_odd_aeiou",
            "AEIOUY,short_even_aeiouy",
            "ABCDEFGHIJKLMNOPQRSTUVWXYZ,long_even_aBCDeFGHiJKLMNoPQRSTuVWXyZ",
            "kjqtrpmnz,short_odd_kjqtrpmnz",
            "kjqtrpmnzr,long_even_kjqtrpmnzr",
            "kjqtrApmnzsr,long_even_kjqtrapmnzsr"
    })
    void doTheThing_transforms_the_input_string(String input, String output) {
        assertThat(new Stage4().doTheThing(input)).isEqualTo(output);
    }

    @Test
    void doTheThing_transforms_an_empty_string() {
        assertThat(new Stage4().doTheThing("")).isEqualTo("short_even_");
    }
}
