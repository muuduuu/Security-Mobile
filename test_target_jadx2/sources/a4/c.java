package a4;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import b3.j;

/* loaded from: classes.dex */
public class c {

    /* renamed from: m, reason: collision with root package name */
    private static final c f12573m = b().a();

    /* renamed from: a, reason: collision with root package name */
    public final int f12574a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12575b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f12576c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f12577d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f12578e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f12579f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f12580g;

    /* renamed from: h, reason: collision with root package name */
    public final Bitmap.Config f12581h;

    /* renamed from: i, reason: collision with root package name */
    public final Bitmap.Config f12582i;

    /* renamed from: j, reason: collision with root package name */
    public final e4.c f12583j;

    /* renamed from: k, reason: collision with root package name */
    public final ColorSpace f12584k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f12585l;

    public c(d dVar) {
        this.f12574a = dVar.l();
        this.f12575b = dVar.k();
        this.f12576c = dVar.h();
        this.f12577d = dVar.n();
        this.f12578e = dVar.m();
        this.f12579f = dVar.g();
        this.f12580g = dVar.j();
        this.f12581h = dVar.c();
        this.f12582i = dVar.b();
        this.f12583j = dVar.f();
        dVar.d();
        this.f12584k = dVar.e();
        this.f12585l = dVar.i();
    }

    public static c a() {
        return f12573m;
    }

    public static d b() {
        return new d();
    }

    protected j.a c() {
        return j.c(this).a("minDecodeIntervalMs", this.f12574a).a("maxDimensionPx", this.f12575b).c("decodePreviewFrame", this.f12576c).c("useLastFrameForPreview", this.f12577d).c("useEncodedImageForPreview", this.f12578e).c("decodeAllFrames", this.f12579f).c("forceStaticImage", this.f12580g).b("bitmapConfigName", this.f12581h.name()).b("animatedBitmapConfigName", this.f12582i.name()).b("customImageDecoder", this.f12583j).b("bitmapTransformation", null).b("colorSpace", this.f12584k);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f12574a != cVar.f12574a || this.f12575b != cVar.f12575b || this.f12576c != cVar.f12576c || this.f12577d != cVar.f12577d || this.f12578e != cVar.f12578e || this.f12579f != cVar.f12579f || this.f12580g != cVar.f12580g) {
            return false;
        }
        boolean z10 = this.f12585l;
        if (z10 || this.f12581h == cVar.f12581h) {
            return (z10 || this.f12582i == cVar.f12582i) && this.f12583j == cVar.f12583j && this.f12584k == cVar.f12584k;
        }
        return false;
    }

    public int hashCode() {
        int i10 = (((((((((((this.f12574a * 31) + this.f12575b) * 31) + (this.f12576c ? 1 : 0)) * 31) + (this.f12577d ? 1 : 0)) * 31) + (this.f12578e ? 1 : 0)) * 31) + (this.f12579f ? 1 : 0)) * 31) + (this.f12580g ? 1 : 0);
        if (!this.f12585l) {
            i10 = (i10 * 31) + this.f12581h.ordinal();
        }
        if (!this.f12585l) {
            int i11 = i10 * 31;
            Bitmap.Config config = this.f12582i;
            i10 = i11 + (config != null ? config.ordinal() : 0);
        }
        int i12 = i10 * 31;
        e4.c cVar = this.f12583j;
        int hashCode = (i12 + (cVar != null ? cVar.hashCode() : 0)) * 961;
        ColorSpace colorSpace = this.f12584k;
        return hashCode + (colorSpace != null ? colorSpace.hashCode() : 0);
    }

    public String toString() {
        return "ImageDecodeOptions{" + c().toString() + "}";
    }
}
