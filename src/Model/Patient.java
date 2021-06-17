/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author ahmed
 */
public class Patient {
 String name;
 String Prenom;
 String Sexe;
 int age;
 double poids;
 double taille;
    public Patient() {
        
    }
    public Patient(String name, String Prenom, String Sexe, int age, double poids, double taille) {
        this.name = name;
        this.Prenom = Prenom;
        this.Sexe = Sexe;
        this.age = age;
        this.poids = poids;
        this.taille = taille;
    }

    public String getName() {
        return name;
    }

    public String getPrenom() {
        return Prenom;
    }

    public String getSexe() {
        return Sexe;
    }

    public int getAge() {
        return age;
    }

    public double getPoids() {
        return poids;
    }

    public double getTaille() {
        return taille;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }

    public void setSexe(String Sexe) {
        this.Sexe = Sexe;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public void setTaille(double taille) {
        this.taille = taille;
    }

 
 
}
