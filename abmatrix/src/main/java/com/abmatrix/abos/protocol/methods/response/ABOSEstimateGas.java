package com.abmatrix.abos.protocol.methods.response;

import com.cryptape.cita.protocol.core.Response;
import com.cryptape.cita.utils.Numeric;

import java.math.BigInteger;


public class ABOSEstimateGas extends Response<String> {
    public BigInteger getEstimateGas() {
        return Numeric.decodeQuantity(getResult());
    }
}
