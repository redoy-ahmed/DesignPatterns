package structural.adapter;

public class SpeedAdapter implements ISpeedAdapter {

    private final ICar ICar;

    public SpeedAdapter(ICar ICar) {
        this.ICar = ICar;
    }

    @Override
    public double getSpeed() {
        return convertMPHtoKMPH(ICar.getSpeed());
    }

    private double convertMPHtoKMPH(double mph) {
        return mph * 1.60934;
    }
}