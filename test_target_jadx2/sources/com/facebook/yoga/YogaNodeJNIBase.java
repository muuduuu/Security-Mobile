package com.facebook.yoga;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class YogaNodeJNIBase extends r implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    private YogaNodeJNIBase f23093a;
    private float[] arr;

    /* renamed from: b, reason: collision with root package name */
    private List f23094b;

    /* renamed from: c, reason: collision with root package name */
    private o f23095c;

    /* renamed from: d, reason: collision with root package name */
    private b f23096d;

    /* renamed from: e, reason: collision with root package name */
    protected long f23097e;

    /* renamed from: f, reason: collision with root package name */
    private Object f23098f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f23099g;
    private int mLayoutDirection;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f23100a;

        static {
            int[] iArr = new int[j.values().length];
            f23100a = iArr;
            try {
                iArr[j.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23100a[j.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23100a[j.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23100a[j.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23100a[j.START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23100a[j.END.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private YogaNodeJNIBase(long j10) {
        this.arr = null;
        this.mLayoutDirection = 0;
        this.f23099g = true;
        if (j10 == 0) {
            throw new IllegalStateException("Failed to allocate native memory");
        }
        this.f23097e = j10;
    }

    private final long replaceChild(YogaNodeJNIBase yogaNodeJNIBase, int i10) {
        List list = this.f23094b;
        if (list == null) {
            throw new IllegalStateException("Cannot replace child. YogaNode does not have children");
        }
        list.remove(i10);
        this.f23094b.add(i10, yogaNodeJNIBase);
        yogaNodeJNIBase.f23093a = this;
        return yogaNodeJNIBase.f23097e;
    }

    private void t0(r rVar) {
        u0();
    }

    private static YogaValue w0(long j10) {
        return new YogaValue(Float.intBitsToFloat((int) j10), (int) (j10 >> 32));
    }

    @Override // com.facebook.yoga.r
    public void A(com.facebook.yoga.a aVar) {
        YogaNative.jni_YGNodeStyleSetAlignItemsJNI(this.f23097e, aVar.intValue());
    }

    @Override // com.facebook.yoga.r
    public void B(com.facebook.yoga.a aVar) {
        YogaNative.jni_YGNodeStyleSetAlignSelfJNI(this.f23097e, aVar.intValue());
    }

    @Override // com.facebook.yoga.r
    public void C(float f10) {
        YogaNative.jni_YGNodeStyleSetAspectRatioJNI(this.f23097e, f10);
    }

    @Override // com.facebook.yoga.r
    public void D(b bVar) {
        this.f23096d = bVar;
        YogaNative.jni_YGNodeSetHasBaselineFuncJNI(this.f23097e, bVar != null);
    }

    @Override // com.facebook.yoga.r
    public void E(j jVar, float f10) {
        YogaNative.jni_YGNodeStyleSetBorderJNI(this.f23097e, jVar.intValue(), f10);
    }

    @Override // com.facebook.yoga.r
    public void G(Object obj) {
        this.f23098f = obj;
    }

    @Override // com.facebook.yoga.r
    public void H(h hVar) {
        YogaNative.jni_YGNodeStyleSetDirectionJNI(this.f23097e, hVar.intValue());
    }

    @Override // com.facebook.yoga.r
    public void J(i iVar) {
        YogaNative.jni_YGNodeStyleSetDisplayJNI(this.f23097e, iVar.intValue());
    }

    @Override // com.facebook.yoga.r
    public void K(float f10) {
        YogaNative.jni_YGNodeStyleSetFlexJNI(this.f23097e, f10);
    }

    @Override // com.facebook.yoga.r
    public void L(float f10) {
        YogaNative.jni_YGNodeStyleSetFlexBasisJNI(this.f23097e, f10);
    }

    @Override // com.facebook.yoga.r
    public void M() {
        YogaNative.jni_YGNodeStyleSetFlexBasisAutoJNI(this.f23097e);
    }

    @Override // com.facebook.yoga.r
    public void N(float f10) {
        YogaNative.jni_YGNodeStyleSetFlexBasisPercentJNI(this.f23097e, f10);
    }

    @Override // com.facebook.yoga.r
    public void O(l lVar) {
        YogaNative.jni_YGNodeStyleSetFlexDirectionJNI(this.f23097e, lVar.intValue());
    }

    @Override // com.facebook.yoga.r
    public void P(float f10) {
        YogaNative.jni_YGNodeStyleSetFlexGrowJNI(this.f23097e, f10);
    }

    @Override // com.facebook.yoga.r
    public void Q(float f10) {
        YogaNative.jni_YGNodeStyleSetFlexShrinkJNI(this.f23097e, f10);
    }

    @Override // com.facebook.yoga.r
    public void R(m mVar, float f10) {
        YogaNative.jni_YGNodeStyleSetGapJNI(this.f23097e, mVar.intValue(), f10);
    }

    @Override // com.facebook.yoga.r
    public void S(m mVar, float f10) {
        YogaNative.jni_YGNodeStyleSetGapPercentJNI(this.f23097e, mVar.intValue(), f10);
    }

    @Override // com.facebook.yoga.r
    public void T(float f10) {
        YogaNative.jni_YGNodeStyleSetHeightJNI(this.f23097e, f10);
    }

    @Override // com.facebook.yoga.r
    public void U() {
        YogaNative.jni_YGNodeStyleSetHeightAutoJNI(this.f23097e);
    }

    @Override // com.facebook.yoga.r
    public void V(float f10) {
        YogaNative.jni_YGNodeStyleSetHeightPercentJNI(this.f23097e, f10);
    }

    @Override // com.facebook.yoga.r
    public void W(n nVar) {
        YogaNative.jni_YGNodeStyleSetJustifyContentJNI(this.f23097e, nVar.intValue());
    }

    @Override // com.facebook.yoga.r
    public void X(j jVar, float f10) {
        YogaNative.jni_YGNodeStyleSetMarginJNI(this.f23097e, jVar.intValue(), f10);
    }

    @Override // com.facebook.yoga.r
    public void Y(j jVar) {
        YogaNative.jni_YGNodeStyleSetMarginAutoJNI(this.f23097e, jVar.intValue());
    }

    @Override // com.facebook.yoga.r
    public void Z(j jVar, float f10) {
        YogaNative.jni_YGNodeStyleSetMarginPercentJNI(this.f23097e, jVar.intValue(), f10);
    }

    @Override // com.facebook.yoga.r
    public void a(r rVar, int i10) {
        if (rVar instanceof YogaNodeJNIBase) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) rVar;
            if (yogaNodeJNIBase.f23093a != null) {
                throw new IllegalStateException("Child already has a parent, it must be removed first.");
            }
            if (this.f23094b == null) {
                this.f23094b = new ArrayList(4);
            }
            this.f23094b.add(i10, yogaNodeJNIBase);
            yogaNodeJNIBase.f23093a = this;
            YogaNative.jni_YGNodeInsertChildJNI(this.f23097e, yogaNodeJNIBase.f23097e, i10);
        }
    }

    @Override // com.facebook.yoga.r
    public void a0(float f10) {
        YogaNative.jni_YGNodeStyleSetMaxHeightJNI(this.f23097e, f10);
    }

    @Override // com.facebook.yoga.r
    public void b(float f10, float f11) {
        t0(null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) arrayList.get(i10);
            List<YogaNodeJNIBase> list = yogaNodeJNIBase.f23094b;
            if (list != null) {
                for (YogaNodeJNIBase yogaNodeJNIBase2 : list) {
                    yogaNodeJNIBase2.t0(yogaNodeJNIBase);
                    arrayList.add(yogaNodeJNIBase2);
                }
            }
        }
        YogaNodeJNIBase[] yogaNodeJNIBaseArr = (YogaNodeJNIBase[]) arrayList.toArray(new YogaNodeJNIBase[arrayList.size()]);
        long[] jArr = new long[yogaNodeJNIBaseArr.length];
        for (int i11 = 0; i11 < yogaNodeJNIBaseArr.length; i11++) {
            jArr[i11] = yogaNodeJNIBaseArr[i11].f23097e;
        }
        YogaNative.jni_YGNodeCalculateLayoutJNI(this.f23097e, f10, f11, jArr, yogaNodeJNIBaseArr);
    }

    @Override // com.facebook.yoga.r
    public void b0(float f10) {
        YogaNative.jni_YGNodeStyleSetMaxHeightPercentJNI(this.f23097e, f10);
    }

    public final float baseline(float f10, float f11) {
        return this.f23096d.a(this, f10, f11);
    }

    @Override // com.facebook.yoga.r
    public void c0(float f10) {
        YogaNative.jni_YGNodeStyleSetMaxWidthJNI(this.f23097e, f10);
    }

    @Override // com.facebook.yoga.r
    public void d() {
        YogaNative.jni_YGNodeMarkDirtyJNI(this.f23097e);
    }

    @Override // com.facebook.yoga.r
    public void d0(float f10) {
        YogaNative.jni_YGNodeStyleSetMaxWidthPercentJNI(this.f23097e, f10);
    }

    @Override // com.facebook.yoga.r
    public void e0(o oVar) {
        this.f23095c = oVar;
        YogaNative.jni_YGNodeSetHasMeasureFuncJNI(this.f23097e, oVar != null);
    }

    @Override // com.facebook.yoga.r
    public void f0(float f10) {
        YogaNative.jni_YGNodeStyleSetMinHeightJNI(this.f23097e, f10);
    }

    @Override // com.facebook.yoga.r
    public void g0(float f10) {
        YogaNative.jni_YGNodeStyleSetMinHeightPercentJNI(this.f23097e, f10);
    }

    @Override // com.facebook.yoga.r
    public YogaValue h() {
        return w0(YogaNative.jni_YGNodeStyleGetHeightJNI(this.f23097e));
    }

    @Override // com.facebook.yoga.r
    public void h0(float f10) {
        YogaNative.jni_YGNodeStyleSetMinWidthJNI(this.f23097e, f10);
    }

    @Override // com.facebook.yoga.r
    public h i() {
        float[] fArr = this.arr;
        return h.fromInt(fArr != null ? (int) fArr[5] : this.mLayoutDirection);
    }

    @Override // com.facebook.yoga.r
    public void i0(float f10) {
        YogaNative.jni_YGNodeStyleSetMinWidthPercentJNI(this.f23097e, f10);
    }

    @Override // com.facebook.yoga.r
    public void j0(u uVar) {
        YogaNative.jni_YGNodeStyleSetOverflowJNI(this.f23097e, uVar.intValue());
    }

    @Override // com.facebook.yoga.r
    public float k() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[2];
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.r
    public void k0(j jVar, float f10) {
        YogaNative.jni_YGNodeStyleSetPaddingJNI(this.f23097e, jVar.intValue(), f10);
    }

    @Override // com.facebook.yoga.r
    public float l(j jVar) {
        float[] fArr = this.arr;
        if (fArr == null) {
            return 0.0f;
        }
        float f10 = fArr[0];
        if ((((int) f10) & 2) != 2) {
            return 0.0f;
        }
        int i10 = (((int) f10) & 1) != 1 ? 4 : 0;
        int i11 = 10 - i10;
        switch (a.f23100a[jVar.ordinal()]) {
            case 1:
                return this.arr[i11];
            case 2:
                return this.arr[11 - i10];
            case 3:
                return this.arr[12 - i10];
            case 4:
                return this.arr[13 - i10];
            case 5:
                return i() == h.RTL ? this.arr[12 - i10] : this.arr[i11];
            case 6:
                return i() == h.RTL ? this.arr[i11] : this.arr[12 - i10];
            default:
                throw new IllegalArgumentException("Cannot get layout paddings of multi-edge shorthands");
        }
    }

    @Override // com.facebook.yoga.r
    public void l0(j jVar, float f10) {
        YogaNative.jni_YGNodeStyleSetPaddingPercentJNI(this.f23097e, jVar.intValue(), f10);
    }

    @Override // com.facebook.yoga.r
    public float m() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[1];
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.r
    public void m0(j jVar, float f10) {
        YogaNative.jni_YGNodeStyleSetPositionJNI(this.f23097e, jVar.intValue(), f10);
    }

    public final long measure(float f10, int i10, float f11, int i11) {
        if (v()) {
            return this.f23095c.W(this, f10, p.fromInt(i10), f11, p.fromInt(i11));
        }
        throw new RuntimeException("Measure function isn't defined!");
    }

    @Override // com.facebook.yoga.r
    public float n() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[3];
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.r
    public void n0(j jVar, float f10) {
        YogaNative.jni_YGNodeStyleSetPositionPercentJNI(this.f23097e, jVar.intValue(), f10);
    }

    @Override // com.facebook.yoga.r
    public float o() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[4];
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.r
    public void o0(v vVar) {
        YogaNative.jni_YGNodeStyleSetPositionTypeJNI(this.f23097e, vVar.intValue());
    }

    @Override // com.facebook.yoga.r
    public YogaValue p() {
        return w0(YogaNative.jni_YGNodeStyleGetWidthJNI(this.f23097e));
    }

    @Override // com.facebook.yoga.r
    public void p0(float f10) {
        YogaNative.jni_YGNodeStyleSetWidthJNI(this.f23097e, f10);
    }

    @Override // com.facebook.yoga.r
    public boolean q() {
        float[] fArr = this.arr;
        return fArr != null ? (((int) fArr[0]) & 16) == 16 : this.f23099g;
    }

    @Override // com.facebook.yoga.r
    public void q0() {
        YogaNative.jni_YGNodeStyleSetWidthAutoJNI(this.f23097e);
    }

    @Override // com.facebook.yoga.r
    public void r0(float f10) {
        YogaNative.jni_YGNodeStyleSetWidthPercentJNI(this.f23097e, f10);
    }

    @Override // com.facebook.yoga.r
    public boolean s() {
        return YogaNative.jni_YGNodeIsDirtyJNI(this.f23097e);
    }

    @Override // com.facebook.yoga.r
    public void s0(x xVar) {
        YogaNative.jni_YGNodeStyleSetFlexWrapJNI(this.f23097e, xVar.intValue());
    }

    public Object u0() {
        return this.f23098f;
    }

    @Override // com.facebook.yoga.r
    public boolean v() {
        return this.f23095c != null;
    }

    @Override // com.facebook.yoga.r
    /* renamed from: v0, reason: merged with bridge method [inline-methods] */
    public YogaNodeJNIBase x(int i10) {
        List list = this.f23094b;
        if (list == null) {
            throw new IllegalStateException("Trying to remove a child of a YogaNode that does not have children");
        }
        YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) list.remove(i10);
        yogaNodeJNIBase.f23093a = null;
        YogaNative.jni_YGNodeRemoveChildJNI(this.f23097e, yogaNodeJNIBase.f23097e);
        return yogaNodeJNIBase;
    }

    @Override // com.facebook.yoga.r
    public void w() {
        float[] fArr = this.arr;
        if (fArr != null) {
            fArr[0] = ((int) fArr[0]) & (-17);
        }
        this.f23099g = false;
    }

    @Override // com.facebook.yoga.r
    public void y() {
        this.f23095c = null;
        this.f23096d = null;
        this.f23098f = null;
        this.arr = null;
        this.f23099g = true;
        this.mLayoutDirection = 0;
        YogaNative.jni_YGNodeResetJNI(this.f23097e);
    }

    @Override // com.facebook.yoga.r
    public void z(com.facebook.yoga.a aVar) {
        YogaNative.jni_YGNodeStyleSetAlignContentJNI(this.f23097e, aVar.intValue());
    }

    YogaNodeJNIBase() {
        this(YogaNative.jni_YGNodeNewJNI());
    }

    YogaNodeJNIBase(c cVar) {
        this(YogaNative.jni_YGNodeNewWithConfigJNI(((e) cVar).f23107a));
    }
}
