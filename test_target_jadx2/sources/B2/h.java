package b2;

import androidx.core.os.o;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private final String[] f18518a = new String[5];

    /* renamed from: b, reason: collision with root package name */
    private final long[] f18519b = new long[5];

    /* renamed from: c, reason: collision with root package name */
    private int f18520c = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f18521d = 0;

    public void a(String str) {
        int i10 = this.f18520c;
        if (i10 == 5) {
            this.f18521d++;
            return;
        }
        this.f18518a[i10] = str;
        this.f18519b[i10] = System.nanoTime();
        o.a(str);
        this.f18520c++;
    }

    public float b(String str) {
        int i10 = this.f18521d;
        if (i10 > 0) {
            this.f18521d = i10 - 1;
            return 0.0f;
        }
        int i11 = this.f18520c - 1;
        this.f18520c = i11;
        if (i11 == -1) {
            throw new IllegalStateException("Can't end trace section. There are none.");
        }
        if (str.equals(this.f18518a[i11])) {
            o.b();
            return (System.nanoTime() - this.f18519b[this.f18520c]) / 1000000.0f;
        }
        throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + this.f18518a[this.f18520c] + ".");
    }
}
