import java.util.Scanner; 
public  class  rec_inc_dec
{
    public  static Scanner scan= new Scanner(System.in);
    public  static void main( String[] args )
    {
        
        System.out.println(" enter ll and ul "); 
        int ll = scan.nextInt() ;
        int ul =scan.nextInt() ;
        inc_dec(ll,ul);

    }
    public static void inc_dec(int ll,int ul ) // ll= lower limit and ul= upper limit 
    {   if(ll==ul)  
        {
            System.out.println(ll);
             return ;
        }
        System.out.println(ll);
        inc_dec(ll+1 , ul);
        System.out.println(ll);
        
    }
}
