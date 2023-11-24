package org.elmaghrani.observateur;

public class ObservateurConcret implements Observateur {
    private String nomObservateur;

    public ObservateurConcret(String nomObservateur) {
        this.nomObservateur = nomObservateur;
        System.out.println("Observateur " + nomObservateur + " ajouté avec succès.");
    }

    @Override
    public void mettreAJour(String nouvelEtat) {
        System.out.println("Observateur " + nomObservateur + " : Nouvel état - " + nouvelEtat);
    }
}
