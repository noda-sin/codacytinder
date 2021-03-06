package com.tinder.match.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.SimpleVoidUseCase;
import com.tinder.etl.event.lo;
import com.tinder.utils.RxUtils;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/match/analytics/AddMatchListEvent;", "Lcom/tinder/domain/common/usecase/SimpleVoidUseCase;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "analyticsFactory", "Lcom/tinder/match/analytics/MatchListAnalyticsFactory;", "(Lcom/tinder/analytics/fireworks/Fireworks;Lcom/tinder/match/analytics/MatchListAnalyticsFactory;)V", "execute", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.match.analytics.a */
public final class C12035a implements SimpleVoidUseCase {
    /* renamed from: a */
    private final C2630h f39143a;
    /* renamed from: b */
    private final C9845l f39144b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/etl/event/MatchListEvent;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.match.analytics.a$a */
    static final class C13397a<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ C12035a f42530a;

        C13397a(C12035a c12035a) {
            this.f42530a = c12035a;
        }

        public /* synthetic */ Object call(Object obj) {
            m51831a((lo) obj);
            return C15813i.f49016a;
        }

        /* renamed from: a */
        public final void m51831a(lo loVar) {
            this.f42530a.f39143a.a(loVar);
        }
    }

    @Inject
    public C12035a(@NotNull C2630h c2630h, @NotNull C9845l c9845l) {
        C2668g.b(c2630h, "fireworks");
        C2668g.b(c9845l, "analyticsFactory");
        this.f39143a = c2630h;
        this.f39144b = c9845l;
    }

    public void execute() {
        this.f39144b.m40528a().d(new C13397a(this)).b().b(Schedulers.io()).b(RxUtils.b());
    }
}
