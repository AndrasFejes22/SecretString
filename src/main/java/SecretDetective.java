import java.util.*;
import java.util.stream.Collectors;

public class SecretDetective {

    /**
     * TODO: Write a method that makes a tripletsMatrix from a given word.
     * */

    public String recoverSecret(char[][] triplets) {

        Set<Character> result = new LinkedHashSet<>();
        List<List<Character>> lettersList = new ArrayList<>();
        List<Integer> indexes = new ArrayList<>();
        List<Character> characterList = new ArrayList<>();
        List<String> tripletList = new ArrayList<>();



        for(int x = 0; x < triplets.length; x++) {
            for(int y = 0; y < triplets[x].length; y++) {
                if(!characterList.contains(triplets[x][y])) {
                    characterList.add(triplets[x][y]);
                }
            }
        }

        for (int i = 0; i < triplets.length; i++) {
            tripletList.add(new String(triplets[i]));
        }
        for (int i = 0; i < triplets.length; i++) {
            lettersList.add(tripletList.get(i).chars().mapToObj(c -> (char) c).collect(Collectors.toList()));
        }

        while(!allSublistEmpty(lettersList)) {
            for (int i = 0; i < characterList.size(); i++) { // lettersList
                for (int j = 0; j < lettersList.size(); j++) { //characterList / eredeti
                    if (lettersList.get(j).contains(characterList.get(i))) { // lettersList.get(i).contains(characterList.get(j))
                        indexes.add(lettersList.get(j).indexOf(characterList.get(i))); // valami break hiányzik valahol // get(j)
                    }

                }
                if (containsSameIndex(indexes, 0)) {
                    for (int k = 0; k < lettersList.size(); k++) {
                        if (lettersList.get(k).contains(characterList.get(i))) {
                            lettersList.get(k).remove(0);
                            result.add(characterList.get(i));
                        }
                    }
                }
                indexes.clear();
            }

        }
        //System.out.println("result: "+setToString(result));
        return setToString(result);
    }

    public static boolean containsSameIndex(List<Integer> indexes, int number){
        for (int i = 0; i < indexes.size(); i++) {
            if(indexes.get(i) != number){
                return false;
            }
        }
        return true;
    }

    public static boolean allSublistEmpty(List<List<Character>> lettersList){
        for (int i = 0; i < lettersList.size(); i++) {
            if(lettersList.get(i).size() != 0){
                return false;
            }
        }
        return true;
    }

    public static String setToString(Set<Character> result){
        StringBuilder sb = new StringBuilder();
        Iterator<Character> characterIterator = result.iterator();
        while (characterIterator.hasNext()){
            sb.append(characterIterator.next());
        }
        return sb.toString();
    }
}
