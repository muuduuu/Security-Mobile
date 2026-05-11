package e9;

import android.media.Image;

/* renamed from: e9.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3103b {

    /* renamed from: a, reason: collision with root package name */
    private final Image f32301a;

    C3103b(Image image) {
        this.f32301a = image;
    }

    final Image a() {
        return this.f32301a;
    }

    final Image.Plane[] b() {
        return this.f32301a.getPlanes();
    }
}
