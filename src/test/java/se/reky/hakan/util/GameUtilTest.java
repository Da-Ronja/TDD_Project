package se.reky.hakan.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import se.reky.hakan.GameException;

import static org.junit.jupiter.api.Assertions.*;

class GameUtilTest {

    private final GameUtil gameUtil = new GameUtil();

    @Test
    @DisplayName("Test toLowerCaseButFirstLetterCapitalized with null and expect GameException")
    void testToLowerCaseButFirstLetterCapitalizedWithNull() {
        assertThrows(GameException.class, () -> gameUtil.toLowerCaseButFirstLetterCapitalized(null));
    }

}