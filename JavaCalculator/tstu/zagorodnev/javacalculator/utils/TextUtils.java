package tstu.zagorodnev.javacalculator.utils;

import java.util.Arrays;
import java.util.List;

public class TextUtils
{
    private static List<String> operationsList = Arrays.asList(
            "[plus/minus/demiter/multiply] - Стандартные операции (+, -, /, *)",
            "[pow] - Операция возведение в степень",
            "[sqrt] - Операция квадратный корень",
            "[fact] - Операция факториал",
            "[cos/sin/tg/ctg] - Операции Косинус / Синус / Тангенс / Катангенс",
            "[log/ln] - Операции Логарифм / Натуральный Логарифм",
            "[cosh/sinh/tgh/ctgh] - Операции Гип.Косинус / Гип.Синус / Гип.Тангенс / Гип.Котангенс",
            "[exp] - Операция Экспонента"
    );

    public static List<String> getOperationsList() {return  operationsList;}
}
