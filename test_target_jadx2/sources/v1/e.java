package V1;

import c2.C1718a;
import java.util.List;

/* loaded from: classes.dex */
public class e implements o {

    /* renamed from: a, reason: collision with root package name */
    private final List f10762a;

    public e(List list) {
        this.f10762a = list;
    }

    @Override // V1.o
    public boolean o() {
        return this.f10762a.size() == 1 && ((C1718a) this.f10762a.get(0)).i();
    }

    @Override // V1.o
    public R1.a p() {
        return ((C1718a) this.f10762a.get(0)).i() ? new R1.k(this.f10762a) : new R1.j(this.f10762a);
    }

    @Override // V1.o
    public List q() {
        return this.f10762a;
    }
}
