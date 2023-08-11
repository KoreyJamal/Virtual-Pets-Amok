package Virtual_pet;

public class RoboticDog extends RoboticPet{

    public RoboticDog(String name, String description) {
        super(name, description);
        
    }

    public void walk(){
        System.out.println("You took " + name + " for a walk");
        
        oilLevel-= 15;
        batteryLevel-= 30;
        tick();
        
        oilLevel = Math.max(0, Math.min(100, oilLevel));
        batteryLevel = Math.max(0, Math.min(100, batteryLevel));
        
    }
}
