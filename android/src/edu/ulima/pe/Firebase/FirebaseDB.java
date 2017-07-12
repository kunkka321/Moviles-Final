package edu.ulima.pe.Firebase;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by mbernedo on 12/07/2017.
 */

public class FirebaseDB {


    public void ingresar(String nombre, int puntaje) {
        DatabaseReference database = FirebaseDatabase.getInstance().getReference();
        DatabaseReference ref = database.child("mensaje");
    }


    public String prueba() {
        return "Si";
    }
}
