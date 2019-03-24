package observer;

public class Person extends Observable<Person>{

//    private int age;
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        if(this.age==age) return;
//        this.age = age;
//        propertyChanged(this, "age", age);
//    }

    public Event<PropertyChangedEventArgs> propertyChanged = new Event<>();

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(this.age==age) return;
        this.age = age;
        propertyChanged.fire(new PropertyChangedEventArgs(this, "age"));
    }
}
