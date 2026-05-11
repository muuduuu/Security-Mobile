package Db;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import expo.modules.kotlin.exception.C3124b;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.jni.ExpectedType;
import java.lang.reflect.Array;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import pb.C3862a;
import vc.AbstractC5011a;
import xc.C5142C;

/* renamed from: Db.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0795d extends AbstractC0812v {

    /* renamed from: b, reason: collision with root package name */
    private final kotlin.reflect.o f1457b;

    /* renamed from: c, reason: collision with root package name */
    private final W f1458c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0795d(X converterProvider, kotlin.reflect.o arrayType) {
        super(arrayType.p());
        Intrinsics.checkNotNullParameter(converterProvider, "converterProvider");
        Intrinsics.checkNotNullParameter(arrayType, "arrayType");
        this.f1457b = arrayType;
        kotlin.reflect.o c10 = ((KTypeProjection) CollectionsKt.d0(arrayType.f())).c();
        if (c10 == null) {
            throw new IllegalArgumentException("The array type should contain the type of the elements.");
        }
        this.f1458c = converterProvider.a(c10);
    }

    private final Object[] i(int i10) {
        kotlin.reflect.o c10 = ((KTypeProjection) CollectionsKt.d0(this.f1457b.f())).c();
        Intrinsics.d(c10);
        kotlin.reflect.e j10 = c10.j();
        Intrinsics.e(j10, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
        Object newInstance = Array.newInstance((Class<?>) AbstractC5011a.b((kotlin.reflect.d) j10), i10);
        Intrinsics.e(newInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return (Object[]) newInstance;
    }

    @Override // Db.W
    public ExpectedType b() {
        return ExpectedType.INSTANCE.e(this.f1458c.b());
    }

    @Override // Db.W
    public boolean c() {
        return this.f1458c.c();
    }

    @Override // Db.AbstractC0812v
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Object[] e(Object value, C3862a c3862a) {
        CodedException codedException;
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.f1458c.c()) {
            return (Object[]) value;
        }
        Object[] objArr = (Object[]) value;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            try {
                arrayList.add(this.f1458c.a(obj, c3862a));
            } catch (Throwable th) {
                if (th instanceof CodedException) {
                    codedException = (CodedException) th;
                } else if (th instanceof Da.a) {
                    String a10 = ((Da.a) th).a();
                    Intrinsics.checkNotNullExpressionValue(a10, "getCode(...)");
                    codedException = new CodedException(a10, th.getMessage(), th.getCause());
                } else {
                    codedException = new UnexpectedException(th);
                }
                kotlin.reflect.o oVar = this.f1457b;
                kotlin.reflect.o c10 = ((KTypeProjection) CollectionsKt.d0(oVar.f())).c();
                Intrinsics.d(c10);
                Intrinsics.d(obj);
                throw new C3124b(oVar, c10, C5142C.b(obj.getClass()), codedException);
            }
        }
        return arrayList.toArray(new Object[0]);
    }

    @Override // Db.AbstractC0812v
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public Object[] f(Dynamic value, C3862a c3862a) {
        Intrinsics.checkNotNullParameter(value, "value");
        ReadableArray asArray = value.asArray();
        Object[] i10 = i(asArray.size());
        int size = asArray.size();
        for (int i11 = 0; i11 < size; i11++) {
            Dynamic dynamic = asArray.getDynamic(i11);
            try {
                Object a10 = this.f1458c.a(dynamic, c3862a);
                dynamic.recycle();
                i10[i11] = a10;
            } finally {
            }
        }
        return i10;
    }
}
