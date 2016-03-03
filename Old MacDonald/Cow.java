
/**
 * Inherits from Animal, part of Old MacDonald
 * 
 * @author Alexis Scheerer
 * @version 3/3/16
 */
public class Cow implements Animal{
    private String myType;
    private String mySound;
    //constructor for Cow with two parameters
    Cow(String myType, String mySound){
        this.myType=myType;
        this.mySound=mySound;
    }
    //returns Cow sound
    public String getSound(){
        return(mySound);
    }
    //returns Cow type
    public String getType(){
        return(myType);
    }
}
