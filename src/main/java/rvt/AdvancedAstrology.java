package rvt;


public class AdvancedAstrology {
    public static void main(String[] args) {
        ChristmasTree(10);
}

    public static void PrintStars(int number) {

        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void PrintSpaces(int number) {

        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void PrintTriangle(int size) {
        
        for (int i = 1; i <= size; i++) {
            PrintSpaces(size - i);
            PrintStars(i);
        }
    }

    public static void ChristmasTree(int height) {
        
        for (int i = 1; i <= height; i++) {
            PrintSpaces(height - i);
            PrintStars(2 * i - 1);
        }
        PrintSpaces(height - 2);
        PrintStars(3);
        PrintSpaces(height - 2);
        PrintStars(3);
    }
}
