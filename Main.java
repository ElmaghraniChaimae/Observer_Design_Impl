package org.elmaghrani;

import org.elmaghrani.observable.SujetObservable;
import org.elmaghrani.observable.SujetObservableImpl;
import org.elmaghrani.observateur.ObservateurConcret;

public class Main {
    public static void main(String[] args) {

        SujetObservable sujet = new SujetObservableImpl();

        sujet.ajouterObservateur(new ObservateurConcret("Observer1"));
        sujet.ajouterObservateur(new ObservateurConcret("Observer2"));

        sujet.definirEtat("Nouvel état");

        sujet.supprimerObservateur(new ObservateurConcret("Observer1"));

        sujet.definirEtat("Autre état");
    }
}