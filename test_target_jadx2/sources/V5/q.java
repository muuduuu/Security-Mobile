package v5;

import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes2.dex */
public @interface q {

    public static class a implements Serializable {

        /* renamed from: b, reason: collision with root package name */
        protected static final a f43967b = new a(null);

        /* renamed from: a, reason: collision with root package name */
        protected final Set f43968a;

        protected a(Set set) {
            this.f43968a = set;
        }

        private static Set a(String[] strArr) {
            if (strArr == null || strArr.length == 0) {
                return Collections.emptySet();
            }
            HashSet hashSet = new HashSet(strArr.length);
            for (String str : strArr) {
                hashSet.add(str);
            }
            return hashSet;
        }

        private static boolean b(Set set, Set set2) {
            return set == null ? set2 == null : set.equals(set2);
        }

        public static a c() {
            return f43967b;
        }

        public static a d(q qVar) {
            return qVar == null ? f43967b : new a(a(qVar.value()));
        }

        public Set e() {
            return this.f43968a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            return obj.getClass() == getClass() && b(this.f43968a, ((a) obj).f43968a);
        }

        public int hashCode() {
            Set set = this.f43968a;
            if (set == null) {
                return 0;
            }
            return set.size();
        }

        public String toString() {
            return String.format("JsonIncludeProperties.Value(included=%s)", this.f43968a);
        }
    }

    String[] value() default {};
}
