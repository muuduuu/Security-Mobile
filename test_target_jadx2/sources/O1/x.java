package O1;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    private final int f6993a;

    /* renamed from: b, reason: collision with root package name */
    private final int f6994b;

    /* renamed from: c, reason: collision with root package name */
    private final String f6995c;

    /* renamed from: d, reason: collision with root package name */
    private final String f6996d;

    /* renamed from: e, reason: collision with root package name */
    private final String f6997e;

    /* renamed from: f, reason: collision with root package name */
    private Bitmap f6998f;

    public x(int i10, int i11, String str, String str2, String str3) {
        this.f6993a = i10;
        this.f6994b = i11;
        this.f6995c = str;
        this.f6996d = str2;
        this.f6997e = str3;
    }

    public x a(float f10) {
        x xVar = new x((int) (this.f6993a * f10), (int) (this.f6994b * f10), this.f6995c, this.f6996d, this.f6997e);
        Bitmap bitmap = this.f6998f;
        if (bitmap != null) {
            xVar.g(Bitmap.createScaledBitmap(bitmap, xVar.f6993a, xVar.f6994b, true));
        }
        return xVar;
    }

    public Bitmap b() {
        return this.f6998f;
    }

    public String c() {
        return this.f6996d;
    }

    public int d() {
        return this.f6994b;
    }

    public String e() {
        return this.f6995c;
    }

    public int f() {
        return this.f6993a;
    }

    public void g(Bitmap bitmap) {
        this.f6998f = bitmap;
    }
}
