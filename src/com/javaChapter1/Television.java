package com.myFirstTest;

public class Television {
    private String name;
    private double powerMode;
    //private int sleepMode ;
    private boolean IsOn;
    private int channel;
    private int volume;
   // private boolean IsVideoMode;

    public Television(String name,double powerMode){
        this.name = name;
        this.powerMode = powerMode;
            final double MINIMUM_VOLTAGE = 219;
            final double MAXIMUM_VOLTAGE = 241;
            if(powerMode > MINIMUM_VOLTAGE  && powerMode < MAXIMUM_VOLTAGE){
                System.out.println("NORMAL VOLTAGE. TOSHIBA is currently at " + powerMode);
            }else{
                System.out.println("BAD VOLTAGE " + "TV is Turning Off....");
            }
        }


//    public void power(int powerMode){
//        if(IsOn){
//            final double MINIMUM_VOLTAGE = 219;
//            final double MAXIMUM_VOLTAGE = 241;
//            if(powerMode > MINIMUM_VOLTAGE  && powerMode < MAXIMUM_VOLTAGE){
//                this.powerMode = powerMode;
//                System.out.println("Your Power Supply is currently at " + powerMode);
//            }else{
//                System.out.println("TV is Turning Off....");
//            }
//        }
//    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public boolean getIsOn(){
        return IsOn;
    }
    public void setOn(boolean On){
        this.IsOn = On;
    }
    public double getPowerMode(){
        return powerMode;
    }
    public void setPowerMode(double powerMode){
        this.powerMode = powerMode;
    }

    /**
     public int getSleepMode(){
     return sleepMode;
     }

     public void setSleepMode(int channel,int sleepMode){
     if (IsOn == true){
     if(channel = sleepMode){
     System.out.println("O boy Your TV wan go Sleep oooo...");
     }
     }
     else{
     this.channel = channel;
     }
     }
     */

    public int getChannel(){
        return channel;
    }
    public void setChannel(int newChannel){
        if(IsOn){
            final int MINIMUM_CHANNEL = 0;
            final int MAXIMUM_CHANNEL = 51;
            if(newChannel > MINIMUM_CHANNEL  && newChannel < MAXIMUM_CHANNEL){
                this.channel = newChannel;
                System.out.println("Na Channel " + channel + " u dey ooo");
            }
            else{
                System.out.println("I no go pass Channel 50!!!");
            }
        }else{
            System.out.println("Turn On your TV");
        }

    }
    public void increaseChannel(int channel){
        if(IsOn){
            final int MINIMUM_CHANNEL = 0;
            final int MAXIMUM_CHANNEL = 50;
            if(channel > MAXIMUM_CHANNEL || channel < MINIMUM_CHANNEL){
                System.out.println("O boy! Come Of it and Check your Remote");
            }
            this.channel = channel++;
        }else{
            System.out.println("O boy! Turn ON your TV");
        }

    }

    public void decreaseChannel(){
        channel = channel - 1;
    }
    public int getVolume(){
        return volume;
    }
    public void setVolume(int newVolume){
        final int MINIMUM_VOLUME = 0;
        final int MAXIMUM_VOLUME = 101;
        if(newVolume > MINIMUM_VOLUME  && newVolume < MAXIMUM_VOLUME){
            this.volume = newVolume;
        }
        else{
            System.out.println("I no go pass Channel 100!!!");
        }
    }

    public void increaseVolume(){
        final int MINIMUM_VOLUME = 0;
        final int MAXIMUM_VOLUME = 100;
        if(volume > MAXIMUM_VOLUME  || volume < MINIMUM_VOLUME){
            System.out.println("O boy!READ MY LIPS.DO YOU WANT GO DEAF???");
        }
        this.volume = volume++;
    }

    public void decreaseVolume(){
        volume = volume - 1;
    }
}

