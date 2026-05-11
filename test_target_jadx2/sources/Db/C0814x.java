package Db;

import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.types.EitherOfThree;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import pb.C3862a;

/* renamed from: Db.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0814x extends P {

    /* renamed from: b, reason: collision with root package name */
    private final kotlin.reflect.o f1479b;

    /* renamed from: c, reason: collision with root package name */
    private final kotlin.reflect.o f1480c;

    /* renamed from: d, reason: collision with root package name */
    private final kotlin.reflect.o f1481d;

    /* renamed from: e, reason: collision with root package name */
    private final W f1482e;

    /* renamed from: f, reason: collision with root package name */
    private final W f1483f;

    /* renamed from: g, reason: collision with root package name */
    private final W f1484g;

    /* renamed from: h, reason: collision with root package name */
    private final ExpectedType f1485h;

    /* renamed from: i, reason: collision with root package name */
    private final ExpectedType f1486i;

    /* renamed from: j, reason: collision with root package name */
    private final ExpectedType f1487j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0814x(X converterProvider, kotlin.reflect.o eitherType) {
        super(eitherType.p());
        Intrinsics.checkNotNullParameter(converterProvider, "converterProvider");
        Intrinsics.checkNotNullParameter(eitherType, "eitherType");
        KTypeProjection kTypeProjection = (KTypeProjection) CollectionsKt.f0(eitherType.f(), 0);
        kotlin.reflect.o c10 = kTypeProjection != null ? kTypeProjection.c() : null;
        if (c10 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.f1479b = c10;
        KTypeProjection kTypeProjection2 = (KTypeProjection) CollectionsKt.f0(eitherType.f(), 1);
        kotlin.reflect.o c11 = kTypeProjection2 != null ? kTypeProjection2.c() : null;
        if (c11 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.f1480c = c11;
        KTypeProjection kTypeProjection3 = (KTypeProjection) CollectionsKt.f0(eitherType.f(), 2);
        kotlin.reflect.o c12 = kTypeProjection3 != null ? kTypeProjection3.c() : null;
        if (c12 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.f1481d = c12;
        W a10 = converterProvider.a(c10);
        this.f1482e = a10;
        W a11 = converterProvider.a(c11);
        this.f1483f = a11;
        W a12 = converterProvider.a(c12);
        this.f1484g = a12;
        this.f1485h = a10.b();
        this.f1486i = a11.b();
        this.f1487j = a12.b();
    }

    @Override // Db.W
    public ExpectedType b() {
        return this.f1485h.a(this.f1486i).a(this.f1487j);
    }

    @Override // Db.P
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public EitherOfThree d(Object value, C3862a c3862a) {
        List c10;
        Intrinsics.checkNotNullParameter(value, "value");
        List m10 = CollectionsKt.m(this.f1479b, this.f1480c, this.f1481d);
        c10 = AbstractC0816z.c(value, c3862a, CollectionsKt.m(lc.t.a(this.f1485h, this.f1482e), lc.t.a(this.f1486i, this.f1483f), lc.t.a(this.f1487j, this.f1484g)), m10);
        return new EitherOfThree(value, CollectionsKt.Q0(c10), m10);
    }
}
