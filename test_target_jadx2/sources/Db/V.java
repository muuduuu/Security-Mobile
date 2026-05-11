package Db;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import expo.modules.kotlin.exception.C3124b;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.jni.ExpectedType;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import pb.C3862a;
import xc.C5142C;

/* loaded from: classes2.dex */
public final class V extends AbstractC0812v {

    /* renamed from: b, reason: collision with root package name */
    private final kotlin.reflect.o f1428b;

    /* renamed from: c, reason: collision with root package name */
    private final W f1429c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(X converterProvider, kotlin.reflect.o setType) {
        super(setType.p());
        Intrinsics.checkNotNullParameter(converterProvider, "converterProvider");
        Intrinsics.checkNotNullParameter(setType, "setType");
        this.f1428b = setType;
        kotlin.reflect.o c10 = ((KTypeProjection) CollectionsKt.d0(setType.f())).c();
        if (c10 == null) {
            throw new IllegalArgumentException("The set type should contain the type of elements.");
        }
        this.f1429c = converterProvider.a(c10);
    }

    private final Set i(ReadableArray readableArray, C3862a c3862a) {
        int size = readableArray.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            Dynamic dynamic = readableArray.getDynamic(i10);
            try {
                Object a10 = this.f1429c.a(dynamic, c3862a);
                dynamic.recycle();
                arrayList.add(a10);
            } finally {
            }
        }
        return CollectionsKt.S0(arrayList);
    }

    @Override // Db.W
    public ExpectedType b() {
        return ExpectedType.INSTANCE.b(this.f1429c.b());
    }

    @Override // Db.W
    public boolean c() {
        return false;
    }

    @Override // Db.AbstractC0812v
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Set e(Object value, C3862a c3862a) {
        CodedException codedException;
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.f1429c.c()) {
            return CollectionsKt.S0((List) value);
        }
        List list = (List) value;
        ArrayList arrayList = new ArrayList(CollectionsKt.u(list, 10));
        for (Object obj : list) {
            try {
                arrayList.add(this.f1429c.a(obj, c3862a));
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
                kotlin.reflect.o oVar = this.f1428b;
                kotlin.reflect.o c10 = ((KTypeProjection) CollectionsKt.d0(oVar.f())).c();
                Intrinsics.d(c10);
                Intrinsics.d(obj);
                throw new C3124b(oVar, c10, C5142C.b(obj.getClass()), codedException);
            }
        }
        return CollectionsKt.S0(arrayList);
    }

    @Override // Db.AbstractC0812v
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public Set f(Dynamic value, C3862a c3862a) {
        Intrinsics.checkNotNullParameter(value, "value");
        return i(value.asArray(), c3862a);
    }
}
