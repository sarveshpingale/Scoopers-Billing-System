/**
  This Project Is Created By Sarvesh Pingale.
  This is an ice cream parlor management system program
  */
import java.util.Scanner;
public class icecream
{
    Scanner sc=new Scanner(System.in);
    
    static int flag;
    public static void  main()throws InterruptedException
    {
        intro cc=new intro();
        menu ob=new menu();
        icecream bb= new icecream();
        
        ob.dec();
        cc.introd();

        Scanner sc=new Scanner(System.in);
        System.out.print("\f");
        System.out.print("Scoopers Pvt. Ltd.");
        
        bb.order();
    }

    public void order()
    {
        menu ob=new menu();
        icecream bb= new icecream();
        System.out.print("\f");
        System.out.print("Scoopers Pvt. Ltd.");
        System.out.println();
        System.out.println("Press '1' for Ice Creams ");
        System.out.println("Press '2' for Family Packs ");
        System.out.println("Press '3' for Milkshakes ");
        System.out.println("Press '4' for Waffles ");
        System.out.println("Press '5' for Kulfi ");
        System.out.println("Press '6' for Falooda ");
        System.out.println("Press '7' for Candies ");
        System.out.println("Press '8' for Brownies ");
        if (flag>0)
        System.out.println("Press '9' for bill");
        int ab=sc.nextInt();
        flag=1;
        switch(ab)
        {
            case 1:
            ob.ic();
            
            break;
            case 2:
            ob.fp();
            break;
            case 3:
            ob.sh();
            break;
            case 4:
            ob.wf();
            break;
            case 5:
            ob.kul();
            break;
            case 6:
            ob.fal();
            break;
            case 7:
            ob.can();
            break;
            case 8:
            ob.bro();
            break;
            case 9:ob.fin();
            break;
            default:
            System.out.println("Wrong Choice");
        }

    }
}