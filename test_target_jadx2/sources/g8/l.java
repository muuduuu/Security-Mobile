package g8;

import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes2.dex */
public abstract class l {

    static class a implements k, Serializable {

        /* renamed from: a, reason: collision with root package name */
        final k f33583a;

        /* renamed from: b, reason: collision with root package name */
        volatile transient boolean f33584b;

        /* renamed from: c, reason: collision with root package name */
        transient Object f33585c;

        a(k kVar) {
            this.f33583a = (k) h.h(kVar);
        }

        @Override // g8.k
        public Object get() {
            if (!this.f33584b) {
                synchronized (this) {
                    try {
                        if (!this.f33584b) {
                            Object obj = this.f33583a.get();
                            this.f33585c = obj;
                            this.f33584b = true;
                            return obj;
                        }
                    } finally {
                    }
                }
            }
            return e.a(this.f33585c);
        }

        public String toString() {
            Object obj;
            if (this.f33584b) {
                String valueOf = String.valueOf(this.f33585c);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 25);
                sb2.append("<supplier that returned ");
                sb2.append(valueOf);
                sb2.append(">");
                obj = sb2.toString();
            } else {
                obj = this.f33583a;
            }
            String valueOf2 = String.valueOf(obj);
            StringBuilder sb3 = new StringBuilder(valueOf2.length() + 19);
            sb3.append("Suppliers.memoize(");
            sb3.append(valueOf2);
            sb3.append(")");
            return sb3.toString();
        }
    }

    static class b implements k {

        /* renamed from: a, reason: collision with root package name */
        volatile k f33586a;

        /* renamed from: b, reason: collision with root package name */
        volatile boolean f33587b;

        /* renamed from: c, reason: collision with root package name */
        Object f33588c;

        b(k kVar) {
            this.f33586a = (k) h.h(kVar);
        }

        @Override // g8.k
        public Object get() {
            if (!this.f33587b) {
                synchronized (this) {
                    try {
                        if (!this.f33587b) {
                            k kVar = this.f33586a;
                            Objects.requireNonNull(kVar);
                            Object obj = kVar.get();
                            this.f33588c = obj;
                            this.f33587b = true;
                            this.f33586a = null;
                            return obj;
                        }
                    } finally {
                    }
                }
            }
            return e.a(this.f33588c);
        }

        public String toString() {
            Object obj = this.f33586a;
            if (obj == null) {
                String valueOf = String.valueOf(this.f33588c);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 25);
                sb2.append("<supplier that returned ");
                sb2.append(valueOf);
                sb2.append(">");
                obj = sb2.toString();
            }
            String valueOf2 = String.valueOf(obj);
            StringBuilder sb3 = new StringBuilder(valueOf2.length() + 19);
            sb3.append("Suppliers.memoize(");
            sb3.append(valueOf2);
            sb3.append(")");
            return sb3.toString();
        }
    }

    private static class c implements k, Serializable {

        /* renamed from: a, reason: collision with root package name */
        final Object f33589a;

        c(Object obj) {
            this.f33589a = obj;
        }

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                return f.a(this.f33589a, ((c) obj).f33589a);
            }
            return false;
        }

        @Override // g8.k
        public Object get() {
            return this.f33589a;
        }

        public int hashCode() {
            return f.b(this.f33589a);
        }

        public String toString() {
            String valueOf = String.valueOf(this.f33589a);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 22);
            sb2.append("Suppliers.ofInstance(");
            sb2.append(valueOf);
            sb2.append(")");
            return sb2.toString();
        }
    }

    public static k a(k kVar) {
        return ((kVar instanceof b) || (kVar instanceof a)) ? kVar : kVar instanceof Serializable ? new a(kVar) : new b(kVar);
    }

    public static k b(Object obj) {
        return new c(obj);
    }
}
