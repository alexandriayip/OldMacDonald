class Chick implements Animal
{     
  private String myType;
  private String mySound;      
  private String mySoundSecond;
  public Chick (String type, String sound, String soundSecond) {         
    myType = type;         
    mySound = sound;
    mySoundSecond = soundSecond;
  }
  
  public Chick() {         
    myType = "unknown";         
    mySound = "unknown";
  }      
  
public String getSound() {
  double a = Math.random();
  if (a < 0.5) {
    return mySound;
  } else {
    return mySoundSecond;
  }
}     

  public String getType() {
    return myType;
  }
}
