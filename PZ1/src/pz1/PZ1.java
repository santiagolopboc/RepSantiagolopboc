
package pz1;

import java.util.Scanner;

public class PZ1 {

 private static Scanner keyboard=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("AUTHOR: SANTIAGOLOPBOC");
        int mes, any, dia;
        int Ibisiesto = 0;
        System.out.println("Dime el año en que quieras saber cuando cae el dia del programador");
        any=keyboard.nextInt();
        mes=9; 
        int bisiesto = anyoBisiesto(any, Ibisiesto);
        if (bisiesto==1) {
            dia=12;
        }
        else{dia=13;}
        
        
        String strDia= InicioDiaMesZeller(dia, mes, any, bisiesto);
        System.out.println(strDia);
        
    }
    private static String InicioDiaMesZeller(int dia, int mes, int Any, int Bisiesto){
       //zeller
       String diaString="";
       String[] semana={"Domingo", "Lunes","Martes","Miercoles","Jueves","Viernes", "Sabado"};
        
        
            int a, y, m, d;

            a = (14 - mes) / 12;
            y = Any - a;
            m = mes + 13 * a - 2;
            d = (dia + y + y / 4 - y / 100 + y / 400 + (31 * m) / 12) % 7;

            diaString = semana[d];
            if (Bisiesto==1) {
                System.out.println("12 de Septiembre del "+Any);
            }
            else{System.out.println("13 de Septiembre del "+Any);}
            return diaString;
            
    
    }
    
    private static int anyoBisiesto(int Any, int bisiesto){
        if (Any%4==0 && (Any%100!=0 || Any%400==0)) {
           bisiesto=1;
        }
        return bisiesto;
    }
    
    
    
    
}