/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios_analisis;

import java.util.ArrayList;

/**
 *
 * @author boris
 */
public class PromedioEdades {
    String edad;
    public PromedioEdades(String edad){
        this.edad = edad;
    }
    
    public void execute(){
        double promedio = 0;
        ArrayList<Integer> edades = transformar(edad);
        for(Integer ages: edades){
            promedio+=ages;
        }
        System.out.println(promedio/edades.size());
    }
    
    private ArrayList<Integer> transformar(String edad){
        ArrayList<Integer> lista = new ArrayList<>();
        int i=0;
        while (i < edad.length()){
            if(i < edad.length() - 1){
               if(edad.charAt(i) == '1' && edad.charAt(i + 1) == '0'){
                
                    lista.add(10);
                    i += 2;
                }else{
                int num;
                char n = edad.charAt(i);
                String numeroLetra = Character.toString(n);
                num = Integer.parseInt(numeroLetra);
                lista.add(num);
                i++;
                } 
            }
            else{
                int num;
                char n = edad.charAt(i);
                String numeroLetra = Character.toString(n);
                num = Integer.parseInt(numeroLetra);
                lista.add(num);
                i++;
            }
        }
        
        return lista;
    }
}
