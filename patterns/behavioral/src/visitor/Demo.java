package visitor;

public class Demo {

    public static void main(String[] args) {
        AdditionExpression additionExpression = new AdditionExpression(new DoubleExpression(1),
                new AdditionExpression(
                        new DoubleExpression(2),
                        new DoubleExpression(3)
                ));
        //StringBuilder stringBuilder = new StringBuilder();
        //additionExpression.print(stringBuilder);
        //ExpressionPrinter.print(additionExpression, stringBuilder);
        ExpressionPrinter ep = new ExpressionPrinter();
        ep.visit(additionExpression);
        System.out.println(ep);

        ExpressionCalculator ec = new ExpressionCalculator();
        ec.visit(additionExpression);
        System.out.println(ep + " = " + ec.result);
    }

}
