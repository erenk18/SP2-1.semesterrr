
import java.util.ArrayList;

public class Author { // This class represents an author with a name and a list of titles they have written.
    private String name; //Here we use a Variable to store the author's name.
    private ArrayList<Title> titles = new ArrayList<>();


    public Author(String name) { // We use a constructor to initialize an Author object with a name
        this.name = name;

    }
// A getter method for the author's name used
    public String getName() {
        return name;
    }
// Here we use a setter method to update the authors name
    public void setName(String name) {
        this.name = name;
    }
// Method to add a title (book) to the author's list of titles.
    public void addTitle(Title title) {
        titles.add(title);
    }
// Here is a method to calculate the total pay/royalty for the author based on all their titles.
    public float calculateTotalPay() {
        double total = 0;
        for (Title title : titles) {
            total += title.calculateRoyalty();
        }
        return (float) total; //Here we return the total as a float.
    }
}
