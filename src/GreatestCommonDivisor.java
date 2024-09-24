public class GreatestCommonDivisor {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));
    }

    private static int getGreatestCommonDivisor(int first, int second) {

        if (first < 10 || second < 10) {
            return -1;
        }


        int gcd = 1;


        int smallest = Math.min(first, second);


        for (int i = 1; i <= smallest; i++) {

            if (first % i == 0 && second % i == 0) {
                gcd = i;
            }
        }

        return gcd; //
    }
}
