package r2;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import l2.InterfaceC3602d;
import t2.C4616l;

/* loaded from: classes.dex */
public class D implements i2.j {

    /* renamed from: a, reason: collision with root package name */
    private final C4616l f39122a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3602d f39123b;

    public D(C4616l c4616l, InterfaceC3602d interfaceC3602d) {
        this.f39122a = c4616l;
        this.f39123b = interfaceC3602d;
    }

    @Override // i2.j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public k2.v b(Uri uri, int i10, int i11, i2.h hVar) {
        k2.v b10 = this.f39122a.b(uri, i10, i11, hVar);
        if (b10 == null) {
            return null;
        }
        return u.a(this.f39123b, (Drawable) b10.get(), i10, i11);
    }

    @Override // i2.j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri, i2.h hVar) {
        return "android.resource".equals(uri.getScheme());
    }
}
