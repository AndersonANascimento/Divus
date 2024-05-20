package br.divus.aj2.cap8;

/**
 * TesteHeranca - AJ2 - Código 8.3 - Página 157
 */
public class TesteHeranca {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int resultado1 = calc.soma(10, 37);
        System.out.println("10 + 37 = " + resultado1);
        CalculadoraPlus calcPlus = new CalculadoraPlus();
        int resultado2 = calcPlus.soma(20, 79);
        System.out.println("20 + 79 = " + resultado2);

        double resultado3 = calcPlus.multiplicacao(10, 30);
        System.out.println("10 * 30 = " + resultado3);

    }
}
