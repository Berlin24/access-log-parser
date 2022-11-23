import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число:");
        int num = new Scanner(System.in) .nextInt();
        System.out.println("Введите второе число:");
        int num2 = new Scanner(System.in) .nextInt();
        System.out.println(("Сумма: ") + (num+num2));
        System.out.println(("Разность: ") + (num-num2));
        System.out.println(("Произведение: ") + (num*num2));
        System.out.println(("Частное: ") +((double) num/num2));

    }
}
