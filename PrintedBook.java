

public class PrintedBook extends Title {  //This class represents a printedbook
    private int pages; // in this code i use a variable to store the number of pages

    public PrintedBook(String title, String literatureType, int copies, int pages) {
        super(title, literatureType, copies);
        this.pages = pages;
    }

// getter and setter methods
    public int getPages() {
        return pages;
    }
//same here
    public void setPages(int pages) {
        this.pages = pages;
    }
//The override method to calculate the points
    @Override
    protected double calculatePoints() {
        return pages * getCopies() * calculateLiteraturePoints();
    }
//again the ovveride method to calculate the points based on the litterature
    @Override
    protected double calculateLiteraturePoints() {
        return switch (getLiteratureType()){
            case "BI" -> 3;
            case "TE" -> 3;
            case "LYRIK" -> 6;
            case "SKØN" -> 1.7;
            case "FAG" -> 1;
            default -> 0.0;
        };

    }
}
