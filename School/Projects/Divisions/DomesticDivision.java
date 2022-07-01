public class DomesticDivision extends Division {
    //subclass of division

    //variable in problem
    private String divisionState;

    //set division state location
    public void setDivisionState(String divisionState) {
        this.divisionState = divisionState;
    }

    //get division state location
    public String getDivisionState() {
        return divisionState;
    }

    //constructor includes all fields
    public DomesticDivision(String divisionName, int accountNumber, String divisionState) {
        super(divisionName, accountNumber);
        this.divisionState = divisionState;
    }

    //override abstract display method for subclass method
    @Override
    void display() {
        System.out.println("\nDivision Name: " + getDivisionName() +
                "\nAccount Number: " + getAccountNumber() +
                "\nDivision Location: " + getDivisionState());
    }
}
