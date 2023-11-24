package org.elmaghrani.observable;

import org.elmaghrani.observateur.Observateur;

import java.util.ArrayList;
import java.util.List;

public class SujetObservableImpl implements SujetObservable {
    private List<Observateur> observateurs = new ArrayList<>();
    private String etat;

    public void ajouterObservateur(Observateur observateur) {
        observateurs.add(observateur);
        System.out.println("Observateur ajouté avec succès.");
    }

    public void supprimerObservateur(Observateur observateur) {
        observateurs.remove(observateur);
        System.out.println("Observateur supprimé avec succès.");
    }

    public void notifierObservateurs() {
        observateurs.forEach(observateur -> observateur.mettreAJour(etat));
    }

    public void definirEtat(String nouvelEtat) {
        this.etat = nouvelEtat;
        System.out.println("État défini avec succès.");
        notifierObservateurs();
    }
}

