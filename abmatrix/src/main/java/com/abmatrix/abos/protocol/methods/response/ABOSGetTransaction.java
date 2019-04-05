package com.abmatrix.abos.protocol.methods.response;

import com.cryptape.cita.protocol.core.Response;

public class ABOSGetTransaction extends Response<ABOSGetTransaction> {

    private String hash;
    private String content;
    private String blockNumber;
    private String blockHash;
    private String index;

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getBlockNumber() {
        return blockNumber;
    }

    public void setBlockNumber(String blockNumber) {
        this.blockNumber = blockNumber;
    }

    public String getBlockHash() {
        return blockHash;
    }

    public void setBlockHash(String blockHash) {
        this.blockHash = blockHash;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }
}
