package P7;

import V7.b;
import android.content.Context;
import android.graphics.Color;
import androidx.core.graphics.d;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: f, reason: collision with root package name */
    private static final int f7547f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a, reason: collision with root package name */
    private final boolean f7548a;

    /* renamed from: b, reason: collision with root package name */
    private final int f7549b;

    /* renamed from: c, reason: collision with root package name */
    private final int f7550c;

    /* renamed from: d, reason: collision with root package name */
    private final int f7551d;

    /* renamed from: e, reason: collision with root package name */
    private final float f7552e;

    public a(Context context) {
        this(b.b(context, H7.b.f3147t, false), M7.a.b(context, H7.b.f3146s, 0), M7.a.b(context, H7.b.f3145r, 0), M7.a.b(context, H7.b.f3143p, 0), context.getResources().getDisplayMetrics().density);
    }

    private boolean e(int i10) {
        return d.p(i10, 255) == this.f7551d;
    }

    public float a(float f10) {
        if (this.f7552e <= 0.0f || f10 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f10 / r0)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    public int b(int i10, float f10) {
        int i11;
        float a10 = a(f10);
        int alpha = Color.alpha(i10);
        int h10 = M7.a.h(d.p(i10, 255), this.f7549b, a10);
        if (a10 > 0.0f && (i11 = this.f7550c) != 0) {
            h10 = M7.a.g(h10, d.p(i11, f7547f));
        }
        return d.p(h10, alpha);
    }

    public int c(int i10, float f10) {
        return (this.f7548a && e(i10)) ? b(i10, f10) : i10;
    }

    public boolean d() {
        return this.f7548a;
    }

    public a(boolean z10, int i10, int i11, int i12, float f10) {
        this.f7548a = z10;
        this.f7549b = i10;
        this.f7550c = i11;
        this.f7551d = i12;
        this.f7552e = f10;
    }
}
