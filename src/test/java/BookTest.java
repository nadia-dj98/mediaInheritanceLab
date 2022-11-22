import models.Book;
import models.ShoppingCentre;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BookTest {

    private Book earthlings;
    private Book prideAndPrejudice;

    private ShoppingCentre shoppingCentre;


    @BeforeEach
    public void setUp(){
        earthlings = new Book("Earthlings", "horror", "Japanese", 3, "Sayaka Murata", 247, false);
        prideAndPrejudice = new Book ("Pride and Prejudice", "Contempary", "English", 5, "Jane Austen",  300, true);
    }


    @Test
    public void canPrintAuthorAchievingPrize() {
        String expected = "Jane Austen is a brilliant writer who has won the prestigious Pulitzer Prize.";
        String actual = prideAndPrejudice.authorAchievement();
        assertEquals(expected,actual);
    }

    @Test
    public void canPrintAuthorNotAchievingPrize() {
        String expected = "Sayaka Murata is yet to win the Pulitzer prize, which is an outrage considering how brilliant their writing is!";
        String actual = earthlings.authorAchievement();
        assertEquals(expected, actual);
    }


    @Test

    public void canPrintLanguageAvailability__noArgument() {
        String expected = "This book is written originally in Japanese.";
        String actual = earthlings.languageAvailability();
        assertEquals(expected, actual);
    }

    @Test
    public void canPrintLanguageAvailability__withArguments() {
        String expected = "This is available in Japanese and English.";
        String actual = earthlings.languageAvailability("Japanese", "English");
        assertEquals(expected,actual);
    }

    @Test
    public void canRead() {

        String expected = "Earthlings can be found at Foyles bookshop, it takes only 90 minutes to read";
        String actual = earthlings.read(90);
        assertEquals(expected, actual);
    }


}
