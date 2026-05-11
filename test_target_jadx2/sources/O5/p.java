package o5;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class p extends ReplacementSpan implements i {

    /* renamed from: a, reason: collision with root package name */
    private final int f37955a;

    /* renamed from: b, reason: collision with root package name */
    private final int f37956b;

    /* renamed from: c, reason: collision with root package name */
    private final int f37957c;

    public p(int i10, int i11, int i12) {
        this.f37955a = i10;
        this.f37956b = i11;
        this.f37957c = i12;
    }

    public final int a() {
        return this.f37957c;
    }

    public final int b() {
        return this.f37955a;
    }

    public final int c() {
        return this.f37956b;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(paint, "paint");
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        if (fontMetricsInt != null) {
            int i12 = -this.f37957c;
            fontMetricsInt.ascent = i12;
            fontMetricsInt.descent = 0;
            fontMetricsInt.top = i12;
            fontMetricsInt.bottom = 0;
        }
        return this.f37956b;
    }
}
