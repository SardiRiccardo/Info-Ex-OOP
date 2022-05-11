package oop;

import java.util.Scanner;

public class OOP {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        Automobile auto1 = new Automobile(); //Quì creo l'auto numero 1 assegnandole modello targa ecc. e poi li stampo tutti 

        auto1.modello = "PapaMobile";
        auto1.targa = "PO420PE";
        auto1.colore = "Bianco";
        auto1.KmFatti = 0;
        auto1.annoImmatricolazione = 2020;
        auto1.usata = false;

        System.out.println("Modello: " + auto1.modello);
        System.out.println("Targa: " + auto1.targa);
        System.out.println("Colore: " + auto1.colore);
        System.out.println("Chilometri fatti: " + auto1.KmFatti);
        System.out.println("Anno di immatricolazione: " + auto1.annoImmatricolazione);
        System.out.println("Usata: " + auto1.usata);

        
        
        
        
        System.out.println();
        System.out.println();
        System.out.println();

        
        
        
        
        Automobile auto2 = new Automobile(); //Quì creo l'auto numero 2 assegnandole modello targa ecc. e poi li stampo tutti 

        auto2.modello = "CrippaCottero";
        auto2.targa = "CT690MD";
        auto2.colore = "Rosa";
        auto2.KmFatti = 69420;
        auto2.annoImmatricolazione = 2005;
        auto2.usata = true;

        System.out.println("Modello: " + auto2.modello);
        System.out.println("Targa: " + auto2.targa);
        System.out.println("Colore: " + auto2.colore);
        System.out.println("Chilometri fatti: " + auto2.KmFatti);
        System.out.println("Anno di immatricolazione: " + auto2.annoImmatricolazione);
        System.out.println("Usata: " + auto2.usata);
        
        
        
        //Istanzio l'array fabbrica[] che racchiude 10 "Automobile" cioè 10 auto come la 1 e la 2
        
        Automobile fabbrica[] = new Automobile[10];
        
        String arrayModello[] = new String[3]; //Quà dichiaro un array dei modelli che verranno assegnati casualmente
        arrayModello[0] = "A10";
        arrayModello[1] = "A20";
        arrayModello[2] = "A30";
        int randModello = 0;
        
        int targa = 001; //Questo è il numero base da cui parte la targa: AA001AA, AA002AA, ..., AA010AA (perchè ho un array di 10)
        
        String arrayColore[] = new String[7]; //Quà dichiaro i colori delle auto che verranno assegnati casualmente
        arrayColore[0] = "Rosso";
        arrayColore[1] = "Arancione";
        arrayColore[2] = "Giallo";
        arrayColore[3] = "Verde";
        arrayColore[4] = "Blu";
        arrayColore[5] = "Indaco";
        arrayColore[6] = "Viola";
        int randColore = 0;
        
        int km = 0; //Essendo prodotte in fabbrica presumo che non abbiano un chilometraggio
        
        int annoImmat = 2022; //Essendo appena uscite dalla fabbrica metto come anno di immatricolazione costante 2022
        
        
        
        
        
        
        
        for(int i = 0; i < 10; i++) {
            
            System.out.println("Automobile n." + i);
            
            randModello = (int) (Math.random()*2); //Quà randomizzo la posizione dell'arrayModello per assegnare randomicamente il modello all'auto
            fabbrica[i].modello = arrayModello[randModello]; 
            System.out.println("Modello: " + fabbrica[i].modello);
            
            fabbrica[i].targa = "AA" + targa + "AA"; targa++; //Quà assegno la targa con le lettere uguali e aumentando i numeri di 1 ogni volta
            System.out.println("Targa: " + fabbrica[i].targa);
            
            int randCOlore = (int) (Math.random()*6); //Quà randomizzo la posizione dell'arrayColore per assegnare randomicamente il colore all'auto
            fabbrica[i].colore = arrayColore[randColore];
            System.out.println("Colore: " + fabbrica[i].colore);
            
            fabbrica[i].KmFatti = km; //Quà assegno i chilometri
            System.out.println("Chilometri fatti: " + fabbrica[i].KmFatti);
            
            fabbrica[i].annoImmatricolazione = annoImmat; //Quà assegno l'anno di immatricolazione
            System.out.println("Anno di immatricolazione: " + fabbrica[i].annoImmatricolazione);
            
            fabbrica[i].usata = false; //Essendo prodotte in fabbrica, le auto saranno nuove quindi "false" nell'usate
            System.out.println("Usata: " + fabbrica[i].usata);
            
        }

       /**/

    }

}
