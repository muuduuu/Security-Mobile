package com.google.android.gms.internal.auth;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: com.google.android.gms.internal.auth.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2077p extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2080q f23750a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2077p(C2080q c2080q, Handler handler) {
        super(null);
        this.f23750a = c2080q;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        this.f23750a.e();
    }
}
