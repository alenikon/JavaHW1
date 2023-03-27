//Вычислить n-ое треугольного число (сумма чисел от 1 до n),
// n! (произведение чисел от 1 до n)

package Works;
import java.util.Scanner;

public class works1 {
    public static int sum() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число n: ");
        String n = scan.nextLine();
        int number = Integer.parseInt(n);
        int sum = 0;
        for (int i=1; i <= number; i++){
            sum += i;
        }
    return sum;
    }
    public static int Factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число N: ");
        String Nf = scan.nextLine();
        int NFactorial = Integer.parseInt(Nf);
        int fact = 1;
        for (int i=1; i < NFactorial +1; i++){
            fact *= i;
        }
    return fact;    
}
}