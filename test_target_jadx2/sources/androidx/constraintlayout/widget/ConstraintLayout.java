package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import co.hyperverge.hypersnapsdk.activities.HVRetakeActivity;
import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import l0.AbstractC3593e;
import o0.d;
import o0.e;
import o0.j;
import org.conscrypt.PSKKeyManager;
import p0.b;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    private static final boolean DEBUG = false;
    private static final boolean DEBUG_DRAW_CONSTRAINTS = false;
    public static final int DESIGN_INFO_ID = 0;
    private static final boolean MEASURE = false;
    private static final boolean OPTIMIZE_HEIGHT_CHANGE = false;
    private static final String TAG = "ConstraintLayout";
    private static final boolean USE_CONSTRAINTS_HELPER = true;
    public static final String VERSION = "ConstraintLayout-2.1.3";
    private static h sSharedValues;
    SparseArray<View> mChildrenByIds;
    private ArrayList<androidx.constraintlayout.widget.b> mConstraintHelpers;
    protected androidx.constraintlayout.widget.c mConstraintLayoutSpec;
    private d mConstraintSet;
    private int mConstraintSetId;
    private e mConstraintsChangedListener;
    private HashMap<String, Integer> mDesignIds;
    protected boolean mDirtyHierarchy;
    private int mLastMeasureHeight;
    int mLastMeasureHeightMode;
    int mLastMeasureHeightSize;
    private int mLastMeasureWidth;
    int mLastMeasureWidthMode;
    int mLastMeasureWidthSize;
    protected o0.f mLayoutWidget;
    private int mMaxHeight;
    private int mMaxWidth;
    c mMeasurer;
    private AbstractC3593e mMetrics;
    private int mMinHeight;
    private int mMinWidth;
    private int mOnMeasureHeightMeasureSpec;
    private int mOnMeasureWidthMeasureSpec;
    private int mOptimizationLevel;
    private SparseArray<o0.e> mTempMapIdToWidget;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f14961a;

        static {
            int[] iArr = new int[e.b.values().length];
            f14961a = iArr;
            try {
                iArr[e.b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14961a[e.b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14961a[e.b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14961a[e.b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    class c implements b.InterfaceC0588b {

        /* renamed from: a, reason: collision with root package name */
        ConstraintLayout f15038a;

        /* renamed from: b, reason: collision with root package name */
        int f15039b;

        /* renamed from: c, reason: collision with root package name */
        int f15040c;

        /* renamed from: d, reason: collision with root package name */
        int f15041d;

        /* renamed from: e, reason: collision with root package name */
        int f15042e;

        /* renamed from: f, reason: collision with root package name */
        int f15043f;

        /* renamed from: g, reason: collision with root package name */
        int f15044g;

        public c(ConstraintLayout constraintLayout) {
            this.f15038a = constraintLayout;
        }

        private boolean d(int i10, int i11, int i12) {
            if (i10 == i11) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i10);
            View.MeasureSpec.getSize(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i12 == size;
            }
            return false;
        }

        @Override // p0.b.InterfaceC0588b
        public final void a() {
            int childCount = this.f15038a.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.f15038a.getChildAt(i10);
            }
            int size = this.f15038a.mConstraintHelpers.size();
            if (size > 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    ((androidx.constraintlayout.widget.b) this.f15038a.mConstraintHelpers.get(i11)).l(this.f15038a);
                }
            }
        }

        @Override // p0.b.InterfaceC0588b
        public final void b(o0.e eVar, b.a aVar) {
            int makeMeasureSpec;
            int makeMeasureSpec2;
            int baseline;
            int max;
            int i10;
            int i11;
            int i12;
            if (eVar == null) {
                return;
            }
            if (eVar.T() == 8 && !eVar.h0()) {
                aVar.f38218e = 0;
                aVar.f38219f = 0;
                aVar.f38220g = 0;
                return;
            }
            if (eVar.I() == null) {
                return;
            }
            e.b bVar = aVar.f38214a;
            e.b bVar2 = aVar.f38215b;
            int i13 = aVar.f38216c;
            int i14 = aVar.f38217d;
            int i15 = this.f15039b + this.f15040c;
            int i16 = this.f15041d;
            View view = (View) eVar.q();
            int[] iArr = a.f14961a;
            int i17 = iArr[bVar.ordinal()];
            if (i17 == 1) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
            } else if (i17 == 2) {
                makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f15043f, i16, -2);
            } else if (i17 == 3) {
                makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f15043f, i16 + eVar.z(), -1);
            } else if (i17 != 4) {
                makeMeasureSpec = 0;
            } else {
                makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f15043f, i16, -2);
                boolean z10 = eVar.f37752w == 1;
                int i18 = aVar.f38223j;
                if (i18 == b.a.f38212l || i18 == b.a.f38213m) {
                    boolean z11 = view.getMeasuredHeight() == eVar.v();
                    if (aVar.f38223j == b.a.f38213m || !z10 || ((z10 && z11) || eVar.l0())) {
                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(eVar.U(), 1073741824);
                    }
                }
            }
            int i19 = iArr[bVar2.ordinal()];
            if (i19 == 1) {
                makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
            } else if (i19 == 2) {
                makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f15044g, i15, -2);
            } else if (i19 == 3) {
                makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f15044g, i15 + eVar.S(), -1);
            } else if (i19 != 4) {
                makeMeasureSpec2 = 0;
            } else {
                makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f15044g, i15, -2);
                boolean z12 = eVar.f37754x == 1;
                int i20 = aVar.f38223j;
                if (i20 == b.a.f38212l || i20 == b.a.f38213m) {
                    boolean z13 = view.getMeasuredWidth() == eVar.U();
                    if (aVar.f38223j == b.a.f38213m || !z12 || ((z12 && z13) || eVar.m0())) {
                        makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(eVar.v(), 1073741824);
                    }
                }
            }
            o0.f fVar = (o0.f) eVar.I();
            if (fVar != null && j.b(ConstraintLayout.this.mOptimizationLevel, PSKKeyManager.MAX_KEY_LENGTH_BYTES) && view.getMeasuredWidth() == eVar.U() && view.getMeasuredWidth() < fVar.U() && view.getMeasuredHeight() == eVar.v() && view.getMeasuredHeight() < fVar.v() && view.getBaseline() == eVar.n() && !eVar.k0() && d(eVar.A(), makeMeasureSpec, eVar.U()) && d(eVar.B(), makeMeasureSpec2, eVar.v())) {
                aVar.f38218e = eVar.U();
                aVar.f38219f = eVar.v();
                aVar.f38220g = eVar.n();
                return;
            }
            e.b bVar3 = e.b.MATCH_CONSTRAINT;
            boolean z14 = bVar == bVar3;
            boolean z15 = bVar2 == bVar3;
            e.b bVar4 = e.b.MATCH_PARENT;
            boolean z16 = bVar2 == bVar4 || bVar2 == e.b.FIXED;
            boolean z17 = bVar == bVar4 || bVar == e.b.FIXED;
            boolean z18 = z14 && eVar.f37715d0 > 0.0f;
            boolean z19 = z15 && eVar.f37715d0 > 0.0f;
            if (view == null) {
                return;
            }
            b bVar5 = (b) view.getLayoutParams();
            int i21 = aVar.f38223j;
            if (i21 != b.a.f38212l && i21 != b.a.f38213m && z14 && eVar.f37752w == 0 && z15 && eVar.f37754x == 0) {
                i12 = -1;
                i11 = 0;
                baseline = 0;
                max = 0;
            } else {
                view.measure(makeMeasureSpec, makeMeasureSpec2);
                eVar.R0(makeMeasureSpec, makeMeasureSpec2);
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                baseline = view.getBaseline();
                int i22 = eVar.f37758z;
                max = i22 > 0 ? Math.max(i22, measuredWidth) : measuredWidth;
                int i23 = eVar.f37673A;
                if (i23 > 0) {
                    max = Math.min(i23, max);
                }
                int i24 = eVar.f37677C;
                if (i24 > 0) {
                    i11 = Math.max(i24, measuredHeight);
                    i10 = makeMeasureSpec;
                } else {
                    i10 = makeMeasureSpec;
                    i11 = measuredHeight;
                }
                int i25 = eVar.f37679D;
                if (i25 > 0) {
                    i11 = Math.min(i25, i11);
                }
                if (!j.b(ConstraintLayout.this.mOptimizationLevel, 1)) {
                    if (z18 && z16) {
                        max = (int) ((i11 * eVar.f37715d0) + 0.5f);
                    } else if (z19 && z17) {
                        i11 = (int) ((max / eVar.f37715d0) + 0.5f);
                    }
                }
                if (measuredWidth != max || measuredHeight != i11) {
                    int makeMeasureSpec3 = measuredWidth != max ? View.MeasureSpec.makeMeasureSpec(max, 1073741824) : i10;
                    if (measuredHeight != i11) {
                        makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
                    }
                    view.measure(makeMeasureSpec3, makeMeasureSpec2);
                    eVar.R0(makeMeasureSpec3, makeMeasureSpec2);
                    max = view.getMeasuredWidth();
                    i11 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                }
                i12 = -1;
            }
            boolean z20 = baseline != i12;
            aVar.f38222i = (max == aVar.f38216c && i11 == aVar.f38217d) ? false : true;
            if (bVar5.f15001g0) {
                z20 = true;
            }
            if (z20 && baseline != -1 && eVar.n() != baseline) {
                aVar.f38222i = true;
            }
            aVar.f38218e = max;
            aVar.f38219f = i11;
            aVar.f38221h = z20;
            aVar.f38220g = baseline;
        }

        public void c(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f15039b = i12;
            this.f15040c = i13;
            this.f15041d = i14;
            this.f15042e = i15;
            this.f15043f = i10;
            this.f15044g = i11;
        }
    }

    public ConstraintLayout(Context context) {
        super(context);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new o0.f();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new c(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        c(null, 0, 0);
    }

    private final o0.e b(int i10) {
        if (i10 == 0) {
            return this.mLayoutWidget;
        }
        View view = this.mChildrenByIds.get(i10);
        if (view == null && (view = findViewById(i10)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        return ((b) view.getLayoutParams()).f15031v0;
    }

    private void c(AttributeSet attributeSet, int i10, int i11) {
        this.mLayoutWidget.y0(this);
        this.mLayoutWidget.R1(this.mMeasurer);
        this.mChildrenByIds.put(getId(), this);
        this.mConstraintSet = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, g.f15540n1, i10, i11);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i12 = 0; i12 < indexCount; i12++) {
                int index = obtainStyledAttributes.getIndex(i12);
                if (index == g.f15572r1) {
                    this.mMinWidth = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMinWidth);
                } else if (index == g.f15580s1) {
                    this.mMinHeight = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMinHeight);
                } else if (index == g.f15556p1) {
                    this.mMaxWidth = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxWidth);
                } else if (index == g.f15564q1) {
                    this.mMaxHeight = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxHeight);
                } else if (index == g.f15256F2) {
                    this.mOptimizationLevel = obtainStyledAttributes.getInt(index, this.mOptimizationLevel);
                } else if (index == g.f15215A1) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            parseLayoutDescription(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.mConstraintLayoutSpec = null;
                        }
                    }
                } else if (index == g.f15612w1) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        d dVar = new d();
                        this.mConstraintSet = dVar;
                        dVar.n(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.mConstraintSet = null;
                    }
                    this.mConstraintSetId = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.mLayoutWidget.S1(this.mOptimizationLevel);
    }

    private void e() {
        this.mDirtyHierarchy = true;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
    }

    private void f() {
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            o0.e viewWidget = getViewWidget(getChildAt(i10));
            if (viewWidget != null) {
                viewWidget.r0();
            }
        }
        if (isInEditMode) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    setDesignInformation(0, resourceName, Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    b(childAt.getId()).z0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.mConstraintSetId != -1) {
            for (int i12 = 0; i12 < childCount; i12++) {
                getChildAt(i12).getId();
            }
        }
        d dVar = this.mConstraintSet;
        if (dVar != null) {
            dVar.d(this, true);
        }
        this.mLayoutWidget.q1();
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i13 = 0; i13 < size; i13++) {
                this.mConstraintHelpers.get(i13).n(this);
            }
        }
        for (int i14 = 0; i14 < childCount; i14++) {
            getChildAt(i14);
        }
        this.mTempMapIdToWidget.clear();
        this.mTempMapIdToWidget.put(0, this.mLayoutWidget);
        this.mTempMapIdToWidget.put(getId(), this.mLayoutWidget);
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt2 = getChildAt(i15);
            this.mTempMapIdToWidget.put(childAt2.getId(), getViewWidget(childAt2));
        }
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt3 = getChildAt(i16);
            o0.e viewWidget2 = getViewWidget(childAt3);
            if (viewWidget2 != null) {
                b bVar = (b) childAt3.getLayoutParams();
                this.mLayoutWidget.b(viewWidget2);
                applyConstraintsFromLayoutParams(isInEditMode, childAt3, viewWidget2, bVar, this.mTempMapIdToWidget);
            }
        }
    }

    private void g(o0.e eVar, b bVar, SparseArray sparseArray, int i10, d.b bVar2) {
        View view = this.mChildrenByIds.get(i10);
        o0.e eVar2 = (o0.e) sparseArray.get(i10);
        if (eVar2 == null || view == null || !(view.getLayoutParams() instanceof b)) {
            return;
        }
        bVar.f15001g0 = true;
        d.b bVar3 = d.b.BASELINE;
        if (bVar2 == bVar3) {
            b bVar4 = (b) view.getLayoutParams();
            bVar4.f15001g0 = true;
            bVar4.f15031v0.H0(true);
        }
        eVar.m(bVar3).a(eVar2.m(bVar2), bVar.f14965D, bVar.f14964C, true);
        eVar.H0(true);
        eVar.m(d.b.TOP).p();
        eVar.m(d.b.BOTTOM).p();
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int max2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        return max2 > 0 ? max2 : max;
    }

    public static h getSharedValues() {
        if (sSharedValues == null) {
            sSharedValues = new h();
        }
        return sSharedValues;
    }

    private boolean h() {
        int childCount = getChildCount();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            }
            if (getChildAt(i10).isLayoutRequested()) {
                z10 = true;
                break;
            }
            i10++;
        }
        if (z10) {
            f();
        }
        return z10;
    }

    protected void applyConstraintsFromLayoutParams(boolean z10, View view, o0.e eVar, b bVar, SparseArray<o0.e> sparseArray) {
        o0.e eVar2;
        o0.e eVar3;
        o0.e eVar4;
        o0.e eVar5;
        int i10;
        bVar.a();
        bVar.f15033w0 = false;
        eVar.f1(view.getVisibility());
        if (bVar.f15007j0) {
            eVar.Q0(true);
            eVar.f1(8);
        }
        eVar.y0(view);
        if (view instanceof androidx.constraintlayout.widget.b) {
            ((androidx.constraintlayout.widget.b) view).j(eVar, this.mLayoutWidget.L1());
        }
        if (bVar.f15003h0) {
            o0.g gVar = (o0.g) eVar;
            int i11 = bVar.f15025s0;
            int i12 = bVar.f15027t0;
            float f10 = bVar.f15029u0;
            if (f10 != -1.0f) {
                gVar.v1(f10);
                return;
            } else if (i11 != -1) {
                gVar.t1(i11);
                return;
            } else {
                if (i12 != -1) {
                    gVar.u1(i12);
                    return;
                }
                return;
            }
        }
        int i13 = bVar.f15011l0;
        int i14 = bVar.f15013m0;
        int i15 = bVar.f15015n0;
        int i16 = bVar.f15017o0;
        int i17 = bVar.f15019p0;
        int i18 = bVar.f15021q0;
        float f11 = bVar.f15023r0;
        int i19 = bVar.f15018p;
        if (i19 != -1) {
            o0.e eVar6 = sparseArray.get(i19);
            if (eVar6 != null) {
                eVar.j(eVar6, bVar.f15022r, bVar.f15020q);
            }
        } else {
            if (i13 != -1) {
                o0.e eVar7 = sparseArray.get(i13);
                if (eVar7 != null) {
                    d.b bVar2 = d.b.LEFT;
                    eVar.c0(bVar2, eVar7, bVar2, ((ViewGroup.MarginLayoutParams) bVar).leftMargin, i17);
                }
            } else if (i14 != -1 && (eVar2 = sparseArray.get(i14)) != null) {
                eVar.c0(d.b.LEFT, eVar2, d.b.RIGHT, ((ViewGroup.MarginLayoutParams) bVar).leftMargin, i17);
            }
            if (i15 != -1) {
                o0.e eVar8 = sparseArray.get(i15);
                if (eVar8 != null) {
                    eVar.c0(d.b.RIGHT, eVar8, d.b.LEFT, ((ViewGroup.MarginLayoutParams) bVar).rightMargin, i18);
                }
            } else if (i16 != -1 && (eVar3 = sparseArray.get(i16)) != null) {
                d.b bVar3 = d.b.RIGHT;
                eVar.c0(bVar3, eVar3, bVar3, ((ViewGroup.MarginLayoutParams) bVar).rightMargin, i18);
            }
            int i20 = bVar.f15004i;
            if (i20 != -1) {
                o0.e eVar9 = sparseArray.get(i20);
                if (eVar9 != null) {
                    d.b bVar4 = d.b.TOP;
                    eVar.c0(bVar4, eVar9, bVar4, ((ViewGroup.MarginLayoutParams) bVar).topMargin, bVar.f15034x);
                }
            } else {
                int i21 = bVar.f15006j;
                if (i21 != -1 && (eVar4 = sparseArray.get(i21)) != null) {
                    eVar.c0(d.b.TOP, eVar4, d.b.BOTTOM, ((ViewGroup.MarginLayoutParams) bVar).topMargin, bVar.f15034x);
                }
            }
            int i22 = bVar.f15008k;
            if (i22 != -1) {
                o0.e eVar10 = sparseArray.get(i22);
                if (eVar10 != null) {
                    eVar.c0(d.b.BOTTOM, eVar10, d.b.TOP, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin, bVar.f15036z);
                }
            } else {
                int i23 = bVar.f15010l;
                if (i23 != -1 && (eVar5 = sparseArray.get(i23)) != null) {
                    d.b bVar5 = d.b.BOTTOM;
                    eVar.c0(bVar5, eVar5, bVar5, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin, bVar.f15036z);
                }
            }
            int i24 = bVar.f15012m;
            if (i24 != -1) {
                g(eVar, bVar, sparseArray, i24, d.b.BASELINE);
            } else {
                int i25 = bVar.f15014n;
                if (i25 != -1) {
                    g(eVar, bVar, sparseArray, i25, d.b.TOP);
                } else {
                    int i26 = bVar.f15016o;
                    if (i26 != -1) {
                        g(eVar, bVar, sparseArray, i26, d.b.BOTTOM);
                    }
                }
            }
            if (f11 >= 0.0f) {
                eVar.J0(f11);
            }
            float f12 = bVar.f14969H;
            if (f12 >= 0.0f) {
                eVar.Z0(f12);
            }
        }
        if (z10 && ((i10 = bVar.f14985X) != -1 || bVar.f14986Y != -1)) {
            eVar.X0(i10, bVar.f14986Y);
        }
        if (bVar.f14997e0) {
            eVar.M0(e.b.FIXED);
            eVar.g1(((ViewGroup.MarginLayoutParams) bVar).width);
            if (((ViewGroup.MarginLayoutParams) bVar).width == -2) {
                eVar.M0(e.b.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) bVar).width == -1) {
            if (bVar.f14989a0) {
                eVar.M0(e.b.MATCH_CONSTRAINT);
            } else {
                eVar.M0(e.b.MATCH_PARENT);
            }
            eVar.m(d.b.LEFT).f37668g = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            eVar.m(d.b.RIGHT).f37668g = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        } else {
            eVar.M0(e.b.MATCH_CONSTRAINT);
            eVar.g1(0);
        }
        if (bVar.f14999f0) {
            eVar.c1(e.b.FIXED);
            eVar.I0(((ViewGroup.MarginLayoutParams) bVar).height);
            if (((ViewGroup.MarginLayoutParams) bVar).height == -2) {
                eVar.c1(e.b.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) bVar).height == -1) {
            if (bVar.f14991b0) {
                eVar.c1(e.b.MATCH_CONSTRAINT);
            } else {
                eVar.c1(e.b.MATCH_PARENT);
            }
            eVar.m(d.b.TOP).f37668g = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            eVar.m(d.b.BOTTOM).f37668g = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        } else {
            eVar.c1(e.b.MATCH_CONSTRAINT);
            eVar.I0(0);
        }
        eVar.A0(bVar.f14970I);
        eVar.O0(bVar.f14973L);
        eVar.e1(bVar.f14974M);
        eVar.K0(bVar.f14975N);
        eVar.a1(bVar.f14976O);
        eVar.h1(bVar.f14995d0);
        eVar.N0(bVar.f14977P, bVar.f14979R, bVar.f14981T, bVar.f14983V);
        eVar.d1(bVar.f14978Q, bVar.f14980S, bVar.f14982U, bVar.f14984W);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<androidx.constraintlayout.widget.b> arrayList = this.mConstraintHelpers;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                this.mConstraintHelpers.get(i10).m(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i12 = (int) ((parseInt / 1080.0f) * width);
                        int i13 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f10 = i12;
                        float f11 = i13;
                        float f12 = i12 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f10, f11, f12, f11, paint);
                        float parseInt4 = i13 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f12, f11, f12, parseInt4, paint);
                        canvas.drawLine(f12, parseInt4, f10, parseInt4, paint);
                        canvas.drawLine(f10, parseInt4, f10, f11, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f10, f11, f12, parseInt4, paint);
                        canvas.drawLine(f10, parseInt4, f12, f11, paint);
                    }
                }
            }
        }
    }

    public void fillMetrics(AbstractC3593e abstractC3593e) {
        this.mLayoutWidget.E1(abstractC3593e);
    }

    @Override // android.view.View
    public void forceLayout() {
        e();
        super.forceLayout();
    }

    public Object getDesignInformation(int i10, Object obj) {
        if (i10 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> hashMap = this.mDesignIds;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.mDesignIds.get(str);
    }

    public int getMaxHeight() {
        return this.mMaxHeight;
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public int getOptimizationLevel() {
        return this.mLayoutWidget.G1();
    }

    public String getSceneString() {
        int id2;
        StringBuilder sb2 = new StringBuilder();
        if (this.mLayoutWidget.f37736o == null) {
            int id3 = getId();
            if (id3 != -1) {
                this.mLayoutWidget.f37736o = getContext().getResources().getResourceEntryName(id3);
            } else {
                this.mLayoutWidget.f37736o = "parent";
            }
        }
        if (this.mLayoutWidget.r() == null) {
            o0.f fVar = this.mLayoutWidget;
            fVar.z0(fVar.f37736o);
            Log.v(TAG, " setDebugName " + this.mLayoutWidget.r());
        }
        Iterator it = this.mLayoutWidget.n1().iterator();
        while (it.hasNext()) {
            o0.e eVar = (o0.e) it.next();
            View view = (View) eVar.q();
            if (view != null) {
                if (eVar.f37736o == null && (id2 = view.getId()) != -1) {
                    eVar.f37736o = getContext().getResources().getResourceEntryName(id2);
                }
                if (eVar.r() == null) {
                    eVar.z0(eVar.f37736o);
                    Log.v(TAG, " setDebugName " + eVar.r());
                }
            }
        }
        this.mLayoutWidget.M(sb2);
        return sb2.toString();
    }

    public View getViewById(int i10) {
        return this.mChildrenByIds.get(i10);
    }

    public final o0.e getViewWidget(View view) {
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof b) {
            return ((b) view.getLayoutParams()).f15031v0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof b) {
            return ((b) view.getLayoutParams()).f15031v0;
        }
        return null;
    }

    protected boolean isRtl() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    public void loadLayoutDescription(int i10) {
        if (i10 == 0) {
            this.mConstraintLayoutSpec = null;
            return;
        }
        try {
            this.mConstraintLayoutSpec = new androidx.constraintlayout.widget.c(getContext(), this, i10);
        } catch (Resources.NotFoundException unused) {
            this.mConstraintLayoutSpec = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            b bVar = (b) childAt.getLayoutParams();
            o0.e eVar = bVar.f15031v0;
            if ((childAt.getVisibility() != 8 || bVar.f15003h0 || bVar.f15005i0 || bVar.f15009k0 || isInEditMode) && !bVar.f15007j0) {
                int V10 = eVar.V();
                int W10 = eVar.W();
                childAt.layout(V10, W10, eVar.U() + V10, eVar.v() + W10);
            }
        }
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i15 = 0; i15 < size; i15++) {
                this.mConstraintHelpers.get(i15).k(this);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (this.mOnMeasureWidthMeasureSpec == i10) {
            int i12 = this.mOnMeasureHeightMeasureSpec;
        }
        if (!this.mDirtyHierarchy) {
            int childCount = getChildCount();
            int i13 = 0;
            while (true) {
                if (i13 >= childCount) {
                    break;
                }
                if (getChildAt(i13).isLayoutRequested()) {
                    this.mDirtyHierarchy = true;
                    break;
                }
                i13++;
            }
        }
        this.mOnMeasureWidthMeasureSpec = i10;
        this.mOnMeasureHeightMeasureSpec = i11;
        this.mLayoutWidget.U1(isRtl());
        if (this.mDirtyHierarchy) {
            this.mDirtyHierarchy = false;
            if (h()) {
                this.mLayoutWidget.W1();
            }
        }
        resolveSystem(this.mLayoutWidget, this.mOptimizationLevel, i10, i11);
        resolveMeasuredDimension(i10, i11, this.mLayoutWidget.U(), this.mLayoutWidget.v(), this.mLayoutWidget.M1(), this.mLayoutWidget.K1());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        o0.e viewWidget = getViewWidget(view);
        if ((view instanceof Guideline) && !(viewWidget instanceof o0.g)) {
            b bVar = (b) view.getLayoutParams();
            o0.g gVar = new o0.g();
            bVar.f15031v0 = gVar;
            bVar.f15003h0 = true;
            gVar.w1(bVar.f14987Z);
        }
        if (view instanceof androidx.constraintlayout.widget.b) {
            androidx.constraintlayout.widget.b bVar2 = (androidx.constraintlayout.widget.b) view;
            bVar2.o();
            ((b) view.getLayoutParams()).f15005i0 = true;
            if (!this.mConstraintHelpers.contains(bVar2)) {
                this.mConstraintHelpers.add(bVar2);
            }
        }
        this.mChildrenByIds.put(view.getId(), view);
        this.mDirtyHierarchy = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.mChildrenByIds.remove(view.getId());
        this.mLayoutWidget.p1(getViewWidget(view));
        this.mConstraintHelpers.remove(view);
        this.mDirtyHierarchy = true;
    }

    protected void parseLayoutDescription(int i10) {
        this.mConstraintLayoutSpec = new androidx.constraintlayout.widget.c(getContext(), this, i10);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        e();
        super.requestLayout();
    }

    protected void resolveMeasuredDimension(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
        c cVar = this.mMeasurer;
        int i14 = cVar.f15042e;
        int resolveSizeAndState = View.resolveSizeAndState(i12 + cVar.f15041d, i10, 0);
        int resolveSizeAndState2 = View.resolveSizeAndState(i13 + i14, i11, 0) & 16777215;
        int min = Math.min(this.mMaxWidth, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.mMaxHeight, resolveSizeAndState2);
        if (z10) {
            min |= 16777216;
        }
        if (z11) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
        this.mLastMeasureWidth = min;
        this.mLastMeasureHeight = min2;
    }

    protected void resolveSystem(o0.f fVar, int i10, int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        int max = Math.max(0, getPaddingTop());
        int max2 = Math.max(0, getPaddingBottom());
        int i13 = max + max2;
        int paddingWidth = getPaddingWidth();
        this.mMeasurer.c(i11, i12, max, max2, paddingWidth, i13);
        int max3 = Math.max(0, getPaddingStart());
        int max4 = Math.max(0, getPaddingEnd());
        int max5 = (max3 > 0 || max4 > 0) ? isRtl() ? max4 : max3 : Math.max(0, getPaddingLeft());
        int i14 = size - paddingWidth;
        int i15 = size2 - i13;
        setSelfDimensionBehaviour(fVar, mode, i14, mode2, i15);
        fVar.N1(i10, mode, i14, mode2, i15, this.mLastMeasureWidth, this.mLastMeasureHeight, max5, max);
    }

    public void setConstraintSet(d dVar) {
        this.mConstraintSet = dVar;
    }

    public void setDesignInformation(int i10, Object obj, Object obj2) {
        if (i10 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.mDesignIds == null) {
                this.mDesignIds = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            Integer num = (Integer) obj2;
            num.intValue();
            this.mDesignIds.put(str, num);
        }
    }

    @Override // android.view.View
    public void setId(int i10) {
        this.mChildrenByIds.remove(getId());
        super.setId(i10);
        this.mChildrenByIds.put(getId(), this);
    }

    public void setMaxHeight(int i10) {
        if (i10 == this.mMaxHeight) {
            return;
        }
        this.mMaxHeight = i10;
        requestLayout();
    }

    public void setMaxWidth(int i10) {
        if (i10 == this.mMaxWidth) {
            return;
        }
        this.mMaxWidth = i10;
        requestLayout();
    }

    public void setMinHeight(int i10) {
        if (i10 == this.mMinHeight) {
            return;
        }
        this.mMinHeight = i10;
        requestLayout();
    }

    public void setMinWidth(int i10) {
        if (i10 == this.mMinWidth) {
            return;
        }
        this.mMinWidth = i10;
        requestLayout();
    }

    public void setOnConstraintsChanged(e eVar) {
        androidx.constraintlayout.widget.c cVar = this.mConstraintLayoutSpec;
        if (cVar != null) {
            cVar.c(eVar);
        }
    }

    public void setOptimizationLevel(int i10) {
        this.mOptimizationLevel = i10;
        this.mLayoutWidget.S1(i10);
    }

    protected void setSelfDimensionBehaviour(o0.f fVar, int i10, int i11, int i12, int i13) {
        e.b bVar;
        c cVar = this.mMeasurer;
        int i14 = cVar.f15042e;
        int i15 = cVar.f15041d;
        e.b bVar2 = e.b.FIXED;
        int childCount = getChildCount();
        if (i10 == Integer.MIN_VALUE) {
            bVar = e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i11 = Math.max(0, this.mMinWidth);
            }
        } else if (i10 == 0) {
            bVar = e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i11 = Math.max(0, this.mMinWidth);
            }
            i11 = 0;
        } else if (i10 != 1073741824) {
            bVar = bVar2;
            i11 = 0;
        } else {
            i11 = Math.min(this.mMaxWidth - i15, i11);
            bVar = bVar2;
        }
        if (i12 == Integer.MIN_VALUE) {
            bVar2 = e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i13 = Math.max(0, this.mMinHeight);
            }
        } else if (i12 != 0) {
            if (i12 == 1073741824) {
                i13 = Math.min(this.mMaxHeight - i14, i13);
            }
            i13 = 0;
        } else {
            bVar2 = e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i13 = Math.max(0, this.mMinHeight);
            }
            i13 = 0;
        }
        if (i11 != fVar.U() || i13 != fVar.v()) {
            fVar.J1();
        }
        fVar.i1(0);
        fVar.j1(0);
        fVar.T0(this.mMaxWidth - i15);
        fVar.S0(this.mMaxHeight - i14);
        fVar.W0(0);
        fVar.V0(0);
        fVar.M0(bVar);
        fVar.g1(i11);
        fVar.c1(bVar2);
        fVar.I0(i13);
        fVar.W0(this.mMinWidth - i15);
        fVar.V0(this.mMinHeight - i14);
    }

    public void setState(int i10, int i11, int i12) {
        androidx.constraintlayout.widget.c cVar = this.mConstraintLayoutSpec;
        if (cVar != null) {
            cVar.d(i10, i11, i12);
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public b generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    @Override // android.view.ViewGroup
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new o0.f();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new c(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        c(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new o0.f();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new c(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        c(attributeSet, i10, 0);
    }

    public static class b extends ViewGroup.MarginLayoutParams {

        /* renamed from: A, reason: collision with root package name */
        public int f14962A;

        /* renamed from: B, reason: collision with root package name */
        public int f14963B;

        /* renamed from: C, reason: collision with root package name */
        public int f14964C;

        /* renamed from: D, reason: collision with root package name */
        public int f14965D;

        /* renamed from: E, reason: collision with root package name */
        boolean f14966E;

        /* renamed from: F, reason: collision with root package name */
        boolean f14967F;

        /* renamed from: G, reason: collision with root package name */
        public float f14968G;

        /* renamed from: H, reason: collision with root package name */
        public float f14969H;

        /* renamed from: I, reason: collision with root package name */
        public String f14970I;

        /* renamed from: J, reason: collision with root package name */
        float f14971J;

        /* renamed from: K, reason: collision with root package name */
        int f14972K;

        /* renamed from: L, reason: collision with root package name */
        public float f14973L;

        /* renamed from: M, reason: collision with root package name */
        public float f14974M;

        /* renamed from: N, reason: collision with root package name */
        public int f14975N;

        /* renamed from: O, reason: collision with root package name */
        public int f14976O;

        /* renamed from: P, reason: collision with root package name */
        public int f14977P;

        /* renamed from: Q, reason: collision with root package name */
        public int f14978Q;

        /* renamed from: R, reason: collision with root package name */
        public int f14979R;

        /* renamed from: S, reason: collision with root package name */
        public int f14980S;

        /* renamed from: T, reason: collision with root package name */
        public int f14981T;

        /* renamed from: U, reason: collision with root package name */
        public int f14982U;

        /* renamed from: V, reason: collision with root package name */
        public float f14983V;

        /* renamed from: W, reason: collision with root package name */
        public float f14984W;

        /* renamed from: X, reason: collision with root package name */
        public int f14985X;

        /* renamed from: Y, reason: collision with root package name */
        public int f14986Y;

        /* renamed from: Z, reason: collision with root package name */
        public int f14987Z;

        /* renamed from: a, reason: collision with root package name */
        public int f14988a;

        /* renamed from: a0, reason: collision with root package name */
        public boolean f14989a0;

        /* renamed from: b, reason: collision with root package name */
        public int f14990b;

        /* renamed from: b0, reason: collision with root package name */
        public boolean f14991b0;

        /* renamed from: c, reason: collision with root package name */
        public float f14992c;

        /* renamed from: c0, reason: collision with root package name */
        public String f14993c0;

        /* renamed from: d, reason: collision with root package name */
        public boolean f14994d;

        /* renamed from: d0, reason: collision with root package name */
        public int f14995d0;

        /* renamed from: e, reason: collision with root package name */
        public int f14996e;

        /* renamed from: e0, reason: collision with root package name */
        boolean f14997e0;

        /* renamed from: f, reason: collision with root package name */
        public int f14998f;

        /* renamed from: f0, reason: collision with root package name */
        boolean f14999f0;

        /* renamed from: g, reason: collision with root package name */
        public int f15000g;

        /* renamed from: g0, reason: collision with root package name */
        boolean f15001g0;

        /* renamed from: h, reason: collision with root package name */
        public int f15002h;

        /* renamed from: h0, reason: collision with root package name */
        boolean f15003h0;

        /* renamed from: i, reason: collision with root package name */
        public int f15004i;

        /* renamed from: i0, reason: collision with root package name */
        boolean f15005i0;

        /* renamed from: j, reason: collision with root package name */
        public int f15006j;

        /* renamed from: j0, reason: collision with root package name */
        boolean f15007j0;

        /* renamed from: k, reason: collision with root package name */
        public int f15008k;

        /* renamed from: k0, reason: collision with root package name */
        boolean f15009k0;

        /* renamed from: l, reason: collision with root package name */
        public int f15010l;

        /* renamed from: l0, reason: collision with root package name */
        int f15011l0;

        /* renamed from: m, reason: collision with root package name */
        public int f15012m;

        /* renamed from: m0, reason: collision with root package name */
        int f15013m0;

        /* renamed from: n, reason: collision with root package name */
        public int f15014n;

        /* renamed from: n0, reason: collision with root package name */
        int f15015n0;

        /* renamed from: o, reason: collision with root package name */
        public int f15016o;

        /* renamed from: o0, reason: collision with root package name */
        int f15017o0;

        /* renamed from: p, reason: collision with root package name */
        public int f15018p;

        /* renamed from: p0, reason: collision with root package name */
        int f15019p0;

        /* renamed from: q, reason: collision with root package name */
        public int f15020q;

        /* renamed from: q0, reason: collision with root package name */
        int f15021q0;

        /* renamed from: r, reason: collision with root package name */
        public float f15022r;

        /* renamed from: r0, reason: collision with root package name */
        float f15023r0;

        /* renamed from: s, reason: collision with root package name */
        public int f15024s;

        /* renamed from: s0, reason: collision with root package name */
        int f15025s0;

        /* renamed from: t, reason: collision with root package name */
        public int f15026t;

        /* renamed from: t0, reason: collision with root package name */
        int f15027t0;

        /* renamed from: u, reason: collision with root package name */
        public int f15028u;

        /* renamed from: u0, reason: collision with root package name */
        float f15029u0;

        /* renamed from: v, reason: collision with root package name */
        public int f15030v;

        /* renamed from: v0, reason: collision with root package name */
        o0.e f15031v0;

        /* renamed from: w, reason: collision with root package name */
        public int f15032w;

        /* renamed from: w0, reason: collision with root package name */
        public boolean f15033w0;

        /* renamed from: x, reason: collision with root package name */
        public int f15034x;

        /* renamed from: y, reason: collision with root package name */
        public int f15035y;

        /* renamed from: z, reason: collision with root package name */
        public int f15036z;

        private static class a {

            /* renamed from: a, reason: collision with root package name */
            public static final SparseIntArray f15037a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f15037a = sparseIntArray;
                sparseIntArray.append(g.f15565q2, 64);
                sparseIntArray.append(g.f15367T1, 65);
                sparseIntArray.append(g.f15442c2, 8);
                sparseIntArray.append(g.f15451d2, 9);
                sparseIntArray.append(g.f15469f2, 10);
                sparseIntArray.append(g.f15478g2, 11);
                sparseIntArray.append(g.f15532m2, 12);
                sparseIntArray.append(g.f15523l2, 13);
                sparseIntArray.append(g.f15287J1, 14);
                sparseIntArray.append(g.f15279I1, 15);
                sparseIntArray.append(g.f15247E1, 16);
                sparseIntArray.append(g.f15263G1, 52);
                sparseIntArray.append(g.f15255F1, 53);
                sparseIntArray.append(g.f15295K1, 2);
                sparseIntArray.append(g.f15311M1, 3);
                sparseIntArray.append(g.f15303L1, 4);
                sparseIntArray.append(g.f15605v2, 49);
                sparseIntArray.append(g.f15613w2, 50);
                sparseIntArray.append(g.f15343Q1, 5);
                sparseIntArray.append(g.f15351R1, 6);
                sparseIntArray.append(g.f15359S1, 7);
                sparseIntArray.append(g.f15636z1, 67);
                sparseIntArray.append(g.f15548o1, 1);
                sparseIntArray.append(g.f15487h2, 17);
                sparseIntArray.append(g.f15496i2, 18);
                sparseIntArray.append(g.f15335P1, 19);
                sparseIntArray.append(g.f15327O1, 20);
                sparseIntArray.append(g.f15216A2, 21);
                sparseIntArray.append(g.f15240D2, 22);
                sparseIntArray.append(g.f15224B2, 23);
                sparseIntArray.append(g.f15629y2, 24);
                sparseIntArray.append(g.f15232C2, 25);
                sparseIntArray.append(g.f15637z2, 26);
                sparseIntArray.append(g.f15621x2, 55);
                sparseIntArray.append(g.f15248E2, 54);
                sparseIntArray.append(g.f15407Y1, 29);
                sparseIntArray.append(g.f15541n2, 30);
                sparseIntArray.append(g.f15319N1, 44);
                sparseIntArray.append(g.f15424a2, 45);
                sparseIntArray.append(g.f15557p2, 46);
                sparseIntArray.append(g.f15415Z1, 47);
                sparseIntArray.append(g.f15549o2, 48);
                sparseIntArray.append(g.f15231C1, 27);
                sparseIntArray.append(g.f15223B1, 28);
                sparseIntArray.append(g.f15573r2, 31);
                sparseIntArray.append(g.f15375U1, 32);
                sparseIntArray.append(g.f15589t2, 33);
                sparseIntArray.append(g.f15581s2, 34);
                sparseIntArray.append(g.f15597u2, 35);
                sparseIntArray.append(g.f15391W1, 36);
                sparseIntArray.append(g.f15383V1, 37);
                sparseIntArray.append(g.f15399X1, 38);
                sparseIntArray.append(g.f15433b2, 39);
                sparseIntArray.append(g.f15514k2, 40);
                sparseIntArray.append(g.f15460e2, 41);
                sparseIntArray.append(g.f15271H1, 42);
                sparseIntArray.append(g.f15239D1, 43);
                sparseIntArray.append(g.f15505j2, 51);
                sparseIntArray.append(g.f15264G2, 66);
            }
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f14988a = -1;
            this.f14990b = -1;
            this.f14992c = -1.0f;
            this.f14994d = true;
            this.f14996e = -1;
            this.f14998f = -1;
            this.f15000g = -1;
            this.f15002h = -1;
            this.f15004i = -1;
            this.f15006j = -1;
            this.f15008k = -1;
            this.f15010l = -1;
            this.f15012m = -1;
            this.f15014n = -1;
            this.f15016o = -1;
            this.f15018p = -1;
            this.f15020q = 0;
            this.f15022r = 0.0f;
            this.f15024s = -1;
            this.f15026t = -1;
            this.f15028u = -1;
            this.f15030v = -1;
            this.f15032w = Integer.MIN_VALUE;
            this.f15034x = Integer.MIN_VALUE;
            this.f15035y = Integer.MIN_VALUE;
            this.f15036z = Integer.MIN_VALUE;
            this.f14962A = Integer.MIN_VALUE;
            this.f14963B = Integer.MIN_VALUE;
            this.f14964C = Integer.MIN_VALUE;
            this.f14965D = 0;
            this.f14966E = true;
            this.f14967F = true;
            this.f14968G = 0.5f;
            this.f14969H = 0.5f;
            this.f14970I = null;
            this.f14971J = 0.0f;
            this.f14972K = 1;
            this.f14973L = -1.0f;
            this.f14974M = -1.0f;
            this.f14975N = 0;
            this.f14976O = 0;
            this.f14977P = 0;
            this.f14978Q = 0;
            this.f14979R = 0;
            this.f14980S = 0;
            this.f14981T = 0;
            this.f14982U = 0;
            this.f14983V = 1.0f;
            this.f14984W = 1.0f;
            this.f14985X = -1;
            this.f14986Y = -1;
            this.f14987Z = -1;
            this.f14989a0 = false;
            this.f14991b0 = false;
            this.f14993c0 = null;
            this.f14995d0 = 0;
            this.f14997e0 = true;
            this.f14999f0 = true;
            this.f15001g0 = false;
            this.f15003h0 = false;
            this.f15005i0 = false;
            this.f15007j0 = false;
            this.f15009k0 = false;
            this.f15011l0 = -1;
            this.f15013m0 = -1;
            this.f15015n0 = -1;
            this.f15017o0 = -1;
            this.f15019p0 = Integer.MIN_VALUE;
            this.f15021q0 = Integer.MIN_VALUE;
            this.f15023r0 = 0.5f;
            this.f15031v0 = new o0.e();
            this.f15033w0 = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f15540n1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                int i11 = a.f15037a.get(index);
                switch (i11) {
                    case 1:
                        this.f14987Z = obtainStyledAttributes.getInt(index, this.f14987Z);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f15018p);
                        this.f15018p = resourceId;
                        if (resourceId == -1) {
                            this.f15018p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        this.f15020q = obtainStyledAttributes.getDimensionPixelSize(index, this.f15020q);
                        break;
                    case 4:
                        float f10 = obtainStyledAttributes.getFloat(index, this.f15022r) % 360.0f;
                        this.f15022r = f10;
                        if (f10 < 0.0f) {
                            this.f15022r = (360.0f - f10) % 360.0f;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        this.f14988a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f14988a);
                        break;
                    case 6:
                        this.f14990b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f14990b);
                        break;
                    case 7:
                        this.f14992c = obtainStyledAttributes.getFloat(index, this.f14992c);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f14996e);
                        this.f14996e = resourceId2;
                        if (resourceId2 == -1) {
                            this.f14996e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f14998f);
                        this.f14998f = resourceId3;
                        if (resourceId3 == -1) {
                            this.f14998f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case RequestError.EVENT_TIMEOUT /* 10 */:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f15000g);
                        this.f15000g = resourceId4;
                        if (resourceId4 == -1) {
                            this.f15000g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f15002h);
                        this.f15002h = resourceId5;
                        if (resourceId5 == -1) {
                            this.f15002h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f15004i);
                        this.f15004i = resourceId6;
                        if (resourceId6 == -1) {
                            this.f15004i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f15006j);
                        this.f15006j = resourceId7;
                        if (resourceId7 == -1) {
                            this.f15006j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f15008k);
                        this.f15008k = resourceId8;
                        if (resourceId8 == -1) {
                            this.f15008k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case HVError.SSL_CONNECT_ERROR /* 15 */:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f15010l);
                        this.f15010l = resourceId9;
                        if (resourceId9 == -1) {
                            this.f15010l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f15012m);
                        this.f15012m = resourceId10;
                        if (resourceId10 == -1) {
                            this.f15012m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f15024s);
                        this.f15024s = resourceId11;
                        if (resourceId11 == -1) {
                            this.f15024s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f15026t);
                        this.f15026t = resourceId12;
                        if (resourceId12 == -1) {
                            this.f15026t = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f15028u);
                        this.f15028u = resourceId13;
                        if (resourceId13 == -1) {
                            this.f15028u = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f15030v);
                        this.f15030v = resourceId14;
                        if (resourceId14 == -1) {
                            this.f15030v = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                        this.f15032w = obtainStyledAttributes.getDimensionPixelSize(index, this.f15032w);
                        break;
                    case HVError.FACE_DETECTION_ERROR /* 22 */:
                        this.f15034x = obtainStyledAttributes.getDimensionPixelSize(index, this.f15034x);
                        break;
                    case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                        this.f15035y = obtainStyledAttributes.getDimensionPixelSize(index, this.f15035y);
                        break;
                    case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                        this.f15036z = obtainStyledAttributes.getDimensionPixelSize(index, this.f15036z);
                        break;
                    case HVError.LOW_STORAGE_ERROR /* 25 */:
                        this.f14962A = obtainStyledAttributes.getDimensionPixelSize(index, this.f14962A);
                        break;
                    case 26:
                        this.f14963B = obtainStyledAttributes.getDimensionPixelSize(index, this.f14963B);
                        break;
                    case 27:
                        this.f14989a0 = obtainStyledAttributes.getBoolean(index, this.f14989a0);
                        break;
                    case 28:
                        this.f14991b0 = obtainStyledAttributes.getBoolean(index, this.f14991b0);
                        break;
                    case 29:
                        this.f14968G = obtainStyledAttributes.getFloat(index, this.f14968G);
                        break;
                    case 30:
                        this.f14969H = obtainStyledAttributes.getFloat(index, this.f14969H);
                        break;
                    case HVError.INSTRUCTION_ERROR /* 31 */:
                        int i12 = obtainStyledAttributes.getInt(index, 0);
                        this.f14977P = i12;
                        if (i12 == 1) {
                            Log.e(ConstraintLayout.TAG, "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 32:
                        int i13 = obtainStyledAttributes.getInt(index, 0);
                        this.f14978Q = i13;
                        if (i13 == 1) {
                            Log.e(ConstraintLayout.TAG, "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case HVError.GPS_ACCESS_DENIED /* 33 */:
                        try {
                            this.f14979R = obtainStyledAttributes.getDimensionPixelSize(index, this.f14979R);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.f14979R) == -2) {
                                this.f14979R = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.f14981T = obtainStyledAttributes.getDimensionPixelSize(index, this.f14981T);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.f14981T) == -2) {
                                this.f14981T = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case HVError.FACE_CAPTURE_TIMEOUT /* 35 */:
                        this.f14983V = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f14983V));
                        this.f14977P = 2;
                        break;
                    case HVError.HYPER_DOC_DETECT_ERROR /* 36 */:
                        try {
                            this.f14980S = obtainStyledAttributes.getDimensionPixelSize(index, this.f14980S);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.f14980S) == -2) {
                                this.f14980S = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case HVError.INVALID_FILE_ERROR /* 37 */:
                        try {
                            this.f14982U = obtainStyledAttributes.getDimensionPixelSize(index, this.f14982U);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.f14982U) == -2) {
                                this.f14982U = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 38:
                        this.f14984W = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f14984W));
                        this.f14978Q = 2;
                        break;
                    default:
                        switch (i11) {
                            case HVError.SDK_CLOSE_ERROR /* 44 */:
                                d.s(this, obtainStyledAttributes.getString(index));
                                break;
                            case HVError.PERMISSION_REVOKED_ERROR /* 45 */:
                                this.f14973L = obtainStyledAttributes.getFloat(index, this.f14973L);
                                break;
                            case 46:
                                this.f14974M = obtainStyledAttributes.getFloat(index, this.f14974M);
                                break;
                            case 47:
                                this.f14975N = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.f14976O = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.f14985X = obtainStyledAttributes.getDimensionPixelOffset(index, this.f14985X);
                                break;
                            case 50:
                                this.f14986Y = obtainStyledAttributes.getDimensionPixelOffset(index, this.f14986Y);
                                break;
                            case 51:
                                this.f14993c0 = obtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = obtainStyledAttributes.getResourceId(index, this.f15014n);
                                this.f15014n = resourceId15;
                                if (resourceId15 == -1) {
                                    this.f15014n = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    break;
                                }
                            case 53:
                                int resourceId16 = obtainStyledAttributes.getResourceId(index, this.f15016o);
                                this.f15016o = resourceId16;
                                if (resourceId16 == -1) {
                                    this.f15016o = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    break;
                                }
                            case 54:
                                this.f14965D = obtainStyledAttributes.getDimensionPixelSize(index, this.f14965D);
                                break;
                            case 55:
                                this.f14964C = obtainStyledAttributes.getDimensionPixelSize(index, this.f14964C);
                                break;
                            default:
                                switch (i11) {
                                    case 64:
                                        d.q(this, obtainStyledAttributes, index, 0);
                                        this.f14966E = true;
                                        break;
                                    case 65:
                                        d.q(this, obtainStyledAttributes, index, 1);
                                        this.f14967F = true;
                                        break;
                                    case 66:
                                        this.f14995d0 = obtainStyledAttributes.getInt(index, this.f14995d0);
                                        break;
                                    case 67:
                                        this.f14994d = obtainStyledAttributes.getBoolean(index, this.f14994d);
                                        break;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
            a();
        }

        public void a() {
            this.f15003h0 = false;
            this.f14997e0 = true;
            this.f14999f0 = true;
            int i10 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i10 == -2 && this.f14989a0) {
                this.f14997e0 = false;
                if (this.f14977P == 0) {
                    this.f14977P = 1;
                }
            }
            int i11 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i11 == -2 && this.f14991b0) {
                this.f14999f0 = false;
                if (this.f14978Q == 0) {
                    this.f14978Q = 1;
                }
            }
            if (i10 == 0 || i10 == -1) {
                this.f14997e0 = false;
                if (i10 == 0 && this.f14977P == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.f14989a0 = true;
                }
            }
            if (i11 == 0 || i11 == -1) {
                this.f14999f0 = false;
                if (i11 == 0 && this.f14978Q == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f14991b0 = true;
                }
            }
            if (this.f14992c == -1.0f && this.f14988a == -1 && this.f14990b == -1) {
                return;
            }
            this.f15003h0 = true;
            this.f14997e0 = true;
            this.f14999f0 = true;
            if (!(this.f15031v0 instanceof o0.g)) {
                this.f15031v0 = new o0.g();
            }
            ((o0.g) this.f15031v0).w1(this.f14987Z);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0082  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void resolveLayoutDirection(int i10) {
            int i11;
            int i12;
            int i13;
            int i14;
            int i15 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
            int i16 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
            super.resolveLayoutDirection(i10);
            boolean z10 = false;
            boolean z11 = 1 == getLayoutDirection();
            this.f15015n0 = -1;
            this.f15017o0 = -1;
            this.f15011l0 = -1;
            this.f15013m0 = -1;
            this.f15019p0 = this.f15032w;
            this.f15021q0 = this.f15035y;
            float f10 = this.f14968G;
            this.f15023r0 = f10;
            int i17 = this.f14988a;
            this.f15025s0 = i17;
            int i18 = this.f14990b;
            this.f15027t0 = i18;
            float f11 = this.f14992c;
            this.f15029u0 = f11;
            if (z11) {
                int i19 = this.f15024s;
                if (i19 != -1) {
                    this.f15015n0 = i19;
                } else {
                    int i20 = this.f15026t;
                    if (i20 != -1) {
                        this.f15017o0 = i20;
                    }
                    i11 = this.f15028u;
                    if (i11 != -1) {
                        this.f15013m0 = i11;
                        z10 = true;
                    }
                    i12 = this.f15030v;
                    if (i12 != -1) {
                        this.f15011l0 = i12;
                        z10 = true;
                    }
                    i13 = this.f14962A;
                    if (i13 != Integer.MIN_VALUE) {
                        this.f15021q0 = i13;
                    }
                    i14 = this.f14963B;
                    if (i14 != Integer.MIN_VALUE) {
                        this.f15019p0 = i14;
                    }
                    if (z10) {
                        this.f15023r0 = 1.0f - f10;
                    }
                    if (this.f15003h0 && this.f14987Z == 1 && this.f14994d) {
                        if (f11 == -1.0f) {
                            this.f15029u0 = 1.0f - f11;
                            this.f15025s0 = -1;
                            this.f15027t0 = -1;
                        } else if (i17 != -1) {
                            this.f15027t0 = i17;
                            this.f15025s0 = -1;
                            this.f15029u0 = -1.0f;
                        } else if (i18 != -1) {
                            this.f15025s0 = i18;
                            this.f15027t0 = -1;
                            this.f15029u0 = -1.0f;
                        }
                    }
                }
                z10 = true;
                i11 = this.f15028u;
                if (i11 != -1) {
                }
                i12 = this.f15030v;
                if (i12 != -1) {
                }
                i13 = this.f14962A;
                if (i13 != Integer.MIN_VALUE) {
                }
                i14 = this.f14963B;
                if (i14 != Integer.MIN_VALUE) {
                }
                if (z10) {
                }
                if (this.f15003h0) {
                    if (f11 == -1.0f) {
                    }
                }
            } else {
                int i21 = this.f15024s;
                if (i21 != -1) {
                    this.f15013m0 = i21;
                }
                int i22 = this.f15026t;
                if (i22 != -1) {
                    this.f15011l0 = i22;
                }
                int i23 = this.f15028u;
                if (i23 != -1) {
                    this.f15015n0 = i23;
                }
                int i24 = this.f15030v;
                if (i24 != -1) {
                    this.f15017o0 = i24;
                }
                int i25 = this.f14962A;
                if (i25 != Integer.MIN_VALUE) {
                    this.f15019p0 = i25;
                }
                int i26 = this.f14963B;
                if (i26 != Integer.MIN_VALUE) {
                    this.f15021q0 = i26;
                }
            }
            if (this.f15028u == -1 && this.f15030v == -1 && this.f15026t == -1 && this.f15024s == -1) {
                int i27 = this.f15000g;
                if (i27 != -1) {
                    this.f15015n0 = i27;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i16 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i16;
                    }
                } else {
                    int i28 = this.f15002h;
                    if (i28 != -1) {
                        this.f15017o0 = i28;
                        if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i16 > 0) {
                            ((ViewGroup.MarginLayoutParams) this).rightMargin = i16;
                        }
                    }
                }
                int i29 = this.f14996e;
                if (i29 != -1) {
                    this.f15011l0 = i29;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i15 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i15;
                    return;
                }
                int i30 = this.f14998f;
                if (i30 != -1) {
                    this.f15013m0 = i30;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i15 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i15;
                }
            }
        }

        public b(int i10, int i11) {
            super(i10, i11);
            this.f14988a = -1;
            this.f14990b = -1;
            this.f14992c = -1.0f;
            this.f14994d = true;
            this.f14996e = -1;
            this.f14998f = -1;
            this.f15000g = -1;
            this.f15002h = -1;
            this.f15004i = -1;
            this.f15006j = -1;
            this.f15008k = -1;
            this.f15010l = -1;
            this.f15012m = -1;
            this.f15014n = -1;
            this.f15016o = -1;
            this.f15018p = -1;
            this.f15020q = 0;
            this.f15022r = 0.0f;
            this.f15024s = -1;
            this.f15026t = -1;
            this.f15028u = -1;
            this.f15030v = -1;
            this.f15032w = Integer.MIN_VALUE;
            this.f15034x = Integer.MIN_VALUE;
            this.f15035y = Integer.MIN_VALUE;
            this.f15036z = Integer.MIN_VALUE;
            this.f14962A = Integer.MIN_VALUE;
            this.f14963B = Integer.MIN_VALUE;
            this.f14964C = Integer.MIN_VALUE;
            this.f14965D = 0;
            this.f14966E = true;
            this.f14967F = true;
            this.f14968G = 0.5f;
            this.f14969H = 0.5f;
            this.f14970I = null;
            this.f14971J = 0.0f;
            this.f14972K = 1;
            this.f14973L = -1.0f;
            this.f14974M = -1.0f;
            this.f14975N = 0;
            this.f14976O = 0;
            this.f14977P = 0;
            this.f14978Q = 0;
            this.f14979R = 0;
            this.f14980S = 0;
            this.f14981T = 0;
            this.f14982U = 0;
            this.f14983V = 1.0f;
            this.f14984W = 1.0f;
            this.f14985X = -1;
            this.f14986Y = -1;
            this.f14987Z = -1;
            this.f14989a0 = false;
            this.f14991b0 = false;
            this.f14993c0 = null;
            this.f14995d0 = 0;
            this.f14997e0 = true;
            this.f14999f0 = true;
            this.f15001g0 = false;
            this.f15003h0 = false;
            this.f15005i0 = false;
            this.f15007j0 = false;
            this.f15009k0 = false;
            this.f15011l0 = -1;
            this.f15013m0 = -1;
            this.f15015n0 = -1;
            this.f15017o0 = -1;
            this.f15019p0 = Integer.MIN_VALUE;
            this.f15021q0 = Integer.MIN_VALUE;
            this.f15023r0 = 0.5f;
            this.f15031v0 = new o0.e();
            this.f15033w0 = false;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f14988a = -1;
            this.f14990b = -1;
            this.f14992c = -1.0f;
            this.f14994d = true;
            this.f14996e = -1;
            this.f14998f = -1;
            this.f15000g = -1;
            this.f15002h = -1;
            this.f15004i = -1;
            this.f15006j = -1;
            this.f15008k = -1;
            this.f15010l = -1;
            this.f15012m = -1;
            this.f15014n = -1;
            this.f15016o = -1;
            this.f15018p = -1;
            this.f15020q = 0;
            this.f15022r = 0.0f;
            this.f15024s = -1;
            this.f15026t = -1;
            this.f15028u = -1;
            this.f15030v = -1;
            this.f15032w = Integer.MIN_VALUE;
            this.f15034x = Integer.MIN_VALUE;
            this.f15035y = Integer.MIN_VALUE;
            this.f15036z = Integer.MIN_VALUE;
            this.f14962A = Integer.MIN_VALUE;
            this.f14963B = Integer.MIN_VALUE;
            this.f14964C = Integer.MIN_VALUE;
            this.f14965D = 0;
            this.f14966E = true;
            this.f14967F = true;
            this.f14968G = 0.5f;
            this.f14969H = 0.5f;
            this.f14970I = null;
            this.f14971J = 0.0f;
            this.f14972K = 1;
            this.f14973L = -1.0f;
            this.f14974M = -1.0f;
            this.f14975N = 0;
            this.f14976O = 0;
            this.f14977P = 0;
            this.f14978Q = 0;
            this.f14979R = 0;
            this.f14980S = 0;
            this.f14981T = 0;
            this.f14982U = 0;
            this.f14983V = 1.0f;
            this.f14984W = 1.0f;
            this.f14985X = -1;
            this.f14986Y = -1;
            this.f14987Z = -1;
            this.f14989a0 = false;
            this.f14991b0 = false;
            this.f14993c0 = null;
            this.f14995d0 = 0;
            this.f14997e0 = true;
            this.f14999f0 = true;
            this.f15001g0 = false;
            this.f15003h0 = false;
            this.f15005i0 = false;
            this.f15007j0 = false;
            this.f15009k0 = false;
            this.f15011l0 = -1;
            this.f15013m0 = -1;
            this.f15015n0 = -1;
            this.f15017o0 = -1;
            this.f15019p0 = Integer.MIN_VALUE;
            this.f15021q0 = Integer.MIN_VALUE;
            this.f15023r0 = 0.5f;
            this.f15031v0 = new o0.e();
            this.f15033w0 = false;
        }
    }
}
