package com.abmatrix.abos.protocol.methods.response;

import com.cryptape.cita.protocol.core.Response;

public class ABOSGetTransactionProof extends Response<String> {
    public String getTransactionProo() {
        return getResult();
    }
}
