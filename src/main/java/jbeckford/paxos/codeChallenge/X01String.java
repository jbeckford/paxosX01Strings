package jbeckford.paxos.codeChallenge;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jesus on 5/22/2017.
 */
public class X01String {
    List<CharIndexState> charIndexStates = new ArrayList<CharIndexState>();
    private char [] toStringChars = null;
    private String toStringValue = null;

    public X01String(String templateString){
        if(templateString != null) {
            toStringChars = templateString.toCharArray();

            for (int i = 0; i < templateString.length(); i++){
                if(templateString.charAt(i) == 'X'){
                    addCharIndex(i);
                }
            }
        }
        toStringValue = null;
    }

    public int getPossibleStates(){
        return (int)Math.pow(2, charIndexStates.size());
    }

    private void addCharIndex(int charIndex){
        this.charIndexStates.add(new CharIndexState(charIndex));
    }

    public void increment(){
        int i = this.charIndexStates.size() - 1;

        while(i >= 0 && this.charIndexStates.get(i).increment()){
            i--;
        }

        invalidateToStringValue();
    }

    private void invalidateToStringValue() {
        this.toStringValue = null;
    }

    public String toString(){
        if(toStringValue == null) {
            for (CharIndexState charIndexState : charIndexStates) {
                toStringChars[charIndexState.getIndex()] = charIndexState.isActive() ? '1' : '0';
            }

            toStringValue = new String(this.toStringChars);
        }
        return toStringValue;
    }

    public void displayPossibleValues(){
        for(int i = 0; i < this.getPossibleStates(); i++){
            System.out.println( this.toString());
            this.increment();
        }
    }
}
