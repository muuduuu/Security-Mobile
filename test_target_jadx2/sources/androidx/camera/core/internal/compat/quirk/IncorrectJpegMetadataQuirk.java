package androidx.camera.core.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.K0;
import androidx.camera.core.n;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes.dex */
public final class IncorrectJpegMetadataQuirk implements K0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Set f14715a = new HashSet(Arrays.asList("A24"));

    private boolean f(byte[] bArr) {
        byte b10;
        int i10 = 2;
        while (i10 + 4 <= bArr.length && (b10 = bArr[i10]) == -1) {
            if (b10 == -1 && bArr[i10 + 1] == -38) {
                return true;
            }
            i10 += (((bArr[i10 + 2] & 255) << 8) | (bArr[i10 + 3] & 255)) + 2;
        }
        return false;
    }

    private int g(byte[] bArr) {
        int i10 = 2;
        while (true) {
            int i11 = i10 + 1;
            if (i11 > bArr.length) {
                return -1;
            }
            if (bArr[i10] == -1 && bArr[i11] == -40) {
                return i10;
            }
            i10 = i11;
        }
    }

    private static boolean h() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && f14715a.contains(Build.DEVICE.toUpperCase(Locale.US));
    }

    static boolean j() {
        return h();
    }

    public byte[] i(n nVar) {
        int i10 = 0;
        ByteBuffer m10 = nVar.S()[0].m();
        byte[] bArr = new byte[m10.capacity()];
        m10.rewind();
        m10.get(bArr);
        return (f(bArr) || (i10 = g(bArr)) != -1) ? Arrays.copyOfRange(bArr, i10, m10.limit()) : bArr;
    }
}
