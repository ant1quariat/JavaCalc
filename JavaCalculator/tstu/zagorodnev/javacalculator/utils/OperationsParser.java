package tstu.zagorodnev.javacalculator.utils;


import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tstu.zagorodnev.javacalculator.enums.Operations;

public class OperationsParser
{
    public static double parseSqrt(double value) {
        return Math.sqrt(value);
    }

    public static double parsePow(double value) {
        return value * value;
    }

    public static double parsePow(double value, int top) {
        return Math.pow(value, top);
    }

    public static double parseLog(double value) {
        return Math.log(value);
    }

    public static double factorial(double vl) {
        int value = (int) vl;

        if(value == 0 || value == 1) {
            return 1.0;
        }

        return value * factorial(value - 1);
    }

    public static double prepairOperator(@NotNull Operations operator, @NotNull double vl1, @Nullable double vl2) {
        switch (operator) {
            case PLUS -> {
                return vl1 + vl2;
            }

            case MINUS -> {
                return vl1 - vl2;
            }

            case DEMITER -> {
                if (vl2 == 0) {
                    System.out.println("На ноль делить нельзя!");
                    return 0.0;
                }
                return vl1 / vl2;
            }

            case MULTIPLY -> {
                return vl1 * vl2;
            }

            case POW -> {
                if(vl1 == 0) {
                    return 0.0;
                }
                return parsePow(vl1);
            }

            case SQRT -> {
                if(vl1 == 0) {
                    return 0;
                }
                return parseSqrt(vl1);
            }

            case COS -> {
                return Math.cos(vl1);
            }

            case SIN -> {
                return Math.sin(vl1);
            }

            case TG -> {
                return Math.tan(vl1);
            }

            case CTG -> {
                return 1.0 / Math.tan(vl1);
            }

            case SINH -> {
                return Math.sinh(vl1);
            }

            case COSH -> {
                return Math.cosh(vl1);
            }

            case TGH -> {
                return Math.tanh(vl1);
            }

            case CTGH -> {
                return (parsePow(Math.E, (int) vl1) + parsePow(Math.E, -((int) vl1))) / (parsePow(Math.E, (int) vl1) - parsePow(Math.E, -((int) vl1)));
            }

            case LOG -> {
                return parseLog(vl1);
            }

            case LN -> {
                return Math.log10(vl1);
            }

            case MOD -> {
                return Math.abs(vl1);
            }

            case FACT -> {
                return factorial(vl1);
            }

            case EXP -> {
                return Math.exp(vl1);
            }

            default -> {
                System.out.println("Данная операция не поддерживается");
                return 0.0;
            }
        }
    }
}
