package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
@Test
public class AddRemoveElements {
    public void addRemoteElements() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
        WebElement addButton = driver.findElement(By.xpath("//*[@id=\"content\"]/div/button"));
        addButton.click();
        addButton.click();
        driver.findElement(By.xpath("//*[@id=\"elements\"]/button[2]")).click();
        boolean isDeleteButtonIsDisplayed = driver.findElement(By.xpath("//*[@id=\"elements\"]/button")).isDisplayed();
        Assert.assertTrue(isDeleteButtonIsDisplayed);
    }
}
