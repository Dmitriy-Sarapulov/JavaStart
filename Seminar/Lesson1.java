// import java.sql.Time;
// import java.time.LocalDateTime;
// import java.time.LocalTime;
// import java.util.Random;
// import java.util.Scanner;

// Java: знакомство и как пользоваться базовым API
public class Lesson1 {
//     public static void main(String[] args) {
//         // LocalDateTime now = LocalDateTime.now();
//         Scanner iScanner = new Scanner(System.in);
//         String name = iScanner.nextLine(); // next - ввод до пробела. nextLine - вводит всю строку.
//         // System.out.println(now + " " + name); 
//         // System.out.println(LocalDateTime.now()); // LocalDateTime.now - вывод реальной даты и времени
//         Print(name);
//         // print1("Alex");
//         iScanner.close();
    // }
    // public static void Print(String name) {
    //     LocalTime now = LocalTime.now();
    //     if(now.isAfter(LocalTime.of(5,0)) && now.isBefore(LocalTime.of(11,59)))
    //     //Проверка время до и время после.
    //         System.out.println("Доброе утро, " + name);
    //     else if(now.isAfter(LocalTime.of(12, 0)) && now.isBefore(LocalTime.of(23,00)))
    //         System.out.println("Добрый вечер, " + name);   
    // }
    // public static void print1(String name1) {
    //     LocalTime now1 = LocalTime.now();
    //     if(now1.isAfter(LocalTime.of(12,0)) && now1.isBefore(LocalTime.of(23,0)))
    //         System.out.println("Добрый день, " + name1);
    // }

    // String encoding = System.getProperty("console.encoding", "cp866") - поддержка рускоязычного ввода
    // Массивы, в JAVA

// }



public static void main(String[] args) {
int[] array = new int[10];
fillMas(array);
printMas(array);
findMaxCount(array);
}
public static void fillMas(int[] arr){
    // Random random = new Random();//переменная рандом(содается библиотека)
    for(int i = 0; i < arr.length; i++){
       arr[i] = (int)(Math.random()*2); //реализация рандома,(конвертируем в)(метод конверитруемый)*2(граница 0-1)
    //    arr[i] = random.nextInt(2);//реализация рандома nextInt(2) рандом интеджер до 2 не включительно.
        
    }
}
public static void printMas(int[] arr) {
    for(int el : arr) {
        System.out.print(el + " ");
    }
    System.out.println();
}
public static void findMaxCount(int[] arr){
    int counter = 1;
    int result = 1;
    for (int i = 1; i < arr.length; i++) {
        if(arr[i] == arr[i-1] && arr[i] == 1) {
            counter ++;
            if (counter > result) result = counter;   
        }else {
            counter = 1;
    }
    System.out.println(result);    
}
    
}
}
