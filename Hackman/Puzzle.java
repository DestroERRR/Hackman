import java.util.ArrayList;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
public class Puzzle {
    private String theWord;
    private String guessedLetters; 
    private String prevGuessedLetter;
    
    private String [] word = {"c","o","p","i","u","m"};
    private String [] underScore = {"_","_","_","_","_","_"};

    public Puzzle(){
        theWord = "Copium";
        guessedLetters = "";
        prevGuessedLetter = "";
    }
    
    public boolean isUnsolved() {
        for(int i = 0; i < word.length-1; i++) {
            if(!(underScore[i].equals(word[i]) ) ) {
                return true;
            }
        } 
        return false;
    }

    public boolean makeGuess(String str) {
        for(int i = 0; i < theWord.length(); i++){
            if (str.contains(this.theWord.toLowerCase().substring(i,i+1) ) ) {
                guessedLetters = str;
                return true;
            }
            guessedLetters = str; 
        }
        return false; 
    }

    public String getWord() {
        return theWord; 
    }
    
    public void show() {
 
        //System.out.println(isUnsolved());
        System.out.print("Word: ");
        for(int i = 0; i < word.length; i++) { 
            if(guessedLetters.equals(word[i]) ){
                underScore[i] = guessedLetters;
            }
            
            System.out.print(underScore[i]);
        }
        
        System.out.println();
        prevGuessedLetter +=  guessedLetters + " " ;
        System.out.print("Guessed: " + prevGuessedLetter);
    }

}

