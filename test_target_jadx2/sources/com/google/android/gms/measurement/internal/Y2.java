package com.google.android.gms.measurement.internal;

import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
final class Y2 implements com.google.android.gms.internal.measurement.V5 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f25742a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2656d3 f25743b;

    Y2(C2656d3 c2656d3, String str) {
        this.f25742a = str;
        Objects.requireNonNull(c2656d3);
        this.f25743b = c2656d3;
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final String a(String str) {
        Map map = (Map) this.f25743b.p().get(this.f25742a);
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return (String) map.get(str);
    }
}
