package C;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Rect;
import java.io.IOException;
import java.util.Objects;

/* renamed from: C.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0747z implements M.y {
    C0747z() {
    }

    private Bitmap b(byte[] bArr, Rect rect) {
        try {
            return BitmapRegionDecoder.newInstance(bArr, 0, bArr.length, false).decodeRegion(rect, new BitmapFactory.Options());
        } catch (IOException e10) {
            throw new A.X(1, "Failed to decode JPEG.", e10);
        }
    }

    @Override // M.y
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public M.z apply(M.z zVar) {
        Rect b10 = zVar.b();
        Bitmap b11 = b((byte[]) zVar.c(), b10);
        E.g d10 = zVar.d();
        Objects.requireNonNull(d10);
        return M.z.j(b11, d10, new Rect(0, 0, b11.getWidth(), b11.getHeight()), zVar.f(), E.r.u(zVar.g(), b10), zVar.a());
    }
}
