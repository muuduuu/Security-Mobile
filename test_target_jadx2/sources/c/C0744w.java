package C;

import L.b;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.impl.P0;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Objects;
import org.conscrypt.PSKKeyManager;

/* renamed from: C.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0744w implements M.y {

    /* renamed from: a, reason: collision with root package name */
    private final K.d f726a;

    /* renamed from: C.w$a */
    static abstract class a {
        a() {
        }

        static a c(M.z zVar, int i10) {
            return new C0725c(zVar, i10);
        }

        abstract int a();

        abstract M.z b();
    }

    C0744w(P0 p02) {
        this.f726a = new K.d(p02);
    }

    private static E.g b(byte[] bArr) {
        try {
            return E.g.k(new ByteArrayInputStream(bArr));
        } catch (IOException e10) {
            throw new A.X(0, "Failed to extract Exif from YUV-generated JPEG", e10);
        }
    }

    private M.z c(a aVar, int i10) {
        M.z b10 = aVar.b();
        byte[] a10 = this.f726a.a((androidx.camera.core.n) b10.c());
        E.g d10 = b10.d();
        Objects.requireNonNull(d10);
        return M.z.m(a10, d10, i10, b10.h(), b10.b(), b10.f(), b10.g(), b10.a());
    }

    private M.z d(a aVar) {
        M.z b10 = aVar.b();
        androidx.camera.core.n nVar = (androidx.camera.core.n) b10.c();
        Rect b11 = b10.b();
        try {
            byte[] l10 = L.b.l(nVar, b11, aVar.a(), b10.f());
            return M.z.m(l10, b(l10), PSKKeyManager.MAX_KEY_LENGTH_BYTES, new Size(b11.width(), b11.height()), new Rect(0, 0, b11.width(), b11.height()), b10.f(), E.r.u(b10.g(), b11), b10.a());
        } catch (b.a e10) {
            throw new A.X(1, "Failed to encode the image to JPEG.", e10);
        }
    }

    @Override // M.y
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public M.z apply(a aVar) {
        M.z d10;
        try {
            int e10 = aVar.b().e();
            if (e10 != 35) {
                if (e10 != 256 && e10 != 4101) {
                    throw new IllegalArgumentException("Unexpected format: " + e10);
                }
                d10 = c(aVar, e10);
            } else {
                d10 = d(aVar);
            }
            ((androidx.camera.core.n) aVar.b().c()).close();
            return d10;
        } catch (Throwable th) {
            ((androidx.camera.core.n) aVar.b().c()).close();
            throw th;
        }
    }
}
