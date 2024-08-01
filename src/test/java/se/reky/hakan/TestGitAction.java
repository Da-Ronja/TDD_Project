package se.reky.hakan;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestGitAction {

    @Test
    @DisplayName("Test Should Fail In GitHub Action")
    void testShouldFail() {

        assertEquals(1, 2);
    }

    @Test
    @DisplayName("Test Should Pass In GitHub Action")
    void testShouldPass() {

        assertEquals(1, 1);
    }
}
