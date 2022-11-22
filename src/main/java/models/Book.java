package models;

import interfaces.IRead;
import models.Media;


public class Book extends Media implements IRead {

    private String author;
    private int numberOfPages;
    private boolean pulitzerPrizeWinner;
    private ShoppingCentre shoppingCentre;


    public Book (String title, String genre, String language, int rating, String author, int numberOfPages, boolean pulitzerPrizeWinner) {
        super(title, genre, language, rating);
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.pulitzerPrizeWinner = pulitzerPrizeWinner;
        this.shoppingCentre = new ShoppingCentre("BNTA Centre", "Vue","Foyles");

    }


    //method

    public String authorAchievement() {
        if (pulitzerPrizeWinner == true){
            return String.format("%s is a brilliant writer who has won the prestigious Pulitzer Prize.", this.author);
        } else {
            return String.format("%s is yet to win the Pulitzer prize, which is an outrage considering how brilliant their writing is!", this.author);
        }
    }


    //implementing abstract method from models.Media superclass with different body
    public String languageAvailability() {
        return String.format("This book is written originally in %s.", getLanguage());
    }


    //method from interface
    public String read(int minutes) {
        return String.format("%s can be found at %s bookshop, it takes only %s minutes to read", getTitle(), shoppingCentre.getBookShopName(),minutes );
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
