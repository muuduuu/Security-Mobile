package v5;

import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Retention(RetentionPolicy.RUNTIME)
/* renamed from: v5.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public @interface InterfaceC4947n {

    /* renamed from: v5.n$a */
    public static class a implements Serializable {

        /* renamed from: f, reason: collision with root package name */
        protected static final a f43956f = new a(Collections.emptySet(), false, false, false, true);

        /* renamed from: a, reason: collision with root package name */
        protected final Set f43957a;

        /* renamed from: b, reason: collision with root package name */
        protected final boolean f43958b;

        /* renamed from: c, reason: collision with root package name */
        protected final boolean f43959c;

        /* renamed from: d, reason: collision with root package name */
        protected final boolean f43960d;

        /* renamed from: e, reason: collision with root package name */
        protected final boolean f43961e;

        protected a(Set set, boolean z10, boolean z11, boolean z12, boolean z13) {
            if (set == null) {
                this.f43957a = Collections.emptySet();
            } else {
                this.f43957a = set;
            }
            this.f43958b = z10;
            this.f43959c = z11;
            this.f43960d = z12;
            this.f43961e = z13;
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

        private static boolean b(Set set, boolean z10, boolean z11, boolean z12, boolean z13) {
            a aVar = f43956f;
            if (z10 == aVar.f43958b && z11 == aVar.f43959c && z12 == aVar.f43960d && z13 == aVar.f43961e) {
                return set == null || set.size() == 0;
            }
            return false;
        }

        private static boolean c(a aVar, a aVar2) {
            return aVar.f43958b == aVar2.f43958b && aVar.f43961e == aVar2.f43961e && aVar.f43959c == aVar2.f43959c && aVar.f43960d == aVar2.f43960d && aVar.f43957a.equals(aVar2.f43957a);
        }

        private static Set d(Set set, Set set2) {
            if (set.isEmpty()) {
                return set2;
            }
            if (set2.isEmpty()) {
                return set;
            }
            HashSet hashSet = new HashSet(set.size() + set2.size());
            hashSet.addAll(set);
            hashSet.addAll(set2);
            return hashSet;
        }

        public static a e(Set set, boolean z10, boolean z11, boolean z12, boolean z13) {
            return b(set, z10, z11, z12, z13) ? f43956f : new a(set, z10, z11, z12, z13);
        }

        public static a f() {
            return f43956f;
        }

        public static a h(InterfaceC4947n interfaceC4947n) {
            return interfaceC4947n == null ? f43956f : e(a(interfaceC4947n.value()), interfaceC4947n.ignoreUnknown(), interfaceC4947n.allowGetters(), interfaceC4947n.allowSetters(), false);
        }

        public static a i(a aVar, a aVar2) {
            return aVar == null ? aVar2 : aVar.j(aVar2);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            return obj.getClass() == getClass() && c(this, (a) obj);
        }

        public Set g() {
            return this.f43959c ? Collections.emptySet() : this.f43957a;
        }

        public int hashCode() {
            return this.f43957a.size() + (this.f43958b ? 1 : -3) + (this.f43959c ? 3 : -7) + (this.f43960d ? 7 : -11) + (this.f43961e ? 11 : -13);
        }

        public a j(a aVar) {
            if (aVar == null || aVar == f43956f) {
                return this;
            }
            if (!aVar.f43961e) {
                return aVar;
            }
            if (c(this, aVar)) {
                return this;
            }
            return e(d(this.f43957a, aVar.f43957a), this.f43958b || aVar.f43958b, this.f43959c || aVar.f43959c, this.f43960d || aVar.f43960d, true);
        }

        public String toString() {
            return String.format("JsonIgnoreProperties.Value(ignored=%s,ignoreUnknown=%s,allowGetters=%s,allowSetters=%s,merge=%s)", this.f43957a, Boolean.valueOf(this.f43958b), Boolean.valueOf(this.f43959c), Boolean.valueOf(this.f43960d), Boolean.valueOf(this.f43961e));
        }
    }

    boolean allowGetters() default false;

    boolean allowSetters() default false;

    boolean ignoreUnknown() default false;

    String[] value() default {};
}
