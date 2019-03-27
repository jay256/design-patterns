package visitor;

public interface AdditionExpressionVisitor extends Visitor {

    void visit(AdditionExpression obj);

}
