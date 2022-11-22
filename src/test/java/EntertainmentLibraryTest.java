import models.Book;
import models.EntertainmentLibrary;
import models.Film;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class EntertainmentLibraryTest {

    private EntertainmentLibrary entertainmentLibrary;

    @BeforeEach
    public void setUp() {
        entertainmentLibrary = new EntertainmentLibrary("Nadia's library");
    }

    @Test
    public void canCountLibraryCollection() {
        int expected = 0 ;
        int actual = entertainmentLibrary.countBooksAndFilmsCollection();
        assertEquals(expected, actual);
    }

    @Test
    public void canAddMedia() {
        Film psycho = new Film("Psycho", "horror", "English", 4, "Alfred Hitchcock", true, false);
        Book emma = new Book ("Emma", "Contemporary", "English", 2, "Jane Austen", 350, true);
        entertainmentLibrary.addMedia(psycho);
        entertainmentLibrary.addMedia(emma);
        int expected = 2;
        int actual = entertainmentLibrary.countBooksAndFilmsCollection();
        assertEquals(expected, actual);
    }




}
