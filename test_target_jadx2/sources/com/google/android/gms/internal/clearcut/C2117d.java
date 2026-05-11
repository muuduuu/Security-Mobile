package com.google.android.gms.internal.clearcut;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: com.google.android.gms.internal.clearcut.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2117d extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ C2114c f24024a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2117d(C2114c c2114c, Handler handler) {
        super(null);
        this.f24024a = c2114c;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        this.f24024a.d();
        this.f24024a.f();
    }
}
