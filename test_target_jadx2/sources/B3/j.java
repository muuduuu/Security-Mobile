package b3;

import java.util.Arrays;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
public abstract class j {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f18543a;

        /* renamed from: b, reason: collision with root package name */
        private final C0323a f18544b;

        /* renamed from: c, reason: collision with root package name */
        private C0323a f18545c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f18546d;

        /* renamed from: b3.j$a$a, reason: collision with other inner class name */
        private static final class C0323a {

            /* renamed from: a, reason: collision with root package name */
            String f18547a;

            /* renamed from: b, reason: collision with root package name */
            Object f18548b;

            /* renamed from: c, reason: collision with root package name */
            C0323a f18549c;

            private C0323a() {
            }
        }

        private C0323a d() {
            C0323a c0323a = new C0323a();
            this.f18545c.f18549c = c0323a;
            this.f18545c = c0323a;
            return c0323a;
        }

        private a e(String str, Object obj) {
            C0323a d10 = d();
            d10.f18548b = obj;
            d10.f18547a = (String) l.g(str);
            return this;
        }

        public a a(String str, int i10) {
            return e(str, String.valueOf(i10));
        }

        public a b(String str, Object obj) {
            return e(str, obj);
        }

        public a c(String str, boolean z10) {
            return e(str, String.valueOf(z10));
        }

        public String toString() {
            boolean z10 = this.f18546d;
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append(this.f18543a);
            sb2.append('{');
            String str = BuildConfig.FLAVOR;
            for (C0323a c0323a = this.f18544b.f18549c; c0323a != null; c0323a = c0323a.f18549c) {
                Object obj = c0323a.f18548b;
                if (!z10 || obj != null) {
                    sb2.append(str);
                    String str2 = c0323a.f18547a;
                    if (str2 != null) {
                        sb2.append(str2);
                        sb2.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb2.append(obj);
                    } else {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        sb2.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                    }
                    str = ", ";
                }
            }
            sb2.append('}');
            return sb2.toString();
        }

        private a(String str) {
            C0323a c0323a = new C0323a();
            this.f18544b = c0323a;
            this.f18545c = c0323a;
            this.f18546d = false;
            this.f18543a = (String) l.g(str);
        }
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static a c(Object obj) {
        return new a(obj.getClass().getSimpleName());
    }
}
