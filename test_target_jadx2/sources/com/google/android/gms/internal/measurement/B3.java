package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class B3 {

    /* renamed from: a, reason: collision with root package name */
    final Map f24195a = new HashMap();

    public final void a(String str, Callable callable) {
        this.f24195a.put(str, callable);
    }
}
