import java.util.ArrayList;

/**
 * @author Mehmet Emre Şahin
 * The Space Class. Contains many child classes like floors, and methods required.
 */
public class Space {

    //Name of the space.
    private String name;

    //An ArrayList that contains the objects of the space.
    private ArrayList<Space> contents;

    //A parent object for in order to get directions for a room starting from the room
    //and traversing backwards into the building.
    private Space parent;

    //x and y coordinates of the object for UI.
    private int[] xPoints;
    private  int[] yPoints;

    //Ratio for resizing.
    private double ratio;

    //Constructor
    public Space(String name, int[] x, int[] y) {
        this.name = name;
        xPoints = x;
        yPoints = y;
        contents = new ArrayList<Space>();
    }

    /**
     * Getter for name.
     * @return name.
     */
    public String getName() { return Name; }

    /**
     * Setter for name.
     * @param name.
     */
    public void setName( String name ) { this.name = name; }

    /**
     * Getter for contents arraylist.
     * @return contents.
     */
    public ArrayList<Space> getContents() { return contents; }

    /**
     * Add a new content to the end of the contents arraylist of this Space object.
     * @param content.
     */
    public void addSpace(Space newContent) {
        contents.add(newContent);
    }

    //public void delete();

    /**
     * Getter for the parent object.
     * @return parent.
     */
    public Space getParent() { return parent; }

    //getDirections();

    /**
     * Checks whether a space object contains another space object. Returns
     * true if it contains, false if not.
     * @param space.
     * @return whether the object contains another object.
     */
    public boolean contains( Space space ) {
        for (Space content : contents) {
            if (content.getName().equals(space.getName()))
                return true;
        }
        return false;
    }

    /**
     * Equals method to check if two Space objects are equal to each other.
     * @param space object.
     * @return if objects are equal.
     */
    public boolean equals( Space space ) {
        return getName().equals(space.getName());
    }

    /**
     * toString method.
     * @return an explanatory string.
     */
    public String toString() {
        return "Name: " + getName() + "\nParent: " + getParent().getName();
    }


}
