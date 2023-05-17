package com.sebastian_daschner.coffee.control;

import com.sebastian_daschner.UnitTest;
import io.qameta.allure.AllureId;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collection;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class StringsTest {

    @ParameterizedTest
    @AllureId("57")
    @MethodSource("testData")
    @UnitTest
    @Feature("Utils")
    @Owner("johndoe")
    void testCapitalize(String input, String expected) {

        String output = Strings.capitalize(input);

        assertThat(output).isEqualTo(expected);
    }

    private static Collection<String[]> testData() {
        return List.of(
                new String[]{"hello", "Hello"},
                new String[]{"Hello", "Hello"},
                new String[]{"HELLO", "Hello"},
                new String[]{"hELlO", "Hello"},
                new String[]{"hello world", "Hello world"},
                new String[]{"HELLO_WORLD", "Hello_world"},
                new String[]{"H", "H"},
                new String[]{"h", "H"},
                new String[]{".", "."},
                new String[]{"", ""});
    }

}