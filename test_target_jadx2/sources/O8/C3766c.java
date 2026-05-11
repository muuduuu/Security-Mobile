package o8;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: o8.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3766c {

    /* renamed from: a, reason: collision with root package name */
    private final String f37978a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f37979b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f37980c;

    /* renamed from: d, reason: collision with root package name */
    private final int f37981d;

    /* renamed from: e, reason: collision with root package name */
    private final int f37982e;

    /* renamed from: f, reason: collision with root package name */
    private final g f37983f;

    /* renamed from: g, reason: collision with root package name */
    private final Set f37984g;

    public static b c(Class cls) {
        return new b(cls, new Class[0]);
    }

    public static b d(Class cls, Class... clsArr) {
        return new b(cls, clsArr);
    }

    public static b e(C3762D c3762d) {
        return new b(c3762d, new C3762D[0]);
    }

    public static b f(C3762D c3762d, C3762D... c3762dArr) {
        return new b(c3762d, c3762dArr);
    }

    public static C3766c l(final Object obj, Class cls) {
        return m(cls).f(new g() { // from class: o8.a
            @Override // o8.g
            public final Object a(InterfaceC3767d interfaceC3767d) {
                Object q10;
                q10 = C3766c.q(obj, interfaceC3767d);
                return q10;
            }
        }).d();
    }

    public static b m(Class cls) {
        return c(cls).g();
    }

    public static C3766c s(final Object obj, Class cls, Class... clsArr) {
        return d(cls, clsArr).f(new g() { // from class: o8.b
            @Override // o8.g
            public final Object a(InterfaceC3767d interfaceC3767d) {
                Object r10;
                r10 = C3766c.r(obj, interfaceC3767d);
                return r10;
            }
        }).d();
    }

    public Set g() {
        return this.f37980c;
    }

    public g h() {
        return this.f37983f;
    }

    public String i() {
        return this.f37978a;
    }

    public Set j() {
        return this.f37979b;
    }

    public Set k() {
        return this.f37984g;
    }

    public boolean n() {
        return this.f37981d == 1;
    }

    public boolean o() {
        return this.f37981d == 2;
    }

    public boolean p() {
        return this.f37982e == 0;
    }

    public C3766c t(g gVar) {
        return new C3766c(this.f37978a, this.f37979b, this.f37980c, this.f37981d, this.f37982e, gVar, this.f37984g);
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f37979b.toArray()) + ">{" + this.f37981d + ", type=" + this.f37982e + ", deps=" + Arrays.toString(this.f37980c.toArray()) + "}";
    }

    /* renamed from: o8.c$b */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private String f37985a;

        /* renamed from: b, reason: collision with root package name */
        private final Set f37986b;

        /* renamed from: c, reason: collision with root package name */
        private final Set f37987c;

        /* renamed from: d, reason: collision with root package name */
        private int f37988d;

        /* renamed from: e, reason: collision with root package name */
        private int f37989e;

        /* renamed from: f, reason: collision with root package name */
        private g f37990f;

        /* renamed from: g, reason: collision with root package name */
        private final Set f37991g;

        /* JADX INFO: Access modifiers changed from: private */
        public b g() {
            this.f37989e = 1;
            return this;
        }

        private b i(int i10) {
            AbstractC3761C.d(this.f37988d == 0, "Instantiation type has already been set.");
            this.f37988d = i10;
            return this;
        }

        private void j(C3762D c3762d) {
            AbstractC3761C.a(!this.f37986b.contains(c3762d), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        public b b(q qVar) {
            AbstractC3761C.c(qVar, "Null dependency");
            j(qVar.b());
            this.f37987c.add(qVar);
            return this;
        }

        public b c() {
            return i(1);
        }

        public C3766c d() {
            AbstractC3761C.d(this.f37990f != null, "Missing required property: factory.");
            return new C3766c(this.f37985a, new HashSet(this.f37986b), new HashSet(this.f37987c), this.f37988d, this.f37989e, this.f37990f, this.f37991g);
        }

        public b e() {
            return i(2);
        }

        public b f(g gVar) {
            this.f37990f = (g) AbstractC3761C.c(gVar, "Null factory");
            return this;
        }

        public b h(String str) {
            this.f37985a = str;
            return this;
        }

        private b(Class cls, Class... clsArr) {
            this.f37985a = null;
            HashSet hashSet = new HashSet();
            this.f37986b = hashSet;
            this.f37987c = new HashSet();
            this.f37988d = 0;
            this.f37989e = 0;
            this.f37991g = new HashSet();
            AbstractC3761C.c(cls, "Null interface");
            hashSet.add(C3762D.b(cls));
            for (Class cls2 : clsArr) {
                AbstractC3761C.c(cls2, "Null interface");
                this.f37986b.add(C3762D.b(cls2));
            }
        }

        private b(C3762D c3762d, C3762D... c3762dArr) {
            this.f37985a = null;
            HashSet hashSet = new HashSet();
            this.f37986b = hashSet;
            this.f37987c = new HashSet();
            this.f37988d = 0;
            this.f37989e = 0;
            this.f37991g = new HashSet();
            AbstractC3761C.c(c3762d, "Null interface");
            hashSet.add(c3762d);
            for (C3762D c3762d2 : c3762dArr) {
                AbstractC3761C.c(c3762d2, "Null interface");
            }
            Collections.addAll(this.f37986b, c3762dArr);
        }
    }

    private C3766c(String str, Set set, Set set2, int i10, int i11, g gVar, Set set3) {
        this.f37978a = str;
        this.f37979b = Collections.unmodifiableSet(set);
        this.f37980c = Collections.unmodifiableSet(set2);
        this.f37981d = i10;
        this.f37982e = i11;
        this.f37983f = gVar;
        this.f37984g = Collections.unmodifiableSet(set3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object q(Object obj, InterfaceC3767d interfaceC3767d) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object r(Object obj, InterfaceC3767d interfaceC3767d) {
        return obj;
    }
}
