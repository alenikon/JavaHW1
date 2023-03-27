// Реализовать простой калькулятор Использовать сканнер:
// Scanner scanner = new Scanner(System.in);
// String enter = scanner.next(); int i = Integer.parseInt(enter);

package Works;
import java.util.Objects;
import java.util.Scanner;

public class works3 {
    public static String Result() {
        String[] Calculator = userInput();

        int a = Integer.parseInt(Calculator[0]);
        int b = Integer.parseInt(Calculator[1]);
        String oper = Calculator[2];
        int rezult = 0;
        if (Objects.equals(oper, "+")){rezult = a + b;}
        else if (Objects.equals(oper, "-")){ rezult = a - b;}
        else if (Objects.equals(oper, "/")){ rezult = a / b;}
        else if (Objects.equals(oper, "*")){ rezult = a * b;}    
        else {
        System.out.println("Повторите ввод данных");    
        }    
        return System.out.printf("%d %s %d = %d \n", a, oper, b, rezult).toString();
        // Scanner scan = new Scanner(System.in){
    }
    public static String[] userInput(){
        String[] InputArr = new String[3];
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число");
        String UserNum1 = scan.nextLine();
        System.out.println("Введите символ операции +, -, /, * ");
        String UserOperation = scan.nextLine();
        System.out.println("Введите второе число");
        String UserNum2 = scan.nextLine();
        InputArr[0] = UserNum1;
        InputArr[1] = UserNum2;
        InputArr[2] = UserOperation;
        return InputArr;
    }
}