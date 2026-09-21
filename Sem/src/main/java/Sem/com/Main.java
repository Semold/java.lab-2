package Sem.com;
import java.util.Scanner;
// Your taking too long:3
public class Main {

    public static void main(String[] args) {
        //Для integer
        System.out.println("Максимальне значення: " + Integer.MAX_VALUE);
        System.out.println("Мінімальне значення: " + Integer.MIN_VALUE);
        System.out.println("Ромір: " + Integer.SIZE);
        System.out.println("Назва: " + Integer.TYPE + "\n");
        //Для byte
        System.out.println("Максимальне Значення: " + Byte.MAX_VALUE);
        System.out.println("Мінімальне Значення: " + Byte.MIN_VALUE);
        System.out.println("Розмір: " + Byte.SIZE);
        System.out.println("Назва: " + Byte.TYPE + "\n");
        //Для Short
        System.out.println("Макс. Значення: " + Short.MAX_VALUE);
        System.out.println("Мін.Значення: " + Short.MIN_VALUE);
        System.out.println("Розмір: " + Short.SIZE);
        System.out.println("Назва: " + Short.TYPE + "\n");
        //Для Long
        System.out.println("Max Value: " + Long.MAX_VALUE);
        System.out.println("Min.Value: " + Long.MIN_VALUE);
        System.out.println("SIZE: " + Long.SIZE);
        System.out.println("Name: " + Long.TYPE + "\n");
        //Для float
        System.out.println("Max Value: " + Float.MAX_VALUE);
        System.out.println("Min Value: " + Float.MIN_VALUE);
        System.out.println("SIZE: " + Float.SIZE);
        System.out.println("Name: " + Float.TYPE + "\n");
        //Для double
        System.out.println("Max Value: " + Double.MAX_VALUE);
        System.out.println("Min Value: " + Double.MIN_VALUE);
        System.out.println("SIZE: " + Double.SIZE);
        System.out.println("Name: " + Double.TYPE + "\n");
        //Для Сharacter
        System.out.println("Max Value: " + Character.MAX_VALUE);
        System.out.println("Min Value: " + Character.MIN_VALUE);
        System.out.println("SIZE: " + Character.SIZE);
        System.out.println("Name: " + Character.TYPE + "\n");
        // Для Boolean
        System.out.println("True: " + Boolean.TRUE);
        System.out.println("False: " + Boolean.FALSE);
        System.out.println("Type: " + Boolean.TYPE);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть ціле число (Int): ");
        String inputInt = scanner.nextLine();
        int userNum = Integer.parseInt(inputInt);
        System.out.println(userNum);

        System.out.println("Введіть дрове число (Double): ");
        String inputDouble = scanner.nextLine();
        Double userNum1 = Double.parseDouble(inputDouble);
        System.out.println(userNum1);

        System.out.println("Введіть символ (Сhar): ");
        String inputChar = scanner.nextLine();
        char userNum2 = inputChar.charAt(0);
        System.out.println(userNum2);

        scanner.close();

    }
}





























