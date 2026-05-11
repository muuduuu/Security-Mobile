package p6;

import android.text.TextUtils;
import java.io.IOException;
import q6.C3923a;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public int f38347a;

    /* renamed from: b, reason: collision with root package name */
    public int f38348b;

    /* renamed from: c, reason: collision with root package name */
    public int f38349c;

    public static int a(String str) {
        if (TextUtils.isEmpty(str) || str.length() != 4) {
            return -1159790593;
        }
        return ((str.charAt(3) & 255) << 24) | (str.charAt(0) & 255) | ((str.charAt(1) & 255) << 8) | ((str.charAt(2) & 255) << 16);
    }

    final void c(C3923a c3923a) {
        int available = c3923a.available();
        b(c3923a);
        int available2 = available - c3923a.available();
        int i10 = this.f38348b;
        int i11 = i10 + (i10 & 1);
        if (available2 > i11) {
            throw new IOException("Out of chunk area");
        }
        if (available2 < i11) {
            c3923a.skip(i11 - available2);
        }
    }

    void b(C3923a c3923a) {
    }
}
