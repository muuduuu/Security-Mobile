package r1;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* loaded from: classes.dex */
class y implements z {

    /* renamed from: a, reason: collision with root package name */
    private final ViewOverlay f39112a;

    y(View view) {
        this.f39112a = view.getOverlay();
    }

    @Override // r1.z
    public void a(Drawable drawable) {
        this.f39112a.add(drawable);
    }

    @Override // r1.z
    public void b(Drawable drawable) {
        this.f39112a.remove(drawable);
    }
}
