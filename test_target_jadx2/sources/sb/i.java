package sb;

import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import sb.i;

/* loaded from: classes2.dex */
public interface i {

    /* renamed from: a, reason: collision with root package name */
    public static final a f41689a = a.f41690a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f41690a = new a();

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object e(Method method, Class clazz, int i10) {
            Intrinsics.checkNotNullParameter(clazz, "$clazz");
            return method.invoke(null, clazz, Integer.valueOf(i10));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object f(Method method, Object obj, Class clazz) {
            Intrinsics.checkNotNullParameter(clazz, "$clazz");
            return method.invoke(obj, clazz);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object g(Class clazz) {
            Intrinsics.checkNotNullParameter(clazz, "$clazz");
            throw new IllegalArgumentException("Cannot allocate " + clazz);
        }

        public final i d(final Class clazz) {
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            try {
                try {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    Object invoke = declaredMethod.invoke(null, Object.class);
                    Intrinsics.e(invoke, "null cannot be cast to non-null type kotlin.Int");
                    final int intValue = ((Integer) invoke).intValue();
                    final Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    return new i() { // from class: sb.f
                        @Override // sb.i
                        public final Object b() {
                            Object e10;
                            e10 = i.a.e(declaredMethod2, clazz, intValue);
                            return e10;
                        }
                    };
                } catch (Throwable unused) {
                    Class<?> cls = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    final Object obj = declaredField.get(null);
                    final Method method = cls.getMethod("allocateInstance", Class.class);
                    return new i() { // from class: sb.g
                        @Override // sb.i
                        public final Object b() {
                            Object f10;
                            f10 = i.a.f(method, obj, clazz);
                            return f10;
                        }
                    };
                }
            } catch (Throwable unused2) {
                return new i() { // from class: sb.h
                    @Override // sb.i
                    public final Object b() {
                        Object g10;
                        g10 = i.a.g(clazz);
                        return g10;
                    }
                };
            }
        }
    }

    Object b();
}
