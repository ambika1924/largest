public class LargestNumber{
    public static void main(String[] args)
    {
        //initializing numbers to compure
        int x=1000, y=990, z=2000;
        if(x>=y)
        {
            if(x>=z)
            System.out.println("The largest Number is: "+x);
            else
            System.out.println("The largest Number is: "+z);
        }
        else{
            if(y>=z)
            System.out.println("The largest Number is: "+y);
            else
            System.out.println("The largest Number is: "+z);
        }
    }
}