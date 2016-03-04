
/**
 * Inherits from Animal, part of Old MacDonald
 * 
 * @author Alexis Scheerer
 * @version 3/3/16
 */
public class Chick implements Animal{
    private String myType;
    private String mySound;
    private String secondSound;
    //constructor for Chick with two parameters
    Chick(String myType, String mySound){
        this.myType=myType;
        this.mySound=mySound;
    }
    //second constructor for chick with two different sounds
    Chick(String myType, String mySound, String secondSound){
        this.myType=myType;
        this.mySound=mySound;
        this.secondSound=secondSound;
    }
    //returns Chick sound, if the chick has two sounds, it will pick one randomly
    public String getSound(){
        if(secondSound instanceof String){
            if(Math.random()<.5){
                return(mySound);
            }
            else{
                return(secondSound);
            }
        }
        else{
            return(mySound);
        }
    }
    //returns Chick type
    public String getType(){
        return(myType);
    }
}
