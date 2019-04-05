package com.abmatrix.abos.protocol.methods.response;

import com.cryptape.cita.protocol.core.Response;
import com.cryptape.cita.utils.Numeric;

import java.math.BigInteger;


public class ABOSGetGasPrice extends Response<String> {
    public BigInteger getGasPrice() {
        return Numeric.decodeQuantity(getResult());
    }
}
