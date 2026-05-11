package v5;

import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes2.dex */
public @interface z {

    public static class a implements Serializable {

        /* renamed from: c, reason: collision with root package name */
        protected static final a f43969c;

        /* renamed from: a, reason: collision with root package name */
        private final H f43970a;

        /* renamed from: b, reason: collision with root package name */
        private final H f43971b;

        static {
            H h10 = H.DEFAULT;
            f43969c = new a(h10, h10);
        }

        protected a(H h10, H h11) {
            this.f43970a = h10;
            this.f43971b = h11;
        }

        private static boolean a(H h10, H h11) {
            H h12 = H.DEFAULT;
            return h10 == h12 && h11 == h12;
        }

        public static a b(H h10, H h11) {
            if (h10 == null) {
                h10 = H.DEFAULT;
            }
            if (h11 == null) {
                h11 = H.DEFAULT;
            }
            return a(h10, h11) ? f43969c : new a(h10, h11);
        }

        public static a c() {
            return f43969c;
        }

        public static a d(z zVar) {
            return zVar == null ? f43969c : b(zVar.nulls(), zVar.contentNulls());
        }

        public H e() {
            H h10 = this.f43971b;
            if (h10 == H.DEFAULT) {
                return null;
            }
            return h10;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.f43970a == this.f43970a && aVar.f43971b == this.f43971b;
        }

        public H f() {
            H h10 = this.f43970a;
            if (h10 == H.DEFAULT) {
                return null;
            }
            return h10;
        }

        public int hashCode() {
            return this.f43970a.ordinal() + (this.f43971b.ordinal() << 2);
        }

        public String toString() {
            return String.format("JsonSetter.Value(valueNulls=%s,contentNulls=%s)", this.f43970a, this.f43971b);
        }
    }

    H contentNulls() default H.DEFAULT;

    H nulls() default H.DEFAULT;

    String value() default "";
}
