package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
public class Test_html {
    @Test
    public void test_html() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://localhost:63342/HerokuApp/src/test/resources/feature7_homework.html?_ijt=ajtsjj1cfhj7069e70ervs2ehr");
        Select select = new Select(driver.findElement(By.xpath("//[@id='users']")));
        select.selectByVisibleText("User 3");
        String text = select.getFirstSelectedOption().getText();
        Assert.assertEquals(text, "User 3");
    }
}


