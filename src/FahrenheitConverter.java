public class FahrenheitConverter implements Convert{
    @Override
    public double getConvertedValue(double t) {
        return 1.8 * t + 32;
    }
}
