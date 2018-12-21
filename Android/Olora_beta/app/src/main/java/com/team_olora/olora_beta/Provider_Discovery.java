package com.team_olora.olora_beta;

import com.squareup.otto.Bus;
import com.squareup.otto.Subscribe;

public final class Provider_Discovery {
    private static final Bus BUS = new Bus();

    public static Bus getInstance() {
        return BUS;
    }

    private Provider_Discovery() {//No instance
    }
}
