package com.facebook.react.uimanager;

import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.facebook.react.uimanager.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1977x0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1977x0 f22497a = new C1977x0();

    /* renamed from: b, reason: collision with root package name */
    private static final Lazy f22498b = lc.i.b(lc.l.NONE, a.f22499a);

    /* renamed from: com.facebook.react.uimanager.x0$a */
    static final class a extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f22499a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.facebook.yoga.c invoke() {
            com.facebook.yoga.c a10 = com.facebook.yoga.d.a();
            a10.b(0.0f);
            a10.a(com.facebook.yoga.k.ALL);
            return a10;
        }
    }

    private C1977x0() {
    }

    public static final com.facebook.yoga.c a() {
        return f22497a.b();
    }

    private final com.facebook.yoga.c b() {
        Object value = f22498b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (com.facebook.yoga.c) value;
    }
}
