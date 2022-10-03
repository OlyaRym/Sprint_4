package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class QuestionsAboutImportantNumberThree {

    private final WebDriver driver;
    private static final String PAGE_URL_WEBSITE = "https://qa-scooter.praktikum-services.ru";
    private By coocky = By.id("rcc-confirm-button");
    private By rentalTime = By.id("accordion__heading-2");
    private By answerRentalTime = By.xpath(".//div[@id='accordion__panel-2']/p");
    // вебдрайвер в вопросах о важном
    public QuestionsAboutImportantNumberThree (WebDriver driver){
        this.driver = driver;
    }
    //метод открыть сайт
    public void openWebsite(){
        driver.get(PAGE_URL_WEBSITE);
    }
    //метод закрыть куки
    public void clicCoocky(){
        driver.findElement(coocky).click();
    }
    //метод, который сделает скролл
    public void scroll() {
        WebElement element = driver.findElement(By.id("root"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }
    //найти
    public void findRentalTime(){
        driver.findElement(rentalTime);
    }
    //метод кликнуть по вопросу
    public void clicRentalTime(){
        driver.findElement(rentalTime).click();
    }
    //метод нужного сообщения
    public String isAnswerRentalTime(){
        return driver.findElement(answerRentalTime).getText();
    }

}
