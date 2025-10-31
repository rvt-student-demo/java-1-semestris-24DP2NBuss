package rvt;

public class Statistics1 {
    private int count;
    private int sum;
    protected double average;

    public Statistics1() {
        this.count = 0;
        this.sum = 0;
        this.average = 0;
    }

    public void addNumber(int number) {
        count = count + 1;
        sum = sum + number;
        average = sum / count;
    }

    public int getCount() {
        return count;
    }

    public int sum() {
        return sum;
    }

    public double average() {
        return average;
    }
}


