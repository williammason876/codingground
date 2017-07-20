package hardware;
import measurement.*;

/**
 * The requirements of a CookTop with two Burner objects
 * and two Display objects (called left and right)
 *
 * @param <L>  The sacle used by the left  Burner and Display
 * @param <R>  The sacle used by the right Burner and Display
 *
 * @author  Prof. David Bernstein, James madison University
 * @version 1.0
 */
public interface CookTop<L,R>
{
   /**
    * Show the value of the left Burner on the left Display and
    * show the value of the right Burner on the right Display.
    */
   public abstract void showValues();
}
