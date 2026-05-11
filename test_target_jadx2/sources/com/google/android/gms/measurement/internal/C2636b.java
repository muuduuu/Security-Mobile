package com.google.android.gms.measurement.internal;

import android.util.Log;
import j0.C3476a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2636b extends AbstractC2644c {

    /* renamed from: g, reason: collision with root package name */
    private final com.google.android.gms.internal.measurement.D1 f25776g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ C2660e f25777h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2636b(C2660e c2660e, String str, int i10, com.google.android.gms.internal.measurement.D1 d12) {
        super(str, i10);
        Objects.requireNonNull(c2660e);
        this.f25777h = c2660e;
        this.f25776g = d12;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2644c
    final int a() {
        return this.f25776g.D();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2644c
    final boolean b() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2644c
    final boolean c() {
        return this.f25776g.I();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x035f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0357  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final boolean k(Long l10, Long l11, com.google.android.gms.internal.measurement.S2 s22, long j10, E e10, boolean z10) {
        Boolean i10;
        com.google.android.gms.internal.measurement.Q6.a();
        C2660e c2660e = this.f25777h;
        C2760q3 c2760q3 = c2660e.f25694a;
        C2724m w10 = c2760q3.w();
        String str = this.f25849a;
        boolean H10 = w10.H(str, AbstractC2671f2.f25948G0);
        com.google.android.gms.internal.measurement.D1 d12 = this.f25776g;
        long j11 = d12.N() ? e10.f25369e : j10;
        r9 = null;
        r9 = null;
        r9 = null;
        r9 = null;
        r9 = null;
        r9 = null;
        r9 = null;
        r9 = null;
        r9 = null;
        r9 = null;
        r9 = null;
        Boolean bool = null;
        if (Log.isLoggable(c2760q3.a().z(), 2)) {
            c2760q3.a().w().d("Evaluating filter. audience, filter, event", Integer.valueOf(this.f25850b), d12.C() ? Integer.valueOf(d12.D()) : null, c2760q3.D().a(d12.E()));
            c2760q3.a().w().b("Filter definition", c2660e.f25405b.K0().L(d12));
        }
        if (!d12.C() || d12.D() > 256) {
            c2760q3.a().r().c("Invalid event filter ID. appId, id", C2.x(str), String.valueOf(d12.C() ? Integer.valueOf(d12.D()) : null));
            return false;
        }
        Object[] objArr = d12.K() || d12.L() || d12.N();
        if (z10 && objArr != true) {
            c2760q3.a().w().c("Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.f25850b), d12.C() ? Integer.valueOf(d12.D()) : null);
            return true;
        }
        String F10 = s22.F();
        if (d12.I()) {
            Boolean g10 = AbstractC2644c.g(j11, d12.J());
            if (g10 != null) {
                if (!g10.booleanValue()) {
                    bool = Boolean.FALSE;
                }
            }
            c2760q3.a().w().b("Event filter result", bool != null ? "null" : bool);
            if (bool != null) {
                return false;
            }
            Boolean bool2 = Boolean.TRUE;
            this.f25851c = bool2;
            if (!bool.booleanValue()) {
                return true;
            }
            this.f25852d = bool2;
            if (objArr != false && s22.G()) {
                Long valueOf = Long.valueOf(s22.H());
                if (d12.L()) {
                    if (H10 && d12.I()) {
                        valueOf = l10;
                    }
                    this.f25854f = valueOf;
                } else {
                    if (H10 && d12.I()) {
                        valueOf = l11;
                    }
                    this.f25853e = valueOf;
                }
            }
            return true;
        }
        HashSet hashSet = new HashSet();
        Iterator it = d12.F().iterator();
        while (true) {
            if (!it.hasNext()) {
                C3476a c3476a = new C3476a();
                Iterator it2 = s22.C().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        Iterator it3 = d12.F().iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                bool = Boolean.TRUE;
                                break;
                            }
                            com.google.android.gms.internal.measurement.F1 f12 = (com.google.android.gms.internal.measurement.F1) it3.next();
                            boolean z11 = f12.G() && f12.H();
                            String J10 = f12.J();
                            if (J10.isEmpty()) {
                                c2760q3.a().r().b("Event has empty param name. event", c2760q3.D().a(F10));
                                break;
                            }
                            Object obj = c3476a.get(J10);
                            if (obj instanceof Long) {
                                if (!f12.E()) {
                                    c2760q3.a().r().c("No number filter for long param. event, param", c2760q3.D().a(F10), c2760q3.D().b(J10));
                                    break;
                                }
                                Boolean g11 = AbstractC2644c.g(((Long) obj).longValue(), f12.F());
                                if (g11 == null) {
                                    break;
                                }
                                if (g11.booleanValue() == z11) {
                                    bool = Boolean.FALSE;
                                    break;
                                }
                            } else if (obj instanceof Double) {
                                if (!f12.E()) {
                                    c2760q3.a().r().c("No number filter for double param. event, param", c2760q3.D().a(F10), c2760q3.D().b(J10));
                                    break;
                                }
                                Boolean h10 = AbstractC2644c.h(((Double) obj).doubleValue(), f12.F());
                                if (h10 == null) {
                                    break;
                                }
                                if (h10.booleanValue() == z11) {
                                    bool = Boolean.FALSE;
                                    break;
                                }
                            } else if (obj instanceof String) {
                                if (!f12.C()) {
                                    if (!f12.E()) {
                                        c2760q3.a().r().c("No filter for String param. event, param", c2760q3.D().a(F10), c2760q3.D().b(J10));
                                        break;
                                    }
                                    String str2 = (String) obj;
                                    if (!g7.O(str2)) {
                                        c2760q3.a().r().c("Invalid param value for number filter. event, param", c2760q3.D().a(F10), c2760q3.D().b(J10));
                                        break;
                                    }
                                    i10 = AbstractC2644c.i(str2, f12.F());
                                } else {
                                    i10 = AbstractC2644c.f((String) obj, f12.D(), c2760q3.a());
                                }
                                if (i10 == null) {
                                    break;
                                }
                                if (i10.booleanValue() == z11) {
                                    bool = Boolean.FALSE;
                                    break;
                                }
                            } else if (obj == null) {
                                c2760q3.a().w().c("Missing param for filter. event, param", c2760q3.D().a(F10), c2760q3.D().b(J10));
                                bool = Boolean.FALSE;
                            } else {
                                c2760q3.a().r().c("Unknown param type. event, param", c2760q3.D().a(F10), c2760q3.D().b(J10));
                            }
                        }
                    } else {
                        com.google.android.gms.internal.measurement.W2 w22 = (com.google.android.gms.internal.measurement.W2) it2.next();
                        if (hashSet.contains(w22.D())) {
                            if (!w22.G()) {
                                if (!w22.K()) {
                                    if (!w22.E()) {
                                        c2760q3.a().r().c("Unknown value for param. event, param", c2760q3.D().a(F10), c2760q3.D().b(w22.D()));
                                        break;
                                    }
                                    c3476a.put(w22.D(), w22.F());
                                } else {
                                    c3476a.put(w22.D(), w22.K() ? Double.valueOf(w22.L()) : null);
                                }
                            } else {
                                c3476a.put(w22.D(), w22.G() ? Long.valueOf(w22.H()) : null);
                            }
                        }
                    }
                }
            } else {
                com.google.android.gms.internal.measurement.F1 f13 = (com.google.android.gms.internal.measurement.F1) it.next();
                if (f13.J().isEmpty()) {
                    c2760q3.a().r().b("null or empty param name in filter. event", c2760q3.D().a(F10));
                    break;
                }
                hashSet.add(f13.J());
            }
        }
        c2760q3.a().w().b("Event filter result", bool != null ? "null" : bool);
        if (bool != null) {
        }
    }
}
