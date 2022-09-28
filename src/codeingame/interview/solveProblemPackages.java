package codeingame.interview;

public class solveProblemPackages {
    
    public static void main(String[] args) {

        System.out.println(solve(160, 70,70, 10 ));

    }

    public static  String solve (int width, int height, int length, int mass){

        String result = ""; 
        String packages = ""; 
        int volume = width * height * length ;
        
        result = heavy(mass, result);
        result = bulky ( result,  volume,  width,  height,  length );

        if (result.equals("bulky") || result.equals("heavy")  ){
            packages = "special"; 
        } 
        if (result.equals("bulky") && result.equals("heavy")  ){
            packages = "reject"; 
        } 
        if (!(result.equals("bulky") || result.equals("heavy"))  ){
            packages = "standard"; 
        } 

        return packages;
    }

    private static String bulky(String result, int volume, int width, int height, int length ) {
        if (volume > 1000000) {
            result = "bulky";
        } else if (width >=150) {
            result = "bulky";
        } else if (width >=150) {
            result = "bulky";
        } else if (width >=150) {
            result = "bulky";
        }
        return result;
    }

    private static String heavy(int mass, String result) {
        if (mass >= 20 ) {
            result = "heavy";
        }
        return result;
    } 
    
}
