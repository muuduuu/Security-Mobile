package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import g.AbstractC3170a;
import g.AbstractC3179j;
import java.lang.reflect.Method;
import l.InterfaceC3588e;

/* loaded from: classes.dex */
public class U implements InterfaceC3588e {

    /* renamed from: G, reason: collision with root package name */
    private static Method f13944G;

    /* renamed from: H, reason: collision with root package name */
    private static Method f13945H;

    /* renamed from: A, reason: collision with root package name */
    private Runnable f13946A;

    /* renamed from: B, reason: collision with root package name */
    final Handler f13947B;

    /* renamed from: C, reason: collision with root package name */
    private final Rect f13948C;

    /* renamed from: D, reason: collision with root package name */
    private Rect f13949D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f13950E;

    /* renamed from: F, reason: collision with root package name */
    PopupWindow f13951F;

    /* renamed from: a, reason: collision with root package name */
    private Context f13952a;

    /* renamed from: b, reason: collision with root package name */
    private ListAdapter f13953b;

    /* renamed from: c, reason: collision with root package name */
    P f13954c;

    /* renamed from: d, reason: collision with root package name */
    private int f13955d;

    /* renamed from: e, reason: collision with root package name */
    private int f13956e;

    /* renamed from: f, reason: collision with root package name */
    private int f13957f;

    /* renamed from: g, reason: collision with root package name */
    private int f13958g;

    /* renamed from: h, reason: collision with root package name */
    private int f13959h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f13960i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f13961j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f13962k;

    /* renamed from: l, reason: collision with root package name */
    private int f13963l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f13964m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f13965n;

    /* renamed from: o, reason: collision with root package name */
    int f13966o;

    /* renamed from: p, reason: collision with root package name */
    private View f13967p;

    /* renamed from: q, reason: collision with root package name */
    private int f13968q;

    /* renamed from: r, reason: collision with root package name */
    private DataSetObserver f13969r;

    /* renamed from: s, reason: collision with root package name */
    private View f13970s;

    /* renamed from: t, reason: collision with root package name */
    private Drawable f13971t;

    /* renamed from: u, reason: collision with root package name */
    private AdapterView.OnItemClickListener f13972u;

    /* renamed from: v, reason: collision with root package name */
    private AdapterView.OnItemSelectedListener f13973v;

    /* renamed from: w, reason: collision with root package name */
    final i f13974w;

    /* renamed from: x, reason: collision with root package name */
    private final h f13975x;

    /* renamed from: y, reason: collision with root package name */
    private final g f13976y;

    /* renamed from: z, reason: collision with root package name */
    private final e f13977z;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View t10 = U.this.t();
            if (t10 == null || t10.getWindowToken() == null) {
                return;
            }
            U.this.b();
        }
    }

    class b implements AdapterView.OnItemSelectedListener {
        b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            P p10;
            if (i10 == -1 || (p10 = U.this.f13954c) == null) {
                return;
            }
            p10.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    static class c {
        static int a(PopupWindow popupWindow, View view, int i10, boolean z10) {
            return popupWindow.getMaxAvailableHeight(view, i10, z10);
        }
    }

    static class d {
        static void a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        static void b(PopupWindow popupWindow, boolean z10) {
            popupWindow.setIsClippedToScreen(z10);
        }
    }

    private class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            U.this.r();
        }
    }

    private class f extends DataSetObserver {
        f() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (U.this.a()) {
                U.this.b();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            U.this.dismiss();
        }
    }

    private class g implements AbsListView.OnScrollListener {
        g() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i10) {
            if (i10 != 1 || U.this.A() || U.this.f13951F.getContentView() == null) {
                return;
            }
            U u10 = U.this;
            u10.f13947B.removeCallbacks(u10.f13974w);
            U.this.f13974w.run();
        }
    }

    private class h implements View.OnTouchListener {
        h() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = U.this.f13951F) != null && popupWindow.isShowing() && x10 >= 0 && x10 < U.this.f13951F.getWidth() && y10 >= 0 && y10 < U.this.f13951F.getHeight()) {
                U u10 = U.this;
                u10.f13947B.postDelayed(u10.f13974w, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            U u11 = U.this;
            u11.f13947B.removeCallbacks(u11.f13974w);
            return false;
        }
    }

    private class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            P p10 = U.this.f13954c;
            if (p10 == null || !p10.isAttachedToWindow() || U.this.f13954c.getCount() <= U.this.f13954c.getChildCount()) {
                return;
            }
            int childCount = U.this.f13954c.getChildCount();
            U u10 = U.this;
            if (childCount <= u10.f13966o) {
                u10.f13951F.setInputMethodMode(2);
                U.this.b();
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f13944G = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f13945H = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public U(Context context) {
        this(context, null, AbstractC3170a.f33055C);
    }

    private void C() {
        View view = this.f13967p;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f13967p);
            }
        }
    }

    private void N(boolean z10) {
        if (Build.VERSION.SDK_INT > 28) {
            d.b(this.f13951F, z10);
            return;
        }
        Method method = f13944G;
        if (method != null) {
            try {
                method.invoke(this.f13951F, Boolean.valueOf(z10));
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    private int q() {
        int i10;
        int i11;
        int makeMeasureSpec;
        int i12;
        if (this.f13954c == null) {
            Context context = this.f13952a;
            this.f13946A = new a();
            P s10 = s(context, !this.f13950E);
            this.f13954c = s10;
            Drawable drawable = this.f13971t;
            if (drawable != null) {
                s10.setSelector(drawable);
            }
            this.f13954c.setAdapter(this.f13953b);
            this.f13954c.setOnItemClickListener(this.f13972u);
            this.f13954c.setFocusable(true);
            this.f13954c.setFocusableInTouchMode(true);
            this.f13954c.setOnItemSelectedListener(new b());
            this.f13954c.setOnScrollListener(this.f13976y);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f13973v;
            if (onItemSelectedListener != null) {
                this.f13954c.setOnItemSelectedListener(onItemSelectedListener);
            }
            View view = this.f13954c;
            View view2 = this.f13967p;
            if (view2 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i13 = this.f13968q;
                if (i13 == 0) {
                    linearLayout.addView(view2);
                    linearLayout.addView(view, layoutParams);
                } else if (i13 != 1) {
                    Log.e("ListPopupWindow", "Invalid hint position " + this.f13968q);
                } else {
                    linearLayout.addView(view, layoutParams);
                    linearLayout.addView(view2);
                }
                int i14 = this.f13956e;
                if (i14 >= 0) {
                    i12 = Integer.MIN_VALUE;
                } else {
                    i14 = 0;
                    i12 = 0;
                }
                view2.measure(View.MeasureSpec.makeMeasureSpec(i14, i12), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                i10 = view2.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                i10 = 0;
            }
            this.f13951F.setContentView(view);
        } else {
            View view3 = this.f13967p;
            if (view3 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view3.getLayoutParams();
                i10 = view3.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                i10 = 0;
            }
        }
        Drawable background = this.f13951F.getBackground();
        if (background != null) {
            background.getPadding(this.f13948C);
            Rect rect = this.f13948C;
            int i15 = rect.top;
            i11 = rect.bottom + i15;
            if (!this.f13960i) {
                this.f13958g = -i15;
            }
        } else {
            this.f13948C.setEmpty();
            i11 = 0;
        }
        int u10 = u(t(), this.f13958g, this.f13951F.getInputMethodMode() == 2);
        if (this.f13964m || this.f13955d == -1) {
            return u10 + i11;
        }
        int i16 = this.f13956e;
        if (i16 == -2) {
            int i17 = this.f13952a.getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.f13948C;
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i17 - (rect2.left + rect2.right), Integer.MIN_VALUE);
        } else if (i16 != -1) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16, 1073741824);
        } else {
            int i18 = this.f13952a.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.f13948C;
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i18 - (rect3.left + rect3.right), 1073741824);
        }
        int d10 = this.f13954c.d(makeMeasureSpec, 0, -1, u10 - i10, -1);
        if (d10 > 0) {
            i10 += i11 + this.f13954c.getPaddingTop() + this.f13954c.getPaddingBottom();
        }
        return d10 + i10;
    }

    private int u(View view, int i10, boolean z10) {
        return c.a(this.f13951F, view, i10, z10);
    }

    public boolean A() {
        return this.f13951F.getInputMethodMode() == 2;
    }

    public boolean B() {
        return this.f13950E;
    }

    public void D(View view) {
        this.f13970s = view;
    }

    public void E(int i10) {
        this.f13951F.setAnimationStyle(i10);
    }

    public void F(int i10) {
        Drawable background = this.f13951F.getBackground();
        if (background == null) {
            Q(i10);
            return;
        }
        background.getPadding(this.f13948C);
        Rect rect = this.f13948C;
        this.f13956e = rect.left + rect.right + i10;
    }

    public void G(int i10) {
        this.f13963l = i10;
    }

    public void H(Rect rect) {
        this.f13949D = rect != null ? new Rect(rect) : null;
    }

    public void I(int i10) {
        this.f13951F.setInputMethodMode(i10);
    }

    public void J(boolean z10) {
        this.f13950E = z10;
        this.f13951F.setFocusable(z10);
    }

    public void K(PopupWindow.OnDismissListener onDismissListener) {
        this.f13951F.setOnDismissListener(onDismissListener);
    }

    public void L(AdapterView.OnItemClickListener onItemClickListener) {
        this.f13972u = onItemClickListener;
    }

    public void M(boolean z10) {
        this.f13962k = true;
        this.f13961j = z10;
    }

    public void O(int i10) {
        this.f13968q = i10;
    }

    public void P(int i10) {
        P p10 = this.f13954c;
        if (!a() || p10 == null) {
            return;
        }
        p10.setListSelectionHidden(false);
        p10.setSelection(i10);
        if (p10.getChoiceMode() != 0) {
            p10.setItemChecked(i10, true);
        }
    }

    public void Q(int i10) {
        this.f13956e = i10;
    }

    @Override // l.InterfaceC3588e
    public boolean a() {
        return this.f13951F.isShowing();
    }

    @Override // l.InterfaceC3588e
    public void b() {
        int q10 = q();
        boolean A10 = A();
        androidx.core.widget.j.b(this.f13951F, this.f13959h);
        if (this.f13951F.isShowing()) {
            if (t().isAttachedToWindow()) {
                int i10 = this.f13956e;
                if (i10 == -1) {
                    i10 = -1;
                } else if (i10 == -2) {
                    i10 = t().getWidth();
                }
                int i11 = this.f13955d;
                if (i11 == -1) {
                    if (!A10) {
                        q10 = -1;
                    }
                    if (A10) {
                        this.f13951F.setWidth(this.f13956e == -1 ? -1 : 0);
                        this.f13951F.setHeight(0);
                    } else {
                        this.f13951F.setWidth(this.f13956e == -1 ? -1 : 0);
                        this.f13951F.setHeight(-1);
                    }
                } else if (i11 != -2) {
                    q10 = i11;
                }
                this.f13951F.setOutsideTouchable((this.f13965n || this.f13964m) ? false : true);
                this.f13951F.update(t(), this.f13957f, this.f13958g, i10 < 0 ? -1 : i10, q10 < 0 ? -1 : q10);
                return;
            }
            return;
        }
        int i12 = this.f13956e;
        if (i12 == -1) {
            i12 = -1;
        } else if (i12 == -2) {
            i12 = t().getWidth();
        }
        int i13 = this.f13955d;
        if (i13 == -1) {
            q10 = -1;
        } else if (i13 != -2) {
            q10 = i13;
        }
        this.f13951F.setWidth(i12);
        this.f13951F.setHeight(q10);
        N(true);
        this.f13951F.setOutsideTouchable((this.f13965n || this.f13964m) ? false : true);
        this.f13951F.setTouchInterceptor(this.f13975x);
        if (this.f13962k) {
            androidx.core.widget.j.a(this.f13951F, this.f13961j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f13945H;
            if (method != null) {
                try {
                    method.invoke(this.f13951F, this.f13949D);
                } catch (Exception e10) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e10);
                }
            }
        } else {
            d.a(this.f13951F, this.f13949D);
        }
        androidx.core.widget.j.c(this.f13951F, t(), this.f13957f, this.f13958g, this.f13963l);
        this.f13954c.setSelection(-1);
        if (!this.f13950E || this.f13954c.isInTouchMode()) {
            r();
        }
        if (this.f13950E) {
            return;
        }
        this.f13947B.post(this.f13977z);
    }

    public void c(Drawable drawable) {
        this.f13951F.setBackgroundDrawable(drawable);
    }

    public int d() {
        return this.f13957f;
    }

    @Override // l.InterfaceC3588e
    public void dismiss() {
        this.f13951F.dismiss();
        C();
        this.f13951F.setContentView(null);
        this.f13954c = null;
        this.f13947B.removeCallbacks(this.f13974w);
    }

    public void f(int i10) {
        this.f13957f = i10;
    }

    public Drawable i() {
        return this.f13951F.getBackground();
    }

    @Override // l.InterfaceC3588e
    public ListView j() {
        return this.f13954c;
    }

    public void l(int i10) {
        this.f13958g = i10;
        this.f13960i = true;
    }

    public int o() {
        if (this.f13960i) {
            return this.f13958g;
        }
        return 0;
    }

    public void p(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f13969r;
        if (dataSetObserver == null) {
            this.f13969r = new f();
        } else {
            ListAdapter listAdapter2 = this.f13953b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f13953b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f13969r);
        }
        P p10 = this.f13954c;
        if (p10 != null) {
            p10.setAdapter(this.f13953b);
        }
    }

    public void r() {
        P p10 = this.f13954c;
        if (p10 != null) {
            p10.setListSelectionHidden(true);
            p10.requestLayout();
        }
    }

    P s(Context context, boolean z10) {
        return new P(context, z10);
    }

    public View t() {
        return this.f13970s;
    }

    public Object v() {
        if (a()) {
            return this.f13954c.getSelectedItem();
        }
        return null;
    }

    public long w() {
        if (a()) {
            return this.f13954c.getSelectedItemId();
        }
        return Long.MIN_VALUE;
    }

    public int x() {
        if (a()) {
            return this.f13954c.getSelectedItemPosition();
        }
        return -1;
    }

    public View y() {
        if (a()) {
            return this.f13954c.getSelectedView();
        }
        return null;
    }

    public int z() {
        return this.f13956e;
    }

    public U(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public U(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f13955d = -2;
        this.f13956e = -2;
        this.f13959h = 1002;
        this.f13963l = 0;
        this.f13964m = false;
        this.f13965n = false;
        this.f13966o = Integer.MAX_VALUE;
        this.f13968q = 0;
        this.f13974w = new i();
        this.f13975x = new h();
        this.f13976y = new g();
        this.f13977z = new e();
        this.f13948C = new Rect();
        this.f13952a = context;
        this.f13947B = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC3179j.f33419l1, i10, i11);
        this.f13957f = obtainStyledAttributes.getDimensionPixelOffset(AbstractC3179j.f33424m1, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(AbstractC3179j.f33429n1, 0);
        this.f13958g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f13960i = true;
        }
        obtainStyledAttributes.recycle();
        C1417t c1417t = new C1417t(context, attributeSet, i10, i11);
        this.f13951F = c1417t;
        c1417t.setInputMethodMode(1);
    }
}
