package org.elmaghrani.observable;

import org.elmaghrani.observateur.Observateur;

public interface SujetObservable {
    void ajouterObservateur(Observateur observateur);
    void supprimerObservateur(Observateur observateur);
    void notifierObservateurs();
    void definirEtat(String nouvelEtat);
}
