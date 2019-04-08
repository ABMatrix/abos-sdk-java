package com.abmatrix.abos.protocol.core.methods;

import com.abmatrix.abos.protocol.ABOSj;
import com.abmatrix.abos.protocol.core.methods.response.*;

import com.alibaba.fastjson.JSONObject;
import com.cryptape.cita.protocol.CITAjService;
import com.cryptape.cita.protocol.core.JsonRpc2_0CITAj;
import com.cryptape.cita.protocol.core.Request;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

public class JsonRpc2_0ABOSj extends JsonRpc2_0CITAj implements ABOSj {

    public JsonRpc2_0ABOSj(CITAjService CITAjService) {
        super(CITAjService);
    }

    public JsonRpc2_0ABOSj(com.cryptape.cita.protocol.CITAjService CITAjService, long pollingInterval) {
        super(CITAjService, pollingInterval);
    }

    public JsonRpc2_0ABOSj(CITAjService CITAjService, long pollingInterval, ScheduledExecutorService scheduledExecutorService) {
        super(CITAjService, pollingInterval, scheduledExecutorService);
    }

    @Override
    public Request<?, ABOSGetPeers> getPeers() {
        return new Request<>(
                "getPeers",
                Collections.<String>emptyList(),
                CITAjService,
                ABOSGetPeers.class);
    }

    @Override
    public Request<?, ABOSEstimateGas> estimateGas(String from, String to, String value, String data, String blockNumber) {

        JSONObject jsonObject = new JSONObject();

        if (from != null) {

            jsonObject.put("from", from);

        }

        if (to != null) {

            jsonObject.put("to", to);

        }

        if (value != null) {

            jsonObject.put("value", value);

        }

        if (data != null) {

            jsonObject.put("data", data);

        }

        return new Request<>(
                "estimateGas",
                (blockNumber == null)
                        ? Collections.singletonList(jsonObject)
                        : Arrays.asList(jsonObject, blockNumber),
                CITAjService,
                ABOSEstimateGas.class);
    }

    @Override
    public Request<?, ABOSGetGasPrice> getGasPrice() {
        return new Request<>(
                "getGasPrice",
                Collections.<String>emptyList(),
                CITAjService,
                ABOSGetGasPrice.class);
    }

    @Override
    public Request<?, ABOSSyncing> syncing() {
        return new Request<>(
                "syncing",
                Collections.<String>emptyList(),
                CITAjService,
                ABOSSyncing.class);
    }

    @Override
    public Request<?, ABOSGetTransactionReceiptEx> getTransactionReceiptEx(String transactionHash) {
        return new Request<>(
                "getTransactionReceiptEx",
                Collections.singletonList(transactionHash),
                CITAjService,
                ABOSGetTransactionReceiptEx.class);
    }
}
