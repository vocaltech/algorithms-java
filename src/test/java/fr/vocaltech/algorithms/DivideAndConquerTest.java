package fr.vocaltech.algorithms;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DivideAndConquerTest {
    @Test
    void givenAnIntArray_whenFindMax_thenReturnIntMax() {
        // GIVEN
        int[] arr = { 1, 6, 5, 4, 8, 3, 4, 9, 1, 5 };

        // WHEN
        int max = DivideAndConquer.findMax(arr, 0, 9);

        // THEN
        assertThat(max).isEqualTo(9);
    }
}