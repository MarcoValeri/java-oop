import java.util.Scanner;

public class Menu {
    private String[] menuItem;
    private char[] menuCode;
    private int itemNumber;

    public Menu() {
        menuItem = new String[10];
        menuCode = new char[10];
        itemNumber = menuItem.length - 1;
    }

    /*
    * Create a method that allows to add an item to the end of this menu
    */
    public void addItem(MenuItem item) {
        if (itemNumber >= 0) {
            menuItem[itemNumber] = item.getText();
            menuCode[itemNumber] = item.getCode();
            itemNumber--;
        } else {
            System.out.println("Menu memory is full");
        }
        
    }

    public String getInput() {


        String output = "\nSelect from the following list:\n";

        for (int i = 0; i < menuItem.length; i++) {
            if (menuItem[i] != null) {
                output += menuCode[i] + ") " + menuItem[i] + "\n";
            }
        }

        boolean flag = true;

        while (flag) {

            System.out.println("\nSelect your menu\n");
            Scanner user_input = new Scanner(System.in);
            char code = user_input.next().charAt(0);
            // char code = 'C';

            for (int i = 0; i < menuCode.length; i++) {
                if (code == menuCode[i]) {
                    output += "You have selected the follow menu:\n";
                    output += menuCode[i] + ") " + menuItem[i] + "\n";
                    flag = false;
                }
            }

            output += "Error: select a valid option.";

        }

        //user_input.close();

        return output;
    }

    public static void main(String[] args) {

        Menu menu = new Menu();

        MenuItem createItem = new MenuItem("Create", 'C');
        menu.addItem(createItem);

        MenuItem volumeItem = new MenuItem("Get Volume", 'V');
        menu.addItem(volumeItem);

        MenuItem surfaceItem = new MenuItem("Get Surface", 'S');
        menu.addItem(surfaceItem);

        String choice = menu.getInput();
        System.out.println(choice);
    }
}
