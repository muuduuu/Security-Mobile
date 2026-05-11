package rc;

import java.lang.reflect.Method;
import kotlin.collections.AbstractC3574i;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: rc.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4297a {

    /* renamed from: rc.a$a, reason: collision with other inner class name */
    private static final class C0606a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0606a f40596a = new C0606a();

        /* renamed from: b, reason: collision with root package name */
        public static final Method f40597b;

        /* renamed from: c, reason: collision with root package name */
        public static final Method f40598c;

        static {
            Method method;
            Method method2;
            Method[] methods = Throwable.class.getMethods();
            Intrinsics.d(methods);
            int length = methods.length;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                method = null;
                if (i11 >= length) {
                    method2 = null;
                    break;
                }
                method2 = methods[i11];
                if (Intrinsics.b(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    Intrinsics.checkNotNullExpressionValue(parameterTypes, "getParameterTypes(...)");
                    if (Intrinsics.b(AbstractC3574i.a0(parameterTypes), Throwable.class)) {
                        break;
                    }
                }
                i11++;
            }
            f40597b = method2;
            int length2 = methods.length;
            while (true) {
                if (i10 >= length2) {
                    break;
                }
                Method method3 = methods[i10];
                if (Intrinsics.b(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
                i10++;
            }
            f40598c = method;
        }

        private C0606a() {
        }
    }

    public void a(Throwable cause, Throwable exception) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        Intrinsics.checkNotNullParameter(exception, "exception");
        Method method = C0606a.f40597b;
        if (method != null) {
            method.invoke(cause, exception);
        }
    }
}
