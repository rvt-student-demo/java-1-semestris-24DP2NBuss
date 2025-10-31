package rvt;


public class Statistics2 {
    public class Main {
        public static void main(String[] args) {
            Statistics1 Statistics = new Statistics1();
            Statistics.addNumber(3);
            Statistics.addNumber(5);
            Statistics.addNumber(1);
            Statistics.addNumber(2);
            System.out.println("Count: " + Statistics.getCount());
            System.out.println("Sum: " + Statistics.sum());
            System.out.println("Average: " + Statistics.average());
        }
    }
}
