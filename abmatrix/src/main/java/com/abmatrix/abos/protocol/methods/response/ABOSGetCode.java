package com.abmatrix.abos.protocol.methods.response;

import com.cryptape.cita.protocol.core.Response;

public class ABOSGetCode extends Response<String> {
    public String getCode() {
        return getResult();
    }
}
