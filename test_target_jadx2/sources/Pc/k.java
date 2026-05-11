package Pc;

import Pc.z;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class k extends z implements Zc.f {

    /* renamed from: b, reason: collision with root package name */
    private final Type f7749b;

    /* renamed from: c, reason: collision with root package name */
    private final z f7750c;

    /* renamed from: d, reason: collision with root package name */
    private final Collection f7751d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f7752e;

    public k(Type reflectType) {
        z a10;
        Intrinsics.checkNotNullParameter(reflectType, "reflectType");
        this.f7749b = reflectType;
        Type X10 = X();
        if (!(X10 instanceof GenericArrayType)) {
            if (X10 instanceof Class) {
                Class cls = (Class) X10;
                if (cls.isArray()) {
                    z.a aVar = z.f7775a;
                    Class<?> componentType = cls.getComponentType();
                    Intrinsics.checkNotNullExpressionValue(componentType, "getComponentType(...)");
                    a10 = aVar.a(componentType);
                }
            }
            throw new IllegalArgumentException("Not an array type (" + X().getClass() + "): " + X());
        }
        z.a aVar2 = z.f7775a;
        Type genericComponentType = ((GenericArrayType) X10).getGenericComponentType();
        Intrinsics.checkNotNullExpressionValue(genericComponentType, "getGenericComponentType(...)");
        a10 = aVar2.a(genericComponentType);
        this.f7750c = a10;
        this.f7751d = CollectionsKt.j();
    }

    @Override // Pc.z
    protected Type X() {
        return this.f7749b;
    }

    @Override // Zc.f
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public z t() {
        return this.f7750c;
    }

    @Override // Zc.InterfaceC1331d
    public Collection i() {
        return this.f7751d;
    }

    @Override // Zc.InterfaceC1331d
    public boolean s() {
        return this.f7752e;
    }
}
