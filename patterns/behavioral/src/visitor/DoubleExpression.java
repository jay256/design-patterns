package visitor;

public class DoubleExpression extends Expression {

    public double value;

    public DoubleExpression(double value){
        this.value = value;
    }

//    @Override
//    public void print(StringBuilder sb) {
//        sb.append(value);
//    }


    public void accept(Visitor visitor){
        if(visitor instanceof DoubleExpressionVisitor)
            ((DoubleExpressionVisitor)visitor).visit(this);
    }
}
