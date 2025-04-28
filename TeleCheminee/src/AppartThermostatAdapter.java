import appartement.AppareilAppartLampe;
import appartement.AppareilAppartThermostat;

public class AppartThermostatAdapter implements ElectronicObject{

    private AppareilAppartThermostat thermostat;
    private String desc;

    public AppartThermostatAdapter(AppareilAppartThermostat t, String desc) {
        thermostat = t;
        this.desc = desc;
    }

    public void allumer() {
        thermostat.augmenterTemperature();
    }

    public void eteindre() {
        thermostat.baisserTemperature();
    }

    public AppareilAppartThermostat getThermostat() {
        return thermostat;
    }

}
