package jc;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.renderscript.RSRuntimeException;
import i2.f;
import java.security.MessageDigest;
import kc.AbstractC3559a;
import kc.AbstractC3560b;
import l2.InterfaceC3602d;

/* renamed from: jc.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3523b extends AbstractC3522a {

    /* renamed from: b, reason: collision with root package name */
    private final int f35952b;

    /* renamed from: c, reason: collision with root package name */
    private final int f35953c;

    public C3523b(int i10, int i11) {
        this.f35952b = i10;
        this.f35953c = i11;
    }

    @Override // i2.f
    public void a(MessageDigest messageDigest) {
        messageDigest.update(("jp.wasabeef.glide.transformations.BlurTransformation.1" + this.f35952b + this.f35953c).getBytes(f.f34129a));
    }

    @Override // jc.AbstractC3522a
    protected Bitmap d(Context context, InterfaceC3602d interfaceC3602d, Bitmap bitmap, int i10, int i11) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i12 = this.f35953c;
        Bitmap d10 = interfaceC3602d.d(width / i12, height / i12, Bitmap.Config.ARGB_8888);
        c(bitmap, d10);
        Canvas canvas = new Canvas(d10);
        int i13 = this.f35953c;
        canvas.scale(1.0f / i13, 1.0f / i13);
        Paint paint = new Paint();
        paint.setFlags(2);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        try {
            return AbstractC3560b.a(context, d10, this.f35952b);
        } catch (RSRuntimeException unused) {
            return AbstractC3559a.a(d10, this.f35952b, true);
        }
    }

    @Override // i2.f
    public boolean equals(Object obj) {
        if (obj instanceof C3523b) {
            C3523b c3523b = (C3523b) obj;
            if (c3523b.f35952b == this.f35952b && c3523b.f35953c == this.f35953c) {
                return true;
            }
        }
        return false;
    }

    @Override // i2.f
    public int hashCode() {
        return 737513610 + (this.f35952b * 1000) + (this.f35953c * 10);
    }

    public String toString() {
        return "BlurTransformation(radius=" + this.f35952b + ", sampling=" + this.f35953c + ")";
    }
}
