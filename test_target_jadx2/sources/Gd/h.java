package Gd;

/* loaded from: classes3.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f3023a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f3024b = false;

    static class a {
        a() {
        }

        public String toString() {
            return "NULL_VALUE";
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final Throwable f3025a;

        /* synthetic */ b(Throwable th, a aVar) {
            this(th);
        }

        private static /* synthetic */ void a(int i10) {
            String str = i10 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 1 ? 3 : 2];
            if (i10 != 1) {
                objArr[0] = "throwable";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
            }
            if (i10 != 1) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
            } else {
                objArr[1] = "getThrowable";
            }
            if (i10 != 1) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i10 == 1) {
                throw new IllegalStateException(format);
            }
        }

        public Throwable b() {
            Throwable th = this.f3025a;
            if (th == null) {
                a(1);
            }
            return th;
        }

        public String toString() {
            return this.f3025a.toString();
        }

        private b(Throwable th) {
            if (th == null) {
                a(0);
            }
            this.f3025a = th;
        }
    }

    public static class c extends RuntimeException {
        public c(Throwable th) {
            super("Rethrow stored exception", th);
        }
    }

    private static /* synthetic */ void a(int i10) {
        String str = (i10 == 1 || i10 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 1 || i10 == 2) ? 2 : 3];
        if (i10 == 1 || i10 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues";
        } else if (i10 != 3) {
            objArr[0] = "value";
        } else {
            objArr[0] = "throwable";
        }
        if (i10 == 1 || i10 == 2) {
            objArr[1] = "escapeNull";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues";
        }
        if (i10 != 1 && i10 != 2) {
            if (i10 == 3) {
                objArr[2] = "escapeThrowable";
            } else if (i10 != 4) {
                objArr[2] = "unescapeNull";
            } else {
                objArr[2] = "unescapeExceptionOrNull";
            }
        }
        String format = String.format(str, objArr);
        if (i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public static Object b(Object obj) {
        if (obj == null && (obj = f3023a) == null) {
            a(1);
        }
        return obj;
    }

    public static Object c(Throwable th) {
        if (th == null) {
            a(3);
        }
        return new b(th, null);
    }

    public static Object d(Object obj) {
        if (obj == null) {
            a(4);
        }
        return e(f(obj));
    }

    public static Object e(Object obj) {
        if (obj == null) {
            a(0);
        }
        if (obj == f3023a) {
            return null;
        }
        return obj;
    }

    public static Object f(Object obj) {
        if (!(obj instanceof b)) {
            return obj;
        }
        Throwable b10 = ((b) obj).b();
        if (f3024b && d.a(b10)) {
            throw new c(b10);
        }
        throw d.b(b10);
    }
}
