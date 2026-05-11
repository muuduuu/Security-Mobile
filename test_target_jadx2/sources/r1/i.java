package R1;

import O1.C1038i;
import android.graphics.Path;
import android.graphics.PointF;
import c2.C1718a;

/* loaded from: classes.dex */
public class i extends C1718a {

    /* renamed from: q, reason: collision with root package name */
    private Path f8404q;

    /* renamed from: r, reason: collision with root package name */
    private final C1718a f8405r;

    public i(C1038i c1038i, C1718a c1718a) {
        super(c1038i, (PointF) c1718a.f19336b, (PointF) c1718a.f19337c, c1718a.f19338d, c1718a.f19339e, c1718a.f19340f, c1718a.f19341g, c1718a.f19342h);
        this.f8405r = c1718a;
        j();
    }

    public void j() {
        Object obj;
        Object obj2;
        Object obj3 = this.f19337c;
        boolean z10 = (obj3 == null || (obj2 = this.f19336b) == null || !((PointF) obj2).equals(((PointF) obj3).x, ((PointF) obj3).y)) ? false : true;
        Object obj4 = this.f19336b;
        if (obj4 == null || (obj = this.f19337c) == null || z10) {
            return;
        }
        C1718a c1718a = this.f8405r;
        this.f8404q = b2.l.d((PointF) obj4, (PointF) obj, c1718a.f19349o, c1718a.f19350p);
    }

    Path k() {
        return this.f8404q;
    }
}
