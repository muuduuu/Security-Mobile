package e6;

import android.text.TextUtils;
import com.github.penfeizhou.animation.io.Reader;
import com.github.penfeizhou.animation.io.c;

/* renamed from: e6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3087a extends c {

    /* renamed from: a, reason: collision with root package name */
    private static ThreadLocal f32250a = new ThreadLocal();

    public C3087a(Reader reader) {
        super(reader);
    }

    protected static byte[] ensureBytes() {
        byte[] bArr = (byte[]) f32250a.get();
        if (bArr != null) {
            return bArr;
        }
        byte[] bArr2 = new byte[4];
        f32250a.set(bArr2);
        return bArr2;
    }

    public boolean a(String str) {
        if (TextUtils.isEmpty(str) || str.length() != 4) {
            return false;
        }
        int b10 = b();
        for (int i10 = 0; i10 < 4; i10++) {
            if (((b10 >> (i10 * 8)) & 255) != str.charAt(i10)) {
                return false;
            }
        }
        return true;
    }

    public int b() {
        byte[] ensureBytes = ensureBytes();
        read(ensureBytes, 0, 4);
        return ((ensureBytes[3] & 255) << 24) | (ensureBytes[0] & 255) | ((ensureBytes[1] & 255) << 8) | ((ensureBytes[2] & 255) << 16);
    }

    public int c() {
        byte[] ensureBytes = ensureBytes();
        read(ensureBytes, 0, 4);
        return ((ensureBytes[0] & 255) << 24) | (ensureBytes[3] & 255) | ((ensureBytes[2] & 255) << 8) | ((ensureBytes[1] & 255) << 16);
    }

    public short d() {
        byte[] ensureBytes = ensureBytes();
        read(ensureBytes, 0, 2);
        return (short) (((ensureBytes[0] & 255) << 8) | (ensureBytes[1] & 255));
    }
}
