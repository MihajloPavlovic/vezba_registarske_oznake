
import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        
        System.out.println("Unesite registarsku oznaku: ");
        
        Scanner s = new Scanner(System.in);
        
        String regOznaka = s.nextLine();
        
        if (daLiJeIspravnaRegistarskaOznaka(regOznaka)) {
            System.out.println("Uneli ste ispravnu registarsku oznaku.");
        } else {
            System.out.println("Uneli ste neispravnu registarsku oznaku.");
        }
        
    }
    
    public static boolean daLiJeIspravnaRegistarskaOznaka(String tablica) {
        if (tablica.length() !=9) {
            return false;
        }
        
        if (!daLiJeIspravnoSlovo(tablica.charAt(0)) || !daLiJeIspravnoSlovo(tablica.charAt(1)) 
            || !daLiJeIspravnoSlovo(tablica.charAt(7)) || !daLiJeIspravnoSlovo(tablica.charAt(8))) {
            return false;
        }
        
        if (!Character.isDigit(tablica.charAt(3)) || !Character.isDigit(tablica.charAt(4)) || !Character.isDigit(tablica.charAt(5))) {
            return false;
        }
        
        if (tablica.charAt(2) !='-' || tablica.charAt(6) !='-') {
            return false;
        }
        
        return true;
    }
    
    public static boolean daLiJeIspravnoSlovo(char slovo) {
        if (slovo == 'A' || slovo == 'B' || slovo == 'C' || slovo == 'Č' || slovo == 'Ć' || slovo == 'D' || slovo == 'G' 
           || slovo == 'Đ' || slovo == 'H' || slovo == 'E' || slovo == 'F' || slovo == 'G' || slovo == 'H' || slovo == 'I' 
           || slovo == 'J' || slovo == 'K' || slovo == 'L' || slovo == 'M' || slovo == 'N' || slovo == 'O' || slovo == 'P' 
           || slovo == 'R' || slovo == 'S' || slovo == 'Š' || slovo == 'T' || slovo == 'U' || slovo == 'V' || slovo == 'Z'
           || slovo == 'Ž') {
            return true;
        }  else {
            return false;
        }  
    }
}
