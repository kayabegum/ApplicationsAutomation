package common;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

/**
 * Created by kayabegum on 8/27/2016.
 */
public class Base {
    public WebDriver driver = null;

    @BeforeMethod
    @Parameters({"url"})
    public void setUp(String url) {
//        System.setProperty("webdriver.gecko.driver","C:\\Users\\kayabegum\\Downloads\\Drivers\\chromedriver.exe");
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\kayabegum\\Downloads\\Drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.navigate().to(url);
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void cleanUp(){
        driver.quit();
    }
    public  void clickByCss(String Locator){
        driver.findElement(By.cssSelector(Locator)).click();
    }
    public void typeByCss(String Locator,String Value){
        driver.findElement(By.cssSelector(Locator)).sendKeys(Value, Keys.ENTER);
    }
    public void SleepFor(int sec)throws InterruptedException{
        Thread.sleep(sec*3000);

    }
    public void typeByXpath(String locator,String values){
        driver.findElement(By.xpath(locator)).sendKeys(values,Keys.ENTER);
    }
    public void clickByXpath(String locator){
        driver.findElement(By.xpath(locator)).click();
    }
    public void clickByClass(String locator,String Values){
        driver.findElement(By.className(locator)).sendKeys(Values);
    }
    public void typeByid(String locator,String values){
        driver.findElement(By.id(locator)).sendKeys(values);
    }
//    public void clickById(String id){
//        driver.
//    }

    public void byLinks(String locator){
        driver.findElement(By.linkText(locator)).click();
    }
}