/* Define a class to represent a bank account. Include the following members
Data Members:
Name of the depositor
Account Number
Type of account
Balance amount in the account
Member functions:
To assign initial values
To deposit an amount
To withdraw an amount after checking the balance
To display name and balance.*/

class Question4 {
    public static void main(String[] args) {
       BankAccount bank = new BankAccount();
       bank.setName("prashant");
       bank.setAccountNumber(2356985453l);
       bank.setAccountType("current");
       bank.setBalanceAmount(442350.65);
       bank.deposit(47000.95);
       bank.withdraw(180000.35);
       bank.get(); 
    } 
}

class BankAccount{
    private String name;
    private long accountNumber;
    private String accountType;
    private double balanceAmount;
    
    public BankAccount(){

    }

    public void setAccountNumber(long l){
        accountNumber = l;
    }
    public void setName(String str){
        name=str;
    }

   public String getName(){
    return name;
   }

    public void setAccountType(String str){
        accountType = str;
    }
    public void setBalanceAmount(double d){
        balanceAmount = d ;
    }

    public void deposit(double amount){
        balanceAmount += amount ;
    }

    public double checkBalance(){
        return balanceAmount;
    }

    public void withdraw(double amount){
        double balance = this.checkBalance();
        balanceAmount = balance - amount;
    }

    public void get(){
        System.out.println(" name : "+ this.getName());
        System.out.println(" balance : "+ this.checkBalance());
    }

}

