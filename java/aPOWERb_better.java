import java.util.Scanner ;  //done
{   public static Scanner scan=new Scanner(System.in) ;
    public static void main(String args[])
    {
        System.out.println(" enter  a and b "); 
        int a = scan.nextInt() ;
        int b =scan.nextInt() ;
        System.out.println( "a= " +a +", b= " + b +" ,a raised to power b = " + power_log(a,b));
    }
    public static int power_log(int a,int b)
    {
        //base case 
        if(b==0)
        return 1 ; 
     
        int recans=power_log(a,b/2); //subproblem of similar nature 
        
        recans*=recans;   // if(b%2==0 ), if b is even - this persists

        if(b%2!=0)        //if b is odd then  
        recans*=a;
        

        return recans;
    }

}
