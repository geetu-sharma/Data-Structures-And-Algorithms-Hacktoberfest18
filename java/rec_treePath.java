import java.util.Scanner; 
public  class  rec_treePath
{
    public  static Scanner scan= new Scanner(System.in);
    public  static void main( String[] args )
    {
        
        System.out.println(" enter no. "); 
        int no = scan.nextInt() ;
        System.out.println(" PRINT TREE PATH - PRE-IN-POST  ");
        System.out.println(ptp(no));
        System.out.println(" above no. is final status of ans in end ");



    }
    public static int ptp(int n)
    {
        if(n==0 ||n==1)
        return n;
        
        int recans=0 ;

        System.out.println("PRE  "+n);
        recans+=ptp(n-1);

        System.out.println("IN   "+n);
        recans+=ptp(n-2);

        System.out.println("POST "+n);
       
        return recans+3; 



    }



}
