import java.util.Arrays;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AnyBaseToAnyBase {

    static final int MIN_BASE = 2;
    static final int MAX_BASE = 36;

    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        String n;
        int b1,b2;

        while (true) {

            try {
                System.out.println("TECLEA EL NUM: ");
                n=sc.next();
                System.out.println("INTRODUCE LA BASE DEL NÚMERO:");
                b1=sc.nextInt();
                
                
                if (b1>MAX_BASE||b1<MIN_BASE) {
                    System.out.println("ERROR EN LAS BASE");
                    continue;
                }
                if (!validForBase(n,b1)) {
                    System.out.println("NÜMERO INVÁLIDO PARA ESTA BASE");
                    continue;
                }

                System.out.println("INTRODUCE LA BASE FINAL:");
                b2=sc.nextInt();

                if (b2>MAX_BASE||b2<MIN_BASE) {
                    System.out.println("ERROR EN LA BASE");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("ERROR EN LA ENTRADA DE DATOS");
                sc.next();
            }
            
        }
        System.out.println(base2base(n, b1, b2));
        sc.close();
    
}

    public static boolean validForBase(String n, int base) {
        char[] validDigits = {
                '0',
                '1',
                '2',
                '3',
                '4',
                '5',
                '6',
                '7',
                '8',
                '9',
                'A',
                'B',
                'C',
                'D',
                'E',
                'F',
                'G',
                'H',
                'I',
                'J',
                'K',
                'L',
                'M',
                'N',
                'O',
                'P',
                'Q',
                'R',
                'S',
                'T',
                'U',
                'V',
                'W',
                'X',
                'Y',
                'Z',
        };

        char[] digitsForBase = Arrays.copyOfRange(validDigits, 0, base);

                HashSet<Character> digitsList = new HashSet<>();
        for (int i = 0; i < digitsForBase.length; i++) {
            digitsList.add(digitsForBase[i]);
        }

        for (char c : n.toCharArray()) {
            if (!digitsList.contains(c)) {
                return false;
            }
        }

        return true;


    }


    public static String base2base(String n, int b1, int b2) {
        
        int decimalValue = 0, charB2;
        char charB1;
        String output = "";
        
        for (int i = 0; i < n.length(); i++) {
            
            charB1 = n.charAt(i);

            if (charB1 >= 'A' && charB1 <= 'Z') {
                charB2 = 10 + (charB1 - 'A');
            } 
            else {
                charB2 = charB1 - '0';
            }
            
            decimalValue = decimalValue * b1 + charB2;
        }

        
        if (0 == decimalValue) {
            return "0";
        }
        
        while (decimalValue != 0) {
            
            if (decimalValue % b2 < 10) {
                output = decimalValue % b2 + output;
            }
            
            else {
                output = (char) ((decimalValue % b2) + 55) + output;
            }

            decimalValue /= b2;
        }
        return output;
    }


}