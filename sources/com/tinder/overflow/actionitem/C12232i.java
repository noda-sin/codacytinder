package com.tinder.overflow.actionitem;

import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.overflow.actionitem.i */
final class C12232i implements Consumer {
    /* renamed from: a */
    private final /* synthetic */ Function1 f39599a;

    C12232i(Function1 function1) {
        this.f39599a = function1;
    }

    public final /* synthetic */ void accept(T t) {
        C2668g.a(this.f39599a.invoke(t), "invoke(...)");
    }
}
