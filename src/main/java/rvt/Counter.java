package rvt;

public class Counter {
    int value;
 
    public Counter(int startValue) {
        this.value = startValue;
    }

    public Counter() {
        this.value = 0;
    }
    public int value() {
        return this.value;
    }

    public void increase() {
        this.value = value + 1;
    }

    public void decrease() {
        this.value = value - 1;
    }

    public void increase(int increaseBy) {
        if (increaseBy > 0) {
            this.value = value + increaseBy;
        }
    }

    public void decrease(int decreaseBy) {
        if (decreaseBy > 0) {
            this.value = value - decreaseBy;
        }
    }
    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter(100);

        System.out.println(counter1.value());
        System.out.println(counter2.value());

        counter1.increase(10);
        counter2.decrease(20);
        System.out.println(counter1.value);
        System.out.println(counter2.value);

        counter1.decrease();
        counter2.increase();
        System.out.println(counter1.value);
        System.out.println(counter2.value);

        counter1.increase(-9);
        counter2.decrease(-81);
        System.out.println(counter1.value);
        System.out.println(counter2.value);

    }
}