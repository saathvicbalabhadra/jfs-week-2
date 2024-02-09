import java.util.*;
public class Lecture15 {
    public static void main(String[] args) {
        ArrayList<String> countries=new ArrayList<String>();
        countries.add("India");
        countries.add("Usa");
        countries.add("Pakistan");
        countries.add("Sri Lanka");

        for(int i=0;i<countries.size();i++){
            System.out.println(countries.get(i));
        }
        countries.set(1,"Japan");
        System.out.println(countries.get(1));

        countries.remove(2);
        System.out.println(countries.get(2));
        
    }
    
}