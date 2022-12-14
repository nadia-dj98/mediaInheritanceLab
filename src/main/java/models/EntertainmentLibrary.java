package models;

import models.Media;

import java.util.ArrayList;

public class EntertainmentLibrary {


    private String libraryName;
    private ArrayList<Media> booksAndFilmsCollection;


    //constructor

    public EntertainmentLibrary(String libraryName){
        this.libraryName = libraryName;
        this.booksAndFilmsCollection = new ArrayList<>();
    }




//    methods

    public void addMedia (Media booksAndFilmsCollection) {
        this.booksAndFilmsCollection.add(booksAndFilmsCollection);
    }

    public int countBooksAndFilmsCollection() {
        return this.booksAndFilmsCollection.size();
    }



        //getters and setters

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public ArrayList<Media> getBooksAndFilmsCollection() {
        return booksAndFilmsCollection;
    }

    public void setBooksAndFilmsCollection(ArrayList<Media> booksAndFilmsCollection) {
        this.booksAndFilmsCollection = booksAndFilmsCollection;
    }


}
