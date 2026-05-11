package c4;

import android.graphics.Bitmap;
import f3.AbstractC3142a;
import g4.InterfaceC3189d;
import l3.AbstractC3605b;
import l3.InterfaceC3606c;

/* renamed from: c4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1725b extends AbstractC3605b {
    @Override // l3.AbstractC3605b
    public void f(InterfaceC3606c interfaceC3606c) {
        if (interfaceC3606c.a()) {
            AbstractC3142a abstractC3142a = (AbstractC3142a) interfaceC3606c.b();
            try {
                g((abstractC3142a == null || !(abstractC3142a.p() instanceof InterfaceC3189d)) ? null : ((InterfaceC3189d) abstractC3142a.p()).p1());
            } finally {
                AbstractC3142a.n(abstractC3142a);
            }
        }
    }

    protected abstract void g(Bitmap bitmap);
}
