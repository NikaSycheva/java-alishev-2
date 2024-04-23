import java.util.ArrayList;
import java.util.List;

public class LessonArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0; i < 100; i++){
            arrayList.add(i);
        }
        //System.out.println(arrayList);

        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(99));

        System.out.println(arrayList.size());

        for(int i = 0; i<arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }

        for (Integer x : arrayList){
            System.out.println(x);
        }

        List<Integer> arrayList1 = new ArrayList<>();
        for(int i = 0; i<10; i++){
            arrayList1.add(i);
        }
        arrayList1.remove(5);
        System.out.println("arrayList1: "+arrayList1);



    }
}

