package se.reky.hakan.web;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.jupiter.api.Assertions.*;


@Disabled
class PlayerControllerTest {

    private WebDriver driver;

    @BeforeAll
    static void init() {
        WebDriverManager.firefoxdriver().setup();
    }

    @BeforeEach
    void setUp() {
        driver = new FirefoxDriver();
        driver.get("http://localhost:8080/players");
    }

    @AfterEach
    void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    @DisplayName("Verify that the correct number of players are displayed in the list")
    void testNumberOfPlayers() {
        // Act
        int expectedNumberOfPlayers = 3;
        int actualNumberOfPlayers = driver.findElements(By.tagName("li")).size();
        // Assert
        assertEquals(expectedNumberOfPlayers, actualNumberOfPlayers);
    }

    @Test
    @DisplayName("Verify that the name of the first player in the list is displayed on the page")
    void testFirstPlayerName() {
        // Act
        WebElement firstPlayerName = driver.findElement(By.cssSelector("ul li:first-child .player-name"));
        boolean isDisplayed = firstPlayerName.isDisplayed();
        // Assert
        assertTrue(isDisplayed);
    }

    @Test
    @DisplayName("Test that the page title matches the expected value")
    void testPageTitle() {
        // Act
        String expectedTitle = "Players List";
        String actualTitle = driver.getTitle();
        // Assert
        assertEquals(expectedTitle, actualTitle);
    }

    @Test
    @DisplayName("Test that the button has the text = Logga in")
    void testButtonText() {
       // Act
        String expectedButtonText = "Logga in";
        String actualButtonText = driver.findElement(By.cssSelector("button")).getText();
        // Assert
        assertEquals(expectedButtonText, actualButtonText);
    }

}