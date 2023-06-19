import java.util.*;

public class TwoList {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(4);
        LinkedList<Integer> list2 = new LinkedList<>();

        list2.add(1);
        list2.add(3);
        list2.add(4);

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.addAll(list1);
        arrayList.addAll(list2);
        //Arrays.sort(arrayList.toArray());
        Collections.sort(arrayList);
        System.out.println(arrayList);

        test(3,5);

        }
        public static Integer test(int a,int b){
        int c = a+b;
            System.out.println(c);
        return test(2,5);
        }

        public TwoSum klklkl(){
        TwoSum sdfdsf =new TwoSum();
        return sdfdsf;
        }

}
