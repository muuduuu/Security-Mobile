package d6;

import android.text.TextUtils;
import e6.C3087a;
import java.io.IOException;

/* loaded from: classes2.dex */
class e {

    /* renamed from: a, reason: collision with root package name */
    int f31253a;

    /* renamed from: b, reason: collision with root package name */
    int f31254b;

    /* renamed from: c, reason: collision with root package name */
    int f31255c;

    /* renamed from: d, reason: collision with root package name */
    int f31256d;

    e() {
    }

    static int a(String str) {
        if (TextUtils.isEmpty(str) || str.length() != 4) {
            return -1159790593;
        }
        return ((str.charAt(3) & 255) << 24) | (str.charAt(0) & 255) | ((str.charAt(1) & 255) << 8) | ((str.charAt(2) & 255) << 16);
    }

    void c(C3087a c3087a) {
        int available = c3087a.available();
        b(c3087a);
        int available2 = available - c3087a.available();
        int i10 = this.f31253a;
        if (available2 > i10) {
            throw new IOException("Out of chunk area");
        }
        if (available2 < i10) {
            c3087a.skip(i10 - available2);
        }
    }

    void b(C3087a c3087a) {
    }
}
