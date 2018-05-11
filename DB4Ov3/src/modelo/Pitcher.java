/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 * @author PMELENDEZ
 */
public class Pitcher extends Player{   
    private int wins;
    
    public Pitcher(String name, int squadNumber,
                    float battingAverage, int wins) {
        super(name,squadNumber,battingAverage);
        this.wins = wins;
    }  

    public void setWins(final int w)
           {this.wins = w;}
    public int getWins() 
           {return this.wins;}
    
    public String toString() {
        return name + ":" + battingAverage + ", " + wins;
    }
}


