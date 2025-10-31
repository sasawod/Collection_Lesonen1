/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Student Uferov
 */
public class Product {
    
    private String name;
    private String category;
    private String prise;

    public Product(String name, String category, String prise) {
        this.name = name;
        this.category = category;
        this.prise = prise;
    }



    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getPrise() {
        return prise;
    }
            

}

