package F5;

import D5.AbstractC0776b;
import D5.q;
import D5.x;
import K5.A;
import K5.AbstractC0920a;
import K5.AbstractC0921b;
import K5.C0922c;
import K5.I;
import K5.t;
import java.io.Serializable;
import java.text.DateFormat;
import java.util.Locale;
import java.util.TimeZone;
import v5.InterfaceC4942i;
import v5.p;
import v5.z;

/* loaded from: classes2.dex */
public abstract class l implements t.a, Serializable {

    /* renamed from: c, reason: collision with root package name */
    protected static final p.b f2545c = p.b.c();

    /* renamed from: d, reason: collision with root package name */
    protected static final InterfaceC4942i.d f2546d = InterfaceC4942i.d.b();

    /* renamed from: a, reason: collision with root package name */
    protected final long f2547a;

    /* renamed from: b, reason: collision with root package name */
    protected final a f2548b;

    protected l(a aVar, long j10) {
        this.f2548b = aVar;
        this.f2547a = j10;
    }

    public static int c(Class cls) {
        int i10 = 0;
        for (Object obj : (Enum[]) cls.getEnumConstants()) {
            f fVar = (f) obj;
            if (fVar.enabledByDefault()) {
                i10 |= fVar.getMask();
            }
        }
        return i10;
    }

    public D5.c A(D5.j jVar) {
        return i().a(this, jVar, this);
    }

    public D5.c B(Class cls) {
        return A(e(cls));
    }

    public final boolean C() {
        return D(q.USE_ANNOTATIONS);
    }

    public final boolean D(q qVar) {
        return qVar.enabledIn(this.f2547a);
    }

    public final boolean E() {
        return D(q.SORT_PROPERTIES_ALPHABETICALLY);
    }

    public M5.e F(AbstractC0921b abstractC0921b, Class cls) {
        u();
        return (M5.e) T5.f.k(cls, b());
    }

    public M5.f G(AbstractC0921b abstractC0921b, Class cls) {
        u();
        return (M5.f) T5.f.k(cls, b());
    }

    public final boolean b() {
        return D(q.CAN_OVERRIDE_ACCESS_MODIFIERS);
    }

    public com.fasterxml.jackson.core.n d(String str) {
        return new y5.h(str);
    }

    public final D5.j e(Class cls) {
        return z().C(cls);
    }

    public final AbstractC0920a.AbstractC0101a f() {
        return this.f2548b.a();
    }

    public AbstractC0776b g() {
        return D(q.USE_ANNOTATIONS) ? this.f2548b.b() : A.f5287a;
    }

    public com.fasterxml.jackson.core.a h() {
        return this.f2548b.c();
    }

    public t i() {
        return this.f2548b.d();
    }

    public abstract g j(Class cls);

    public final DateFormat k() {
        return this.f2548b.e();
    }

    public abstract p.b l(Class cls, Class cls2);

    public p.b m(Class cls, Class cls2, p.b bVar) {
        return p.b.j(bVar, j(cls).d(), j(cls2).e());
    }

    public abstract Boolean n();

    public abstract InterfaceC4942i.d o(Class cls);

    public abstract p.b p(Class cls);

    public p.b q(Class cls, p.b bVar) {
        p.b d10 = j(cls).d();
        return d10 != null ? d10 : bVar;
    }

    public abstract z.a r();

    public final M5.f s(D5.j jVar) {
        return this.f2548b.l();
    }

    public abstract I t(Class cls, C0922c c0922c);

    public final k u() {
        this.f2548b.f();
        return null;
    }

    public final Locale v() {
        return this.f2548b.g();
    }

    public M5.c w() {
        M5.c h10 = this.f2548b.h();
        return (h10 == N5.g.f6544a && D(q.BLOCK_UNSAFE_POLYMORPHIC_BASE_TYPES)) ? new M5.a() : h10;
    }

    public final x x() {
        this.f2548b.i();
        return null;
    }

    public final TimeZone y() {
        return this.f2548b.j();
    }

    public final S5.o z() {
        return this.f2548b.k();
    }

    protected l(l lVar, long j10) {
        this.f2548b = lVar.f2548b;
        this.f2547a = j10;
    }
}
