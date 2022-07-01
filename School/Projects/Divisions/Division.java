public abstract class Division {
    //superclass

    //variables in problem
    private String divisionName;
    private int accountNumber;

    //constructor set for division name and account number
    public Division(String divisionName, int accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    //get division name
    public String getDivisionName() {
        return divisionName;
    }

    //get account number
    public int getAccountNumber() {
        return accountNumber;
    }

    //set division name
    public void setDivisionName(String divisionName) {
        this.divisionName = divisionName;
    }

    //set account number
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    //display to be defined in subclasses
    abstract void display();
}
