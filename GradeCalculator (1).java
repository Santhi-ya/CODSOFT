import java.util.Scanner;
class GradeCalculator
{
    public static void main (String[] args)
    {
        int mark[]= new int[10];
        int i;
        float total=0,avg;
        Scanner s = new Scanner(System.in);
        for(i=1;i<6;i++)
        {
            System.out.println("Enter the mark for subject "+i+":");
            mark[i]=s.nextInt();
            total=total+mark[i];
        }
        avg=total/5;
        if(avg>90)
        {
            System.out.println("Grade:O");
        }
        else if(avg>80 && avg<91)
        {
            System.out.println("Grade:A+");
        }
        else if(avg>70 && avg<81)
        {
            System.out.println("Grade:A");
        }
        else if( avg>60 && avg<71)
        {
            System.out.println("Grade:B+");
        }
        else if(avg>50 && avg<61)
        {
            System.out.println("Grade:B");
        }
        else if(avg>40 && avg<51)
        {
            System.out.println("Grade:C");
        }
        else
        {
        System.out.println("FAIL");
        }
    }
}