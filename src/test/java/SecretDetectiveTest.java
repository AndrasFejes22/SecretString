import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class SecretDetectiveTest {

    private SecretDetective detective;

    @BeforeEach
    void setUp() {
        detective = new SecretDetective();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void recoverSecretTest() {
        char[][] triplets = {
                {'t','u','p'},
                {'w','h','i'},
                {'t','s','u'},
                {'a','t','s'},
                {'h','a','p'},
                {'t','i','s'},
                {'w','h','s'}
        };
        assertEquals("whatisup", detective.recoverSecret(triplets));

        char[][] triplets1 = {
                {'g', 'a', 's'},
                {'o', 'g', 's'},
                {'c', 'n', 't'},
                {'c', 'o', 'n'},
                {'a', 't', 's'},
                {'g', 'r', 't'},
                {'r', 't', 's'},
                {'c', 'r', 'a'},
                {'g', 'a', 't'},
                {'n', 'g', 's'},
                {'o', 'a', 's'},

        };
        assertEquals("congrats", detective.recoverSecret(triplets1));
    }

    @Test
    void containsSameIndex() {
        List<Integer> numbers = List.of(0,0,0,0,0);
        assertTrue(SecretDetective.containsSameIndex(numbers, 0));
    }

    @Test
    void allSublistEmpty() {
    }

    @Test
    void setToString() {
        Set<Character> characterSet = new LinkedHashSet<>();
        characterSet.add('p');
        characterSet.add('h');
        characterSet.add('o');
        characterSet.add('n');
        characterSet.add('e');
        assertEquals("phone", SecretDetective.setToString(characterSet));
    }
}