// import java.io.FileWriter;
import java.util.Scanner;


// Java: знакомство и как пользоваться базовым API
public class lesson2 {
    public static Scanner iScanner = new Scanner(System.in);
    public static void main(String[] args) {
        // System.out.println("Введите число: ");
        // int N = iScanner.nextInt();
        // String c1 = "Oleg";
        // String c2 = "Vasya";
        // String res = "";
        // for (int i = 0; i < N; i++)

        //     if (i % 2 == 0) {
        //         res = res + c1;
        //     } else {
        //         res += c2;}
        // System.out.println(res);
        //     iScanner.close();
        // String name = "aaaabbbcddad";
        // System.out.println(CreateStr(name));
        String name = iScanner.nextLine();
        System.out.println(isPalindrome(name));
        iScanner.close();
        // String s = "text";
        
        
    }
        
    
                    // Почитать про тернарный оператор. 
    // public static String CreateStr(String name) {
    //     String res = "";
    //     for (int i = 0; i < name.length(); i++) {
    //         if(res.indexOf(name.charAt(i)) == -1) res +=name.charAt(i);
    //     }
    //     return res;
    // }
//     Напишите метод, который принимает на вход строку (StringBulder) и определяет является ли строка 
// палиндромом (возвращает boolean значение).
// equals и StringBulder для revers
    public static boolean isPalindrome(String text) {
        text = text.replaceAll("\\W","");//удаляем все ненужное
        StringBuilder strBuilder = new StringBuilder(text);
        strBuilder.reverse(); //переворачиваем строку
        String revText = strBuilder.toString();//присваиваем перевернутую строку
        
        return text.equalsIgnoreCase(revText) ;
        
    }
    // Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод, 
    // который запишет эту строку в простой текстовый файл, обработайте исключения.
    
}

    
