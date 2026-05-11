package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import java.util.ArrayList;

/* renamed from: com.horcrux.svg.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C2923z extends RenderableView {

    /* renamed from: a, reason: collision with root package name */
    ReadableMap f29132a;

    /* renamed from: b, reason: collision with root package name */
    private C2921x f29133b;

    /* renamed from: c, reason: collision with root package name */
    private Bitmap f29134c;

    /* renamed from: d, reason: collision with root package name */
    private Canvas f29135d;

    /* renamed from: e, reason: collision with root package name */
    private final Paint f29136e;

    public C2923z(ReactContext reactContext) {
        super(reactContext);
        this.f29136e = new Paint(1);
    }

    private static Object y(Object obj) {
        obj.getClass();
        return obj;
    }

    public void A(ReadableMap readableMap) {
        this.f29132a = readableMap;
        invalidate();
    }

    void B(Canvas canvas) {
        RectF rectF = new RectF(canvas.getClipBounds());
        Matrix matrix = this.mMatrix;
        if (matrix != null) {
            matrix.mapRect(rectF);
        }
        Matrix matrix2 = this.mTransform;
        if (matrix2 != null) {
            matrix2.mapRect(rectF);
        }
        this.f29133b = new C2921x(this.mScale, rectF.width(), rectF.height());
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    void draw(Canvas canvas, Paint paint, float f10) {
        B(canvas);
        clip(canvas, paint);
        r(canvas, paint, f10);
        renderMarkers(canvas, paint, f10);
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    Path getPath(Canvas canvas, Paint paint) {
        Path path = ((VirtualView) this).mPath;
        if (path != null) {
            return path;
        }
        ((VirtualView) this).mPath = new Path();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (!(childAt instanceof E) && (childAt instanceof VirtualView)) {
                VirtualView virtualView = (VirtualView) childAt;
                ((VirtualView) this).mPath.addPath(virtualView.getPath(canvas, paint), virtualView.mMatrix);
            }
        }
        return ((VirtualView) this).mPath;
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    int hitTest(float[] fArr) {
        int reactTagForTouch;
        VirtualView virtualView;
        int hitTest;
        if (this.mInvertible && this.mTransformInvertible) {
            float[] fArr2 = new float[2];
            this.mInvMatrix.mapPoints(fArr2, fArr);
            this.mInvTransform.mapPoints(fArr2);
            int round = Math.round(fArr2[0]);
            int round2 = Math.round(fArr2[1]);
            Path clipPath = getClipPath();
            if (clipPath != null) {
                if (this.mClipRegionPath != clipPath) {
                    this.mClipRegionPath = clipPath;
                    RectF rectF = new RectF();
                    this.mClipBounds = rectF;
                    clipPath.computeBounds(rectF, true);
                    this.mClipRegion = getRegion(clipPath, this.mClipBounds);
                }
                if (!this.mClipRegion.contains(round, round2)) {
                    return -1;
                }
            }
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = getChildAt(childCount);
                if (childAt instanceof VirtualView) {
                    if (!(childAt instanceof E) && (hitTest = (virtualView = (VirtualView) childAt).hitTest(fArr2)) != -1) {
                        return (virtualView.isResponsible() || hitTest != childAt.getId()) ? hitTest : getId();
                    }
                } else if ((childAt instanceof SvgView) && (reactTagForTouch = ((SvgView) childAt).reactTagForTouch(fArr2[0], fArr2[1])) != childAt.getId()) {
                    return reactTagForTouch;
                }
            }
        }
        return -1;
    }

    void r(Canvas canvas, Paint paint, float f10) {
        x();
        SvgView svgView = getSvgView();
        RectF rectF = new RectF();
        if (this.mOpacity != 1.0f) {
            Bitmap bitmap = this.f29134c;
            if (bitmap == null) {
                this.f29134c = Bitmap.createBitmap(canvas.getWidth(), canvas.getHeight(), Bitmap.Config.ARGB_8888);
                this.f29135d = new Canvas(this.f29134c);
            } else {
                bitmap.recycle();
                Bitmap createBitmap = Bitmap.createBitmap(canvas.getWidth(), canvas.getHeight(), Bitmap.Config.ARGB_8888);
                this.f29134c = createBitmap;
                this.f29135d.setBitmap(createBitmap);
            }
            this.f29135d.save();
            this.f29135d.setMatrix(canvas.getMatrix());
        } else {
            this.f29135d = canvas;
        }
        this.elements = new ArrayList<>();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (!(childAt instanceof E)) {
                if (childAt instanceof VirtualView) {
                    VirtualView virtualView = (VirtualView) childAt;
                    if (!"none".equals(virtualView.mDisplay)) {
                        boolean z10 = virtualView instanceof RenderableView;
                        if (z10) {
                            ((RenderableView) virtualView).mergeProperties(this);
                        }
                        int saveAndSetupCanvas = virtualView.saveAndSetupCanvas(this.f29135d, this.mCTM);
                        virtualView.render(this.f29135d, paint, f10);
                        RectF clientRect = virtualView.getClientRect();
                        if (clientRect != null) {
                            rectF.union(clientRect);
                        }
                        virtualView.restoreCanvas(this.f29135d, saveAndSetupCanvas);
                        if (z10) {
                            ((RenderableView) virtualView).resetProperties();
                        }
                        if (virtualView.isResponsible()) {
                            svgView.enableTouchEvents();
                        }
                        ArrayList<F> arrayList = virtualView.elements;
                        if (arrayList != null) {
                            this.elements.addAll(arrayList);
                        }
                    }
                } else if (childAt instanceof SvgView) {
                    SvgView svgView2 = (SvgView) childAt;
                    svgView2.drawChildren(canvas);
                    if (svgView2.isResponsible()) {
                        svgView.enableTouchEvents();
                    }
                }
            }
        }
        if (this.mOpacity != 1.0f) {
            this.f29135d.restore();
            int save = canvas.save();
            canvas.setMatrix(null);
            this.f29136e.setAlpha((int) (this.mOpacity * 255.0f));
            canvas.drawBitmap(this.f29134c, 0.0f, 0.0f, this.f29136e);
            canvas.restoreToCount(save);
        }
        setClientRect(rectF);
        w();
    }

    @Override // com.horcrux.svg.RenderableView
    void resetProperties() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof RenderableView) {
                ((RenderableView) childAt).resetProperties();
            }
        }
    }

    void s(Canvas canvas, Paint paint, float f10) {
        super.draw(canvas, paint, f10);
    }

    @Override // com.horcrux.svg.VirtualView
    void saveDefinition() {
        if (this.mName != null) {
            getSvgView().defineTemplate(this, this.mName);
        }
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof VirtualView) {
                ((VirtualView) childAt).saveDefinition();
            }
        }
    }

    C2921x t() {
        return this.f29133b;
    }

    Path u(Canvas canvas, Paint paint, Region.Op op) {
        Path path = new Path();
        Path.Op valueOf = Path.Op.valueOf(op.name());
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (!(childAt instanceof E) && (childAt instanceof VirtualView)) {
                VirtualView virtualView = (VirtualView) childAt;
                Matrix matrix = virtualView.mMatrix;
                Path u10 = virtualView instanceof C2923z ? ((C2923z) virtualView).u(canvas, paint, op) : virtualView.getPath(canvas, paint);
                u10.transform(matrix);
                path.op(u10, valueOf);
            }
        }
        return path;
    }

    C2921x v() {
        return ((C2923z) y(getTextRoot())).t();
    }

    void w() {
        v().n();
    }

    void x() {
        v().o(this, this.f29132a);
    }

    public void z(Dynamic dynamic) {
        if (dynamic.getType() == ReadableType.Map) {
            this.f29132a = dynamic.asMap();
        } else {
            this.f29132a = null;
        }
        invalidate();
    }
}
