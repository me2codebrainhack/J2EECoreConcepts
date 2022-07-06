package module3._problem_statement;

public final class CurrentAccountDetails {
    int accountNumber;
    String name;
    double amount;

    public CurrentAccountDetails(int accountNumber, String name, double amount) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.amount = amount;
    }

    public void printCurrentAccountDetails(){
        if(name.equalsIgnoreCase("Account")){
            SbAccount sb = new SbAccount(accountNumber,name,amount);
            sb.getAccountNumber();
            sb.getName();
            System.out.println("The Amount current in Bank -> "+sb.getAmount());
        }else {
            SbAccount sb = new SbAccount(accountNumber,name,amount);
            sb.getAccountNumber();
            sb.getName();
            amount = sb.getAmount();
            System.out.println("The Amount current in Bank -> "+amount);
        }
    }

}
