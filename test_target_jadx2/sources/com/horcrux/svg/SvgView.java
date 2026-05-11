package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.Base64;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.C1978y;
import com.facebook.react.uimanager.InterfaceC1956m0;
import com.facebook.react.uimanager.InterfaceC1958n0;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class SvgView extends com.facebook.react.views.view.j implements InterfaceC1956m0, InterfaceC1958n0 {
    private String mAlign;
    private Bitmap mBitmap;
    private Canvas mCanvas;
    private Bitmap mCurrentBitmap;
    int mCurrentColor;
    private final Map<String, C2898a> mDefinedBrushes;
    private final Map<String, VirtualView> mDefinedClipPaths;
    private final Map<String, VirtualView> mDefinedFilters;
    private final Map<String, VirtualView> mDefinedMarkers;
    private final Map<String, VirtualView> mDefinedMasks;
    private final Map<String, VirtualView> mDefinedTemplates;
    final Matrix mInvViewBoxMatrix;
    private boolean mInvertible;
    private int mMeetOrSlice;
    private float mMinX;
    private float mMinY;
    private final Paint mPaint;
    private boolean mRemovalTransitionStarted;
    private boolean mRendered;
    private boolean mResponsible;
    private final float mScale;
    private float mVbHeight;
    private float mVbWidth;
    private SVGLength mbbHeight;
    private SVGLength mbbWidth;
    private Runnable toDataUrlTask;

    public enum Events {
        EVENT_DATA_URL("onDataURL");

        private final String mName;

        Events(String str) {
            this.mName = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.mName;
        }
    }

    public SvgView(ReactContext reactContext) {
        super(reactContext);
        this.toDataUrlTask = null;
        this.mResponsible = false;
        this.mDefinedClipPaths = new HashMap();
        this.mDefinedTemplates = new HashMap();
        this.mDefinedMarkers = new HashMap();
        this.mDefinedMasks = new HashMap();
        this.mDefinedFilters = new HashMap();
        this.mDefinedBrushes = new HashMap();
        Paint paint = new Paint();
        this.mPaint = paint;
        this.mInvViewBoxMatrix = new Matrix();
        this.mInvertible = true;
        this.mRendered = false;
        this.mCurrentColor = 0;
        this.mScale = C1978y.c().density;
        paint.setFlags(385);
        paint.setTypeface(Typeface.DEFAULT);
        setWillNotDraw(false);
    }

    private void clearChildCache() {
        if (this.mRendered) {
            this.mRendered = false;
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (childAt instanceof VirtualView) {
                    ((VirtualView) childAt).clearChildCache();
                }
            }
        }
    }

    private Bitmap drawOutput() {
        this.mRendered = true;
        float width = getWidth();
        float height = getHeight();
        if (Float.isNaN(width) || Float.isNaN(height) || width < 1.0f || height < 1.0f || Math.log10(width) + Math.log10(height) > 42.0d) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap((int) width, (int) height, Bitmap.Config.ARGB_8888);
        this.mCurrentBitmap = createBitmap;
        drawChildren(new Canvas(createBitmap));
        return createBitmap;
    }

    private RectF getViewBox() {
        float f10 = this.mMinX;
        float f11 = this.mScale;
        float f12 = this.mMinY;
        return new RectF(f10 * f11, f12 * f11, (f10 + this.mVbWidth) * f11, (f12 + this.mVbHeight) * f11);
    }

    private int hitTest(float f10, float f11) {
        if (!this.mResponsible || !this.mInvertible) {
            return getId();
        }
        float[] fArr = {f10, f11};
        this.mInvViewBoxMatrix.mapPoints(fArr);
        int i10 = -1;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt instanceof VirtualView) {
                i10 = ((VirtualView) childAt).hitTest(fArr);
            } else if (childAt instanceof SvgView) {
                i10 = ((SvgView) childAt).hitTest(f10, f11);
            }
            if (i10 != -1) {
                break;
            }
        }
        return i10 == -1 ? getId() : i10;
    }

    void defineBrush(C2898a c2898a, String str) {
        this.mDefinedBrushes.put(str, c2898a);
    }

    void defineClipPath(VirtualView virtualView, String str) {
        this.mDefinedClipPaths.put(str, virtualView);
    }

    void defineFilter(VirtualView virtualView, String str) {
        this.mDefinedFilters.put(str, virtualView);
    }

    void defineMarker(VirtualView virtualView, String str) {
        this.mDefinedMarkers.put(str, virtualView);
    }

    void defineMask(VirtualView virtualView, String str) {
        this.mDefinedMasks.put(str, virtualView);
    }

    void defineTemplate(VirtualView virtualView, String str) {
        this.mDefinedTemplates.put(str, virtualView);
    }

    synchronized void drawChildren(Canvas canvas) {
        try {
            this.mRendered = true;
            this.mCanvas = canvas;
            Matrix matrix = new Matrix();
            if (this.mAlign != null) {
                RectF viewBox = getViewBox();
                float width = canvas.getWidth();
                float height = canvas.getHeight();
                boolean z10 = getParent() instanceof VirtualView;
                if (z10) {
                    width = (float) K.a(this.mbbWidth, width, 0.0d, this.mScale, 12.0d);
                    height = (float) K.a(this.mbbHeight, height, 0.0d, this.mScale, 12.0d);
                }
                RectF rectF = new RectF(0.0f, 0.0f, width, height);
                if (z10) {
                    canvas.clipRect(rectF);
                }
                matrix = o0.a(viewBox, rectF, this.mAlign, this.mMeetOrSlice);
                this.mInvertible = matrix.invert(this.mInvViewBoxMatrix);
                canvas.concat(matrix);
            }
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (childAt instanceof VirtualView) {
                    ((VirtualView) childAt).saveDefinition();
                }
            }
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt2 = getChildAt(i11);
                if (childAt2 instanceof VirtualView) {
                    VirtualView virtualView = (VirtualView) childAt2;
                    int saveAndSetupCanvas = virtualView.saveAndSetupCanvas(canvas, matrix);
                    virtualView.render(canvas, this.mPaint, 1.0f);
                    virtualView.restoreCanvas(canvas, saveAndSetupCanvas);
                    if (virtualView.isResponsible() && !this.mResponsible) {
                        this.mResponsible = true;
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    void enableTouchEvents() {
        if (this.mResponsible) {
            return;
        }
        this.mResponsible = true;
    }

    Rect getCanvasBounds() {
        return this.mCanvas.getClipBounds();
    }

    float getCanvasHeight() {
        return this.mCanvas.getHeight();
    }

    float getCanvasWidth() {
        return this.mCanvas.getWidth();
    }

    Matrix getCtm() {
        return this.mCanvas.getMatrix();
    }

    public Bitmap getCurrentBitmap() {
        return this.mCurrentBitmap;
    }

    C2898a getDefinedBrush(String str) {
        return this.mDefinedBrushes.get(str);
    }

    VirtualView getDefinedClipPath(String str) {
        return this.mDefinedClipPaths.get(str);
    }

    VirtualView getDefinedFilter(String str) {
        return this.mDefinedFilters.get(str);
    }

    VirtualView getDefinedMarker(String str) {
        return this.mDefinedMarkers.get(str);
    }

    VirtualView getDefinedMask(String str) {
        return this.mDefinedMasks.get(str);
    }

    VirtualView getDefinedTemplate(String str) {
        return this.mDefinedTemplates.get(str);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1958n0
    public boolean interceptsTouchEvent(float f10, float f11) {
        return true;
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        ViewParent parent = getParent();
        if (parent instanceof VirtualView) {
            if (this.mRendered) {
                this.mRendered = false;
                ((VirtualView) parent).getSvgView().invalidate();
                return;
            }
            return;
        }
        if (this.mRemovalTransitionStarted) {
            return;
        }
        Bitmap bitmap = this.mBitmap;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.mBitmap = null;
    }

    boolean isResponsible() {
        return this.mResponsible;
    }

    boolean notRendered() {
        return !this.mRendered;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.mBitmap;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.mBitmap = null;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (getParent() instanceof VirtualView) {
            return;
        }
        super.onDraw(canvas);
        if (this.mBitmap == null) {
            this.mBitmap = drawOutput();
        }
        if (this.mBitmap != null) {
            this.mPaint.reset();
            this.mPaint.setFlags(387);
            this.mPaint.setTypeface(Typeface.DEFAULT);
            canvas.drawBitmap(this.mBitmap, 0.0f, 0.0f, this.mPaint);
            Runnable runnable = this.toDataUrlTask;
            if (runnable != null) {
                runnable.run();
                this.toDataUrlTask = null;
            }
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setVisibleToUser(getGlobalVisibleRect(new Rect()));
        accessibilityNodeInfo.setClassName(getClass().getCanonicalName());
    }

    @Override // com.facebook.react.views.view.j, android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        invalidate();
    }

    @Override // com.facebook.react.uimanager.InterfaceC1956m0
    public int reactTagForTouch(float f10, float f11) {
        return hitTest(f10, f11);
    }

    public void setAlign(String str) {
        this.mAlign = str;
        invalidate();
        clearChildCache();
    }

    public void setBbHeight(Dynamic dynamic) {
        this.mbbHeight = SVGLength.b(dynamic);
        invalidate();
        clearChildCache();
    }

    public void setBbWidth(Dynamic dynamic) {
        this.mbbWidth = SVGLength.b(dynamic);
        invalidate();
        clearChildCache();
    }

    public void setCurrentColor(Integer num) {
        this.mCurrentColor = num != null ? num.intValue() : 0;
        invalidate();
        clearChildCache();
    }

    @Override // android.view.View
    public void setId(int i10) {
        super.setId(i10);
        SvgViewManager.setSvgView(i10, this);
    }

    public void setMeetOrSlice(int i10) {
        this.mMeetOrSlice = i10;
        invalidate();
        clearChildCache();
    }

    public void setMinX(float f10) {
        this.mMinX = f10;
        invalidate();
        clearChildCache();
    }

    public void setMinY(float f10) {
        this.mMinY = f10;
        invalidate();
        clearChildCache();
    }

    void setToDataUrlTask(Runnable runnable) {
        this.toDataUrlTask = runnable;
    }

    public void setVbHeight(float f10) {
        this.mVbHeight = f10;
        invalidate();
        clearChildCache();
    }

    public void setVbWidth(float f10) {
        this.mVbWidth = f10;
        invalidate();
        clearChildCache();
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        this.mRemovalTransitionStarted = true;
    }

    String toDataURL() {
        Bitmap createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
        clearChildCache();
        drawChildren(new Canvas(createBitmap));
        clearChildCache();
        invalidate();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        createBitmap.recycle();
        return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
    }

    String toDataURL(int i10, int i11) {
        Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        clearChildCache();
        drawChildren(new Canvas(createBitmap));
        clearChildCache();
        invalidate();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        createBitmap.recycle();
        return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
    }
}
