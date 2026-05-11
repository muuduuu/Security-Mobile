package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.view.ViewParent;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.EnumC1946h0;
import com.horcrux.svg.C2898a;
import com.horcrux.svg.E;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public abstract class RenderableView extends VirtualView implements Y4.c {
    private static final int CAP_BUTT = 0;
    static final int CAP_ROUND = 1;
    private static final int CAP_SQUARE = 2;
    private static final int FILL_RULE_EVENODD = 0;
    static final int FILL_RULE_NONZERO = 1;
    private static final int JOIN_BEVEL = 2;
    private static final int JOIN_MITER = 0;
    static final int JOIN_ROUND = 1;
    private static final int VECTOR_EFFECT_DEFAULT = 0;
    private static final int VECTOR_EFFECT_NON_SCALING_STROKE = 1;
    static RenderableView contextElement;
    private static final Pattern regex = Pattern.compile("[0-9.-]+");
    public ReadableArray fill;
    public float fillOpacity;
    public Path.FillType fillRule;
    private ArrayList<String> mAttributeList;
    private int mCurrentColor;
    String mFilter;
    private ArrayList<String> mLastMergedList;
    private ArrayList<Object> mOriginProperties;
    private ArrayList<String> mPropList;
    public ReadableArray stroke;
    public SVGLength[] strokeDasharray;
    public float strokeDashoffset;
    public Paint.Cap strokeLinecap;
    public Paint.Join strokeLinejoin;
    public float strokeMiterlimit;
    public float strokeOpacity;
    public SVGLength strokeWidth;
    public int vectorEffect;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f28944a;

        static {
            int[] iArr = new int[M.values().length];
            f28944a = iArr;
            try {
                iArr[M.kStartMarker.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28944a[M.kMidMarker.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28944a[M.kEndMarker.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    RenderableView(ReactContext reactContext) {
        super(reactContext);
        this.vectorEffect = 0;
        this.strokeWidth = new SVGLength(1.0d);
        this.strokeOpacity = 1.0f;
        this.strokeMiterlimit = 4.0f;
        this.strokeDashoffset = 0.0f;
        this.strokeLinecap = Paint.Cap.BUTT;
        this.strokeLinejoin = Paint.Join.MITER;
        this.mCurrentColor = 0;
        this.fillOpacity = 1.0f;
        this.fillRule = Path.FillType.WINDING;
        setPivotX(0.0f);
        setPivotY(0.0f);
    }

    private ArrayList<String> getAttributeList() {
        return this.mAttributeList;
    }

    private boolean hasOwnProperty(String str) {
        ArrayList<String> arrayList = this.mAttributeList;
        return arrayList != null && arrayList.contains(str);
    }

    private void setupPaint(Paint paint, float f10, ReadableArray readableArray) {
        ReadableArray readableArray2;
        RenderableView renderableView;
        ReadableArray readableArray3;
        int i10 = readableArray.getInt(0);
        if (i10 == 0) {
            if (readableArray.size() != 2) {
                paint.setARGB((int) (readableArray.size() > 4 ? readableArray.getDouble(4) * f10 * 255.0d : f10 * 255.0f), (int) (readableArray.getDouble(1) * 255.0d), (int) (readableArray.getDouble(2) * 255.0d), (int) (readableArray.getDouble(3) * 255.0d));
                return;
            } else {
                paint.setColor((Math.round((r13 >>> 24) * f10) << 24) | ((readableArray.getType(1) == ReadableType.Map ? ColorPropConverter.getColor(readableArray.getMap(1), getContext()).intValue() : readableArray.getInt(1)) & 16777215));
                return;
            }
        }
        if (i10 == 1) {
            C2898a definedBrush = getSvgView().getDefinedBrush(readableArray.getString(1));
            if (definedBrush != null) {
                definedBrush.i(paint, this.mBox, this.mScale, f10);
                return;
            }
            return;
        }
        if (i10 == 2) {
            paint.setColor((Math.round((r13 >>> 24) * f10) << 24) | (getCurrentColor() & 16777215));
            return;
        }
        if (i10 != 3) {
            if (i10 != 4 || (renderableView = contextElement) == null || (readableArray3 = renderableView.stroke) == null) {
                return;
            }
            setupPaint(paint, f10, readableArray3);
            return;
        }
        RenderableView renderableView2 = contextElement;
        if (renderableView2 == null || (readableArray2 = renderableView2.fill) == null) {
            return;
        }
        setupPaint(paint, f10, readableArray2);
    }

    @Override // com.horcrux.svg.VirtualView
    void draw(Canvas canvas, Paint paint, float f10) {
        float f11 = f10 * this.mOpacity;
        boolean z10 = ((VirtualView) this).mPath == null;
        if (z10) {
            Path path = getPath(canvas, paint);
            ((VirtualView) this).mPath = path;
            path.setFillType(this.fillRule);
        }
        boolean z11 = this.vectorEffect == 1;
        Path path2 = ((VirtualView) this).mPath;
        if (z11) {
            path2 = new Path();
            ((VirtualView) this).mPath.transform(this.mCTM, path2);
            canvas.setMatrix(null);
        }
        if (z10 || path2 != ((VirtualView) this).mPath) {
            RectF rectF = new RectF();
            this.mBox = rectF;
            path2.computeBounds(rectF, true);
        }
        RectF rectF2 = new RectF(this.mBox);
        this.mCTM.mapRect(rectF2);
        setClientRect(rectF2);
        clip(canvas, paint);
        if (setupFillPaint(paint, this.fillOpacity * f11)) {
            if (z10) {
                Path path3 = new Path();
                this.mFillPath = path3;
                paint.getFillPath(path2, path3);
            }
            canvas.drawPath(path2, paint);
        }
        if (setupStrokePaint(paint, this.strokeOpacity * f11)) {
            if (z10) {
                Path path4 = new Path();
                this.mStrokePath = path4;
                paint.getFillPath(path2, path4);
            }
            canvas.drawPath(path2, paint);
        }
        renderMarkers(canvas, paint, f11);
    }

    int getCurrentColor() {
        int i10 = this.mCurrentColor;
        if (i10 != 0) {
            return i10;
        }
        ViewParent parent = getParent();
        if (parent instanceof VirtualView) {
            return ((RenderableView) parent).getCurrentColor();
        }
        if (parent instanceof SvgView) {
            return ((SvgView) parent).mCurrentColor;
        }
        return 0;
    }

    @Override // com.facebook.react.views.view.j, Y4.c
    public Rect getHitSlopRect() {
        if (((VirtualView) this).mPointerEvents == EnumC1946h0.BOX_NONE) {
            return new Rect(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
        return null;
    }

    @Override // com.horcrux.svg.VirtualView
    abstract Path getPath(Canvas canvas, Paint paint);

    Region getRegion(Path path, RectF rectF) {
        Region region = new Region();
        region.setPath(path, new Region((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom)));
        return region;
    }

    @Override // com.horcrux.svg.VirtualView
    int hitTest(float[] fArr) {
        Region region;
        Region region2;
        if (((VirtualView) this).mPath == null || !this.mInvertible || !this.mTransformInvertible || ((VirtualView) this).mPointerEvents == EnumC1946h0.NONE) {
            return -1;
        }
        float[] fArr2 = new float[2];
        this.mInvMatrix.mapPoints(fArr2, fArr);
        this.mInvTransform.mapPoints(fArr2);
        int round = Math.round(fArr2[0]);
        int round2 = Math.round(fArr2[1]);
        initBounds();
        Region region3 = this.mRegion;
        if ((region3 != null && region3.contains(round, round2)) || ((region = this.mStrokeRegion) != null && (region.contains(round, round2) || ((region2 = this.mMarkerRegion) != null && region2.contains(round, round2))))) {
            if (getClipPath() == null || this.mClipRegion.contains(round, round2)) {
                return getId();
            }
            return -1;
        }
        return -1;
    }

    void initBounds() {
        if (this.mRegion == null && this.mFillPath != null) {
            RectF rectF = new RectF();
            this.mFillBounds = rectF;
            this.mFillPath.computeBounds(rectF, true);
            this.mRegion = getRegion(this.mFillPath, this.mFillBounds);
        }
        if (this.mRegion == null && ((VirtualView) this).mPath != null) {
            RectF rectF2 = new RectF();
            this.mFillBounds = rectF2;
            ((VirtualView) this).mPath.computeBounds(rectF2, true);
            this.mRegion = getRegion(((VirtualView) this).mPath, this.mFillBounds);
        }
        if (this.mStrokeRegion == null && this.mStrokePath != null) {
            RectF rectF3 = new RectF();
            this.mStrokeBounds = rectF3;
            this.mStrokePath.computeBounds(rectF3, true);
            this.mStrokeRegion = getRegion(this.mStrokePath, this.mStrokeBounds);
        }
        if (this.mMarkerRegion == null && this.mMarkerPath != null) {
            RectF rectF4 = new RectF();
            this.mMarkerBounds = rectF4;
            this.mMarkerPath.computeBounds(rectF4, true);
            this.mMarkerRegion = getRegion(this.mMarkerPath, this.mMarkerBounds);
        }
        Path clipPath = getClipPath();
        if (clipPath == null || this.mClipRegionPath == clipPath) {
            return;
        }
        this.mClipRegionPath = clipPath;
        RectF rectF5 = new RectF();
        this.mClipBounds = rectF5;
        clipPath.computeBounds(rectF5, true);
        this.mClipRegion = getRegion(clipPath, this.mClipBounds);
    }

    void mergeProperties(RenderableView renderableView) {
        ArrayList<String> attributeList = renderableView.getAttributeList();
        if (attributeList == null || attributeList.size() == 0) {
            return;
        }
        this.mOriginProperties = new ArrayList<>();
        this.mAttributeList = this.mPropList == null ? new ArrayList<>() : new ArrayList<>(this.mPropList);
        int size = attributeList.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                String str = attributeList.get(i10);
                Field field = getClass().getField(str);
                Object obj = field.get(renderableView);
                this.mOriginProperties.add(field.get(this));
                if (!hasOwnProperty(str)) {
                    this.mAttributeList.add(str);
                    field.set(this, obj);
                }
            } catch (Exception e10) {
                throw new IllegalStateException(e10);
            }
        }
        this.mLastMergedList = attributeList;
    }

    @Override // com.horcrux.svg.VirtualView
    void render(Canvas canvas, Paint paint, float f10) {
        RectF rectF;
        E e10 = this.mMask != null ? (E) getSvgView().getDefinedMask(this.mMask) : null;
        C2918u c2918u = this.mFilter != null ? (C2918u) getSvgView().getDefinedFilter(this.mFilter) : null;
        if (e10 == null && c2918u == null) {
            draw(canvas, paint, f10);
            return;
        }
        if (c2918u != null) {
            Paint paint2 = new Paint(2);
            canvas.saveLayer(null, paint2);
            Bitmap currentBitmap = getSvgView().getCurrentBitmap();
            Bitmap createBitmap = Bitmap.createBitmap(canvas.getWidth(), canvas.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap);
            canvas2.setMatrix(canvas.getMatrix());
            draw(canvas2, paint, f10);
            initBounds();
            RectF clientRect = getClientRect();
            if ((this instanceof A) && clientRect == null) {
                return;
            }
            Bitmap r10 = c2918u.r(createBitmap, currentBitmap, clientRect);
            int save = canvas.save();
            canvas.setMatrix(null);
            canvas.drawBitmap(r10, 0.0f, 0.0f, paint2);
            canvas.restoreToCount(save);
        } else {
            canvas.saveLayer(null, new Paint());
            draw(canvas, paint, f10);
        }
        if (e10 != null) {
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            canvas.saveLayer(null, paint3);
            if (e10.C() == E.a.LUMINANCE) {
                Paint paint4 = new Paint();
                paint4.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2125f, 0.7154f, 0.0721f, 0.0f, 0.0f})));
                canvas.saveLayer(null, paint4);
            } else {
                canvas.saveLayer(null, paint);
            }
            if (e10.D() == C2898a.b.USER_SPACE_ON_USE) {
                float relativeOnWidth = (float) relativeOnWidth(e10.f28867f);
                float relativeOnHeight = (float) relativeOnHeight(e10.f28868g);
                rectF = new RectF(relativeOnWidth, relativeOnHeight, ((float) relativeOnWidth(e10.f28869h)) + relativeOnWidth, ((float) relativeOnHeight(e10.f28870i)) + relativeOnHeight);
            } else {
                RectF clientRect2 = getClientRect();
                if ((this instanceof A) && clientRect2 == null) {
                    return;
                }
                this.mInvCTM.mapRect(clientRect2);
                float relativeOnFraction = (float) relativeOnFraction(e10.f28867f, clientRect2.width());
                float relativeOnFraction2 = (float) relativeOnFraction(e10.f28868g, clientRect2.height());
                float relativeOnFraction3 = (float) relativeOnFraction(e10.f28869h, clientRect2.width());
                float relativeOnFraction4 = (float) relativeOnFraction(e10.f28870i, clientRect2.height());
                float f11 = clientRect2.left;
                float f12 = clientRect2.top;
                rectF = new RectF(f11 + relativeOnFraction, f12 + relativeOnFraction2, f11 + relativeOnFraction + relativeOnFraction3, f12 + relativeOnFraction2 + relativeOnFraction4);
            }
            canvas.clipRect(rectF);
            e10.draw(canvas, paint, 1.0f);
            canvas.restore();
            canvas.saveLayer(null, paint3);
            canvas.clipRect(rectF);
            e10.draw(canvas, paint, 1.0f);
            canvas.restore();
            canvas.restore();
        }
        canvas.restore();
    }

    void renderMarkers(Canvas canvas, Paint paint, float f10) {
        D d10 = (D) getSvgView().getDefinedMarker(this.mMarkerStart);
        D d11 = (D) getSvgView().getDefinedMarker(this.mMarkerMid);
        D d12 = (D) getSvgView().getDefinedMarker(this.mMarkerEnd);
        ArrayList<F> arrayList = this.elements;
        if (arrayList != null) {
            if (d10 == null && d11 == null && d12 == null) {
                return;
            }
            contextElement = this;
            ArrayList h10 = L.h(arrayList);
            SVGLength sVGLength = this.strokeWidth;
            float relativeOnOther = (float) (sVGLength != null ? relativeOnOther(sVGLength) : 1.0d);
            this.mMarkerPath = new Path();
            Iterator it = h10.iterator();
            while (it.hasNext()) {
                L l10 = (L) it.next();
                int i10 = a.f28944a[l10.f28914a.ordinal()];
                D d13 = i10 != 1 ? i10 != 2 ? i10 != 3 ? null : d12 : d11 : d10;
                if (d13 != null) {
                    d13.C(canvas, paint, f10, l10, relativeOnOther);
                    this.mMarkerPath.addPath(d13.getPath(canvas, paint), d13.f28866r);
                }
            }
            contextElement = null;
        }
    }

    void resetProperties() {
        ArrayList<String> arrayList = this.mLastMergedList;
        if (arrayList == null || this.mOriginProperties == null) {
            return;
        }
        try {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                getClass().getField(this.mLastMergedList.get(size)).set(this, this.mOriginProperties.get(size));
            }
            this.mLastMergedList = null;
            this.mOriginProperties = null;
            this.mAttributeList = this.mPropList;
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }

    public void setCurrentColor(Integer num) {
        this.mCurrentColor = num != null ? num.intValue() : 0;
        invalidate();
        clearChildCache();
    }

    public void setFill(Dynamic dynamic) {
        if (dynamic == null || dynamic.isNull()) {
            this.fill = null;
            invalidate();
            return;
        }
        ReadableType type = dynamic.getType();
        if (type.equals(ReadableType.Map)) {
            setFill(dynamic.asMap());
            return;
        }
        int i10 = 0;
        if (type.equals(ReadableType.Number)) {
            this.fill = JavaOnlyArray.of(0, Integer.valueOf(dynamic.asInt()));
        } else if (type.equals(ReadableType.Array)) {
            this.fill = dynamic.asArray();
        } else {
            JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
            javaOnlyArray.pushInt(0);
            Matcher matcher = regex.matcher(dynamic.asString());
            while (matcher.find()) {
                double parseDouble = Double.parseDouble(matcher.group());
                int i11 = i10 + 1;
                if (i10 < 3) {
                    parseDouble /= 255.0d;
                }
                javaOnlyArray.pushDouble(parseDouble);
                i10 = i11;
            }
            this.fill = javaOnlyArray;
        }
        invalidate();
    }

    public void setFillOpacity(float f10) {
        this.fillOpacity = f10;
        invalidate();
    }

    public void setFillRule(int i10) {
        if (i10 == 0) {
            this.fillRule = Path.FillType.EVEN_ODD;
        } else if (i10 != 1) {
            throw new JSApplicationIllegalArgumentException("fillRule " + i10 + " unrecognized");
        }
        invalidate();
    }

    public void setFilter(String str) {
        this.mFilter = str;
        invalidate();
    }

    @Override // android.view.View
    public void setId(int i10) {
        super.setId(i10);
        VirtualViewManager.setRenderableView(i10, this);
    }

    public void setPropList(ReadableArray readableArray) {
        if (readableArray != null) {
            ArrayList<String> arrayList = new ArrayList<>();
            this.mAttributeList = arrayList;
            this.mPropList = arrayList;
            for (int i10 = 0; i10 < readableArray.size(); i10++) {
                this.mPropList.add(readableArray.getString(i10));
            }
        }
        invalidate();
    }

    public void setStroke(Dynamic dynamic) {
        if (dynamic == null || dynamic.isNull()) {
            this.stroke = null;
            invalidate();
            return;
        }
        if (dynamic.getType().equals(ReadableType.Map)) {
            setStroke(dynamic.asMap());
            return;
        }
        ReadableType type = dynamic.getType();
        int i10 = 0;
        if (type.equals(ReadableType.Number)) {
            this.stroke = JavaOnlyArray.of(0, Integer.valueOf(dynamic.asInt()));
        } else if (type.equals(ReadableType.Array)) {
            this.stroke = dynamic.asArray();
        } else {
            JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
            javaOnlyArray.pushInt(0);
            Matcher matcher = regex.matcher(dynamic.asString());
            while (matcher.find()) {
                double parseDouble = Double.parseDouble(matcher.group());
                int i11 = i10 + 1;
                if (i10 < 3) {
                    parseDouble /= 255.0d;
                }
                javaOnlyArray.pushDouble(parseDouble);
                i10 = i11;
            }
            this.stroke = javaOnlyArray;
        }
        invalidate();
    }

    public void setStrokeDasharray(Dynamic dynamic) {
        ArrayList a10 = SVGLength.a(dynamic);
        if (a10 != null) {
            this.strokeDasharray = (SVGLength[]) a10.toArray(new SVGLength[0]);
        } else {
            this.strokeDasharray = null;
        }
        invalidate();
    }

    public void setStrokeDashoffset(float f10) {
        this.strokeDashoffset = f10 * this.mScale;
        invalidate();
    }

    public void setStrokeLinecap(int i10) {
        if (i10 == 0) {
            this.strokeLinecap = Paint.Cap.BUTT;
        } else if (i10 == 1) {
            this.strokeLinecap = Paint.Cap.ROUND;
        } else {
            if (i10 != 2) {
                throw new JSApplicationIllegalArgumentException("strokeLinecap " + i10 + " unrecognized");
            }
            this.strokeLinecap = Paint.Cap.SQUARE;
        }
        invalidate();
    }

    public void setStrokeLinejoin(int i10) {
        if (i10 == 0) {
            this.strokeLinejoin = Paint.Join.MITER;
        } else if (i10 == 1) {
            this.strokeLinejoin = Paint.Join.ROUND;
        } else {
            if (i10 != 2) {
                throw new JSApplicationIllegalArgumentException("strokeLinejoin " + i10 + " unrecognized");
            }
            this.strokeLinejoin = Paint.Join.BEVEL;
        }
        invalidate();
    }

    public void setStrokeMiterlimit(float f10) {
        this.strokeMiterlimit = f10;
        invalidate();
    }

    public void setStrokeOpacity(float f10) {
        this.strokeOpacity = f10;
        invalidate();
    }

    public void setStrokeWidth(Dynamic dynamic) {
        this.strokeWidth = dynamic.isNull() ? new SVGLength(1.0d) : SVGLength.b(dynamic);
        invalidate();
    }

    public void setVectorEffect(int i10) {
        this.vectorEffect = i10;
        invalidate();
    }

    boolean setupFillPaint(Paint paint, float f10) {
        ReadableArray readableArray = this.fill;
        if (readableArray == null || readableArray.size() <= 0) {
            return false;
        }
        paint.reset();
        paint.setFlags(385);
        paint.setStyle(Paint.Style.FILL);
        setupPaint(paint, f10, this.fill);
        return true;
    }

    boolean setupStrokePaint(Paint paint, float f10) {
        ReadableArray readableArray;
        paint.reset();
        double relativeOnOther = relativeOnOther(this.strokeWidth);
        if (relativeOnOther == 0.0d || (readableArray = this.stroke) == null || readableArray.size() == 0) {
            return false;
        }
        paint.setFlags(385);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(this.strokeLinecap);
        paint.setStrokeJoin(this.strokeLinejoin);
        paint.setStrokeMiter(this.strokeMiterlimit * this.mScale);
        paint.setStrokeWidth((float) relativeOnOther);
        setupPaint(paint, f10, this.stroke);
        SVGLength[] sVGLengthArr = this.strokeDasharray;
        if (sVGLengthArr == null) {
            return true;
        }
        int length = sVGLengthArr.length;
        float[] fArr = new float[length];
        for (int i10 = 0; i10 < length; i10++) {
            fArr[i10] = (float) relativeOnOther(this.strokeDasharray[i10]);
        }
        paint.setPathEffect(new DashPathEffect(fArr, this.strokeDashoffset));
        return true;
    }

    public void setFill(ReadableMap readableMap) {
        if (readableMap == null) {
            this.fill = null;
            invalidate();
            return;
        }
        int i10 = readableMap.getInt("type");
        if (i10 == 0) {
            ReadableType type = readableMap.getType("payload");
            if (type.equals(ReadableType.Number)) {
                this.fill = JavaOnlyArray.of(0, Integer.valueOf(readableMap.getInt("payload")));
            } else if (type.equals(ReadableType.Map)) {
                this.fill = JavaOnlyArray.of(0, readableMap.getMap("payload"));
            }
        } else if (i10 == 1) {
            this.fill = JavaOnlyArray.of(1, readableMap.getString("brushRef"));
        } else {
            this.fill = JavaOnlyArray.of(Integer.valueOf(i10));
        }
        invalidate();
    }

    public void setStroke(ReadableMap readableMap) {
        if (readableMap == null) {
            this.stroke = null;
            invalidate();
            return;
        }
        int i10 = readableMap.getInt("type");
        if (i10 == 0) {
            ReadableType type = readableMap.getType("payload");
            if (type.equals(ReadableType.Number)) {
                this.stroke = JavaOnlyArray.of(0, Integer.valueOf(readableMap.getInt("payload")));
            } else if (type.equals(ReadableType.Map)) {
                this.stroke = JavaOnlyArray.of(0, readableMap.getMap("payload"));
            }
        } else if (i10 == 1) {
            this.stroke = JavaOnlyArray.of(1, readableMap.getString("brushRef"));
        } else {
            this.stroke = JavaOnlyArray.of(Integer.valueOf(i10));
        }
        invalidate();
    }
}
