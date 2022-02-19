// Test

public class App {
    public static void main(String[] args) {
        // Test object
        TV tv = new TV();

        // Test for adjusting values while TV is turned off
        tv.channelUp(); // will print error -> "ERROR: TV is turned off."
        tv.volumeDown(); // will print error -> "ERROR: TV is turned off."

        // Turning on the TV
        tv.turnOn();

        // Test for adjusting the values within the specified boundaries
        tv.setChannel(90); // channel = 90
        tv.setVolume(5); // volumeLevel = 5

        // Test for adjusting values while TV is turned on
        tv.channelDown(); // channel = 89
        tv.volumeUp(); // volumeLevel = 6

        // Test for adjusting the values outside the specified boundaries
        tv.setChannel(168); // will print error -> "ERROR: Unsupported channel number."
        tv.setVolume(-4); // will print error -> "ERROR: Unsupported volume level."

        // Turning off the TV
        tv.turnOff();
    }
}
