import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int i = 10, j;
        j = i++; // assign value firstly , then execute i=i+1
        System.out.println(i); // 11
        System.out.println(j); // 10
        i = 10;
        j = ++i;
        System.out.println(i); // 11
        System.out.println(j); // 11
        i--;
        System.out.println(i); // 10

        ArrayList<String> rsList = new ArrayList<>();
        rsList.add("1");
        rsList.add(0, "2");
        rsList.stream().forEach(System.out::println);
    }
}
