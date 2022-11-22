package models;

import interfaces.IRead;
import interfaces.IWatch;

public class ShoppingCentre implements IRead, IWatch {

    private String centreName;

    private String cinemaName;
    private String bookShopName;

    private Book book;
    private Film film;



    public ShoppingCentre(String centreName, String cinemaName, String bookShopName) {
        this.centreName = centreName;
        this.cinemaName = cinemaName;
        this.bookShopName = bookShopName;

    }

    public String read(int minutes) {

        return String.format("After reading %s at %s bookshop for %s minutes you can watch %s at our cinema.",this.book, this.bookShopName, minutes, this.film);
    }

    public String watch (int minutes) {

        return String.format("You can watch %s at %s, the film takes %s minutes to watch, afterwards do visit %s", this.film, this.cinemaName, minutes, this.bookShopName);
    }

    //getters and setters

    public String getCinemaName() {
        return cinemaName;
    }

    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }

    public String getBookShopName() {
        return bookShopName;
    }

    public void setBookShopName(String bookShopName) {
        this.bookShopName = bookShopName;
    }




}
