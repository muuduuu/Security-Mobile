package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import c3.AbstractC1721a;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.C1942f0;
import com.facebook.react.uimanager.C1978y;
import com.facebook.react.uimanager.EnumC1946h0;
import com.facebook.react.uimanager.L0;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.horcrux.svg.SVGLength;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public abstract class VirtualView extends com.facebook.react.views.view.j {
    private static final int CLIP_RULE_EVENODD = 0;
    static final int CLIP_RULE_NONZERO = 1;
    private static final double M_SQRT1_2l = 0.7071067811865476d;
    private static final float[] sRawMatrix = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    private double canvasDiagonal;
    private float canvasHeight;
    private float canvasWidth;
    ArrayList<F> elements;
    private double fontSize;
    private C2921x glyphContext;
    RectF mBox;
    Matrix mCTM;
    boolean mCTMInvertible;
    private Path mCachedClipPath;
    private RectF mClientRect;
    RectF mClipBounds;
    private String mClipPath;
    Region mClipRegion;
    Path mClipRegionPath;
    int mClipRule;
    final ReactContext mContext;
    String mDisplay;
    RectF mFillBounds;
    Path mFillPath;
    Matrix mInvCTM;
    Matrix mInvMatrix;
    final Matrix mInvTransform;
    boolean mInvertible;
    RectF mMarkerBounds;
    String mMarkerEnd;
    String mMarkerMid;
    Path mMarkerPath;
    Region mMarkerRegion;
    String mMarkerStart;
    String mMask;
    Matrix mMatrix;
    String mName;
    float mOpacity;
    Path mPath;
    EnumC1946h0 mPointerEvents;
    Region mRegion;
    private boolean mResponsible;
    final float mScale;
    RectF mStrokeBounds;
    Path mStrokePath;
    Region mStrokeRegion;
    private C2923z mTextRoot;
    Matrix mTransform;
    boolean mTransformInvertible;
    private SvgView svgView;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f28986a;

        static {
            int[] iArr = new int[SVGLength.UnitType.values().length];
            f28986a = iArr;
            try {
                iArr[SVGLength.UnitType.EMS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28986a[SVGLength.UnitType.EXS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28986a[SVGLength.UnitType.CM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28986a[SVGLength.UnitType.MM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28986a[SVGLength.UnitType.IN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28986a[SVGLength.UnitType.PT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28986a[SVGLength.UnitType.PC.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    VirtualView(ReactContext reactContext) {
        super(reactContext);
        this.mOpacity = 1.0f;
        this.mCTM = new Matrix();
        this.mMatrix = new Matrix();
        this.mTransform = new Matrix();
        this.mInvCTM = new Matrix();
        this.mInvMatrix = new Matrix();
        this.mInvTransform = new Matrix();
        this.mInvertible = true;
        this.mCTMInvertible = true;
        this.mTransformInvertible = true;
        this.fontSize = -1.0d;
        this.canvasDiagonal = -1.0d;
        this.canvasHeight = -1.0f;
        this.canvasWidth = -1.0f;
        this.mContext = reactContext;
        this.mScale = C1978y.c().density;
    }

    private void clearParentCache() {
        VirtualView virtualView = this;
        while (true) {
            ViewParent parent = virtualView.getParent();
            if (!(parent instanceof VirtualView)) {
                return;
            }
            virtualView = (VirtualView) parent;
            if (virtualView.mPath == null) {
                return;
            } else {
                virtualView.clearCache();
            }
        }
    }

    private double fromRelativeFast(SVGLength sVGLength) {
        double fontSizeFromContext;
        switch (a.f28986a[sVGLength.f28947b.ordinal()]) {
            case 1:
                fontSizeFromContext = getFontSizeFromContext();
                break;
            case 2:
                fontSizeFromContext = getFontSizeFromContext() / 2.0d;
                break;
            case 3:
                fontSizeFromContext = 35.43307d;
                break;
            case 4:
                fontSizeFromContext = 3.543307d;
                break;
            case 5:
                fontSizeFromContext = 90.0d;
                break;
            case 6:
                fontSizeFromContext = 1.25d;
                break;
            case 7:
                fontSizeFromContext = 15.0d;
                break;
            default:
                fontSizeFromContext = 1.0d;
                break;
        }
        return sVGLength.f28946a * fontSizeFromContext * this.mScale;
    }

    private double getCanvasDiagonal() {
        double d10 = this.canvasDiagonal;
        if (d10 != -1.0d) {
            return d10;
        }
        double sqrt = Math.sqrt(Math.pow(getCanvasWidth(), 2.0d) + Math.pow(getCanvasHeight(), 2.0d)) * M_SQRT1_2l;
        this.canvasDiagonal = sqrt;
        return sqrt;
    }

    private float getCanvasHeight() {
        float f10 = this.canvasHeight;
        if (f10 != -1.0f) {
            return f10;
        }
        C2923z textRoot = getTextRoot();
        if (textRoot == null) {
            this.canvasHeight = getSvgView().getCanvasBounds().height();
        } else {
            this.canvasHeight = textRoot.t().d();
        }
        return this.canvasHeight;
    }

    private float getCanvasWidth() {
        float f10 = this.canvasWidth;
        if (f10 != -1.0f) {
            return f10;
        }
        C2923z textRoot = getTextRoot();
        if (textRoot == null) {
            this.canvasWidth = getSvgView().getCanvasBounds().width();
        } else {
            this.canvasWidth = textRoot.t().g();
        }
        return this.canvasWidth;
    }

    private double getFontSizeFromContext() {
        double d10 = this.fontSize;
        if (d10 != -1.0d) {
            return d10;
        }
        C2923z textRoot = getTextRoot();
        if (textRoot == null) {
            return 12.0d;
        }
        if (this.glyphContext == null) {
            this.glyphContext = textRoot.t();
        }
        double c10 = this.glyphContext.c();
        this.fontSize = c10;
        return c10;
    }

    void clearCache() {
        this.canvasDiagonal = -1.0d;
        this.canvasHeight = -1.0f;
        this.canvasWidth = -1.0f;
        this.fontSize = -1.0d;
        this.mStrokeRegion = null;
        this.mMarkerRegion = null;
        this.mRegion = null;
        this.mPath = null;
    }

    void clearChildCache() {
        clearCache();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof VirtualView) {
                ((VirtualView) childAt).clearChildCache();
            }
        }
    }

    void clip(Canvas canvas, Paint paint) {
        Path clipPath = getClipPath(canvas, paint);
        if (clipPath != null) {
            canvas.clipPath(clipPath);
        }
    }

    abstract void draw(Canvas canvas, Paint paint, float f10);

    RectF getClientRect() {
        return this.mClientRect;
    }

    Path getClipPath() {
        return this.mCachedClipPath;
    }

    C2923z getParentTextRoot() {
        ViewParent parent = getParent();
        if (parent instanceof VirtualView) {
            return ((VirtualView) parent).getTextRoot();
        }
        return null;
    }

    abstract Path getPath(Canvas canvas, Paint paint);

    SvgView getSvgView() {
        SvgView svgView = this.svgView;
        if (svgView != null) {
            return svgView;
        }
        ViewParent parent = getParent();
        if (parent == null) {
            return null;
        }
        if (parent instanceof SvgView) {
            this.svgView = (SvgView) parent;
        } else if (parent instanceof VirtualView) {
            this.svgView = ((VirtualView) parent).getSvgView();
        } else {
            AbstractC1721a.m("ReactNative", "RNSVG: " + getClass().getName() + " should be descendant of a SvgView.");
        }
        return this.svgView;
    }

    C2923z getTextRoot() {
        if (this.mTextRoot == null) {
            VirtualView virtualView = this;
            while (true) {
                if (virtualView == null) {
                    break;
                }
                if (virtualView instanceof C2923z) {
                    C2923z c2923z = (C2923z) virtualView;
                    if (c2923z.t() != null) {
                        this.mTextRoot = c2923z;
                        break;
                    }
                }
                ViewParent parent = virtualView.getParent();
                virtualView = !(parent instanceof VirtualView) ? null : (VirtualView) parent;
            }
        }
        return this.mTextRoot;
    }

    abstract int hitTest(float[] fArr);

    @Override // android.view.View
    public void invalidate() {
        if ((this instanceof RenderableView) && this.mPath == null) {
            return;
        }
        clearCache();
        clearParentCache();
        super.invalidate();
    }

    boolean isResponsible() {
        return this.mResponsible;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.mClientRect != null) {
            SvgView svgView = getSvgView();
            int[] iArr = new int[2];
            getSvgView().getLocationOnScreen(iArr);
            Rect rect = new Rect();
            boolean z10 = false;
            rect.left = iArr[0] + ((int) Math.floor(this.mClientRect.left));
            rect.top = iArr[1] + ((int) Math.floor(this.mClientRect.top));
            rect.right = rect.left + ((int) Math.ceil(this.mClientRect.width()));
            rect.bottom = rect.top + ((int) Math.ceil(this.mClientRect.height()));
            Rect rect2 = new Rect();
            if (svgView.getGlobalVisibleRect(rect2) && rect.intersect(rect2)) {
                z10 = true;
            }
            String canonicalName = getClass().getCanonicalName();
            accessibilityNodeInfo.setBoundsInScreen(rect);
            accessibilityNodeInfo.setClassName(canonicalName);
            accessibilityNodeInfo.setVisibleToUser(z10);
        }
    }

    @Override // com.facebook.react.views.view.j, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (this.mClientRect == null) {
            return;
        }
        if (!(this instanceof C2923z)) {
            int floor = (int) Math.floor(r1.left);
            int floor2 = (int) Math.floor(this.mClientRect.top);
            int ceil = (int) Math.ceil(this.mClientRect.right);
            int ceil2 = (int) Math.ceil(this.mClientRect.bottom);
            setLeft(floor);
            setTop(floor2);
            setRight(ceil);
            setBottom(ceil2);
        }
        setMeasuredDimension((int) Math.ceil(this.mClientRect.width()), (int) Math.ceil(this.mClientRect.height()));
    }

    @Override // com.facebook.react.views.view.j, android.view.View
    protected void onMeasure(int i10, int i11) {
        setMeasuredDimension(this.mClientRect != null ? (int) Math.ceil(r0.width()) : View.getDefaultSize(getSuggestedMinimumWidth(), i10), this.mClientRect != null ? (int) Math.ceil(r0.height()) : View.getDefaultSize(getSuggestedMinimumHeight(), i11));
    }

    double relativeOn(SVGLength sVGLength, float f10) {
        SVGLength.UnitType unitType = sVGLength.f28947b;
        return unitType == SVGLength.UnitType.NUMBER ? sVGLength.f28946a * this.mScale : unitType == SVGLength.UnitType.PERCENTAGE ? (sVGLength.f28946a / 100.0d) * f10 : fromRelativeFast(sVGLength);
    }

    double relativeOnFraction(SVGLength sVGLength, float f10) {
        double d10;
        SVGLength.UnitType unitType = sVGLength.f28947b;
        if (unitType == SVGLength.UnitType.NUMBER) {
            d10 = sVGLength.f28946a;
        } else {
            if (unitType != SVGLength.UnitType.PERCENTAGE) {
                return fromRelativeFast(sVGLength);
            }
            d10 = sVGLength.f28946a / 100.0d;
        }
        return d10 * f10;
    }

    double relativeOnHeight(SVGLength sVGLength) {
        return relativeOn(sVGLength, getCanvasHeight());
    }

    double relativeOnOther(SVGLength sVGLength) {
        return relativeOn(sVGLength, (float) getCanvasDiagonal());
    }

    double relativeOnWidth(SVGLength sVGLength) {
        return relativeOn(sVGLength, getCanvasWidth());
    }

    void render(Canvas canvas, Paint paint, float f10) {
        draw(canvas, paint, f10);
    }

    void restoreCanvas(Canvas canvas, int i10) {
        canvas.restoreToCount(i10);
    }

    int saveAndSetupCanvas(Canvas canvas, Matrix matrix) {
        int save = canvas.save();
        this.mCTM.setConcat(this.mMatrix, this.mTransform);
        canvas.concat(this.mCTM);
        this.mCTM.preConcat(matrix);
        this.mCTMInvertible = this.mCTM.invert(this.mInvCTM);
        return save;
    }

    void saveDefinition() {
        if (this.mName != null) {
            getSvgView().defineTemplate(this, this.mName);
        }
    }

    void setClientRect(RectF rectF) {
        RectF rectF2 = this.mClientRect;
        if (rectF2 == null || !rectF2.equals(rectF)) {
            this.mClientRect = rectF;
            if (rectF == null) {
                return;
            }
            int ceil = (int) Math.ceil(rectF.width());
            int ceil2 = (int) Math.ceil(this.mClientRect.height());
            int floor = (int) Math.floor(this.mClientRect.left);
            int floor2 = (int) Math.floor(this.mClientRect.top);
            int ceil3 = (int) Math.ceil(this.mClientRect.right);
            int ceil4 = (int) Math.ceil(this.mClientRect.bottom);
            setMeasuredDimension(ceil, ceil2);
            if (!(this instanceof C2923z)) {
                setLeft(floor);
                setTop(floor2);
                setRight(ceil3);
                setBottom(ceil4);
            }
            EventDispatcher c10 = L0.c(this.mContext, getId());
            if (c10 != null) {
                c10.c(C1942f0.b(getId(), floor, floor2, ceil, ceil2));
            }
        }
    }

    public void setClipPath(String str) {
        this.mCachedClipPath = null;
        this.mClipPath = str;
        invalidate();
    }

    public void setClipRule(int i10) {
        this.mClipRule = i10;
        invalidate();
    }

    public void setDisplay(String str) {
        this.mDisplay = str;
        invalidate();
    }

    public void setMarkerEnd(String str) {
        this.mMarkerEnd = str;
        invalidate();
    }

    public void setMarkerMid(String str) {
        this.mMarkerMid = str;
        invalidate();
    }

    public void setMarkerStart(String str) {
        this.mMarkerStart = str;
        invalidate();
    }

    public void setMask(String str) {
        this.mMask = str;
        invalidate();
    }

    public void setMatrix(Dynamic dynamic) {
        setMatrix((dynamic.isNull() || !dynamic.getType().equals(ReadableType.Array)) ? null : dynamic.asArray());
    }

    public void setName(String str) {
        this.mName = str;
        invalidate();
    }

    public void setOpacity(float f10) {
        this.mOpacity = f10;
        invalidate();
    }

    @Override // com.facebook.react.views.view.j
    public void setPointerEvents(EnumC1946h0 enumC1946h0) {
        this.mPointerEvents = enumC1946h0;
    }

    public void setResponsible(boolean z10) {
        this.mResponsible = z10;
        invalidate();
    }

    Path getClipPath(Canvas canvas, Paint paint) {
        if (this.mClipPath != null) {
            C2900c c2900c = (C2900c) getSvgView().getDefinedClipPath(this.mClipPath);
            if (c2900c != null) {
                Path path = this.mClipRule == 0 ? c2900c.getPath(canvas, paint) : c2900c.u(canvas, paint, Region.Op.UNION);
                path.transform(c2900c.mMatrix);
                path.transform(c2900c.mTransform);
                int i10 = this.mClipRule;
                if (i10 == 0) {
                    path.setFillType(Path.FillType.EVEN_ODD);
                } else if (i10 != 1) {
                    AbstractC1721a.J("ReactNative", "RNSVG: clipRule: " + this.mClipRule + " unrecognized");
                }
                this.mCachedClipPath = path;
            } else {
                AbstractC1721a.J("ReactNative", "RNSVG: Undefined clipPath: " + this.mClipPath);
            }
        }
        return getClipPath();
    }

    public void setMatrix(ReadableArray readableArray) {
        if (readableArray != null) {
            float[] fArr = sRawMatrix;
            int c10 = K.c(readableArray, fArr, this.mScale);
            if (c10 == 6) {
                if (this.mMatrix == null) {
                    this.mMatrix = new Matrix();
                    this.mInvMatrix = new Matrix();
                }
                this.mMatrix.setValues(fArr);
                this.mInvertible = this.mMatrix.invert(this.mInvMatrix);
            } else if (c10 != -1) {
                AbstractC1721a.J("ReactNative", "RNSVG: Transform matrices must be of size 6");
            }
        } else {
            this.mMatrix.reset();
            this.mInvMatrix.reset();
            this.mInvertible = true;
        }
        super.invalidate();
        clearParentCache();
    }
}
