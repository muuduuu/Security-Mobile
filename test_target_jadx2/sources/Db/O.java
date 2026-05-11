package Db;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableMap;
import expo.modules.kotlin.exception.C3124b;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.jni.ExpectedType;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import pb.C3862a;
import xc.C5142C;

/* loaded from: classes2.dex */
public final class O extends AbstractC0812v {

    /* renamed from: b, reason: collision with root package name */
    private final kotlin.reflect.o f1418b;

    /* renamed from: c, reason: collision with root package name */
    private final W f1419c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(X converterProvider, kotlin.reflect.o mapType) {
        super(mapType.p());
        Intrinsics.checkNotNullParameter(converterProvider, "converterProvider");
        Intrinsics.checkNotNullParameter(mapType, "mapType");
        this.f1418b = mapType;
        kotlin.reflect.o c10 = ((KTypeProjection) CollectionsKt.d0(mapType.f())).c();
        if (Intrinsics.b(c10 != null ? c10.j() : null, C5142C.b(String.class))) {
            KTypeProjection kTypeProjection = (KTypeProjection) CollectionsKt.f0(mapType.f(), 1);
            kotlin.reflect.o c11 = kTypeProjection != null ? kTypeProjection.c() : null;
            if (c11 == null) {
                throw new IllegalArgumentException("The map type should contain the key type.");
            }
            this.f1419c = converterProvider.a(c11);
            return;
        }
        throw new IllegalArgumentException(("The map key type should be String, but received " + CollectionsKt.d0(mapType.f()) + ".").toString());
    }

    private final Map i(ReadableMap readableMap, C3862a c3862a) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, Object>> entryIterator = readableMap.getEntryIterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Object> next = entryIterator.next();
            String key = next.getKey();
            DynamicFromObject dynamicFromObject = new DynamicFromObject(next.getValue());
            try {
                linkedHashMap.put(key, this.f1419c.a(dynamicFromObject, c3862a));
                Unit unit = Unit.f36324a;
                dynamicFromObject.recycle();
            } finally {
            }
        }
        return linkedHashMap;
    }

    @Override // Db.W
    public ExpectedType b() {
        return ExpectedType.INSTANCE.c(this.f1419c.b());
    }

    @Override // Db.W
    public boolean c() {
        return this.f1419c.c();
    }

    @Override // Db.AbstractC0812v
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Map e(Object value, C3862a c3862a) {
        CodedException codedException;
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.f1419c.c()) {
            return (Map) value;
        }
        Map map = (Map) value;
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.collections.G.d(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value2 = entry.getValue();
            try {
                linkedHashMap.put(key, this.f1419c.a(value2, c3862a));
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
                kotlin.reflect.o oVar = this.f1418b;
                kotlin.reflect.o c10 = ((KTypeProjection) oVar.f().get(1)).c();
                Intrinsics.d(c10);
                Intrinsics.d(value2);
                throw new C3124b(oVar, c10, C5142C.b(value2.getClass()), codedException);
            }
        }
        return linkedHashMap;
    }

    @Override // Db.AbstractC0812v
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public Map f(Dynamic value, C3862a c3862a) {
        Intrinsics.checkNotNullParameter(value, "value");
        return i(value.asMap(), c3862a);
    }
}
