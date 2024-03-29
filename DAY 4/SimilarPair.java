import java.util.*;

public class SimilarPair {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String a[]=new String[n];
        for(int i=0;i<n;i++){
            a[i]=sc.next();
        }
        System.out.println(countRemainingWords(a));
    }

    public static int countRemainingWords(String[] words) {
        Stack<String> stack = new Stack<>();
        for (String word : words) {
            if (!stack.isEmpty() && stack.peek().equals(word)) {
                stack.pop();
            } else {
                stack.push(word);
            }
        }
        return stack.size();
    }
}