public class TV {
    int channel; // Current channel, default is 1 (accepted values between 1 and 120)
    int volumeLevel; // Current volume level, default is 1 (accepted values between 1 and 7)
    boolean on; // Current on/off condition, default is false (the TV is turned off)

    // Constructor method
    public TV() {
        this.channel = 1;
        this.volumeLevel = 1;
        this.on = false;
    }

    // Turns on the TV
    public void turnOn() {
        this.on = true;
    }

    // Turns off the TV
    public void turnOff() {
        this.on = false;
    }

    // Sets the channel number between 1 and 120 while TV is turned on only
    public void setChannel(int newChannel) {
        if (this.on) {
            if (newChannel >= 1 && newChannel <= 120) {
                this.channel = newChannel;
            } else {
                System.err.printf("ERROR: Unsupported channel number.%nCurrent channel is (%d).%n", channel);
            }
        } else {
            System.err.println("ERROR: TV is turned off.");
        }
    }

    // Sets the volume level between 1 and 7 while TV is turned on only
    public void setVolume(int newVolumeLevel) {
        if (this.on) {
            if (newVolumeLevel >= 1 && newVolumeLevel <= 7) {
                this.volumeLevel = newVolumeLevel;
            } else {
                System.err.printf("ERROR: Unsupported volume level.%nCurrent volume is (%d).%n", volumeLevel);
            }
        } else {
            System.err.println("ERROR: TV is turned off.");
        }
    }

    // Moves to the next channel while TV is turned on only
    public void channelUp() {
        if (this.on) {
            if (this.channel < 120) {
                this.channel += 1;
            } else {
                System.err.println("ERROR: Reached maximum channel number.");
            }
        } else {
            System.err.println("ERROR: TV is turned off.");
        }
    }

    // Moves to the previous channel while TV is turned on only
    public void channelDown() {
        if (this.on) {
            if (this.channel > 1) {
                this.channel -= 1;
            } else {
                System.err.println("ERROR: Reached minimum channel number.");
            }
        } else {
            System.err.println("ERROR: TV is turned off.");
        }
    }

    // Increments the volume level while TV is turned on only
    public void volumeUp() {
        if (this.on) {
            if (this.volumeLevel < 7) {
                this.volumeLevel += 1;
            } else {
                System.err.println("ERROR: Reached maximum volume level.");
            }
        } else {
            System.err.println("ERROR: TV is turned off.");
        }
    }

    // Decrements the volume level while TV is turned on only
    public void volumeDown() {
        if (this.on) {
            if (this.volumeLevel > 1) {
                this.volumeLevel -= 1;
            } else {
                System.err.println("ERROR: Reached minimum volume level.");
            }
        } else {
            System.err.println("ERROR: TV is turned off.");
        }
    }
}
