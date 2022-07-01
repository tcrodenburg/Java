/*
Tanner Rodenburg
7.1 Bugged Program
2/21/2021
Bellevue University
Create an abstract Division class with fields for a company's division name and account number, and an abstract display() method that will be defined in the subclasses.
Use a constructor in the superclass that requires values for both fields.  Create two subclasses named InternationalDivision and DomesticDivision.
he InternationalDivision class includes a field for the country in which the division is located, a field for the language spoken, and a constructor
that requires all fields when created.  The DomesticDivision class include a field for the state in which the division is located and a constructor that
requires all fields when created.  Write an application named UseDivision that creates two instances of each of these concrete classes (4 total instances).
Save the files as: Division, InternationalDivision, DomesticDivision, and UseDivision.
 */

public class UseDivision {

    public static void main(String[] args) {

        //create instances in an array for International, two new instances per problem
        InternationalDivision[] international = new InternationalDivision[2];
        international[0] = new InternationalDivision("Europe", 88659312, "France", "French");
        international[1] = new InternationalDivision("Asia", 98332219, "Japan", "Japanese");

        //create instances in an array for Domestic, two new instances per problem
        DomesticDivision[] domestic = new DomesticDivision[2];
        domestic[0] = new DomesticDivision("Midwest", 55690122, "Nebraska");
        domestic[1] = new DomesticDivision("East Coast", 66861808, "New York");

        //iterate array of objects through loop, display international information
        System.out.println("<--International Division Information-->");
        System.out.print("****************************************");
        for (InternationalDivision internationalDivision : international) internationalDivision.display();
        System.out.print("****************************************");

        System.out.println("\n");

        //iterate array of objects through loop, display domestic information
        System.out.println("<--Domestic Division Information-->");
        System.out.print("****************************************");
        for (DomesticDivision domesticDivision : domestic) domesticDivision.display();
        System.out.print("****************************************");
    }
}
