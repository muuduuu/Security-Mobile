package K5;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class o {

    /* renamed from: b, reason: collision with root package name */
    protected static final T5.a f5409b = new c();

    /* renamed from: a, reason: collision with root package name */
    protected final Object f5410a;

    static class a extends o {

        /* renamed from: c, reason: collision with root package name */
        public static final a f5411c = new a(null);

        a(Object obj) {
            super(obj);
        }

        @Override // K5.o
        public o a(Annotation annotation) {
            return new e(this.f5410a, annotation.annotationType(), annotation);
        }

        @Override // K5.o
        public p b() {
            return new p();
        }

        @Override // K5.o
        public T5.a c() {
            return o.f5409b;
        }

        @Override // K5.o
        public boolean f(Annotation annotation) {
            return false;
        }
    }

    static class b extends o {

        /* renamed from: c, reason: collision with root package name */
        protected final HashMap f5412c;

        public b(Object obj, Class cls, Annotation annotation, Class cls2, Annotation annotation2) {
            super(obj);
            HashMap hashMap = new HashMap();
            this.f5412c = hashMap;
            hashMap.put(cls, annotation);
            hashMap.put(cls2, annotation2);
        }

        @Override // K5.o
        public o a(Annotation annotation) {
            this.f5412c.put(annotation.annotationType(), annotation);
            return this;
        }

        @Override // K5.o
        public p b() {
            p pVar = new p();
            Iterator it = this.f5412c.values().iterator();
            while (it.hasNext()) {
                pVar.e((Annotation) it.next());
            }
            return pVar;
        }

        @Override // K5.o
        public T5.a c() {
            if (this.f5412c.size() != 2) {
                return new p(this.f5412c);
            }
            Iterator it = this.f5412c.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            Map.Entry entry2 = (Map.Entry) it.next();
            return new f((Class) entry.getKey(), (Annotation) entry.getValue(), (Class) entry2.getKey(), (Annotation) entry2.getValue());
        }

        @Override // K5.o
        public boolean f(Annotation annotation) {
            return this.f5412c.containsKey(annotation.annotationType());
        }
    }

    public static class c implements T5.a, Serializable {
        c() {
        }

        @Override // T5.a
        public Annotation a(Class cls) {
            return null;
        }

        @Override // T5.a
        public boolean b(Class cls) {
            return false;
        }

        @Override // T5.a
        public boolean c(Class[] clsArr) {
            return false;
        }

        @Override // T5.a
        public int size() {
            return 0;
        }
    }

    public static class d implements T5.a, Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final Class f5413a;

        /* renamed from: b, reason: collision with root package name */
        private final Annotation f5414b;

        public d(Class cls, Annotation annotation) {
            this.f5413a = cls;
            this.f5414b = annotation;
        }

        @Override // T5.a
        public Annotation a(Class cls) {
            if (this.f5413a == cls) {
                return this.f5414b;
            }
            return null;
        }

        @Override // T5.a
        public boolean b(Class cls) {
            return this.f5413a == cls;
        }

        @Override // T5.a
        public boolean c(Class[] clsArr) {
            for (Class cls : clsArr) {
                if (cls == this.f5413a) {
                    return true;
                }
            }
            return false;
        }

        @Override // T5.a
        public int size() {
            return 1;
        }
    }

    static class e extends o {

        /* renamed from: c, reason: collision with root package name */
        private Class f5415c;

        /* renamed from: d, reason: collision with root package name */
        private Annotation f5416d;

        public e(Object obj, Class cls, Annotation annotation) {
            super(obj);
            this.f5415c = cls;
            this.f5416d = annotation;
        }

        @Override // K5.o
        public o a(Annotation annotation) {
            Class<? extends Annotation> annotationType = annotation.annotationType();
            Class<? extends Annotation> cls = this.f5415c;
            if (cls != annotationType) {
                return new b(this.f5410a, cls, this.f5416d, annotationType, annotation);
            }
            this.f5416d = annotation;
            return this;
        }

        @Override // K5.o
        public p b() {
            return p.g(this.f5415c, this.f5416d);
        }

        @Override // K5.o
        public T5.a c() {
            return new d(this.f5415c, this.f5416d);
        }

        @Override // K5.o
        public boolean f(Annotation annotation) {
            return annotation.annotationType() == this.f5415c;
        }
    }

    public static class f implements T5.a, Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final Class f5417a;

        /* renamed from: b, reason: collision with root package name */
        private final Class f5418b;

        /* renamed from: c, reason: collision with root package name */
        private final Annotation f5419c;

        /* renamed from: d, reason: collision with root package name */
        private final Annotation f5420d;

        public f(Class cls, Annotation annotation, Class cls2, Annotation annotation2) {
            this.f5417a = cls;
            this.f5419c = annotation;
            this.f5418b = cls2;
            this.f5420d = annotation2;
        }

        @Override // T5.a
        public Annotation a(Class cls) {
            if (this.f5417a == cls) {
                return this.f5419c;
            }
            if (this.f5418b == cls) {
                return this.f5420d;
            }
            return null;
        }

        @Override // T5.a
        public boolean b(Class cls) {
            return this.f5417a == cls || this.f5418b == cls;
        }

        @Override // T5.a
        public boolean c(Class[] clsArr) {
            for (Class cls : clsArr) {
                if (cls == this.f5417a || cls == this.f5418b) {
                    return true;
                }
            }
            return false;
        }

        @Override // T5.a
        public int size() {
            return 2;
        }
    }

    protected o(Object obj) {
        this.f5410a = obj;
    }

    public static T5.a d() {
        return f5409b;
    }

    public static o e() {
        return a.f5411c;
    }

    public abstract o a(Annotation annotation);

    public abstract p b();

    public abstract T5.a c();

    public abstract boolean f(Annotation annotation);
}
