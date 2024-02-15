import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner tgb = new Scanner(System.in);
        double konto = tgb.nextInt();

        System.out.println("    Saldo    ||    år");
        System.out.println("--------------------------");
        for (int i = 1; i < 13 ; i++)	{

            konto=konto*1.12;
            System.out.format("%8.2f kr  ||  %3d år\n",konto,i);
        }



    }


}

}