import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    void fullName() {
        Person person = new Person("Ethan", "Lawhorn", "001", "Mr.", 2001);
        assertEquals("Ethan Lawhorn", person.fullName());
    }

    @Test
    void formalName() {
        Person person = new Person("Ethan", "Lawhorn", "001", "Mr.", 2001);
        assertEquals("Mr. Ethan Lawhorn", person.formalName());
    }

    @Test
    void getAge() {
        Person person = new Person("Ethan", "Lawhorn", "001", "Mr.", 2001);
        int currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
        assertEquals(currentYear - 2001, person.getAge());
    }

    @Test
    void getAgeForYear() {
        Person person = new Person("Ethan", "Lawhorn", "001", "Mr.", 2001);
        assertEquals(30, person.getAge(2031));
    }
}