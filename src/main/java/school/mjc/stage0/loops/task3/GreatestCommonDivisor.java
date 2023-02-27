package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int temp;
        while (second != 0) {
            temp = second;
            second = first % second;
            first = temp;
        }
        System.out.println(first);
    }
}
