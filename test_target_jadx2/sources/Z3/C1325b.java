package Z3;

import android.net.Uri;
import com.facebook.common.time.RealtimeSinceBootClock;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: Z3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1325b implements V2.d {

    /* renamed from: a, reason: collision with root package name */
    private final String f12367a;

    /* renamed from: b, reason: collision with root package name */
    private final a4.f f12368b;

    /* renamed from: c, reason: collision with root package name */
    private final a4.g f12369c;

    /* renamed from: d, reason: collision with root package name */
    private final a4.c f12370d;

    /* renamed from: e, reason: collision with root package name */
    private final V2.d f12371e;

    /* renamed from: f, reason: collision with root package name */
    private final String f12372f;

    /* renamed from: g, reason: collision with root package name */
    private Object f12373g;

    /* renamed from: h, reason: collision with root package name */
    private final int f12374h;

    /* renamed from: i, reason: collision with root package name */
    private final long f12375i;

    public C1325b(String sourceString, a4.f fVar, a4.g rotationOptions, a4.c imageDecodeOptions, V2.d dVar, String str) {
        Intrinsics.checkNotNullParameter(sourceString, "sourceString");
        Intrinsics.checkNotNullParameter(rotationOptions, "rotationOptions");
        Intrinsics.checkNotNullParameter(imageDecodeOptions, "imageDecodeOptions");
        this.f12367a = sourceString;
        this.f12368b = fVar;
        this.f12369c = rotationOptions;
        this.f12370d = imageDecodeOptions;
        this.f12371e = dVar;
        this.f12372f = str;
        this.f12374h = (((((((((sourceString.hashCode() * 31) + (fVar != null ? fVar.hashCode() : 0)) * 31) + rotationOptions.hashCode()) * 31) + imageDecodeOptions.hashCode()) * 31) + (dVar != null ? dVar.hashCode() : 0)) * 31) + (str != null ? str.hashCode() : 0);
        this.f12375i = RealtimeSinceBootClock.get().now();
    }

    @Override // V2.d
    public boolean a(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        String c10 = c();
        String uri2 = uri.toString();
        Intrinsics.checkNotNullExpressionValue(uri2, "uri.toString()");
        return StringsKt.K(c10, uri2, false, 2, null);
    }

    @Override // V2.d
    public boolean b() {
        return false;
    }

    @Override // V2.d
    public String c() {
        return this.f12367a;
    }

    public final void d(Object obj) {
        this.f12373g = obj;
    }

    @Override // V2.d
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.b(C1325b.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.e(obj, "null cannot be cast to non-null type com.facebook.imagepipeline.cache.BitmapMemoryCacheKey");
        C1325b c1325b = (C1325b) obj;
        return Intrinsics.b(this.f12367a, c1325b.f12367a) && Intrinsics.b(this.f12368b, c1325b.f12368b) && Intrinsics.b(this.f12369c, c1325b.f12369c) && Intrinsics.b(this.f12370d, c1325b.f12370d) && Intrinsics.b(this.f12371e, c1325b.f12371e) && Intrinsics.b(this.f12372f, c1325b.f12372f);
    }

    @Override // V2.d
    public int hashCode() {
        return this.f12374h;
    }

    public String toString() {
        return "BitmapMemoryCacheKey(sourceString=" + this.f12367a + ", resizeOptions=" + this.f12368b + ", rotationOptions=" + this.f12369c + ", imageDecodeOptions=" + this.f12370d + ", postprocessorCacheKey=" + this.f12371e + ", postprocessorName=" + this.f12372f + ")";
    }
}
