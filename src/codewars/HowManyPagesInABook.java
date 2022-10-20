package codewars;

public class HowManyPagesInABook {
    public static int amountOfPages(int summary) {
        int result = 0;
        int i = 1;
        int count = 0;
        while(true) {
            int numDigits = (int)(Math.log10(i)+1);
            result += numDigits;
            i++;
            count++;
            if(result >= summary) {
                break;
            }
        }
        return count;
    }
}