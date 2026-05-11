package le;

import kotlin.jvm.internal.Intrinsics;
import pe.C3877e;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f37220a = new f();

    private f() {
    }

    public final String a(int i10) {
        if (i10 < 1000 || i10 >= 5000) {
            return "Code must be in range [1000,5000): " + i10;
        }
        if ((1004 > i10 || i10 >= 1007) && (1015 > i10 || i10 >= 3000)) {
            return null;
        }
        return "Code " + i10 + " is reserved and may not be used.";
    }

    public final void b(C3877e.a cursor, byte[] key) {
        Intrinsics.checkNotNullParameter(cursor, "cursor");
        Intrinsics.checkNotNullParameter(key, "key");
        int length = key.length;
        int i10 = 0;
        do {
            byte[] bArr = cursor.f38672e;
            int i11 = cursor.f38673f;
            int i12 = cursor.f38674g;
            if (bArr != null) {
                while (i11 < i12) {
                    int i13 = i10 % length;
                    bArr[i11] = (byte) (bArr[i11] ^ key[i13]);
                    i11++;
                    i10 = i13 + 1;
                }
            }
        } while (cursor.b() != -1);
    }

    public final void c(int i10) {
        String a10 = a(i10);
        if (a10 == null) {
            return;
        }
        Intrinsics.d(a10);
        throw new IllegalArgumentException(a10.toString());
    }
}
