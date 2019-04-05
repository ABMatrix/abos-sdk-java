package com.abmatrix.abos.protocol;

import com.cryptape.cita.protocol.CITAjService;
import org.junit.Test;
import com.cryptape.cita.protocol.http.HttpService;
import com.abmatrix.abos.protocol.methods.ABOSj;

public class RpcTest {

    private CITAjService service = new HttpService("http://192.168.1.200:1338");

    private ABOSj abos = ABOSj.build(service);

    @Test
    public void testPeerCount() throws Exception {

        System.out.println(abos.peerCount().send().getPeerCount());

    }

    @Test
    public void testBlockNumber() throws Exception {

        System.out.println(abos.blockNumber().send().getBlockNumber());

    }

    @Test
    public void testGetBlockByHash() throws Exception {

        System.out.println(abos.getBlockByHash("0xf238112feab8d0c5416d7108eadfeffc23797498466839b775554fa6527847b9").send().getResult());

    }

    @Test
    public void testGetBlockByNumber() throws Exception {

        System.out.println(abos.getBlockByNumber("0x" + Integer.toHexString(3)).send().getResult());

    }

    @Test
    public void testGetTransaction() throws Exception {

        System.out.println(abos.getTransaction("0x8e62fb58b26ef5455c7b529b6c56bc84e731c8ca06cc4b5538622302ad3dce96").send().getResult().getHash());

    }

    @Test
    public void testGetTransactionCount() throws Exception {

        System.out.println(abos.getTransactionCount("0x0dbd369a741319fa5107733e2c9db9929093e3c7", "latest").send().getResult());

    }

    @Test
    public void testGetCode() throws Exception {

        System.out.println(abos.getCode("0x73552bc4e960a1d53013b40074569ea05b950b4d", "latest").send().getResult());

    }

    @Test
    public void testGetAbi() throws Exception {

        System.out.println(abos.getAbi("", "latest").send().getResult());

    }

    @Test
    public void testGetBalance() throws Exception {

        System.out.println(abos.getBalance("0x9dfc655e741a7f1cfea75c9b25e5197c24b67cb6", "latest").send().getResult());

    }

    @Test
    public void testGetTransactionProof() throws Exception {

        System.out.println(abos.getTransactionProof("0x6011915176e24a1cd70e022984ca37c1e4c5a243e32303e87dd510e70da7a1c5").send().getResult());

    }

    @Test
    public void testGetMetaData() throws Exception {

        System.out.println(abos.getMetaData("latest").send().getResult().getVersion());

    }

    @Test
    public void testGetBlockHeader() throws Exception {

        System.out.println(abos.getBlockHeader("latest").send().getResult());

    }

    @Test
    public void testGetStateProof() throws Exception {

        System.out.println(abos.getStateProof("", "", "latest").send().getResult());

    }

    @Test
    public void testGetTransactionReceipt() throws Exception {

        System.out.println(abos.getTransactionReceipt("0x9b5cb468fb34f67ba2663255b1f0aa8e000d037e06c9fa6759cbe99f04cb7eb2").send().getResult());

    }

    @Test
    public void testCall() throws Exception {

        System.out.println(abos.call(null, "0xce1d8d464c1ced95b3487ecada6b495f9fc5785d", "0x18160ddd", "latest").send().getData());

    }

    @Test
    public void testGetPeers() throws Exception {

        System.out.println(abos.getPeers().send().getResult().getPeers());

    }

    @Test
    public void testEstimateGas() throws Exception {

        System.out.println(abos.estimateGas(null, "0x0D9C9CDC6BFF56520772195948A6B13C2b2bAA8a", null, "0xa9059cbb000000000000000000000000f8f6f31a14b73a71a310d7b8a895e20261fe09d40000000000000000000000000000000000000000000000000000000000004e20", "latest").send().getResult());

    }

    @Test
    public void testGetGasPrice() throws Exception {

        System.out.println(abos.getGasPrice().send().getResult());

    }

    @Test
    public void testSyncing() throws Exception {

        System.out.println(abos.syncing().send().getResult());

    }

    @Test
    public void testGetTransactionReceiptEx() throws Exception {

        System.out.println(abos.getTransactionReceiptEx("0x9b5cb468fb34f67ba2663255b1f0aa8e000d037e06c9fa6759cbe99f04cb7eb2").send().getResult());

    }
}
