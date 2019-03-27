package visitor;

public class ExpressionPrinter implements DoubleExpressionVisitor, AdditionExpressionVisitor{

//    public static void print(Expression e, StringBuilder sb){
//        if(e.getClass() == DoubleExpression.class){
//            sb.append(((DoubleExpression)e).value);
//        }
//        else if(e.getClass() == AdditionExpression.class){
//            AdditionExpression ae = (AdditionExpression)e;
//            sb.append("(");
//            print(ae.left, sb);
//            sb.append("+");
//            print(ae.right,sb);
//            sb.append(")");
//        }
//    }

    private StringBuilder stringBuilder = new StringBuilder();

    @Override
    public void visit(DoubleExpression expression) {
        stringBuilder.append(expression.value);
    }

    @Override
    public void visit(AdditionExpression expression) {
        stringBuilder.append("(");
        expression.left.accept(this);
        stringBuilder.append("+");
        expression.right.accept(this);
        stringBuilder.append(")");
    }

    @Override
    public String toString() {
        return stringBuilder.toString();
    }
}
