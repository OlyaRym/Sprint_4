package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class QuestionsAboutImportantNumberEight {

    private final WebDriver driver;
    private static final String PAGE_URL_WEBSITE = "https://qa-scooter.praktikum-services.ru";
    private By coocky = By.id("rcc-confirm-button");
    private By mkad = By.id("accordion__heading-7");
    private By answerMkad = By.xpath(".//div[@id='accordion__panel-7']/p");


    // вебдрайвер в вопросах о важном
    public QuestionsAboutImportantNumberEight (WebDriver driver){
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
    public void findMkad(){
        driver.findElement(mkad);
    }
    //метод кликнуть по вопросу
    public void clicMkad(){
        driver.findElement(mkad).click();
    }
    //метод нужного сообщения
    public String isAnswerMkad(){
        return driver.findElement(answerMkad).getText();
    }
}
