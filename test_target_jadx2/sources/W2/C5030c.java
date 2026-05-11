package w2;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import i2.h;
import k2.v;
import l2.InterfaceC3602d;
import r2.C4008g;
import v2.C4913c;

/* renamed from: w2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5030c implements InterfaceC5032e {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3602d f44283a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC5032e f44284b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC5032e f44285c;

    public C5030c(InterfaceC3602d interfaceC3602d, InterfaceC5032e interfaceC5032e, InterfaceC5032e interfaceC5032e2) {
        this.f44283a = interfaceC3602d;
        this.f44284b = interfaceC5032e;
        this.f44285c = interfaceC5032e2;
    }

    @Override // w2.InterfaceC5032e
    public v a(v vVar, h hVar) {
        Drawable drawable = (Drawable) vVar.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f44284b.a(C4008g.c(((BitmapDrawable) drawable).getBitmap(), this.f44283a), hVar);
        }
        if (drawable instanceof C4913c) {
            return this.f44285c.a(b(vVar), hVar);
        }
        return null;
    }

    private static v b(v vVar) {
        return vVar;
    }
}
