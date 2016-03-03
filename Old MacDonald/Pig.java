
/**
 * Inherits from Animal, part of Old MacDonald
 * 
 * @author Alexis Scheerer
 * @version 3/3/16
 */
public class Pig implements Animal{
    private String myType;
    private String mySound;
    //constructor for Pig with two parameters
    Pig(String myType, String mySound){
        this.myType=myType;
        this.mySound=mySound;
    }
    //returns Pig sound
    public String getSound(){
        return(mySound);
    }
    //returns Pig type
    public String getType(){
        return(myType);
    }
}
