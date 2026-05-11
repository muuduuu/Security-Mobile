package com.facebook.react.views.view;

import zc.AbstractC5272a;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f22988a = new d();

    private d() {
    }

    private final int a(double d10) {
        return Math.max(0, Math.min(255, AbstractC5272a.b(d10)));
    }

    public static final int b(double d10, double d11, double d12, double d13) {
        d dVar = f22988a;
        return (dVar.a(d10) << 16) | (dVar.a(d13 * 255) << 24) | (dVar.a(d11) << 8) | dVar.a(d12);
    }
}
