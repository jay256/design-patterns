package proxy;

public class CarProxy extends Car {

    public CarProxy(Driver driver){
        super(driver);
    }

    @Override
    public void drive() {
        if(driver.age <= 16){
            System.out.println("Driver too young");
        }
        else{
            super.drive();
        }
    }
}
