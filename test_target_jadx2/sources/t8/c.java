package t8;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final String f43332a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f43333b;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f43334a;

        /* renamed from: b, reason: collision with root package name */
        private Map f43335b = null;

        b(String str) {
            this.f43334a = str;
        }

        public c a() {
            return new c(this.f43334a, this.f43335b == null ? Collections.emptyMap() : Collections.unmodifiableMap(new HashMap(this.f43335b)));
        }

        public b b(Annotation annotation) {
            if (this.f43335b == null) {
                this.f43335b = new HashMap();
            }
            this.f43335b.put(annotation.annotationType(), annotation);
            return this;
        }
    }

    public static b a(String str) {
        return new b(str);
    }

    public static c d(String str) {
        return new c(str, Collections.emptyMap());
    }

    public String b() {
        return this.f43332a;
    }

    public Annotation c(Class cls) {
        return (Annotation) this.f43333b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f43332a.equals(cVar.f43332a) && this.f43333b.equals(cVar.f43333b);
    }

    public int hashCode() {
        return (this.f43332a.hashCode() * 31) + this.f43333b.hashCode();
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.f43332a + ", properties=" + this.f43333b.values() + "}";
    }

    private c(String str, Map map) {
        this.f43332a = str;
        this.f43333b = map;
    }
}
