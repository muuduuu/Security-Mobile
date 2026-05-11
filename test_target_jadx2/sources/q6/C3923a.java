package q6;

import android.text.TextUtils;
import com.github.penfeizhou.animation.io.Reader;
import com.github.penfeizhou.animation.io.c;

/* renamed from: q6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3923a extends c {

    /* renamed from: a, reason: collision with root package name */
    private static ThreadLocal f38766a = new ThreadLocal();

    public C3923a(Reader reader) {
        super(reader);
    }

    protected static byte[] ensureBytes() {
        byte[] bArr = (byte[]) f38766a.get();
        if (bArr != null) {
            return bArr;
        }
        byte[] bArr2 = new byte[4];
        f38766a.set(bArr2);
        return bArr2;
    }

    public int a() {
        return d() + 1;
    }

    public int b() {
        byte[] ensureBytes = ensureBytes();
        read(ensureBytes, 0, 4);
        return ((ensureBytes[3] & 255) << 24) | (ensureBytes[0] & 255) | ((ensureBytes[1] & 255) << 8) | ((ensureBytes[2] & 255) << 16);
    }

    public int c() {
        byte[] ensureBytes = ensureBytes();
        read(ensureBytes, 0, 2);
        return ((ensureBytes[1] & 255) << 8) | (ensureBytes[0] & 255);
    }

    public int d() {
        byte[] ensureBytes = ensureBytes();
        read(ensureBytes, 0, 3);
        return ((ensureBytes[2] & 255) << 16) | (ensureBytes[0] & 255) | ((ensureBytes[1] & 255) << 8);
    }

    public int e() {
        byte[] ensureBytes = ensureBytes();
        read(ensureBytes, 0, 4);
        return ((ensureBytes[3] & 255) << 24) | (ensureBytes[0] & 255) | ((ensureBytes[1] & 255) << 8) | ((ensureBytes[2] & 255) << 16);
    }

    public boolean f(String str) {
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
}
