package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
class g0 extends Y {

    /* renamed from: b, reason: collision with root package name */
    private final WeakReference f14156b;

    public g0(Context context, Resources resources) {
        super(resources);
        this.f14156b = new WeakReference(context);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i10) {
        Drawable a10 = a(i10);
        Context context = (Context) this.f14156b.get();
        if (a10 != null && context != null) {
            X.g().w(context, i10, a10);
        }
        return a10;
    }
}
