package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class QuestionsAboutImportantNumberTwo {
    private final WebDriver driver;
    private static final String PAGE_URL_WEBSITE = "https://qa-scooter.praktikum-services.ru";
    private By severalScooters = By.id("accordion__heading-1");
    //private By answerSeveralScooters = By.cssSelector("div.accordion__panel > id='accordion__panel-1' > p");
    private By answerSeveralScooters = By.xpath(".//div[@id='accordion__panel-1']/p");
    private By coocky = By.id("rcc-confirm-button");


    // вебдрайвер в вопросах о важном
    public QuestionsAboutImportantNumberTwo (WebDriver driver){
        this.driver = driver;
    }
    //метод открыть сайт
    public void openWebsite(){
        driver.get(PAGE_URL_WEBSITE);
    }
    //найти
    public void findSeveralScooters(){
        driver.findElement(severalScooters);
    }
    //метод кликнуть по первому вопросу
    public void clicSeveralScooter(){
        driver.findElement(severalScooters).click();
    }
    //метод нужного сообщения
    public String isAnswerSeveralScooters(){
        return driver.findElement(answerSeveralScooters).getText();
    }
    //метод закрыть куки
    public void clicCoocky(){
        driver.findElement(coocky).click();
    }
    //метод, который сделает скролл
    public void scroll(){
        WebElement element = driver.findElement(By.id("root"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
    }
}
