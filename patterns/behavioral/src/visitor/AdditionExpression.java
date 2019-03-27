package visitor;

public class AdditionExpression extends Expression {

    public Expression left, right;

    public AdditionExpression(Expression left, Expression right){
        this.left = left;
        this.right = right;
    }

    public void accept(Visitor visitor){
        if(visitor instanceof AdditionExpressionVisitor)
            ((AdditionExpressionVisitor)visitor).visit(this);
    }

    //    @Override
//    public void print(StringBuilder sb) {
//        sb.append("(");
//        left.print(sb);
//        sb.append("+");
//        right.print(sb);
//        sb.append(")");
//    }
}
