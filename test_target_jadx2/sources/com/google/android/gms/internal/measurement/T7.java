package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class T7 extends AbstractC2275k {

    /* renamed from: c, reason: collision with root package name */
    private final Callable f24385c;

    public T7(String str, Callable callable) {
        super("internal.appMetadata");
        this.f24385c = callable;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2275k
    public final InterfaceC2329q b(Y1 y12, List list) {
        try {
            return AbstractC2189a3.a(this.f24385c.call());
        } catch (Exception unused) {
            return InterfaceC2329q.f24620U;
        }
    }
}
