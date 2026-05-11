package o5;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class n extends CharacterStyle implements i {

    /* renamed from: a, reason: collision with root package name */
    private final float f37950a;

    /* renamed from: b, reason: collision with root package name */
    private final float f37951b;

    /* renamed from: c, reason: collision with root package name */
    private final float f37952c;

    /* renamed from: d, reason: collision with root package name */
    private final int f37953d;

    public n(float f10, float f11, float f12, int i10) {
        this.f37950a = f10;
        this.f37951b = f11;
        this.f37952c = f12;
        this.f37953d = i10;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        textPaint.setShadowLayer(this.f37952c, this.f37950a, this.f37951b, this.f37953d);
    }
}
