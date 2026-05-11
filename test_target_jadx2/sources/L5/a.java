package L5;

import T5.f;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: L5.a$a, reason: collision with other inner class name */
    static class C0110a {

        /* renamed from: d, reason: collision with root package name */
        private static final C0110a f5694d;

        /* renamed from: e, reason: collision with root package name */
        private static final RuntimeException f5695e;

        /* renamed from: a, reason: collision with root package name */
        private final Method f5696a;

        /* renamed from: b, reason: collision with root package name */
        private final Method f5697b;

        /* renamed from: c, reason: collision with root package name */
        private final Method f5698c;

        static {
            C0110a c0110a = null;
            try {
                e = null;
                c0110a = new C0110a();
            } catch (RuntimeException e10) {
                e = e10;
            }
            f5694d = c0110a;
            f5695e = e;
        }

        private C0110a() {
            try {
                this.f5696a = Class.class.getMethod("getRecordComponents", null);
                Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
                this.f5697b = cls.getMethod("getName", null);
                this.f5698c = cls.getMethod("getType", null);
            } catch (Exception e10) {
                throw new RuntimeException(String.format("Failed to access Methods needed to support `java.lang.Record`: (%s) %s", e10.getClass().getName(), e10.getMessage()), e10);
            }
        }

        public static C0110a b() {
            RuntimeException runtimeException = f5695e;
            if (runtimeException == null) {
                return f5694d;
            }
            throw runtimeException;
        }

        public String[] a(Class cls) {
            Object[] c10 = c(cls);
            String[] strArr = new String[c10.length];
            for (int i10 = 0; i10 < c10.length; i10++) {
                try {
                    strArr[i10] = (String) this.f5697b.invoke(c10[i10], null);
                } catch (Exception e10) {
                    throw new IllegalArgumentException(String.format("Failed to access name of field #%d (of %d) of Record type %s", Integer.valueOf(i10), Integer.valueOf(c10.length), f.Q(cls)), e10);
                }
            }
            return strArr;
        }

        protected Object[] c(Class cls) {
            try {
                return (Object[]) this.f5696a.invoke(cls, null);
            } catch (Exception unused) {
                throw new IllegalArgumentException("Failed to access RecordComponents of type " + f.Q(cls));
            }
        }
    }

    public static String[] a(Class cls) {
        return C0110a.b().a(cls);
    }
}
