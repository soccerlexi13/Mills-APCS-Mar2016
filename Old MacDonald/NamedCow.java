
/**
 * Defines object that inherits from Cow, but has a name, Old MacDonald project
 * 
 * @author Alexis Scheerer
 * @version 3/4/16
 */
public class NamedCow extends Cow
{
    private String myName;
    //constructor for NamedCow that also takes in a name
    NamedCow(String myType, String myName, String mySound){
        super(myType, mySound);
        this.myName=myName;
    }
    //returns name for NamedCow
    public String getName(){
        return(myName);
    }
}
