package com.abmatrix.abos.protocol.methods;


import com.abmatrix.abos.protocol.methods.response.*;
import com.cryptape.cita.protocol.CITAj;
import com.cryptape.cita.protocol.CITAjService;
import com.cryptape.cita.protocol.core.Request;

public interface ABOSj extends CITAj {

    static ABOSj build(CITAjService CITAjService) {
        return new JsonRpc2_0ABOSj(CITAjService);
    }

    Request<?, ABOSPeerCount> peerCount();

    Request<?, ABOSBlockNumber> blockNumber();

    Request<?, ABOSGetBlockByHash> getBlockByHash(String hash);

    Request<?, ABOSGetBlockByNumber> getBlockByNumber(String blockHeight);

    Request<?, ABOSGetTransaction> getTransaction(String hash);

    Request<?, ABOSGetTransactionCount> getTransactionCount(String address, String BlockNumber);

    Request<?, ABOSGetCode> getCode(String address, String BlockNumber);

    Request<?, ABOSGetAbi> getAbi(String address, String BlockNumber);

    Request<?, ABOSGetBalance> getBalance(String address, String BlockNumber);

    Request<?, ABOSGetTransactionProof> getTransactionProof(String transactionHash);

    Request<?, ABOSGetMetaData> getMetaData(String BlockNumber);

    Request<?, ABOSGetBlockHeader> getBlockHeader(String BlockNumber);

    Request<?, ABOSGetStateProof> getStateProof(String address, String position, String BlockNumber);

    Request<?, ABOSGetTransactionReceipt> getTransactionReceipt(String transactionHash);

    Request<?, ABOSCall> call(String from, String to, String data, String blockNumber);

    Request<?, ABOSGetPeers> getPeers();

    Request<?, ABOSEstimateGas> estimateGas(String from, String to, String value, String data, String blockNumber);

    Request<?, ABOSGetGasPrice> getGasPrice();

    Request<?, ABOSSyncing> syncing();

    Request<?, ABOSGetTransactionReceiptEx> getTransactionReceiptEx(String transactionHash);

}
