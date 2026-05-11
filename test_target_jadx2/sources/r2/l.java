package r2;

import android.graphics.Bitmap;
import java.security.MessageDigest;
import l2.InterfaceC3602d;

/* loaded from: classes.dex */
public class l extends AbstractC4009h {

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f39157b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(i2.f.f34129a);

    @Override // i2.f
    public void a(MessageDigest messageDigest) {
        messageDigest.update(f39157b);
    }

    @Override // r2.AbstractC4009h
    protected Bitmap c(InterfaceC3602d interfaceC3602d, Bitmap bitmap, int i10, int i11) {
        return F.b(interfaceC3602d, bitmap, i10, i11);
    }

    @Override // i2.f
    public boolean equals(Object obj) {
        return obj instanceof l;
    }

    @Override // i2.f
    public int hashCode() {
        return -670243078;
    }
}
