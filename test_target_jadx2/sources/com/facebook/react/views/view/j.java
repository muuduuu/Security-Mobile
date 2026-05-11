package com.facebook.react.views.view;

import a5.C1351a;
import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.animation.Animation;
import c3.AbstractC1721a;
import c5.C1729b;
import com.facebook.react.AbstractC1899n;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.A0;
import com.facebook.react.uimanager.AbstractC1954l0;
import com.facebook.react.uimanager.B0;
import com.facebook.react.uimanager.C1931a;
import com.facebook.react.uimanager.C1932a0;
import com.facebook.react.uimanager.C1944g0;
import com.facebook.react.uimanager.EnumC1946h0;
import com.facebook.react.uimanager.InterfaceC1952k0;
import com.facebook.react.uimanager.InterfaceC1962p0;
import com.facebook.react.uimanager.InterfaceC1964q0;
import com.facebook.react.uimanager.InterfaceC1979y0;
import com.facebook.react.uimanager.Q;
import com.facebook.react.uimanager.X;
import com.facebook.react.uimanager.Y;
import com.facebook.react.uimanager.b1;
import e5.C3079a;
import e5.C3085g;
import e5.C3086h;
import e5.EnumC3081c;
import e5.EnumC3083e;
import java.util.List;
import r4.AbstractC4012a;

/* loaded from: classes2.dex */
public class j extends ViewGroup implements Y4.d, InterfaceC1952k0, InterfaceC1964q0, Y4.c, InterfaceC1979y0, InterfaceC1962p0 {
    private static final int ARRAY_CAPACITY_INCREMENT = 12;
    private static final int DEFAULT_BACKGROUND_COLOR = 0;
    private static final ViewGroup.LayoutParams sDefaultLayoutParam = new ViewGroup.LayoutParams(0, 0);
    private static final Rect sHelperRect = new Rect();
    private View[] mAllChildren;
    private int mAllChildrenCount;
    private float mBackfaceOpacity;
    private String mBackfaceVisibility;
    private C1729b mCSSBackgroundDrawable;
    private b mChildrenLayoutChangeListener;
    private Rect mClippingRect;
    private b1 mDrawingOrderHelper;
    private Rect mHitSlopRect;
    private boolean mNeedsOffscreenAlphaCompositing;
    private Y4.b mOnInterceptTouchEventListener;
    private e5.k mOverflow;
    private final Rect mOverflowInset;
    private Path mPath;
    private EnumC1946h0 mPointerEvents;
    private boolean mRemoveClippedSubviews;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22996a;

        static {
            int[] iArr = new int[e5.k.values().length];
            f22996a = iArr;
            try {
                iArr[e5.k.HIDDEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22996a[e5.k.SCROLL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22996a[e5.k.VISIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static final class b implements View.OnLayoutChangeListener {

        /* renamed from: a, reason: collision with root package name */
        private final j f22997a;

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            if (this.f22997a.getRemoveClippedSubviews()) {
                this.f22997a.q(view);
            }
        }

        private b(j jVar) {
            this.f22997a = jVar;
        }
    }

    public j(Context context) {
        super(context);
        this.mOverflowInset = new Rect();
        l();
    }

    private void e(View view, int i10) {
        View[] viewArr = (View[]) AbstractC4012a.c(this.mAllChildren);
        int i11 = this.mAllChildrenCount;
        int length = viewArr.length;
        if (i10 == i11) {
            if (length == i11) {
                View[] viewArr2 = new View[length + 12];
                this.mAllChildren = viewArr2;
                System.arraycopy(viewArr, 0, viewArr2, 0, length);
                viewArr = this.mAllChildren;
            }
            int i12 = this.mAllChildrenCount;
            this.mAllChildrenCount = i12 + 1;
            viewArr[i12] = view;
            return;
        }
        if (i10 >= i11) {
            throw new IndexOutOfBoundsException("index=" + i10 + " count=" + i11);
        }
        if (length == i11) {
            View[] viewArr3 = new View[length + 12];
            this.mAllChildren = viewArr3;
            System.arraycopy(viewArr, 0, viewArr3, 0, i10);
            System.arraycopy(viewArr, i10, this.mAllChildren, i10 + 1, i11 - i10);
            viewArr = this.mAllChildren;
        } else {
            System.arraycopy(viewArr, i10, viewArr, i10 + 1, i11 - i10);
        }
        viewArr[i10] = view;
        this.mAllChildrenCount++;
    }

    private boolean f() {
        return getId() != -1 && C1351a.a(getId()) == 2;
    }

    private void g(Canvas canvas) {
        float f10;
        boolean z10;
        float f11;
        float f12;
        float f13;
        Path path;
        e5.k kVar = this.mOverflow;
        if (getTag(AbstractC1899n.f21894m) != null) {
            kVar = e5.k.HIDDEN;
        }
        int i10 = a.f22996a[kVar.ordinal()];
        if (i10 != 1 && i10 != 2) {
            if (i10 == 3 && (path = this.mPath) != null) {
                path.rewind();
                return;
            }
            return;
        }
        float width = getWidth();
        float height = getHeight();
        C1729b c1729b = this.mCSSBackgroundDrawable;
        float f14 = 0.0f;
        if (c1729b != null) {
            RectF m10 = c1729b.m();
            float f15 = m10.top;
            if (f15 > 0.0f || m10.left > 0.0f || m10.bottom > 0.0f || m10.right > 0.0f) {
                f11 = m10.left + 0.0f;
                f12 = f15 + 0.0f;
                width -= m10.right;
                height -= m10.bottom;
            } else {
                f12 = 0.0f;
                f11 = 0.0f;
            }
            C3085g l10 = this.mCSSBackgroundDrawable.l();
            if (l10.e()) {
                if (this.mPath == null) {
                    this.mPath = new Path();
                }
                C3086h c10 = l10.c().c();
                C3086h c11 = l10.d().c();
                C3086h c12 = l10.a().c();
                C3086h c13 = l10.b().c();
                this.mPath.rewind();
                f13 = f12;
                this.mPath.addRoundRect(new RectF(f11, f12, width, height), new float[]{Math.max(c10.a() - m10.left, 0.0f), Math.max(c10.b() - m10.top, 0.0f), Math.max(c11.a() - m10.right, 0.0f), Math.max(c11.b() - m10.top, 0.0f), Math.max(c13.a() - m10.right, 0.0f), Math.max(c13.b() - m10.bottom, 0.0f), Math.max(c12.a() - m10.left, 0.0f), Math.max(c12.b() - m10.bottom, 0.0f)}, Path.Direction.CW);
                canvas.clipPath(this.mPath);
                z10 = true;
                f14 = f11;
                width = width;
                height = height;
            } else {
                f13 = f12;
                f14 = f11;
                z10 = false;
            }
            f10 = f13;
        } else {
            f10 = 0.0f;
            z10 = false;
        }
        if (z10) {
            return;
        }
        canvas.clipRect(new RectF(f14, f10, width, height));
    }

    private b1 getDrawingOrderHelper() {
        if (this.mDrawingOrderHelper == null) {
            this.mDrawingOrderHelper = new b1(this);
        }
        return this.mDrawingOrderHelper;
    }

    private void h(View view) {
        UiThreadUtil.assertOnUiThread();
        if (f()) {
            setChildrenDrawingOrderEnabled(false);
        } else {
            getDrawingOrderHelper().b(view);
            setChildrenDrawingOrderEnabled(getDrawingOrderHelper().d());
        }
    }

    private void i(View view) {
        UiThreadUtil.assertOnUiThread();
        if (f()) {
            setChildrenDrawingOrderEnabled(false);
        } else {
            if (indexOfChild(view) == -1) {
                return;
            }
            getDrawingOrderHelper().c(view);
            setChildrenDrawingOrderEnabled(getDrawingOrderHelper().d());
        }
    }

    private void j(int i10, int i11) {
        int i12 = i11 + i10;
        while (i10 < i12) {
            if (i10 < getChildCount()) {
                i(getChildAt(i10));
            }
            i10++;
        }
    }

    private int k(View view) {
        int i10 = this.mAllChildrenCount;
        View[] viewArr = (View[]) AbstractC4012a.c(this.mAllChildren);
        for (int i11 = 0; i11 < i10; i11++) {
            if (viewArr[i11] == view) {
                return i11;
            }
        }
        return -1;
    }

    private void l() {
        setClipChildren(false);
        this.mRemoveClippedSubviews = false;
        this.mAllChildren = null;
        this.mAllChildrenCount = 0;
        this.mClippingRect = null;
        this.mHitSlopRect = null;
        this.mOverflow = e5.k.VISIBLE;
        this.mPointerEvents = EnumC1946h0.AUTO;
        this.mChildrenLayoutChangeListener = null;
        this.mCSSBackgroundDrawable = null;
        this.mOnInterceptTouchEventListener = null;
        this.mNeedsOffscreenAlphaCompositing = false;
        this.mDrawingOrderHelper = null;
        this.mPath = null;
        this.mBackfaceOpacity = 1.0f;
        this.mBackfaceVisibility = "visible";
    }

    private boolean m() {
        if (!G4.a.b()) {
            return false;
        }
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            if (getChildAt(i10).getTag(AbstractC1899n.f21898q) != null) {
                return true;
            }
        }
        return false;
    }

    private void n(int i10) {
        View[] viewArr = (View[]) AbstractC4012a.c(this.mAllChildren);
        int i11 = this.mAllChildrenCount;
        if (i10 == i11 - 1) {
            int i12 = i11 - 1;
            this.mAllChildrenCount = i12;
            viewArr[i12] = null;
        } else {
            if (i10 < 0 || i10 >= i11) {
                throw new IndexOutOfBoundsException();
            }
            System.arraycopy(viewArr, i10 + 1, viewArr, i10, (i11 - i10) - 1);
            int i13 = this.mAllChildrenCount - 1;
            this.mAllChildrenCount = i13;
            viewArr[i13] = null;
        }
    }

    private void o(Rect rect) {
        AbstractC4012a.c(this.mAllChildren);
        int i10 = 0;
        for (int i11 = 0; i11 < this.mAllChildrenCount; i11++) {
            p(rect, i11, i10);
            if (this.mAllChildren[i11].getParent() == null) {
                i10++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void p(Rect rect, int i10, int i11) {
        UiThreadUtil.assertOnUiThread();
        U9.c cVar = ((View[]) AbstractC4012a.c(this.mAllChildren))[i10];
        Rect rect2 = sHelperRect;
        rect2.set(cVar.getLeft(), cVar.getTop(), cVar.getRight(), cVar.getBottom());
        boolean intersects = rect.intersects(rect2.left, rect2.top, rect2.right, rect2.bottom);
        Animation animation = cVar.getAnimation();
        boolean z10 = (animation == null || animation.hasEnded()) ? false : true;
        if (!intersects && cVar.getParent() != null && !z10) {
            removeViewInLayout(cVar);
        } else if (intersects && cVar.getParent() == null) {
            addViewInLayout(cVar, i10 - i11, sDefaultLayoutParam, true);
            invalidate();
        } else if (!intersects) {
            return;
        }
        if (cVar instanceof InterfaceC1952k0) {
            U9.c cVar2 = cVar;
            if (cVar2.getRemoveClippedSubviews()) {
                cVar2.updateClippingRect();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(View view) {
        if (!this.mRemoveClippedSubviews || getParent() == null) {
            return;
        }
        AbstractC4012a.c(this.mClippingRect);
        AbstractC4012a.c(this.mAllChildren);
        Rect rect = sHelperRect;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        if (this.mClippingRect.intersects(rect.left, rect.top, rect.right, rect.bottom) != (view.getParent() != null)) {
            int i10 = 0;
            for (int i11 = 0; i11 < this.mAllChildrenCount; i11++) {
                View view2 = this.mAllChildren[i11];
                if (view2 == view) {
                    p(this.mClippingRect, i11, i10);
                    return;
                } else {
                    if (view2.getParent() == null) {
                        i10++;
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        h(view);
        super.addView(view, i10, layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        h(view);
        return super.addViewInLayout(view, i10, layoutParams, z10);
    }

    void addViewWithSubviewClippingEnabled(View view, int i10) {
        addViewWithSubviewClippingEnabled(view, i10, sDefaultLayoutParam);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        if (G4.a.c()) {
            if (this.mOverflow != e5.k.VISIBLE || getTag(AbstractC1899n.f21894m) != null) {
                C1931a.a(this, canvas);
            }
            super.dispatchDraw(canvas);
            return;
        }
        try {
            g(canvas);
            super.dispatchDraw(canvas);
        } catch (NullPointerException | StackOverflowError e10) {
            A0 a10 = B0.a(this);
            if (a10 != null) {
                a10.a(e10);
            } else {
                if (!(getContext() instanceof ReactContext)) {
                    throw e10;
                }
                ((ReactContext) getContext()).handleException(new Q("StackOverflowException", this, e10));
            }
        }
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if (EnumC1946h0.canChildrenBeTouchTarget(this.mPointerEvents)) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideStructure(ViewStructure viewStructure) {
        try {
            super.dispatchProvideStructure(viewStructure);
        } catch (NullPointerException e10) {
            AbstractC1721a.n("ReactNative", "NullPointerException when executing dispatchProvideStructure", e10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSetPressed(boolean z10) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        if (Build.VERSION.SDK_INT < 29 || C1351a.c(this) != 2 || !m()) {
            super.draw(canvas);
            return;
        }
        Rect overflowInset = getOverflowInset();
        canvas.saveLayer(overflowInset.left, overflowInset.top, getWidth() + (-overflowInset.right), getHeight() + (-overflowInset.bottom), null);
        super.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j10) {
        BlendMode blendMode;
        boolean z10 = view.getElevation() > 0.0f;
        if (z10) {
            c.a(canvas, true);
        }
        if (Build.VERSION.SDK_INT < 29 || !m()) {
            blendMode = null;
        } else {
            blendMode = h.a(view.getTag(AbstractC1899n.f21898q));
            if (blendMode != null) {
                Paint paint = new Paint();
                paint.setBlendMode(blendMode);
                Rect overflowInset = getOverflowInset();
                canvas.saveLayer(overflowInset.left, overflowInset.top, getWidth() + (-overflowInset.right), getHeight() + (-overflowInset.bottom), paint);
            }
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (blendMode != null) {
            canvas.restore();
        }
        if (z10) {
            c.a(canvas, false);
        }
        return drawChild;
    }

    int getAllChildrenCount() {
        return this.mAllChildrenCount;
    }

    public int getBackgroundColor() {
        if (!G4.a.c()) {
            if (getBackground() != null) {
                return ((C1729b) getBackground()).k();
            }
            return 0;
        }
        Integer d10 = C1931a.d(this);
        if (d10 == null) {
            return 0;
        }
        return d10.intValue();
    }

    View getChildAtWithSubviewClippingEnabled(int i10) {
        if (i10 < 0 || i10 >= this.mAllChildrenCount) {
            return null;
        }
        return ((View[]) AbstractC4012a.c(this.mAllChildren))[i10];
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i10, int i11) {
        UiThreadUtil.assertOnUiThread();
        return !f() ? getDrawingOrderHelper().a(i10, i11) : i11;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean getChildVisibleRect(View view, Rect rect, Point point) {
        return super.getChildVisibleRect(view, rect, point);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1952k0
    public void getClippingRect(Rect rect) {
        rect.set(this.mClippingRect);
    }

    @Override // Y4.c
    public Rect getHitSlopRect() {
        return this.mHitSlopRect;
    }

    C1729b getOrCreateReactViewBackground() {
        if (this.mCSSBackgroundDrawable == null) {
            this.mCSSBackgroundDrawable = new C1729b(getContext());
            Drawable background = getBackground();
            updateBackgroundDrawable(null);
            if (background == null) {
                updateBackgroundDrawable(this.mCSSBackgroundDrawable);
            } else {
                updateBackgroundDrawable(new LayerDrawable(new Drawable[]{this.mCSSBackgroundDrawable, background}));
            }
            if (!G4.a.o()) {
                this.mCSSBackgroundDrawable.F(com.facebook.react.modules.i18nmanager.a.f().i(getContext()) ? 1 : 0);
            }
        }
        return this.mCSSBackgroundDrawable;
    }

    @Override // com.facebook.react.uimanager.InterfaceC1960o0
    public String getOverflow() {
        int i10 = a.f22996a[this.mOverflow.ordinal()];
        if (i10 == 1) {
            return "hidden";
        }
        if (i10 == 2) {
            return "scroll";
        }
        if (i10 != 3) {
            return null;
        }
        return "visible";
    }

    @Override // com.facebook.react.uimanager.InterfaceC1962p0
    public Rect getOverflowInset() {
        return this.mOverflowInset;
    }

    @Override // com.facebook.react.uimanager.InterfaceC1964q0
    public EnumC1946h0 getPointerEvents() {
        return this.mPointerEvents;
    }

    @Override // com.facebook.react.uimanager.InterfaceC1952k0
    public boolean getRemoveClippedSubviews() {
        return this.mRemoveClippedSubviews;
    }

    @Override // com.facebook.react.uimanager.InterfaceC1979y0
    public int getZIndexMappedChildIndex(int i10) {
        UiThreadUtil.assertOnUiThread();
        return (f() || !getDrawingOrderHelper().d()) ? i10 : getDrawingOrderHelper().a(getChildCount(), i10);
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.mNeedsOffscreenAlphaCompositing;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.mRemoveClippedSubviews) {
            updateClippingRect();
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Y4.b bVar = this.mOnInterceptTouchEventListener;
        if ((bVar == null || !bVar.a(this, motionEvent)) && EnumC1946h0.canChildrenBeTouchTarget(this.mPointerEvents)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        C1932a0.a(i10, i11);
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (this.mRemoveClippedSubviews) {
            updateClippingRect();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return EnumC1946h0.canBeTouchTarget(this.mPointerEvents);
    }

    void recycleView() {
        if (this.mAllChildren != null && this.mChildrenLayoutChangeListener != null) {
            for (int i10 = 0; i10 < this.mAllChildrenCount; i10++) {
                this.mAllChildren[i10].removeOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
            }
        }
        l();
        this.mOverflowInset.setEmpty();
        sHelperRect.setEmpty();
        removeAllViews();
        updateBackgroundDrawable(null);
        resetPointerEvents();
    }

    void removeAllViewsWithSubviewClippingEnabled() {
        AbstractC4012a.a(this.mRemoveClippedSubviews);
        AbstractC4012a.c(this.mAllChildren);
        for (int i10 = 0; i10 < this.mAllChildrenCount; i10++) {
            this.mAllChildren[i10].removeOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
        }
        removeAllViewsInLayout();
        this.mAllChildrenCount = 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        i(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i10) {
        i(getChildAt(i10));
        super.removeViewAt(i10);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        i(view);
        super.removeViewInLayout(view);
    }

    void removeViewWithSubviewClippingEnabled(View view) {
        UiThreadUtil.assertOnUiThread();
        AbstractC4012a.a(this.mRemoveClippedSubviews);
        AbstractC4012a.c(this.mClippingRect);
        AbstractC4012a.c(this.mAllChildren);
        view.removeOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
        int k10 = k(view);
        if (this.mAllChildren[k10].getParent() != null) {
            int i10 = 0;
            for (int i11 = 0; i11 < k10; i11++) {
                if (this.mAllChildren[i11].getParent() == null) {
                    i10++;
                }
            }
            removeViewsInLayout(k10 - i10, 1);
            invalidate();
        }
        n(k10);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i10, int i11) {
        j(i10, i11);
        super.removeViews(i10, i11);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i10, int i11) {
        j(i10, i11);
        super.removeViewsInLayout(i10, i11);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
    }

    void resetPointerEvents() {
        this.mPointerEvents = EnumC1946h0.AUTO;
    }

    public void setBackfaceVisibility(String str) {
        this.mBackfaceVisibility = str;
        setBackfaceVisibilityDependantOpacity();
    }

    public void setBackfaceVisibilityDependantOpacity() {
        if (this.mBackfaceVisibility.equals("visible")) {
            setAlpha(this.mBackfaceOpacity);
            return;
        }
        float rotationX = getRotationX();
        float rotationY = getRotationY();
        if (rotationX < -90.0f || rotationX >= 90.0f || rotationY < -90.0f || rotationY >= 90.0f) {
            setAlpha(0.0f);
        } else {
            setAlpha(this.mBackfaceOpacity);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (G4.a.c()) {
            C1931a.i(this, Integer.valueOf(i10));
        } else {
            if (i10 == 0 && this.mCSSBackgroundDrawable == null) {
                return;
            }
            getOrCreateReactViewBackground().E(i10);
        }
    }

    void setBackgroundImage(List<C3079a> list) {
        if (G4.a.c()) {
            C1931a.j(this, list);
        } else {
            getOrCreateReactViewBackground().w(list);
        }
    }

    public void setBorderColor(int i10, Integer num) {
        if (G4.a.c()) {
            C1931a.k(this, e5.j.values()[i10], num);
        } else {
            getOrCreateReactViewBackground().y(i10, num);
        }
    }

    @Deprecated(forRemoval = true, since = "0.75.0")
    public void setBorderRadius(float f10) {
        setBorderRadius(f10, EnumC3081c.BORDER_RADIUS.ordinal());
    }

    public void setBorderStyle(String str) {
        if (G4.a.c()) {
            C1931a.m(this, str == null ? null : EnumC3083e.fromString(str));
        } else {
            getOrCreateReactViewBackground().C(str);
        }
    }

    public void setBorderWidth(int i10, float f10) {
        if (G4.a.c()) {
            C1931a.n(this, e5.j.values()[i10], Float.valueOf(C1944g0.e(f10)));
        } else {
            getOrCreateReactViewBackground().D(i10, f10);
        }
    }

    public void setHitSlopRect(Rect rect) {
        this.mHitSlopRect = rect;
    }

    public void setNeedsOffscreenAlphaCompositing(boolean z10) {
        this.mNeedsOffscreenAlphaCompositing = z10;
    }

    @Override // Y4.d
    public void setOnInterceptTouchEventListener(Y4.b bVar) {
        this.mOnInterceptTouchEventListener = bVar;
    }

    public void setOpacityIfPossible(float f10) {
        this.mBackfaceOpacity = f10;
        setBackfaceVisibilityDependantOpacity();
    }

    public void setOverflow(String str) {
        if (str == null) {
            this.mOverflow = e5.k.VISIBLE;
        } else {
            e5.k fromString = e5.k.fromString(str);
            if (fromString == null) {
                fromString = e5.k.VISIBLE;
            }
            this.mOverflow = fromString;
        }
        invalidate();
    }

    @Override // com.facebook.react.uimanager.InterfaceC1962p0
    public void setOverflowInset(int i10, int i11, int i12, int i13) {
        if (m()) {
            Rect rect = this.mOverflowInset;
            if (rect.left != i10 || rect.top != i11 || rect.right != i12 || rect.bottom != i13) {
                invalidate();
            }
        }
        this.mOverflowInset.set(i10, i11, i12, i13);
    }

    public void setPointerEvents(EnumC1946h0 enumC1946h0) {
        this.mPointerEvents = enumC1946h0;
    }

    public void setRemoveClippedSubviews(boolean z10) {
        if (z10 == this.mRemoveClippedSubviews) {
            return;
        }
        this.mRemoveClippedSubviews = z10;
        if (z10) {
            Rect rect = new Rect();
            this.mClippingRect = rect;
            AbstractC1954l0.a(this, rect);
            int childCount = getChildCount();
            this.mAllChildrenCount = childCount;
            this.mAllChildren = new View[Math.max(12, childCount)];
            this.mChildrenLayoutChangeListener = new b();
            for (int i10 = 0; i10 < this.mAllChildrenCount; i10++) {
                View childAt = getChildAt(i10);
                this.mAllChildren[i10] = childAt;
                childAt.addOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
            }
            updateClippingRect();
            return;
        }
        AbstractC4012a.c(this.mClippingRect);
        AbstractC4012a.c(this.mAllChildren);
        AbstractC4012a.c(this.mChildrenLayoutChangeListener);
        for (int i11 = 0; i11 < this.mAllChildrenCount; i11++) {
            this.mAllChildren[i11].removeOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
        }
        getDrawingRect(this.mClippingRect);
        o(this.mClippingRect);
        this.mAllChildren = null;
        this.mClippingRect = null;
        this.mAllChildrenCount = 0;
        this.mChildrenLayoutChangeListener = null;
    }

    @Deprecated(forRemoval = true, since = "0.76.0")
    public void setTranslucentBackgroundDrawable(Drawable drawable) {
        if (G4.a.c()) {
            C1931a.q(this, drawable);
            return;
        }
        updateBackgroundDrawable(null);
        if (this.mCSSBackgroundDrawable != null && drawable != null) {
            updateBackgroundDrawable(new LayerDrawable(new Drawable[]{this.mCSSBackgroundDrawable, drawable}));
        } else if (drawable != null) {
            updateBackgroundDrawable(drawable);
        }
    }

    void updateBackgroundDrawable(Drawable drawable) {
        super.setBackground(drawable);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1952k0
    public void updateClippingRect() {
        if (this.mRemoveClippedSubviews) {
            AbstractC4012a.c(this.mClippingRect);
            AbstractC4012a.c(this.mAllChildren);
            AbstractC1954l0.a(this, this.mClippingRect);
            o(this.mClippingRect);
        }
    }

    @Override // com.facebook.react.uimanager.InterfaceC1979y0
    public void updateDrawingOrder() {
        if (f()) {
            return;
        }
        getDrawingOrderHelper().e();
        setChildrenDrawingOrderEnabled(getDrawingOrderHelper().d());
        invalidate();
    }

    void addViewWithSubviewClippingEnabled(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        AbstractC4012a.a(this.mRemoveClippedSubviews);
        AbstractC4012a.c(this.mClippingRect);
        AbstractC4012a.c(this.mAllChildren);
        e(view, i10);
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            if (this.mAllChildren[i12].getParent() == null) {
                i11++;
            }
        }
        p(this.mClippingRect, i10, i11);
        view.addOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
    }

    @Deprecated(forRemoval = true, since = "0.75.0")
    public void setBorderRadius(float f10, int i10) {
        if (G4.a.c()) {
            C1931a.l(this, EnumC3081c.values()[i10], Float.isNaN(f10) ? null : new X(f10, Y.POINT));
        } else {
            getOrCreateReactViewBackground().H(f10, i10);
        }
    }

    public void setBorderRadius(EnumC3081c enumC3081c, X x10) {
        if (G4.a.c()) {
            C1931a.l(this, enumC3081c, x10);
        } else {
            getOrCreateReactViewBackground().A(enumC3081c, x10);
        }
    }
}
