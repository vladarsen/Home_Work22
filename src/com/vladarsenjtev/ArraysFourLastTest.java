package com.vladarsenjtev;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


public class ArraysFourLastTest {

    @ParameterizedTest
    @MethodSource("pullingOriginalParam")
    public void shouldPullingOriginal_arrayElemFourLast_arraysFourLast(int[] a, int[] expected) {
        Assertions.assertArrayEquals(expected, FourLast.arraysFourLast(a));
    }

    public static Stream<Arguments> pullingOriginalParam() {
        return Stream.of(
                Arguments.of(new int[]{4, 2, 3, 5, 6, 4, 1, 10, 20, 30}, new int[]{1, 10, 20, 30}),
                Arguments.of(new int[]{4, 2, 3, 5, 6, 1, 10, 4, 30}, new int[]{30})
        );
    }

    @Test
    public void shouldPullingOriginal_ArgumentException() {
        Assertions.assertThrows(RuntimeException.class, () -> FourLast.arraysFourLast(new int[]{0, 3, 5, 6, 1, 10, 30}));
    }

    @ParameterizedTest
    @MethodSource("pullingOriginalArguments")
    public void shouldPullingOriginal_CountOneFourVer(int[] a) {
        Assertions.assertTrue(FourLast.arraysOneFour(a));
    }


    public static Stream<Arguments> pullingOriginalArguments() {
        return Stream.of(
                Arguments.of(new int[]{0, 2, 3, 5, 6, 4, 1, 10, 20, 30}),
                Arguments.of(new int[]{1, 1, 4, 5, 6, 4, 1, 10, 20, 30})
        );
    }
}

