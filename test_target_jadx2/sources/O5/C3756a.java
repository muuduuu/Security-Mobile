package o5;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: o5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3756a extends MetricAffectingSpan implements i {

    /* renamed from: a, reason: collision with root package name */
    private final float f37935a;

    public C3756a(float f10) {
        this.f37935a = f10;
    }

    private final void a(TextPaint textPaint) {
        if (Float.isNaN(this.f37935a)) {
            return;
        }
        textPaint.setLetterSpacing(this.f37935a);
    }

    public final float b() {
        return this.f37935a;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        a(paint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        a(paint);
    }
}
