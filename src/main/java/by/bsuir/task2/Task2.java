package by.bsuir.task2;

public class Task2 {
    static final int yUp = 5;
    static final int yDown = -3;
    static final int xUp = 4;
    static final int xDown = 6;
    public static boolean isBelongArea(int x, int y) {
        boolean isUpperX = ((y < 0) && (y >= yDown)) && (Math.abs(x) <= xDown);
        boolean isUnderX = ((y >= 0) && (y <= yUp)) && (Math.abs(x) <= xUp);

        return isUpperX || isUnderX;
    }
}
