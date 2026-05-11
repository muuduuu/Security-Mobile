package com.google.firebase.analytics;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.C2411z1;
import com.google.android.gms.measurement.internal.InterfaceC2650c5;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class d implements InterfaceC2650c5 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2411z1 f27956a;

    d(C2411z1 c2411z1) {
        this.f27956a = c2411z1;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2650c5
    public final void a(String str, String str2, Bundle bundle) {
        this.f27956a.w(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2650c5
    public final void b(Bundle bundle) {
        this.f27956a.y(bundle);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2650c5
    public final void c(String str) {
        this.f27956a.I(str);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2650c5
    public final String d() {
        return this.f27956a.a();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2650c5
    public final void e(String str) {
        this.f27956a.H(str);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2650c5
    public final void f(String str, String str2, Bundle bundle) {
        this.f27956a.z(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2650c5
    public final List g(String str, String str2) {
        return this.f27956a.A(str, str2);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2650c5
    public final int h(String str) {
        return this.f27956a.e(str);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2650c5
    public final Map i(String str, String str2, boolean z10) {
        return this.f27956a.c(str, str2, z10);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2650c5
    public final String l() {
        return this.f27956a.b();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2650c5
    public final String r() {
        return this.f27956a.L();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2650c5
    public final String u() {
        return this.f27956a.K();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2650c5
    public final long y() {
        return this.f27956a.M();
    }
}
