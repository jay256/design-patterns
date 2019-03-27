package visitor;

public abstract class Expression {

    //public abstract void print(StringBuilder sb);

    public void accept(Visitor visitor){
        if(visitor instanceof ExpressionVisitor)
            ((ExpressionVisitor)visitor).visit(this);
    }

}
