package testSuite;

import activities.MainScreen;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import session.Session;

public class CalculadoraTest {

    MainScreen mainScreen = new MainScreen();

    @Test
    public void multTest(){
        mainScreen.eigthButton.click();
        mainScreen.multButton.click();
        mainScreen.fiveButton.click();
        mainScreen.equalButton.click();

        String expectedResult = "40";
        String actualResult = mainScreen.resultLabel.getText();

        Assertions.assertEquals(expectedResult,actualResult,"ERROR la multiplicación falló");

        mainScreen.clrButton.click();
    }
    @Test
    public void divTest(){
        mainScreen.oneButton.click();
        mainScreen.twoButton.click();
        mainScreen.divButton.click();
        mainScreen.sixButton.click();
        mainScreen.equalButton.click();

        String expectedResult = "2";
        String actualResult = mainScreen.resultLabel.getText();

        Assertions.assertEquals(expectedResult,actualResult,"ERROR la división falló");

        mainScreen.clrButton.click();
    }

    @AfterEach
    public void close(){
        Session.getInstance().closeApp();
    }

}
