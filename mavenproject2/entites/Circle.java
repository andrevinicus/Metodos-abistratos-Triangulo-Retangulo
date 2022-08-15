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
public class Circle extends Shape{

     private double radius;
     
     public Circle(){
         super();
     }

    public Circle(double radius, Color color) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    
    
        
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
    
    
}
