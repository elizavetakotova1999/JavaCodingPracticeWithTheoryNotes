package Collections.Methods;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsMethods {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(40);
        arrayList.add(18);
        arrayList.add(567);
        arrayList.add(64);

        Collections.reverse(arrayList);
        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println(arrayList);


    }
}
