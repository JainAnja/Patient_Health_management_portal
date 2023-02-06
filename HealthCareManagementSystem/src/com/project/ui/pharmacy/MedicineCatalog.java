/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.ui.pharmacy;

import java.util.ArrayList;

/**
 *
 * @author bhavinbhatia
 */
public class MedicineCatalog {
    ArrayList<Medicine> medicines;

    public MedicineCatalog(ArrayList<Medicine> medicines) {
        this.medicines = medicines;
    }

    public ArrayList<Medicine> getMedicines() {
        return medicines;
    }

    public void setMedicines(ArrayList<Medicine> medicines) {
        this.medicines = medicines;
    }
    
}
