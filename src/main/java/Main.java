import Entity.LinearCongruentialGenerator;

public class Main {
    public static void main(String[] args) {
        LinearCongruentialGenerator linearCongGen = new LinearCongruentialGenerator(100000, 31, 23, 10);
        System.out.println("=========================================================");
        System.out.println(linearCongGen);
        System.out.println("=========================================================");
        //Генерация псевдослучайных чисел
        linearCongGen.Generate();
        linearCongGen.print100GeneratedNumbers();
        linearCongGen.periodIsEqualToN();

    }


}
