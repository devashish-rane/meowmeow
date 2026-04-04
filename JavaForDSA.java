import java.util.Arrays;
import java.util.List;

public class JavaForDSA{

    public static void main(){
        System.out.println("Enter the arena...");
        
        // define array
        // bad : must provide dimension
        // int[] a1 = new int[]; 
        
        int[] a2 = new int[10];
        
        int size = 10;
        
        int[] a3 = new int[size];
        
        int[] a4;
        a4 = new int[10];

        int[] a5 = new int[]{1,2,3};

        int[] a6;
        a6 = new int[]{1,2,3};

        int[] a7 = {1,2,3,4,4};

        String s = Arrays.toString(a7);
        System.out.println(s);

        arrayEater(new int[]{1,2,3,}); // pass aray as value to func

        int[][] dp1 = new int[10][]; // 1st dimansion is mandatory

        int[][] dp2 = new int[10][5]; 

        int[][] dp3 = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(dp3));
        // OR
        for (int[] row : dp3) {
            System.out.println(Arrays.toString(row));
        }

        // arr is not a class, length is not a method
        int dp3l = dp3.length;

        int[] as = {5,4,3,2,1,564,6,346};
        Arrays.sort(as, as.length - 3, as.length - 1); // sorts the array directly, doesn't return
        Arrays.sort(as); // sorts the array directly, doesn't return
        System.out.println(Arrays.toString(as));

        // Arrays.fill(as, 0); // just commented
        Arrays.fill(as, 0, 3, -1);
        System.out.println(Arrays.toString(as));

        int[] c1 = Arrays.copyOf(as, as.length);
        int[] c2 = Arrays.copyOfRange(as, 0, 3); // [l, r)
        // below shit idk how frequent is that
        // System.arraycopy(src, sPos, dst, dPos, len);

        boolean bb = Arrays.equals(c1, c2);
        boolean bb2 = Arrays.deepEquals(dp1, dp2);
        // Arrays.deepEquals(Object[] a, Object[] b) signature
        // Primitive arrays (int[], char[]) are NOT Object[]
        // int[][] IS Object[] (because each element is int[])
        
        String s = Arrays.toString(a);

        // Trap
        List<int[]> nope = Arrays.asList(a); // trap for primitive arrays
        // Correct 
        List<Integer> nope = Arrays.asList(1,23,3);

        int idx = Arrays.binarySearch(a, key);

        // Arrays.stream(a) returns intstream
        int sum = Arrays.stream(a).sum();











        




    }


    static void arrayEater(int[] arr){
        
    }
    
}