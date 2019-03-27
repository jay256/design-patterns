package visitor;

public class ExpressionCalculator implements DoubleExpressionVisitor, AdditionExpressionVisitor {

    public double result;

    @Override
    public void visit(DoubleExpression expression) {
        result = expression.value;
    }

    @Override
    public void visit(AdditionExpression expression) {
        expression.left.accept(this);
        double a = result;
        expression.right.accept(this);
        double b = result;
        result = a + b;
    }
}
