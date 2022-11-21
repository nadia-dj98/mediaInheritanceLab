import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilmTest {


    private Film fightClub;
    private Film roma;

    @BeforeEach
    public void setUp() {
        fightClub = new Film("Fight Club", "Thriller", "English", 5, "David Fincher", true,false);
        roma = new Film("Roma", "Drama", "Spanish", 2, "Alfonso Cuarón", true,true);
    }

    @Test
    public void canAnnounceDirectorAchievingOscar() {
        String expected = "Alfonso Cuarón is an Oscar winner!";
        String actual = roma.directorAchievement();
        assertEquals(expected,actual);
    }


    @Test
    public void canAnnounceDirectorNotAchievingOscar(){
        //Arrange
        String expected = "David Fincher is yet to win an Oscar.";
        //Act
        String actual = fightClub.directorAchievement();

        //Assert
        assertEquals(expected,actual);
    }

    @Test
    public void canAnnounceFightClubDirectorAchievingOscar(){
        //Arrange
        fightClub.setOscarReceived(true);
        String expected = "David Fincher is an Oscar winner!";
        //Act
        String actual = fightClub.directorAchievement();

        //Assert
        assertEquals(expected,actual);
    }



}
