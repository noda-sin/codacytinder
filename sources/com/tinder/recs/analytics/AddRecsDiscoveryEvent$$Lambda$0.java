package com.tinder.recs.analytics;

import rx.CompletableEmitter;
import rx.functions.Action1;

final /* synthetic */ class AddRecsDiscoveryEvent$$Lambda$0 implements Action1 {
    private final AddRecsDiscoveryEvent arg$1;
    private final Boolean arg$2;

    AddRecsDiscoveryEvent$$Lambda$0(AddRecsDiscoveryEvent addRecsDiscoveryEvent, Boolean bool) {
        this.arg$1 = addRecsDiscoveryEvent;
        this.arg$2 = bool;
    }

    public void call(Object obj) {
        this.arg$1.lambda$execute$0$AddRecsDiscoveryEvent(this.arg$2, (CompletableEmitter) obj);
    }
}
