import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class FormPage {

    public static void submitForm(WebDriver driver) throws InterruptedException {
        driver.findElement(By.id("first-name")).sendKeys("Oanh");
        Thread.sleep(1000);
        driver.findElement(By.id("last-name")).sendKeys("Ho");
        Thread.sleep(1000);
        driver.findElement(By.id("job-title")).sendKeys("QA Engineer");
        Thread.sleep(1000);
        driver.findElement(By.id("radio-button-2")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("checkbox-2")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("option[value='1']")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("datepicker")).sendKeys("05/28/2019");
        By.id("datepicker").findElement(driver).sendKeys(Keys.RETURN);
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
    }
}
