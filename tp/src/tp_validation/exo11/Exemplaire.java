package tp_validation.exo11;

public class Exemplaire extends Oeuvre {

    Oeuvre oeuvre;

    public Exemplaire(String nomAuteur, boolean primed, String titre, String langue) {
        super(nomAuteur, primed, titre, langue);
    }

    public Oeuvre getOeuvre() {
        return oeuvre;
    }
}
