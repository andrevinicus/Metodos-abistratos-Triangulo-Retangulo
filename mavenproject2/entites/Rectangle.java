/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2.entites;

import com.mycompany.mavenproject2.entites.enums.Color;

/**
 *
 * @author GCM_02
 */
public class Rectangle extends Shape {

    private double width;
    private double heigt;

    public Rectangle() {
       super();
    }

 
    public Rectangle(double width, double heigt, Color color) {
        super(color);
        this.width = width;
        this.heigt = heigt;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeigt() {
        return heigt;
    }

    public void setHeigt(double heigt) {
        this.heigt = heigt;
    }
   
    
    
    @Override
    public double area() {
       return width * heigt;
    }

}
