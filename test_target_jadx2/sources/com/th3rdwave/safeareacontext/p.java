package com.th3rdwave.safeareacontext;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.C1938d0;
import com.facebook.react.uimanager.C1944g0;
import com.facebook.react.uimanager.V;
import com.facebook.react.uimanager.m1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class p extends V {

    /* renamed from: A, reason: collision with root package name */
    private n f30115A;

    /* renamed from: B, reason: collision with root package name */
    private final float[] f30116B;

    /* renamed from: C, reason: collision with root package name */
    private final float[] f30117C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f30118D;

    public p() {
        int[] iArr = m1.f22463c;
        this.f30116B = new float[iArr.length];
        this.f30117C = new float[iArr.length];
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f30116B[i10] = Float.NaN;
            this.f30117C[i10] = Float.NaN;
        }
    }

    private final float w1(l lVar, float f10, float f11) {
        return lVar == l.OFF ? f11 : lVar == l.MAXIMUM ? Math.max(f10, f11) : f10 + f11;
    }

    private final void x1(o oVar) {
        if (oVar == o.PADDING) {
            super.v(1, this.f30116B[1]);
            super.v(2, this.f30116B[1]);
            super.v(3, this.f30116B[3]);
            super.v(0, this.f30116B[0]);
        } else {
            super.V0(1, this.f30117C[1]);
            super.V0(2, this.f30117C[1]);
            super.V0(3, this.f30117C[3]);
            super.V0(0, this.f30117C[0]);
        }
        y0();
    }

    private final void y1() {
        n nVar = this.f30115A;
        if (nVar == null) {
            return;
        }
        o c10 = nVar.c();
        o oVar = o.PADDING;
        float[] fArr = c10 == oVar ? this.f30116B : this.f30117C;
        float f10 = fArr[8];
        if (Float.isNaN(f10)) {
            f10 = 0.0f;
        }
        float f11 = f10;
        float f12 = f11;
        float f13 = f12;
        float f14 = fArr[7];
        if (!Float.isNaN(f14)) {
            f10 = f14;
            f12 = f10;
        }
        float f15 = fArr[6];
        if (!Float.isNaN(f15)) {
            f11 = f15;
            f13 = f11;
        }
        float f16 = fArr[1];
        if (!Float.isNaN(f16)) {
            f10 = f16;
        }
        float f17 = fArr[2];
        if (!Float.isNaN(f17)) {
            f11 = f17;
        }
        float f18 = fArr[3];
        if (!Float.isNaN(f18)) {
            f12 = f18;
        }
        float f19 = fArr[0];
        if (!Float.isNaN(f19)) {
            f13 = f19;
        }
        float g10 = C1944g0.g(f10);
        float g11 = C1944g0.g(f11);
        float g12 = C1944g0.g(f12);
        float g13 = C1944g0.g(f13);
        m a10 = nVar.a();
        a b10 = nVar.b();
        if (nVar.c() == oVar) {
            super.v(1, w1(a10.d(), b10.d(), g10));
            super.v(2, w1(a10.c(), b10.c(), g11));
            super.v(3, w1(a10.a(), b10.a(), g12));
            super.v(0, w1(a10.b(), b10.b(), g13));
            return;
        }
        super.V0(1, w1(a10.d(), b10.d(), g10));
        super.V0(2, w1(a10.c(), b10.c(), g11));
        super.V0(3, w1(a10.a(), b10.a(), g12));
        super.V0(0, w1(a10.b(), b10.b(), g13));
    }

    @Override // com.facebook.react.uimanager.C1971u0, com.facebook.react.uimanager.InterfaceC1969t0
    public void G(Object data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (data instanceof n) {
            n nVar = this.f30115A;
            if (nVar != null && nVar.c() != ((n) data).c()) {
                x1(nVar.c());
            }
            this.f30115A = (n) data;
            this.f30118D = false;
            y1();
        }
    }

    @Override // com.facebook.react.uimanager.C1971u0, com.facebook.react.uimanager.InterfaceC1969t0
    public void X(C1938d0 nativeViewHierarchyOptimizer) {
        Intrinsics.checkNotNullParameter(nativeViewHierarchyOptimizer, "nativeViewHierarchyOptimizer");
        if (this.f30118D) {
            this.f30118D = false;
            y1();
        }
    }

    @Override // com.facebook.react.uimanager.V
    @Z4.b(names = {"margin", "marginVertical", "marginHorizontal", "marginStart", "marginEnd", "marginTop", "marginBottom", "marginLeft", "marginRight"})
    public void setMargins(int i10, Dynamic margin) {
        Intrinsics.checkNotNullParameter(margin, "margin");
        this.f30117C[m1.f22463c[i10]] = margin.getType() == ReadableType.Number ? (float) margin.asDouble() : Float.NaN;
        super.setMargins(i10, margin);
        this.f30118D = true;
    }

    @Override // com.facebook.react.uimanager.V
    @Z4.b(names = {"padding", "paddingVertical", "paddingHorizontal", "paddingStart", "paddingEnd", "paddingTop", "paddingBottom", "paddingLeft", "paddingRight"})
    public void setPaddings(int i10, Dynamic padding) {
        Intrinsics.checkNotNullParameter(padding, "padding");
        this.f30116B[m1.f22463c[i10]] = padding.getType() == ReadableType.Number ? (float) padding.asDouble() : Float.NaN;
        super.setPaddings(i10, padding);
        this.f30118D = true;
    }
}
