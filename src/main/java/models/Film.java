package models;

import models.Media;

public class Film extends Media {

    private String director;


    private boolean subtitlesAvailable;
    private boolean oscarReceived;


    //constructor

    public Film (String title, String genre, String language, int rating, String director, boolean subtitlesAvailable, boolean oscarReceived) {
        super(title, genre, language, rating);
        this.director = director;
        this.subtitlesAvailable = subtitlesAvailable;
        this.oscarReceived = oscarReceived;
    }

    //methods

    public String directorAchievement() {
        if (oscarReceived == true){
            return String.format("%s is an Oscar winner!", this.director);
        } else {
            return String.format("%s is yet to win an Oscar.", this.director);
        }
    }
    public String languageAvailability(){
        return String.format("This film is available in %s.", this.getLanguage());
    };


    //getters and setters

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public boolean isSubtitlesAvailable() {
        return subtitlesAvailable;
    }

    public void setSubtitlesAvailable(boolean subtitlesAvailable) {
        this.subtitlesAvailable = subtitlesAvailable;
    }

    public boolean isOscarReceived() {
        return oscarReceived;
    }

    public void setOscarReceived(boolean oscarReceived) {
        this.oscarReceived = oscarReceived;
    }

}
