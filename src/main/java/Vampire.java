import java.util.ArrayList;
import java.util.List;

public class Vampire {

    public  Vampire(){
        List<Integer> vampireList = new ArrayList<>();
        vampireList.add(2);
        vampireList.add(3);
        vampireList.add(2);
        vampireList.add(5);
        vampireList.add(2);
        System.out.println(divadedGroup(vampireList));

    }

    public int divadedGroup(List<Integer> list){
        int count=1;
        List<Integer>listZ= new ArrayList<>();

        for (Integer integer : list) {
            for (Integer value : listZ) {
                if (value.equals(integer)) {
                    count++;
                    listZ.clear();
                    break;
                }
            }
            listZ.add(integer);
        }
        return count;
    }
}
