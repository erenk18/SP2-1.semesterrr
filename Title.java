
public abstract class Title { // This abstract class represents a generic title (e.g., book or audiobook) with essential attributes and methods
    private String title; // Stores the title's name.
    private String literatureType; // Here we stores the type of literature ("BI", "LYRIK").
    protected int copies; // Protected variable for the number of copies sold or distributed.
    protected double rate = 0.067574; // Default rate used to calculate royalty, accessible by subclasses.

    //adding a constructor to initialize the title, type, and copies.
    public Title(String title, String literatureType, int copies) {
        this.title = title;
        this.literatureType = literatureType;
        this.copies = copies;
    }
    // We use a getter method for the title's name.
    public String getTitle() {
        return title;
    }
    // and a setter method to update the title's name.
    public void setTitle(String title) {
        this.title = title;
    }
    // the same here for a getter method for the literature type.
    public String getLiteratureType() {
        return literatureType;
    }
    // A setter method to update the literature types
    public void setLiteratureType(String literatureType) {
        this.literatureType = literatureType;
    }
    // The getter method for the number of copies.
    public int getCopies() {
        return copies;
    }
    // For the setter method to update the number of copies.
    public void setCopies(int copies) {
        this.copies = copies;
    }
    // Getter method for the royalty rate we have
    public double getRate() {
        return rate;
    }
    // The setter method for to update the royalty rate.
    public void setRate(double rate) {
        this.rate = rate;
    }
    // And then the method to calculate royalty based on points and rate.
    public double calculateRoyalty() {
        return calculatePoints() * rate;
    }
    // Here we abstract a method to calculate points based on specific title properties implemented by subclasses.
    protected abstract double calculatePoints();

    // And the same we do here is a abstract method to calculate literature points based on the literature type, implemented by subclasses.
    protected abstract double calculateLiteraturePoints();

}

