import java.util.*;

public class Subordinates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] boss = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            boss[i] = sc.nextInt();
        }
    }
}