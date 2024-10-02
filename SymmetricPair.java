import java.util.HashMap;

public class SymmetricPair {

    public static void SP (int[][] arr) {
        HashMap<Integer, Integer> HM = HashMap();
        for (int i = 0; i < arr.length; i++){
            int first = arr[i][0];
            int second = arr[i][1];

            Integer val = HM.get(second);

            if (val == second) {
                System.out.println(second + " " + first);
            } else {
                HM.put(first,second);
            }
        }
    } 
    public static void main(String[] args) {
        int[][] matrix = { 
            {1,2},
            {2,1},
            {5,3},
            {4,0},
            {3,5} 
        };
        SP(matrix);
    }
}
