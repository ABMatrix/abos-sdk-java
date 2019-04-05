package com.abmatrix.abos.protocol.methods;

import com.abmatrix.abos.protocol.methods.response.*;

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

    public JsonRpc2_0ABOSj(CITAjService CITAjService, long pollingInterval, ScheduledExecutorService scheduledExecutorService) {
        super(CITAjService, pollingInterval, scheduledExecutorService);
    }

    @Override
    public Request<?, ABOSPeerCount> peerCount() {
        return new Request<>(
                "peerCount",
                Collections.<String>emptyList(),
                CITAjService,
                ABOSPeerCount.class);
    }

    @Override
    public Request<?, ABOSBlockNumber> blockNumber() {
        return new Request<>(
                "blockNumber",
                Collections.<String>emptyList(),
                CITAjService,
                ABOSBlockNumber.class);
    }

    @Override
    public Request<?, ABOSGetBlockByHash> getBlockByHash(String hash) {
        return new Request<>(
                "getBlockByHash",
                Arrays.asList(hash, true),
                CITAjService,
                ABOSGetBlockByHash.class);
    }

    @Override
    public Request<?, ABOSGetBlockByNumber> getBlockByNumber(String blockHeight) {
        return new Request<>(
                "getBlockByNumber",
                Arrays.asList(blockHeight, true),
                CITAjService,
                ABOSGetBlockByNumber.class);
    }

    @Override
    public Request<?, ABOSGetTransaction> getTransaction(String hash) {
        return new Request<>(
                "getTransaction",
                Collections.singletonList(hash),
                CITAjService,
                ABOSGetTransaction.class);
    }

    @Override
    public Request<?, ABOSGetTransactionCount> getTransactionCount(String address, String BlockNumber) {
        return new Request<>(
                "getTransactionCount",
                Arrays.asList(address, BlockNumber),
                CITAjService,
                ABOSGetTransactionCount.class);
    }

    @Override
    public Request<?, ABOSGetCode> getCode(String address, String BlockNumber) {
        return new Request<>(
                "getCode",
                Arrays.asList(address, BlockNumber),
                CITAjService,
                ABOSGetCode.class);
    }

    @Override
    public Request<?, ABOSGetAbi> getAbi(String address, String BlockNumber) {
        return new Request<>(
                "getAbi",
                Arrays.asList(address, BlockNumber),
                CITAjService,
                ABOSGetAbi.class);
    }

    @Override
    public Request<?, ABOSGetBalance> getBalance(String address, String BlockNumber) {
        return new Request<>(
                "getBalance",
                Arrays.asList(address, BlockNumber),
                CITAjService,
                ABOSGetBalance.class);
    }

    @Override
    public Request<?, ABOSGetTransactionProof> getTransactionProof(String transactionHash) {
        return new Request<>(
                "getTransactionProof",
                Collections.singletonList(transactionHash),
                CITAjService,
                ABOSGetTransactionProof.class);
    }

    @Override
    public Request<?, ABOSGetMetaData> getMetaData(String BlockNumber) {
        return new Request<>(
                "getMetaData",
                Collections.singletonList(BlockNumber),
                CITAjService,
                ABOSGetMetaData.class);
    }

    @Override
    public Request<?, ABOSGetBlockHeader> getBlockHeader(String BlockNumber) {
        return new Request<>(
                "getBlockHeader",
                Collections.singletonList(BlockNumber),
                CITAjService,
                ABOSGetBlockHeader.class);
    }

    @Override
    public Request<?, ABOSGetStateProof> getStateProof(String address, String position, String BlockNumber) {
        return new Request<>(
                "getStateProof",
                Arrays.asList(address, position, BlockNumber),
                CITAjService,
                ABOSGetStateProof.class);
    }

    @Override
    public Request<?, ABOSGetTransactionReceipt> getTransactionReceipt(String transactionHash) {
        return new Request<>(
                "getTransactionReceipt",
                Collections.singletonList(transactionHash),
                CITAjService,
                ABOSGetTransactionReceipt.class);
    }

    @Override
    public Request<?, ABOSCall> call(String from, String to, String data, String blockNumber) {

        JSONObject jsonObject = new JSONObject();

        if (from != null) {

            jsonObject.put("from", from);

        }

        if (to != null) {

            jsonObject.put("to", to);

        }

        if (data != null) {

            jsonObject.put("data", data);

        }

        return new Request<>(
                "call",
                Arrays.asList(jsonObject, blockNumber),
                CITAjService,
                ABOSCall.class);
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
