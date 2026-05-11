package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.view.C1504k0;
import g.AbstractC3170a;
import i.AbstractC3306a;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
class P extends ListView {

    /* renamed from: a, reason: collision with root package name */
    private final Rect f13767a;

    /* renamed from: b, reason: collision with root package name */
    private int f13768b;

    /* renamed from: c, reason: collision with root package name */
    private int f13769c;

    /* renamed from: d, reason: collision with root package name */
    private int f13770d;

    /* renamed from: e, reason: collision with root package name */
    private int f13771e;

    /* renamed from: f, reason: collision with root package name */
    private int f13772f;

    /* renamed from: g, reason: collision with root package name */
    private d f13773g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f13774h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f13775i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f13776j;

    /* renamed from: k, reason: collision with root package name */
    private C1504k0 f13777k;

    /* renamed from: l, reason: collision with root package name */
    private androidx.core.widget.h f13778l;

    /* renamed from: m, reason: collision with root package name */
    f f13779m;

    static class a {
        static void a(View view, float f10, float f11) {
            view.drawableHotspotChanged(f10, f11);
        }
    }

    static class b {

        /* renamed from: a, reason: collision with root package name */
        private static Method f13780a;

        /* renamed from: b, reason: collision with root package name */
        private static Method f13781b;

        /* renamed from: c, reason: collision with root package name */
        private static Method f13782c;

        /* renamed from: d, reason: collision with root package name */
        private static boolean f13783d;

        static {
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Boolean.TYPE;
                Class cls3 = Float.TYPE;
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
                f13780a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
                f13781b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
                f13782c = declaredMethod3;
                declaredMethod3.setAccessible(true);
                f13783d = true;
            } catch (NoSuchMethodException e10) {
                e10.printStackTrace();
            }
        }

        static boolean a() {
            return f13783d;
        }

        static void b(P p10, int i10, View view) {
            try {
                f13780a.invoke(p10, Integer.valueOf(i10), view, Boolean.FALSE, -1, -1);
                f13781b.invoke(p10, Integer.valueOf(i10));
                f13782c.invoke(p10, Integer.valueOf(i10));
            } catch (IllegalAccessException e10) {
                e10.printStackTrace();
            } catch (InvocationTargetException e11) {
                e11.printStackTrace();
            }
        }
    }

    static class c {
        static boolean a(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        static void b(AbsListView absListView, boolean z10) {
            absListView.setSelectedChildViewEnabled(z10);
        }
    }

    private static class d extends AbstractC3306a {

        /* renamed from: b, reason: collision with root package name */
        private boolean f13784b;

        d(Drawable drawable) {
            super(drawable);
            this.f13784b = true;
        }

        void b(boolean z10) {
            this.f13784b = z10;
        }

        @Override // i.AbstractC3306a, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f13784b) {
                super.draw(canvas);
            }
        }

        @Override // i.AbstractC3306a, android.graphics.drawable.Drawable
        public void setHotspot(float f10, float f11) {
            if (this.f13784b) {
                super.setHotspot(f10, f11);
            }
        }

        @Override // i.AbstractC3306a, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i10, int i11, int i12, int i13) {
            if (this.f13784b) {
                super.setHotspotBounds(i10, i11, i12, i13);
            }
        }

        @Override // i.AbstractC3306a, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f13784b) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // i.AbstractC3306a, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z10, boolean z11) {
            if (this.f13784b) {
                return super.setVisible(z10, z11);
            }
            return false;
        }
    }

    static class e {

        /* renamed from: a, reason: collision with root package name */
        private static final Field f13785a;

        static {
            Field field = null;
            try {
                field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                field.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                e10.printStackTrace();
            }
            f13785a = field;
        }

        static boolean a(AbsListView absListView) {
            Field field = f13785a;
            if (field == null) {
                return false;
            }
            try {
                return field.getBoolean(absListView);
            } catch (IllegalAccessException e10) {
                e10.printStackTrace();
                return false;
            }
        }

        static void b(AbsListView absListView, boolean z10) {
            Field field = f13785a;
            if (field != null) {
                try {
                    field.set(absListView, Boolean.valueOf(z10));
                } catch (IllegalAccessException e10) {
                    e10.printStackTrace();
                }
            }
        }
    }

    private class f implements Runnable {
        f() {
        }

        public void a() {
            P p10 = P.this;
            p10.f13779m = null;
            p10.removeCallbacks(this);
        }

        public void b() {
            P.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            P p10 = P.this;
            p10.f13779m = null;
            p10.drawableStateChanged();
        }
    }

    P(Context context, boolean z10) {
        super(context, null, AbstractC3170a.f33090y);
        this.f13767a = new Rect();
        this.f13768b = 0;
        this.f13769c = 0;
        this.f13770d = 0;
        this.f13771e = 0;
        this.f13775i = z10;
        setCacheColorHint(0);
    }

    private void a() {
        this.f13776j = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f13772f - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        C1504k0 c1504k0 = this.f13777k;
        if (c1504k0 != null) {
            c1504k0.c();
            this.f13777k = null;
        }
    }

    private void b(View view, int i10) {
        performItemClick(view, i10, getItemIdAtPosition(i10));
    }

    private void c(Canvas canvas) {
        Drawable selector;
        if (this.f13767a.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.f13767a);
        selector.draw(canvas);
    }

    private void f(int i10, View view) {
        Rect rect = this.f13767a;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f13768b;
        rect.top -= this.f13769c;
        rect.right += this.f13770d;
        rect.bottom += this.f13771e;
        boolean k10 = k();
        if (view.isEnabled() != k10) {
            l(!k10);
            if (i10 != -1) {
                refreshDrawableState();
            }
        }
    }

    private void g(int i10, View view) {
        Drawable selector = getSelector();
        boolean z10 = (selector == null || i10 == -1) ? false : true;
        if (z10) {
            selector.setVisible(false, false);
        }
        f(i10, view);
        if (z10) {
            Rect rect = this.f13767a;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            selector.setVisible(getVisibility() == 0, false);
            androidx.core.graphics.drawable.a.e(selector, exactCenterX, exactCenterY);
        }
    }

    private void h(int i10, View view, float f10, float f11) {
        g(i10, view);
        Drawable selector = getSelector();
        if (selector == null || i10 == -1) {
            return;
        }
        androidx.core.graphics.drawable.a.e(selector, f10, f11);
    }

    private void i(View view, int i10, float f10, float f11) {
        View childAt;
        this.f13776j = true;
        a.a(this, f10, f11);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i11 = this.f13772f;
        if (i11 != -1 && (childAt = getChildAt(i11 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f13772f = i10;
        a.a(view, f10 - view.getLeft(), f11 - view.getTop());
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        h(i10, view, f10, f11);
        j(false);
        refreshDrawableState();
    }

    private void j(boolean z10) {
        d dVar = this.f13773g;
        if (dVar != null) {
            dVar.b(z10);
        }
    }

    private boolean k() {
        return Build.VERSION.SDK_INT >= 33 ? c.a(this) : e.a(this);
    }

    private void l(boolean z10) {
        if (Build.VERSION.SDK_INT >= 33) {
            c.b(this, z10);
        } else {
            e.b(this, z10);
        }
    }

    private boolean m() {
        return this.f13776j;
    }

    private void n() {
        Drawable selector = getSelector();
        if (selector != null && m() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    public int d(int i10, int i11, int i12, int i13, int i14) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i15 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        View view = null;
        while (i16 < count) {
            int itemViewType = adapter.getItemViewType(i16);
            if (itemViewType != i17) {
                view = null;
                i17 = itemViewType;
            }
            view = adapter.getView(i16, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i19 = layoutParams.height;
            view.measure(i10, i19 > 0 ? View.MeasureSpec.makeMeasureSpec(i19, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i16 > 0) {
                i15 += dividerHeight;
            }
            i15 += view.getMeasuredHeight();
            if (i15 >= i13) {
                return (i14 < 0 || i16 <= i14 || i18 <= 0 || i15 == i13) ? i13 : i18;
            }
            if (i14 >= 0 && i16 >= i14) {
                i18 = i15;
            }
            i16++;
        }
        return i15;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        c(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.f13779m != null) {
            return;
        }
        super.drawableStateChanged();
        j(true);
        n();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000c, code lost:
    
        if (r0 != 3) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0048 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean e(MotionEvent motionEvent, int i10) {
        boolean z10;
        boolean z11;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            z10 = false;
        } else if (actionMasked == 2) {
            z10 = true;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i10);
        if (findPointerIndex >= 0) {
            int x10 = (int) motionEvent.getX(findPointerIndex);
            int y10 = (int) motionEvent.getY(findPointerIndex);
            int pointToPosition = pointToPosition(x10, y10);
            if (pointToPosition != -1) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                i(childAt, pointToPosition, x10, y10);
                if (actionMasked == 1) {
                    b(childAt, pointToPosition);
                }
                z10 = true;
                z11 = false;
                if (z10) {
                }
                a();
                if (z10) {
                }
                return z10;
            }
            z11 = true;
            if (z10 || z11) {
                a();
            }
            if (z10) {
                if (this.f13778l == null) {
                    this.f13778l = new androidx.core.widget.h(this);
                }
                this.f13778l.m(true);
                this.f13778l.onTouch(this, motionEvent);
            } else {
                androidx.core.widget.h hVar = this.f13778l;
                if (hVar != null) {
                    hVar.m(false);
                }
            }
            return z10;
        }
        z11 = false;
        z10 = false;
        if (z10) {
        }
        a();
        if (z10) {
        }
        return z10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f13775i || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f13775i || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f13775i || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f13775i && this.f13774h) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f13779m = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f13779m == null) {
            f fVar = new f();
            this.f13779m = fVar;
            fVar.b();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i10 < 30 || !b.a()) {
                        setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                    } else {
                        b.b(this, pointToPosition, childAt);
                    }
                }
                n();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f13772f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        f fVar = this.f13779m;
        if (fVar != null) {
            fVar.a();
        }
        return super.onTouchEvent(motionEvent);
    }

    void setListSelectionHidden(boolean z10) {
        this.f13774h = z10;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        d dVar = drawable != null ? new d(drawable) : null;
        this.f13773g = dVar;
        super.setSelector(dVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f13768b = rect.left;
        this.f13769c = rect.top;
        this.f13770d = rect.right;
        this.f13771e = rect.bottom;
    }
}
