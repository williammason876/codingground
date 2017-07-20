package hardware;
public class DisplaySimulator<S> implements Display<S>{
    
    private S value;
    /**
    * Set the value on this Display
    *
    * @param value    The value
    */
   public void setValue(S value){
       this.value = value;
   }
   
   /**
    * Show the value currently set for this Display
    * (specifically, print the value on the console)
    */
   public void showValue(){
       System.out.println(this.value);
   }
}