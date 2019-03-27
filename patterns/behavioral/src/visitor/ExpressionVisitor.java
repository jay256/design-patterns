package visitor;

public interface ExpressionVisitor extends Visitor{

//    void visit(DoubleExpression expression);
//    void visit(AdditionExpression expression);

    void visit(Expression obj);

}
