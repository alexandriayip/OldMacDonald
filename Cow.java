  class Cow implements Animal {     
     protected String myType;     
     protected String mySound;      
     public Cow(String type, String sound, String name)  {         
         myType = type;         
         mySound = sound;     
         
     }     
     public Cow()     {         
         myType = "unknown";         
         mySound = "unknown";     

     }      
     public String getSound(){return mySound;}     
     public String getType(){return myType;} 
}
     //your code here
