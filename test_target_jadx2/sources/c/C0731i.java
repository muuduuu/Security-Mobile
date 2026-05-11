package C;

import android.graphics.Bitmap;
import android.os.Build;
import java.io.ByteArrayOutputStream;
import java.util.Objects;
import org.conscrypt.PSKKeyManager;

/* renamed from: C.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C0731i implements M.y {

    /* renamed from: C.i$a */
    private static class a {
        static boolean a(Bitmap bitmap) {
            return bitmap.hasGainmap();
        }
    }

    /* renamed from: C.i$b */
    static abstract class b {
        b() {
        }

        static b c(M.z zVar, int i10) {
            return new C0723a(zVar, i10);
        }

        abstract int a();

        abstract M.z b();
    }

    C0731i() {
    }

    private static int b(Bitmap bitmap) {
        if (Build.VERSION.SDK_INT < 34 || !a.a(bitmap)) {
            return PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        }
        return 4101;
    }

    @Override // M.y
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public M.z apply(b bVar) {
        M.z b10 = bVar.b();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) b10.c()).compress(Bitmap.CompressFormat.JPEG, bVar.a(), byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        E.g d10 = b10.d();
        Objects.requireNonNull(d10);
        return M.z.m(byteArray, d10, b((Bitmap) b10.c()), b10.h(), b10.b(), b10.f(), b10.g(), b10.a());
    }
}
