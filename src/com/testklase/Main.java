package com.testklase;

import java.util.Scanner;

/*
* Domaci:
* Na osnovu videa https://www.youtube.com/watch?v=Mlr7iqVVnBk
* napraviti konvertor
* */

public class Main {

        public static void main(String[] args) {
            System.out.println("Jedinice za konverziju su: vodenice, kamenovi, litre, dani i drami.");
            uzimanjePodataka();

        }

        public static void uzimanjePodataka(){
            Scanner s = new Scanner(System.in);
            System.out.println("Unesite kolicinu");
            int kolicina = s.nextInt();
            s.nextLine();
            System.out.println("Unesite iz koje jedinice pretvarate ");
            String izJedinice = s.nextLine();
            System.out.println("Unesite u koju jedinicu pretvarate ");
            String uJedinicu = s.nextLine();

            System.out.print(konacanRezultat(rezultatKonverzije(izJedinice,kolicina),uJedinicu));
            System.out.println( "(" + uJedinicu + ")");

        }

        public static double rezultatKonverzije (String izJedinice, int kolicina) {



            double container = 0;
            //pretvaranje svega u drame
            if (izJedinice.equals("vodenice")) {
                container = kolicina * 2800;
            } else if (izJedinice.equals("kamenovi")) {
                container = kolicina * 400;
            } else if (izJedinice.equals("litre")) {
                container = kolicina * 100;
            } else if (izJedinice.equals("dani")) {
                container = kolicina * 14.29;
            } else if (izJedinice.equals("drami")) {
                container = kolicina;
            } else {
                System.out.println("Nevalidan unos");
            }

            return container;
        }

        public static double konacanRezultat(double container, String uJedinicu){

            double rezultat = 0;

            if (uJedinicu.equals("vodenice")) {
                rezultat = container * 0.0004;
            } else if (uJedinicu.equals("kamenovi")) {
                rezultat = container * 0.0025;
            } else if (uJedinicu.equals("litre")) {
                rezultat = container * 0.01;
            } else if (uJedinicu.equals("dani")) {
                rezultat = container * 0.07;
            } else if (uJedinicu.equals("drami")) {
                rezultat = container * 1;
            } else{
                System.out.println("Nevalidan unos");
            }

            return rezultat;

        }
    }

