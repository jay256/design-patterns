package command;

public class BankAccountCommand implements Command {

    private BankAccount bankAccount;
    private boolean succeeded;

    @Override
    public void call() {
        switch (action){
            case DEPOSIT:
                succeeded = bankAccount.deposit(amount);
                break;
            case WITHDRAW:
                succeeded = bankAccount.withdraw(amount);
                break;
        }
    }


    @Override
    public void undo() {
        if(succeeded != true) return;
        switch (action){
            case DEPOSIT:
                bankAccount.withdraw(amount);
                break;
            case WITHDRAW:
                bankAccount.deposit(amount);
                break;
        }
    }

    public enum Action{
        DEPOSIT, WITHDRAW
    }

    private Action action;
    private int amount;

    public BankAccountCommand(BankAccount bankAccount, Action action, int amount){
        this.bankAccount = bankAccount;
        this.action = action;
        this.amount = amount;
    }
}
