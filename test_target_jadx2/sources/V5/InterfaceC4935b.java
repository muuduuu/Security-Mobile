package v5;

import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.conscrypt.BuildConfig;

@Retention(RetentionPolicy.RUNTIME)
/* renamed from: v5.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public @interface InterfaceC4935b {

    /* renamed from: v5.b$a */
    public static class a implements Serializable {

        /* renamed from: c, reason: collision with root package name */
        protected static final a f43940c = new a(null, null);

        /* renamed from: a, reason: collision with root package name */
        protected final Object f43941a;

        /* renamed from: b, reason: collision with root package name */
        protected final Boolean f43942b;

        protected a(Object obj, Boolean bool) {
            this.f43941a = obj;
            this.f43942b = bool;
        }

        private static boolean a(Object obj, Boolean bool) {
            return obj == null && bool == null;
        }

        public static a b(Object obj, Boolean bool) {
            if (BuildConfig.FLAVOR.equals(obj)) {
                obj = null;
            }
            return a(obj, bool) ? f43940c : new a(obj, bool);
        }

        public static a c(Object obj) {
            return b(obj, null);
        }

        public static a d(InterfaceC4935b interfaceC4935b) {
            return interfaceC4935b == null ? f43940c : b(interfaceC4935b.value(), interfaceC4935b.useInput().asBoolean());
        }

        public Object e() {
            return this.f43941a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj != null && obj.getClass() == getClass()) {
                a aVar = (a) obj;
                if (M.equals(this.f43942b, aVar.f43942b)) {
                    Object obj2 = this.f43941a;
                    return obj2 == null ? aVar.f43941a == null : obj2.equals(aVar.f43941a);
                }
            }
            return false;
        }

        public boolean f() {
            return this.f43941a != null;
        }

        public a g(Object obj) {
            if (obj == null) {
                if (this.f43941a == null) {
                    return this;
                }
            } else if (obj.equals(this.f43941a)) {
                return this;
            }
            return new a(obj, this.f43942b);
        }

        public int hashCode() {
            Object obj = this.f43941a;
            int hashCode = obj != null ? 1 + obj.hashCode() : 1;
            Boolean bool = this.f43942b;
            return bool != null ? hashCode + bool.hashCode() : hashCode;
        }

        public String toString() {
            return String.format("JacksonInject.Value(id=%s,useInput=%s)", this.f43941a, this.f43942b);
        }
    }

    M useInput() default M.DEFAULT;

    String value() default "";
}
