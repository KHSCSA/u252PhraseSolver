// can you complete the algorithm?
// if the 'guess' letter appears in 'phrase'
// replace that position in 'soFar' with the correct letter

public class PhraseSolverCHALLENGE {
    public static void main(String[] args){
        String phrase = "too many cooks in the kitchen";
        String soFar = "--- ---- ----- -- --- -------";

        // guessing the letter 'o'
        soFar = updateStringSoFar(phrase, soFar, "o");
        System.out.println(soFar);
        // test your method with other letters

        
    } // close main


    // TODO complete the method
    public static String updateStringSoFar(String actual, String soFar, String guess){
        // TODO

        return soFar;
    }


}
