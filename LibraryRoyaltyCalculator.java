import java.util.ArrayList;

public class LibraryRoyaltyCalculator { //In this class serves as the main program to calculate royalty payments for an author.
    public static void main(String[] args) { // Main method, the entry point for program execution.
        ArrayList<Title> titles = new ArrayList<>(); //Creates a list to hold titles, though it's not used directly in this code

        // creating an author object for our author H.C. Andersen
        Author author1 = new Author( "H.C Andersen");

        //Creating instances of PrintedBook and AudioBook, representing different titles by H.C. Andersen.
        Title printedBook1 = new PrintedBook("Den lille havfrue", "SKØN", 1500, 300);
        Title printedBook2 = new PrintedBook("Den grimme ælling", "BI", 500, 300);
        Title audioBook1 = new AudioBook("Den flyvende tæppe", "LYRIK", 1000, 50);

        //here we are adding titles to the author’s list of works.
        author1.addTitle(printedBook1);
        author1.addTitle(printedBook2);
        author1.addTitle(audioBook1);


        // Prints the author's name and total calculated royalty payment for all their titles.
        System.out.println(author1.getName() + " " + author1.calculateTotalPay()+"kr");
    }
}

