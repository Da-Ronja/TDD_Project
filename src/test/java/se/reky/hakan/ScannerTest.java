package se.reky.hakan;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

public class ScannerTest {

    private Scanner createScanner(String dataForScanner) {
        return new Scanner(dataForScanner);
    }

    @Test
    @DisplayName("Test nextLine")
    public void testNextLine() {
        // Arrange
        Scanner scanner = createScanner("Hello");
        // Act
        String expected = "Hello";
        String result = scanner.nextLine();
        // Assert
        assertEquals(expected, result);
    }
}
