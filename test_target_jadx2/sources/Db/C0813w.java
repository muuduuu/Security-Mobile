package Db;

import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.types.EitherOfFour;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import pb.C3862a;

/* renamed from: Db.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0813w extends P {

    /* renamed from: b, reason: collision with root package name */
    private final kotlin.reflect.o f1467b;

    /* renamed from: c, reason: collision with root package name */
    private final kotlin.reflect.o f1468c;

    /* renamed from: d, reason: collision with root package name */
    private final kotlin.reflect.o f1469d;

    /* renamed from: e, reason: collision with root package name */
    private final kotlin.reflect.o f1470e;

    /* renamed from: f, reason: collision with root package name */
    private final W f1471f;

    /* renamed from: g, reason: collision with root package name */
    private final W f1472g;

    /* renamed from: h, reason: collision with root package name */
    private final W f1473h;

    /* renamed from: i, reason: collision with root package name */
    private final W f1474i;

    /* renamed from: j, reason: collision with root package name */
    private final ExpectedType f1475j;

    /* renamed from: k, reason: collision with root package name */
    private final ExpectedType f1476k;

    /* renamed from: l, reason: collision with root package name */
    private final ExpectedType f1477l;

    /* renamed from: m, reason: collision with root package name */
    private final ExpectedType f1478m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0813w(X converterProvider, kotlin.reflect.o eitherType) {
        super(eitherType.p());
        Intrinsics.checkNotNullParameter(converterProvider, "converterProvider");
        Intrinsics.checkNotNullParameter(eitherType, "eitherType");
        KTypeProjection kTypeProjection = (KTypeProjection) CollectionsKt.f0(eitherType.f(), 0);
        kotlin.reflect.o c10 = kTypeProjection != null ? kTypeProjection.c() : null;
        if (c10 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.f1467b = c10;
        KTypeProjection kTypeProjection2 = (KTypeProjection) CollectionsKt.f0(eitherType.f(), 1);
        kotlin.reflect.o c11 = kTypeProjection2 != null ? kTypeProjection2.c() : null;
        if (c11 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.f1468c = c11;
        KTypeProjection kTypeProjection3 = (KTypeProjection) CollectionsKt.f0(eitherType.f(), 2);
        kotlin.reflect.o c12 = kTypeProjection3 != null ? kTypeProjection3.c() : null;
        if (c12 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.f1469d = c12;
        KTypeProjection kTypeProjection4 = (KTypeProjection) CollectionsKt.f0(eitherType.f(), 3);
        kotlin.reflect.o c13 = kTypeProjection4 != null ? kTypeProjection4.c() : null;
        if (c13 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.f1470e = c13;
        W a10 = converterProvider.a(c10);
        this.f1471f = a10;
        W a11 = converterProvider.a(c11);
        this.f1472g = a11;
        W a12 = converterProvider.a(c12);
        this.f1473h = a12;
        W a13 = converterProvider.a(c13);
        this.f1474i = a13;
        this.f1475j = a10.b();
        this.f1476k = a11.b();
        this.f1477l = a12.b();
        this.f1478m = a13.b();
    }

    @Override // Db.W
    public ExpectedType b() {
        return this.f1475j.a(this.f1476k).a(this.f1477l);
    }

    @Override // Db.P
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public EitherOfFour d(Object value, C3862a c3862a) {
        List c10;
        Intrinsics.checkNotNullParameter(value, "value");
        List m10 = CollectionsKt.m(this.f1467b, this.f1468c, this.f1469d, this.f1470e);
        c10 = AbstractC0816z.c(value, c3862a, CollectionsKt.m(lc.t.a(this.f1475j, this.f1471f), lc.t.a(this.f1476k, this.f1472g), lc.t.a(this.f1477l, this.f1473h), lc.t.a(this.f1478m, this.f1474i)), CollectionsKt.m(this.f1467b, this.f1468c, this.f1469d, this.f1470e));
        return new EitherOfFour(value, CollectionsKt.Q0(c10), m10);
    }
}
