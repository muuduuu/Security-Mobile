package R1;

import Q1.s;
import android.graphics.Path;
import c2.C1718a;
import c2.C1720c;
import java.util.List;

/* loaded from: classes.dex */
public class m extends a {

    /* renamed from: i, reason: collision with root package name */
    private final W1.o f8413i;

    /* renamed from: j, reason: collision with root package name */
    private final Path f8414j;

    /* renamed from: k, reason: collision with root package name */
    private Path f8415k;

    /* renamed from: l, reason: collision with root package name */
    private Path f8416l;

    /* renamed from: m, reason: collision with root package name */
    private List f8417m;

    public m(List list) {
        super(list);
        this.f8413i = new W1.o();
        this.f8414j = new Path();
    }

    @Override // R1.a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public Path i(C1718a c1718a, float f10) {
        W1.o oVar = (W1.o) c1718a.f19336b;
        W1.o oVar2 = (W1.o) c1718a.f19337c;
        this.f8413i.c(oVar, oVar2 == null ? oVar : oVar2, f10);
        W1.o oVar3 = this.f8413i;
        List list = this.f8417m;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                oVar3 = ((s) this.f8417m.get(size)).g(oVar3);
            }
        }
        b2.k.h(oVar3, this.f8414j);
        if (this.f8376e == null) {
            return this.f8414j;
        }
        if (this.f8415k == null) {
            this.f8415k = new Path();
            this.f8416l = new Path();
        }
        b2.k.h(oVar, this.f8415k);
        if (oVar2 != null) {
            b2.k.h(oVar2, this.f8416l);
        }
        C1720c c1720c = this.f8376e;
        float f11 = c1718a.f19341g;
        float floatValue = c1718a.f19342h.floatValue();
        Path path = this.f8415k;
        return (Path) c1720c.b(f11, floatValue, path, oVar2 == null ? path : this.f8416l, f10, e(), f());
    }

    public void r(List list) {
        this.f8417m = list;
    }
}
