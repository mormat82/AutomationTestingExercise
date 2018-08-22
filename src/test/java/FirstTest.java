import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FirstTest {
    WebDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","/home/mati/IdeaProjects/firstTest/src/test/java/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");

    }

    @Test
    public void userRegistrationWithValidData() throws InterruptedException {
        WebElement signInButton = driver.findElement(By.cssSelector("[title=\"Log in to your customer account\"]"));
        signInButton.click();
        Thread.sleep(5000);

//        WebElement emailInput = driver.findElement(By.id("email_create"));
//        emailInput.sendKeys("test73g@ter.com");
//        powyższe 2 linijki można napisać w jednej:
        driver.findElement(By.id("email_create")).sendKeys("test73g@ter.com");

        WebElement createAccountButton = driver.findElement(By.id("SubmitCreate"));
        createAccountButton.click();
        Thread.sleep(5000);
    }


    @After
    public void tearDown() {
        driver.quit();
    }
}