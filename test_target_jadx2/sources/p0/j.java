package p0;

/* loaded from: classes.dex */
class j extends p {
    public j(o0.e eVar) {
        super(eVar);
        eVar.f37716e.f();
        eVar.f37718f.f();
        this.f38284f = ((o0.g) eVar).o1();
    }

    private void q(f fVar) {
        this.f38286h.f38245k.add(fVar);
        fVar.f38246l.add(this.f38286h);
    }

    @Override // p0.p, p0.d
    public void a(d dVar) {
        f fVar = this.f38286h;
        if (fVar.f38237c && !fVar.f38244j) {
            this.f38286h.d((int) ((((f) fVar.f38246l.get(0)).f38241g * ((o0.g) this.f38280b).r1()) + 0.5f));
        }
    }

    @Override // p0.p
    void d() {
        o0.g gVar = (o0.g) this.f38280b;
        int p12 = gVar.p1();
        int q12 = gVar.q1();
        gVar.r1();
        if (gVar.o1() == 1) {
            if (p12 != -1) {
                this.f38286h.f38246l.add(this.f38280b.f37709a0.f37716e.f38286h);
                this.f38280b.f37709a0.f37716e.f38286h.f38245k.add(this.f38286h);
                this.f38286h.f38240f = p12;
            } else if (q12 != -1) {
                this.f38286h.f38246l.add(this.f38280b.f37709a0.f37716e.f38287i);
                this.f38280b.f37709a0.f37716e.f38287i.f38245k.add(this.f38286h);
                this.f38286h.f38240f = -q12;
            } else {
                f fVar = this.f38286h;
                fVar.f38236b = true;
                fVar.f38246l.add(this.f38280b.f37709a0.f37716e.f38287i);
                this.f38280b.f37709a0.f37716e.f38287i.f38245k.add(this.f38286h);
            }
            q(this.f38280b.f37716e.f38286h);
            q(this.f38280b.f37716e.f38287i);
            return;
        }
        if (p12 != -1) {
            this.f38286h.f38246l.add(this.f38280b.f37709a0.f37718f.f38286h);
            this.f38280b.f37709a0.f37718f.f38286h.f38245k.add(this.f38286h);
            this.f38286h.f38240f = p12;
        } else if (q12 != -1) {
            this.f38286h.f38246l.add(this.f38280b.f37709a0.f37718f.f38287i);
            this.f38280b.f37709a0.f37718f.f38287i.f38245k.add(this.f38286h);
            this.f38286h.f38240f = -q12;
        } else {
            f fVar2 = this.f38286h;
            fVar2.f38236b = true;
            fVar2.f38246l.add(this.f38280b.f37709a0.f37718f.f38287i);
            this.f38280b.f37709a0.f37718f.f38287i.f38245k.add(this.f38286h);
        }
        q(this.f38280b.f37718f.f38286h);
        q(this.f38280b.f37718f.f38287i);
    }

    @Override // p0.p
    public void e() {
        if (((o0.g) this.f38280b).o1() == 1) {
            this.f38280b.i1(this.f38286h.f38241g);
        } else {
            this.f38280b.j1(this.f38286h.f38241g);
        }
    }

    @Override // p0.p
    void f() {
        this.f38286h.c();
    }

    @Override // p0.p
    boolean m() {
        return false;
    }
}
