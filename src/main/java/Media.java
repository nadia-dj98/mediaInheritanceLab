public abstract class Media {

    private String title;
    private String genre;
    private String language;
    private int rating;


    public Media (String title, String genre, String language, int rating) {

        this.title = title;
        this.genre = genre;
        this.language = language;
        this.rating = rating;
    }


    //methods

    public String recommendMedia() {
        if(rating > 2) {
            return String.format("%s is awesome, highly recommend!", this.title);
        }else {
            return String.format("Avoid %s at all costs! Do not waste your time!!", this.title);
        }

    }

    //getters and setters

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

}
