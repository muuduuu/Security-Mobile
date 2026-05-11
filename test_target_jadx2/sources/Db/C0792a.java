package Db;

import expo.modules.kotlin.jni.ExpectedType;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pb.C3862a;

/* renamed from: Db.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0792a {

    /* renamed from: a, reason: collision with root package name */
    private final kotlin.reflect.o f1430a;

    /* renamed from: b, reason: collision with root package name */
    private final Lazy f1431b;

    /* renamed from: Db.a$a, reason: collision with other inner class name */
    static final class C0027a extends xc.m implements Function0 {
        C0027a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final W invoke() {
            return a0.f1433a.a(C0792a.this.d());
        }
    }

    public C0792a(kotlin.reflect.o kType) {
        Intrinsics.checkNotNullParameter(kType, "kType");
        this.f1430a = kType;
        this.f1431b = lc.i.a(new C0027a());
    }

    private final W b() {
        return (W) this.f1431b.getValue();
    }

    public final Object a(Object obj, C3862a c3862a) {
        return b().a(obj, c3862a);
    }

    public final ExpectedType c() {
        return b().b();
    }

    public final kotlin.reflect.o d() {
        return this.f1430a;
    }
}
