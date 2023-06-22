package ru.victoria.lesson_1;
// 1. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат, где a, b, c, d - входные параметры этого метода;
// 2. Написать метод, принимающий на вход два числа и проверяющий что их сумма лежит в пределах от 10 до 20(включительно),
//    если да вернуть - true, в противном случае - false;
// 3. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное
//    ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.
// 4. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное.
// 5. Написать метод, которому в качестве параметра передается строка,обозначающая имя, метод должен вывести в консоль сообщение
//    "Привет, указанное имя!".
//

public class MainClass {
    public static void main(String[] args) {
        System.out.println(calculate(2,5,10,2));
        System.out.println(sumNumbers(5, 5));
        number(-21);
        System.out.println(negativeNumber(7));
        strName("Вика");
    }

    public static float calculate(float a, float b, float c, float d) {
        float result =  a * (b + (c / d));
        return result;
    }

    public static boolean  sumNumbers(int first, int second) {
        int sum = first + second;
        if (sum >= 10 && sum <= 20) {

            return true;
        }
        return false;


    }

    public static void number(int num) {
        if (num >= 0) {
            System.out.println("Число положительное");
        } else
        System.out.println("Число отрицательное");
    }

    public static boolean negativeNumber(int number) {
        if(number < 0) {
            return true;
        }
        return false;
    }

    public static void strName(String name) {
        System.out.println("Привет, " + name + "!");
    }



    }


