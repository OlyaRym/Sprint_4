package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class QuestionsAboutImportantNumberSeven {

    private final WebDriver driver;
    private static final String PAGE_URL_WEBSITE = "https://qa-scooter.praktikum-services.ru";
    private By coocky = By.id("rcc-confirm-button");
    private By cancelTheOrder = By.id("accordion__heading-6");
    private By answerCancelTheOrder = By.xpath(".//div[@id='accordion__panel-6']/p");


    // вебдрайвер в вопросах о важном
    public QuestionsAboutImportantNumberSeven (WebDriver driver){
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
    public void findCancelTheOrder(){
        driver.findElement(cancelTheOrder);
    }
    //метод кликнуть по вопросу
    public void clicCancelTheOrder(){
        driver.findElement(cancelTheOrder).click();
    }
    //метод нужного сообщения
    public String isAnswerCancelTheOrder(){
        return driver.findElement(answerCancelTheOrder).getText();
    }
}
