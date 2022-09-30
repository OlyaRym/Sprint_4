package PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {
    private final WebDriver driver; //драйвер
    private static final String PAGE_URL = "https://qa-scooter.praktikum-services.ru"; // открыть сайт
    private By coocky = By.id("rcc-confirm-button"); // локатор куки
    private By orderTop = By.xpath(".//button[@class='Button_Button__ra12g']"); //кнопка заказа вверху
    private By orderBottom = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");//кнопкат заказать внизу
    private By pagForWhomIsScooter = By.xpath(".//div[@class='Order_Content__bmtHS']"); //локатор для ожиданияp
    public MainPage(WebDriver driver){
        this.driver = driver;
    } //метод драйвер
     public void open(){
        driver.get(PAGE_URL);
}  //метод для открытия сайта
    public void clickOrderTop() {
        driver.findElement(orderTop).click();
    } //метод для нажатия на  кнопку Заказать вверху
    public void downloadForWhomScooter(){   //метод ожидания загрузки страницы для кого самокат
       new WebDriverWait(driver,3)
                .until(ExpectedConditions.elementToBeClickable(pagForWhomIsScooter));
    }
    public void clicCoocky(){
        driver.findElement(coocky).click();
    }  //метод закрыть куки
    public void scroll(){  //скролл
        WebElement element = driver.findElement(By.id("root"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
    }
    //найти
    public void findOrderBottom(){
        driver.findElement(orderBottom);
    }
    //метод кликнуть по кнопке заказать внизу
    public void clickOrderBottom(){
        driver.findElement(orderBottom).click();
    }
}
