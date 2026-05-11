package Db;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import expo.modules.kotlin.exception.C3124b;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.SingleType;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import pb.C3862a;

/* loaded from: classes2.dex */
public final class Q extends AbstractC0812v {

    /* renamed from: b, reason: collision with root package name */
    private final kotlin.reflect.o f1421b;

    /* renamed from: c, reason: collision with root package name */
    private final List f1422c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(X converterProvider, kotlin.reflect.o pairType) {
        super(pairType.p());
        Intrinsics.checkNotNullParameter(converterProvider, "converterProvider");
        Intrinsics.checkNotNullParameter(pairType, "pairType");
        this.f1421b = pairType;
        KTypeProjection kTypeProjection = (KTypeProjection) CollectionsKt.f0(pairType.f(), 0);
        kotlin.reflect.o c10 = kTypeProjection != null ? kTypeProjection.c() : null;
        if (c10 == null) {
            throw new IllegalArgumentException("The pair type should contain the type of the first parameter.");
        }
        W a10 = converterProvider.a(c10);
        KTypeProjection kTypeProjection2 = (KTypeProjection) CollectionsKt.f0(pairType.f(), 1);
        kotlin.reflect.o c11 = kTypeProjection2 != null ? kTypeProjection2.c() : null;
        if (c11 == null) {
            throw new IllegalArgumentException("The pair type should contain the type of the second parameter.");
        }
        this.f1422c = CollectionsKt.m(a10, converterProvider.a(c11));
    }

    private final Object g(C3862a c3862a, ReadableArray readableArray, int i10) {
        CodedException codedException;
        Dynamic dynamic = readableArray.getDynamic(i10);
        try {
            Object a10 = ((W) this.f1422c.get(i10)).a(dynamic, c3862a);
            dynamic.recycle();
            return a10;
        } catch (Throwable th) {
            try {
                if (th instanceof CodedException) {
                    codedException = (CodedException) th;
                } else if (th instanceof Da.a) {
                    String a11 = ((Da.a) th).a();
                    Intrinsics.checkNotNullExpressionValue(a11, "getCode(...)");
                    codedException = new CodedException(a11, th.getMessage(), th.getCause());
                } else {
                    codedException = new UnexpectedException(th);
                }
                kotlin.reflect.o oVar = this.f1421b;
                kotlin.reflect.o c10 = ((KTypeProjection) oVar.f().get(i10)).c();
                Intrinsics.d(c10);
                throw new C3124b(oVar, c10, dynamic.getType(), codedException);
            } catch (Throwable th2) {
                dynamic.recycle();
                throw th2;
            }
        }
    }

    private final Pair j(ReadableArray readableArray, C3862a c3862a) {
        return new Pair(g(c3862a, readableArray, 0), g(c3862a, readableArray, 1));
    }

    @Override // Db.W
    public ExpectedType b() {
        return new ExpectedType(new SingleType(expo.modules.kotlin.jni.a.READABLE_ARRAY, null, 2, null));
    }

    @Override // Db.W
    public boolean c() {
        return false;
    }

    @Override // Db.AbstractC0812v
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public Pair e(Object value, C3862a c3862a) {
        Intrinsics.checkNotNullParameter(value, "value");
        return value instanceof ReadableArray ? j((ReadableArray) value, c3862a) : (Pair) value;
    }

    @Override // Db.AbstractC0812v
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public Pair f(Dynamic value, C3862a c3862a) {
        Intrinsics.checkNotNullParameter(value, "value");
        return j(value.asArray(), c3862a);
    }
}
