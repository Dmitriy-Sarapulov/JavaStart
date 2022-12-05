// public class program {
//     // место начала программы, метод main
//     static public void main(String[] args){

//     }
// }
// это та самая минимальная программа.
// НО есть сниппеты.
/**
 * program
 */
// public class program { // называть класс как файл
//     public static void main(String[] args) {
//         System.out.println("bye world"); // sysout - System.out.println
//     }
//     // так же можно написать java program.java для запуска программы.
// }
/** многострочные коментарии */ 

// строки
// никогда не ясно ее собедрживмое. 

// дополнительные возможности по работе с классом, мы можем получить чере з обертки:
// то есть int = Integer
// char = Character
// у остальных типов данных обертки называются так же, но пишутся с большой буквы.
// пример (Integer.MAX_VALUE)

// массивы
//  int[] arr = new int[10]; - объявление массива
// arr = new int[] {1, 2, 4};
// многомерные массивы int[] arr[] = new int[3][5]
// 


// Работа с файлами.

// добавит библиотеки
// import java.io.FileWriter;
// import java.io.IOException;

// public class program {
//     public static void main(String[] args) {
//         try (FileWriter fw = new FileWriter("file.txt", false)) { // Конструкция для обработки ошибок
//             fw.write("line 1"); 
//             fw.append('\n');
//             fw.append('2');
//             fw.append('\n');
//             fw.write("line 3");
//             fw.flush();
//         } catch (IOException ex) {
//             System.out.println(ex.getMessage());
//         }
//     }

// }