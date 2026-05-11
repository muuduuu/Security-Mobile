package com.google.android.gms.common;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
final class V extends W {

    /* renamed from: f, reason: collision with root package name */
    private final Callable f23327f;

    /* synthetic */ V(Callable callable, byte[] bArr) {
        super(false, 1, 5, null, null, -1L, null);
        this.f23327f = callable;
    }

    @Override // com.google.android.gms.common.W
    final String a() {
        try {
            return (String) this.f23327f.call();
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }
}
