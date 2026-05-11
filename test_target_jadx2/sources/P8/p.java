package P8;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final p f7624a = c();

    class a extends p {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Method f7625b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f7626c;

        a(Method method, Object obj) {
            this.f7625b = method;
            this.f7626c = obj;
        }

        @Override // P8.p
        public Object d(Class cls) {
            p.b(cls);
            return this.f7625b.invoke(this.f7626c, cls);
        }
    }

    class b extends p {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Method f7627b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f7628c;

        b(Method method, int i10) {
            this.f7627b = method;
            this.f7628c = i10;
        }

        @Override // P8.p
        public Object d(Class cls) {
            p.b(cls);
            return this.f7627b.invoke(null, cls, Integer.valueOf(this.f7628c));
        }
    }

    class c extends p {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Method f7629b;

        c(Method method) {
            this.f7629b = method;
        }

        @Override // P8.p
        public Object d(Class cls) {
            p.b(cls);
            return this.f7629b.invoke(null, cls, Object.class);
        }
    }

    class d extends p {
        d() {
        }

        @Override // P8.p
        public Object d(Class cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls + ". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Class cls) {
        String a10 = P8.c.a(cls);
        if (a10 == null) {
            return;
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: " + a10);
    }

    private static p c() {
        try {
            try {
                try {
                    Class<?> cls = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    return new a(cls.getMethod("allocateInstance", Class.class), declaredField.get(null));
                } catch (Exception unused) {
                    return new d();
                }
            } catch (Exception unused2) {
                Method declaredMethod = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                declaredMethod.setAccessible(true);
                return new c(declaredMethod);
            }
        } catch (Exception unused3) {
            Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
            declaredMethod2.setAccessible(true);
            int intValue = ((Integer) declaredMethod2.invoke(null, Object.class)).intValue();
            Method declaredMethod3 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
            declaredMethod3.setAccessible(true);
            return new b(declaredMethod3, intValue);
        }
    }

    public abstract Object d(Class cls);
}
