package t2;

import android.graphics.drawable.Drawable;
import k2.v;

/* renamed from: t2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4615k extends AbstractC4614j {
    private C4615k(Drawable drawable) {
        super(drawable);
    }

    static v c(Drawable drawable) {
        if (drawable != null) {
            return new C4615k(drawable);
        }
        return null;
    }

    @Override // k2.v
    public Class a() {
        return this.f42289a.getClass();
    }

    @Override // k2.v
    public int k() {
        return Math.max(1, this.f42289a.getIntrinsicWidth() * this.f42289a.getIntrinsicHeight() * 4);
    }

    @Override // k2.v
    public void recycle() {
    }
}
