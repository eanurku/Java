package com.anurag.explicittypeconversion;

public class ExplicitTypeConversionDemo {

    public static void main(String[] args) {
        int intValue = 14;
        long longValue = 10;
        float floatValue = 12.4f;
        double doubleValue = 12.9;

        long result6 = intValue;//widening implicit conversion

        int result1 = (int) longValue;//narrowing explicit conversion

        int result2 = (int) floatValue;//narrowing explicit conversion

        //mixing integer types
        // first implicit conversion by compiler to long in expression then explicit conversion to int
        int result4 = (int) (intValue + longValue);

        //mixing integer type and floating type
        // first implicit conversion by compiler to float in expression then explicit conversion to int
        int result3 = (int) (floatValue + intValue);

        //mixing floating types
        //first implicit conversion by compiler to double in expression then explicit conversion to float
        float result5 = (float) (floatValue + doubleValue);

    }
}
