public class Book extends Media {

    private String author;
    private int numberOfPages;


    private boolean pulitzerPrizeWinner;

    public Book (String title, String genre, String language, int rating, String author, int numberOfPages, boolean pulitzerPrizeWinner) {
        super(title, genre, language, rating);
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.pulitzerPrizeWinner = pulitzerPrizeWinner;

    }


    //method

    public String authorAchievement() {
        if (pulitzerPrizeWinner == true){
            return String.format("%s is a brilliant writer who has won the prestigious Pulitzer Prize.", this.author);
        } else {
            return String.format("%s is yet to win the Pulitzer prize, which is an outrage considering how brilliant their writing is!", this.author);
        }
    }

    public String languageAvailability() {
        return String.format("This book is written originally in %s.", getLanguage());
    }

    //getters and setters

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public boolean isPulitzerPrizeWinner() {
        return pulitzerPrizeWinner;
    }

    public void setPulitzerPrizeWinner(boolean pulitzerPrizeWinner) {
        this.pulitzerPrizeWinner = pulitzerPrizeWinner;
    }



}
