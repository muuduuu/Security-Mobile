package o0;

import java.util.ArrayList;
import l0.C3591c;

/* loaded from: classes.dex */
public abstract class k extends e {

    /* renamed from: K0, reason: collision with root package name */
    public ArrayList f37804K0 = new ArrayList();

    public void b(e eVar) {
        this.f37804K0.add(eVar);
        if (eVar.I() != null) {
            ((k) eVar.I()).p1(eVar);
        }
        eVar.Y0(this);
    }

    public ArrayList n1() {
        return this.f37804K0;
    }

    public abstract void o1();

    public void p1(e eVar) {
        this.f37804K0.remove(eVar);
        eVar.r0();
    }

    public void q1() {
        this.f37804K0.clear();
    }

    @Override // o0.e
    public void r0() {
        this.f37804K0.clear();
        super.r0();
    }

    @Override // o0.e
    public void t0(C3591c c3591c) {
        super.t0(c3591c);
        int size = this.f37804K0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((e) this.f37804K0.get(i10)).t0(c3591c);
        }
    }
}
