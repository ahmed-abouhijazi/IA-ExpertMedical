/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppFx;

import Model.Patient;

/**
 *
 * @author ahmed
 */
public class PatientImlp {
    Patient p1 = new Patient();
    String nom ;

    public PatientImlp() {
    }

    public void addPatient(String N){
        nom = N;
    }

    public Patient getP1() {
        return p1;
    }
    public String getS() {
        return nom;
    }

    
}
