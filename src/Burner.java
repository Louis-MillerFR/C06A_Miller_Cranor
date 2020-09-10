public class Burner {
 
  private enum Temp { BLAZING, HOT, WARM, COLD }
  private Temp temperature;
  private Setting setting;
	private int timer = 0;
	private static final int TIME_DURATION = 2;
  public Burner(){
    temperature = COLD;
    setting = OFF;
  }
	public boolean isBlazing(){
		return temperature == BLAZING;
	}
  public void plusButton(){
		timer = TIME_DURATION;
    switch(setting) {
      case OFF:
        setting = LOW;
        break;
			case LOW:
        setting = MEDIUM;
        break;
			case MEDIUM:
        setting = HIGH;
        break;
    }
  }
  public void minusButton(){
		timer = TIME_DURATION;
		switch(setting) {
      case HIGH:
        setting = MEDIUM;
        break;
			case MEDIUM:
        setting = LOW;
        break;
			case LOW:
        setting = OFF;
        break;
    }
  }
	public void updateTemperature(){
		//Update timer and temperature as shown in PDF
	}
	public void display(){
		switch(temperature) {
      case COLD:
        System.out.print("cooool");
        break;
			case WARM:
        System.out.print("warm");
        break;
			case HOT:
        System.out.print("CAREFUL");
        break;
			case BLAZING:
        System.out.print("VERY HOT! DON'T TOUCH");
        break;
    }
	}
}
/*
    A constructor that sets the temperature to COLD and the setting to OFF
    A plusButton() raises the setting one notch (e.g., from OFF to LOW), unless it's already on HIGH. If the setting is HIGH, calling this function will have no effect (i.e., not an error, burner just stays at its highest setting).
        You must use a switch statement for plusButton() and minusButton() (why? to see how it works with enumerated types).
    minusButton() lowers the setting one notch, unless the burner is already OFF (i.e., this is the reverse of plusButton()).  
    Both of these functions will set timer.
    updateTemperature() will be called (hypothetically) every minute. This method will update the timer and temperature, as shown in the pdf.
    display() will show the status of the burner, in the format shown in the figure below. You should make use of the toString() method of the Setting enum for part of the display.
	
*/