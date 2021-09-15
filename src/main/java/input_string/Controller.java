package input_string;

import java.util.Scanner;

public class Controller{

    public static final String HELLO = "Hello";
    public static final String WORLD = "world";
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);
        this.model.setValue(this.inputFirstValueWithScanner(sc));
        this.model.addStringOurValue(this.inputSecondValueWithScanner(sc));
        this.view.printMessageAndInt(view.OUR_STRING, this.model.getValue());
    }

    public String inputFirstValueWithScanner(Scanner sc) {
        this.view.printMessage(view.INPUT_STRING_DATA);
        while(!sc.nextLine().equals(HELLO)) {
            this.view.printMessage(view.WRONG_INPUT_STRING_DATA + HELLO);
        }
        return HELLO;
    }

    public String inputSecondValueWithScanner(Scanner sc) {
        this.view.printMessage(view.INPUT_STRING_DATA);
        while(!sc.nextLine().equals(WORLD)) {
            this.view.printMessage(view.WRONG_INPUT_STRING_DATA + WORLD);
        }
        return WORLD;
    }
}
