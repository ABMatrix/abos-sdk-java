package com.abmatrix.abos.protocol.methods.response;

import com.cryptape.cita.protocol.core.Response;

import java.util.List;

public class ABOSGetTransactionReceiptEx extends Response<ABOSGetTransactionReceiptEx> {

    private String transactionHash;
    private String transactionIndex;
    private String blockHash;
    private String blockNumber;
    private String cumulativeQuotaUsed;
    private String quotaUsed;
    private String contractAddress;
    private List<LogsBean> logs;
    private String root;
    private String logsBloom;
    private String errorMessage;
    private String value;
    private String from;
    private String to;
    private String fromBalance;
    private String toBalance;
    private String data;
    private String quotaLimit;
    private String quotaPrice;
    private String quotaCost;

    public String getTransactionHash() {
        return transactionHash;
    }

    public void setTransactionHash(String transactionHash) {
        this.transactionHash = transactionHash;
    }

    public String getTransactionIndex() {
        return transactionIndex;
    }

    public void setTransactionIndex(String transactionIndex) {
        this.transactionIndex = transactionIndex;
    }

    public String getBlockHash() {
        return blockHash;
    }

    public void setBlockHash(String blockHash) {
        this.blockHash = blockHash;
    }

    public String getBlockNumber() {
        return blockNumber;
    }

    public void setBlockNumber(String blockNumber) {
        this.blockNumber = blockNumber;
    }

    public String getCumulativeQuotaUsed() {
        return cumulativeQuotaUsed;
    }

    public void setCumulativeQuotaUsed(String cumulativeQuotaUsed) {
        this.cumulativeQuotaUsed = cumulativeQuotaUsed;
    }

    public String getContractAddress() {
        return contractAddress;
    }

    public void setContractAddress(String contractAddress) {
        this.contractAddress = contractAddress;
    }

    public String getRoot() {
        return root;
    }

    public void setRoot(String root) {
        this.root = root;
    }

    public String getLogsBloom() {
        return logsBloom;
    }

    public void setLogsBloom(String logsBloom) {
        this.logsBloom = logsBloom;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public List<LogsBean> getLogs() {
        return logs;
    }

    public void setLogs(List<LogsBean> logs) {
        this.logs = logs;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getFromBalance() {
        return fromBalance;
    }

    public void setFromBalance(String fromBalance) {
        this.fromBalance = fromBalance;
    }

    public String getToBalance() {
        return toBalance;
    }

    public void setToBalance(String toBalance) {
        this.toBalance = toBalance;
    }

    public String getQuotaUsed() {
        return quotaUsed;
    }

    public void setQuotaUsed(String quotaUsed) {
        this.quotaUsed = quotaUsed;
    }

    public String getQuotaLimit() {
        return quotaLimit;
    }

    public void setQuotaLimit(String quotaLimit) {
        this.quotaLimit = quotaLimit;
    }

    public String getQuotaPrice() {
        return quotaPrice;
    }

    public void setQuotaPrice(String quotaPrice) {
        this.quotaPrice = quotaPrice;
    }

    public String getQuotaCost() {
        return quotaCost;
    }

    public void setQuotaCost(String quotaCost) {
        this.quotaCost = quotaCost;
    }

    public static class LogsBean {

        private String address;
        private String data;
        private String blockHash;
        private String blockNumber;
        private String transactionHash;
        private String transactionIndex;
        private String logIndex;
        private String transactionLogIndex;
        private List<String> topics;

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        public String getBlockHash() {
            return blockHash;
        }

        public void setBlockHash(String blockHash) {
            this.blockHash = blockHash;
        }

        public String getBlockNumber() {
            return blockNumber;
        }

        public void setBlockNumber(String blockNumber) {
            this.blockNumber = blockNumber;
        }

        public String getTransactionHash() {
            return transactionHash;
        }

        public void setTransactionHash(String transactionHash) {
            this.transactionHash = transactionHash;
        }

        public String getTransactionIndex() {
            return transactionIndex;
        }

        public void setTransactionIndex(String transactionIndex) {
            this.transactionIndex = transactionIndex;
        }

        public String getLogIndex() {
            return logIndex;
        }

        public void setLogIndex(String logIndex) {
            this.logIndex = logIndex;
        }

        public String getTransactionLogIndex() {
            return transactionLogIndex;
        }

        public void setTransactionLogIndex(String transactionLogIndex) {
            this.transactionLogIndex = transactionLogIndex;
        }

        public List<String> getTopics() {
            return topics;
        }

        public void setTopics(List<String> topics) {
            this.topics = topics;
        }

        @Override
        public String toString() {
            return "LogsBean{" +
                    "address='" + address + '\'' +
                    ", data='" + data + '\'' +
                    ", blockHash='" + blockHash + '\'' +
                    ", blockNumber='" + blockNumber + '\'' +
                    ", transactionHash='" + transactionHash + '\'' +
                    ", transactionIndex='" + transactionIndex + '\'' +
                    ", logIndex='" + logIndex + '\'' +
                    ", transactionLogIndex='" + transactionLogIndex + '\'' +
                    ", topics=" + topics +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "ABOSGetTransactionReceipt{" +
                "transactionHash='" + transactionHash + '\'' +
                ", transactionIndex='" + transactionIndex + '\'' +
                ", blockHash='" + blockHash + '\'' +
                ", blockNumber='" + blockNumber + '\'' +
                ", cumulativeQuotaUsed='" + cumulativeQuotaUsed + '\'' +
                ", quotaUsed='" + quotaUsed + '\'' +
                ", contractAddress='" + contractAddress + '\'' +
                ", root='" + root + '\'' +
                ", logsBloom='" + logsBloom + '\'' +
                ", errorMessage='" + errorMessage + '\'' +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", value='" + value + '\'' +
                ", logs=" + logs +
                ", data='" + data + '\'' +
                ", fromBalance='" + fromBalance + '\'' +
                ", toBalance='" + toBalance + '\'' +
                ", quotaLimit='" + quotaLimit + '\'' +
                ", quotaPrice='" + quotaPrice + '\'' +
                ", quotaCost='" + quotaCost + '\'' +
                '}';
    }
}
