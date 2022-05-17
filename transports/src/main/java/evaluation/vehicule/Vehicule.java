package evaluation.vehicule;

public class Vehicule {
    int idvehicule;
    String numeros;

    public Vehicule(int idvehicule, String numeros) {
        this.idvehicule = idvehicule;
        this.numeros = numeros;
    }

    public Vehicule() {
    }

    public int getIdvehicule() {
        return idvehicule;
    }

    public void setIdvehicule(int idvehicule) {
        this.idvehicule = idvehicule;
    }

    public String getNumeros() {
        return numeros;
    }

    public void setNumeros(String numeros) {
        this.numeros = numeros;
    }
}
