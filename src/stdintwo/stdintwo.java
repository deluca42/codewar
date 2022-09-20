package stdintwo;

//https://www.hackerrank.com/challenges/java-if-else/problem?h_r=next-challenge&h_v=zen

public class stdintwo {
    public static void main(String[] args) throws Exception {
        int N = 20;
        String result = "";

        // isOdd
        if (!(0==(N % 2))){
            result = "Weird"; 
        } else { //isNotOdd 
            if (N >= 2 && N <5 ){   
                result = "Not Weird"; 
            }  else if ( N >= 6 && N <= 20) {
                result = "Weird"; 
            } else {
                result = "Not Weird"; 
            }
        }
        System.out.print(result);
    
    
    }
}
