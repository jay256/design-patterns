package observer;

public class Demo { //implements Observer<Person>{

//    public Demo(){
//        Person person = new Person();
//        person.subscribe(this);
//        for(int i=20;i<24;i++){
//            person.setAge(i);
//        }
//    }
//
//    @Override
//    public void handle(PropertyChangedEventArgs<Person> args) {
//        System.out.println("Person's " + args.propertyName + " has changed to " + args.newValue);
//    }
//
//    public static void main(String[] args) {
//        new Demo();
//    }

    public static void main(String[] args) throws Exception {
        Person person = new Person();
        Event<PropertyChangedEventArgs>.Subscription sub = person.propertyChanged.addHandler(
                x-> {
                    System.out.println("Person's "+ x.propertyName + " has changed");
                }
        );
        person.setAge(17);
        person.setAge(18);
        sub.close();
        person.setAge(19);
    }

}
