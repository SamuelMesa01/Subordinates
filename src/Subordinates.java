import java.util.*;

public class Subordinates {
    
    static int[] subordinates;
    static List<Integer>[] tree;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] boss = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            boss[i] = sc.nextInt();
        }
        List<Integer>[] tree = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            tree[i] = new ArrayList<>();
        }

        for (int i = 2; i <= n; i++) {
            tree[boss[i]].add(i);
        }
    }
    
    static void dfs(int code) {
        for (int child : tree[node]){
            dfs(child);
            subordinates[node] += 1 + subordinates[child];
        }
    }
    
}