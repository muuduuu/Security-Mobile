package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C2377v3;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2652d extends AbstractC2644c {

    /* renamed from: g, reason: collision with root package name */
    private final com.google.android.gms.internal.measurement.L1 f25868g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ C2660e f25869h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2652d(C2660e c2660e, String str, int i10, com.google.android.gms.internal.measurement.L1 l12) {
        super(str, i10);
        Objects.requireNonNull(c2660e);
        this.f25869h = c2660e;
        this.f25868g = l12;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2644c
    final int a() {
        return this.f25868g.D();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2644c
    final boolean b() {
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2644c
    final boolean c() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final boolean k(Long l10, Long l11, C2377v3 c2377v3, boolean z10) {
        com.google.android.gms.internal.measurement.Q6.a();
        C2760q3 c2760q3 = this.f25869h.f25694a;
        boolean H10 = c2760q3.w().H(this.f25849a, AbstractC2671f2.f25944E0);
        com.google.android.gms.internal.measurement.L1 l12 = this.f25868g;
        boolean G10 = l12.G();
        boolean H11 = l12.H();
        boolean J10 = l12.J();
        Object[] objArr = G10 || H11 || J10;
        Boolean bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        if (z10 && objArr != true) {
            c2760q3.a().w().c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.f25850b), l12.C() ? Integer.valueOf(l12.D()) : null);
            return true;
        }
        com.google.android.gms.internal.measurement.F1 F10 = l12.F();
        boolean H12 = F10.H();
        if (c2377v3.H()) {
            if (F10.E()) {
                bool = AbstractC2644c.e(AbstractC2644c.g(c2377v3.I(), F10.F()), H12);
            } else {
                c2760q3.a().r().b("No number filter for long property. property", c2760q3.D().c(c2377v3.E()));
            }
        } else if (c2377v3.L()) {
            if (F10.E()) {
                bool = AbstractC2644c.e(AbstractC2644c.h(c2377v3.M(), F10.F()), H12);
            } else {
                c2760q3.a().r().b("No number filter for double property. property", c2760q3.D().c(c2377v3.E()));
            }
        } else if (!c2377v3.F()) {
            c2760q3.a().r().b("User property has no value, property", c2760q3.D().c(c2377v3.E()));
        } else if (F10.C()) {
            bool = AbstractC2644c.e(AbstractC2644c.f(c2377v3.G(), F10.D(), c2760q3.a()), H12);
        } else if (!F10.E()) {
            c2760q3.a().r().b("No string or number filter defined. property", c2760q3.D().c(c2377v3.E()));
        } else if (g7.O(c2377v3.G())) {
            bool = AbstractC2644c.e(AbstractC2644c.i(c2377v3.G(), F10.F()), H12);
        } else {
            c2760q3.a().r().c("Invalid user property value for Numeric number filter. property, value", c2760q3.D().c(c2377v3.E()), c2377v3.G());
        }
        c2760q3.a().w().b("Property filter result", bool == null ? "null" : bool);
        if (bool == null) {
            return false;
        }
        this.f25851c = Boolean.TRUE;
        if (J10 && !bool.booleanValue()) {
            return true;
        }
        if (!z10 || l12.G()) {
            this.f25852d = bool;
        }
        if (bool.booleanValue() && objArr != false && c2377v3.C()) {
            long D10 = c2377v3.D();
            if (l10 != null) {
                D10 = l10.longValue();
            }
            if (H10 && l12.G() && !l12.H() && l11 != null) {
                D10 = l11.longValue();
            }
            if (l12.H()) {
                this.f25854f = Long.valueOf(D10);
            } else {
                this.f25853e = Long.valueOf(D10);
            }
        }
        return true;
    }
}
