package Bb;

import Db.P;
import expo.modules.kotlin.exception.r;
import expo.modules.kotlin.exception.t;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.sharedobjects.SharedRef;
import java.util.List;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.o;
import lc.i;
import pb.C3862a;
import vc.AbstractC5011a;
import xc.C5142C;
import xc.m;

/* loaded from: classes2.dex */
public final class e extends P {

    /* renamed from: b, reason: collision with root package name */
    private final o f564b;

    /* renamed from: c, reason: collision with root package name */
    private final d f565c;

    /* renamed from: d, reason: collision with root package name */
    private final Lazy f566d;

    static final class a extends m implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            List f10;
            kotlin.reflect.e j10 = e.this.h().j();
            kotlin.reflect.d dVar = j10 instanceof kotlin.reflect.d ? (kotlin.reflect.d) j10 : null;
            o h10 = e.this.h();
            while (dVar != null) {
                if (Intrinsics.b(dVar, C5142C.b(SharedRef.class))) {
                    KTypeProjection kTypeProjection = (h10 == null || (f10 = h10.f()) == null) ? null : (KTypeProjection) CollectionsKt.d0(f10);
                    if (Intrinsics.b(kTypeProjection, KTypeProjection.INSTANCE.c())) {
                        return null;
                    }
                    o c10 = kTypeProjection != null ? kTypeProjection.c() : null;
                    e eVar = e.this;
                    if (c10 != null) {
                        return c10;
                    }
                    throw new IllegalArgumentException(("The " + eVar.g() + " type should contain the type of the inner ref").toString());
                }
                h10 = (o) CollectionsKt.firstOrNull(dVar.a());
                kotlin.reflect.e j11 = h10 != null ? h10.j() : null;
                dVar = j11 instanceof kotlin.reflect.d ? (kotlin.reflect.d) j11 : null;
            }
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(o type) {
        super(type.p());
        Intrinsics.checkNotNullParameter(type, "type");
        this.f564b = type;
        this.f565c = new d(type);
        this.f566d = i.a(new a());
    }

    private final SharedRef e(SharedRef sharedRef) {
        Object ref = sharedRef.getRef();
        if (ref == null) {
            return sharedRef;
        }
        o g10 = g();
        kotlin.reflect.e j10 = g10 != null ? g10.j() : null;
        kotlin.reflect.d dVar = j10 instanceof kotlin.reflect.d ? (kotlin.reflect.d) j10 : null;
        if (dVar == null) {
            return sharedRef;
        }
        if (Cc.d.k(dVar, AbstractC5011a.e(ref.getClass()))) {
            return sharedRef;
        }
        throw new r(this.f564b, sharedRef.getClass());
    }

    @Override // Db.W
    public ExpectedType b() {
        return this.f565c.b();
    }

    @Override // Db.W
    public boolean c() {
        return this.f565c.c();
    }

    @Override // Db.P
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public SharedRef d(Object value, C3862a c3862a) {
        Intrinsics.checkNotNullParameter(value, "value");
        SharedRef sharedRef = (SharedRef) this.f565c.a(value, c3862a);
        if (sharedRef == null) {
            throw new t(this.f564b);
        }
        SharedRef e10 = e(sharedRef);
        Intrinsics.e(e10, "null cannot be cast to non-null type T of expo.modules.kotlin.sharedobjects.SharedRefTypeConverter");
        return e10;
    }

    public final o g() {
        return (o) this.f566d.getValue();
    }

    public final o h() {
        return this.f564b;
    }
}
