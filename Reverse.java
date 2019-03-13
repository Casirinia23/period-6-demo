
/**
 * A guess the password program.
 *
 *Cassie Ochoa-Lawrence
 * 11/20/2018
 */
public class Reverse
{
    public static final String SECRET_PASSWORD = "Nov2118";
    
    static String obfuscate(String input) {
        return input.replace('C', 'M').replace('1', '3').replace('N', 'B');
    }
        
    public static void main(String [] args) {
        if (args.length != 1)
        {
            System.out.println("Wrong! You have to run this program with one argument:\njava Reverse <arugment>");
            return;
        }
        
        if (args[0].equals(obfuscate(SECRET_PASSWORD)))
        {
            System.out.println("Congrats bro, you did it :D");
        }
        else
        {
            System.out.println("Sorry man, you're wrong :(");
        }
}
}