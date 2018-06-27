/*
https://practiceit.cs.washington.edu/problem/view/bjp4/chapter3/s14-parameterMysteryReturn
*/

public class MysteryReturn {
    
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int z = 3;
        
        z = mystery(x, z, y);                           // Statement 1
        System.out.println(x + " " + y + " " + z);      // Statement 2
        x = mystery(z, z, x);                           // Statement 3
        System.out.println(x + " " + y + " " + z);      // Statement 4
        y = mystery(y, y, z);                           // Statement 5
        System.out.println(x + " " + y + " " + z);      // Statement 6
    }

    private static int mystery(int z, int x, int y) {
        z--;
        x = 2 * y + z;
        y = x - 1;
        System.out.println(y + " " + z);
        return x;
    }
}
