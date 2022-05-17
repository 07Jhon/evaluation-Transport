package evaluation.chauffeur;

public class Chauffeur {
    int idchauffeur;
    String nom;

    public Chauffeur() {
    }

    public Chauffeur(int idchauffeur, String nom) {
        this.idchauffeur = idchauffeur;
        this.nom = nom;
    }

    public int getIdchauffeur() {
        return idchauffeur;
    }

    public void setIdchauffeur(int idchauffeur) {
        this.idchauffeur = idchauffeur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

}
