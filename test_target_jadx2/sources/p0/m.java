package p0;

import java.util.ArrayList;

/* loaded from: classes.dex */
class m {

    /* renamed from: h, reason: collision with root package name */
    public static int f38253h;

    /* renamed from: c, reason: collision with root package name */
    p f38256c;

    /* renamed from: d, reason: collision with root package name */
    p f38257d;

    /* renamed from: f, reason: collision with root package name */
    int f38259f;

    /* renamed from: g, reason: collision with root package name */
    int f38260g;

    /* renamed from: a, reason: collision with root package name */
    public int f38254a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f38255b = false;

    /* renamed from: e, reason: collision with root package name */
    ArrayList f38258e = new ArrayList();

    public m(p pVar, int i10) {
        this.f38256c = null;
        this.f38257d = null;
        int i11 = f38253h;
        this.f38259f = i11;
        f38253h = i11 + 1;
        this.f38256c = pVar;
        this.f38257d = pVar;
        this.f38260g = i10;
    }

    private long c(f fVar, long j10) {
        p pVar = fVar.f38238d;
        if (pVar instanceof k) {
            return j10;
        }
        int size = fVar.f38245k.size();
        long j11 = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) fVar.f38245k.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f38238d != pVar) {
                    j11 = Math.min(j11, c(fVar2, fVar2.f38240f + j10));
                }
            }
        }
        if (fVar != pVar.f38287i) {
            return j11;
        }
        long j12 = j10 - pVar.j();
        return Math.min(Math.min(j11, c(pVar.f38286h, j12)), j12 - pVar.f38286h.f38240f);
    }

    private long d(f fVar, long j10) {
        p pVar = fVar.f38238d;
        if (pVar instanceof k) {
            return j10;
        }
        int size = fVar.f38245k.size();
        long j11 = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) fVar.f38245k.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f38238d != pVar) {
                    j11 = Math.max(j11, d(fVar2, fVar2.f38240f + j10));
                }
            }
        }
        if (fVar != pVar.f38286h) {
            return j11;
        }
        long j12 = j10 + pVar.j();
        return Math.max(Math.max(j11, d(pVar.f38287i, j12)), j12 - pVar.f38287i.f38240f);
    }

    public void a(p pVar) {
        this.f38258e.add(pVar);
        this.f38257d = pVar;
    }

    public long b(o0.f fVar, int i10) {
        long j10;
        int i11;
        p pVar = this.f38256c;
        if (pVar instanceof c) {
            if (((c) pVar).f38284f != i10) {
                return 0L;
            }
        } else if (i10 == 0) {
            if (!(pVar instanceof l)) {
                return 0L;
            }
        } else if (!(pVar instanceof n)) {
            return 0L;
        }
        f fVar2 = (i10 == 0 ? fVar.f37716e : fVar.f37718f).f38286h;
        f fVar3 = (i10 == 0 ? fVar.f37716e : fVar.f37718f).f38287i;
        boolean contains = pVar.f38286h.f38246l.contains(fVar2);
        boolean contains2 = this.f38256c.f38287i.f38246l.contains(fVar3);
        long j11 = this.f38256c.j();
        if (contains && contains2) {
            long d10 = d(this.f38256c.f38286h, 0L);
            long c10 = c(this.f38256c.f38287i, 0L);
            long j12 = d10 - j11;
            p pVar2 = this.f38256c;
            int i12 = pVar2.f38287i.f38240f;
            if (j12 >= (-i12)) {
                j12 += i12;
            }
            int i13 = pVar2.f38286h.f38240f;
            long j13 = ((-c10) - j11) - i13;
            if (j13 >= i13) {
                j13 -= i13;
            }
            float o10 = pVar2.f38280b.o(i10);
            float f10 = o10 > 0.0f ? (long) ((j13 / o10) + (j12 / (1.0f - o10))) : 0L;
            long j14 = ((long) ((f10 * o10) + 0.5f)) + j11 + ((long) ((f10 * (1.0f - o10)) + 0.5f));
            j10 = r12.f38286h.f38240f + j14;
            i11 = this.f38256c.f38287i.f38240f;
        } else {
            if (contains) {
                return Math.max(d(this.f38256c.f38286h, r12.f38240f), this.f38256c.f38286h.f38240f + j11);
            }
            if (contains2) {
                return Math.max(-c(this.f38256c.f38287i, r12.f38240f), (-this.f38256c.f38287i.f38240f) + j11);
            }
            j10 = r12.f38286h.f38240f + this.f38256c.j();
            i11 = this.f38256c.f38287i.f38240f;
        }
        return j10 - i11;
    }
}
