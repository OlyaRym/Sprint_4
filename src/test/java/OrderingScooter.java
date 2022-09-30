import PageObject.*;
import org.hamcrest.MatcherAssert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertEquals;

public class OrderingScooter {
    private WebDriver driver;
    @Before
    public void startUp() {
        WebDriverManager.chromedriver().setup();
    }
    @Before
    public void startUpMoz(){WebDriverManager.firefoxdriver().setup();}

    //Тесты на проверку Заказ самоката
    //Тесты в гугл 2 набора данных, кнопка заказать вверху
    @Test
    public void openWebsite() {
        driver = new ChromeDriver();

        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clicCoocky();
        mainPage.clickOrderTop();
        mainPage.downloadForWhomScooter();

        WhoIsTheScooterFor whoIsTheScooterFor = new WhoIsTheScooterFor(driver);
        whoIsTheScooterFor.login("Ольга", "Рымонова", "Московский проспект 250", "рижская", "+79115203265");
        whoIsTheScooterFor.clickNextButton();

        AboutRent aboutRent = new AboutRent(driver);
        aboutRent.whenToBringAScooter();
        aboutRent.clickCalendar();
        aboutRent.rentalPeriod();
        aboutRent.clickChoosingTheRentalTime();
        aboutRent.clickScooterColor();
        aboutRent.clickOrder();
        aboutRent.clickPlaceAnOrder();
        MatcherAssert.assertThat(aboutRent.isPopUpWindow(), containsString("Заказ оформлен"));
    }
    @Test
    public void openWebsiteSecondSet() {
        driver = new ChromeDriver();

        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clicCoocky();
        mainPage.clickOrderTop();
        mainPage.downloadForWhomScooter();

        WhoIsTheScooterFor whoIsTheScooterFor = new WhoIsTheScooterFor(driver);
        whoIsTheScooterFor.login("Анна", "Нагул", "Колпинское шоссе 25", "Черкизовская", "+79115694123");
        whoIsTheScooterFor.clickNextButton();

        AboutRent aboutRent = new AboutRent(driver);
        aboutRent.whenToBringAScooter();
        aboutRent.clickCalendar();
        aboutRent.rentalPeriod();
        aboutRent.clickChoosingTheRentalTime();
        aboutRent.clickScooterColor();
        aboutRent.clickOrder();
        aboutRent.clickPlaceAnOrder();
        MatcherAssert.assertThat(aboutRent.isPopUpWindow(), containsString("Заказ оформлен"));
    }
    //тесты в Мозила 2 набора данных, кнопка заказать вверху
     @Test
     public void openWebsiteMoz(){
         driver = new FirefoxDriver();

         MainPage mainPage = new MainPage(driver);
         mainPage.open();
         mainPage.clicCoocky();
         mainPage.clickOrderTop();
         mainPage.downloadForWhomScooter();

         WhoIsTheScooterFor whoIsTheScooterFor = new WhoIsTheScooterFor(driver);
         whoIsTheScooterFor.login("Анна", "Нагул", "Колпинское шоссе 25", "Черкизовская", "+79115694123");
         whoIsTheScooterFor.clickNextButton();

         AboutRent aboutRent = new AboutRent(driver);
         aboutRent.whenToBringAScooter();
         aboutRent.clickCalendar();
         aboutRent.rentalPeriod();
         aboutRent.clickChoosingTheRentalTime();
         aboutRent.clickScooterColor();
         aboutRent.clickOrder();
         aboutRent.clickPlaceAnOrder();
         MatcherAssert.assertThat(aboutRent.isPopUpWindow(), containsString("Заказ оформлен"));
     }
    @Test
    public void openWebsiteMozSecondSet(){
        driver = new FirefoxDriver();

        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clicCoocky();
        mainPage.clickOrderTop();
        mainPage.downloadForWhomScooter();

        WhoIsTheScooterFor whoIsTheScooterFor = new WhoIsTheScooterFor(driver);
        whoIsTheScooterFor.login("Ольга", "Рымонова", "Московский проспект 250", "рижская", "+79115203265");
        whoIsTheScooterFor.clickNextButton();

        AboutRent aboutRent = new AboutRent(driver);
        aboutRent.whenToBringAScooter();
        aboutRent.clickCalendar();
        aboutRent.rentalPeriod();
        aboutRent.clickChoosingTheRentalTime();
        aboutRent.clickScooterColor();
        aboutRent.clickOrder();
        aboutRent.clickPlaceAnOrder();
        MatcherAssert.assertThat(aboutRent.isPopUpWindow(), containsString("Заказ оформлен"));
    }
    //Тесты в гугл 2 набора данных, кнопка заказать внизу
    @Test
    public void openWebsiteClickOrderBottom(){
        driver = new ChromeDriver();
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clicCoocky();
        mainPage.findOrderBottom();
        mainPage.scroll();
        mainPage.clickOrderBottom();

        WhoIsTheScooterFor whoIsTheScooterFor = new WhoIsTheScooterFor(driver);
        whoIsTheScooterFor.login("Ольга", "Рымонова", "Московский проспект 250", "рижская", "+79115203265");
        whoIsTheScooterFor.clickNextButton();

        AboutRent aboutRent = new AboutRent(driver);
        aboutRent.whenToBringAScooter();
        aboutRent.clickCalendar();
        aboutRent.rentalPeriod();
        aboutRent.clickChoosingTheRentalTime();
        aboutRent.clickScooterColor();
        aboutRent.clickOrder();
        aboutRent.clickPlaceAnOrder();
        MatcherAssert.assertThat(aboutRent.isPopUpWindow(), containsString("Заказ оформлен"));
    }
    @Test
    public void openWebsiteClickOrderBottomSecondSet(){
        driver = new ChromeDriver();
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clicCoocky();
        mainPage.findOrderBottom();
        mainPage.scroll();
        mainPage.clickOrderBottom();

        WhoIsTheScooterFor whoIsTheScooterFor = new WhoIsTheScooterFor(driver);
        whoIsTheScooterFor.login("Анна", "Нагул", "Колпинское шоссе 25", "Черкизовская", "+79115694123");
        whoIsTheScooterFor.clickNextButton();

        AboutRent aboutRent = new AboutRent(driver);
        aboutRent.whenToBringAScooter();
        aboutRent.clickCalendar();
        aboutRent.rentalPeriod();
        aboutRent.clickChoosingTheRentalTime();
        aboutRent.clickScooterColor();
        aboutRent.clickOrder();
        aboutRent.clickPlaceAnOrder();
        MatcherAssert.assertThat(aboutRent.isPopUpWindow(), containsString("Заказ оформлен"));
    }
    //тесты в Мозила 2 набора данных, кнопка заказать вверху
    @Test
    public void openWebsiteMozClickOrderBottom(){
        driver = new FirefoxDriver();

        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clicCoocky();
        mainPage.clickOrderTop();
        mainPage.downloadForWhomScooter();

        WhoIsTheScooterFor whoIsTheScooterFor = new WhoIsTheScooterFor(driver);
        whoIsTheScooterFor.login("Анна", "Нагул", "Колпинское шоссе 25", "Черкизовская", "+79115694123");
        whoIsTheScooterFor.clickNextButton();

        AboutRent aboutRent = new AboutRent(driver);
        aboutRent.whenToBringAScooter();
        aboutRent.clickCalendar();
        aboutRent.rentalPeriod();
        aboutRent.clickChoosingTheRentalTime();
        aboutRent.clickScooterColor();
        aboutRent.clickOrder();
        aboutRent.clickPlaceAnOrder();
        MatcherAssert.assertThat(aboutRent.isPopUpWindow(), containsString("Заказ оформлен"));
    }
    @Test
    public void openWebsiteMozClickOrderBottomSecondSet(){
        driver = new FirefoxDriver();

        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clicCoocky();
        mainPage.clickOrderTop();
        mainPage.downloadForWhomScooter();

        WhoIsTheScooterFor whoIsTheScooterFor = new WhoIsTheScooterFor(driver);
        whoIsTheScooterFor.login("Ольга", "Рымонова", "Московский проспект 250", "рижская", "+79115203265");
        whoIsTheScooterFor.clickNextButton();

        AboutRent aboutRent = new AboutRent(driver);
        aboutRent.whenToBringAScooter();
        aboutRent.clickCalendar();
        aboutRent.rentalPeriod();
        aboutRent.clickChoosingTheRentalTime();
        aboutRent.clickScooterColor();
        aboutRent.clickOrder();
        aboutRent.clickPlaceAnOrder();
        MatcherAssert.assertThat(aboutRent.isPopUpWindow(), containsString("Заказ оформлен"));
    }

    //тесты для первого задания "Вопросы о важном" на все 8 вопросов
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

        QuestionsAboutImportantNumberTwo questionsAboutImportantNumberTwo = new QuestionsAboutImportantNumberTwo(driver);
        questionsAboutImportantNumberTwo.openWebsite();
        questionsAboutImportantNumberTwo.clicCoocky();
        questionsAboutImportantNumberTwo.findSeveralScooters();
        questionsAboutImportantNumberTwo.scroll();
        questionsAboutImportantNumberTwo.clicSeveralScooter();
        assertEquals("Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.", questionsAboutImportantNumberTwo.isAnswerSeveralScooters());

    }
    @Test
    public void importantQuestionsAndAnswersThree() {
        driver = new ChromeDriver();

        QuestionsAboutImportantNumberThree questionsAboutImportantNumberThree = new QuestionsAboutImportantNumberThree(driver);
        questionsAboutImportantNumberThree.openWebsite();
        questionsAboutImportantNumberThree.clicCoocky();
        questionsAboutImportantNumberThree.findRentalTime();
        questionsAboutImportantNumberThree.scroll();
        questionsAboutImportantNumberThree.clicRentalTime();

        assertEquals("Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.", questionsAboutImportantNumberThree.isAnswerRentalTime());
    }
    @Test
    public void importantQuestionsAndAnswersFour() {
        driver = new ChromeDriver();

        QuestionsAboutImportantNumberFour questionsAboutImportantNumberFour = new QuestionsAboutImportantNumberFour(driver);
        questionsAboutImportantNumberFour.openWebsite();
        questionsAboutImportantNumberFour.clicCoocky();
        questionsAboutImportantNumberFour.findOrderToday();
        questionsAboutImportantNumberFour.scroll();
        questionsAboutImportantNumberFour.clicOrderToday();

        assertEquals("Только начиная с завтрашнего дня. Но скоро станем расторопнее.", questionsAboutImportantNumberFour.isAnswerOrderToday());
    }
    @Test
    public void importantQuestionsAndAnswersFive() {
        driver = new ChromeDriver();

        QuestionsAboutImportantNumberFive questionsAboutImportantNumberFive = new QuestionsAboutImportantNumberFive(driver);
        questionsAboutImportantNumberFive.openWebsite();
        questionsAboutImportantNumberFive.clicCoocky();
        questionsAboutImportantNumberFive.findExtendOrRefund();
        questionsAboutImportantNumberFive.scroll();
        questionsAboutImportantNumberFive.clicExtendOrRefund();

        assertEquals("Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.", questionsAboutImportantNumberFive.isAnswerExtendOrRefund());
    }
    @Test
    public void importantQuestionsAndAnswersSix() {
        driver = new ChromeDriver();

        QuestionsAboutImportantNumberSix questionsAboutImportantNumberSix = new QuestionsAboutImportantNumberSix(driver);
        questionsAboutImportantNumberSix.openWebsite();
        questionsAboutImportantNumberSix.clicCoocky();
        questionsAboutImportantNumberSix.findCharging();
        questionsAboutImportantNumberSix.scroll();
        questionsAboutImportantNumberSix.clicCharging();

        assertEquals("Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.", questionsAboutImportantNumberSix.isAnswerCharging());
    }
    @Test
    public void importantQuestionsAndAnswersSeven() {
        driver = new ChromeDriver();

        QuestionsAboutImportantNumberSeven questionsAboutImportantNumberSeven = new QuestionsAboutImportantNumberSeven(driver);
        questionsAboutImportantNumberSeven.openWebsite();
        questionsAboutImportantNumberSeven.clicCoocky();
        questionsAboutImportantNumberSeven.findCancelTheOrder();
        questionsAboutImportantNumberSeven.scroll();
        questionsAboutImportantNumberSeven.clicCancelTheOrder();

        assertEquals("Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.", questionsAboutImportantNumberSeven.isAnswerCancelTheOrder());
    }
    @Test
    public void importantQuestionsAndAnswersEight() {
        driver = new ChromeDriver();

        QuestionsAboutImportantNumberEight questionsAboutImportantNumberEight = new QuestionsAboutImportantNumberEight(driver);
        questionsAboutImportantNumberEight.openWebsite();
        questionsAboutImportantNumberEight.clicCoocky();
        questionsAboutImportantNumberEight.findMkad();
        questionsAboutImportantNumberEight.scroll();
        questionsAboutImportantNumberEight.clicMkad();

        assertEquals("Да, обязательно. Всем самокатов! И Москве, и Московской области.", questionsAboutImportantNumberEight.isAnswerMkad());
    }
   @After
   public void cleanUp(){
   driver.quit();
    }
}
