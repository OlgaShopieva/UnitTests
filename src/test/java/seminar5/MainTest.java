package seminar5;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MainTest {

    @Test
    void testSeleniumMainTest(){
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Ольга\\IdeaProjects\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://ya.ru");
        WebElement searchBox = driver.findElement(By.id("text"));
        searchBox.sendKeys("Selenium");
        searchBox.submit();

        List<WebElement> elements = driver.findElements(By.cssSelector("div"));
        boolean isFound = false;

        for (WebElement element: elements) {
            if(element.getText().contains("selenium.dev")){
                isFound = true;
                break;
            }
        }
        driver.quit();
        assertTrue(isFound);
    }

    @Test
    void testSauceMainTest(){
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Ольга\\IdeaProjects\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        WebElement login = driver.findElement(By.id("user-name"));
        login.sendKeys("standard_user");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");
        WebElement button = driver.findElement(By.id("login-button"));
        button.click();

        WebElement products = driver.findElement(By.className("title"));
        String productsText = products.getText();
        driver.quit();

        assertEquals("Products", productsText);




    }


    //5.1.

    //5.2.

    //5.3.
}