package mediator;

public class Demo {

    public static void main(String[] args) {

        ChatRoom chatRoom = new ChatRoom();

        Person person = new Person("John");
        Person person1 = new Person("Jane");

        chatRoom.join(person);
        chatRoom.join(person1);

        person.say("hi room");
        person1.say("oh hey, john");

        Person person2 = new Person("Simon");
        chatRoom.join(person2);
        person2.say("hi everyone!");

        person1.privateMessage("Simon", "glad you could join us!");

        EventBroker broker = new EventBroker();
        FootballPlayer player = new FootballPlayer(broker, "jones");
        FootballCoach coach = new FootballCoach(broker);

        player.score();
        player.score();
        player.score();
    }

}
