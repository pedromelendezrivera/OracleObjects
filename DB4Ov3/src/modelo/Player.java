/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;



/**
 * @author PMELENDEZ
 */
public class Player {
    
    protected String name;
    protected int squadNumber;
    protected float battingAverage;
    protected Team team;
    
    public Player(String name, int squadNumber,
        float battingAverage){
        this.name = name;
        this.squadNumber = squadNumber;
        this.battingAverage = battingAverage;
    }
    
    public void setName(String n)
           {this.name = n;}  

    public String getName()
           {return this.name;} 

    public void setSquadNumber(int s)
           {this.squadNumber = s;}  

    public int getSquadNumber()
           {return this.squadNumber;}   
   
    public void setBattingAverage(final float b) 
          {this.battingAverage = b; } 
    
    public float getBattingAverage()
          {return this.battingAverage;}

    public void setTeam(Team t) 
          {this.team = t;}
    
    public Team getTeam() 
          {return this.team;}
    
    public String toString() {
        return name + " Numero: "+squadNumber + " promedio:" + battingAverage;
    }
}