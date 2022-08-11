package structural.adapter;

import structural.adapter.charger.AndroidCharger;
import structural.adapter.charger.AppleCharger;

public class AndroidToAppleChargerAdapter extends AppleCharger {

    private final AndroidCharger androidCharger;

    public AndroidToAppleChargerAdapter(AndroidCharger androidCharger) {
        this.androidCharger = androidCharger;
    }

    @Override
    public void chargeApplePhones() {
        System.out.println("You are using a AndroidToAppleChargerAdapter");
        androidCharger.chargeAndroidPhones(); //android charger doesn't know that it is charging an Apple device.
    }
}