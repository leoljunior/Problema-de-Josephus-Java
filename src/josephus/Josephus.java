package josephus;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Josephus {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Random rdm = new Random();
        ArrayList list = new ArrayList();
         
        //Definindo tamanho do array
        System.out.println("***********O PROBLEMA DE JOSEPHUS***********");
        System.out.println("");
        System.out.println("Quantos soldados foram cercados pelos inimigos? ");
        int qSold = scn.nextInt();
        scn.nextLine();
        
        //Rcebendo nomes dos soldados
        System.out.println("Quais eram os nomes dos soldados? ");
        for(int i = 0; i < qSold; i++){
            System.out.print("Soldado: "+ (i+1) +": ");
            list.add(scn.nextLine());
        }
        //Sorteando um soldado para iniciar
        int pos = rdm.nextInt(list.size());
        System.out.println("****************************************************");
        System.out.println("A contagem irá começar pelo soldado: "+ list.get(pos));
        
        //Recebendo intervalo
        System.out.println("****************************************************");
        System.out.println("Qual o intervalo que os soldados serão eliminados? ");
        int itv = scn.nextInt();
        scn.nextLine();
        System.out.println("****************************************************");
        
        //aplicando lista circular
        int b = 1;
        int val = pos + itv;
        while (list.size() != 1) {
            if (val > list.size()) {
                val = val - list.size();
            }else{
                System.out.println("O "+ b +"º soldado removido foi: " + list.get(val-1));
                b++;
                list.remove(val-1);
                val = (val-1) + itv;
            }
    }
        System.out.println("****************************************************");
        System.out.println("O soldado sobrevivente foi: "+ list);
        
        
        
        
        
    }
    
}
