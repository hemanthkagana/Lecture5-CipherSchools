
// Structure of a java program 

// PrimitiveDT class
public class PrimitiveDT{

    public static void main(String[] args){
        int x = 5;
        int y = 7;
        System.out.println("X is: " + x);
        System.out.println("Y is: " + y);

        byte b = 10;
        System.out.println("B is: " + b);
        
        byte b2 = (byte) 129;
        System.out.println("B2 is: " + b2);

        int i = b;
        System.out.println("I is: " + i);

        float f = (float) 3.5;
        float f2 = 5.5f;
        char ch = 'a';
        System.out.println(ch);
        int z = x+y; //x and y are operands, "=" is an operator

        int m = 5;
        int n = m++;
        System.out.println("M is : " + m + ", N is : " + n);
        

    }
}
