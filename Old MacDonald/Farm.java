
/**
 * Defines object that contains different animal objects
 * 
 * @author Alexis Scheerer
 * @version 3/3/16
 */
public class Farm
{
    private Animal[] a=new Animal[3];
    Farm(){
        a[0]=new Cow("cow", "moo");
        a[1]=new Chick("chick", "peep");
        a[2]=new Pig("pig", "oink");
    }
    public void animalSounds(){
        for(int i=0; i<a.length; i++){
            System.out.println(a[i].getType()+ " goes "+a[i].getSound());
        }
    }
}
