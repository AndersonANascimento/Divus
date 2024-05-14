package br.divus.aj1.cap6;

class TesteSwitch {
    public static void main(String[] args) {
        int diaSemana = 1;
        if (args.length > 0)
            for (String string : args) {
                System.out.println("passou aqui");
                diaSemana = Integer.parseInt(string);
            }

        switch (diaSemana) {
            case 1:
                System.out.println("Segunda-feira");
                break;
            case 2:
                System.out.println("Terça-feira");
                break;
            case 3:
                System.out.println("Quarta-feira");
                break;
            case 4:
                System.out.println("Quinta-feira");
                break;
            case 5:
                System.out.println("Sexta-feira");
                System.out.println("Hoje é dia de balada!");
            case 6:
                System.out.println("Sábado");
                System.out.println("Hoje ainda é dia de balada!");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Dia inválido");
                break;
        }
    }
}
