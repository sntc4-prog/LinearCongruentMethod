package Entity;

import java.util.ArrayList;
import java.util.List;

public class LinearCongruentialGenerator {
    private List<Double> generatedNumbers = new ArrayList<>();
    private final int step = 5;//Шаг для проверки "Период последовательности = N"
    private int N;
    private int a;
    private int c;
    private double x0;
    private double x;

    public LinearCongruentialGenerator(int N, int a, int c, double x0) {
        this.N = N;
        this.a = a;
        this.c = c;
        this.x0 = x0;
        this.x = x0;
    }

    public List<Double> getGeneratedNumbers() {
        return generatedNumbers;
    }

    public double getN() {
        return N;
    }

    public void Generate() {
        double N = this.N + this.step;
        for (int i = 1; i <= N; i++) {
            this.x = (this.a * this.x + this.c) % this.N;
            generatedNumbers.add(this.x);
        }
    }

    public void print100GeneratedNumbers() {
        for (int i = 0; i < 100; i++) {
            System.out.println(this.generatedNumbers.get(i));
        }
    }

    public void periodIsEqualToN() {
        System.out.println("=========================================================");
        System.out.println("Сгенерированные значения в начале N:");
        for (int i = 0; i < 5; i++) {
            System.out.println("{" + i + "}" + this.generatedNumbers.get(i));
        }
        System.out.println("=========================================================");
        System.out.println("Сгенерированные значения > N:");
        for (int i = this.N; i < this.N + this.step; i++) {
            System.out.println("{" + i + "}" + this.generatedNumbers.get(i));
        }
        System.out.println("=========================================================");
    }

    @Override
    public String toString() {
        return "LinearCongruentialGenerator{" +
                "N=" + N +
                ", a=" + a +
                ", c=" + c +
                ", x0=" + x0 +
                '}';
    }
}
