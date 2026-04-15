package org.example.grupo3;

import java.math.BigInteger;

public class ex52 {

    public BigInteger dividaRei() {

        BigInteger total = BigInteger.ZERO;
        BigInteger casa = BigInteger.ONE;

        for (int i = 1; i <= 64; i++) {
            total = total.add(casa);
            casa = casa.multiply(BigInteger.valueOf(2));
        }
        return total;
    }
}
