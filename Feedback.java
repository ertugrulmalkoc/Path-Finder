/**
 * @author Mehmet Emre Şahin
 * The feedback class for the Path Finder app.
 */
public class Feedback {

    //String variable that includes feedback.
    private String content;
    //The status of the feedback: 'false' for unhandled feedbacks, 'true' for done ones.
    private boolean status;

    //Getter and setter for feedback status.

    /**
     * Getter for feedback. Returns if the feedback is handled.
     * @return status of feedback.
     */
    public boolean getStatus() { return status; }

    /**
     * Setter for feedback status.
     * @param status of feedback.
     */
    public void setStatus( boolean status ) { this.status = status; }

}
