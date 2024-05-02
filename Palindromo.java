public class Palindromo {
    
    public static boolean esPalindromo(String s){

        return((s==null)|| s.length()<=1) || s.equals(new StringBuilder(s).reverse().toString());

    }

    public static boolean esPalindromoRecursivo(String s){
        if (s==null|| s.length()<=1) {
            return true;
            
        }
        if (s.charAt(0 ) != s.charAt(s.length()-1)) {
            return false;
        }

        return esPalindromoRecursivo(s.substring(1,s.length()-1 ));


    }

    public static boolean esPalidromo2Puntos(String s){
        if (s==null|| s.length()<=1) {
            return true;
            
        }
        for(int i =0,j=s.length()-1;i<j;++i,--j){
            if (s.charAt(i) != s.charAt(j)) {
                return false;
                
            }

        }
        return true;
    }
}
