import java.util.*;

public class FirstUniqueCharacter {
    public static int firstUniqChar(String s) {
        HashMap<Character,Integer>m=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            m.put(c,m.getOrDefault(c,0)+1);
        }
        for(int i=0;i<s.length();i++){
            if(m.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(firstUniqChar(s));
    }
}
