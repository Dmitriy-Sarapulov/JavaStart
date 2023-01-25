// Java: знакомство и как пользоваться базовым API (лекции)
// Тип данных Object - всему голова
// Упаковка - любой тип можно положить  в переменную типа Object
// Распаковка - преобразование Object-переменной в нужный тип
// Иерархия типов - любой тип "ниже" Object'a
// Массивы java System.arraycopy(копирование массива) (a, 0, b, 0, a.length);
public class lec3 {
    public static void main(String[] args) {
            Object o = 1; GetType(o); // java.lang.Integer
            o = 1.2; GetType(o); // java.lang.Double
               
    }
    static void GetType(Object obj){
        System.out.println(obj.getClass().getName());
    }
}
