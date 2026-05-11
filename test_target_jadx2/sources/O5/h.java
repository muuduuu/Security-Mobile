package o5;

import android.graphics.Color;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import kotlin.jvm.internal.Intrinsics;
import zc.AbstractC5272a;

/* loaded from: classes2.dex */
public final class h extends CharacterStyle implements UpdateAppearance, i {

    /* renamed from: a, reason: collision with root package name */
    private final float f37944a;

    public h(float f10) {
        this.f37944a = f10;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        paint.setAlpha(AbstractC5272a.c(Color.alpha(paint.getColor()) * this.f37944a));
        if (paint.bgColor != 0) {
            paint.bgColor = Color.argb(AbstractC5272a.c(Color.alpha(r0) * this.f37944a), Color.red(paint.bgColor), Color.green(paint.bgColor), Color.blue(paint.bgColor));
        }
    }
}
