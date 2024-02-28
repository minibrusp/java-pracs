import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
  public static void main(String args[]) {
    List<String> names = new ArrayList<>();
    names.add("IshRifitikWalashtikKungPumitik");
    names.add("Chuckie");
    names.add("Angelica");
    names.add("Tommy");
    names.add("Susie");
    names.add("Lilian");
    names.add("Phillip");
    names.add("Kimi");
    names.add("Dill");
    names.add("A");


    // Comparator<String> com = new Comparator<String>() {
    //   public int compare(String n1, String n2) {
    //     return n1.length() > n2.length() ? 1 : -1;
    //   }
    // };

    Comparator<String> com = (String n1, String n2) -> n1.length() > n2.length() ? 1 : -1;

    Collections.sort(names, com);

    System.out.println(names);


    // end of main
  }
}