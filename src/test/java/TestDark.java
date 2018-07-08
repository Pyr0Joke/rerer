import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDark {
    @Test
    public void firstTest(){
        System.setProperty("webdriver.gecko.driver", "D:\\Gecko\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://dark-world.ru/main/");
        driver.findElement(By.id("Login")).sendKeys("shmel9311@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("458854qwe");
        driver.findElement(By.id("loginBtn")).click();
        WebElement dynamicElement = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.className("usermenu_icon")));
        Assert.assertNotEquals(driver.findElement(By.linkText("Лучшие альбомы")),0);
        driver.close();
    }

}
