public class Main {
    public static void main(String[] args) {
        final double N = 100000;//Натуральное число, относительно которого вычисляет остаток от деления N ≥ 2 (N делится на простые числа 5 и 2)
        final int a = 21;//(0 ≤ a < N) - Множитель b = a - 1 = 20, b делится на 5 и 2 (простые числа)
        final int c = 19;//(0 ≤ c < N) - Приращение (числа c и N взаимнопростые НОД = 1)
        double x0 = 5;//(0 ≤ x0 < N) - Начальное значение

        for (int i = 1; i <= 100004; i++) {
            x0 = Congruential(N, a, c, x0);
            if(i <5){
                System.out.println("Число [" + i + "]: " + x0);
            }
            if(i >100000){
                System.out.println("Число [" + i + "]: " + x0);
            }

        }

    }

    public static double Congruential(double N, int a, int c, double x) {
        x = (a * x + c) % N;
        return x;
    }
}
