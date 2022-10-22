package codewars;

public class BuildAPileOfCubes {

    public static long findNb(long m) {

        long total = 0;
        long n = 0;

        while(total < m){
            n += 1;
            total += (long)Math.pow(n, 3);
        }
        return total == m ? n : -1;
    }
}

