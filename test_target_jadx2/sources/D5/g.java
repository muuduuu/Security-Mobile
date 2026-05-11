package D5;

import K5.F;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class g extends F5.m implements Serializable {

    /* renamed from: v, reason: collision with root package name */
    private static final int f1243v = F5.l.c(i.class);

    /* renamed from: o, reason: collision with root package name */
    protected final O5.a f1244o;

    /* renamed from: p, reason: collision with root package name */
    protected final F5.d f1245p;

    /* renamed from: q, reason: collision with root package name */
    protected final int f1246q;

    /* renamed from: r, reason: collision with root package name */
    protected final int f1247r;

    /* renamed from: s, reason: collision with root package name */
    protected final int f1248s;

    /* renamed from: t, reason: collision with root package name */
    protected final int f1249t;

    /* renamed from: u, reason: collision with root package name */
    protected final int f1250u;

    public g(F5.a aVar, M5.d dVar, F f10, T5.n nVar, F5.h hVar, F5.d dVar2) {
        super(aVar, dVar, f10, nVar, hVar);
        this.f1246q = f1243v;
        this.f1244o = O5.a.f7079d;
        this.f1245p = dVar2;
        this.f1247r = 0;
        this.f1248s = 0;
        this.f1249t = 0;
        this.f1250u = 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // F5.m
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public final g H(long j10) {
        return new g(this, j10, this.f1246q, this.f1247r, this.f1248s, this.f1249t, this.f1250u);
    }

    private g(g gVar, long j10, int i10, int i11, int i12, int i13, int i14) {
        super(gVar, j10);
        this.f1246q = i10;
        gVar.getClass();
        this.f1244o = gVar.f1244o;
        this.f1245p = gVar.f1245p;
        this.f1247r = i11;
        this.f1248s = i12;
        this.f1249t = i13;
        this.f1250u = i14;
    }
}
