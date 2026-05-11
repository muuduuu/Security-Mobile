package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.core.view.AbstractC1484a0;
import androidx.core.view.AbstractC1518s;
import g.AbstractC3179j;

/* loaded from: classes.dex */
public abstract class T extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    private boolean f13873a;

    /* renamed from: b, reason: collision with root package name */
    private int f13874b;

    /* renamed from: c, reason: collision with root package name */
    private int f13875c;

    /* renamed from: d, reason: collision with root package name */
    private int f13876d;

    /* renamed from: e, reason: collision with root package name */
    private int f13877e;

    /* renamed from: f, reason: collision with root package name */
    private int f13878f;

    /* renamed from: g, reason: collision with root package name */
    private float f13879g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f13880h;

    /* renamed from: i, reason: collision with root package name */
    private int[] f13881i;

    /* renamed from: j, reason: collision with root package name */
    private int[] f13882j;

    /* renamed from: k, reason: collision with root package name */
    private Drawable f13883k;

    /* renamed from: l, reason: collision with root package name */
    private int f13884l;

    /* renamed from: m, reason: collision with root package name */
    private int f13885m;

    /* renamed from: n, reason: collision with root package name */
    private int f13886n;

    /* renamed from: o, reason: collision with root package name */
    private int f13887o;

    public static class a extends LinearLayout.LayoutParams {
        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public a(int i10, int i11) {
            super(i10, i11);
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public T(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void A(View view, int i10, int i11, int i12, int i13) {
        view.layout(i10, i11, i12 + i10, i13 + i11);
    }

    private void k(int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i12 = 0; i12 < i10; i12++) {
            View s10 = s(i12);
            if (s10.getVisibility() != 8) {
                a aVar = (a) s10.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).height == -1) {
                    int i13 = ((LinearLayout.LayoutParams) aVar).width;
                    ((LinearLayout.LayoutParams) aVar).width = s10.getMeasuredWidth();
                    measureChildWithMargins(s10, i11, 0, makeMeasureSpec, 0);
                    ((LinearLayout.LayoutParams) aVar).width = i13;
                }
            }
        }
    }

    private void l(int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i12 = 0; i12 < i10; i12++) {
            View s10 = s(i12);
            if (s10.getVisibility() != 8) {
                a aVar = (a) s10.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).width == -1) {
                    int i13 = ((LinearLayout.LayoutParams) aVar).height;
                    ((LinearLayout.LayoutParams) aVar).height = s10.getMeasuredHeight();
                    measureChildWithMargins(s10, makeMeasureSpec, 0, i11, 0);
                    ((LinearLayout.LayoutParams) aVar).height = i13;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    void g(Canvas canvas) {
        int right;
        int left;
        int i10;
        int virtualChildCount = getVirtualChildCount();
        boolean b10 = s0.b(this);
        for (int i11 = 0; i11 < virtualChildCount; i11++) {
            View s10 = s(i11);
            if (s10 != null && s10.getVisibility() != 8 && t(i11)) {
                a aVar = (a) s10.getLayoutParams();
                j(canvas, b10 ? s10.getRight() + ((LinearLayout.LayoutParams) aVar).rightMargin : (s10.getLeft() - ((LinearLayout.LayoutParams) aVar).leftMargin) - this.f13884l);
            }
        }
        if (t(virtualChildCount)) {
            View s11 = s(virtualChildCount - 1);
            if (s11 != null) {
                a aVar2 = (a) s11.getLayoutParams();
                if (b10) {
                    left = s11.getLeft() - ((LinearLayout.LayoutParams) aVar2).leftMargin;
                    i10 = this.f13884l;
                    right = left - i10;
                } else {
                    right = s11.getRight() + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                }
            } else if (b10) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i10 = this.f13884l;
                right = left - i10;
            }
            j(canvas, right);
        }
    }

    @Override // android.view.View
    public int getBaseline() {
        int i10;
        if (this.f13874b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i11 = this.f13874b;
        if (childCount <= i11) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i11);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f13874b == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i12 = this.f13875c;
        if (this.f13876d == 1 && (i10 = this.f13877e & 112) != 48) {
            if (i10 == 16) {
                i12 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f13878f) / 2;
            } else if (i10 == 80) {
                i12 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f13878f;
            }
        }
        return i12 + ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f13874b;
    }

    public Drawable getDividerDrawable() {
        return this.f13883k;
    }

    public int getDividerPadding() {
        return this.f13887o;
    }

    public int getDividerWidth() {
        return this.f13884l;
    }

    public int getGravity() {
        return this.f13877e;
    }

    public int getOrientation() {
        return this.f13876d;
    }

    public int getShowDividers() {
        return this.f13886n;
    }

    int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f13879g;
    }

    void h(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i10 = 0; i10 < virtualChildCount; i10++) {
            View s10 = s(i10);
            if (s10 != null && s10.getVisibility() != 8 && t(i10)) {
                i(canvas, (s10.getTop() - ((LinearLayout.LayoutParams) ((a) s10.getLayoutParams())).topMargin) - this.f13885m);
            }
        }
        if (t(virtualChildCount)) {
            View s11 = s(virtualChildCount - 1);
            i(canvas, s11 == null ? (getHeight() - getPaddingBottom()) - this.f13885m : s11.getBottom() + ((LinearLayout.LayoutParams) ((a) s11.getLayoutParams())).bottomMargin);
        }
    }

    void i(Canvas canvas, int i10) {
        this.f13883k.setBounds(getPaddingLeft() + this.f13887o, i10, (getWidth() - getPaddingRight()) - this.f13887o, this.f13885m + i10);
        this.f13883k.draw(canvas);
    }

    void j(Canvas canvas, int i10) {
        this.f13883k.setBounds(i10, getPaddingTop() + this.f13887o, this.f13884l + i10, (getHeight() - getPaddingBottom()) - this.f13887o);
        this.f13883k.draw(canvas);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        int i10 = this.f13876d;
        if (i10 == 0) {
            return new a(-2, -2);
        }
        if (i10 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a ? new a((ViewGroup.MarginLayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new a((ViewGroup.MarginLayoutParams) layoutParams) : new a(layoutParams);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f13883k == null) {
            return;
        }
        if (this.f13876d == 1) {
            h(canvas);
        } else {
            g(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (this.f13876d == 1) {
            v(i10, i11, i12, i13);
        } else {
            u(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (this.f13876d == 1) {
            z(i10, i11);
        } else {
            x(i10, i11);
        }
    }

    int p(View view, int i10) {
        return 0;
    }

    int q(View view) {
        return 0;
    }

    int r(View view) {
        return 0;
    }

    View s(int i10) {
        return getChildAt(i10);
    }

    public void setBaselineAligned(boolean z10) {
        this.f13873a = z10;
    }

    public void setBaselineAlignedChildIndex(int i10) {
        if (i10 >= 0 && i10 < getChildCount()) {
            this.f13874b = i10;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f13883k) {
            return;
        }
        this.f13883k = drawable;
        if (drawable != null) {
            this.f13884l = drawable.getIntrinsicWidth();
            this.f13885m = drawable.getIntrinsicHeight();
        } else {
            this.f13884l = 0;
            this.f13885m = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i10) {
        this.f13887o = i10;
    }

    public void setGravity(int i10) {
        if (this.f13877e != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f13877e = i10;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i10) {
        int i11 = i10 & 8388615;
        int i12 = this.f13877e;
        if ((8388615 & i12) != i11) {
            this.f13877e = i11 | ((-8388616) & i12);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z10) {
        this.f13880h = z10;
    }

    public void setOrientation(int i10) {
        if (this.f13876d != i10) {
            this.f13876d = i10;
            requestLayout();
        }
    }

    public void setShowDividers(int i10) {
        if (i10 != this.f13886n) {
            requestLayout();
        }
        this.f13886n = i10;
    }

    public void setVerticalGravity(int i10) {
        int i11 = i10 & 112;
        int i12 = this.f13877e;
        if ((i12 & 112) != i11) {
            this.f13877e = i11 | (i12 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f10) {
        this.f13879g = Math.max(0.0f, f10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    protected boolean t(int i10) {
        if (i10 == 0) {
            return (this.f13886n & 1) != 0;
        }
        if (i10 == getChildCount()) {
            return (this.f13886n & 4) != 0;
        }
        if ((this.f13886n & 2) == 0) {
            return false;
        }
        for (int i11 = i10 - 1; i11 >= 0; i11--) {
            if (getChildAt(i11).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void u(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z10;
        int i19;
        int i20;
        int i21;
        int i22;
        boolean b10 = s0.b(this);
        int paddingTop = getPaddingTop();
        int i23 = i13 - i11;
        int paddingBottom = i23 - getPaddingBottom();
        int paddingBottom2 = (i23 - paddingTop) - getPaddingBottom();
        int virtualChildCount = getVirtualChildCount();
        int i24 = this.f13877e;
        int i25 = i24 & 112;
        boolean z11 = this.f13873a;
        int[] iArr = this.f13881i;
        int[] iArr2 = this.f13882j;
        int b11 = AbstractC1518s.b(8388615 & i24, getLayoutDirection());
        boolean z12 = true;
        int paddingLeft = b11 != 1 ? b11 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i12) - i10) - this.f13878f : getPaddingLeft() + (((i12 - i10) - this.f13878f) / 2);
        if (b10) {
            i14 = virtualChildCount - 1;
            i15 = -1;
        } else {
            i14 = 0;
            i15 = 1;
        }
        int i26 = 0;
        while (i26 < virtualChildCount) {
            int i27 = i14 + (i15 * i26);
            View s10 = s(i27);
            if (s10 == null) {
                paddingLeft += y(i27);
                z10 = z12;
                i16 = paddingTop;
                i17 = virtualChildCount;
                i18 = i25;
            } else if (s10.getVisibility() != 8) {
                int measuredWidth = s10.getMeasuredWidth();
                int measuredHeight = s10.getMeasuredHeight();
                a aVar = (a) s10.getLayoutParams();
                int i28 = i26;
                if (z11) {
                    i17 = virtualChildCount;
                    if (((LinearLayout.LayoutParams) aVar).height != -1) {
                        i19 = s10.getBaseline();
                        i20 = ((LinearLayout.LayoutParams) aVar).gravity;
                        if (i20 < 0) {
                            i20 = i25;
                        }
                        i21 = i20 & 112;
                        i18 = i25;
                        if (i21 == 16) {
                            if (i21 == 48) {
                                i22 = ((LinearLayout.LayoutParams) aVar).topMargin + paddingTop;
                                if (i19 != -1) {
                                    z10 = true;
                                    i22 += iArr[1] - i19;
                                }
                            } else if (i21 != 80) {
                                i22 = paddingTop;
                            } else {
                                i22 = (paddingBottom - measuredHeight) - ((LinearLayout.LayoutParams) aVar).bottomMargin;
                                if (i19 != -1) {
                                    i22 -= iArr2[2] - (s10.getMeasuredHeight() - i19);
                                }
                            }
                            z10 = true;
                        } else {
                            z10 = true;
                            i22 = ((((paddingBottom2 - measuredHeight) / 2) + paddingTop) + ((LinearLayout.LayoutParams) aVar).topMargin) - ((LinearLayout.LayoutParams) aVar).bottomMargin;
                        }
                        if (t(i27)) {
                            paddingLeft += this.f13884l;
                        }
                        int i29 = ((LinearLayout.LayoutParams) aVar).leftMargin + paddingLeft;
                        i16 = paddingTop;
                        A(s10, i29 + q(s10), i22, measuredWidth, measuredHeight);
                        int r10 = i29 + measuredWidth + ((LinearLayout.LayoutParams) aVar).rightMargin + r(s10);
                        i26 = i28 + p(s10, i27);
                        paddingLeft = r10;
                        i26++;
                        virtualChildCount = i17;
                        i25 = i18;
                        z12 = z10;
                        paddingTop = i16;
                    }
                } else {
                    i17 = virtualChildCount;
                }
                i19 = -1;
                i20 = ((LinearLayout.LayoutParams) aVar).gravity;
                if (i20 < 0) {
                }
                i21 = i20 & 112;
                i18 = i25;
                if (i21 == 16) {
                }
                if (t(i27)) {
                }
                int i292 = ((LinearLayout.LayoutParams) aVar).leftMargin + paddingLeft;
                i16 = paddingTop;
                A(s10, i292 + q(s10), i22, measuredWidth, measuredHeight);
                int r102 = i292 + measuredWidth + ((LinearLayout.LayoutParams) aVar).rightMargin + r(s10);
                i26 = i28 + p(s10, i27);
                paddingLeft = r102;
                i26++;
                virtualChildCount = i17;
                i25 = i18;
                z12 = z10;
                paddingTop = i16;
            } else {
                i16 = paddingTop;
                i17 = virtualChildCount;
                i18 = i25;
                z10 = true;
            }
            i26++;
            virtualChildCount = i17;
            i25 = i18;
            z12 = z10;
            paddingTop = i16;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void v(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int paddingLeft = getPaddingLeft();
        int i18 = i12 - i10;
        int paddingRight = i18 - getPaddingRight();
        int paddingRight2 = (i18 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i19 = this.f13877e;
        int i20 = i19 & 112;
        int i21 = i19 & 8388615;
        int paddingTop = i20 != 16 ? i20 != 80 ? getPaddingTop() : ((getPaddingTop() + i13) - i11) - this.f13878f : getPaddingTop() + (((i13 - i11) - this.f13878f) / 2);
        int i22 = 0;
        while (i22 < virtualChildCount) {
            View s10 = s(i22);
            if (s10 == null) {
                paddingTop += y(i22);
            } else if (s10.getVisibility() != 8) {
                int measuredWidth = s10.getMeasuredWidth();
                int measuredHeight = s10.getMeasuredHeight();
                a aVar = (a) s10.getLayoutParams();
                int i23 = ((LinearLayout.LayoutParams) aVar).gravity;
                if (i23 < 0) {
                    i23 = i21;
                }
                int b10 = AbstractC1518s.b(i23, getLayoutDirection()) & 7;
                if (b10 == 1) {
                    i14 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) aVar).leftMargin;
                    i15 = ((LinearLayout.LayoutParams) aVar).rightMargin;
                } else if (b10 != 5) {
                    i16 = ((LinearLayout.LayoutParams) aVar).leftMargin + paddingLeft;
                    int i24 = i16;
                    if (t(i22)) {
                        paddingTop += this.f13885m;
                    }
                    int i25 = paddingTop + ((LinearLayout.LayoutParams) aVar).topMargin;
                    A(s10, i24, i25 + q(s10), measuredWidth, measuredHeight);
                    int r10 = i25 + measuredHeight + ((LinearLayout.LayoutParams) aVar).bottomMargin + r(s10);
                    i22 += p(s10, i22);
                    paddingTop = r10;
                    i17 = 1;
                    i22 += i17;
                } else {
                    i14 = paddingRight - measuredWidth;
                    i15 = ((LinearLayout.LayoutParams) aVar).rightMargin;
                }
                i16 = i14 - i15;
                int i242 = i16;
                if (t(i22)) {
                }
                int i252 = paddingTop + ((LinearLayout.LayoutParams) aVar).topMargin;
                A(s10, i242, i252 + q(s10), measuredWidth, measuredHeight);
                int r102 = i252 + measuredHeight + ((LinearLayout.LayoutParams) aVar).bottomMargin + r(s10);
                i22 += p(s10, i22);
                paddingTop = r102;
                i17 = 1;
                i22 += i17;
            }
            i17 = 1;
            i22 += i17;
        }
    }

    void w(View view, int i10, int i11, int i12, int i13, int i14) {
        measureChildWithMargins(view, i11, i12, i13, i14);
    }

    /* JADX WARN: Removed duplicated region for block: B:200:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void x(int i10, int i11) {
        int[] iArr;
        int i12;
        int max;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        float f10;
        int i19;
        boolean z10;
        int baseline;
        int i20;
        int i21;
        int i22;
        char c10;
        int i23;
        int i24;
        boolean z11;
        boolean z12;
        View view;
        int i25;
        boolean z13;
        int measuredHeight;
        int p10;
        int baseline2;
        int i26;
        this.f13878f = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        if (this.f13881i == null || this.f13882j == null) {
            this.f13881i = new int[4];
            this.f13882j = new int[4];
        }
        int[] iArr2 = this.f13881i;
        int[] iArr3 = this.f13882j;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        iArr3[3] = -1;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        boolean z14 = this.f13873a;
        boolean z15 = this.f13880h;
        int i27 = 1073741824;
        boolean z16 = mode == 1073741824;
        int i28 = 0;
        int i29 = 0;
        int i30 = 0;
        int i31 = 0;
        int i32 = 0;
        boolean z17 = false;
        int i33 = 0;
        boolean z18 = false;
        boolean z19 = true;
        float f11 = 0.0f;
        while (true) {
            iArr = iArr3;
            if (i28 >= virtualChildCount) {
                break;
            }
            View s10 = s(i28);
            if (s10 == null) {
                this.f13878f += y(i28);
            } else if (s10.getVisibility() == 8) {
                i28 += p(s10, i28);
            } else {
                if (t(i28)) {
                    this.f13878f += this.f13884l;
                }
                a aVar = (a) s10.getLayoutParams();
                float f12 = ((LinearLayout.LayoutParams) aVar).weight;
                float f13 = f11 + f12;
                if (mode == i27 && ((LinearLayout.LayoutParams) aVar).width == 0 && f12 > 0.0f) {
                    if (z16) {
                        this.f13878f += ((LinearLayout.LayoutParams) aVar).leftMargin + ((LinearLayout.LayoutParams) aVar).rightMargin;
                    } else {
                        int i34 = this.f13878f;
                        this.f13878f = Math.max(i34, ((LinearLayout.LayoutParams) aVar).leftMargin + i34 + ((LinearLayout.LayoutParams) aVar).rightMargin);
                    }
                    if (z14) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                        s10.measure(makeMeasureSpec, makeMeasureSpec);
                        i24 = i28;
                        z11 = z15;
                        z12 = z14;
                        view = s10;
                    } else {
                        i24 = i28;
                        z11 = z15;
                        z12 = z14;
                        view = s10;
                        z17 = true;
                        i25 = 1073741824;
                        if (mode2 == i25 && ((LinearLayout.LayoutParams) aVar).height == -1) {
                            z13 = true;
                            z18 = true;
                        } else {
                            z13 = false;
                        }
                        int i35 = ((LinearLayout.LayoutParams) aVar).topMargin + ((LinearLayout.LayoutParams) aVar).bottomMargin;
                        measuredHeight = view.getMeasuredHeight() + i35;
                        i33 = View.combineMeasuredStates(i33, view.getMeasuredState());
                        if (z12 && (baseline2 = view.getBaseline()) != -1) {
                            i26 = ((LinearLayout.LayoutParams) aVar).gravity;
                            if (i26 < 0) {
                                i26 = this.f13877e;
                            }
                            int i36 = (((i26 & 112) >> 4) & (-2)) >> 1;
                            iArr2[i36] = Math.max(iArr2[i36], baseline2);
                            iArr[i36] = Math.max(iArr[i36], measuredHeight - baseline2);
                        }
                        i30 = Math.max(i30, measuredHeight);
                        z19 = !z19 && ((LinearLayout.LayoutParams) aVar).height == -1;
                        if (((LinearLayout.LayoutParams) aVar).weight <= 0.0f) {
                            if (!z13) {
                                i35 = measuredHeight;
                            }
                            i32 = Math.max(i32, i35);
                        } else {
                            int i37 = i32;
                            if (!z13) {
                                i35 = measuredHeight;
                            }
                            i31 = Math.max(i31, i35);
                            i32 = i37;
                        }
                        int i38 = i24;
                        p10 = p(view, i38) + i38;
                        f11 = f13;
                        int i39 = p10 + 1;
                        iArr3 = iArr;
                        z15 = z11;
                        z14 = z12;
                        i27 = i25;
                        i28 = i39;
                    }
                } else {
                    if (((LinearLayout.LayoutParams) aVar).width != 0 || f12 <= 0.0f) {
                        c10 = 65534;
                        i23 = Integer.MIN_VALUE;
                    } else {
                        c10 = 65534;
                        ((LinearLayout.LayoutParams) aVar).width = -2;
                        i23 = 0;
                    }
                    i24 = i28;
                    int i40 = i23;
                    z11 = z15;
                    z12 = z14;
                    w(s10, i24, i10, f13 == 0.0f ? this.f13878f : 0, i11, 0);
                    if (i40 != Integer.MIN_VALUE) {
                        ((LinearLayout.LayoutParams) aVar).width = i40;
                    }
                    int measuredWidth = s10.getMeasuredWidth();
                    if (z16) {
                        view = s10;
                        this.f13878f += ((LinearLayout.LayoutParams) aVar).leftMargin + measuredWidth + ((LinearLayout.LayoutParams) aVar).rightMargin + r(view);
                    } else {
                        view = s10;
                        int i41 = this.f13878f;
                        this.f13878f = Math.max(i41, i41 + measuredWidth + ((LinearLayout.LayoutParams) aVar).leftMargin + ((LinearLayout.LayoutParams) aVar).rightMargin + r(view));
                    }
                    if (z11) {
                        i29 = Math.max(measuredWidth, i29);
                    }
                }
                i25 = 1073741824;
                if (mode2 == i25) {
                }
                z13 = false;
                int i352 = ((LinearLayout.LayoutParams) aVar).topMargin + ((LinearLayout.LayoutParams) aVar).bottomMargin;
                measuredHeight = view.getMeasuredHeight() + i352;
                i33 = View.combineMeasuredStates(i33, view.getMeasuredState());
                if (z12) {
                    i26 = ((LinearLayout.LayoutParams) aVar).gravity;
                    if (i26 < 0) {
                    }
                    int i362 = (((i26 & 112) >> 4) & (-2)) >> 1;
                    iArr2[i362] = Math.max(iArr2[i362], baseline2);
                    iArr[i362] = Math.max(iArr[i362], measuredHeight - baseline2);
                }
                i30 = Math.max(i30, measuredHeight);
                if (z19) {
                }
                if (((LinearLayout.LayoutParams) aVar).weight <= 0.0f) {
                }
                int i382 = i24;
                p10 = p(view, i382) + i382;
                f11 = f13;
                int i392 = p10 + 1;
                iArr3 = iArr;
                z15 = z11;
                z14 = z12;
                i27 = i25;
                i28 = i392;
            }
            z11 = z15;
            z12 = z14;
            int i42 = i27;
            p10 = i28;
            i25 = i42;
            int i3922 = p10 + 1;
            iArr3 = iArr;
            z15 = z11;
            z14 = z12;
            i27 = i25;
            i28 = i3922;
        }
        boolean z20 = z15;
        boolean z21 = z14;
        int i43 = i30;
        int i44 = i31;
        int i45 = i32;
        int i46 = i33;
        if (this.f13878f > 0 && t(virtualChildCount)) {
            this.f13878f += this.f13884l;
        }
        int i47 = iArr2[1];
        if (i47 == -1 && iArr2[0] == -1 && iArr2[2] == -1 && iArr2[3] == -1) {
            max = i43;
            i12 = i46;
        } else {
            i12 = i46;
            max = Math.max(i43, Math.max(iArr2[3], Math.max(iArr2[0], Math.max(i47, iArr2[2]))) + Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))));
        }
        if (z20 && (mode == Integer.MIN_VALUE || mode == 0)) {
            this.f13878f = 0;
            int i48 = 0;
            while (i48 < virtualChildCount) {
                View s11 = s(i48);
                if (s11 == null) {
                    this.f13878f += y(i48);
                } else if (s11.getVisibility() == 8) {
                    i48 += p(s11, i48);
                } else {
                    a aVar2 = (a) s11.getLayoutParams();
                    if (z16) {
                        this.f13878f += ((LinearLayout.LayoutParams) aVar2).leftMargin + i29 + ((LinearLayout.LayoutParams) aVar2).rightMargin + r(s11);
                    } else {
                        int i49 = this.f13878f;
                        i22 = max;
                        this.f13878f = Math.max(i49, i49 + i29 + ((LinearLayout.LayoutParams) aVar2).leftMargin + ((LinearLayout.LayoutParams) aVar2).rightMargin + r(s11));
                        i48++;
                        max = i22;
                    }
                }
                i22 = max;
                i48++;
                max = i22;
            }
        }
        int i50 = max;
        int paddingLeft = this.f13878f + getPaddingLeft() + getPaddingRight();
        this.f13878f = paddingLeft;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i10, 0);
        int i51 = (16777215 & resolveSizeAndState) - this.f13878f;
        if (z17 || (i51 != 0 && f11 > 0.0f)) {
            float f14 = this.f13879g;
            if (f14 > 0.0f) {
                f11 = f14;
            }
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            this.f13878f = 0;
            int i52 = i44;
            int i53 = -1;
            i13 = i12;
            int i54 = 0;
            while (i54 < virtualChildCount) {
                View s12 = s(i54);
                if (s12 == null || s12.getVisibility() == 8) {
                    i17 = i51;
                    i18 = virtualChildCount;
                } else {
                    a aVar3 = (a) s12.getLayoutParams();
                    float f15 = ((LinearLayout.LayoutParams) aVar3).weight;
                    if (f15 > 0.0f) {
                        int i55 = (int) ((i51 * f15) / f11);
                        float f16 = f11 - f15;
                        int i56 = i51 - i55;
                        i18 = virtualChildCount;
                        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, getPaddingTop() + getPaddingBottom() + ((LinearLayout.LayoutParams) aVar3).topMargin + ((LinearLayout.LayoutParams) aVar3).bottomMargin, ((LinearLayout.LayoutParams) aVar3).height);
                        if (((LinearLayout.LayoutParams) aVar3).width == 0) {
                            i21 = 1073741824;
                            if (mode == 1073741824) {
                                if (i55 <= 0) {
                                    i55 = 0;
                                }
                                s12.measure(View.MeasureSpec.makeMeasureSpec(i55, 1073741824), childMeasureSpec);
                                i13 = View.combineMeasuredStates(i13, s12.getMeasuredState() & (-16777216));
                                f11 = f16;
                                i17 = i56;
                            }
                        } else {
                            i21 = 1073741824;
                        }
                        int measuredWidth2 = s12.getMeasuredWidth() + i55;
                        if (measuredWidth2 < 0) {
                            measuredWidth2 = 0;
                        }
                        s12.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2, i21), childMeasureSpec);
                        i13 = View.combineMeasuredStates(i13, s12.getMeasuredState() & (-16777216));
                        f11 = f16;
                        i17 = i56;
                    } else {
                        i17 = i51;
                        i18 = virtualChildCount;
                    }
                    if (z16) {
                        this.f13878f += s12.getMeasuredWidth() + ((LinearLayout.LayoutParams) aVar3).leftMargin + ((LinearLayout.LayoutParams) aVar3).rightMargin + r(s12);
                        f10 = f11;
                    } else {
                        int i57 = this.f13878f;
                        f10 = f11;
                        this.f13878f = Math.max(i57, s12.getMeasuredWidth() + i57 + ((LinearLayout.LayoutParams) aVar3).leftMargin + ((LinearLayout.LayoutParams) aVar3).rightMargin + r(s12));
                    }
                    boolean z22 = mode2 != 1073741824 && ((LinearLayout.LayoutParams) aVar3).height == -1;
                    int i58 = ((LinearLayout.LayoutParams) aVar3).topMargin + ((LinearLayout.LayoutParams) aVar3).bottomMargin;
                    int measuredHeight2 = s12.getMeasuredHeight() + i58;
                    i53 = Math.max(i53, measuredHeight2);
                    if (!z22) {
                        i58 = measuredHeight2;
                    }
                    int max2 = Math.max(i52, i58);
                    if (z19) {
                        i19 = -1;
                        if (((LinearLayout.LayoutParams) aVar3).height == -1) {
                            z10 = true;
                            if (z21 && (baseline = s12.getBaseline()) != i19) {
                                i20 = ((LinearLayout.LayoutParams) aVar3).gravity;
                                if (i20 < 0) {
                                    i20 = this.f13877e;
                                }
                                int i59 = (((i20 & 112) >> 4) & (-2)) >> 1;
                                iArr2[i59] = Math.max(iArr2[i59], baseline);
                                iArr[i59] = Math.max(iArr[i59], measuredHeight2 - baseline);
                            }
                            z19 = z10;
                            i52 = max2;
                            f11 = f10;
                        }
                    } else {
                        i19 = -1;
                    }
                    z10 = false;
                    if (z21) {
                        i20 = ((LinearLayout.LayoutParams) aVar3).gravity;
                        if (i20 < 0) {
                        }
                        int i592 = (((i20 & 112) >> 4) & (-2)) >> 1;
                        iArr2[i592] = Math.max(iArr2[i592], baseline);
                        iArr[i592] = Math.max(iArr[i592], measuredHeight2 - baseline);
                    }
                    z19 = z10;
                    i52 = max2;
                    f11 = f10;
                }
                i54++;
                i51 = i17;
                virtualChildCount = i18;
            }
            i14 = i11;
            i15 = virtualChildCount;
            this.f13878f += getPaddingLeft() + getPaddingRight();
            int i60 = iArr2[1];
            i50 = (i60 == -1 && iArr2[0] == -1 && iArr2[2] == -1 && iArr2[3] == -1) ? i53 : Math.max(i53, Math.max(iArr2[3], Math.max(iArr2[0], Math.max(i60, iArr2[2]))) + Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))));
            i16 = i52;
        } else {
            i16 = Math.max(i44, i45);
            if (z20 && mode != 1073741824) {
                for (int i61 = 0; i61 < virtualChildCount; i61++) {
                    View s13 = s(i61);
                    if (s13 != null && s13.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((a) s13.getLayoutParams())).weight > 0.0f) {
                        s13.measure(View.MeasureSpec.makeMeasureSpec(i29, 1073741824), View.MeasureSpec.makeMeasureSpec(s13.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i14 = i11;
            i15 = virtualChildCount;
            i13 = i12;
        }
        if (z19 || mode2 == 1073741824) {
            i16 = i50;
        }
        setMeasuredDimension(resolveSizeAndState | ((-16777216) & i13), View.resolveSizeAndState(Math.max(i16 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i14, i13 << 16));
        if (z18) {
            k(i15, i10);
        }
    }

    int y(int i10) {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:156:0x031b, code lost:
    
        if (((android.widget.LinearLayout.LayoutParams) r14).width == (-1)) goto L147;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void z(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        View view;
        int max;
        boolean z10;
        this.f13878f = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int i28 = this.f13874b;
        boolean z11 = this.f13880h;
        int i29 = 0;
        int i30 = 0;
        int i31 = 0;
        int i32 = 0;
        int i33 = 0;
        int i34 = 0;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = true;
        float f10 = 0.0f;
        while (true) {
            int i35 = 8;
            int i36 = i32;
            if (i34 >= virtualChildCount) {
                int i37 = i29;
                int i38 = i31;
                int i39 = i33;
                int i40 = mode2;
                int i41 = i30;
                int i42 = virtualChildCount;
                if (this.f13878f > 0) {
                    i12 = i42;
                    if (t(i12)) {
                        this.f13878f += this.f13885m;
                    }
                } else {
                    i12 = i42;
                }
                if (z11 && (i40 == Integer.MIN_VALUE || i40 == 0)) {
                    this.f13878f = 0;
                    int i43 = 0;
                    while (i43 < i12) {
                        View s10 = s(i43);
                        if (s10 == null) {
                            this.f13878f += y(i43);
                        } else if (s10.getVisibility() == i35) {
                            i43 += p(s10, i43);
                        } else {
                            a aVar = (a) s10.getLayoutParams();
                            int i44 = this.f13878f;
                            this.f13878f = Math.max(i44, i44 + i38 + ((LinearLayout.LayoutParams) aVar).topMargin + ((LinearLayout.LayoutParams) aVar).bottomMargin + r(s10));
                        }
                        i43++;
                        i35 = 8;
                    }
                }
                int paddingTop = this.f13878f + getPaddingTop() + getPaddingBottom();
                this.f13878f = paddingTop;
                int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i11, 0);
                int i45 = (16777215 & resolveSizeAndState) - this.f13878f;
                if (z12 || (i45 != 0 && f10 > 0.0f)) {
                    float f11 = this.f13879g;
                    if (f11 > 0.0f) {
                        f10 = f11;
                    }
                    this.f13878f = 0;
                    int i46 = i45;
                    int i47 = i39;
                    i13 = i37;
                    int i48 = 0;
                    while (i48 < i12) {
                        View s11 = s(i48);
                        if (s11.getVisibility() == 8) {
                            i16 = i46;
                        } else {
                            a aVar2 = (a) s11.getLayoutParams();
                            float f12 = ((LinearLayout.LayoutParams) aVar2).weight;
                            if (f12 > 0.0f) {
                                int i49 = (int) ((i46 * f12) / f10);
                                float f13 = f10 - f12;
                                i16 = i46 - i49;
                                int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + ((LinearLayout.LayoutParams) aVar2).leftMargin + ((LinearLayout.LayoutParams) aVar2).rightMargin, ((LinearLayout.LayoutParams) aVar2).width);
                                if (((LinearLayout.LayoutParams) aVar2).height == 0) {
                                    i19 = 1073741824;
                                    if (i40 == 1073741824) {
                                        if (i49 <= 0) {
                                            i49 = 0;
                                        }
                                        s11.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i49, 1073741824));
                                        i13 = View.combineMeasuredStates(i13, s11.getMeasuredState() & (-256));
                                        f10 = f13;
                                    }
                                } else {
                                    i19 = 1073741824;
                                }
                                int measuredHeight = s11.getMeasuredHeight() + i49;
                                if (measuredHeight < 0) {
                                    measuredHeight = 0;
                                }
                                s11.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight, i19));
                                i13 = View.combineMeasuredStates(i13, s11.getMeasuredState() & (-256));
                                f10 = f13;
                            } else {
                                i16 = i46;
                            }
                            int i50 = ((LinearLayout.LayoutParams) aVar2).leftMargin + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                            int measuredWidth = s11.getMeasuredWidth() + i50;
                            i41 = Math.max(i41, measuredWidth);
                            float f14 = f10;
                            if (mode != 1073741824) {
                                i17 = i13;
                                i18 = -1;
                            } else {
                                i17 = i13;
                                i18 = -1;
                            }
                            i50 = measuredWidth;
                            int max2 = Math.max(i47, i50);
                            boolean z15 = z14 && ((LinearLayout.LayoutParams) aVar2).width == i18;
                            int i51 = this.f13878f;
                            this.f13878f = Math.max(i51, s11.getMeasuredHeight() + i51 + ((LinearLayout.LayoutParams) aVar2).topMargin + ((LinearLayout.LayoutParams) aVar2).bottomMargin + r(s11));
                            z14 = z15;
                            i13 = i17;
                            i47 = max2;
                            f10 = f14;
                        }
                        i48++;
                        i46 = i16;
                    }
                    i14 = i10;
                    this.f13878f += getPaddingTop() + getPaddingBottom();
                    i15 = i47;
                } else {
                    i15 = Math.max(i39, i36);
                    if (z11 && i40 != 1073741824) {
                        for (int i52 = 0; i52 < i12; i52++) {
                            View s12 = s(i52);
                            if (s12 != null && s12.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((a) s12.getLayoutParams())).weight > 0.0f) {
                                s12.measure(View.MeasureSpec.makeMeasureSpec(s12.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i38, 1073741824));
                            }
                        }
                    }
                    i14 = i10;
                    i13 = i37;
                }
                if (z14 || mode == 1073741824) {
                    i15 = i41;
                }
                setMeasuredDimension(View.resolveSizeAndState(Math.max(i15 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i14, i13), resolveSizeAndState);
                if (z13) {
                    l(i12, i11);
                    return;
                }
                return;
            }
            View s13 = s(i34);
            if (s13 == null) {
                this.f13878f += y(i34);
                i23 = mode2;
                i32 = i36;
                i25 = virtualChildCount;
            } else {
                int i53 = i29;
                if (s13.getVisibility() == 8) {
                    i34 += p(s13, i34);
                    i32 = i36;
                    i29 = i53;
                    i25 = virtualChildCount;
                    i23 = mode2;
                } else {
                    if (t(i34)) {
                        this.f13878f += this.f13885m;
                    }
                    a aVar3 = (a) s13.getLayoutParams();
                    float f15 = ((LinearLayout.LayoutParams) aVar3).weight;
                    float f16 = f10 + f15;
                    if (mode2 == 1073741824 && ((LinearLayout.LayoutParams) aVar3).height == 0 && f15 > 0.0f) {
                        int i54 = this.f13878f;
                        this.f13878f = Math.max(i54, ((LinearLayout.LayoutParams) aVar3).topMargin + i54 + ((LinearLayout.LayoutParams) aVar3).bottomMargin);
                        max = i31;
                        view = s13;
                        i26 = i33;
                        z12 = true;
                        i21 = i53;
                        i22 = i30;
                        i23 = mode2;
                        i24 = i36;
                        i25 = virtualChildCount;
                        i27 = i34;
                    } else {
                        int i55 = i30;
                        if (((LinearLayout.LayoutParams) aVar3).height != 0 || f15 <= 0.0f) {
                            i20 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) aVar3).height = -2;
                            i20 = 0;
                        }
                        i21 = i53;
                        int i56 = i20;
                        i22 = i55;
                        int i57 = i31;
                        i23 = mode2;
                        i24 = i36;
                        i25 = virtualChildCount;
                        i26 = i33;
                        i27 = i34;
                        w(s13, i34, i10, 0, i11, f16 == 0.0f ? this.f13878f : 0);
                        if (i56 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) aVar3).height = i56;
                        }
                        int measuredHeight2 = s13.getMeasuredHeight();
                        int i58 = this.f13878f;
                        view = s13;
                        this.f13878f = Math.max(i58, i58 + measuredHeight2 + ((LinearLayout.LayoutParams) aVar3).topMargin + ((LinearLayout.LayoutParams) aVar3).bottomMargin + r(view));
                        max = z11 ? Math.max(measuredHeight2, i57) : i57;
                    }
                    if (i28 >= 0 && i28 == i27 + 1) {
                        this.f13875c = this.f13878f;
                    }
                    if (i27 < i28 && ((LinearLayout.LayoutParams) aVar3).weight > 0.0f) {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                    if (mode == 1073741824 || ((LinearLayout.LayoutParams) aVar3).width != -1) {
                        z10 = false;
                    } else {
                        z10 = true;
                        z13 = true;
                    }
                    int i59 = ((LinearLayout.LayoutParams) aVar3).leftMargin + ((LinearLayout.LayoutParams) aVar3).rightMargin;
                    int measuredWidth2 = view.getMeasuredWidth() + i59;
                    int max3 = Math.max(i22, measuredWidth2);
                    int combineMeasuredStates = View.combineMeasuredStates(i21, view.getMeasuredState());
                    z14 = z14 && ((LinearLayout.LayoutParams) aVar3).width == -1;
                    if (((LinearLayout.LayoutParams) aVar3).weight > 0.0f) {
                        if (!z10) {
                            i59 = measuredWidth2;
                        }
                        i32 = Math.max(i24, i59);
                    } else {
                        if (!z10) {
                            i59 = measuredWidth2;
                        }
                        i26 = Math.max(i26, i59);
                        i32 = i24;
                    }
                    int p10 = p(view, i27) + i27;
                    i31 = max;
                    i30 = max3;
                    f10 = f16;
                    i33 = i26;
                    i34 = p10;
                    i29 = combineMeasuredStates;
                }
            }
            i34++;
            virtualChildCount = i25;
            mode2 = i23;
        }
    }

    public T(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f13873a = true;
        this.f13874b = -1;
        this.f13875c = 0;
        this.f13877e = 8388659;
        h0 v10 = h0.v(context, attributeSet, AbstractC3179j.f33364a1, i10, 0);
        AbstractC1484a0.o0(this, context, AbstractC3179j.f33364a1, attributeSet, v10.r(), i10, 0);
        int k10 = v10.k(AbstractC3179j.f33374c1, -1);
        if (k10 >= 0) {
            setOrientation(k10);
        }
        int k11 = v10.k(AbstractC3179j.f33369b1, -1);
        if (k11 >= 0) {
            setGravity(k11);
        }
        boolean a10 = v10.a(AbstractC3179j.f33379d1, true);
        if (!a10) {
            setBaselineAligned(a10);
        }
        this.f13879g = v10.i(AbstractC3179j.f33389f1, -1.0f);
        this.f13874b = v10.k(AbstractC3179j.f33384e1, -1);
        this.f13880h = v10.a(AbstractC3179j.f33404i1, false);
        setDividerDrawable(v10.g(AbstractC3179j.f33394g1));
        this.f13886n = v10.k(AbstractC3179j.f33409j1, 0);
        this.f13887o = v10.f(AbstractC3179j.f33399h1, 0);
        v10.x();
    }
}
