package com.google.android.gms.internal;

import com.google.android.gms.internal.wh.C8168a;
import com.google.android.gms.internal.zzffu.C4479g;
import com.google.android.gms.internal.zzffu.C7363b;
import com.google.android.gms.internal.zzffu.C8036a;
import com.google.android.gms.internal.zzffu.zzh;
import java.io.IOException;

public final class wd extends zzffu<wd, C8166a> implements zzfhg {
    /* renamed from: g */
    private static final wd f29214g;
    /* renamed from: h */
    private static volatile zzfhk<wd> f29215h;
    /* renamed from: d */
    private int f29216d;
    /* renamed from: e */
    private wh f29217e;
    /* renamed from: f */
    private zzfes f29218f = zzfes.f16682a;

    /* renamed from: com.google.android.gms.internal.wd$a */
    public static final class C8166a extends C8036a<wd, C8166a> implements zzfhg {
        private C8166a() {
            super(wd.f29214g);
        }

        /* renamed from: a */
        public final C8166a m34688a(int i) {
            m34101b();
            ((wd) this.a).m34692a(0);
            return this;
        }

        /* renamed from: a */
        public final C8166a m34689a(wh whVar) {
            m34101b();
            ((wd) this.a).m34696a(whVar);
            return this;
        }

        /* renamed from: a */
        public final C8166a m34690a(zzfes zzfes) {
            m34101b();
            ((wd) this.a).m34697b(zzfes);
            return this;
        }
    }

    static {
        zzffu wdVar = new wd();
        f29214g = wdVar;
        wdVar.mo7626a(C4479g.f16690f, null, null);
        wdVar.f28829b.m18929c();
    }

    private wd() {
    }

    /* renamed from: a */
    public static wd m34691a(zzfes zzfes) throws zzfge {
        return (wd) zzffu.m34105a(f29214g, zzfes);
    }

    /* renamed from: a */
    private final void m34692a(int i) {
        this.f29216d = i;
    }

    /* renamed from: a */
    private final void m34696a(wh whVar) {
        if (whVar == null) {
            throw new NullPointerException();
        }
        this.f29217e = whVar;
    }

    /* renamed from: b */
    private final void m34697b(zzfes zzfes) {
        if (zzfes == null) {
            throw new NullPointerException();
        }
        this.f29218f = zzfes;
    }

    /* renamed from: c */
    public static C8166a m34698c() {
        zzffu zzffu = f29214g;
        C8036a c8036a = (C8036a) zzffu.mo7626a(C4479g.f16692h, null, null);
        c8036a.m34100a(zzffu);
        return (C8166a) c8036a;
    }

    /* renamed from: a */
    public final int m34700a() {
        return this.f29216d;
    }

    /* renamed from: a */
    protected final Object mo7626a(int i, Object obj, Object obj2) {
        boolean z = false;
        switch (we.f16605a[i - 1]) {
            case 1:
                return new wd();
            case 2:
                return f29214g;
            case 3:
                return null;
            case 4:
                return new C8166a();
            case 5:
                zzh zzh = (zzh) obj;
                wd wdVar = (wd) obj2;
                this.f29216d = zzh.zza(this.f29216d != 0, this.f29216d, wdVar.f29216d != 0, wdVar.f29216d);
                this.f29217e = (wh) zzh.zza(this.f29217e, wdVar.f29217e);
                boolean z2 = this.f29218f != zzfes.f16682a;
                zzfes zzfes = this.f29218f;
                if (wdVar.f29218f != zzfes.f16682a) {
                    z = true;
                }
                this.f29218f = zzh.zza(z2, zzfes, z, wdVar.f29218f);
                return this;
            case 6:
                abk abk = (abk) obj;
                abq abq = (abq) obj2;
                if (abq != null) {
                    while (!z) {
                        try {
                            i = abk.mo4174a();
                            if (i != 0) {
                                if (i == 8) {
                                    this.f29216d = abk.mo4186i();
                                } else if (i == 18) {
                                    C8036a c8036a;
                                    if (this.f29217e != null) {
                                        zzffu zzffu = this.f29217e;
                                        C8036a c8036a2 = (C8036a) zzffu.mo7626a(C4479g.f16692h, null, null);
                                        c8036a2.m34100a(zzffu);
                                        c8036a = (C8168a) c8036a2;
                                    } else {
                                        c8036a = null;
                                    }
                                    this.f29217e = (wh) abk.mo4175a(wh.m34708a(), abq);
                                    if (c8036a != null) {
                                        c8036a.m34100a(this.f29217e);
                                        this.f29217e = (wh) c8036a.m34102c();
                                    }
                                } else if (i == 26) {
                                    this.f29218f = abk.mo4185h();
                                } else if (m34113a(i, abk)) {
                                }
                            }
                            z = true;
                        } catch (zzfge e) {
                            throw new RuntimeException(e.m20323a(this));
                        } catch (IOException e2) {
                            throw new RuntimeException(new zzfge(e2.getMessage()).m20323a(this));
                        }
                    }
                    break;
                }
                throw new NullPointerException();
            case 7:
                break;
            case 8:
                if (f29215h == null) {
                    synchronized (wd.class) {
                        if (f29215h == null) {
                            f29215h = new C7363b(f29214g);
                        }
                    }
                }
                return f29215h;
            case 9:
                return Byte.valueOf((byte) 1);
            case 10:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
        return f29214g;
    }

    /* renamed from: b */
    public final zzfes m34702b() {
        return this.f29218f;
    }

    public final void zza(zzffg zzffg) throws IOException {
        if (this.f29216d != 0) {
            zzffg.mo6961c(1, this.f29216d);
        }
        if (this.f29217e != null) {
            zzffg.mo6946a(2, this.f29217e == null ? wh.m34708a() : this.f29217e);
        }
        if (!this.f29218f.m20310b()) {
            zzffg.mo6945a(3, this.f29218f);
        }
        this.b.m18926a(zzffg);
    }

    public final int zzho() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f29216d != 0) {
            i2 = 0 + zzffg.m27546e(1, this.f29216d);
        }
        if (this.f29217e != null) {
            i2 += zzffg.m27537c(2, this.f29217e == null ? wh.m34708a() : this.f29217e);
        }
        if (!this.f29218f.m20310b()) {
            i2 += zzffg.m27536c(3, this.f29218f);
        }
        i2 += this.b.m18931e();
        this.c = i2;
        return i2;
    }
}