package flyweight;

public class Demo {

    public static void main(String[] args) {

        User user = new User("John Smith");
        User user1 = new User("Jane Smith");

        User2 user2 = new User2("John Smith");
        User2 user3 = new User2("Jane Smith");

        FormattedText formattedText = new FormattedText("This is a brave new world");
        formattedText.capitalize(10,15);
        System.out.println(formattedText);

        BetterFormattedText betterFormattedText = new BetterFormattedText("Mandir yahin banega");
        betterFormattedText.getRange(7,11).capitalize = true;
        System.out.println(betterFormattedText);

    }

}
