package androidx.emoji2.text;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* loaded from: classes.dex */
public abstract class j extends ReplacementSpan {

    /* renamed from: b, reason: collision with root package name */
    private final p f16548b;

    /* renamed from: a, reason: collision with root package name */
    private final Paint.FontMetricsInt f16547a = new Paint.FontMetricsInt();

    /* renamed from: c, reason: collision with root package name */
    private short f16549c = -1;

    /* renamed from: d, reason: collision with root package name */
    private short f16550d = -1;

    /* renamed from: e, reason: collision with root package name */
    private float f16551e = 1.0f;

    j(p pVar) {
        y0.f.h(pVar, "rasterizer cannot be null");
        this.f16548b = pVar;
    }

    public final p a() {
        return this.f16548b;
    }

    final int b() {
        return this.f16549c;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f16547a);
        Paint.FontMetricsInt fontMetricsInt2 = this.f16547a;
        this.f16551e = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.f16548b.e();
        this.f16550d = (short) (this.f16548b.e() * this.f16551e);
        short i12 = (short) (this.f16548b.i() * this.f16551e);
        this.f16549c = i12;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f16547a;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return i12;
    }
}
