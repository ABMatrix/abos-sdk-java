package com.abmatrix.abos.protocol.methods.response;

import com.cryptape.cita.protocol.core.Response;

public class ABOSGetAbi extends Response<String> {
    public String getAbi() {
        return getResult();
    }
}
