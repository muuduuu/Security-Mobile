package Pc;

import Pc.z;
import Zc.InterfaceC1328a;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class n extends z implements Zc.j {

    /* renamed from: b, reason: collision with root package name */
    private final Type f7763b;

    /* renamed from: c, reason: collision with root package name */
    private final Zc.i f7764c;

    public n(Type reflectType) {
        Zc.i lVar;
        Intrinsics.checkNotNullParameter(reflectType, "reflectType");
        this.f7763b = reflectType;
        Type X10 = X();
        if (X10 instanceof Class) {
            lVar = new l((Class) X10);
        } else if (X10 instanceof TypeVariable) {
            lVar = new A((TypeVariable) X10);
        } else {
            if (!(X10 instanceof ParameterizedType)) {
                throw new IllegalStateException("Not a classifier type (" + X10.getClass() + "): " + X10);
            }
            Type rawType = ((ParameterizedType) X10).getRawType();
            Intrinsics.e(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            lVar = new l((Class) rawType);
        }
        this.f7764c = lVar;
    }

    @Override // Zc.j
    public boolean D() {
        Type X10 = X();
        if (!(X10 instanceof Class)) {
            return false;
        }
        TypeVariable[] typeParameters = ((Class) X10).getTypeParameters();
        Intrinsics.checkNotNullExpressionValue(typeParameters, "getTypeParameters(...)");
        return !(typeParameters.length == 0);
    }

    @Override // Zc.j
    public String E() {
        throw new UnsupportedOperationException("Type not found: " + X());
    }

    @Override // Zc.j
    public List L() {
        List d10 = d.d(X());
        z.a aVar = z.f7775a;
        ArrayList arrayList = new ArrayList(CollectionsKt.u(d10, 10));
        Iterator it = d10.iterator();
        while (it.hasNext()) {
            arrayList.add(aVar.a((Type) it.next()));
        }
        return arrayList;
    }

    @Override // Pc.z
    public Type X() {
        return this.f7763b;
    }

    @Override // Zc.InterfaceC1331d
    public Collection i() {
        return CollectionsKt.j();
    }

    @Override // Zc.j
    public Zc.i j() {
        return this.f7764c;
    }

    @Override // Pc.z, Zc.InterfaceC1331d
    public InterfaceC1328a p(id.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return null;
    }

    @Override // Zc.InterfaceC1331d
    public boolean s() {
        return false;
    }

    @Override // Zc.j
    public String v() {
        return X().toString();
    }
}
