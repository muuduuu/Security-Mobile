package t2;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import k2.r;
import k2.v;
import v2.C4913c;

/* renamed from: t2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4614j implements v, r {

    /* renamed from: a, reason: collision with root package name */
    protected final Drawable f42289a;

    public AbstractC4614j(Drawable drawable) {
        this.f42289a = (Drawable) D2.k.d(drawable);
    }

    @Override // k2.v
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Drawable get() {
        Drawable.ConstantState constantState = this.f42289a.getConstantState();
        return constantState == null ? this.f42289a : constantState.newDrawable();
    }

    public void initialize() {
        Drawable drawable = this.f42289a;
        if (drawable instanceof BitmapDrawable) {
            ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
        } else if (drawable instanceof C4913c) {
            ((C4913c) drawable).e().prepareToDraw();
        }
    }
}
