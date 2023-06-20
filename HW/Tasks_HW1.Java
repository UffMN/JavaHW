// 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
'''
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter number: ");
        int number = sc.nextInt();
        sc.close();
        int triangularNumber = 0;
        int factorialNumber = 1;
        for (int i = 1; i <= number; i++) {
            triangularNumber+=i;
        }
        for (int i = 1; i <= number; i++) {
            factorialNumber*=i;
        }
        System.out.printf("Теугольное число равно %s , факториал равен %s", triangularNumber, factorialNumber);
    }    
}
'''

// 2) Вывести все простые числа от 1 до 1000
'''
public class Task2 {
    public static void main(String[] args) {
        int arr[] = new int [1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=i+1;
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]!=0){
                for (int j = i+1; j < arr.length; j++) {
                    if (arr[j]%arr[i]==0){
                    arr[j]=0;
                    }
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=0){
                System.out.printf("%d ",arr[i]);
            }
        }
    }
}
'''
// 3) Реализовать простой калькулятор (+-/*)
'''
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter number: ");
        int number = sc.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.printf("Enter an action: ");
        String action = sc2.nextLine();
        switch (action) {
            case "+":
                System.out.printf("Enter number: ");
                int number2 = sc.nextInt();
                System.out.println(number+number2);
                break;
            case "-":
                System.out.printf("Enter number: ");
                int number3 = sc.nextInt();
                System.out.println(number-number3);
                break;
            case "*":
                System.out.printf("Enter number: ");
                int number4 = sc.nextInt();
                System.out.println(number*number4);
                break;
            case "/":
                System.out.printf("Enter number: ");
                int number5 = sc.nextInt();
                System.out.println(number/number5);
                break;
            default:
                System.out.printf("Unknown command");
                break;
        }
        sc.close();
        sc2.close();
    }
}
'''
// 4) (дополнительное задание) Задано уравнение вида q + w = e, q, w, e >= 0. 
// Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69. 
// Требуется восстановить выражение до верного равенства. Предложить хотя бы 
// одно решение или сообщить, что его нет.
'''
public class Task4 {
    public static void main(String[] args) {
        System.out.println("Задано выражение: 2? + ?5 = 47 . Восстановить выражение до верного равенства.");
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (20 + i + i * 10 + 5 == 47) {
                count += 1;
                System.out.println(count + ") 2" + i + " + " + i + "5" + " = 47");
                }
            }
        System.out.println("\n");
        if (count == 0) {
            System.out.println("Решений нет\n");
        }
    }
}
'''
