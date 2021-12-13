import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;

//public class Autocomplete {
//    public static void main(String[] args) throws InterruptedException {
//
//        System.setProperty("webdriver.chrome.driver", "D:/TMA Training/Selenium Essential Training/Environment/chromedriver.exe");
//
//        WebDriver driver = new ChromeDriver();
//
//        driver.get("https://formy-project.herokuapp.com/autocomplete");
//
//        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
//        autocomplete.sendKeys("1555 Park Blvd, Palo Alto, CA");
////        Thread.sleep(1000);
//
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//
////        WebElement autocompleteResult = driver.findElement(By.className("pac-item"));
////        autocompleteResult.click();
//
////        driver.quit();
//    }
//}



public class Autocomplete {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:/TMA Training/Selenium Essential Training/Environment/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("1555 Park Blvd, Palo Alto, CA");

        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement autocompleteResult = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("pac-item")));

        autocompleteResult.click();

//        driver.quit();
    }
}
