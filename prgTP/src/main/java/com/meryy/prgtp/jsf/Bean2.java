/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.meryy.prgtp.jsf;

import jakarta.inject.Named;
import jakarta.enterprise.context.RequestScoped;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hp
 */
@Named(value = "bean2")
@RequestScoped
public class Bean2 {

    private int nombre;

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    /**
     * Cette méthode retourne une liste de nombres suivants à partir du "nombre"
     * saisi.
     *
     * @return
     */
    public List<Integer> getNombresSuivants() {
        int nb = 5;
        List<Integer> l = new ArrayList<>(nb);
        for (int i = nombre; i < nombre + nb; i++) {
            l.add(i);
        }
        return l;
    }

    /**
     * Méthode "afficher" qui génère une chaîne de caractères pour la
     * redirection. Elle renvoie une chaîne représentant l'URL de redirection, y
     * compris le paramètre "nb" avec la valeur de "nombre".
     *
     * @return
     */
    public String afficher() {
        return "affichage_4?nb=" + nombre + "&amp;faces-redirect=true";
    }
}
