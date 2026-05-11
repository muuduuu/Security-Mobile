package e5;

import android.content.Context;
import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: e5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3080b {

    /* renamed from: a, reason: collision with root package name */
    private final Float[] f32214a = new Float[j.values().length];

    public final RectF a(int i10, Context context) {
        RectF rectF;
        Intrinsics.checkNotNullParameter(context, "context");
        if (i10 == 0) {
            Float f10 = this.f32214a[j.START.ordinal()];
            float floatValue = (f10 == null && (f10 = this.f32214a[j.LEFT.ordinal()]) == null && (f10 = this.f32214a[j.HORIZONTAL.ordinal()]) == null && (f10 = this.f32214a[j.ALL.ordinal()]) == null) ? 0.0f : f10.floatValue();
            Float f11 = this.f32214a[j.BLOCK_START.ordinal()];
            float floatValue2 = (f11 == null && (f11 = this.f32214a[j.TOP.ordinal()]) == null && (f11 = this.f32214a[j.BLOCK.ordinal()]) == null && (f11 = this.f32214a[j.VERTICAL.ordinal()]) == null && (f11 = this.f32214a[j.ALL.ordinal()]) == null) ? 0.0f : f11.floatValue();
            Float f12 = this.f32214a[j.END.ordinal()];
            float floatValue3 = (f12 == null && (f12 = this.f32214a[j.RIGHT.ordinal()]) == null && (f12 = this.f32214a[j.HORIZONTAL.ordinal()]) == null && (f12 = this.f32214a[j.ALL.ordinal()]) == null) ? 0.0f : f12.floatValue();
            Float f13 = this.f32214a[j.BLOCK_END.ordinal()];
            rectF = new RectF(floatValue, floatValue2, floatValue3, (f13 == null && (f13 = this.f32214a[j.BOTTOM.ordinal()]) == null && (f13 = this.f32214a[j.BLOCK.ordinal()]) == null && (f13 = this.f32214a[j.VERTICAL.ordinal()]) == null && (f13 = this.f32214a[j.ALL.ordinal()]) == null) ? 0.0f : f13.floatValue());
        } else {
            if (i10 != 1) {
                throw new IllegalArgumentException("Expected resolved layout direction");
            }
            if (com.facebook.react.modules.i18nmanager.a.f21807a.a().d(context)) {
                Float f14 = this.f32214a[j.END.ordinal()];
                float floatValue4 = (f14 == null && (f14 = this.f32214a[j.RIGHT.ordinal()]) == null && (f14 = this.f32214a[j.HORIZONTAL.ordinal()]) == null && (f14 = this.f32214a[j.ALL.ordinal()]) == null) ? 0.0f : f14.floatValue();
                Float f15 = this.f32214a[j.BLOCK_START.ordinal()];
                float floatValue5 = (f15 == null && (f15 = this.f32214a[j.TOP.ordinal()]) == null && (f15 = this.f32214a[j.BLOCK.ordinal()]) == null && (f15 = this.f32214a[j.VERTICAL.ordinal()]) == null && (f15 = this.f32214a[j.ALL.ordinal()]) == null) ? 0.0f : f15.floatValue();
                Float f16 = this.f32214a[j.START.ordinal()];
                float floatValue6 = (f16 == null && (f16 = this.f32214a[j.LEFT.ordinal()]) == null && (f16 = this.f32214a[j.HORIZONTAL.ordinal()]) == null && (f16 = this.f32214a[j.ALL.ordinal()]) == null) ? 0.0f : f16.floatValue();
                Float f17 = this.f32214a[j.BLOCK_END.ordinal()];
                rectF = new RectF(floatValue4, floatValue5, floatValue6, (f17 == null && (f17 = this.f32214a[j.BOTTOM.ordinal()]) == null && (f17 = this.f32214a[j.BLOCK.ordinal()]) == null && (f17 = this.f32214a[j.VERTICAL.ordinal()]) == null && (f17 = this.f32214a[j.ALL.ordinal()]) == null) ? 0.0f : f17.floatValue());
            } else {
                Float f18 = this.f32214a[j.END.ordinal()];
                float floatValue7 = (f18 == null && (f18 = this.f32214a[j.LEFT.ordinal()]) == null && (f18 = this.f32214a[j.HORIZONTAL.ordinal()]) == null && (f18 = this.f32214a[j.ALL.ordinal()]) == null) ? 0.0f : f18.floatValue();
                Float f19 = this.f32214a[j.BLOCK_START.ordinal()];
                float floatValue8 = (f19 == null && (f19 = this.f32214a[j.TOP.ordinal()]) == null && (f19 = this.f32214a[j.BLOCK.ordinal()]) == null && (f19 = this.f32214a[j.VERTICAL.ordinal()]) == null && (f19 = this.f32214a[j.ALL.ordinal()]) == null) ? 0.0f : f19.floatValue();
                Float f20 = this.f32214a[j.START.ordinal()];
                float floatValue9 = (f20 == null && (f20 = this.f32214a[j.RIGHT.ordinal()]) == null && (f20 = this.f32214a[j.HORIZONTAL.ordinal()]) == null && (f20 = this.f32214a[j.ALL.ordinal()]) == null) ? 0.0f : f20.floatValue();
                Float f21 = this.f32214a[j.BLOCK_END.ordinal()];
                rectF = new RectF(floatValue7, floatValue8, floatValue9, (f21 == null && (f21 = this.f32214a[j.BOTTOM.ordinal()]) == null && (f21 = this.f32214a[j.BLOCK.ordinal()]) == null && (f21 = this.f32214a[j.VERTICAL.ordinal()]) == null && (f21 = this.f32214a[j.ALL.ordinal()]) == null) ? 0.0f : f21.floatValue());
            }
        }
        return rectF;
    }

    public final void b(j edge, Float f10) {
        Intrinsics.checkNotNullParameter(edge, "edge");
        this.f32214a[edge.ordinal()] = f10;
    }
}
