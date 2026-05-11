package j7;

import android.util.Base64;
import java.security.SecureRandom;

/* loaded from: classes2.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    private static final SecureRandom f35884a = new SecureRandom();

    public static String a() {
        byte[] bArr = new byte[16];
        f35884a.nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }
}
