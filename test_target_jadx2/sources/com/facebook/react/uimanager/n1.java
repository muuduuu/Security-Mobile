package com.facebook.react.uimanager;

import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import v4.C4926b;

/* loaded from: classes.dex */
public final class n1 {

    /* renamed from: a, reason: collision with root package name */
    public static final n1 f22466a = new n1();

    /* renamed from: b, reason: collision with root package name */
    private static final Lazy f22467b = lc.i.b(lc.l.SYNCHRONIZED, a.f22468a);

    static final class a extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f22468a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4926b invoke() {
            return new C4926b(1024);
        }
    }

    private n1() {
    }

    public static final C4926b a() {
        return f22466a.b();
    }

    private final C4926b b() {
        return (C4926b) f22467b.getValue();
    }
}
