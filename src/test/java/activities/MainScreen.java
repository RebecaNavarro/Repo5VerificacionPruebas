package activities;

import controls.Button;
import controls.Label;
import org.openqa.selenium.By;

public class MainScreen {
    public Button eigthButton = new Button(By.id("com.android.calculator2:id/digit_8"));
    public Button fiveButton = new Button(By.id("com.android.calculator2:id/digit_5"));
    public Button oneButton = new Button(By.id("com.android.calculator2:id/digit_1"));
    public Button twoButton = new Button(By.id("com.android.calculator2:id/digit_2"));
    public Button sixButton = new Button(By.xpath("//android.widget.Button[@resource-id=\"com.android.calculator2:id/digit_6\"]"));
    public Button multButton = new Button(By.id("com.android.calculator2:id/op_mul"));
    public Button divButton = new Button(By.id("com.android.calculator2:id/op_div"));
    public Button equalButton = new Button(By.id("com.android.calculator2:id/eq"));
    public Label resultLabel = new Label(By.id("com.android.calculator2:id/result"));
    public Button clrButton = new Button(By.id("com.android.calculator2:id/clr"));

}
