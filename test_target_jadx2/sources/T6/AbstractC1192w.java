package T6;

import D7.C0787k;
import V6.AbstractC1265b;
import com.google.android.gms.common.api.Status;

/* renamed from: T6.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1192w {
    public static void a(Status status, C0787k c0787k) {
        b(status, null, c0787k);
    }

    public static void b(Status status, Object obj, C0787k c0787k) {
        if (status.Z0()) {
            c0787k.c(obj);
        } else {
            c0787k.b(AbstractC1265b.a(status));
        }
    }

    public static boolean c(Status status, Object obj, C0787k c0787k) {
        return status.Z0() ? c0787k.e(obj) : c0787k.d(AbstractC1265b.a(status));
    }
}
