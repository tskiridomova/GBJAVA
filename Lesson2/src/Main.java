public class Main {

    public static void main(String[] args) {
        boolean result = sumCompare(10, 2);
        System.out.println(result);
        isPositive(0);
        System.out.println(isNegative(1));
        rePrintString(4, "Строка");
    }

    // 1. Написать метод, принимающий на вход два целых числа и проверяющий,
    // что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть
    // true, в противном случае – false.
    public static boolean sumCompare(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }

    }

    // 2. Написать метод, которому в качестве параметра передается целое число,
    // метод должен напечатать в консоль, положительное ли число передали или
    // отрицательное. Замечание: ноль считаем положительным числом.
    public static void isPositive(int a) {
        if (a >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    // 3. Написать метод, которому в качестве параметра передается целое число.
    // Метод должен вернуть true, если число отрицательное, и вернуть false если
    // положительное.
    public static boolean isNegative(int a) {
        if (a >= 0) {
            return false;
        } else {
            return true;
        }
    }

    // 4. Написать метод, которому в качестве аргументов передается строка и число,
    // метод должен отпечатать в консоль указанную строку, указанное количество раз;
    public static void rePrintString(int a, String b) {
        for (int i = 1; i <= a; i = i + 1) {
            System.out.println(b);
        }
    }



}
