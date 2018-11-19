package com.tinder.crashindicator.analytics;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/tinder/crashindicator/analytics/SettingsOptionEventDispatcher$Request;", "", "source", "", "type", "(Ljava/lang/String;Ljava/lang/String;)V", "getSource", "()Ljava/lang/String;", "getType", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class c$a {
    @NotNull
    /* renamed from: a */
    private final String f30445a;
    @NotNull
    /* renamed from: b */
    private final String f30446b;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c$a) {
                c$a c_a = (c$a) obj;
                if (C2668g.a(this.f30445a, c_a.f30445a) && C2668g.a(this.f30446b, c_a.f30446b)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f30445a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f30446b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Request(source=");
        stringBuilder.append(this.f30445a);
        stringBuilder.append(", type=");
        stringBuilder.append(this.f30446b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public c$a(@NotNull String str, @NotNull String str2) {
        C2668g.b(str, "source");
        C2668g.b(str2, "type");
        this.f30445a = str;
        this.f30446b = str2;
    }

    @NotNull
    /* renamed from: a */
    public final String m36711a() {
        return this.f30445a;
    }

    @NotNull
    /* renamed from: b */
    public final String m36712b() {
        return this.f30446b;
    }
}