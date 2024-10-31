

public class AudioBook extends Title { // In this we have a class that represents an audiobook and extends the abstract "Title" class.
    private int durationInMinutes; // We add a variable to store the duration of the audiobook in minutes.

    // We add a constructor to initialize an audiobook object with these: title, type, copies, and duration.
    public AudioBook(String title, String literatureType, int copies, int durationInMinutes) {
        super(title, literatureType, copies);
        this.durationInMinutes = durationInMinutes;
    }
    // In these following codes we use a getter method for the audiobook's duration in minutes.
    public int getDurationInMinutes() {
        return durationInMinutes;
    }
    // And here is the setter method to update the duration of the audiobook.
    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }
    // The Overrides method the calculatePoints method to calculate points based on our duration, copies, and literature type codes.
    @Override
    protected double calculatePoints() {
        return durationInMinutes * 0.5 * getCopies() * calculateLiteraturePoints();
    }
    // Here i use a method to calculate the points for the audiobook based on the type of literature.
    @Override
    protected double calculateLiteraturePoints() {
        return switch (getLiteratureType()) {
            case "BI" -> 1.5;
            case "TE" -> 1.5;
            case "LYRIK" -> 3;
            case "SKØN" -> 0.85;
            case "FAG" -> 0.5;
            default -> 0.0;
        };
    }
}
