package FestivalMusicaDAM;

import java.util.ArrayList;

public class GrupoMusical {
    private String nombre;
    private String genero;
    private String PaisOrigen;
    private ArrayList<Integrante> integrantes;

    public GrupoMusical(String nombre, String genero, String paisOrigen) {
        this.nombre = nombre;
        this.genero = genero;
        PaisOrigen = paisOrigen;
        integrantes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPaisOrigen() {
        return PaisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        PaisOrigen = paisOrigen;
    }

    public ArrayList<Integrante> getIntegrantes() {
        return integrantes;
    }

    public Integrante getIntegrante(int posicion) {
        return integrantes.get(posicion);
    }

    public void addintegrante(Integrante nuevoIntegrante){
        integrantes.add(nuevoIntegrante);
    }
}
