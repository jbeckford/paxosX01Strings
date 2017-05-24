package jbeckford.paxos.codeChallenge;

/**
 * Created by Jesus on 5/22/2017.
 */
public class CharIndexState {
    private int index;
    private boolean isActive = false;
    private CharIndexState followingCharIndexState;

    public CharIndexState(int index){
        this.index = index;
    }

    public boolean increment(){
        isActive = !isActive;
        return !isActive; // return true when we roll over.
    }

    public boolean isActive() {
        return isActive;
    }

    public int getIndex() {
        return index;
    }

    public String toString(){
        return this.isActive() ? "1" : "0";
    }
}
