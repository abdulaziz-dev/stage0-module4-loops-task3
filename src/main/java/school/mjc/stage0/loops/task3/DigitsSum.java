package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int sum = 0;
        String son = t+"";
        for (int i=0; i<son.length(); i++){
            sum += son.charAt(i)-'0';
        }
        System.out.println(sum);
    }
}
