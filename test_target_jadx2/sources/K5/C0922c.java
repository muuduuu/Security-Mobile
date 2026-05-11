package K5;

import D5.AbstractC0776b;
import K5.t;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;

/* renamed from: K5.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0922c extends AbstractC0921b implements G {

    /* renamed from: o, reason: collision with root package name */
    private static final a f5353o = new a(null, Collections.emptyList(), Collections.emptyList());

    /* renamed from: a, reason: collision with root package name */
    protected final D5.j f5354a;

    /* renamed from: b, reason: collision with root package name */
    protected final Class f5355b;

    /* renamed from: c, reason: collision with root package name */
    protected final S5.n f5356c;

    /* renamed from: d, reason: collision with root package name */
    protected final List f5357d;

    /* renamed from: e, reason: collision with root package name */
    protected final AbstractC0776b f5358e;

    /* renamed from: f, reason: collision with root package name */
    protected final S5.o f5359f;

    /* renamed from: g, reason: collision with root package name */
    protected final t.a f5360g;

    /* renamed from: h, reason: collision with root package name */
    protected final Class f5361h;

    /* renamed from: i, reason: collision with root package name */
    protected final boolean f5362i;

    /* renamed from: j, reason: collision with root package name */
    protected final T5.a f5363j;

    /* renamed from: k, reason: collision with root package name */
    protected a f5364k;

    /* renamed from: l, reason: collision with root package name */
    protected l f5365l;

    /* renamed from: m, reason: collision with root package name */
    protected List f5366m;

    /* renamed from: n, reason: collision with root package name */
    protected transient Boolean f5367n;

    /* renamed from: K5.c$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final C0924e f5368a;

        /* renamed from: b, reason: collision with root package name */
        public final List f5369b;

        /* renamed from: c, reason: collision with root package name */
        public final List f5370c;

        public a(C0924e c0924e, List list, List list2) {
            this.f5368a = c0924e;
            this.f5369b = list;
            this.f5370c = list2;
        }
    }

    C0922c(D5.j jVar, Class cls, List list, Class cls2, T5.a aVar, S5.n nVar, AbstractC0776b abstractC0776b, t.a aVar2, S5.o oVar, boolean z10) {
        this.f5354a = jVar;
        this.f5355b = cls;
        this.f5357d = list;
        this.f5361h = cls2;
        this.f5363j = aVar;
        this.f5356c = nVar;
        this.f5358e = abstractC0776b;
        this.f5360g = aVar2;
        this.f5359f = oVar;
        this.f5362i = z10;
    }

    private final a h() {
        a aVar = this.f5364k;
        if (aVar == null) {
            D5.j jVar = this.f5354a;
            aVar = jVar == null ? f5353o : C0925f.p(this.f5358e, this.f5359f, this, jVar, this.f5361h, this.f5362i);
            this.f5364k = aVar;
        }
        return aVar;
    }

    private final List i() {
        List list = this.f5366m;
        if (list == null) {
            D5.j jVar = this.f5354a;
            list = jVar == null ? Collections.emptyList() : C0927h.m(this.f5358e, this, this.f5360g, this.f5359f, jVar, this.f5362i);
            this.f5366m = list;
        }
        return list;
    }

    private final l j() {
        l lVar = this.f5365l;
        if (lVar == null) {
            D5.j jVar = this.f5354a;
            lVar = jVar == null ? new l() : k.m(this.f5358e, this, this.f5360g, this.f5359f, jVar, this.f5357d, this.f5361h, this.f5362i);
            this.f5365l = lVar;
        }
        return lVar;
    }

    @Override // K5.G
    public D5.j a(Type type) {
        return this.f5359f.F(type, this.f5356c);
    }

    @Override // K5.AbstractC0921b
    public Annotation b(Class cls) {
        return this.f5363j.a(cls);
    }

    @Override // K5.AbstractC0921b
    public String c() {
        return this.f5355b.getName();
    }

    @Override // K5.AbstractC0921b
    public Class d() {
        return this.f5355b;
    }

    @Override // K5.AbstractC0921b
    public D5.j e() {
        return this.f5354a;
    }

    @Override // K5.AbstractC0921b
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return T5.f.D(obj, C0922c.class) && ((C0922c) obj).f5355b == this.f5355b;
    }

    @Override // K5.AbstractC0921b
    public boolean f(Class cls) {
        return this.f5363j.b(cls);
    }

    @Override // K5.AbstractC0921b
    public boolean g(Class[] clsArr) {
        return this.f5363j.c(clsArr);
    }

    @Override // K5.AbstractC0921b
    public int hashCode() {
        return this.f5355b.getName().hashCode();
    }

    public Iterable k() {
        return i();
    }

    public Class l() {
        return this.f5355b;
    }

    public T5.a m() {
        return this.f5363j;
    }

    public List n() {
        return h().f5369b;
    }

    public C0924e o() {
        return h().f5368a;
    }

    public List p() {
        return h().f5370c;
    }

    public boolean q() {
        return this.f5363j.size() > 0;
    }

    public boolean r() {
        Boolean bool = this.f5367n;
        if (bool == null) {
            bool = Boolean.valueOf(T5.f.K(this.f5355b));
            this.f5367n = bool;
        }
        return bool.booleanValue();
    }

    public Iterable s() {
        return j();
    }

    public String toString() {
        return "[AnnotedClass " + this.f5355b.getName() + "]";
    }

    C0922c(Class cls) {
        this.f5354a = null;
        this.f5355b = cls;
        this.f5357d = Collections.emptyList();
        this.f5361h = null;
        this.f5363j = o.d();
        this.f5356c = S5.n.h();
        this.f5358e = null;
        this.f5360g = null;
        this.f5359f = null;
        this.f5362i = false;
    }
}
