package D5;

import K5.F;
import com.fasterxml.jackson.core.f;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class z extends F5.m implements Serializable {

    /* renamed from: u, reason: collision with root package name */
    protected static final com.fasterxml.jackson.core.m f1300u = new C5.d();

    /* renamed from: v, reason: collision with root package name */
    private static final int f1301v = F5.l.c(A.class);

    /* renamed from: o, reason: collision with root package name */
    protected final com.fasterxml.jackson.core.m f1302o;

    /* renamed from: p, reason: collision with root package name */
    protected final int f1303p;

    /* renamed from: q, reason: collision with root package name */
    protected final int f1304q;

    /* renamed from: r, reason: collision with root package name */
    protected final int f1305r;

    /* renamed from: s, reason: collision with root package name */
    protected final int f1306s;

    /* renamed from: t, reason: collision with root package name */
    protected final int f1307t;

    public z(F5.a aVar, M5.d dVar, F f10, T5.n nVar, F5.h hVar) {
        super(aVar, dVar, f10, nVar, hVar);
        this.f1303p = f1301v;
        this.f1302o = f1300u;
        this.f1304q = 0;
        this.f1305r = 0;
        this.f1306s = 0;
        this.f1307t = 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // F5.m
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public final z H(long j10) {
        return new z(this, j10, this.f1303p, this.f1304q, this.f1305r, this.f1306s, this.f1307t);
    }

    public com.fasterxml.jackson.core.m V() {
        com.fasterxml.jackson.core.m mVar = this.f1302o;
        return mVar instanceof C5.e ? (com.fasterxml.jackson.core.m) ((C5.e) mVar).e() : mVar;
    }

    public P5.k W() {
        return null;
    }

    public void X(com.fasterxml.jackson.core.f fVar) {
        com.fasterxml.jackson.core.m V10;
        if (A.INDENT_OUTPUT.enabledIn(this.f1303p) && fVar.l() == null && (V10 = V()) != null) {
            fVar.s(V10);
        }
        boolean enabledIn = A.WRITE_BIGDECIMAL_AS_PLAIN.enabledIn(this.f1303p);
        int i10 = this.f1305r;
        if (i10 != 0 || enabledIn) {
            int i11 = this.f1304q;
            if (enabledIn) {
                int mask = f.b.WRITE_BIGDECIMAL_AS_PLAIN.getMask();
                i11 |= mask;
                i10 |= mask;
            }
            fVar.p(i11, i10);
        }
        int i12 = this.f1307t;
        if (i12 != 0) {
            fVar.o(this.f1306s, i12);
        }
    }

    public c Y(j jVar) {
        return i().b(this, jVar, this);
    }

    public final boolean Z(A a10) {
        return (a10.getMask() & this.f1303p) != 0;
    }

    private z(z zVar, long j10, int i10, int i11, int i12, int i13, int i14) {
        super(zVar, j10);
        this.f1303p = i10;
        zVar.getClass();
        this.f1302o = zVar.f1302o;
        this.f1304q = i11;
        this.f1305r = i12;
        this.f1306s = i13;
        this.f1307t = i14;
    }
}
