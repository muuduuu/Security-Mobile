package sb;

import java.lang.reflect.Constructor;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.G;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.j;
import vc.AbstractC5011a;

/* loaded from: classes2.dex */
public final class e {
    private final InterfaceC4510a e(Class cls) {
        try {
            final Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return new InterfaceC4510a() { // from class: sb.c
                @Override // sb.InterfaceC4510a
                public final Object a() {
                    Object f10;
                    f10 = e.f(declaredConstructor);
                    return f10;
                }
            };
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object f(Constructor constructor) {
        return constructor.newInstance(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004c, code lost:
    
        if (r1 == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final InterfaceC4510a g(kotlin.reflect.d dVar) {
        Iterator it = dVar.k().iterator();
        boolean z10 = false;
        Object obj = null;
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                List c10 = ((kotlin.reflect.g) next).c();
                if (!(c10 instanceof Collection) || !c10.isEmpty()) {
                    Iterator it2 = c10.iterator();
                    while (it2.hasNext()) {
                        if (!((j) it2.next()).A()) {
                            break;
                        }
                    }
                }
                if (z10) {
                    break;
                }
                z10 = true;
                obj = next;
            }
        }
        final kotlin.reflect.g gVar = (kotlin.reflect.g) obj;
        if (gVar == null) {
            return null;
        }
        return new InterfaceC4510a() { // from class: sb.d
            @Override // sb.InterfaceC4510a
            public final Object a() {
                Object h10;
                h10 = e.h(kotlin.reflect.g.this);
                return h10;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object h(kotlin.reflect.g noArgsConstructor) {
        Intrinsics.checkNotNullParameter(noArgsConstructor, "$noArgsConstructor");
        return noArgsConstructor.v(G.h());
    }

    private final InterfaceC4510a i(Class cls) {
        final i d10 = i.f41689a.d(cls);
        return new InterfaceC4510a() { // from class: sb.b
            @Override // sb.InterfaceC4510a
            public final Object a() {
                Object j10;
                j10 = e.j(i.this);
                return j10;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object j(i allocator) {
        Intrinsics.checkNotNullParameter(allocator, "$allocator");
        return allocator.b();
    }

    public final InterfaceC4510a d(kotlin.reflect.d clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        InterfaceC4510a e10 = e(AbstractC5011a.b(clazz));
        if (e10 != null) {
            return e10;
        }
        InterfaceC4510a g10 = g(clazz);
        return g10 == null ? i(AbstractC5011a.b(clazz)) : g10;
    }
}
