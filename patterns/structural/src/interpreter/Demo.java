package interpreter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {

    static List<Token> lex(String input){
        ArrayList<Token> result = new ArrayList<>();

        for(int i=0;i<input.length();i++){
            switch (input.charAt(i)){
                case '+':
                    result.add(new Token(Token.Type.PLUS,"+"));
                    break;
                case '-':
                    result.add(new Token(Token.Type.MINUS,"-"));
                    break;
                case ')':
                    result.add(new Token(Token.Type.RPAREN,")"));
                    break;
                case '(':
                    result.add(new Token(Token.Type.LPAREN,"("));
                    break;
                    default:
                        StringBuilder stringBuilder = new StringBuilder(""+input.charAt(i));
                        for(int j=i+1;j<input.length();++j){
                            if(Character.isDigit(input.charAt(j))){
                                stringBuilder.append(input.charAt(j));
                                ++i;
                            }
                            else{
                                result.add(new Token(
                                        Token.Type.INTEGER, stringBuilder.toString()
                                ));
                                break;
                            }
                        }
                        break;
            }
        }
        return result;
    }

    static Element parse(List<Token> tokens){
        BinaryOperation result = new BinaryOperation();
        boolean haveLHS = false;

        for(int i=0; i<tokens.size();i++){
            Token token = tokens.get(i);

            switch (token.type){
                case INTEGER:
                    Integer integer = new Integer(java.lang.Integer.parseInt(token.text));
                    if(!haveLHS){
                        result.left = integer;
                        haveLHS = true;
                    }
                    else{
                        result.right = integer;
                    }
                    break;
                case PLUS:
                    result.type = BinaryOperation.Type.ADDITION;
                    break;
                case MINUS:
                    result.type = BinaryOperation.Type.SUBTRACTION;
                    break;
                case LPAREN:
                    int j=i;
                    for(;j<tokens.size();++j){
                        if(tokens.get(j).type == Token.Type.RPAREN){
                            break;
                        }
                    }
                    List<Token> subexpression = tokens.stream()
                            .skip(i+1)
                            .limit(j-i-1)
                            .collect(Collectors.toList());
                    Element element = parse(subexpression);
                    if(!haveLHS){
                        result.left = element;
                        haveLHS = true;
                    }
                    else{
                        result.right = element;
                    }
                    i=j;
                    break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String input = "(13-4)-(12+1)";
        List<Token> tokens = lex(input);
        System.out.println(tokens.stream()
        .map(t->t.toString())
        .collect(Collectors.joining("\t")));

        Element parsed = parse(tokens);
        System.out.println(input + " = " + parsed.eval());
    }

}
