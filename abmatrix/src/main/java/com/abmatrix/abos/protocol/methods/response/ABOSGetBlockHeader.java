package com.abmatrix.abos.protocol.methods.response;

import com.cryptape.cita.protocol.core.Response;

public class ABOSGetBlockHeader extends Response<String> {
    public String getBlockHeader() {
        return getResult();
    }
}
