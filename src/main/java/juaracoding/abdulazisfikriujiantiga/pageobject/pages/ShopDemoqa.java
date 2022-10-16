package juaracoding.abdulazisfikriujiantiga.pageobject.pages;

import juaracoding.abdulazisfikriujiantiga.pageobject.drivers.DriverSingleton;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;
import org.openqa.selenium.support.ui.Select;

import javax.xml.xpath.XPath;

public class ShopDemoqa{
    private WebDriver driver;
    int detik = 1;


    public ShopDemoqa() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    //register
    @FindBy (id = "reg_username")
    WebElement regUserName;

    @FindBy (id = "reg_email")
    WebElement regEmail;

    @FindBy (id = "reg_password")
    WebElement regPassword;

    @FindBy (xpath = "//*[@id=\"customer_login\"]/div[2]/form/p[4]/button")
    WebElement register;

    //login input
    @FindBy (id = "user_login")
    WebElement inpUserName;

    @FindBy (id = "user_pass")
    WebElement inpPassword;

    @FindBy (id = "wp-submit")
    WebElement login;

    //addToCart
    @FindBy (xpath = "//a[.='Orders']")
    WebElement btnOrders;

    @FindBy (xpath = "//a[.='Browse products']")
    WebElement btnBrowseProduct;

    @FindBy (xpath = "//*[@id=\"noo-site\"]/div[2]/div[1]/div/form/select")
    WebElement btnSortProduct;

    @FindBy (xpath = "//*[@id=\"noo-site\"]/div[2]/div[2]/div/div/div[3]/div/h3/a")
    WebElement chooseProduct;


    @FindBy (id = "pa_color")
    WebElement pickColor;


    @FindBy (id = "pa_size")
    WebElement pickSize;

    @FindBy (xpath = "//*[@id=\"product-1485\"]/div[1]/div[2]/form/div/div[2]/button")
    WebElement btnAddToCart;

    @FindBy (xpath = "//*[@id=\"nav-menu-item-cart\"]/a/span/i")
    WebElement btnViewCart;

    @FindBy (xpath = "//*[@id=\"post-6\"]/div/div/div[2]/div[2]/div/a")
    WebElement btnCheckout;

    public void registerForm(){
        regUserName.sendKeys("abdulazis");
        System.out.println("register username");
        delay(detik);
        regEmail.sendKeys("abdulazis@gmail.com");
        System.out.println("register email");
        delay(detik);
        regPassword.sendKeys("SELENIUMabdulazis123");
        System.out.println("register password");
        delay(detik);
        register.click();
        System.out.println("register button clicked");
        delay(detik);
    }
    public void loginForm(){
        inpUserName.sendKeys("abdulazis");
        System.out.println("input username");
        delay(detik);
        inpPassword.sendKeys("SELENIUMabdulazis123");
        System.out.println("input password");
        delay(detik);
        login.click();
        System.out.println("login button clicked");
        delay(detik);
    }


    public void addToCart(){
        btnOrders.click();
        System.out.println("orders button clicked");
        delay(detik);
        btnBrowseProduct.click();
        System.out.println("browse product button clicked");
        delay(detik);
        btnSortProduct.click();
        System.out.println("sort product button clicked");
        delay(detik);
        SortProductBy();
        System.out.println("sort product by popularity entered");
        delay(detik);
        chooseProduct.click();
        System.out.println("product choosen clicked");
        delay(detik);
        SelectColor();
        System.out.println("product colour choosed");
        delay(detik);
        SelectSize();
        System.out.println("product size choosed");
        delay(detik);
        btnAddToCart.click();
        System.out.println("add to cart button clicked");
        delay(detik);
        btnViewCart.click();
        System.out.println("view cart button clicked");
        delay(detik);
        btnCheckout.click();
        System.out.println("checkout button clicked");
        delay(detik);
    }

    public void SortProductBy() {
        WebElement elementOrder = driver.findElement(By.xpath("//*[@id=\"noo-site\"]/div[2]/div[1]/div/form/select"));
        Select orderBy = new Select(elementOrder);
        orderBy.selectByValue("popularity");
    }

    public void SelectColor() {
        WebElement elementWarna = pickColor;
        Select pilihWarna = new Select(elementWarna);
        pilihWarna.selectByValue("black");
        delay(detik);
    }

    public void SelectSize() {
        WebElement elementSize = pickSize;
        Select pilihUkuran = new Select(elementSize);
        pilihUkuran.selectByValue("32");
        delay(detik);
    }

    public void delay(int detik){
        //delay
        try {
            Thread.sleep(1000 * detik);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}






