package measurement;

public enum Level{
   OFF    ("Off   "),
   LOW    ("Low   "),
   MEDIUM ("Medium"),
   HIGH   ("High  ");
   
   private String text;
    /**
    * Explicit Value Constructor
    *
    * @param text    The String representation of the Level
    */
   private Level(String text)
   {
       this.text = text;
   }
   
    /**
    * Get a String representation of this Level
    *
    * @return  The String representation
    */
   public String toString()
   {
       return this.text;
   }
}