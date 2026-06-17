package ArrayQuestion;

public class nextGreatestLetter {
    public char nextGreatestLetter(char[] letters, char target) {
        int first = 0;
        int end = letters.length - 1;
        while (first <= end) {
            int mid = first + (end - first) / 2;
            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                first = mid + 1;
            }
        }
        return letters[first % letters.length];
    }
}
