
/**
 * Defines object that contains different animal objects
 * 
 * @author Alexis Scheerer
 * @version 3/3/16
 */
public class Farm
{
    private Animal[] a=new Animal[3];
    //constructor for Farm that initializes the array
    Farm(){
        a[0]=new NamedCow("cow", "Elsie", "moo");
        a[1]=new Chick("chick", "cheep", "cluck");
        a[2]=new Pig("pig", "oink");
    }
    //prints out the sounds of all animals in the list and prints out the cow's name
    public void animalSounds(){
        for(int i=0; i<a.length; i++){
            System.out.println(a[i].getType()+ " goes "+a[i].getSound());
        }
        System.out.println("The cow is known as "+((NamedCow)a[0]).getName());
    }
}
