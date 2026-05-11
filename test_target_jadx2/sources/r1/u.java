package r1;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* loaded from: classes.dex */
class u implements v {

    /* renamed from: a, reason: collision with root package name */
    private final ViewGroupOverlay f39110a;

    u(ViewGroup viewGroup) {
        this.f39110a = viewGroup.getOverlay();
    }

    @Override // r1.z
    public void a(Drawable drawable) {
        this.f39110a.add(drawable);
    }

    @Override // r1.z
    public void b(Drawable drawable) {
        this.f39110a.remove(drawable);
    }

    @Override // r1.v
    public void c(View view) {
        this.f39110a.add(view);
    }

    @Override // r1.v
    public void d(View view) {
        this.f39110a.remove(view);
    }
}
