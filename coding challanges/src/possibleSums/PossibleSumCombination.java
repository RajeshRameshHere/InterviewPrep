package possibleSums;

import java.util.*;

public class PossibleSumCombination {
    
    public static int sumCombination(int n, List<Integer> a) {
        int l = a.size();
        List<String> total = new ArrayList<>();
        
        for (int i = 0; i < l; i++) {
            for (int j = 0 ; j < l; j++) {
                if (a.get(i) + a.get(j) == n) {
                    String pair = a.get(i) + "," + a.get(j);
                    System.out.println(pair);                   
                        total.add(pair);
                    
                }
            }
        }
        
        return total.size();
    }
    
    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(1, 2, 3, 4, 5);
        int num = 4;
        int sumCombination = sumCombination(num, a);
        System.out.println(sumCombination);
    }
}
