package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class QuestionsAboutImportantNumberFive {

    private final WebDriver driver;
    private static final String PAGE_URL_WEBSITE = "https://qa-scooter.praktikum-services.ru";
    private By coocky = By.id("rcc-confirm-button");
    private By extendOrRefund = By.id("accordion__heading-4");
    private By answerExtendOrRefund = By.xpath(".//div[@id='accordion__panel-4']/p");


    // вебдрайвер в вопросах о важном
    public QuestionsAboutImportantNumberFive (WebDriver driver){
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
    public void findExtendOrRefund(){
        driver.findElement(extendOrRefund);
    }
    //метод кликнуть по вопросу
    public void clicExtendOrRefund(){
        driver.findElement(extendOrRefund).click();
    }
    //метод нужного сообщения
    public String isAnswerExtendOrRefund(){
        return driver.findElement(answerExtendOrRefund).getText();
    }
}
