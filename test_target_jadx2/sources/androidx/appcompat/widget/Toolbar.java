package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.AbstractC1397a;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.AbstractC1484a0;
import androidx.core.view.AbstractC1518s;
import androidx.core.view.C1532z;
import androidx.core.view.InterfaceC1526w;
import co.hyperverge.hypersnapsdk.service.framerecorder.HVFrameRecorder;
import g.AbstractC3170a;
import g.AbstractC3179j;
import h.AbstractC3220a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup implements InterfaceC1526w {

    /* renamed from: A, reason: collision with root package name */
    private ColorStateList f13888A;

    /* renamed from: B, reason: collision with root package name */
    private boolean f13889B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f13890C;

    /* renamed from: D, reason: collision with root package name */
    private final ArrayList f13891D;

    /* renamed from: E, reason: collision with root package name */
    private final ArrayList f13892E;

    /* renamed from: F, reason: collision with root package name */
    private final int[] f13893F;

    /* renamed from: G, reason: collision with root package name */
    final C1532z f13894G;

    /* renamed from: H, reason: collision with root package name */
    private ArrayList f13895H;

    /* renamed from: I, reason: collision with root package name */
    h f13896I;

    /* renamed from: J, reason: collision with root package name */
    private final ActionMenuView.e f13897J;

    /* renamed from: K, reason: collision with root package name */
    private l0 f13898K;

    /* renamed from: a, reason: collision with root package name */
    ActionMenuView f13899a;

    /* renamed from: b, reason: collision with root package name */
    private TextView f13900b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f13901c;

    /* renamed from: d, reason: collision with root package name */
    private ImageButton f13902d;

    /* renamed from: e, reason: collision with root package name */
    private ImageView f13903e;

    /* renamed from: f, reason: collision with root package name */
    private Drawable f13904f;

    /* renamed from: g, reason: collision with root package name */
    private CharSequence f13905g;

    /* renamed from: h, reason: collision with root package name */
    ImageButton f13906h;

    /* renamed from: h0, reason: collision with root package name */
    private C1401c f13907h0;

    /* renamed from: i, reason: collision with root package name */
    View f13908i;

    /* renamed from: i0, reason: collision with root package name */
    private f f13909i0;

    /* renamed from: j, reason: collision with root package name */
    private Context f13910j;

    /* renamed from: j0, reason: collision with root package name */
    private j.a f13911j0;

    /* renamed from: k, reason: collision with root package name */
    private int f13912k;

    /* renamed from: k0, reason: collision with root package name */
    e.a f13913k0;

    /* renamed from: l, reason: collision with root package name */
    private int f13914l;

    /* renamed from: l0, reason: collision with root package name */
    private boolean f13915l0;

    /* renamed from: m, reason: collision with root package name */
    private int f13916m;

    /* renamed from: m0, reason: collision with root package name */
    private OnBackInvokedCallback f13917m0;

    /* renamed from: n, reason: collision with root package name */
    int f13918n;

    /* renamed from: n0, reason: collision with root package name */
    private OnBackInvokedDispatcher f13919n0;

    /* renamed from: o, reason: collision with root package name */
    private int f13920o;

    /* renamed from: o0, reason: collision with root package name */
    private boolean f13921o0;

    /* renamed from: p, reason: collision with root package name */
    private int f13922p;

    /* renamed from: p0, reason: collision with root package name */
    private final Runnable f13923p0;

    /* renamed from: q, reason: collision with root package name */
    private int f13924q;

    /* renamed from: r, reason: collision with root package name */
    private int f13925r;

    /* renamed from: s, reason: collision with root package name */
    private int f13926s;

    /* renamed from: t, reason: collision with root package name */
    private Z f13927t;

    /* renamed from: u, reason: collision with root package name */
    private int f13928u;

    /* renamed from: v, reason: collision with root package name */
    private int f13929v;

    /* renamed from: w, reason: collision with root package name */
    private int f13930w;

    /* renamed from: x, reason: collision with root package name */
    private CharSequence f13931x;

    /* renamed from: y, reason: collision with root package name */
    private CharSequence f13932y;

    /* renamed from: z, reason: collision with root package name */
    private ColorStateList f13933z;

    class a implements ActionMenuView.e {
        a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.e
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (Toolbar.this.f13894G.j(menuItem)) {
                return true;
            }
            h hVar = Toolbar.this.f13896I;
            if (hVar != null) {
                return hVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.Q();
        }
    }

    class c implements e.a {
        c() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            e.a aVar = Toolbar.this.f13913k0;
            return aVar != null && aVar.a(eVar, menuItem);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            if (!Toolbar.this.f13899a.J()) {
                Toolbar.this.f13894G.k(eVar);
            }
            e.a aVar = Toolbar.this.f13913k0;
            if (aVar != null) {
                aVar.b(eVar);
            }
        }
    }

    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.e();
        }
    }

    static class e {
        static OnBackInvokedDispatcher a(View view) {
            return view.findOnBackInvokedDispatcher();
        }

        static OnBackInvokedCallback b(final Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new OnBackInvokedCallback() { // from class: androidx.appcompat.widget.k0
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    runnable.run();
                }
            };
        }

        static void c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(HVFrameRecorder.BITRATE, (OnBackInvokedCallback) obj2);
        }

        static void d(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    private class f implements androidx.appcompat.view.menu.j {

        /* renamed from: a, reason: collision with root package name */
        androidx.appcompat.view.menu.e f13938a;

        /* renamed from: b, reason: collision with root package name */
        androidx.appcompat.view.menu.g f13939b;

        f() {
        }

        @Override // androidx.appcompat.view.menu.j
        public void c(androidx.appcompat.view.menu.e eVar, boolean z10) {
        }

        @Override // androidx.appcompat.view.menu.j
        public void d(boolean z10) {
            if (this.f13939b != null) {
                androidx.appcompat.view.menu.e eVar = this.f13938a;
                if (eVar != null) {
                    int size = eVar.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (this.f13938a.getItem(i10) == this.f13939b) {
                            return;
                        }
                    }
                }
                f(this.f13938a, this.f13939b);
            }
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean e() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean f(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            KeyEvent.Callback callback = Toolbar.this.f13908i;
            if (callback instanceof androidx.appcompat.view.c) {
                ((androidx.appcompat.view.c) callback).f();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f13908i);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f13906h);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f13908i = null;
            toolbar3.a();
            this.f13939b = null;
            Toolbar.this.requestLayout();
            gVar.r(false);
            Toolbar.this.R();
            return true;
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean g(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            Toolbar.this.g();
            ViewParent parent = Toolbar.this.f13906h.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f13906h);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f13906h);
            }
            Toolbar.this.f13908i = gVar.getActionView();
            this.f13939b = gVar;
            ViewParent parent2 = Toolbar.this.f13908i.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f13908i);
                }
                g generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                generateDefaultLayoutParams.f13148a = (toolbar4.f13918n & 112) | 8388611;
                generateDefaultLayoutParams.f13941b = 2;
                toolbar4.f13908i.setLayoutParams(generateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f13908i);
            }
            Toolbar.this.I();
            Toolbar.this.requestLayout();
            gVar.r(true);
            KeyEvent.Callback callback = Toolbar.this.f13908i;
            if (callback instanceof androidx.appcompat.view.c) {
                ((androidx.appcompat.view.c) callback).c();
            }
            Toolbar.this.R();
            return true;
        }

        @Override // androidx.appcompat.view.menu.j
        public void i(Context context, androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.g gVar;
            androidx.appcompat.view.menu.e eVar2 = this.f13938a;
            if (eVar2 != null && (gVar = this.f13939b) != null) {
                eVar2.f(gVar);
            }
            this.f13938a = eVar;
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean k(androidx.appcompat.view.menu.m mVar) {
            return false;
        }
    }

    public interface h {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public Toolbar(Context context) {
        this(context, null);
    }

    private int C(View view, int i10, int[] iArr, int i11) {
        g gVar = (g) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - iArr[0];
        int max = i10 + Math.max(0, i12);
        iArr[0] = Math.max(0, -i12);
        int q10 = q(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, q10, max + measuredWidth, view.getMeasuredHeight() + q10);
        return max + measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).rightMargin;
    }

    private int D(View view, int i10, int[] iArr, int i11) {
        g gVar = (g) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - iArr[1];
        int max = i10 - Math.max(0, i12);
        iArr[1] = Math.max(0, -i12);
        int q10 = q(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, q10, max, view.getMeasuredHeight() + q10);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).leftMargin);
    }

    private int E(View view, int i10, int i11, int i12, int i13, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i14 = marginLayoutParams.leftMargin - iArr[0];
        int i15 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i14) + Math.max(0, i15);
        iArr[0] = Math.max(0, -i14);
        iArr[1] = Math.max(0, -i15);
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + max + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    private void F(View view, int i10, int i11, int i12, int i13, int i14) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i14 >= 0) {
            if (mode != 0) {
                i14 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i14);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void G() {
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.f13894G.h(menu, getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f13895H = currentMenuItems2;
    }

    private void H() {
        removeCallbacks(this.f13923p0);
        post(this.f13923p0);
    }

    private boolean O() {
        if (!this.f13915l0) {
            return false;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (P(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean P(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private void b(List list, int i10) {
        boolean z10 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int b10 = AbstractC1518s.b(i10, getLayoutDirection());
        list.clear();
        if (!z10) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.f13941b == 0 && P(childAt) && p(gVar.f13148a) == b10) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i12 = childCount - 1; i12 >= 0; i12--) {
            View childAt2 = getChildAt(i12);
            g gVar2 = (g) childAt2.getLayoutParams();
            if (gVar2.f13941b == 0 && P(childAt2) && p(gVar2.f13148a) == b10) {
                list.add(childAt2);
            }
        }
    }

    private void c(View view, boolean z10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        g generateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (g) layoutParams;
        generateDefaultLayoutParams.f13941b = 1;
        if (!z10 || this.f13908i == null) {
            addView(view, generateDefaultLayoutParams);
        } else {
            view.setLayoutParams(generateDefaultLayoutParams);
            this.f13892E.add(view);
        }
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i10 = 0; i10 < menu.size(); i10++) {
            arrayList.add(menu.getItem(i10));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new androidx.appcompat.view.g(getContext());
    }

    private void h() {
        if (this.f13927t == null) {
            this.f13927t = new Z();
        }
    }

    private void i() {
        if (this.f13903e == null) {
            this.f13903e = new r(getContext());
        }
    }

    private void j() {
        k();
        if (this.f13899a.N() == null) {
            androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) this.f13899a.getMenu();
            if (this.f13909i0 == null) {
                this.f13909i0 = new f();
            }
            this.f13899a.setExpandedActionViewsExclusive(true);
            eVar.c(this.f13909i0, this.f13910j);
            R();
        }
    }

    private void k() {
        if (this.f13899a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f13899a = actionMenuView;
            actionMenuView.setPopupTheme(this.f13912k);
            this.f13899a.setOnMenuItemClickListener(this.f13897J);
            this.f13899a.O(this.f13911j0, new c());
            g generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f13148a = (this.f13918n & 112) | 8388613;
            this.f13899a.setLayoutParams(generateDefaultLayoutParams);
            c(this.f13899a, false);
        }
    }

    private void l() {
        if (this.f13902d == null) {
            this.f13902d = new C1414p(getContext(), null, AbstractC3170a.f33064L);
            g generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f13148a = (this.f13918n & 112) | 8388611;
            this.f13902d.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    private int p(int i10) {
        int layoutDirection = getLayoutDirection();
        int b10 = AbstractC1518s.b(i10, layoutDirection) & 7;
        return (b10 == 1 || b10 == 3 || b10 == 5) ? b10 : layoutDirection == 1 ? 5 : 3;
    }

    private int q(View view, int i10) {
        g gVar = (g) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i11 = i10 > 0 ? (measuredHeight - i10) / 2 : 0;
        int r10 = r(gVar.f13148a);
        if (r10 == 48) {
            return getPaddingTop() - i11;
        }
        if (r10 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin) - i11;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i12 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i13 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
        if (i12 < i13) {
            i12 = i13;
        } else {
            int i14 = (((height - paddingBottom) - measuredHeight) - i12) - paddingTop;
            int i15 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
            if (i14 < i15) {
                i12 = Math.max(0, i12 - (i15 - i14));
            }
        }
        return paddingTop + i12;
    }

    private int r(int i10) {
        int i11 = i10 & 112;
        return (i11 == 16 || i11 == 48 || i11 == 80) ? i11 : this.f13930w & 112;
    }

    private int s(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
    }

    private int t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private int u(List list, int[] iArr) {
        int i10 = iArr[0];
        int i11 = iArr[1];
        int size = list.size();
        int i12 = 0;
        int i13 = 0;
        while (i12 < size) {
            View view = (View) list.get(i12);
            g gVar = (g) view.getLayoutParams();
            int i14 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - i10;
            int i15 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - i11;
            int max = Math.max(0, i14);
            int max2 = Math.max(0, i15);
            int max3 = Math.max(0, -i14);
            int max4 = Math.max(0, -i15);
            i13 += max + view.getMeasuredWidth() + max2;
            i12++;
            i11 = max4;
            i10 = max3;
        }
        return i13;
    }

    private boolean z(View view) {
        return view.getParent() == this || this.f13892E.contains(view);
    }

    public boolean A() {
        ActionMenuView actionMenuView = this.f13899a;
        return actionMenuView != null && actionMenuView.I();
    }

    public boolean B() {
        ActionMenuView actionMenuView = this.f13899a;
        return actionMenuView != null && actionMenuView.J();
    }

    void I() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((g) childAt.getLayoutParams()).f13941b != 2 && childAt != this.f13899a) {
                removeViewAt(childCount);
                this.f13892E.add(childAt);
            }
        }
    }

    public void J(int i10, int i11) {
        h();
        this.f13927t.g(i10, i11);
    }

    public void K(androidx.appcompat.view.menu.e eVar, C1401c c1401c) {
        if (eVar == null && this.f13899a == null) {
            return;
        }
        k();
        androidx.appcompat.view.menu.e N10 = this.f13899a.N();
        if (N10 == eVar) {
            return;
        }
        if (N10 != null) {
            N10.P(this.f13907h0);
            N10.P(this.f13909i0);
        }
        if (this.f13909i0 == null) {
            this.f13909i0 = new f();
        }
        c1401c.G(true);
        if (eVar != null) {
            eVar.c(c1401c, this.f13910j);
            eVar.c(this.f13909i0, this.f13910j);
        } else {
            c1401c.i(this.f13910j, null);
            this.f13909i0.i(this.f13910j, null);
            c1401c.d(true);
            this.f13909i0.d(true);
        }
        this.f13899a.setPopupTheme(this.f13912k);
        this.f13899a.setPresenter(c1401c);
        this.f13907h0 = c1401c;
        R();
    }

    public void L(j.a aVar, e.a aVar2) {
        this.f13911j0 = aVar;
        this.f13913k0 = aVar2;
        ActionMenuView actionMenuView = this.f13899a;
        if (actionMenuView != null) {
            actionMenuView.O(aVar, aVar2);
        }
    }

    public void M(Context context, int i10) {
        this.f13916m = i10;
        TextView textView = this.f13901c;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    public void N(Context context, int i10) {
        this.f13914l = i10;
        TextView textView = this.f13900b;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    public boolean Q() {
        ActionMenuView actionMenuView = this.f13899a;
        return actionMenuView != null && actionMenuView.P();
    }

    void R() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a10 = e.a(this);
            boolean z10 = v() && a10 != null && isAttachedToWindow() && this.f13921o0;
            if (z10 && this.f13919n0 == null) {
                if (this.f13917m0 == null) {
                    this.f13917m0 = e.b(new Runnable() { // from class: androidx.appcompat.widget.i0
                        @Override // java.lang.Runnable
                        public final void run() {
                            Toolbar.this.e();
                        }
                    });
                }
                e.c(a10, this.f13917m0);
                this.f13919n0 = a10;
                return;
            }
            if (z10 || (onBackInvokedDispatcher = this.f13919n0) == null) {
                return;
            }
            e.d(onBackInvokedDispatcher, this.f13917m0);
            this.f13919n0 = null;
        }
    }

    void a() {
        for (int size = this.f13892E.size() - 1; size >= 0; size--) {
            addView((View) this.f13892E.get(size));
        }
        this.f13892E.clear();
    }

    @Override // androidx.core.view.InterfaceC1526w
    public void addMenuProvider(androidx.core.view.B b10) {
        this.f13894G.c(b10);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof g);
    }

    public boolean d() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f13899a) != null && actionMenuView.K();
    }

    public void e() {
        f fVar = this.f13909i0;
        androidx.appcompat.view.menu.g gVar = fVar == null ? null : fVar.f13939b;
        if (gVar != null) {
            gVar.collapseActionView();
        }
    }

    public void f() {
        ActionMenuView actionMenuView = this.f13899a;
        if (actionMenuView != null) {
            actionMenuView.B();
        }
    }

    void g() {
        if (this.f13906h == null) {
            C1414p c1414p = new C1414p(getContext(), null, AbstractC3170a.f33064L);
            this.f13906h = c1414p;
            c1414p.setImageDrawable(this.f13904f);
            this.f13906h.setContentDescription(this.f13905g);
            g generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f13148a = (this.f13918n & 112) | 8388611;
            generateDefaultLayoutParams.f13941b = 2;
            this.f13906h.setLayoutParams(generateDefaultLayoutParams);
            this.f13906h.setOnClickListener(new d());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f13906h;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f13906h;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        Z z10 = this.f13927t;
        if (z10 != null) {
            return z10.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i10 = this.f13929v;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        Z z10 = this.f13927t;
        if (z10 != null) {
            return z10.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        Z z10 = this.f13927t;
        if (z10 != null) {
            return z10.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        Z z10 = this.f13927t;
        if (z10 != null) {
            return z10.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i10 = this.f13928u;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.e N10;
        ActionMenuView actionMenuView = this.f13899a;
        return (actionMenuView == null || (N10 = actionMenuView.N()) == null || !N10.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f13929v, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f13928u, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f13903e;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f13903e;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        j();
        return this.f13899a.getMenu();
    }

    View getNavButtonView() {
        return this.f13902d;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f13902d;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f13902d;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    C1401c getOuterActionMenuPresenter() {
        return this.f13907h0;
    }

    public Drawable getOverflowIcon() {
        j();
        return this.f13899a.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.f13910j;
    }

    public int getPopupTheme() {
        return this.f13912k;
    }

    public CharSequence getSubtitle() {
        return this.f13932y;
    }

    final TextView getSubtitleTextView() {
        return this.f13901c;
    }

    public CharSequence getTitle() {
        return this.f13931x;
    }

    public int getTitleMarginBottom() {
        return this.f13926s;
    }

    public int getTitleMarginEnd() {
        return this.f13924q;
    }

    public int getTitleMarginStart() {
        return this.f13922p;
    }

    public int getTitleMarginTop() {
        return this.f13925r;
    }

    final TextView getTitleTextView() {
        return this.f13900b;
    }

    public J getWrapper() {
        if (this.f13898K == null) {
            this.f13898K = new l0(this, true);
        }
        return this.f13898K;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public g generateDefaultLayoutParams() {
        return new g(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public g generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public g generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof g ? new g((g) layoutParams) : layoutParams instanceof AbstractC1397a.C0243a ? new g((AbstractC1397a.C0243a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new g((ViewGroup.MarginLayoutParams) layoutParams) : new g(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        R();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f13923p0);
        R();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f13890C = false;
        }
        if (!this.f13890C) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f13890C = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f13890C = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02a1 A[LOOP:0: B:41:0x029f->B:42:0x02a1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02c3 A[LOOP:1: B:45:0x02c1->B:46:0x02c3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02fc A[LOOP:2: B:54:0x02fa->B:55:0x02fc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0227  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        boolean P10;
        boolean P11;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int paddingTop;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int size;
        int i28;
        int i29;
        int size2;
        int i30;
        int i31;
        int size3;
        boolean z11 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i32 = width - paddingRight;
        int[] iArr = this.f13893F;
        iArr[1] = 0;
        iArr[0] = 0;
        int B10 = AbstractC1484a0.B(this);
        int min = B10 >= 0 ? Math.min(B10, i13 - i11) : 0;
        if (!P(this.f13902d)) {
            i14 = paddingLeft;
        } else {
            if (z11) {
                i15 = D(this.f13902d, i32, iArr, min);
                i14 = paddingLeft;
                if (P(this.f13906h)) {
                    if (z11) {
                        i15 = D(this.f13906h, i15, iArr, min);
                    } else {
                        i14 = C(this.f13906h, i14, iArr, min);
                    }
                }
                if (P(this.f13899a)) {
                    if (z11) {
                        i14 = C(this.f13899a, i14, iArr, min);
                    } else {
                        i15 = D(this.f13899a, i15, iArr, min);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = Math.max(0, currentContentInsetLeft - i14);
                iArr[1] = Math.max(0, currentContentInsetRight - (i32 - i15));
                int max = Math.max(i14, currentContentInsetLeft);
                int min2 = Math.min(i15, i32 - currentContentInsetRight);
                if (P(this.f13908i)) {
                    if (z11) {
                        min2 = D(this.f13908i, min2, iArr, min);
                    } else {
                        max = C(this.f13908i, max, iArr, min);
                    }
                }
                if (P(this.f13903e)) {
                    if (z11) {
                        min2 = D(this.f13903e, min2, iArr, min);
                    } else {
                        max = C(this.f13903e, max, iArr, min);
                    }
                }
                P10 = P(this.f13900b);
                P11 = P(this.f13901c);
                if (P10) {
                    i16 = paddingRight;
                    i17 = 0;
                } else {
                    g gVar = (g) this.f13900b.getLayoutParams();
                    i16 = paddingRight;
                    i17 = ((ViewGroup.MarginLayoutParams) gVar).topMargin + this.f13900b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
                }
                if (P11) {
                    i18 = width;
                } else {
                    g gVar2 = (g) this.f13901c.getLayoutParams();
                    i18 = width;
                    i17 += ((ViewGroup.MarginLayoutParams) gVar2).topMargin + this.f13901c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gVar2).bottomMargin;
                }
                if (!P10 || P11) {
                    TextView textView = !P10 ? this.f13900b : this.f13901c;
                    TextView textView2 = !P11 ? this.f13901c : this.f13900b;
                    g gVar3 = (g) textView.getLayoutParams();
                    g gVar4 = (g) textView2.getLayoutParams();
                    boolean z12 = (!P10 && this.f13900b.getMeasuredWidth() > 0) || (P11 && this.f13901c.getMeasuredWidth() > 0);
                    i19 = this.f13930w & 112;
                    i20 = paddingLeft;
                    if (i19 != 48) {
                        i21 = max;
                        i22 = min;
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) gVar3).topMargin + this.f13925r;
                    } else if (i19 != 80) {
                        int i33 = (((height - paddingTop2) - paddingBottom) - i17) / 2;
                        int i34 = ((ViewGroup.MarginLayoutParams) gVar3).topMargin;
                        i22 = min;
                        int i35 = this.f13925r;
                        i21 = max;
                        if (i33 < i34 + i35) {
                            i33 = i34 + i35;
                        } else {
                            int i36 = (((height - paddingBottom) - i17) - i33) - paddingTop2;
                            int i37 = ((ViewGroup.MarginLayoutParams) gVar3).bottomMargin;
                            int i38 = this.f13926s;
                            if (i36 < i37 + i38) {
                                i33 = Math.max(0, i33 - ((((ViewGroup.MarginLayoutParams) gVar4).bottomMargin + i38) - i36));
                            }
                        }
                        paddingTop = paddingTop2 + i33;
                    } else {
                        i21 = max;
                        i22 = min;
                        paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) gVar4).bottomMargin) - this.f13926s) - i17;
                    }
                    if (z11) {
                        i23 = 0;
                        int i39 = (z12 ? this.f13922p : 0) - iArr[0];
                        max = i21 + Math.max(0, i39);
                        iArr[0] = Math.max(0, -i39);
                        if (P10) {
                            g gVar5 = (g) this.f13900b.getLayoutParams();
                            int measuredWidth = this.f13900b.getMeasuredWidth() + max;
                            int measuredHeight = this.f13900b.getMeasuredHeight() + paddingTop;
                            this.f13900b.layout(max, paddingTop, measuredWidth, measuredHeight);
                            i24 = measuredWidth + this.f13924q;
                            paddingTop = measuredHeight + ((ViewGroup.MarginLayoutParams) gVar5).bottomMargin;
                        } else {
                            i24 = max;
                        }
                        if (P11) {
                            int i40 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.f13901c.getLayoutParams())).topMargin;
                            int measuredWidth2 = this.f13901c.getMeasuredWidth() + max;
                            this.f13901c.layout(max, i40, measuredWidth2, this.f13901c.getMeasuredHeight() + i40);
                            i25 = measuredWidth2 + this.f13924q;
                        } else {
                            i25 = max;
                        }
                        if (z12) {
                            max = Math.max(i24, i25);
                        }
                        b(this.f13891D, 3);
                        size = this.f13891D.size();
                        i28 = max;
                        for (i29 = i23; i29 < size; i29++) {
                            i28 = C((View) this.f13891D.get(i29), i28, iArr, i22);
                        }
                        int i41 = i22;
                        b(this.f13891D, 5);
                        size2 = this.f13891D.size();
                        for (i30 = i23; i30 < size2; i30++) {
                            min2 = D((View) this.f13891D.get(i30), min2, iArr, i41);
                        }
                        b(this.f13891D, 1);
                        int u10 = u(this.f13891D, iArr);
                        i31 = (i20 + (((i18 - i20) - i16) / 2)) - (u10 / 2);
                        int i42 = u10 + i31;
                        if (i31 >= i28) {
                            i28 = i42 > min2 ? i31 - (i42 - min2) : i31;
                        }
                        size3 = this.f13891D.size();
                        while (i23 < size3) {
                            i28 = C((View) this.f13891D.get(i23), i28, iArr, i41);
                            i23++;
                        }
                        this.f13891D.clear();
                        return;
                    }
                    int i43 = (z12 ? this.f13922p : 0) - iArr[1];
                    min2 -= Math.max(0, i43);
                    iArr[1] = Math.max(0, -i43);
                    if (P10) {
                        g gVar6 = (g) this.f13900b.getLayoutParams();
                        int measuredWidth3 = min2 - this.f13900b.getMeasuredWidth();
                        int measuredHeight2 = this.f13900b.getMeasuredHeight() + paddingTop;
                        this.f13900b.layout(measuredWidth3, paddingTop, min2, measuredHeight2);
                        i26 = measuredWidth3 - this.f13924q;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) gVar6).bottomMargin;
                    } else {
                        i26 = min2;
                    }
                    if (P11) {
                        int i44 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.f13901c.getLayoutParams())).topMargin;
                        this.f13901c.layout(min2 - this.f13901c.getMeasuredWidth(), i44, min2, this.f13901c.getMeasuredHeight() + i44);
                        i27 = min2 - this.f13924q;
                    } else {
                        i27 = min2;
                    }
                    if (z12) {
                        min2 = Math.min(i26, i27);
                    }
                    max = i21;
                } else {
                    i20 = paddingLeft;
                    i22 = min;
                }
                i23 = 0;
                b(this.f13891D, 3);
                size = this.f13891D.size();
                i28 = max;
                while (i29 < size) {
                }
                int i412 = i22;
                b(this.f13891D, 5);
                size2 = this.f13891D.size();
                while (i30 < size2) {
                }
                b(this.f13891D, 1);
                int u102 = u(this.f13891D, iArr);
                i31 = (i20 + (((i18 - i20) - i16) / 2)) - (u102 / 2);
                int i422 = u102 + i31;
                if (i31 >= i28) {
                }
                size3 = this.f13891D.size();
                while (i23 < size3) {
                }
                this.f13891D.clear();
                return;
            }
            i14 = C(this.f13902d, paddingLeft, iArr, min);
        }
        i15 = i32;
        if (P(this.f13906h)) {
        }
        if (P(this.f13899a)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - i14);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i32 - i15));
        int max2 = Math.max(i14, currentContentInsetLeft2);
        int min22 = Math.min(i15, i32 - currentContentInsetRight2);
        if (P(this.f13908i)) {
        }
        if (P(this.f13903e)) {
        }
        P10 = P(this.f13900b);
        P11 = P(this.f13901c);
        if (P10) {
        }
        if (P11) {
        }
        if (P10) {
        }
        if (!P10) {
        }
        if (!P11) {
        }
        g gVar32 = (g) textView.getLayoutParams();
        g gVar42 = (g) textView2.getLayoutParams();
        if (P10) {
        }
        i19 = this.f13930w & 112;
        i20 = paddingLeft;
        if (i19 != 48) {
        }
        if (z11) {
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int[] iArr = this.f13893F;
        boolean b10 = s0.b(this);
        int i19 = !b10 ? 1 : 0;
        if (P(this.f13902d)) {
            F(this.f13902d, i10, 0, i11, 0, this.f13920o);
            i12 = this.f13902d.getMeasuredWidth() + s(this.f13902d);
            i13 = Math.max(0, this.f13902d.getMeasuredHeight() + t(this.f13902d));
            i14 = View.combineMeasuredStates(0, this.f13902d.getMeasuredState());
        } else {
            i12 = 0;
            i13 = 0;
            i14 = 0;
        }
        if (P(this.f13906h)) {
            F(this.f13906h, i10, 0, i11, 0, this.f13920o);
            i12 = this.f13906h.getMeasuredWidth() + s(this.f13906h);
            i13 = Math.max(i13, this.f13906h.getMeasuredHeight() + t(this.f13906h));
            i14 = View.combineMeasuredStates(i14, this.f13906h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i12);
        iArr[b10 ? 1 : 0] = Math.max(0, currentContentInsetStart - i12);
        if (P(this.f13899a)) {
            F(this.f13899a, i10, max, i11, 0, this.f13920o);
            i15 = this.f13899a.getMeasuredWidth() + s(this.f13899a);
            i13 = Math.max(i13, this.f13899a.getMeasuredHeight() + t(this.f13899a));
            i14 = View.combineMeasuredStates(i14, this.f13899a.getMeasuredState());
        } else {
            i15 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i15);
        iArr[i19] = Math.max(0, currentContentInsetEnd - i15);
        if (P(this.f13908i)) {
            max2 += E(this.f13908i, i10, max2, i11, 0, iArr);
            i13 = Math.max(i13, this.f13908i.getMeasuredHeight() + t(this.f13908i));
            i14 = View.combineMeasuredStates(i14, this.f13908i.getMeasuredState());
        }
        if (P(this.f13903e)) {
            max2 += E(this.f13903e, i10, max2, i11, 0, iArr);
            i13 = Math.max(i13, this.f13903e.getMeasuredHeight() + t(this.f13903e));
            i14 = View.combineMeasuredStates(i14, this.f13903e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt = getChildAt(i20);
            if (((g) childAt.getLayoutParams()).f13941b == 0 && P(childAt)) {
                max2 += E(childAt, i10, max2, i11, 0, iArr);
                i13 = Math.max(i13, childAt.getMeasuredHeight() + t(childAt));
                i14 = View.combineMeasuredStates(i14, childAt.getMeasuredState());
            }
        }
        int i21 = this.f13925r + this.f13926s;
        int i22 = this.f13922p + this.f13924q;
        if (P(this.f13900b)) {
            E(this.f13900b, i10, max2 + i22, i11, i21, iArr);
            int measuredWidth = this.f13900b.getMeasuredWidth() + s(this.f13900b);
            i16 = this.f13900b.getMeasuredHeight() + t(this.f13900b);
            i17 = View.combineMeasuredStates(i14, this.f13900b.getMeasuredState());
            i18 = measuredWidth;
        } else {
            i16 = 0;
            i17 = i14;
            i18 = 0;
        }
        if (P(this.f13901c)) {
            i18 = Math.max(i18, E(this.f13901c, i10, max2 + i22, i11, i16 + i21, iArr));
            i16 += this.f13901c.getMeasuredHeight() + t(this.f13901c);
            i17 = View.combineMeasuredStates(i17, this.f13901c.getMeasuredState());
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max2 + i18 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i10, (-16777216) & i17), O() ? 0 : View.resolveSizeAndState(Math.max(Math.max(i13, i16) + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i11, i17 << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.a());
        ActionMenuView actionMenuView = this.f13899a;
        androidx.appcompat.view.menu.e N10 = actionMenuView != null ? actionMenuView.N() : null;
        int i10 = iVar.f13942c;
        if (i10 != 0 && this.f13909i0 != null && N10 != null && (findItem = N10.findItem(i10)) != null) {
            findItem.expandActionView();
        }
        if (iVar.f13943d) {
            H();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        h();
        this.f13927t.f(i10 == 1);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.g gVar;
        i iVar = new i(super.onSaveInstanceState());
        f fVar = this.f13909i0;
        if (fVar != null && (gVar = fVar.f13939b) != null) {
            iVar.f13942c = gVar.getItemId();
        }
        iVar.f13943d = B();
        return iVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f13889B = false;
        }
        if (!this.f13889B) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f13889B = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f13889B = false;
        }
        return true;
    }

    @Override // androidx.core.view.InterfaceC1526w
    public void removeMenuProvider(androidx.core.view.B b10) {
        this.f13894G.l(b10);
    }

    public void setBackInvokedCallbackEnabled(boolean z10) {
        if (this.f13921o0 != z10) {
            this.f13921o0 = z10;
            R();
        }
    }

    public void setCollapseContentDescription(int i10) {
        setCollapseContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setCollapseIcon(int i10) {
        setCollapseIcon(AbstractC3220a.b(getContext(), i10));
    }

    public void setCollapsible(boolean z10) {
        this.f13915l0 = z10;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.f13929v) {
            this.f13929v = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.f13928u) {
            this.f13928u = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i10) {
        setLogo(AbstractC3220a.b(getContext(), i10));
    }

    public void setLogoDescription(int i10) {
        setLogoDescription(getContext().getText(i10));
    }

    public void setNavigationContentDescription(int i10) {
        setNavigationContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setNavigationIcon(int i10) {
        setNavigationIcon(AbstractC3220a.b(getContext(), i10));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        l();
        this.f13902d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(h hVar) {
        this.f13896I = hVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        j();
        this.f13899a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i10) {
        if (this.f13912k != i10) {
            this.f13912k = i10;
            if (i10 == 0) {
                this.f13910j = getContext();
            } else {
                this.f13910j = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setSubtitle(int i10) {
        setSubtitle(getContext().getText(i10));
    }

    public void setSubtitleTextColor(int i10) {
        setSubtitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setTitle(int i10) {
        setTitle(getContext().getText(i10));
    }

    public void setTitleMarginBottom(int i10) {
        this.f13926s = i10;
        requestLayout();
    }

    public void setTitleMarginEnd(int i10) {
        this.f13924q = i10;
        requestLayout();
    }

    public void setTitleMarginStart(int i10) {
        this.f13922p = i10;
        requestLayout();
    }

    public void setTitleMarginTop(int i10) {
        this.f13925r = i10;
        requestLayout();
    }

    public void setTitleTextColor(int i10) {
        setTitleTextColor(ColorStateList.valueOf(i10));
    }

    public boolean v() {
        f fVar = this.f13909i0;
        return (fVar == null || fVar.f13939b == null) ? false : true;
    }

    public boolean w() {
        ActionMenuView actionMenuView = this.f13899a;
        return actionMenuView != null && actionMenuView.H();
    }

    public void x(int i10) {
        getMenuInflater().inflate(i10, getMenu());
    }

    public void y() {
        Iterator it = this.f13895H.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        G();
    }

    public static class g extends AbstractC1397a.C0243a {

        /* renamed from: b, reason: collision with root package name */
        int f13941b;

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f13941b = 0;
        }

        void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public g(int i10, int i11) {
            super(i10, i11);
            this.f13941b = 0;
            this.f13148a = 8388627;
        }

        public g(g gVar) {
            super((AbstractC1397a.C0243a) gVar);
            this.f13941b = 0;
            this.f13941b = gVar.f13941b;
        }

        public g(AbstractC1397a.C0243a c0243a) {
            super(c0243a);
            this.f13941b = 0;
        }

        public g(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f13941b = 0;
            a(marginLayoutParams);
        }

        public g(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f13941b = 0;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC3170a.f33065M);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageButton imageButton = this.f13906h;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            this.f13906h.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.f13906h;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.f13904f);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            i();
            if (!z(this.f13903e)) {
                c(this.f13903e, true);
            }
        } else {
            ImageView imageView = this.f13903e;
            if (imageView != null && z(imageView)) {
                removeView(this.f13903e);
                this.f13892E.remove(this.f13903e);
            }
        }
        ImageView imageView2 = this.f13903e;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            i();
        }
        ImageView imageView = this.f13903e;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            l();
        }
        ImageButton imageButton = this.f13902d;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            m0.a(this.f13902d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            l();
            if (!z(this.f13902d)) {
                c(this.f13902d, true);
            }
        } else {
            ImageButton imageButton = this.f13902d;
            if (imageButton != null && z(imageButton)) {
                removeView(this.f13902d);
                this.f13892E.remove(this.f13902d);
            }
        }
        ImageButton imageButton2 = this.f13902d;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f13901c;
            if (textView != null && z(textView)) {
                removeView(this.f13901c);
                this.f13892E.remove(this.f13901c);
            }
        } else {
            if (this.f13901c == null) {
                Context context = getContext();
                D d10 = new D(context);
                this.f13901c = d10;
                d10.setSingleLine();
                this.f13901c.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f13916m;
                if (i10 != 0) {
                    this.f13901c.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.f13888A;
                if (colorStateList != null) {
                    this.f13901c.setTextColor(colorStateList);
                }
            }
            if (!z(this.f13901c)) {
                c(this.f13901c, true);
            }
        }
        TextView textView2 = this.f13901c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f13932y = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f13888A = colorStateList;
        TextView textView = this.f13901c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f13900b;
            if (textView != null && z(textView)) {
                removeView(this.f13900b);
                this.f13892E.remove(this.f13900b);
            }
        } else {
            if (this.f13900b == null) {
                Context context = getContext();
                D d10 = new D(context);
                this.f13900b = d10;
                d10.setSingleLine();
                this.f13900b.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f13914l;
                if (i10 != 0) {
                    this.f13900b.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.f13933z;
                if (colorStateList != null) {
                    this.f13900b.setTextColor(colorStateList);
                }
            }
            if (!z(this.f13900b)) {
                c(this.f13900b, true);
            }
        }
        TextView textView2 = this.f13900b;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f13931x = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f13933z = colorStateList;
        TextView textView = this.f13900b;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public static class i extends F0.a {
        public static final Parcelable.Creator<i> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        int f13942c;

        /* renamed from: d, reason: collision with root package name */
        boolean f13943d;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public i createFromParcel(Parcel parcel) {
                return new i(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public i createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new i(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public i[] newArray(int i10) {
                return new i[i10];
            }
        }

        public i(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f13942c = parcel.readInt();
            this.f13943d = parcel.readInt() != 0;
        }

        @Override // F0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f13942c);
            parcel.writeInt(this.f13943d ? 1 : 0);
        }

        public i(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f13930w = 8388627;
        this.f13891D = new ArrayList();
        this.f13892E = new ArrayList();
        this.f13893F = new int[2];
        this.f13894G = new C1532z(new Runnable() { // from class: androidx.appcompat.widget.j0
            @Override // java.lang.Runnable
            public final void run() {
                Toolbar.this.y();
            }
        });
        this.f13895H = new ArrayList();
        this.f13897J = new a();
        this.f13923p0 = new b();
        h0 v10 = h0.v(getContext(), attributeSet, AbstractC3179j.f33381d3, i10, 0);
        AbstractC1484a0.o0(this, context, AbstractC3179j.f33381d3, attributeSet, v10.r(), i10, 0);
        this.f13914l = v10.n(AbstractC3179j.f33269F3, 0);
        this.f13916m = v10.n(AbstractC3179j.f33476w3, 0);
        this.f13930w = v10.l(AbstractC3179j.f33386e3, this.f13930w);
        this.f13918n = v10.l(AbstractC3179j.f33391f3, 48);
        int e10 = v10.e(AbstractC3179j.f33491z3, 0);
        e10 = v10.s(AbstractC3179j.f33264E3) ? v10.e(AbstractC3179j.f33264E3, e10) : e10;
        this.f13926s = e10;
        this.f13925r = e10;
        this.f13924q = e10;
        this.f13922p = e10;
        int e11 = v10.e(AbstractC3179j.f33254C3, -1);
        if (e11 >= 0) {
            this.f13922p = e11;
        }
        int e12 = v10.e(AbstractC3179j.f33249B3, -1);
        if (e12 >= 0) {
            this.f13924q = e12;
        }
        int e13 = v10.e(AbstractC3179j.f33259D3, -1);
        if (e13 >= 0) {
            this.f13925r = e13;
        }
        int e14 = v10.e(AbstractC3179j.f33244A3, -1);
        if (e14 >= 0) {
            this.f13926s = e14;
        }
        this.f13920o = v10.f(AbstractC3179j.f33446q3, -1);
        int e15 = v10.e(AbstractC3179j.f33426m3, Integer.MIN_VALUE);
        int e16 = v10.e(AbstractC3179j.f33406i3, Integer.MIN_VALUE);
        int f10 = v10.f(AbstractC3179j.f33416k3, 0);
        int f11 = v10.f(AbstractC3179j.f33421l3, 0);
        h();
        this.f13927t.e(f10, f11);
        if (e15 != Integer.MIN_VALUE || e16 != Integer.MIN_VALUE) {
            this.f13927t.g(e15, e16);
        }
        this.f13928u = v10.e(AbstractC3179j.f33431n3, Integer.MIN_VALUE);
        this.f13929v = v10.e(AbstractC3179j.f33411j3, Integer.MIN_VALUE);
        this.f13904f = v10.g(AbstractC3179j.f33401h3);
        this.f13905g = v10.p(AbstractC3179j.f33396g3);
        CharSequence p10 = v10.p(AbstractC3179j.f33486y3);
        if (!TextUtils.isEmpty(p10)) {
            setTitle(p10);
        }
        CharSequence p11 = v10.p(AbstractC3179j.f33471v3);
        if (!TextUtils.isEmpty(p11)) {
            setSubtitle(p11);
        }
        this.f13910j = getContext();
        setPopupTheme(v10.n(AbstractC3179j.f33466u3, 0));
        Drawable g10 = v10.g(AbstractC3179j.f33461t3);
        if (g10 != null) {
            setNavigationIcon(g10);
        }
        CharSequence p12 = v10.p(AbstractC3179j.f33456s3);
        if (!TextUtils.isEmpty(p12)) {
            setNavigationContentDescription(p12);
        }
        Drawable g11 = v10.g(AbstractC3179j.f33436o3);
        if (g11 != null) {
            setLogo(g11);
        }
        CharSequence p13 = v10.p(AbstractC3179j.f33441p3);
        if (!TextUtils.isEmpty(p13)) {
            setLogoDescription(p13);
        }
        if (v10.s(AbstractC3179j.f33274G3)) {
            setTitleTextColor(v10.c(AbstractC3179j.f33274G3));
        }
        if (v10.s(AbstractC3179j.f33481x3)) {
            setSubtitleTextColor(v10.c(AbstractC3179j.f33481x3));
        }
        if (v10.s(AbstractC3179j.f33451r3)) {
            x(v10.n(AbstractC3179j.f33451r3, 0));
        }
        v10.x();
    }
}
