package juaracoding.abdulazisfikriujiantiga.pageobject;

import juaracoding.abdulazisfikriujiantiga.pageobject.drivers.DriverSingleton;
import juaracoding.abdulazisfikriujiantiga.pageobject.pages.ShopDemoqa;
import juaracoding.abdulazisfikriujiantiga.pageobject.utils.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainApp {
    public static void main(String[] args) {
        int detik = 1;

        DriverSingleton.getInstance(Constants.CHROME);
        WebDriver driver = DriverSingleton.getDriver();
        driver.get(Constants.URL);
        delay(detik);
        driver.findElement(By.xpath("//a[.='Dismiss']")).click();
        System.out.println("Dismiss clicked");
        delay(detik);
        driver.findElement(By.xpath("//a[.='My Account']")).click();
        System.out.println("MyAccount page clicked");
        delay(detik);


        ShopDemoqa shopDemoqa = new ShopDemoqa();
        shopDemoqa.registerForm();
        delay(detik);
        shopDemoqa.loginForm();
        delay(detik);
        shopDemoqa.addToCart();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }

    static void delay(int detik){
        //delay
        try {
            Thread.sleep(1000 * detik);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
