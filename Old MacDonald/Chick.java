
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
    private boolean hasTwoSounds;
    //constructor for Chick with two parameters
    Chick(String myType, String mySound){
        this.myType=myType;
        this.mySound=mySound;
    }
    Chick(String myType, String mySound, String secondSound){
        this.myType=myType;
        this.mySound=mySound;
        this.hasTwoSounds=true;
    }
    //returns Chick sound
    public String getSound(){
        if(hasTwoSounds){
            return(mySound);
        }
        else{
            if(Math.random()<.5){
                return(mySound);
            }
            else{
                return(secondSound);
            }
        }
    }
    //returns Chick type
    public String getType(){
        return(myType);
    }
}
