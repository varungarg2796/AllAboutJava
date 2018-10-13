import java.util.Scanner;

class calculator
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("YOU HAVE FOLLOWING CHOICES : ");
        System.out.println("1. ADDITION");
        System.out.println("2. SUBTRACTION ");
        System.out.println("3. MULTIPLICATION ");
        System.out.println("4. DIVISION");
        System.out.println("ENTER YOUR CHOICE : ");
        int i=s.nextInt();
        if (i == 1 || i== 2 || i == 3 || i ==4 ){

            System.out.println("ENTER FIRST NUMBER ");
            int a=s.nextInt();

            System.out.println("ENTER SECOND NUMBER ");
            int b=s.nextInt();
            double result=0;//'result' will store the result of operation

            switch(i)
            {
                case 1:
                    result=a+b;
                    break;
                case 2:
                    result=a-b;
                    break;
                case 3:
                    result=a*b;
                    break;
                case 4:
                    if(b==0)//when denominator becomes zero
                    {
                        System.out.println("DIVISION NOT POSSIBLE");
                        break;
                    }
                    else
                        result=a/b;
            }
            System.out.println("RESULT = "+result);

        } else {

            System.out.println("YOU HAVE ENTERED A WRONG CHOICE");
        }


    }
}