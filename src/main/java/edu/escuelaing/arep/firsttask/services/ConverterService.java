package edu.escuelaing.arep.firsttask.services;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Service
public class ConverterService {
    // TODO: Verificar que solo son números
    // TODO: Validar anti letras

    /**
     * Convert a Celsius degrees measure to Fahrenheit degrees.
     * @param value A measure in Celsius degrees.
     * @return The value in Fahrenheit.
     */
    public double celsiusToFahrenheit(double value){
        double res = (value * 9/5) + 32;

        return res;
    }

    /**
     * Convert a Fahrenheit degrees measure to Celsius degrees.
     * @param value A measure in Fahrenheit degrees.
     * @return The value in Celsius.
     */
    public double fahrenheitToCelsius(double value){
        double res = (value - 32) * 5/9;

        res = BigDecimal.valueOf(res)
                .setScale(4, RoundingMode.HALF_UP)
                .doubleValue();

        return res;
    }
}
