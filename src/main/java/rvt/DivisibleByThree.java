package rvt;

public class DivisibleByThree {
    public static void main(String[] args) {
        divisibleByThreeInRange(0, 18);
    }


        public static void divisibleByThreeInRange(int beginning, int end) {

        
            for (int i = beginning; i <= end; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }

        }
    }
}