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
public class Equilibrio {
    int x;

	public Equilibrio(int x) {
		this.x = x;
	}

	public void equilibrio() {
		ArrayList<Integer> lista1 = new ArrayList<>();
		ArrayList<Integer> lista = new ArrayList<>();
		lista = crearPrimos();
		for (int i = 0; i < lista.size(); i++) {
			int aux = lista.get(i);
			if (x % aux == 0) {
				lista1.add(aux);
			}
		}

		if (lista1.isEmpty() || lista1.size() == 1) {
			System.out.println("Equilibrio");
		} else {
			int size = lista1.size();
			System.out.println("[" + lista1.get(0) + ", " + lista1.get(size - 1) + "]");
		}
	}

	private ArrayList<Integer> crearPrimos() {
		ArrayList<Integer> lista = new ArrayList<>();

		boolean esPrimo;
		if (x >= 2) {
			lista.add(2);
		}
		for (int i = 3; i <= (x / 2) + 1; i += 2) {
			esPrimo = true;
			for (int j = 2; j <= i / 2; j++) {// mas optimo si colocamos j<=Math.sqrt(i)
				if (i % j == 0) {
					esPrimo = false;
					break;
				}
			}
			if (esPrimo) {
				lista.add(i);
			}
		}
		return lista;
	}

	public void mostrarPrimos() {
		ArrayList<Integer> lista = new ArrayList<>();

		boolean esPrimo;
		if (x >= 2) {
			lista.add(2);
		}
		for (int i = 3; i <= (x / 2) + 1; i += 2) {
			esPrimo = true;
			for (int j = 2; j <= i / 2; j++) {// mas optimo si colocamos j<=Math.sqrt(i)
				if (i % j == 0) {
					esPrimo = false;
					break;
				}
			}
			if (esPrimo) {
				lista.add(i);
			}
		}
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
	}
}
