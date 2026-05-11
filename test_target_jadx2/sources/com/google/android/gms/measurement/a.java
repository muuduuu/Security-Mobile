package com.google.android.gms.measurement;

import V6.AbstractC1287s;
import android.os.Bundle;
import com.google.android.gms.measurement.internal.C2642b5;
import com.google.android.gms.measurement.internal.C2760q3;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class a extends c {

    /* renamed from: a, reason: collision with root package name */
    private final C2760q3 f25278a;

    /* renamed from: b, reason: collision with root package name */
    private final C2642b5 f25279b;

    public a(C2760q3 c2760q3) {
        super(null);
        AbstractC1287s.m(c2760q3);
        this.f25278a = c2760q3;
        this.f25279b = c2760q3.B();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2650c5
    public final void a(String str, String str2, Bundle bundle) {
        this.f25279b.p(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2650c5
    public final void b(Bundle bundle) {
        this.f25279b.M(bundle);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2650c5
    public final void c(String str) {
        C2760q3 c2760q3 = this.f25278a;
        c2760q3.M().j(str, c2760q3.f().c());
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2650c5
    public final String d() {
        return this.f25279b.Q();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2650c5
    public final void e(String str) {
        C2760q3 c2760q3 = this.f25278a;
        c2760q3.M().i(str, c2760q3.f().c());
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2650c5
    public final void f(String str, String str2, Bundle bundle) {
        this.f25278a.B().O(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2650c5
    public final List g(String str, String str2) {
        return this.f25279b.P(str, str2);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2650c5
    public final int h(String str) {
        this.f25279b.L(str);
        return 25;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2650c5
    public final Map i(String str, String str2, boolean z10) {
        return this.f25279b.C(str, str2, z10);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2650c5
    public final String l() {
        return this.f25279b.R();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2650c5
    public final String r() {
        return this.f25279b.D();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2650c5
    public final String u() {
        return this.f25279b.S();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2650c5
    public final long y() {
        return this.f25278a.C().p0();
    }
}
