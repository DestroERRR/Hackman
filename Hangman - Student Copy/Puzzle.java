import java.util.ArrayList;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
//strings only 
public class Puzzle {

    private int lives;
    private boolean solve;
    private String word;
    private String guessedLetters; 
    
    public Puzzle(){
        lives = 7;
        solve = false;
    }

    public boolean isUnsolved() {
        return true;
    }

    public boolean makeGuess(String str) {
        for(int i = 0; i < this.getWord().length(); i++){
            if (str.contains(this.getWord().substring(i,i+1) ) ) return true; 
        }
        return false; 
    }

    public String getWord(){
        String str = "";
        int randomNum = (int) Math.random()*4+1;
        if(randomNum == 1) str = "Yessir";
        if(randomNum == 2) str = "bigoof";
        if(randomNum == 3) str = "hehexd";
        if(randomNum == 4) str = "word";
        return str; 
    }

    public void show() {
    }
}
