import java.util.Scanner;

public class Prime{
    public static void main(String[] args){
        int s1,s2, flag=0,i,j;
        Scanner S=new Scanner(System.in);
        System.out.println("Enter the lower limit:");
        s1=S.nextInt();
        System.out.println("Enter the upper limit:");
        s2=S.nextInt();
        System.out.println("The Prime Number in between the entered limits are:");
        for(i=s1; i<=s2; i++)
        {
            for(j=2; j<i; j++)
            {
                if(i%j==0)
                {
                    flag=0;
                    break;
                }
                else
                {
                    flag=1;
                }
            }
            if(flag == 1)
            {
                System.out.println(i);
            }
        }
    }
}