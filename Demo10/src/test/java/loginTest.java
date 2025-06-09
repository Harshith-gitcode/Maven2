import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class loginTest {
    public static void main(String[] args)throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("sauce");
        Thread.sleep(2000);
        driver.findElement(By.id("password")).sendKeys("pass");
        Thread.sleep(2000);
        driver.findElement(By.id("login-button")).click();
        driver.quit();
    }
}
