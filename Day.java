import java.util.*;
public class Day 
{
    public static void main(String []args)
    {
      int d,m,y,q,r,sum;//d for date,m for month,y for year,q for quotient and r for reminder
      int centuryCode=0,monthCode=0,daycode=0;
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter the date: ");
        d=sc.nextInt();
        System.out.println("Enter the month: ");
        m=sc.nextInt();
        System.out.println("Enter the year: ");
        y=sc.nextInt();
        //century chart
         if((1400<=y)&&(y<=1499))
        {
           centuryCode=2;
        }
         else if((1500<=y)&&(y<=1599))
        {
           centuryCode=0;
        }
         else if((1600<=y)&&(y<=1699))
        {
           centuryCode=6;
        }
         else if((1700<=y)&&(y<=1799))
        {
           centuryCode=4;
        }
         else if((1800<=y)&&(y<=1899))
        {
           centuryCode=2;
        }
         else if((1900<=y)&&(y<=1999))
        {
           centuryCode=0;
        }
         else if((2000<=y)&&(y<=2099))
        {
           centuryCode=6;
        }
         else if((2100<=y)&&(y<=2199))
        {
           centuryCode=4;
        }
         else if((2200<=y)&&(y<=2299))
        {
           centuryCode=2;
        }
         else if((2300<=y)&&(y<=2399))
        {
           centuryCode=0;
        }
        // month code
        switch(m)
        {
          case 1:
            monthCode=0;
            break;
          case 2:
            monthCode=3;
            break;
          case 3:
            monthCode=3;
            break;
          case 4:
            monthCode=6;
            break;    
          case 5:
            monthCode=1;
            break;
          case 6:
            monthCode=4;
            break;
          case 7:
            monthCode=6;
            break;
          case 8:
            monthCode=2;
            break;
          case 9:
            monthCode=5;
            break;
          case 10:
            monthCode=0;
            break;
          case 11:
            monthCode=3;
            break;
          case 12:
            monthCode=5;
            break;
          default:
           System.out.println("Enter a valid month");
          break;
        }
        q=(y%100)/4;
        sum=d+monthCode+centuryCode+(y%100)+q;
        r=sum%7;
      //leap year case 
      if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0))
      {
        r=r-1;
      }
      //daycode
      switch (r)
       {
        case 0:
          System.out.println("Sunday");
          break;
        case 1:
          System.out.println("Monday");
          break;
        case 2:
          System.out.println("Tuesday");
          break;
        case 3:
          System.out.println("Wednesday");
          break;
        case 4:
          System.out.println("Thursday");
          break;
        case 5:
          System.out.println("Friday");
          break;
        case 6:
          System.out.println("Saturday");
          break;
      }


    }
    
}
