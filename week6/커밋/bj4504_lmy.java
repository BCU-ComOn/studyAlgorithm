import java.util.Scanner;

public class bj4504_lmy {
    public static void main(String args[]) throws Exception {
        Scanner in = new Scanner(System.in);
        int input = Integer.parseInt(in.nextLine().trim());
        
        while(true) {
            int data = Integer.parseInt(in.nextLine().trim());
            
            if(data == 0) break;
            
            if(data % input == 0) {
                System.out.println(data + " is a multiple of " + input + ".");
            } else {
                System.out.println(data + " is NOT a multiple of " + input + ".");
            }
        }
        
        
        in.close();
    }
}