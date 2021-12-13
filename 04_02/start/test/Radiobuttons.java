import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import java.text.SimpleDateFormat;
import java.util.Date;

//// 04_02
//public class Radiobuttons {
//    public static void main(String[] args) {
//
//        System.setProperty("webdriver.chrome.driver", "D:/TMA Training/Selenium Essential Training/Environment/chromedriver.exe");
//
//        WebDriver driver = new ChromeDriver();
//
//        driver.get("https://formy-project.herokuapp.com/radiobutton");
//
//        WebElement radioButton1 = driver.findElement(By.id("radio-button-1"));
//        radioButton1.click();
//
////        WebElement radioButton2 = driver.findElement(By.cssSelector("input[value='option2']"));
//        WebElement radioButton2 = driver.findElement(By.cssSelector("input#radio-button-1"));         //Q1
////        WebElement radioButton2 = driver.findElement(By.cssSelector("input.form-check-input"));     //Q2
//        radioButton2.click();
//
////        WebElement radioButton3 = driver.findElement(By.xpath("/html/body/div/div[3]/input"));
//        WebElement radioButton3 = driver.findElement(By.xpath("//input[@value='option3']"));          //Q3
//        radioButton3.click();
//
//        //====================================
//        //checkbox
//        driver.get("https://formy-project.herokuapp.com/checkbox");
////
//        WebElement checkbox1 = driver.findElement(By.id("checkbox-1"));
//        checkbox1.click();
//
////        WebElement checkbox2 = driver.findElement(By.cssSelector("input[value='checkbox-2']"));
//        WebElement checkbox2 = driver.findElement(By.cssSelector("input#checkbox-2"));
////        WebElement checkbox2 = driver.findElement(By.cssSelector("input[aria-label='checkbox']"));     //Q4
//        checkbox2.click();
//
////        WebElement checkbox3 = driver.findElement(By.xpath("/html/body/div/div[3]/div/div/input"));
//        WebElement checkbox3 = driver.findElement(By.xpath("//input[@value='checkbox-3']"));
//        checkbox3.click();
//
////        driver.quit();
//    }
//}

//=====================================================================================

//// 04_03
////public class Datepicker {
//public class Radiobuttons {
//    public static void main(String[] args) {
//
//        System.setProperty("webdriver.chrome.driver", "D:/TMA Training/Selenium Essential Training/Environment/chromedriver.exe");
//
//        WebDriver driver = new ChromeDriver();
//
//        driver.get("https://formy-project.herokuapp.com/datepicker");
//
//        WebElement dateField = driver.findElement(By.id("datepicker"));
////        dateField.sendKeys("03/03/2020");
//        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
//        Date date = new Date();
//        System.out.println(formatter.format(date));
//        dateField.sendKeys(formatter.format(date));
//        dateField.sendKeys(Keys.RETURN);
//
////        driver.quit();
//    }
//}


//// 04_03_02
////public class Datepicker {
//public class Radiobuttons {
//    public static void main(String[] args) {
//
//        System.setProperty("webdriver.chrome.driver", "D:/TMA Training/Selenium Essential Training/Environment/chromedriver.exe");
//
//        WebDriver driver = new ChromeDriver();
//
//        driver.get("https://formy-project.herokuapp.com/datepicker");
//
//        WebElement dateField = driver.findElement(By.id("datepicker"));
////        dateField.sendKeys("03/03/2020");
//        SimpleDateFormat formatter = new SimpleDateFormat("/MM/yyyy");
//        SimpleDateFormat getdate = new SimpleDateFormat("dd");
//        Date date = new Date();
//        int yesterday = Integer.parseInt(getdate.format(date)) - 1;
//
//        dateField.sendKeys(yesterday + formatter.format(date));
//        dateField.sendKeys(Keys.RETURN);
//
////        driver.quit();
//    }
//}

//// 04_04
////public class Dropdown {
public class Radiobuttons {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:/TMA Training/Selenium Essential Training/Environment/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement dropDownMenu = driver.findElement(By.id("dropdownMenuButton"));
        dropDownMenu.click();

        WebElement autocompleteItem = driver.findElement(By.id("autocomplete"));
        autocompleteItem.click();

//        driver.quit();
    }
}

//// 04_05
////public class FileUpload {
//public class Radiobuttons {
//    public static void main(String[] args) {
//
//        System.setProperty("webdriver.chrome.driver", "D:/TMA Training/Selenium Essential Training/Environment/chromedriver.exe");
//
//        WebDriver driver = new ChromeDriver();
//
//        driver.get("https://formy-project.herokuapp.com/fileupload");
//
//        WebElement fileUploadField = driver.findElement(By.id("file-upload-field"));
//        fileUploadField.sendKeys("file-to-upload.png");
//
////        driver.quit();
//    }
//}


