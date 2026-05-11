package p0;

import java.util.Iterator;
import o0.C3736a;
import p0.f;

/* loaded from: classes.dex */
class k extends p {
    public k(o0.e eVar) {
        super(eVar);
    }

    private void q(f fVar) {
        this.f38286h.f38245k.add(fVar);
        fVar.f38246l.add(this.f38286h);
    }

    @Override // p0.p, p0.d
    public void a(d dVar) {
        C3736a c3736a = (C3736a) this.f38280b;
        int r12 = c3736a.r1();
        Iterator it = this.f38286h.f38246l.iterator();
        int i10 = 0;
        int i11 = -1;
        while (it.hasNext()) {
            int i12 = ((f) it.next()).f38241g;
            if (i11 == -1 || i12 < i11) {
                i11 = i12;
            }
            if (i10 < i12) {
                i10 = i12;
            }
        }
        if (r12 == 0 || r12 == 2) {
            this.f38286h.d(i11 + c3736a.s1());
        } else {
            this.f38286h.d(i10 + c3736a.s1());
        }
    }

    @Override // p0.p
    void d() {
        o0.e eVar = this.f38280b;
        if (eVar instanceof C3736a) {
            this.f38286h.f38236b = true;
            C3736a c3736a = (C3736a) eVar;
            int r12 = c3736a.r1();
            boolean q12 = c3736a.q1();
            int i10 = 0;
            if (r12 == 0) {
                this.f38286h.f38239e = f.a.LEFT;
                while (i10 < c3736a.f37802L0) {
                    o0.e eVar2 = c3736a.f37801K0[i10];
                    if (q12 || eVar2.T() != 8) {
                        f fVar = eVar2.f37716e.f38286h;
                        fVar.f38245k.add(this.f38286h);
                        this.f38286h.f38246l.add(fVar);
                    }
                    i10++;
                }
                q(this.f38280b.f37716e.f38286h);
                q(this.f38280b.f37716e.f38287i);
                return;
            }
            if (r12 == 1) {
                this.f38286h.f38239e = f.a.RIGHT;
                while (i10 < c3736a.f37802L0) {
                    o0.e eVar3 = c3736a.f37801K0[i10];
                    if (q12 || eVar3.T() != 8) {
                        f fVar2 = eVar3.f37716e.f38287i;
                        fVar2.f38245k.add(this.f38286h);
                        this.f38286h.f38246l.add(fVar2);
                    }
                    i10++;
                }
                q(this.f38280b.f37716e.f38286h);
                q(this.f38280b.f37716e.f38287i);
                return;
            }
            if (r12 == 2) {
                this.f38286h.f38239e = f.a.TOP;
                while (i10 < c3736a.f37802L0) {
                    o0.e eVar4 = c3736a.f37801K0[i10];
                    if (q12 || eVar4.T() != 8) {
                        f fVar3 = eVar4.f37718f.f38286h;
                        fVar3.f38245k.add(this.f38286h);
                        this.f38286h.f38246l.add(fVar3);
                    }
                    i10++;
                }
                q(this.f38280b.f37718f.f38286h);
                q(this.f38280b.f37718f.f38287i);
                return;
            }
            if (r12 != 3) {
                return;
            }
            this.f38286h.f38239e = f.a.BOTTOM;
            while (i10 < c3736a.f37802L0) {
                o0.e eVar5 = c3736a.f37801K0[i10];
                if (q12 || eVar5.T() != 8) {
                    f fVar4 = eVar5.f37718f.f38287i;
                    fVar4.f38245k.add(this.f38286h);
                    this.f38286h.f38246l.add(fVar4);
                }
                i10++;
            }
            q(this.f38280b.f37718f.f38286h);
            q(this.f38280b.f37718f.f38287i);
        }
    }

    @Override // p0.p
    public void e() {
        o0.e eVar = this.f38280b;
        if (eVar instanceof C3736a) {
            int r12 = ((C3736a) eVar).r1();
            if (r12 == 0 || r12 == 1) {
                this.f38280b.i1(this.f38286h.f38241g);
            } else {
                this.f38280b.j1(this.f38286h.f38241g);
            }
        }
    }

    @Override // p0.p
    void f() {
        this.f38281c = null;
        this.f38286h.c();
    }

    @Override // p0.p
    boolean m() {
        return false;
    }
}
