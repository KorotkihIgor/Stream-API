import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.devide.apply(a, b); // На ноль делить нельзя. Исключение нодо завернуть в блок try-catch!

        calc.println.accept(c);

    }
}

