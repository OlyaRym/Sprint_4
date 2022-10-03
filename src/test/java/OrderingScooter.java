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

public class OrderingScooter {
    private WebDriver driver;
    @Before
    public void startUp() {
        WebDriverManager.chromedriver().setup();
        WebDriverManager.firefoxdriver().setup();
    }
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
   @After
   public void cleanUp(){
   driver.quit();
    }
}
