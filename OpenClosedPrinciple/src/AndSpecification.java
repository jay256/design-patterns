public class AndSpecification<T> implements Specification<T> {

    private Specification<T> left, right;

    public AndSpecification(Specification<T> left, Specification<T> right){
        this.left =left;
        this.right = right;
    }

    @Override
    public boolean isSatisfied(T item) {
        return left.isSatisfied(item) && right.isSatisfied(item);
    }
}
