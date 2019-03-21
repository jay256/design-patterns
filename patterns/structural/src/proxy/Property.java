package proxy;

public class Property<T> {

    private T value;

    public Property(T value){
        this.value = value;
    }

    public T getValue(){
        return value;
    }

    public void setValue(T value){
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;

        Property<?> property = (Property<?>) obj;

        return value != null ? value.equals(property.value) : property.value == null;
    }
}
