package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AboutRent {
    private final WebDriver driver;
    public AboutRent(WebDriver driver) {
        this.driver = driver;
    }
    //локатор для клика по полю когда привезти и ожидание,чтобы загрузилось
    public By whenToBringAScooter = By.xpath(".//input[@placeholder='* Когда привезти самокат']");
    //локатор для календыря и даты
    public By calendar = By.xpath(".//div[@class='react-datepicker__day react-datepicker__day--013']");
    //локатор для срока аренды
    public By rentalPeriod = By.xpath(".//div[@class='Dropdown-placeholder']");
    //локатор для выбора времени аренды
    public By choosingTheRentalTime = By.xpath(".//div[@class='Dropdown-option']");
    public By scooterColor = By.id("black");
    public By order = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    public By placeAnOrder = By.xpath("/html/body/div/div/div[2]/div[5]/div[2]/button[2]");
    public By popUpWindow = By.xpath(".//div[@class='Order_ModalHeader__3FDaJ']");
    public void whenToBringAScooter() {
        driver.findElement(whenToBringAScooter).click();
    }
    public void clickCalendar() {
        driver.findElement(calendar).click();
    }
    public void rentalPeriod() {
        driver.findElement(rentalPeriod).click();
    }
    public void clickChoosingTheRentalTime() {
        driver.findElement(choosingTheRentalTime).click();
    }
    public void clickScooterColor() {
        driver.findElement(scooterColor).click();
    }
    public void clickOrder() {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.elementToBeClickable(order)).click();
    }
    public void clickPlaceAnOrder() {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.elementToBeClickable(placeAnOrder)).click();
    }
    public String isPopUpWindow(){
        return driver.findElement(popUpWindow).getText();
    }
}
