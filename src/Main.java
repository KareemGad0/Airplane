import java .util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num =0 , counter=1,sum=0 ;
        while (counter<=5)
        {
            System.out.println("Enter your postive number"+counter);
            num= input.nextInt();
            if (num<0)
            {
                System.out.println("Negative numbers are not allowed");
            continue;
            }
            sum=sum+num;
            counter++;
        } //end while loop
        System.out.println("Sum =" + sum);
    }
}