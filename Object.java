/**
 * The object class for the objects that are intractable such as vending machines.
 */
public class Object {

    //Type of the object.
    private int type;
    //Arrays storing x and y values of the object's location.
    private int[] xPoints;
    private int[] yPoints;
    //A boolean variable indicating whether the object is functional in reailty.
    private boolean functional;

    //Constructor
    public Object( int type, int[]x, int[] y, boolean func ){
        this.type = type;
        xPoints = x;
        yPoints = y;
        functional = func;
    }

    /**
     * Getter for the functionality of the object.
     * @return functionality of the object.
     */
    public boolean getFunctionality() { return functional; }




}
