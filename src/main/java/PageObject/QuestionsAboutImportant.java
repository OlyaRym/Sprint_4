package PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class QuestionsAboutImportant {
    //вебдрайвер
    private final WebDriver driver;
    //открыли сайт
    private static final String PAGE_URL_WEBSITE = "https://qa-scooter.praktikum-services.ru";
    //локатор кликнуть по первому вопросу
    private By costPayment = By.id("accordion__heading-0");  //стоимость и оплата
    //локатор нужного сообщения
    private By answerCostPayment = By.cssSelector("div.accordion__panel > p");
    //локатор на куки
    private By coocky = By.id("rcc-confirm-button");
    // вебдрайвер в вопросах о важном
    public QuestionsAboutImportant(WebDriver driver){
        this.driver = driver;
    }
    //метод открыть сайт
    public void openWebsite(){
        driver.get(PAGE_URL_WEBSITE);
    }
    //найти
    public void findCostPayment(){
        driver.findElement(costPayment);
    }
    //метод кликнуть по первому вопросу
    public void clicCostPayment(){
        driver.findElement(costPayment).click();
    }
    //метод закрыть куки
    public void clicCoocky(){
        driver.findElement(coocky).click();
    }
    //метод нужного сообщения
    public String isquestionPage(){
        return driver.findElement(answerCostPayment).getText();
    }
    //метод, который сделает скролл
    public void scroll(){
        WebElement element = driver.findElement(By.id("root"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
    }
}
