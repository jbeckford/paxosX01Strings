package jbeckford.paxos.codeChallenge;


public class App 
{
    public static void main( String[] args )
    {
        if(args == null || args.length == 0){
            System.out.println("Error: No args provided.");
        } else {
            for (String arg : args) {
                new X01String(arg).displayPossibleValues();
            }
        }
    }
}
