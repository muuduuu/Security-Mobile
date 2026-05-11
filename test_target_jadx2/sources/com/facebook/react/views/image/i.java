package com.facebook.react.views.image;

import android.graphics.Matrix;
import android.graphics.Rect;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import y3.p;

/* loaded from: classes2.dex */
public final class i extends p.a {

    /* renamed from: l, reason: collision with root package name */
    public static final a f22561l = new a(null);

    /* renamed from: m, reason: collision with root package name */
    private static final p.b f22562m = new i();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final p.b a() {
            return i.f22562m;
        }

        private a() {
        }
    }

    @Override // y3.p.a
    public void b(Matrix outTransform, Rect parentRect, int i10, int i11, float f10, float f11, float f12, float f13) {
        Intrinsics.checkNotNullParameter(outTransform, "outTransform");
        Intrinsics.checkNotNullParameter(parentRect, "parentRect");
        float g10 = kotlin.ranges.d.g(Math.min(f12, f13), 1.0f);
        float f14 = parentRect.left;
        float f15 = parentRect.top;
        outTransform.setScale(g10, g10);
        outTransform.postTranslate(Math.round(f14), Math.round(f15));
    }

    public String toString() {
        return "start_inside";
    }
}
