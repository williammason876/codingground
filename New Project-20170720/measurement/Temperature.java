package measurement;

public class Temperature{
    private double value;
    public static Temperature OFF = new Temperature(0.0);
    private static double MINIMUM_VALUE = -100.0;
    private static double MAXIMUM_VALUE = 600.0;
    
     /**
     * Explicit Value Constructor
     *
     * Note: Values that are outside of the allowable range are projected
     * onto the allowable closed interval.
     *
     * @param value   The value of this Temperature
     */
    public Temperature(double value)
    {
        if(value < Temperature.MINIMUM_VALUE ){
            this.value = Temperature.MINIMUM_VALUE;
        }
        else if (value > Temperature.MAXIMUM_VALUE){
            this.value = Temperature.MAXIMUM_VALUE;
        }
        else{
            this.value = value;
        }
        
   }
   
   /**
    * Get a String representation of this Temperature
    *
    * @return  The String representation
    */
   public String toString()
   {
       
      if(this.value == 0.0){
          return Level.OFF.toString();
      }
      else return String.valueOf(this.value);
   }

    
}