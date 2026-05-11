package Pc;

import Zc.InterfaceC1328a;
import id.C3367b;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class z implements Zc.x {

    /* renamed from: a, reason: collision with root package name */
    public static final a f7775a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final z a(Type type) {
            Intrinsics.checkNotNullParameter(type, "type");
            boolean z10 = type instanceof Class;
            if (z10) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    return new x(cls);
                }
            }
            return ((type instanceof GenericArrayType) || (z10 && ((Class) type).isArray())) ? new k(type) : type instanceof WildcardType ? new C((WildcardType) type) : new n(type);
        }

        private a() {
        }
    }

    protected abstract Type X();

    public boolean equals(Object obj) {
        return (obj instanceof z) && Intrinsics.b(X(), ((z) obj).X());
    }

    public int hashCode() {
        return X().hashCode();
    }

    @Override // Zc.InterfaceC1331d
    public InterfaceC1328a p(id.c fqName) {
        Object obj;
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Iterator it = i().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            C3367b l10 = ((InterfaceC1328a) next).l();
            if (Intrinsics.b(l10 != null ? l10.b() : null, fqName)) {
                obj = next;
                break;
            }
        }
        return (InterfaceC1328a) obj;
    }

    public String toString() {
        return getClass().getName() + ": " + X();
    }
}
