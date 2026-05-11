package Db;

import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.types.Either;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import pb.C3862a;

/* renamed from: Db.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0815y extends P {

    /* renamed from: b, reason: collision with root package name */
    private final kotlin.reflect.o f1488b;

    /* renamed from: c, reason: collision with root package name */
    private final kotlin.reflect.o f1489c;

    /* renamed from: d, reason: collision with root package name */
    private final W f1490d;

    /* renamed from: e, reason: collision with root package name */
    private final W f1491e;

    /* renamed from: f, reason: collision with root package name */
    private final ExpectedType f1492f;

    /* renamed from: g, reason: collision with root package name */
    private final ExpectedType f1493g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0815y(X converterProvider, kotlin.reflect.o eitherType) {
        super(eitherType.p());
        Intrinsics.checkNotNullParameter(converterProvider, "converterProvider");
        Intrinsics.checkNotNullParameter(eitherType, "eitherType");
        KTypeProjection kTypeProjection = (KTypeProjection) CollectionsKt.f0(eitherType.f(), 0);
        kotlin.reflect.o c10 = kTypeProjection != null ? kTypeProjection.c() : null;
        if (c10 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.f1488b = c10;
        KTypeProjection kTypeProjection2 = (KTypeProjection) CollectionsKt.f0(eitherType.f(), 1);
        kotlin.reflect.o c11 = kTypeProjection2 != null ? kTypeProjection2.c() : null;
        if (c11 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.f1489c = c11;
        W a10 = converterProvider.a(c10);
        this.f1490d = a10;
        W a11 = converterProvider.a(c11);
        this.f1491e = a11;
        this.f1492f = a10.b();
        this.f1493g = a11.b();
    }

    @Override // Db.W
    public ExpectedType b() {
        return this.f1492f.a(this.f1493g);
    }

    @Override // Db.W
    public boolean c() {
        return false;
    }

    @Override // Db.P
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Either d(Object value, C3862a c3862a) {
        List c10;
        Intrinsics.checkNotNullParameter(value, "value");
        List m10 = CollectionsKt.m(this.f1488b, this.f1489c);
        c10 = AbstractC0816z.c(value, c3862a, CollectionsKt.m(lc.t.a(this.f1492f, this.f1490d), lc.t.a(this.f1493g, this.f1491e)), m10);
        return new Either(value, CollectionsKt.Q0(c10), m10);
    }
}
