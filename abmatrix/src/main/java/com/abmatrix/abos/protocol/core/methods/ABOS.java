package com.abmatrix.abos.protocol.core.methods;

import com.abmatrix.abos.protocol.core.methods.response.*;
import com.cryptape.cita.protocol.CITAjService;
import com.cryptape.cita.protocol.core.CITA;
import com.cryptape.cita.protocol.core.JsonRpc2_0CITAj;
import com.cryptape.cita.protocol.core.Request;
import com.cryptape.cita.protocol.rx.CITAjRx;

import java.util.concurrent.ScheduledExecutorService;

/**
 * Core ABOS JSON-RPC API.
 */
public interface ABOS {

    Request<?, ABOSGetPeers> getPeers();

    Request<?, ABOSEstimateGas> estimateGas(String from, String to, String value, String data, String blockNumber);

    Request<?, ABOSGetGasPrice> getGasPrice();

    Request<?, ABOSSyncing> syncing();

    Request<?, ABOSGetTransactionReceiptEx> getTransactionReceiptEx(String transactionHash);

}
