public class TemperatureConverter {
    public double fahrenheitToCelsius(double fahrenheitTemp){
        return (fahrenheitTemp - 32)*5/9;
    }

    public double celsiusToFahrenheit(double celsiusTemp){
        return celsiusTemp*9/5 + 32;
    }

    public boolean isExtremeTemperature(double celsiusTemp){
        if(celsiusTemp < -40 || celsiusTemp > 50){
            return true;
        } else {
            return false;
        }
    }

    public double kelvinToCelsius(double kelvin){
        return kelvin - 273.15;
    }
}
