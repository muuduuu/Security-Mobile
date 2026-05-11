package r2;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;
import l2.InterfaceC3602d;

/* loaded from: classes.dex */
public class v implements i2.l {

    /* renamed from: b, reason: collision with root package name */
    private final i2.l f39187b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f39188c;

    public v(i2.l lVar, boolean z10) {
        this.f39187b = lVar;
        this.f39188c = z10;
    }

    private k2.v d(Context context, k2.v vVar) {
        return C4000A.c(context.getResources(), vVar);
    }

    @Override // i2.f
    public void a(MessageDigest messageDigest) {
        this.f39187b.a(messageDigest);
    }

    @Override // i2.l
    public k2.v b(Context context, k2.v vVar, int i10, int i11) {
        InterfaceC3602d g10 = com.bumptech.glide.c.d(context).g();
        Drawable drawable = (Drawable) vVar.get();
        k2.v a10 = u.a(g10, drawable, i10, i11);
        if (a10 != null) {
            k2.v b10 = this.f39187b.b(context, a10, i10, i11);
            if (!b10.equals(a10)) {
                return d(context, b10);
            }
            b10.recycle();
            return vVar;
        }
        if (!this.f39188c) {
            return vVar;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    @Override // i2.f
    public boolean equals(Object obj) {
        if (obj instanceof v) {
            return this.f39187b.equals(((v) obj).f39187b);
        }
        return false;
    }

    @Override // i2.f
    public int hashCode() {
        return this.f39187b.hashCode();
    }

    public i2.l c() {
        return this;
    }
}
