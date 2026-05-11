package com.google.android.gms.internal.clearcut;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public final class O {

    /* renamed from: b, reason: collision with root package name */
    private static final Class f23894b = a();

    /* renamed from: c, reason: collision with root package name */
    static final O f23895c = new O(true);

    /* renamed from: a, reason: collision with root package name */
    private final Map f23896a = Collections.emptyMap();

    private O(boolean z10) {
    }

    private static Class a() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static O b() {
        return N.b();
    }
}
