package FestivalMusicaDAM.Logica;

import java.time.LocalDate;

public class Integrante {
    private String nombre;
    private String Instrumento;
    private LocalDate anioNacimiento;

    public Integrante(String nombre, String instrumento, LocalDate anioNacimiento) {
        this.nombre = nombre;
        Instrumento = instrumento;
        this.anioNacimiento = anioNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getInstrumento() {
        return Instrumento;
    }

    public void setInstrumento(String instrumento) {
        Instrumento = instrumento;
    }

    public LocalDate getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(LocalDate anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }
}
