package se.reky.hakan;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import se.reky.hakan.model.Player;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class PlayerInteractionTest {

    private Player player;

    private PlayerInteraction createPlayerInteraction(String dataForScanner) {
        return new SimplePlayerInteraction(new IOHandler(new Scanner(dataForScanner)));
    }

    @BeforeEach
    void init() {
        player = new Player();
    }

    @Test
    @DisplayName("Test player setup")
    public void testPlayerSetup() {
        // Arrange
        PlayerInteraction playerInteraction = createPlayerInteraction("Ronja");
        // Act
        playerInteraction.setupPlayer(player);
        // Assert
        assertEquals("Ronja", player.getName());
    }

    @Test
    @DisplayName("Test player health update")
    public void testPlayerHealthUpdate() {
        // Arrange
        PlayerInteraction playerInteraction = createPlayerInteraction("Ronja");
        // Act
        playerInteraction.updatePlayerHealth(player, 15);
        // Assert
        assertEquals(15, player.getHp());
    }

}