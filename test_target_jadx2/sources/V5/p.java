package v5;

import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes2.dex */
public @interface p {

    public enum a {
        ALWAYS,
        NON_NULL,
        NON_ABSENT,
        NON_EMPTY,
        NON_DEFAULT,
        CUSTOM,
        USE_DEFAULTS
    }

    public static class b implements Serializable {

        /* renamed from: e, reason: collision with root package name */
        protected static final b f43962e;

        /* renamed from: a, reason: collision with root package name */
        protected final a f43963a;

        /* renamed from: b, reason: collision with root package name */
        protected final a f43964b;

        /* renamed from: c, reason: collision with root package name */
        protected final Class f43965c;

        /* renamed from: d, reason: collision with root package name */
        protected final Class f43966d;

        static {
            a aVar = a.USE_DEFAULTS;
            f43962e = new b(aVar, aVar, null, null);
        }

        protected b(a aVar, a aVar2, Class cls, Class cls2) {
            this.f43963a = aVar == null ? a.USE_DEFAULTS : aVar;
            this.f43964b = aVar2 == null ? a.USE_DEFAULTS : aVar2;
            this.f43965c = cls == Void.class ? null : cls;
            this.f43966d = cls2 == Void.class ? null : cls2;
        }

        public static b a(a aVar, a aVar2) {
            a aVar3 = a.USE_DEFAULTS;
            return ((aVar == aVar3 || aVar == null) && (aVar2 == aVar3 || aVar2 == null)) ? f43962e : new b(aVar, aVar2, null, null);
        }

        public static b b(a aVar, a aVar2, Class cls, Class cls2) {
            if (cls == Void.class) {
                cls = null;
            }
            if (cls2 == Void.class) {
                cls2 = null;
            }
            a aVar3 = a.USE_DEFAULTS;
            return ((aVar == aVar3 || aVar == null) && (aVar2 == aVar3 || aVar2 == null) && cls == null && cls2 == null) ? f43962e : new b(aVar, aVar2, cls, cls2);
        }

        public static b c() {
            return f43962e;
        }

        public static b d(p pVar) {
            if (pVar == null) {
                return f43962e;
            }
            a value = pVar.value();
            a content = pVar.content();
            a aVar = a.USE_DEFAULTS;
            if (value == aVar && content == aVar) {
                return f43962e;
            }
            Class valueFilter = pVar.valueFilter();
            if (valueFilter == Void.class) {
                valueFilter = null;
            }
            Class contentFilter = pVar.contentFilter();
            return new b(value, content, valueFilter, contentFilter != Void.class ? contentFilter : null);
        }

        public static b i(b bVar, b bVar2) {
            return bVar == null ? bVar2 : bVar.m(bVar2);
        }

        public static b j(b... bVarArr) {
            b bVar = null;
            for (b bVar2 : bVarArr) {
                if (bVar2 != null) {
                    if (bVar != null) {
                        bVar2 = bVar.m(bVar2);
                    }
                    bVar = bVar2;
                }
            }
            return bVar;
        }

        public Class e() {
            return this.f43966d;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.f43963a == this.f43963a && bVar.f43964b == this.f43964b && bVar.f43965c == this.f43965c && bVar.f43966d == this.f43966d;
        }

        public a f() {
            return this.f43964b;
        }

        public Class g() {
            return this.f43965c;
        }

        public a h() {
            return this.f43963a;
        }

        public int hashCode() {
            return (this.f43963a.hashCode() << 2) + this.f43964b.hashCode();
        }

        public b k(Class cls) {
            a aVar;
            if (cls == null || cls == Void.class) {
                aVar = a.USE_DEFAULTS;
                cls = null;
            } else {
                aVar = a.CUSTOM;
            }
            return b(this.f43963a, aVar, this.f43965c, cls);
        }

        public b l(a aVar) {
            return aVar == this.f43964b ? this : new b(this.f43963a, aVar, this.f43965c, this.f43966d);
        }

        public b m(b bVar) {
            if (bVar != null && bVar != f43962e) {
                a aVar = bVar.f43963a;
                a aVar2 = bVar.f43964b;
                Class cls = bVar.f43965c;
                Class cls2 = bVar.f43966d;
                a aVar3 = this.f43963a;
                boolean z10 = (aVar == aVar3 || aVar == a.USE_DEFAULTS) ? false : true;
                a aVar4 = this.f43964b;
                boolean z11 = (aVar2 == aVar4 || aVar2 == a.USE_DEFAULTS) ? false : true;
                Class cls3 = this.f43965c;
                boolean z12 = (cls == cls3 && cls2 == cls3) ? false : true;
                if (z10) {
                    return z11 ? new b(aVar, aVar2, cls, cls2) : new b(aVar, aVar4, cls, cls2);
                }
                if (z11) {
                    return new b(aVar3, aVar2, cls, cls2);
                }
                if (z12) {
                    return new b(aVar3, aVar4, cls, cls2);
                }
            }
            return this;
        }

        public b n(a aVar) {
            return aVar == this.f43963a ? this : new b(aVar, this.f43964b, this.f43965c, this.f43966d);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(80);
            sb2.append("JsonInclude.Value(value=");
            sb2.append(this.f43963a);
            sb2.append(",content=");
            sb2.append(this.f43964b);
            if (this.f43965c != null) {
                sb2.append(",valueFilter=");
                sb2.append(this.f43965c.getName());
                sb2.append(".class");
            }
            if (this.f43966d != null) {
                sb2.append(",contentFilter=");
                sb2.append(this.f43966d.getName());
                sb2.append(".class");
            }
            sb2.append(')');
            return sb2.toString();
        }
    }

    a content() default a.ALWAYS;

    Class contentFilter() default Void.class;

    a value() default a.ALWAYS;

    Class valueFilter() default Void.class;
}
