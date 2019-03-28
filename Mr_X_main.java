import java.util.Scanner;

public class Mr_X {
    int n;
    static int a[] = new int[100];
    //create two objects of Mr_Y and Mr_Z
    Mr_Y Y = new Mr_Y();
    Mr_Z Z = new Mr_Z();
    int Mr_Y_ret, Mr_Z_ret;

    public void generate_sequence(int n) {
        Mr_Y_ret = (int) Y.take(n / 2.0);
        Mr_Z_ret = (int) Z.take(n / 2.0);

        if (Mr_Y_ret == Mr_Z_ret) {
            a[n] = a[n / 2];
        } else {
            a[n] = a[Mr_Y_ret] + a[Mr_Z_ret];
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many stern sequence required : ");
        int n=sc.nextInt();
        if(n>2){
            Mr_X x = new Mr_X();
            a[1] = 1;
            a[2] = 1;
            for (int i = 3; i <=n; i++) {
                x.generate_sequence(i);
            }
            for (int i = 1; i <n; i++) {
                System.out.print(a[i]+" ");
            }
            System.out.print(a[n]);
        }
        else if(n==1)
            System.out.print("1");
        else if(n==2)
            System.out.print("1 1");
        else
            System.out.println("Invalid n");;
    }
}
