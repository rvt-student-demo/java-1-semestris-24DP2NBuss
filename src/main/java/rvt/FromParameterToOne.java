package rvt;

public class FromParameterToOne {
    public static void main(String[] args) {
    printFromNumberToOne(5);
    
    }

        public static void printFromNumberToOne(int number) {

        while (true) {
            System.out.println(number);
            number = number - 1;
        if (number == 0) {
            break;
            }
        }
    }
}
