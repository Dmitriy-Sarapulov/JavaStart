package hw;
// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
// я не понял условие, вычислил факториал.


public class hw1 {
    public static void main(String[] args) {
        // fact(5);
        PrimeNumbers(5);
    }
    public static void fact(int n){
        int result = 1;
        for (int i = 1; i <= n; i++) {            
            result = result * i;
                               
        }
        System.out.println(result);
        
    }
    // Вывести все простые числа от 1 до 1000
    public static void PrimeNumbers(int n){
        for (int i = 2; i <= n; i++) {
            boolean prime = true;
            for(int j = 2; j <= i-1; j++){
                if(i % j ==0) {
                    prime = false;
                    break;
                }                
            }
            if(prime) {
                System.out.println(i);

            }            
        }
    }
}
