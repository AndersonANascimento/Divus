package br.divus.aj2.cap9;

/**
 * Periodo - AJ2 - Código 9.8 - Página 199
 */
public enum Periodo {
    DIURNO_INTEGRAL ("Seg a Sex", 10, 18),
    DIURNO_MATUTINO ("Seg a Sex", 8, 12),
    NOTURNO ("Seg a Sex", 19, 23);

    private String dias;
    private int horaInicio, horaTermino;

    private Periodo(String dias, int horaInicio, int horaTermino) {
        this.dias = dias;
        this.horaInicio = horaInicio;
        this.horaTermino = horaTermino;
    }

    public String getDias() { return dias; }
    public int getHoraInicio() { return horaInicio; }
    public int getHoraTermino() { return horaTermino; }
    public int getTotalPeriodo() { return horaTermino - horaInicio; }
}
