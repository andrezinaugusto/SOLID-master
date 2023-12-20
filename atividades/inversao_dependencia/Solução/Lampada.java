interface LampadaInter {
    public function conecta();
}

public class LightBulb implements LampadaInter{
    private LightBulb lightBulb;

    public LightBulb( LampadaInter $lightbulb) {
        this.lightBulb = new LightBulb();
    }
    
    public void turnOn() {
        System.out.println("Light bulb turned on");
    }

    public void turnOff() {
        System.out.println("Light bulb turned off");
    }
}
