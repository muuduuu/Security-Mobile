package r2;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import l2.C3603e;
import l2.InterfaceC3602d;
import q2.C3915l;

/* renamed from: r2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4007f implements i2.j {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3602d f39152a = new C3603e();

    @Override // i2.j
    public /* bridge */ /* synthetic */ boolean a(Object obj, i2.h hVar) {
        return d(AbstractC4005d.a(obj), hVar);
    }

    @Override // i2.j
    public /* bridge */ /* synthetic */ k2.v b(Object obj, int i10, int i11, i2.h hVar) {
        return c(AbstractC4005d.a(obj), i10, i11, hVar);
    }

    public k2.v c(ImageDecoder.Source source, int i10, int i11, i2.h hVar) {
        Bitmap decodeBitmap;
        decodeBitmap = ImageDecoder.decodeBitmap(source, new C3915l(i10, i11, hVar));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + decodeBitmap.getWidth() + "x" + decodeBitmap.getHeight() + "] for [" + i10 + "x" + i11 + "]");
        }
        return new C4008g(decodeBitmap, this.f39152a);
    }

    public boolean d(ImageDecoder.Source source, i2.h hVar) {
        return true;
    }
}
