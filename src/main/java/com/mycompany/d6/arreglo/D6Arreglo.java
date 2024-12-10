package com.mycompany.d6.arreglo;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class D6Arreglo {

    public static void main(String[] args) {
        
        int NumeroElementos1;
        int NumeroElementos2;
        
        Scanner scanner = new Scanner(System.in);
        
        NumeroElementos1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de recuerdos de Stiven:"));
        String [] Recuerdo1 = new String [NumeroElementos1];
        
        NumeroElementos2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de recuerdos de Samir"));
        String [] Recuerdo2 = new String [NumeroElementos2];
        
        
        System.out.println("********************************************");
        System.out.println("*                 RECUERDOS                *");
        System.out.println("********************************************");
        
        for (int i=0;i<NumeroElementos1;i++){
            System.out.println((i+1)+". Stiven ingrese sus recuerdos mas lindos  ");
            Recuerdo1 [i] = scanner.next().strip(); 
        }
        
        for (int i=0;i<NumeroElementos2;i++){
            System.out.println((i+1)+". Samir ingrese sus recurdos mas lindos ");
            Recuerdo2 [i] = scanner.next().strip(); 
        }

        // combinamos los recuerdos 
        int union=0;//sera nuevo iterador 
        
        String[] RecuerdosCombinados = new String[NumeroElementos1 + NumeroElementos2];
        
        
        for(int i=0;i<NumeroElementos1;i++){ 
            RecuerdosCombinados[union]= Recuerdo1[i];
            union++;

        }
        for(int i=0;i<NumeroElementos2;i++){ 
            RecuerdosCombinados[union]= Recuerdo2[i];
            union++;

        }
        
        System.out.println("Tus recuerdos son:");
        for (int i=0;i<RecuerdosCombinados.length;i++){
            System.out.println((i+1)+". " + RecuerdosCombinados[i]);
        }   
    }
}
