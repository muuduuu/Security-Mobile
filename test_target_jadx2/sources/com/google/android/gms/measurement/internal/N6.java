package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C2359t3;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public final class N6 {

    /* renamed from: a, reason: collision with root package name */
    private final String f25583a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f25584b;

    /* renamed from: c, reason: collision with root package name */
    private final EnumC2714k5 f25585c;

    /* renamed from: d, reason: collision with root package name */
    private final C2359t3 f25586d;

    N6(String str, Map map, EnumC2714k5 enumC2714k5, C2359t3 c2359t3) {
        this.f25583a = str;
        this.f25584b = map;
        this.f25585c = enumC2714k5;
        this.f25586d = c2359t3;
    }

    public final String a() {
        return this.f25583a;
    }

    public final Map b() {
        Map map = this.f25584b;
        return map == null ? Collections.emptyMap() : map;
    }

    public final EnumC2714k5 c() {
        return this.f25585c;
    }

    public final C2359t3 d() {
        return this.f25586d;
    }
}
