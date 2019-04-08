package com.abmatrix.abos.protocol;

import com.abmatrix.abos.protocol.core.methods.ABOS;
import com.abmatrix.abos.protocol.core.methods.JsonRpc2_0ABOSj;
import com.cryptape.cita.protocol.CITAj;
import com.cryptape.cita.protocol.CITAjService;

import java.util.concurrent.ScheduledExecutorService;

public interface ABOSj extends CITAj, ABOS {

    /**
     * Construct a new ABOSj instance.
     *
     * @param citajService citaj service instance - i.e. HTTP or IPC
     * @return new ABOSj instance
     */
    static ABOSj build(CITAjService citajService) {
        return new JsonRpc2_0ABOSj(citajService);
    }

    static ABOSj build(CITAjService citajService, long pollingInterval) {
        return new JsonRpc2_0ABOSj(citajService, pollingInterval);
    }

    /**
     * Construct a new ABOSj instance.
     *
     * @param citajService citaj service instance - i.e. HTTP or IPC
     * @param pollingInterval polling interval for responses from network nodes
     * @param scheduledExecutorService executor service to use for scheduled tasks.
     *                                 <strong>You are responsible for terminating this thread
     *                                 pool</strong>
     * @return new ABOSj instance
     */
    static ABOSj build(
            CITAjService citajService, long pollingInterval,
            ScheduledExecutorService scheduledExecutorService) {
        return new JsonRpc2_0ABOSj(citajService, pollingInterval, scheduledExecutorService);
    }

}
