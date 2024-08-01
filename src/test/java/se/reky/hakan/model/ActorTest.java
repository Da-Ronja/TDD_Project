package se.reky.hakan.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ActorTest {

    private Actor Guard;
    private Actor goblin;

    @BeforeEach
    void init() {
        Guard = new Guard("Guard", 20, 5);
        goblin = new Goblin("Goblin", 20, 3);
    }

    @Test
    @DisplayName("Test attack method och att HP minskar")
    void testAttack() {
        //Act
        Guard.attack(goblin);
        //Assert
        int expected = 15;
        int actual = goblin.getHp();
        //Act
        assertEquals(expected, actual);
    }

}