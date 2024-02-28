import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
  public static void main(String arg[]) {
    System.out.println("Hello");

    // Collection nums = new Collection();

    // Collection<Integer> nums = new ArrayList<Integer>();
    List<Integer> nums = new ArrayList<Integer>();
    nums.add(6);
    nums.add(5);
    nums.add(8);
    nums.add(2);


    // // Collection Interface
    // System.out.println(nums);

    // // Collection I
    // for (int n : nums) {
    //   System.out.println(n);
    // }

    // List
    System.out.println(nums.get(2));
    System.out.println(nums.indexOf(8));
    System.out.println(nums.contains(5));



  }
}