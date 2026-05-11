package v2;

import k2.r;
import t2.AbstractC4614j;

/* renamed from: v2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4915e extends AbstractC4614j implements r {
    public C4915e(C4913c c4913c) {
        super(c4913c);
    }

    @Override // k2.v
    public Class a() {
        return C4913c.class;
    }

    @Override // t2.AbstractC4614j, k2.r
    public void initialize() {
        ((C4913c) this.f42289a).e().prepareToDraw();
    }

    @Override // k2.v
    public int k() {
        return ((C4913c) this.f42289a).i();
    }

    @Override // k2.v
    public void recycle() {
        ((C4913c) this.f42289a).stop();
        ((C4913c) this.f42289a).k();
    }
}
