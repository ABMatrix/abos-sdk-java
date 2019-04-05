package com.abmatrix.abos.protocol.methods.response;

import com.cryptape.cita.protocol.core.Response;

import java.util.List;

public class ABOSGetMetaData extends Response<ABOSGetMetaData> {

    private int chainId;
    private String chainName;
    private String operator;
    private String website;
    private long genesisTimestamp;
    private int blockInterval;
    private String tokenName;
    private String tokenSymbol;
    private String tokenAvatar;
    private int version;
    private int economicalModel;
    private List<String> validators;

    public int getChainId() {
        return chainId;
    }

    public void setChainId(int chainId) {
        this.chainId = chainId;
    }

    public String getChainName() {
        return chainName;
    }

    public void setChainName(String chainName) {
        this.chainName = chainName;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public long getGenesisTimestamp() {
        return genesisTimestamp;
    }

    public void setGenesisTimestamp(long genesisTimestamp) {
        this.genesisTimestamp = genesisTimestamp;
    }

    public int getBlockInterval() {
        return blockInterval;
    }

    public void setBlockInterval(int blockInterval) {
        this.blockInterval = blockInterval;
    }

    public String getTokenName() {
        return tokenName;
    }

    public void setTokenName(String tokenName) {
        this.tokenName = tokenName;
    }

    public String getTokenSymbol() {
        return tokenSymbol;
    }

    public void setTokenSymbol(String tokenSymbol) {
        this.tokenSymbol = tokenSymbol;
    }

    public String getTokenAvatar() {
        return tokenAvatar;
    }

    public void setTokenAvatar(String tokenAvatar) {
        this.tokenAvatar = tokenAvatar;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public int getEconomicalModel() {
        return economicalModel;
    }

    public void setEconomicalModel(int economicalModel) {
        this.economicalModel = economicalModel;
    }

    public List<String> getValidators() {
        return validators;
    }

    public void setValidators(List<String> validators) {
        this.validators = validators;
    }

}
