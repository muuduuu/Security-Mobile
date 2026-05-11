package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.T;

/* loaded from: classes.dex */
public class ActionMenuView extends T implements e.b, androidx.appcompat.view.menu.k {

    /* renamed from: A, reason: collision with root package name */
    e f13676A;

    /* renamed from: p, reason: collision with root package name */
    private androidx.appcompat.view.menu.e f13677p;

    /* renamed from: q, reason: collision with root package name */
    private Context f13678q;

    /* renamed from: r, reason: collision with root package name */
    private int f13679r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f13680s;

    /* renamed from: t, reason: collision with root package name */
    private C1401c f13681t;

    /* renamed from: u, reason: collision with root package name */
    private j.a f13682u;

    /* renamed from: v, reason: collision with root package name */
    e.a f13683v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f13684w;

    /* renamed from: x, reason: collision with root package name */
    private int f13685x;

    /* renamed from: y, reason: collision with root package name */
    private int f13686y;

    /* renamed from: z, reason: collision with root package name */
    private int f13687z;

    public interface a {
        boolean a();

        boolean b();
    }

    private static class b implements j.a {
        b() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void c(androidx.appcompat.view.menu.e eVar, boolean z10) {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean d(androidx.appcompat.view.menu.e eVar) {
            return false;
        }
    }

    public static class c extends T.a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f13688a;

        /* renamed from: b, reason: collision with root package name */
        public int f13689b;

        /* renamed from: c, reason: collision with root package name */
        public int f13690c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f13691d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f13692e;

        /* renamed from: f, reason: collision with root package name */
        boolean f13693f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super((ViewGroup.LayoutParams) cVar);
            this.f13688a = cVar.f13688a;
        }

        public c(int i10, int i11) {
            super(i10, i11);
            this.f13688a = false;
        }
    }

    private class d implements e.a {
        d() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            e eVar2 = ActionMenuView.this.f13676A;
            return eVar2 != null && eVar2.onMenuItemClick(menuItem);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            e.a aVar = ActionMenuView.this.f13683v;
            if (aVar != null) {
                aVar.b(eVar);
            }
        }
    }

    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    static int L(View view, int i10, int i11, int i12, int i13) {
        int i14;
        c cVar = (c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i12) - i13, View.MeasureSpec.getMode(i12));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z10 = false;
        boolean z11 = actionMenuItemView != null && actionMenuItemView.s();
        if (i11 > 0) {
            i14 = 2;
            if (!z11 || i11 >= 2) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i11 * i10, Integer.MIN_VALUE), makeMeasureSpec);
                int measuredWidth = view.getMeasuredWidth();
                int i15 = measuredWidth / i10;
                if (measuredWidth % i10 != 0) {
                    i15++;
                }
                if (!z11 || i15 >= 2) {
                    i14 = i15;
                }
                if (!cVar.f13688a && z11) {
                    z10 = true;
                }
                cVar.f13691d = z10;
                cVar.f13689b = i14;
                view.measure(View.MeasureSpec.makeMeasureSpec(i10 * i14, 1073741824), makeMeasureSpec);
                return i14;
            }
        }
        i14 = 0;
        if (!cVar.f13688a) {
            z10 = true;
        }
        cVar.f13691d = z10;
        cVar.f13689b = i14;
        view.measure(View.MeasureSpec.makeMeasureSpec(i10 * i14, 1073741824), makeMeasureSpec);
        return i14;
    }

    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v14 */
    private void M(int i10, int i11) {
        int i12;
        int i13;
        boolean z10;
        int i14;
        int i15;
        boolean z11;
        boolean z12;
        int i16;
        ?? r14;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, paddingTop, -2);
        int i17 = size - paddingLeft;
        int i18 = this.f13686y;
        int i19 = i17 / i18;
        int i20 = i17 % i18;
        if (i19 == 0) {
            setMeasuredDimension(i17, 0);
            return;
        }
        int i21 = i18 + (i20 / i19);
        int childCount = getChildCount();
        int i22 = 0;
        int i23 = 0;
        boolean z13 = false;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        long j10 = 0;
        while (i23 < childCount) {
            View childAt = getChildAt(i23);
            int i27 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z14 = childAt instanceof ActionMenuItemView;
                int i28 = i24 + 1;
                if (z14) {
                    int i29 = this.f13687z;
                    i16 = i28;
                    r14 = 0;
                    childAt.setPadding(i29, 0, i29, 0);
                } else {
                    i16 = i28;
                    r14 = 0;
                }
                c cVar = (c) childAt.getLayoutParams();
                cVar.f13693f = r14;
                cVar.f13690c = r14;
                cVar.f13689b = r14;
                cVar.f13691d = r14;
                ((LinearLayout.LayoutParams) cVar).leftMargin = r14;
                ((LinearLayout.LayoutParams) cVar).rightMargin = r14;
                cVar.f13692e = z14 && ((ActionMenuItemView) childAt).s();
                int L10 = L(childAt, i21, cVar.f13688a ? 1 : i19, childMeasureSpec, paddingTop);
                i25 = Math.max(i25, L10);
                if (cVar.f13691d) {
                    i26++;
                }
                if (cVar.f13688a) {
                    z13 = true;
                }
                i19 -= L10;
                i22 = Math.max(i22, childAt.getMeasuredHeight());
                if (L10 == 1) {
                    j10 |= 1 << i23;
                    i22 = i22;
                }
                i24 = i16;
            }
            i23++;
            size2 = i27;
        }
        int i30 = size2;
        boolean z15 = z13 && i24 == 2;
        boolean z16 = false;
        while (i26 > 0 && i19 > 0) {
            int i31 = Integer.MAX_VALUE;
            int i32 = 0;
            int i33 = 0;
            long j11 = 0;
            while (i33 < childCount) {
                boolean z17 = z16;
                c cVar2 = (c) getChildAt(i33).getLayoutParams();
                int i34 = i22;
                if (cVar2.f13691d) {
                    int i35 = cVar2.f13689b;
                    if (i35 < i31) {
                        j11 = 1 << i33;
                        i31 = i35;
                        i32 = 1;
                    } else if (i35 == i31) {
                        i32++;
                        j11 |= 1 << i33;
                    }
                }
                i33++;
                i22 = i34;
                z16 = z17;
            }
            z10 = z16;
            i14 = i22;
            j10 |= j11;
            if (i32 > i19) {
                i12 = mode;
                i13 = i17;
                break;
            }
            int i36 = i31 + 1;
            int i37 = 0;
            while (i37 < childCount) {
                View childAt2 = getChildAt(i37);
                c cVar3 = (c) childAt2.getLayoutParams();
                int i38 = i17;
                int i39 = mode;
                long j12 = 1 << i37;
                if ((j11 & j12) == 0) {
                    if (cVar3.f13689b == i36) {
                        j10 |= j12;
                    }
                    z12 = z15;
                } else {
                    if (z15 && cVar3.f13692e && i19 == 1) {
                        int i40 = this.f13687z;
                        z12 = z15;
                        childAt2.setPadding(i40 + i21, 0, i40, 0);
                    } else {
                        z12 = z15;
                    }
                    cVar3.f13689b++;
                    cVar3.f13693f = true;
                    i19--;
                }
                i37++;
                mode = i39;
                i17 = i38;
                z15 = z12;
            }
            i22 = i14;
            z16 = true;
        }
        i12 = mode;
        i13 = i17;
        z10 = z16;
        i14 = i22;
        boolean z18 = !z13 && i24 == 1;
        if (i19 <= 0 || j10 == 0 || (i19 >= i24 - 1 && !z18 && i25 <= 1)) {
            i15 = 0;
            z11 = z10;
        } else {
            float bitCount = Long.bitCount(j10);
            if (z18) {
                i15 = 0;
            } else {
                i15 = 0;
                if ((j10 & 1) != 0 && !((c) getChildAt(0).getLayoutParams()).f13692e) {
                    bitCount -= 0.5f;
                }
                int i41 = childCount - 1;
                if ((j10 & (1 << i41)) != 0 && !((c) getChildAt(i41).getLayoutParams()).f13692e) {
                    bitCount -= 0.5f;
                }
            }
            int i42 = bitCount > 0.0f ? (int) ((i19 * i21) / bitCount) : i15;
            z11 = z10;
            for (int i43 = i15; i43 < childCount; i43++) {
                if ((j10 & (1 << i43)) != 0) {
                    View childAt3 = getChildAt(i43);
                    c cVar4 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar4.f13690c = i42;
                        cVar4.f13693f = true;
                        if (i43 == 0 && !cVar4.f13692e) {
                            ((LinearLayout.LayoutParams) cVar4).leftMargin = (-i42) / 2;
                        }
                        z11 = true;
                    } else if (cVar4.f13688a) {
                        cVar4.f13690c = i42;
                        cVar4.f13693f = true;
                        ((LinearLayout.LayoutParams) cVar4).rightMargin = (-i42) / 2;
                        z11 = true;
                    } else {
                        if (i43 != 0) {
                            ((LinearLayout.LayoutParams) cVar4).leftMargin = i42 / 2;
                        }
                        if (i43 != childCount - 1) {
                            ((LinearLayout.LayoutParams) cVar4).rightMargin = i42 / 2;
                        }
                    }
                }
            }
        }
        if (z11) {
            for (int i44 = i15; i44 < childCount; i44++) {
                View childAt4 = getChildAt(i44);
                c cVar5 = (c) childAt4.getLayoutParams();
                if (cVar5.f13693f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar5.f13689b * i21) + cVar5.f13690c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i13, i12 != 1073741824 ? i14 : i30);
    }

    public void B() {
        C1401c c1401c = this.f13681t;
        if (c1401c != null) {
            c1401c.y();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.T
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public c generateDefaultLayoutParams() {
        c cVar = new c(-2, -2);
        ((LinearLayout.LayoutParams) cVar).gravity = 16;
        return cVar;
    }

    @Override // androidx.appcompat.widget.T
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public c generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.T
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        c cVar = layoutParams instanceof c ? new c((c) layoutParams) : new c(layoutParams);
        if (((LinearLayout.LayoutParams) cVar).gravity <= 0) {
            ((LinearLayout.LayoutParams) cVar).gravity = 16;
        }
        return cVar;
    }

    public c F() {
        c generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.f13688a = true;
        return generateDefaultLayoutParams;
    }

    protected boolean G(int i10) {
        boolean z10 = false;
        if (i10 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i10 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i10);
        if (i10 < getChildCount() && (childAt instanceof a)) {
            z10 = ((a) childAt).a();
        }
        return (i10 <= 0 || !(childAt2 instanceof a)) ? z10 : z10 | ((a) childAt2).b();
    }

    public boolean H() {
        C1401c c1401c = this.f13681t;
        return c1401c != null && c1401c.B();
    }

    public boolean I() {
        C1401c c1401c = this.f13681t;
        return c1401c != null && c1401c.D();
    }

    public boolean J() {
        C1401c c1401c = this.f13681t;
        return c1401c != null && c1401c.E();
    }

    public boolean K() {
        return this.f13680s;
    }

    public androidx.appcompat.view.menu.e N() {
        return this.f13677p;
    }

    public void O(j.a aVar, e.a aVar2) {
        this.f13682u = aVar;
        this.f13683v = aVar2;
    }

    public boolean P() {
        C1401c c1401c = this.f13681t;
        return c1401c != null && c1401c.K();
    }

    @Override // androidx.appcompat.view.menu.e.b
    public boolean a(androidx.appcompat.view.menu.g gVar) {
        return this.f13677p.M(gVar, 0);
    }

    @Override // androidx.appcompat.view.menu.k
    public void b(androidx.appcompat.view.menu.e eVar) {
        this.f13677p = eVar;
    }

    @Override // androidx.appcompat.widget.T, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.f13677p == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
            this.f13677p = eVar;
            eVar.S(new d());
            C1401c c1401c = new C1401c(context);
            this.f13681t = c1401c;
            c1401c.J(true);
            C1401c c1401c2 = this.f13681t;
            j.a aVar = this.f13682u;
            if (aVar == null) {
                aVar = new b();
            }
            c1401c2.h(aVar);
            this.f13677p.c(this.f13681t, this.f13678q);
            this.f13681t.H(this);
        }
        return this.f13677p;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f13681t.A();
    }

    public int getPopupTheme() {
        return this.f13679r;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C1401c c1401c = this.f13681t;
        if (c1401c != null) {
            c1401c.d(false);
            if (this.f13681t.E()) {
                this.f13681t.B();
                this.f13681t.K();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        B();
    }

    @Override // androidx.appcompat.widget.T, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int width;
        int i14;
        if (!this.f13684w) {
            super.onLayout(z10, i10, i11, i12, i13);
            return;
        }
        int childCount = getChildCount();
        int i15 = (i13 - i11) / 2;
        int dividerWidth = getDividerWidth();
        int i16 = i12 - i10;
        int paddingRight = (i16 - getPaddingRight()) - getPaddingLeft();
        boolean b10 = s0.b(this);
        int i17 = 0;
        int i18 = 0;
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt = getChildAt(i19);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f13688a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (G(i19)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (b10) {
                        i14 = getPaddingLeft() + ((LinearLayout.LayoutParams) cVar).leftMargin;
                        width = i14 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) cVar).rightMargin;
                        i14 = width - measuredWidth;
                    }
                    int i20 = i15 - (measuredHeight / 2);
                    childAt.layout(i14, i20, width, measuredHeight + i20);
                    paddingRight -= measuredWidth;
                    i17 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) cVar).leftMargin) + ((LinearLayout.LayoutParams) cVar).rightMargin;
                    G(i19);
                    i18++;
                }
            }
        }
        if (childCount == 1 && i17 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i21 = (i16 / 2) - (measuredWidth2 / 2);
            int i22 = i15 - (measuredHeight2 / 2);
            childAt2.layout(i21, i22, measuredWidth2 + i21, measuredHeight2 + i22);
            return;
        }
        int i23 = i18 - (i17 ^ 1);
        int max = Math.max(0, i23 > 0 ? paddingRight / i23 : 0);
        if (b10) {
            int width2 = getWidth() - getPaddingRight();
            for (int i24 = 0; i24 < childCount; i24++) {
                View childAt3 = getChildAt(i24);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f13688a) {
                    int i25 = width2 - ((LinearLayout.LayoutParams) cVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i26 = i15 - (measuredHeight3 / 2);
                    childAt3.layout(i25 - measuredWidth3, i26, i25, measuredHeight3 + i26);
                    width2 = i25 - ((measuredWidth3 + ((LinearLayout.LayoutParams) cVar2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i27 = 0; i27 < childCount; i27++) {
            View childAt4 = getChildAt(i27);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f13688a) {
                int i28 = paddingLeft + ((LinearLayout.LayoutParams) cVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i29 = i15 - (measuredHeight4 / 2);
                childAt4.layout(i28, i29, i28 + measuredWidth4, measuredHeight4 + i29);
                paddingLeft = i28 + measuredWidth4 + ((LinearLayout.LayoutParams) cVar3).rightMargin + max;
            }
        }
    }

    @Override // androidx.appcompat.widget.T, android.view.View
    protected void onMeasure(int i10, int i11) {
        androidx.appcompat.view.menu.e eVar;
        boolean z10 = this.f13684w;
        boolean z11 = View.MeasureSpec.getMode(i10) == 1073741824;
        this.f13684w = z11;
        if (z10 != z11) {
            this.f13685x = 0;
        }
        int size = View.MeasureSpec.getSize(i10);
        if (this.f13684w && (eVar = this.f13677p) != null && size != this.f13685x) {
            this.f13685x = size;
            eVar.L(true);
        }
        int childCount = getChildCount();
        if (this.f13684w && childCount > 0) {
            M(i10, i11);
            return;
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            c cVar = (c) getChildAt(i12).getLayoutParams();
            ((LinearLayout.LayoutParams) cVar).rightMargin = 0;
            ((LinearLayout.LayoutParams) cVar).leftMargin = 0;
        }
        super.onMeasure(i10, i11);
    }

    public void setExpandedActionViewsExclusive(boolean z10) {
        this.f13681t.G(z10);
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.f13676A = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f13681t.I(drawable);
    }

    public void setOverflowReserved(boolean z10) {
        this.f13680s = z10;
    }

    public void setPopupTheme(int i10) {
        if (this.f13679r != i10) {
            this.f13679r = i10;
            if (i10 == 0) {
                this.f13678q = getContext();
            } else {
                this.f13678q = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setPresenter(C1401c c1401c) {
        this.f13681t = c1401c;
        c1401c.H(this);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f13686y = (int) (56.0f * f10);
        this.f13687z = (int) (f10 * 4.0f);
        this.f13678q = context;
        this.f13679r = 0;
    }
}
