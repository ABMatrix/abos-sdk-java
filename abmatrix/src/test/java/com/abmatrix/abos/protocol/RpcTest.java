package com.abmatrix.abos.protocol;

import com.cryptape.cita.protocol.CITAjService;
import org.junit.Test;
import com.cryptape.cita.protocol.http.HttpService;

public class RpcTest {

    private CITAjService service = new HttpService("http://47.99.236.158:1339");

    private ABOSj abos = ABOSj.build(service);

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
