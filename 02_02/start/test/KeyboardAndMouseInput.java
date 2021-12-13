import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//// 02_02
//public class KeyboardAndMouseInput {
//    public static void main(String[] args) throws InterruptedException {
//
//        System.setProperty("webdriver.chrome.driver", "D:/TMA Training/Selenium Essential Training/Environment/chromedriver.exe");
//
//        WebDriver driver = new ChromeDriver();
//
//        driver.get("https://formy-project.herokuapp.com/keypress");
//
//        WebElement name = driver.findElement(By.id("name"));
//        name.click();
//        name.sendKeys("Meaghan Lewis");
//
//        Thread.sleep(2000);
//        WebElement button = driver.findElement(By.id("button"));
//        button.click();
//        driver.quit();
//    }
//}

//// using JavascriptExecutor
public class KeyboardAndMouseInput {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:/TMA Training/Selenium Essential Training/Environment/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/keypress");

        // find element
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Object name = js.executeScript("return document.getElementById('name')");

        // click element
        js.executeScript("arguments[0].click();", name);

        // input text
        js.executeScript("arguments[0].value='abcdef';", name);
//        OR
//        js.executeScript("document.getElementById('name').value='abcdef';");

        // get the title of page
        String titleText = js.executeScript("return document.title;").toString();
        System.out.println("title is: " + titleText);

        // get domain page
        String domainText = js.executeScript("return document.domain;").toString();
        System.out.println("domain is: " + domainText);

        // get URL page
        String urlText = js.executeScript("return document.URL;").toString();
        System.out.println("URL is: " + urlText);

        Thread.sleep(3000);
        WebElement button = driver.findElement(By.id("button"));
        button.click();
        driver.quit();
    }
}

//====================================================================

//// 02_03
//public class Autocomplete {
//public class KeyboardAndMouseInput {
//    public static void main(String[] args) throws InterruptedException {
//
//        System.setProperty("webdriver.chrome.driver", "D:/TMA Training/Selenium Essential Training/Environment/chromedriver.exe");
//
//        WebDriver driver = new ChromeDriver();
//
//        driver.get("https://formy-project.herokuapp.com/autocomplete");
//        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
//        autocomplete.sendKeys( "Nhà thuốc Dr. Tâm ,603 Quang Trung");

//        Thread.sleep(1000);
//        WebElement autocompleteResult = driver.findElement(By.className("pac-item"));
//        autocompleteResult.click();
//        driver.quit();
//    }
//}

//// 02_04
////public class ScrollToElement {
//public class KeyboardAndMouseInput {
//    public static void main(String[] args) throws InterruptedException {
//
//        System.setProperty("webdriver.chrome.driver", "D:/TMA Training/Selenium Essential Training/Environment/chromedriver.exe");
//
//        WebDriver driver = new ChromeDriver();
//
//        driver.get("https://formy-project.herokuapp.com/scroll");
//
//        WebElement name = driver.findElement(By.id("name"));
////        Actions actions = new Actions(driver);
////        actions.moveToElement(name);
//        name.sendKeys("Meaghan Lewis");
////        ====================
////        JavascriptExecutor js = (JavascriptExecutor) driver;
////        js.executeScript("document.getElementById('name').value='123456';");
//
//        Thread.sleep(2000);
//        WebElement date = driver.findElement(By.id("date"));
//        date.sendKeys(("01/01/2021"));
//
//        driver.quit();
//    }
//}

//// 02_05
////public class SwitchToActiveWindow {
//public class KeyboardAndMouseInput {
//    public static void main(String[] args) throws InterruptedException {
//
//        System.setProperty("webdriver.chrome.driver", "D:/TMA Training/Selenium Essential Training/Environment/chromedriver.exe");
//
//        WebDriver driver = new ChromeDriver();
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//
//        driver.get("https://formy-project.herokuapp.com/switch-window");
//
//        String urlText1 = js.executeScript("return document.URL;").toString();
//        System.out.println("1. URL is: " + urlText1);
//
//        WebElement newTabButton = driver.findElement(By.id("new-tab-button"));
//        newTabButton.click();
//        String urlText2 = js.executeScript("return document.URL;").toString();
//        System.out.println("2. URL is: " + urlText2);
//
//        String originalHandle = driver.getWindowHandle();
//
//        for(String handle1: driver.getWindowHandles()) {
//            driver.switchTo().window(handle1);
//
//            String urlText3 = js.executeScript("return document.URL;").toString();
//            System.out.println("3. URL is: " + urlText3);
//        }
//
//        Thread.sleep(2000);
//        driver.switchTo().window(originalHandle);
//        String urlText4 = js.executeScript("return document.URL;").toString();
//        System.out.println("4. URL is: " + urlText4);
//
//        driver.quit();
//    }
//}

//// 02_06
////public class SwitchToAlert {
//public class KeyboardAndMouseInput {
//    public static void main(String[] args) throws InterruptedException {
//
//        System.setProperty("webdriver.chrome.driver", "D:/TMA Training/Selenium Essential Training/Environment/chromedriver.exe");
//
//        WebDriver driver = new ChromeDriver();
//
//        driver.get("https://formy-project.herokuapp.com/switch-window");
//
//        WebElement alertButton = driver.findElement(By.id("alert-button"));
//        alertButton.click();
//
//        Alert alert = driver.switchTo().alert();
//        Thread.sleep(2000);
//        alert.accept();
//
////        driver.quit();
//    }
//}

//// 02_07
////public class ExecuteJavascript {
//public class KeyboardAndMouseInput {
//    public static void main(String[] args) throws InterruptedException {
//
//        System.setProperty("webdriver.chrome.driver", "D:/TMA Training/Selenium Essential Training/Environment/chromedriver.exe");
//
//        WebDriver driver = new ChromeDriver();
//
//        driver.get("https://formy-project.herokuapp.com/modal");
//
//        WebElement modalButton = driver.findElement(By.id("modal-button"));
//        modalButton.click();
//        Thread.sleep(2000);
//        WebElement closeButton = driver.findElement(By.id("close-button"));
//        JavascriptExecutor js = (JavascriptExecutor)driver;
//
//        js.executeScript("arguments[0].click();", closeButton);
//
////        driver.quit();
//    }
//}

//// 02_08
////public class DragAndDrop {
//public class KeyboardAndMouseInput {
//    public static void main(String[] args) {
//
//        System.setProperty("webdriver.chrome.driver", "D:/TMA Training/Selenium Essential Training/Environment/chromedriver.exe");
//
//        WebDriver driver = new ChromeDriver();
//
//        driver.get("https://formy-project.herokuapp.com/dragdrop");
//
//        WebElement image = driver.findElement(By.id("image"));
//
//        WebElement box = driver.findElement(By.id("box"));
//
//        Actions actions = new Actions(driver);
//        actions.dragAndDrop(image,box).build().perform();
//
//        driver.quit();
//    }
//}