package P8;

import com.google.gson.q;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class m {

    private static abstract class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f7618a;

        class a extends b {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Method f7619b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Method method) {
                super();
                this.f7619b = method;
            }

            @Override // P8.m.b
            public boolean a(AccessibleObject accessibleObject, Object obj) {
                try {
                    return ((Boolean) this.f7619b.invoke(accessibleObject, obj)).booleanValue();
                } catch (Exception e10) {
                    throw new RuntimeException("Failed invoking canAccess", e10);
                }
            }
        }

        /* renamed from: P8.m$b$b, reason: collision with other inner class name */
        class C0147b extends b {
            C0147b() {
                super();
            }

            @Override // P8.m.b
            public boolean a(AccessibleObject accessibleObject, Object obj) {
                return true;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:5:0x001d  */
        static {
            b aVar;
            if (e.c()) {
                try {
                    aVar = new a(AccessibleObject.class.getDeclaredMethod("canAccess", Object.class));
                } catch (NoSuchMethodException unused) {
                }
                if (aVar == null) {
                    aVar = new C0147b();
                }
                f7618a = aVar;
            }
            aVar = null;
            if (aVar == null) {
            }
            f7618a = aVar;
        }

        private b() {
        }

        public abstract boolean a(AccessibleObject accessibleObject, Object obj);
    }

    public static boolean a(AccessibleObject accessibleObject, Object obj) {
        return b.f7618a.a(accessibleObject, obj);
    }

    public static q b(List list, Class cls) {
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return q.ALLOW;
        }
        android.support.v4.media.session.b.a(it.next());
        throw null;
    }
}
