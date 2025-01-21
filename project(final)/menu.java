import java.util.Scanner;
public class menu
{
    Scanner sc=new Scanner(System.in);

    static int t1,t2,t3,t4,t5,t6,t7,t8;
    static String ss[]=new String[31];
    static String sfs[]=new String[31];
    static String sh[]=new String[14];
    static String swf[]=new String[9];
    static String skul[]=new String[11];
    static String sfal[]=new String[11];
    static String scan[]=new String[4];
    static String sbro[]=new String[5];
    static int ns[]=new int[31]; 
    static int nfp[]=new int[31];
    static int nsh[]=new int[31];
    static int nwf[]=new int[31];
    static int nkul[]=new int[31];
    static int nfal[]=new int[31];
    static int ncan[]=new int[31];
    static int nbro[]=new int [31];
    static int total;
    public void dec()
    {
        sfs[1]="Vanilla";
        sfs[2]="Kesar Pista";
        sfs[3]="Roasted Californian Almond";
        sfs[4]="Splish Splash";
        sfs[5]="Dutch Chocolate";
        sfs[6]="Butterscotch Ribbon";
        sfs[7]="Banana Caramel";
        sfs[8]="Belgian Bliss";
        sfs[9]="Roasted Coffee Creme";
        sfs[10]="Cotton Candy";
        sfs[11]="Red Velvet";
        sfs[12]="Fruit Overload";
        sfs[13]="Banana N'Strawberries";
        sfs[14]="Bavarian Chocolate";
        sfs[15]="Blueberry Cheesecake";
        sfs[16]="Chocochip Mousse Royale";
        sfs[17]="Chocolate Almond Praline";
        sfs[18]="Gold Medal Ribbon";
        sfs[19]="Honey Nut Crunch";
        sfs[20]="Hop Scotch Butterscotch";
        sfs[21]="Malted Chocolate Fudge";
        sfs[22]="Michigan Blues";
        sfs[23]="Mississippi Mud";
        sfs[24]="Pralins N'Cream";
        sfs[25]="Black Currant";
        sfs[26]="Litchi Gold";
        sfs[27]="Fresh Fruit Alphonso Mango";
        sfs[28]="Fresh Fruit Chickoo";
        sfs[29]="Fresh Pink Guava";
        sfs[30]="Real Fig";

        ss[1]="Vanilla";
        ss[2]="Kesar Pista";
        ss[3]="Roasted Californian Almond";
        ss[4]="Splish Splash";
        ss[5]="Dutch Chocolate";
        ss[6]="Butterscotch Ribbon";
        ss[7]="Banana Caramel";
        ss[8]="Belgian Bliss";
        ss[9]="Roasted Coffee Creme";
        ss[10]="Cotton Candy";
        ss[11]="Red Velvet";
        ss[12]="Fruit Overload";
        ss[13]="Banana N'Strawberries";
        ss[14]="Bavarian Chocolate";
        ss[15]="Blueberry Cheesecake";
        ss[16]="Chocochip Mousse Royale";
        ss[17]="Chocolate Almond Praline";
        ss[18]="Gold Medal Ribbon";
        ss[19]="Honey Nut Crunch";
        ss[20]="Hop Scotch Butterscotch";
        ss[21]="Malted Chocolate Fudge";
        ss[22]="Michigan Blues";
        ss[23]="Mississippi Mud";
        ss[24]="Pralins N'Cream";
        ss[25]="Black Currant";
        ss[26]="Litchi Gold";
        ss[27]="Fresh Fruit Alphonso Mango";
        ss[28]="Fresh Fruit Chickoo";
        ss[29]="Fresh Pink Guava";
        ss[30]="Real Fig";

        sh[1]="Cookies And Cream";
        sh[2]="Honey Crackle";
        sh[3]="Cheeky Coffee";
        sh[4]="Mango Berry Magic";
        sh[5]="Chocolate Chiller";
        sh[6]="Chocolate Burst";
        sh[7]="Chunky Chikoo";
        sh[8]="Kesar Pista Royale";
        sh[9]="Vanilla Crumble";
        sh[10]="Mango Madness";
        sh[11]="Crazy Chocotella";
        sh[12]="Almond";
        sh[13]="Mango Yogurt Smoothie";
        
        swf[1]="Classic Malted Begian Waffle";
        swf[2]="Banana Waffle";
        swf[3]="Red Velvet Waffle";
        swf[4]="Hazelnut Banana Waffle";
        swf[5]="Chocolate Nutella Waffle";
        swf[6]="Peanut Butter Waffle";
        swf[7]="Cookies and Cream Waffle";
        swf[8]="Fresh Mango Waffle";
        
        skul[1]="Kaju Pista Kulfi";
        skul[2]="Sitafal Kulfi";
        skul[3]="Sitafal Rabdi";
        skul[4]="Dry Fruit Kulfi";
        skul[5]="Chocolate Kulfi";
        skul[6]="Pan Kulfi";
        skul[7]="Kharvas";
        skul[8]="Mango Kulfi";
        skul[9]="Rabdi Wati";
        skul[10]="Rabdi Kulfi";
        
        sfal[1]="Royal Falooda";
        sfal[2]="Mix Ice Cream Falooda";
        sfal[3]="Kaju Falooda";
        sfal[4]="Malai Kulfi Falooda";
        sfal[5]="Kesar Kulfi Falooda";
        sfal[6]="Anjeer Falooda";
        sfal[7]="Dry Fruit Falooda";
        sfal[8]="Seasonal Falooda";
        sfal[9]="Shahi Special Falooda";
        sfal[10]="Kulfi Falooda";
        
        scan[1]="Mango Delight Candy Stick";
        scan[2]="Strawberry Punch Candy Stick";
        scan[3]="Belgian Chocolate Candy";
        
        sbro[1]="Vanilla Affair";
        sbro[2]="Chocolate Cheer";
        sbro[3]="Belgian Dream";
        sbro[4]="Bavarian Blast";
    }

    public void ic()
    {
        icecream ob= new icecream();
            
        menu bb=new menu();
        System.out.print("\f");
        System.out.println("Scoopers Pvt. Ltd.");
        System.out.println("Ice Creams                          Rs ");
        System.out.println("1.Vanilla                           59 ");
        System.out.println("2.Kesar Pista                       59 ");
        System.out.println("3.Roasted Californian Almond        59 ");
        System.out.println("4.Splish Splash                     59 ");
        System.out.println("5.Dutch Chocolate                   59 ");
        System.out.println("6.Butterscotch Ribbon               59 ");
        System.out.println("7.Banana Caramel                    59 ");
        System.out.println("8.Belgian Bliss                     59 ");
        System.out.println("9.Roasted Coffee Creme              59 ");
        System.out.println("10.Cotton Candy                     59 ");
        System.out.println("11.Red Velvet                       59 ");
        System.out.println("12.Fruit Overload                   59 ");
        System.out.println("13.Banana N'Strawberries            59 ");
        System.out.println("14.Bavarian Chocolate               59 ");
        System.out.println("15.Blueberry Cheesecake             59 ");
        System.out.println("16.Chocochip Mousse Royale          59 ");
        System.out.println("17.Chocolate Almond Praline         59 ");
        System.out.println("18.Gold Medal Ribbon                59 ");
        System.out.println("19.Honey Nut Crunch                 59 ");
        System.out.println("20.Hop Scotch Butterscotch          59 ");
        System.out.println("21.Malted Chocolate Fudge           59 ");
        System.out.println("22.Michigan Blues                   59 "); 
        System.out.println("23.Mississippi Mud                  59 ");
        System.out.println("24.Pralins N'Cream                  59 ");
        System.out.println("25.Black Currant                    59 ");
        System.out.println("26.Litchi Gold                      59 ");
        System.out.println("27.Fresh Fruit Alphonso Mango       59 ");
        System.out.println("28.Fresh Fruit Chickoo              59 ");
        System.out.println("29.Fresh Pink Guava                 59 ");
        System.out.println("30.Real Fig                         59 ");
        System.out.println("Type the number of products to buy");
        t1=sc.nextInt();
        System.out.println("To buy the product, type thier serial numbers");
        int a[]=new int[t1];
        int flg1=1;
        
        for(int i=0;i<t1;i++)
        {
            a[i]=sc.nextInt();
            ns[i+1]=a[i];
        }
        
        
        System.out.println("If you need anything more, press '0'");
        System.out.println("Press '9' for bill");
        int z=sc.nextInt();
        switch(z)
        {
            case 0:
            ob.order();
            break;
            case 9:
            bb.fin();
            break;
            default:
            System.out.println("Wrong Choice");
        }
    }

    public void fp()
    {
        icecream ob= new icecream();
            
        menu bb=new menu();
        System.out.print("\f");
        System.out.println("Scoopers Pvt. Ltd.");
        System.out.println("Family Packs                     Rs. ");
        System.out.println("1.Vanilla                        259 ");
        System.out.println("2.Kesar Pista                    259 ");
        System.out.println("3.Roasted Californian Almond     259 ");
        System.out.println("4.Splish Splash                  259 ");
        System.out.println("5.Dutch Chocolate                259 ");
        System.out.println("6.Butterscotch Ribbon            259 ");
        System.out.println("7.Banana Caramel                 259 ");
        System.out.println("8.Belgian Bliss                  259 ");
        System.out.println("9.Roasted Coffee Creme           259 ");
        System.out.println("10.Cotton Candy                  259 ");
        System.out.println("11.Red Velvet                    259 ");
        System.out.println("12.Fruit Overload                259 ");
        System.out.println("13.Banana N'Strawberries         259 ");
        System.out.println("14.Bavarian Chocolate            259 ");
        System.out.println("15.Blueberry Cheesecake          259 ");
        System.out.println("16.Chocochip Mousse Royale       259 ");
        System.out.println("17.Chocolate Almond Praline      259 ");
        System.out.println("18.Gold Medal Ribbon             259 ");
        System.out.println("19.Honey Nut Crunch              259 ");
        System.out.println("20.Hop Scotch Butterscotch       259 ");
        System.out.println("21.Malted Chocolate Fudge        259 ");
        System.out.println("22.Michigan Blues                259 ");
        System.out.println("23.Mississippi Mud               259 ");
        System.out.println("24.Pralins N'Cream               259 ");
        System.out.println("25.Black Currant                 259 ");
        System.out.println("26.Litchi Gold                   259 ");
        System.out.println("27.Fresh Fruit Alphonso Mango    259 ");
        System.out.println("28.Fresh Fruit Chickoo           259 ");
        System.out.println("29.Fresh Pink Guava              259 ");
        System.out.println("30.Real Fig                      259 ");
        System.out.println("Type the number of products to buy");
        t2=sc.nextInt();

        System.out.println("To buy the product, type thier serial numbers");
        int a0[]=new int[t2];
        int flag2=1;
        
        for(int i=0;i<t2;i++)
        {
            a0[i]=sc.nextInt();
            nfp[i+1]=a0[i];
        }
       
        
        System.out.println("If you need anything more, press '0'");
        System.out.println("Press '9' for bill");
        int z=sc.nextInt();
        switch(z)
        {
            case 0:
            ob.order();
            break;
            case 9:
            bb.fin();
            break;
            default:
            System.out.println("Wrong Choice");
        }
    }

    public void sh()
    {
        icecream ob= new icecream();
            
        menu bb=new menu();
        System.out.print("\f");
        System.out.println("Scoopers Pvt. Ltd.");
        System.out.println("Shakes                         Rs.");
        System.out.println("1.Cookies And Cream            199 ");   
        System.out.println("2.Honey Crackle                199 ");
        System.out.println("3.Cheeky Coffee                199 ");
        System.out.println("4.Mango Berry Magic            199 ");
        System.out.println("5.Chocolate Chiller            199 ");
        System.out.println("6.Chocolate Burst              199 ");
        System.out.println("7.Chunky Chikoo                199 ");
        System.out.println("8.Kesar Pista Royale           199 ");
        System.out.println("9.Vanilla Crumble              199 ");
        System.out.println("10.Mango Madness               199 ");
        System.out.println("11.Crazy Chocotella            199 ");
        System.out.println("12.Almond                      199 ");
        System.out.println("13.Mango Yogurt Smoothie       199 ");
        System.out.println("Type the number of products to buy");
        t3=sc.nextInt();

        System.out.println("To buy the product, type thier serial numbers");
        int a3[]=new int[t3];

        int flag3=1;
        
        for(int i=0;i<t3;i++)
        {
            a3[i]=sc.nextInt();
            nsh[i+1]=a3[i];
        }
        
        System.out.println("If you need anything more, press '0'");
        System.out.println("Press '9' for bill");
        int z=sc.nextInt();
        switch(z)
        {
            case 0:
            ob.order();
            break;
            case 9:
            bb.fin();
            break;
            default:
            System.out.println("Wrong Choice");
        }

    }

    public void wf()
    {
        icecream ob= new icecream();
            
        menu bb=new menu();
        System.out.print("\f");
        System.out.println("Scoopers Pvt. Ltd.");
        System.out.println("Waffles                         Rs.");
        System.out.println("1.Classic Malted Belgian Waffle 159 ");   
        System.out.println("2.Banana waffle                 159 ");
        System.out.println("3.Red Velvet Waffle             159 ");
        System.out.println("4.Hazelnut Banana Waffle        159 ");
        System.out.println("5.Chocolate Nutella Waffle      159 ");
        System.out.println("6.Peanut Butter Waffle          159 ");
        System.out.println("7.Cookies and Cream Waffle      159 ");
        System.out.println("8.Fresh Mango Waffle            159 ");
        
        System.out.println("Type the number of products to buy");
        t4=sc.nextInt();

        System.out.println("To buy the product, type thier serial numbers");
        int a4[]=new int[t4];

        for(int i=0;i<t4;i++)
        {
            a4[i]=sc.nextInt();
            nwf[i+1]=a4[i];
        }
        
        System.out.println("If you need anything more, press '0'");
        System.out.println("Press '9' for bill");
        int z=sc.nextInt();
        switch(z)
        {
            case 0:
            ob.order();
            break;
            case 9:
            bb.fin();
            break;
            default:
            System.out.println("Wrong Choice");
        }

    }
    
    public void kul()
    {
        icecream ob= new icecream();
            
        menu bb=new menu();
        System.out.print("\f");
        System.out.println("Scoopers Pvt. Ltd.");
        System.out.println("Kulfis                           Rs.");
        System.out.println("1.Kaju Pista Kulfi               40 ");   
        System.out.println("2.Sitafal Kulfi                  40 ");
        System.out.println("3.Sitafal Rabdi                  40 ");
        System.out.println("4.Dry Fruit Rabdi                40 ");
        System.out.println("5.Chocolate Kulfi                40 ");
        System.out.println("6.Pan Kulfi                      40 ");
        System.out.println("7.Kharvas                        40 ");
        System.out.println("8.Mango Kulfi                    40 ");
        System.out.println("9.Rabdi Wati                     40 ");
        System.out.println("10.Rabdi Kulfi                   40 ");
        
        System.out.println("Type the number of products to buy");
        t5=sc.nextInt();

        System.out.println("To buy the product, type thier serial numbers");
        int a5[]=new int[t5];

        for(int i=0;i<t5;i++)
        {
            a5[i]=sc.nextInt();
            nkul[i+1]=a5[i];
        }
        
        System.out.println("If you need anything more, press '0'");
        System.out.println("Press '9' for bill");
        int z=sc.nextInt();
        switch(z)
        {
            case 0:
            ob.order();
            break;
            case 9:
            bb.fin();
            break;
            default:
            System.out.println("Wrong Choice");
        }

    }
   
     public void fal()
    {
        icecream ob= new icecream();
            
        menu bb=new menu();
        System.out.print("\f");
        System.out.println("Scoopers Pvt. Ltd.");
        System.out.println("Faloodas                           Rs.");
        System.out.println("1.Royal Falooda                    99 ");   
        System.out.println("2.Mix Ice Cream Falooda            99 ");
        System.out.println("3.Kaju Falooda                     99 ");
        System.out.println("4.Malai Kulfi Falooda              99 ");
        System.out.println("5.Kesar Kulfi Falooda              99 ");
        System.out.println("6.Anjeer Falooda                   99 ");
        System.out.println("7.Dry Fruit Falooda                99 ");
        System.out.println("8.Seasonal Falooda                 99 ");
        System.out.println("9.Shahi Durbar Special Falooda     99 ");
        System.out.println("10.Kulfi Falooda                   99 ");
        
        System.out.println("Type the number of products to buy");
        t6=sc.nextInt();

        System.out.println("To buy the product, type thier serial numbers");
        int a6[]=new int[t6];

        for(int i=0;i<t6;i++)
        {
            a6[i]=sc.nextInt();
            nfal[i+1]=a6[i];
        }
        
        System.out.println("If you need anything more, press '0'");
        System.out.println("Press '9' for bill");
        int z=sc.nextInt();
        switch(z)
        {
            case 0:
            ob.order();
            break;
            case 9:
            bb.fin();
            break;
            default:
            System.out.println("Wrong Choice");
        }

    }
    public void can()
    {
        icecream ob= new icecream();
            
        menu bb=new menu();
        System.out.print("\f");
        System.out.println("Scoopers Pvt. Ltd.");
        System.out.println("Candies                            Rs.");
        System.out.println("1.Mango Delight Candy Stick        139");   
        System.out.println("2.Strawberry Punch Candy Stick     139");
        System.out.println("3.Belgian Chocolate Candy          139");
        System.out.println("Type the number of products to buy");
        t7=sc.nextInt();

        System.out.println("To buy the product, type thier serial numbers");
        int a7[]=new int[t7];

        for(int i=0;i<t7;i++)
        {
            a7[i]=sc.nextInt();
            ncan[i+1]=a7[i];
        }
        
        System.out.println("If you need anything more, press '0'");
        System.out.println("Press '9' for bill");
        int z=sc.nextInt();
        switch(z)
        {
            case 0:
            ob.order();
            break;
            case 9:
            bb.fin();
            break;
            default:
            System.out.println("Wrong Choice");
        }

    }
    public void bro()
    {
        icecream ob= new icecream();
            
        menu bb=new menu();
        System.out.print("\f");
        System.out.println("Scoopers Pvt. Ltd.");
        System.out.println("Brownies                           Rs.");
        System.out.println("1.Vanilla Affair                   189");   
        System.out.println("2.Chocolate Cheer                  189");
        System.out.println("3.Belgian Dream                    189");
        System.out.println("4.Bavarian Blast                   189");
        
        
        System.out.println("Type the number of products to buy");
        t8=sc.nextInt();

        System.out.println("To buy the product, type thier serial numbers");
        int a8[]=new int[t8];

        for(int i=0;i<t8;i++)
        {
            a8[i]=sc.nextInt();
            nbro[i+1]=a8[i];
        }
        
        System.out.println("If you need anything more, press '0'");
        System.out.println("Press '9' for bill");
        int z=sc.nextInt();
        switch(z)
        {
            case 0:
            ob.order();
            break;
            case 9:
            bb.fin();
            break;
            default:
            System.out.println("Wrong Choice");
        }
    }
    public void fin()
    {

        System.out.print("\f");
        System.out.println("SCOOPERS");
        System.out.println("SHOP NO. 1&2, COMMERCIAL COMPLEX,");
        System.out.println("2ND STREET, COLLEGE ROAD, NASHIK");
        System.out.println("CALL FOR HOME DELIVERY");
        System.out.println("MOBILE NO.:5542344322");
        System.out.println();
        System.out.println("GSTIN:25HDBCB67HDBD");
        System.out.println("TAX INVOICE ");
        
        System.out.println();
        System.out.println("----------------------------------------------------------");
        System.out.println("Sr No. ITEMS                         QTY    RATE   TOTAL");
        System.out.println("----------------------------------------------------------");
        int num=1;
        if(t1>0)
            for (int i=1;i<=t1;i++)
            {

                int d=ns[i];
                System.out.print(num+".     ");
                num=num+1;
                System.out.print(ss[d]);
                for(int j=0;j<30-ss[d].length();j++)
                    System.out.print(" ");
                System.out.print("1      ");
                System.out.print(" 59.0");
                System.out.print("    59.0");
                System.out.println();
            }
        if(t2>0)
            for (int i=1;i<=t2;i++)
            {

                int d=nfp[i];
                System.out.print(num+".     ");
                num=num+1;
                System.out.print(sfs[d]);
                for(int j=0;j<30-sfs[d].length();j++)
                    System.out.print(" ");
                System.out.print("1      ");
                System.out.print("259.0");
                System.out.print("   259.0");
                System.out.println();
            }
        if(t3>0)
            for (int i=1;i<=t3;i++)
            {

                int d=nsh[i];
                System.out.print(num+".     ");
                num=num+1;
                System.out.print(sh[d]);
                for(int j=0;j<30-sh[d].length();j++)
                    System.out.print(" ");
                System.out.print("1      ");
                System.out.print("199.0");
                System.out.print("   199.0");
                System.out.println();
            }
            if(t4>0)
            for (int i=1;i<=t4;i++)
            {

                int d=nwf[i];
                System.out.print(num+".     ");
                num=num+1;
                System.out.print(swf[d]);
                for(int j=0;j<30-swf[d].length();j++)
                    System.out.print(" ");
                System.out.print("1      ");
                System.out.print("159.0");
                System.out.print("   159.0");
                System.out.println();
            }
        if(t5>0)
            for (int i=1;i<=t5;i++)
            {

                int d=nkul[i];
                System.out.print(num+".     ");
                num=num+1;
                System.out.print(skul[d]);
                for(int j=0;j<30-skul[d].length();j++)
                    System.out.print(" ");
                System.out.print("1       ");
                System.out.print("40.0");
                System.out.print("    40.0");
                System.out.println();
            }
        if(t6>0)
            for (int i=1;i<=t6;i++)
            {

                int d=nfal[i];
                System.out.print(num+".     ");
                num=num+1;
                System.out.print(sfal[d]);
                for(int j=0;j<30-sfal[d].length();j++)
                    System.out.print(" ");
                System.out.print("1       ");
                System.out.print("99.0");
                System.out.print("    99.0");
                System.out.println();
            }
            if(t7>0)
            for (int i=1;i<=t7;i++)
            {

                int d=ncan[i];
                System.out.print(num+".     ");
                num=num+1;
                System.out.print(scan[d]);
                for(int j=0;j<30-scan[d].length();j++)
                    System.out.print(" ");
                System.out.print("1      ");
                System.out.print("139.0");
                System.out.print("   139.0");
                System.out.println();
            }
        if(t8>0)
            for (int i=1;i<=t8;i++)
            {

                int d=nbro[i];
                System.out.print(num+".     ");
                num=num+1;
                System.out.print(sbro[d]);
                for(int j=0;j<30-sbro[d].length();j++)
                    System.out.print(" ");
                System.out.print("1      ");
                System.out.print("189.0");
                System.out.print("   189.0");
                System.out.println();
            }
        total=t1*59+t2*259+t3*199+t4*159+t5*40+t6*99+t7*139+t8*189;
        System.out.println("-----------------------------------------------------------");
        System.out.println("Total:                                              "+total+".0");
        System.out.println("-----------------------------------------------------------");
        System.out.println("Declaration!");
        System.out.println("We declare that this invoice shows the ");
        System.out.println("actual price of the goods described and");
        System.out.println("that all particulars are true and correct.");
        System.out.println("Terms: *No Refund");
        System.out.println("       *Exchange only on sealed family packs, candies and kulfies");
        System.out.println("       *Exchange within 7 days");
        System.out.println("       *No exchange on Saturday and Sunday");
        System.out.println("       *No exchange without Barcode and Invoice ");
        System.out.println("Thank You Visit Again!");
    }
}