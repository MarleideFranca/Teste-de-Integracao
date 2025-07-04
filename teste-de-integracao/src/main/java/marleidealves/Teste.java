package marleidealves;

public class Teste {
    public double calculo(double a, double b, double c) {
        if (c == 0) {
            throw new IllegalArgumentException("Divisão por zero não permitida.");
        }
        return (a + b) / c;
    }
}
