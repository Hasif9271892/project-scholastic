package basics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class ProjectZahir extends DriverWrapper {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/huma/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();
        String url = "https://clubs3qa1.scholastic.com/home";
        String account = "Create an Account";
        String radioXpath = "//ul[1]/li[1]/label[1]";
        String next = "//div/button[contains(text(),'Next')]";
        //String nextLink = "//p/a[@id='linkChooseAcount']";
        //String nextPLink = "//a[@id='linkChooseAcount'][1]";
        String selectTitle = "//div[contains(text(),'Select Title')]";
        //

        driver.navigate().to(url);
        driver.findElement(By.linkText(account)).click();
        driver.findElement(By.xpath(radioXpath)).click();
        driver.findElement(By.partialLinkText(next)).click();

        //driver.wait(3);
       // driver.quit();
//        driver.findElement(By.xpath(selectTitle)).click();
    }
}
