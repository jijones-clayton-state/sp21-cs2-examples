import java.util.ArrayList;

public class ArrayListExamples{
    public static void main(String[] args){
        ArrayList<String> people = new ArrayList<>();
        people.add("Rick");
        people.add("Morty");
        people.add(1, "Summer");
        
        System.out.println(people);
        for(String person: people){
            System.out.println(person);
        }
    }
}