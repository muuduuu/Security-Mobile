package V6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: V6.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1286q {

    /* renamed from: V6.q$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List f11003a;

        /* renamed from: b, reason: collision with root package name */
        private final Object f11004b;

        /* synthetic */ a(Object obj, byte[] bArr) {
            AbstractC1287s.m(obj);
            this.f11004b = obj;
            this.f11003a = new ArrayList();
        }

        public a a(String str, Object obj) {
            AbstractC1287s.m(str);
            int length = str.length();
            String valueOf = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(length + 1 + valueOf.length());
            sb2.append(str);
            sb2.append("=");
            sb2.append(valueOf);
            this.f11003a.add(sb2.toString());
            return this;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(100);
            sb2.append(this.f11004b.getClass().getSimpleName());
            sb2.append('{');
            List list = this.f11003a;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb2.append((String) list.get(i10));
                if (i10 < size - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append('}');
            return sb2.toString();
        }
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static a c(Object obj) {
        return new a(obj, null);
    }
}
