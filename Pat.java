import java.util.Scanner;

public class Pat{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
// Pattern printing in order
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println("");
        }

 System.out.println("");

//  pattern printing in reverse order
        for(int x=5;x>=1;x--){
            for(int y=1;y<=x;y++){
                System.out.print(y);
            }
             System.out.println("");
        }

    }
}