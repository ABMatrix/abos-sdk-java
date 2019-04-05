package com.abmatrix.abos.protocol.methods.response;

import com.cryptape.cita.protocol.core.Response;

public class ABOSGetStateProof extends Response<String> {
    public String getStateProof() {
        return getResult();
    }
}
