package structural.adapter;

import structural.adapter.charger.AndroidCharger;
import structural.adapter.charger.AppleCharger;
import structural.adapter.phone.ApplePhone;

public class AdapterPatternExample {

    public static void main(String[] args) {
        ApplePhone applePhone = new ApplePhone();
        AndroidCharger androidCharger = new AndroidCharger();

        System.out.println("We have an apple phone and an android charger...!");

        AppleCharger androidToAppleChargerAdapter = new AndroidToAppleChargerAdapter(androidCharger); //Adapter Pattern

        System.out.println("Created an Apple Charger by converting an android charger");

        applePhone.plugAppleCharger(androidToAppleChargerAdapter);
        applePhone.charge();
    }
}