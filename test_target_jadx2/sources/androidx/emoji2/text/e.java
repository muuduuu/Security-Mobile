package androidx.emoji2.text;

import android.text.TextPaint;
import androidx.emoji2.text.f;

/* loaded from: classes.dex */
class e implements f.e {

    /* renamed from: b, reason: collision with root package name */
    private static final ThreadLocal f16492b = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    private final TextPaint f16493a;

    e() {
        TextPaint textPaint = new TextPaint();
        this.f16493a = textPaint;
        textPaint.setTextSize(10.0f);
    }

    private static StringBuilder b() {
        ThreadLocal threadLocal = f16492b;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        return (StringBuilder) threadLocal.get();
    }

    @Override // androidx.emoji2.text.f.e
    public boolean a(CharSequence charSequence, int i10, int i11, int i12) {
        StringBuilder b10 = b();
        b10.setLength(0);
        while (i10 < i11) {
            b10.append(charSequence.charAt(i10));
            i10++;
        }
        return androidx.core.graphics.f.a(this.f16493a, b10.toString());
    }
}
