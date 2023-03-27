// Вывести все простые числа от 1 до 1000

// Простые числа - числа которые деляться только на 1 и на само себя без остатка(кроме 1).

package Works;

public class works2 {
    public static String Arr(){
        String Nums = "2, 3, 5, 7, ";
        for (int i = 8; i < 51; i++) {
            if (IsSimple(i) != 0) {
                Nums += i + ", ";
            }
        }
        return Nums; 
    }
    public static int IsSimple(int m){
        if (m % 2 ==0 || m % 3 ==0 || m % 5 ==0 || m % 7 ==0){
            return 0;
        }
        else {
            return m; }
    }
}
