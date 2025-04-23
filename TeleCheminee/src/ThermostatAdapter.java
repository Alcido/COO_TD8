import thermos.Thermostat;

public class ThermostatAdapter implements ElectronicObject{
    private Thermostat t;

    public ThermostatAdapter(){
        t = new Thermostat();
    }

    public void allumer(){
        t.monterTemperature();
    }

    public void eteindre(){
        t.baisserTemperature();
    }

    public String toString(){
        return t.toString();
    }
}
