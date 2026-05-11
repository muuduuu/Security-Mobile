package com.google.android.gms.auth.api.signin.internal;

import O6.g;
import S6.h;
import android.os.Bundle;
import androidx.loader.app.a;
import b1.AbstractC1641b;
import java.util.Objects;

/* loaded from: classes2.dex */
final class a implements a.InterfaceC0294a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SignInHubActivity f23284a;

    /* synthetic */ a(SignInHubActivity signInHubActivity, byte[] bArr) {
        Objects.requireNonNull(signInHubActivity);
        this.f23284a = signInHubActivity;
    }

    @Override // androidx.loader.app.a.InterfaceC0294a
    public final AbstractC1641b a(int i10, Bundle bundle) {
        return new g(this.f23284a, h.i());
    }

    @Override // androidx.loader.app.a.InterfaceC0294a
    public final /* bridge */ /* synthetic */ void c(AbstractC1641b abstractC1641b, Object obj) {
        SignInHubActivity signInHubActivity = this.f23284a;
        signInHubActivity.setResult(signInHubActivity.z(), signInHubActivity.A());
        signInHubActivity.finish();
    }

    @Override // androidx.loader.app.a.InterfaceC0294a
    public final void b(AbstractC1641b abstractC1641b) {
    }
}
