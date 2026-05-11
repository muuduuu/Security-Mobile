package l2;

import android.graphics.Bitmap;

/* renamed from: l2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3603e implements InterfaceC3602d {
    @Override // l2.InterfaceC3602d
    public void c(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // l2.InterfaceC3602d
    public Bitmap d(int i10, int i11, Bitmap.Config config) {
        return Bitmap.createBitmap(i10, i11, config);
    }

    @Override // l2.InterfaceC3602d
    public Bitmap e(int i10, int i11, Bitmap.Config config) {
        return d(i10, i11, config);
    }

    @Override // l2.InterfaceC3602d
    public void b() {
    }

    @Override // l2.InterfaceC3602d
    public void a(int i10) {
    }
}
