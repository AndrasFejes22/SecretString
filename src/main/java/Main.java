import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        //original char[][] array:

        char[][] triplets = {
                {'t', 's', 'f'},
                {'a', 's', 'u'},
                {'m', 'a', 'f'},
                {'a', 'i', 'n'},
                {'s', 'u', 'n'},
                {'m', 'f', 'u'},
                {'a', 't', 'h'},
                {'t', 'h', 'i'},
                {'h', 'i', 'f'},
                {'m', 'h', 'f'},
                {'a', 'u', 'n'},
                {'m', 'a', 't'},
                {'f', 'u', 'n'},
                {'h', 's', 'n'},
                {'a', 'i', 's'},
                {'m', 's', 'n'},
                {'m', 's', 'u'},
        };


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

        SecretDetective secretDetective = new SecretDetective();
        //SecretDetective secretDetective2 = new SecretDetective();

        System.out.println(secretDetective.recoverSecret(triplets));
        System.out.println(secretDetective.recoverSecret(triplets1));
    }
}
