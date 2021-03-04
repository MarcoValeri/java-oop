public class MenuItem {
    private String text;
    private char code;

    public MenuItem(String text, char code) {
        this.text = text;
        this.code = code;
    }

    public String getText() {
        return text;
    }

    public char getCode() {
        return code;
    }
}
