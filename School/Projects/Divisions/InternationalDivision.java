public class InternationalDivision extends Division {
    //subclass of division

    //variables in problem
    private String divisionCountry;
    private String spokenLanguage;

    //set division country location
    public void setDivisionLocation(String divisionCountry) {
        this.divisionCountry = divisionCountry;
    }

    //set the spoken language
    public void setSpokenLanguage(String spokenLanguage) {
        this.spokenLanguage = spokenLanguage;
    }

    //get division location
    public String getDivisionCountry() {
        return divisionCountry;
    }

    //get spoken language
    public String getSpokenLanguage() {
        return spokenLanguage;
    }

    //constructor includes all fields
    public InternationalDivision(String divisionName, int accountNumber, String divisionCountry, String spokenLanguage) {
        super(divisionName, accountNumber);
        this.divisionCountry = divisionCountry;
        this.spokenLanguage = spokenLanguage;
    }

    //override abstract display method for subclass method
    @Override
    void display() {
        System.out.println("\nDivision Name: " + getDivisionName() +
                "\nAccount Number: " + getAccountNumber() +
                "\nDivision Location: " + getDivisionCountry() +
                "\nSpoken Language: " + getSpokenLanguage());
    }
}
