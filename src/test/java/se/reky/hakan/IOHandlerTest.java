package se.reky.hakan;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class IOHandlerTest {

    private IOHandler createIOHandler(String dataForScanner) {
        return new IOHandler(new Scanner(dataForScanner));
    }

    @Test
    @DisplayName("Test hasNextInt")
    public void testHasNextInt() {
        // Arrange
        IOHandler ioHandler = createIOHandler("5");
        // Act
        boolean result = ioHandler.hasNextInt();
        // Assert
        assertTrue(result);
    }

}