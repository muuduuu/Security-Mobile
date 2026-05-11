package com.google.android.material.internal;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
final class j {

    /* renamed from: n, reason: collision with root package name */
    static final int f27266n = 1;

    /* renamed from: a, reason: collision with root package name */
    private CharSequence f27267a;

    /* renamed from: b, reason: collision with root package name */
    private final TextPaint f27268b;

    /* renamed from: c, reason: collision with root package name */
    private final int f27269c;

    /* renamed from: e, reason: collision with root package name */
    private int f27271e;

    /* renamed from: l, reason: collision with root package name */
    private boolean f27278l;

    /* renamed from: d, reason: collision with root package name */
    private int f27270d = 0;

    /* renamed from: f, reason: collision with root package name */
    private Layout.Alignment f27272f = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: g, reason: collision with root package name */
    private int f27273g = Integer.MAX_VALUE;

    /* renamed from: h, reason: collision with root package name */
    private float f27274h = 0.0f;

    /* renamed from: i, reason: collision with root package name */
    private float f27275i = 1.0f;

    /* renamed from: j, reason: collision with root package name */
    private int f27276j = f27266n;

    /* renamed from: k, reason: collision with root package name */
    private boolean f27277k = true;

    /* renamed from: m, reason: collision with root package name */
    private TextUtils.TruncateAt f27279m = null;

    static class a extends Exception {
    }

    private j(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.f27267a = charSequence;
        this.f27268b = textPaint;
        this.f27269c = i10;
        this.f27271e = charSequence.length();
    }

    public static j b(CharSequence charSequence, TextPaint textPaint, int i10) {
        return new j(charSequence, textPaint, i10);
    }

    public StaticLayout a() {
        if (this.f27267a == null) {
            this.f27267a = BuildConfig.FLAVOR;
        }
        int max = Math.max(0, this.f27269c);
        CharSequence charSequence = this.f27267a;
        if (this.f27273g == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.f27268b, max, this.f27279m);
        }
        int min = Math.min(charSequence.length(), this.f27271e);
        this.f27271e = min;
        if (this.f27278l && this.f27273g == 1) {
            this.f27272f = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, this.f27270d, min, this.f27268b, max);
        obtain.setAlignment(this.f27272f);
        obtain.setIncludePad(this.f27277k);
        obtain.setTextDirection(this.f27278l ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f27279m;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f27273g);
        float f10 = this.f27274h;
        if (f10 != 0.0f || this.f27275i != 1.0f) {
            obtain.setLineSpacing(f10, this.f27275i);
        }
        if (this.f27273g > 1) {
            obtain.setHyphenationFrequency(this.f27276j);
        }
        return obtain.build();
    }

    public j c(Layout.Alignment alignment) {
        this.f27272f = alignment;
        return this;
    }

    public j d(TextUtils.TruncateAt truncateAt) {
        this.f27279m = truncateAt;
        return this;
    }

    public j e(int i10) {
        this.f27276j = i10;
        return this;
    }

    public j f(boolean z10) {
        this.f27277k = z10;
        return this;
    }

    public j g(boolean z10) {
        this.f27278l = z10;
        return this;
    }

    public j h(float f10, float f11) {
        this.f27274h = f10;
        this.f27275i = f11;
        return this;
    }

    public j i(int i10) {
        this.f27273g = i10;
        return this;
    }
}
