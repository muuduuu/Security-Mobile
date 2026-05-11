package t7;

import java.util.Arrays;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public final class v6 {

    /* renamed from: a, reason: collision with root package name */
    private final String f43270a;

    /* renamed from: b, reason: collision with root package name */
    private final u6 f43271b;

    /* renamed from: c, reason: collision with root package name */
    private u6 f43272c;

    /* synthetic */ v6(String str, s6 s6Var) {
        u6 u6Var = new u6(null);
        this.f43271b = u6Var;
        this.f43272c = u6Var;
        this.f43270a = str;
    }

    private final v6 e(String str, Object obj) {
        t6 t6Var = new t6(null);
        this.f43272c.f43262c = t6Var;
        this.f43272c = t6Var;
        t6Var.f43261b = obj;
        t6Var.f43260a = str;
        return this;
    }

    public final v6 a(String str, float f10) {
        e(str, String.valueOf(f10));
        return this;
    }

    public final v6 b(String str, int i10) {
        e(str, String.valueOf(i10));
        return this;
    }

    public final v6 c(String str, Object obj) {
        u6 u6Var = new u6(null);
        this.f43272c.f43262c = u6Var;
        this.f43272c = u6Var;
        u6Var.f43261b = obj;
        u6Var.f43260a = str;
        return this;
    }

    public final v6 d(String str, boolean z10) {
        e("trackingEnabled", String.valueOf(z10));
        return this;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.f43270a);
        sb2.append('{');
        u6 u6Var = this.f43271b.f43262c;
        String str = BuildConfig.FLAVOR;
        while (u6Var != null) {
            Object obj = u6Var.f43261b;
            sb2.append(str);
            String str2 = u6Var.f43260a;
            if (str2 != null) {
                sb2.append(str2);
                sb2.append('=');
            }
            if (obj == null || !obj.getClass().isArray()) {
                sb2.append(obj);
            } else {
                sb2.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r2.length() - 1);
            }
            u6Var = u6Var.f43262c;
            str = ", ";
        }
        sb2.append('}');
        return sb2.toString();
    }
}
