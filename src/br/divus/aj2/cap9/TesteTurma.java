package br.divus.aj2.cap9;

/**
 * TesteTurma - AJ2 - Código 9.10 - Página 200
 */
public class TesteTurma {
    public static void main(String[] args) {
        Turma t = new Turma("Academia do Java", Periodo.DIURNO_INTEGRAL);
        System.out.println("\t- Curso: " + t.getCurso());
        System.out.println("\t- Dias.: " + t.getPeriodo().getDias());
        System.out.println("\t- Hora inicio: " + t.getPeriodo().getHoraInicio());
        System.out.println("\t- Hora termino: " + t.getPeriodo().getHoraTermino());
    }
}
