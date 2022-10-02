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
    //локатор на куки
    private By coocky = By.id("rcc-confirm-button");
    // вебдрайвер в вопросах о важном
    public QuestionsAboutImportant(WebDriver driver){
        this.driver = driver;
    }

    //локатор кликнуть по первому вопросу "Сколько это стоит? И как оплатить?"
    private By costPayment = By.id("accordion__heading-0");
    //локатор нужного сообщения к первому вопросу
    private By answerCostPayment = By.cssSelector("div.accordion__panel > p");

    //локатор кликнуть по второму вопросу "Хочу сразу несколько самокатов! Так можно?"
    private By severalScooters = By.id("accordion__heading-1");
    //локатор нужного сообщения ко второму вопросу
    private By answerSeveralScooters = By.xpath(".//div[@id='accordion__panel-1']/p");

    //локатор кликнуть по третьему вопросу "Как рассчитывается время аренды?"
    private By rentalTime = By.id("accordion__heading-2");
    //локатор нужного сообщения к третьему вопросу
    private By answerRentalTime = By.xpath(".//div[@id='accordion__panel-2']/p");

    //локатор кликнуть по четвертому  вопросу "Можно ли заказать самокат прямо на сегодня?"
    private By orderToday = By.id("accordion__heading-3");
    //локатор нужного сообщения к четвертому вопросу
    private By answerOrderToday = By.xpath(".//div[@id='accordion__panel-3']/p");

    //локатор кликнуть по пятому вопросу "Можно ли продлить заказ или вернуть самокат раньше?"
    private By extendOrRefund = By.id("accordion__heading-4");
    //локатор нужного сообщения к пятому вопросу
    private By answerExtendOrRefund = By.xpath(".//div[@id='accordion__panel-4']/p");

    //локатор кликнуть по шестому вопросу "Вы привозите зарядку вместе с самокатом?"
    private By charging = By.id("accordion__heading-5");
    //локатор нужного сообщения к шестому вопросу
    private By answerCharging = By.xpath(".//div[@id='accordion__panel-5']/p");

    //локатор кликнуть по седьмому вопросу "Можно ли отменить заказ?"
    private By cancelTheOrder = By.id("accordion__heading-6");
    //локатор нужного сообщения кседьмому вопросу
    private By answerCancelTheOrder = By.xpath(".//div[@id='accordion__panel-6']/p");

    //локатор кликнуть по восьмому вопросу "Я жизу за МКАДом, привезёте?"
    private By mkad = By.id("accordion__heading-7");
    //локатор нужного сообщения к восьмому вопросу
    private By answerMkad = By.xpath(".//div[@id='accordion__panel-7']/p");

    //метод открыть сайт
    public void openWebsite(){
        driver.get(PAGE_URL_WEBSITE);
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

   //найти первый вопрос "Сколько это стоит? И как оплатить?"
    public void findCostPayment(){
        driver.findElement(costPayment);
    }
    //метод кликнуть по первому вопросу "Сколько это стоит? И как оплатить?"
    public void clicCostPayment(){
        driver.findElement(costPayment).click();
    }
    //метод нужного сообщения к первому вопросу
    public String isquestionPage(){
        return driver.findElement(answerCostPayment).getText();
    }

    //найти второй вопрос "Хочу сразу несколько самокатов! Так можно?"
    public void findSeveralScooters(){
        driver.findElement(severalScooters);
    }
    //метод кликнуть по первому вопросу "Хочу сразу несколько самокатов! Так можно?"
    public void clicSeveralScooter(){
        driver.findElement(severalScooters).click();
    }
    //метод нужного сообщения ко второму вопросу
    public String isAnswerSeveralScooters(){
        return driver.findElement(answerSeveralScooters).getText();
    }

    //найти третий вопрос "Как рассчитывается время аренды?"
    public void findRentalTime(){
        driver.findElement(rentalTime);
    }
    //метод кликнуть по третьему вопросу "Как рассчитывается время аренды?"
    public void clicRentalTime(){
        driver.findElement(rentalTime).click();
    }
    //метод нужного сообщения к третьему вопросу
    public String isAnswerRentalTime(){
        return driver.findElement(answerRentalTime).getText();
    }

    //найти четвертый вопрос "Можно ли заказать самокат прямо на сегодня?"
    public void findOrderToday(){
        driver.findElement(orderToday);
    }
    //метод кликнуть по четвертому вопросу "Можно ли заказать самокат прямо на сегодня?"
    public void clicOrderToday(){
        driver.findElement(orderToday).click();
    }
    //метод нужного сообщения к четвертому вопросу
    public String isAnswerOrderToday(){
        return driver.findElement(answerOrderToday).getText();
    }

    //найтипятый вопрос "Можно ли продлить заказ или вернуть самокат раньше?"
    public void findExtendOrRefund(){
        driver.findElement(extendOrRefund);
    }
    //метод кликнуть по пятому вопросу "Можно ли продлить заказ или вернуть самокат раньше?"
    public void clicExtendOrRefund(){
        driver.findElement(extendOrRefund).click();
    }
    //метод нужного сообщения к пятому вопросу
    public String isAnswerExtendOrRefund(){
        return driver.findElement(answerExtendOrRefund).getText();
    }

    //найти шестой вопрос "Вы привозите зарядку вместе с самокатом?"
    public void findCharging(){
        driver.findElement(charging);
    }
    //метод кликнуть по шестому вопросу "Вы привозите зарядку вместе с самокатом?"
    public void clicCharging(){
        driver.findElement(charging).click();
    }
    //метод нужного сообщения к шестому вопросу
    public String isAnswerCharging(){
        return driver.findElement(answerCharging).getText();
    }

    //найти седьмой вопрос "Можно ли отменить заказ?"
    public void findCancelTheOrder(){
        driver.findElement(cancelTheOrder);
    }
    //метод кликнуть по седьмому вопросу "Можно ли отменить заказ?"
    public void clicCancelTheOrder(){
        driver.findElement(cancelTheOrder).click();
    }
    //метод нужного сообщения к седьмому вопросу
    public String isAnswerCancelTheOrder(){
        return driver.findElement(answerCancelTheOrder).getText();
    }

    //найти восьмой вопрос "Я жизу за МКАДом, привезёте?"
    public void findMkad(){
        driver.findElement(mkad);
    }
    //метод кликнуть по шестому вопросу "Я жизу за МКАДом, привезёте?"
    public void clicMkad(){
        driver.findElement(mkad).click();
    }
    //метод нужного сообщения к восьмому вопросу
    public String isAnswerMkad(){
        return driver.findElement(answerMkad).getText();
    }

}
