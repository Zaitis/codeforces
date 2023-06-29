import java.util.ArrayList;
import java.util.List;

public class AlternatingSubsequence {

    public AlternatingSubsequence() { }

    public Long calculateAlternatingSequence(int length, List<Long> numbers) {
        List<Long> tempSequence = new ArrayList<>();
        Long maxSum = Long.MIN_VALUE;

        for (int i = 0; i < length - 1; i++) {
            if (tempSequence.isEmpty()) {
                tempSequence.add(numbers.get(i));
                continue;
            }

            Long currentNumber = numbers.get(i + 1);
            Long lastNumberInTempSequence = tempSequence.get(tempSequence.size() - 1);
            
            boolean canAddCurrentNumber = (lastNumberInTempSequence > 0 && currentNumber < 0) || (lastNumberInTempSequence < 0 && currentNumber > 0);
            if (!canAddCurrentNumber) {
                maxSum = updateMaxSumIfGreater(tempSequence, maxSum);
                tempSequence.clear();
            }
            tempSequence.add(currentNumber);
        }

        if (!tempSequence.isEmpty()) {
            maxSum = updateMaxSumIfGreater(tempSequence, maxSum);
        }

        return maxSum;
    }

    private Long calculateSum(List<Long> sequence) {
        Long sum = 0L;
        for (Long number : sequence) {
            sum += number;
        }
        return sum;
    }

    private Long updateMaxSumIfGreater(List<Long> sequence, Long currentMaxSum) {
        Long sequenceSum = calculateSum(sequence);
        return Math.max(sequenceSum, currentMaxSum);
    }
}
