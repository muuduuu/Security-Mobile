package g8;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public abstract class d {

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f33574a;

        /* renamed from: b, reason: collision with root package name */
        private final a f33575b;

        /* renamed from: c, reason: collision with root package name */
        private a f33576c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f33577d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f33578e;

        private static class a {

            /* renamed from: a, reason: collision with root package name */
            String f33579a;

            /* renamed from: b, reason: collision with root package name */
            Object f33580b;

            /* renamed from: c, reason: collision with root package name */
            a f33581c;

            private a() {
            }
        }

        private a a() {
            a aVar = new a();
            this.f33576c.f33581c = aVar;
            this.f33576c = aVar;
            return aVar;
        }

        private b b(Object obj) {
            a().f33580b = obj;
            return this;
        }

        private static boolean d(Object obj) {
            return obj instanceof CharSequence ? ((CharSequence) obj).length() == 0 : obj instanceof Collection ? ((Collection) obj).isEmpty() : obj instanceof Map ? ((Map) obj).isEmpty() : obj instanceof g ? !((g) obj).c() : obj.getClass().isArray() && Array.getLength(obj) == 0;
        }

        public b c(Object obj) {
            return b(obj);
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public String toString() {
            String str;
            boolean z10 = this.f33577d;
            boolean z11 = this.f33578e;
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append(this.f33574a);
            sb2.append('{');
            String str2 = BuildConfig.FLAVOR;
            for (a aVar = this.f33575b.f33581c; aVar != null; aVar = aVar.f33581c) {
                Object obj = aVar.f33580b;
                if (obj == null) {
                    if (z10) {
                    }
                    sb2.append(str2);
                    str = aVar.f33579a;
                    if (str != null) {
                        sb2.append(str);
                        sb2.append('=');
                    }
                    if (obj == null && obj.getClass().isArray()) {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        sb2.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                    } else {
                        sb2.append(obj);
                    }
                    str2 = ", ";
                } else {
                    if (z11 && d(obj)) {
                    }
                    sb2.append(str2);
                    str = aVar.f33579a;
                    if (str != null) {
                    }
                    if (obj == null) {
                    }
                    sb2.append(obj);
                    str2 = ", ";
                }
            }
            sb2.append('}');
            return sb2.toString();
        }

        private b(String str) {
            a aVar = new a();
            this.f33575b = aVar;
            this.f33576c = aVar;
            this.f33577d = false;
            this.f33578e = false;
            this.f33574a = (String) h.h(str);
        }
    }

    public static b a(Object obj) {
        return new b(obj.getClass().getSimpleName());
    }
}
