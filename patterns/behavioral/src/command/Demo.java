package command;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        System.out.println(ba);

        List<BankAccountCommand> commands = Arrays.asList(
                new BankAccountCommand(ba, BankAccountCommand.Action.DEPOSIT, 100),
                new BankAccountCommand(ba, BankAccountCommand.Action.WITHDRAW, 1000)
        );

        for(BankAccountCommand bac:commands){
            bac.call();
            System.out.println(ba);
        }

        Collections.reverse(commands);
        for(BankAccountCommand bankAccountCommand : commands){
            bankAccountCommand.undo();
            System.out.println(ba);
        }
    }

}
