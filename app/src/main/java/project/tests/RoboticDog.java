package project.tests;

public class RoboticDog extends RoboticPet{

    public RoboticDog(String name, String description) {
        super(name, description);
        
    }

    public void walk(){
        System.out.println("You took " + name + " for a walk");
        
        oilLevel-= 15;
        batteryLevel-= 30;
        
        if (oilLevel < 0){
            oilLevel = 0;
        }
        if (oilLevel > 100){
            oilLevel = 100;
        }
        if (batteryLevel< 0){
            batteryLevel = 0;
        }
        if (batteryLevel > 100){
            batteryLevel = 100;
        }
        tick();
    }
}
