/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios_analisis;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author boris
 */

//enero, marzo, mayo, julio, agosto, octubre, diciembre = 31 days
//abril, junio, septiembre, noviembre  = 30 days
// febrero = 28, 29
public class FechaFraccional {
    int year, month, day;
    HashMap<Integer, Integer> meses = new HashMap<>();
    
    public FechaFraccional(int day, int month, int year){
        
        this.year = year;
        this.month = month;
        this.day = day;
        meses.put(1, 31);
        meses.put(2, 28);
        meses.put(3, 31);
        meses.put(4, 30);
        meses.put(5, 31);
        meses.put(6, 30);
        meses.put(7, 31);
        meses.put(8, 31);
        meses.put(9, 30);
        meses.put(10, 31);
        meses.put(11, 30);
        meses.put(12, 31);
    }
    
    public void execute(){
        if(!biciesto(year)){
            for(int i = 1; i < month; i++){
                day += meses.get(i);
            }
        }else{
            if (month > 2){
                for(int i = 1; i < month; i++){
                day += meses.get(i);
                }
                day++;
            }else{
               for(int i = 1; i < month; i++){
                day += meses.get(i);
            } 
            }
        }
        System.out.println(simplificar(day, 365));
    }
    
    private boolean biciesto(int year){
        boolean esBisiesto = false;
        
        // Si es divisible entre 4, puede ser bisiesto
        if (year % 4 == 0) {
            // Si es divisible entre 100, solo es bisiesto si también lo es con 400
            if (year % 100 == 0) {
                if (year % 400 == 0){
                    esBisiesto = true;
                }
            }
            else {
                esBisiesto = true;
            }
        }
        return esBisiesto;
    }
    
    private String simplificar(int num, int den){
        int menor;
        
        if(num < den){
            menor = num;
        }else{
            menor = den;
        }
        
        ArrayList<Integer> primos = darPrimos(menor);
        
        if (num == den){
            return "1";
        }else{
            for (Integer primo : primos) {
                if(puedenDividir(num, den, primo)){
                    num = num / primo;
                    den = den / primo;
                }
                
            }
        }
        
        
        return num + "/" + den;
    }
    
    public ArrayList<Integer> darPrimos(int n){
        ArrayList<Integer> primos = new ArrayList<>();
        
        for (int i = 2; i <= n; i++){
            if(isPrime(i)){
                primos.add(i);
            }
        }
        return primos;
    }
    
    private boolean isPrime(int x){
        for(int i = 2; i <= x / 2; i++){
            if(x % i == 0){
                return false;
            }
        }
        return true;
    }
    
    private boolean puedenDividir(int a, int b, int n){ //Si dos numeros son divisibles entre otro
        return a % n == 0 && b%n == 0;
    }
    
}
