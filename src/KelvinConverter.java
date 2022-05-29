public class KelvinConverter implements Convert{
    @Override
    public double getConvertedValue(double t) {
        return t + 273.15;
    }
}
