import PageObject.QuestionsAboutImportant;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class dropDownListOfImportantQuestions {
    private WebDriver driver;
    @Before
    public void startUp() {
        WebDriverManager.chromedriver().setup();
    }

    @Test
    public void importantQuestionsAndAnswers() {
        driver = new ChromeDriver();

        QuestionsAboutImportant questionsAboutImportant = new QuestionsAboutImportant(driver);
        questionsAboutImportant.openWebsite();
        questionsAboutImportant.clicCoocky();
        questionsAboutImportant.findCostPayment();
        questionsAboutImportant.scroll();
        questionsAboutImportant.clicCostPayment();
        assertEquals("Сутки — 400 рублей. Оплата курьеру — наличными или картой.", questionsAboutImportant.isquestionPage());
    }
    @Test
    public void importantQuestionsAndAnswersTwo() {
        driver = new ChromeDriver();

        QuestionsAboutImportant questionsAboutImportant = new QuestionsAboutImportant(driver);
        questionsAboutImportant.openWebsite();
        questionsAboutImportant.clicCoocky();
        questionsAboutImportant.findSeveralScooters();
        questionsAboutImportant.scroll();
        questionsAboutImportant.clicSeveralScooter();
        assertEquals("Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.", questionsAboutImportant.isAnswerSeveralScooters());

    }
    @Test
    public void importantQuestionsAndAnswersThree() {
        driver = new ChromeDriver();

        QuestionsAboutImportant questionsAboutImportant = new QuestionsAboutImportant(driver);
        questionsAboutImportant.openWebsite();
        questionsAboutImportant.clicCoocky();
        questionsAboutImportant.findRentalTime();
        questionsAboutImportant.scroll();
        questionsAboutImportant.clicRentalTime();

        assertEquals("Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.", questionsAboutImportant.isAnswerRentalTime());
    }
    @Test
    public void importantQuestionsAndAnswersFour() {
        driver = new ChromeDriver();

        QuestionsAboutImportant questionsAboutImportant = new QuestionsAboutImportant(driver);
        questionsAboutImportant.openWebsite();
        questionsAboutImportant.clicCoocky();
        questionsAboutImportant.findOrderToday();
        questionsAboutImportant.scroll();
        questionsAboutImportant.clicOrderToday();

        assertEquals("Только начиная с завтрашнего дня. Но скоро станем расторопнее.", questionsAboutImportant.isAnswerOrderToday());
    }
    @Test
    public void importantQuestionsAndAnswersFive() {
        driver = new ChromeDriver();

        QuestionsAboutImportant questionsAboutImportant = new QuestionsAboutImportant(driver);
        questionsAboutImportant.openWebsite();
        questionsAboutImportant.clicCoocky();
        questionsAboutImportant.findExtendOrRefund();
        questionsAboutImportant.scroll();
        questionsAboutImportant.clicExtendOrRefund();

        assertEquals("Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.", questionsAboutImportant.isAnswerExtendOrRefund());
    }
    @Test
    public void importantQuestionsAndAnswersSix() {
        driver = new ChromeDriver();

        QuestionsAboutImportant questionsAboutImportant = new QuestionsAboutImportant(driver);
        questionsAboutImportant.openWebsite();
        questionsAboutImportant.clicCoocky();
        questionsAboutImportant.findCharging();
        questionsAboutImportant.scroll();
        questionsAboutImportant.clicCharging();

        assertEquals("Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.", questionsAboutImportant.isAnswerCharging());
    }
    @Test
    public void importantQuestionsAndAnswersSeven() {
        driver = new ChromeDriver();

        QuestionsAboutImportant questionsAboutImportant = new QuestionsAboutImportant(driver);
        questionsAboutImportant.openWebsite();
        questionsAboutImportant.clicCoocky();
        questionsAboutImportant.findCancelTheOrder();
        questionsAboutImportant.scroll();
        questionsAboutImportant.clicCancelTheOrder();

        assertEquals("Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.", questionsAboutImportant.isAnswerCancelTheOrder());
    }
    @Test
    public void importantQuestionsAndAnswersEight() {
        driver = new ChromeDriver();

        QuestionsAboutImportant questionsAboutImportant = new QuestionsAboutImportant(driver);
        questionsAboutImportant.openWebsite();
        questionsAboutImportant.clicCoocky();
        questionsAboutImportant.findMkad();
        questionsAboutImportant.scroll();
        questionsAboutImportant.clicMkad();

        assertEquals("Да, обязательно. Всем самокатов! И Москве, и Московской области.", questionsAboutImportant.isAnswerMkad());
    }
    @After
    public void cleanUp(){
        driver.quit();
    }
}
