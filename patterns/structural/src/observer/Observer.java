package observer;

public interface Observer<T> {

    void handle(PropertyChangedEventArgs args);//<T> args);

}
