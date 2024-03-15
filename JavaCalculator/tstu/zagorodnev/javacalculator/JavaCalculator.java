package tstu.zagorodnev.javacalculator;

import tstu.zagorodnev.javacalculator.enums.Operations;
import tstu.zagorodnev.javacalculator.utils.OperationsParser;
import tstu.zagorodnev.javacalculator.utils.TextUtils;

import java.util.Scanner;

public class JavaCalculator
{
    public static void main(String[] args) {
        System.out.println(String.join("\n", TextUtils.getOperationsList()));
        System.out.println("Введите операцию\n>>> ");
        Scanner input = new Scanner(System.in);

        String operator = input.next();

        System.out.println("Введите первое число");
        double vl1 = input.nextDouble();

        System.out.println("Введите второе число");
        double vl2 = input.nextDouble();

        try {
            System.out.println("Результат: " + OperationsParser.prepairOperator(
                    Operations.valueOf(operator.toUpperCase()),
                    vl1,
                    vl2
            ));
        } catch (IllegalArgumentException ex) { System.out.println(">>>> Данная операция не поддерживается"); }
    }
}
