import java.util.ArrayList;
import java.util.List;

public class AlternatingSubsequence {
    public AlternatingSubsequence() {
    }

    public Long alternatingSequence(int length, List<Long> list) {
        Long tempResult;
        List<Long> tempSequence = new ArrayList<>();
        Long result = Long.MIN_VALUE;
        System.out.println(list);

        for (int i = 0; i < length - 1; i++) {
            if (tempSequence.size() == 0) {
                tempSequence.add(list.get(i));
            }

            if (tempSequence.get(tempSequence.size() - 1) > 0) {
                if (list.get(i + 1) < 0) {
                    tempSequence.add(list.get(i + 1));
                } else
                {
                    tempResult = tempSum(tempSequence);
                    if (tempResult > result) result = tempResult;
                    tempSequence.clear();
                }
            }
            if (tempSequence.get(tempSequence.size() - 1) < 0) {
                if (list.get(i + 1) > 0) {
                    tempSequence.add(list.get(i + 1));
                } else {
                    tempResult = tempSum(tempSequence);
                    if (tempResult > result) result = tempResult;
                    tempSequence.clear();
                }
            }
        }
        if (tempSequence.size() > 0) {
            tempResult = tempSum(tempSequence);
            if (tempResult > result) result = tempResult;
        }
        System.out.println(result);
        return result;
    }

    private Long tempSum(List<Long> tempSequence) {
        Long result = 0L;
        for (int i = 0; i < tempSequence.size(); i++) {
            result += tempSequence.get(i);
        }
        return result;
    }

}


