// input no=5
// power p=2
//5*5=25
import java.util.Scanner;
class PowerOf2 {
    public static void main(String[] args) {
        int n,p,result=1;
        System.out.println("Enter No. ");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        System.out.println("Enter Power ");
        p=r.nextInt();

        for(int i=1;i<=p;i++)
        {
            result=n*result;
        }
        System.out.println("result "+result);
    }
}