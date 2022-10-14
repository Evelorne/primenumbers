import java.util.Scanner;


public class reverse {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        n=sc.nextInt();

        for(int i=0; i<n; i++){

            for(int k=0; k<i; k++){
                System.out.print(" ");
            }for(int j=0; j<(2*n)-1-(2*i); j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
