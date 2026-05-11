package com.horcrux.svg;

import android.graphics.Matrix;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import co.hyperverge.hypersnapsdk.activities.HVRetakeActivity;
import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.C1944g0;
import com.facebook.react.uimanager.C1978y;
import com.facebook.react.uimanager.EnumC1946h0;
import com.facebook.react.uimanager.F0;
import com.facebook.react.uimanager.I0;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.Z;
import com.facebook.react.uimanager.c1;
import com.horcrux.svg.VirtualView;
import java.lang.reflect.Array;
import java.util.Locale;

/* loaded from: classes2.dex */
class VirtualViewManager<V extends VirtualView> extends ViewGroupManager<VirtualView> {
    private static final float CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER = 5.0f;
    private static final double EPSILON = 1.0E-5d;
    private static final int PERSPECTIVE_ARRAY_INVERTED_CAMERA_DISTANCE_INDEX = 2;
    protected final String mClassName;
    protected c1 mDelegate;
    protected final SVGClass svgClass;
    private static final b sMatrixDecompositionContext = new b();
    private static final double[] sTransformDecompositionArray = new double[16];
    private static final SparseArray<RenderableView> mTagToRenderableView = new SparseArray<>();
    private static final SparseArray<Runnable> mTagToRunnable = new SparseArray<>();

    protected enum SVGClass {
        RNSVGGroup,
        RNSVGPath,
        RNSVGText,
        RNSVGTSpan,
        RNSVGTextPath,
        RNSVGImage,
        RNSVGCircle,
        RNSVGEllipse,
        RNSVGLine,
        RNSVGRect,
        RNSVGClipPath,
        RNSVGDefs,
        RNSVGUse,
        RNSVGSymbol,
        RNSVGLinearGradient,
        RNSVGRadialGradient,
        RNSVGPattern,
        RNSVGMask,
        RNSVGFilter,
        RNSVGFeBlend,
        RNSVGFeColorMatrix,
        RNSVGFeFlood,
        RNSVGFeGaussianBlur,
        RNSVGFeMerge,
        RNSVGFeOffset,
        RNSVGMarker,
        RNSVGForeignObject
    }

    class a implements ViewGroup.OnHierarchyChangeListener {
        a() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            if (view instanceof VirtualView) {
                VirtualViewManager.this.invalidateSvgView((VirtualView) view);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            if (view instanceof VirtualView) {
                VirtualViewManager.this.invalidateSvgView((VirtualView) view);
            }
        }
    }

    static class b extends Z.a {

        /* renamed from: g, reason: collision with root package name */
        final double[] f28988g = new double[4];

        /* renamed from: h, reason: collision with root package name */
        final double[] f28989h = new double[3];

        /* renamed from: i, reason: collision with root package name */
        final double[] f28990i = new double[3];

        /* renamed from: j, reason: collision with root package name */
        final double[] f28991j = new double[3];

        /* renamed from: k, reason: collision with root package name */
        final double[] f28992k = new double[3];

        b() {
        }
    }

    static class c extends com.facebook.react.uimanager.V {
        c() {
        }

        @Z4.b(names = {"alignSelf", "alignItems", "collapsable", "flex", "flexBasis", "flexDirection", "flexGrow", "flexShrink", "flexWrap", "justifyContent", "overflow", "alignContent", "display", "position", "right", "top", "bottom", "left", "start", "end", "width", "height", "minWidth", "maxWidth", "minHeight", "maxHeight", "margin", "marginVertical", "marginHorizontal", "marginLeft", "marginRight", "marginTop", "marginBottom", "marginStart", "marginEnd", "padding", "paddingVertical", "paddingHorizontal", "paddingLeft", "paddingRight", "paddingTop", "paddingBottom", "paddingStart", "paddingEnd", "borderWidth", "borderStartWidth", "borderEndWidth", "borderTopWidth", "borderBottomWidth", "borderLeftWidth", "borderRightWidth"})
        public void ignoreLayoutProps(int i10, Dynamic dynamic) {
        }
    }

    protected VirtualViewManager(SVGClass sVGClass) {
        this.svgClass = sVGClass;
        this.mClassName = sVGClass.toString();
    }

    private static void decomposeMatrix() {
        b bVar = sMatrixDecompositionContext;
        double[] dArr = bVar.f28988g;
        double[] dArr2 = bVar.f28989h;
        double[] dArr3 = bVar.f28990i;
        double[] dArr4 = bVar.f28991j;
        double[] dArr5 = bVar.f28992k;
        if (isZero(sTransformDecompositionArray[15])) {
            return;
        }
        double[][] dArr6 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, 4, 4);
        double[] dArr7 = new double[16];
        for (int i10 = 0; i10 < 4; i10++) {
            for (int i11 = 0; i11 < 4; i11++) {
                double[] dArr8 = sTransformDecompositionArray;
                int i12 = (i10 * 4) + i11;
                double d10 = dArr8[i12] / dArr8[15];
                dArr6[i10][i11] = d10;
                if (i11 == 3) {
                    d10 = 0.0d;
                }
                dArr7[i12] = d10;
            }
        }
        dArr7[15] = 1.0d;
        if (isZero(com.facebook.react.uimanager.Z.m(dArr7))) {
            return;
        }
        if (isZero(dArr6[0][3]) && isZero(dArr6[1][3]) && isZero(dArr6[2][3])) {
            dArr[2] = 0.0d;
            dArr[1] = 0.0d;
            dArr[0] = 0.0d;
            dArr[3] = 1.0d;
        } else {
            com.facebook.react.uimanager.Z.q(new double[]{dArr6[0][3], dArr6[1][3], dArr6[2][3], dArr6[3][3]}, com.facebook.react.uimanager.Z.t(com.facebook.react.uimanager.Z.n(dArr7)), dArr);
        }
        System.arraycopy(dArr6[3], 0, dArr4, 0, 3);
        double[][] dArr9 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, 3, 3);
        for (int i13 = 0; i13 < 3; i13++) {
            double[] dArr10 = dArr9[i13];
            double[] dArr11 = dArr6[i13];
            dArr10[0] = dArr11[0];
            dArr10[1] = dArr11[1];
            dArr10[2] = dArr11[2];
        }
        double x10 = com.facebook.react.uimanager.Z.x(dArr9[0]);
        dArr2[0] = x10;
        double[] y10 = com.facebook.react.uimanager.Z.y(dArr9[0], x10);
        dArr9[0] = y10;
        double w10 = com.facebook.react.uimanager.Z.w(y10, dArr9[1]);
        dArr3[0] = w10;
        double[] u10 = com.facebook.react.uimanager.Z.u(dArr9[1], dArr9[0], 1.0d, -w10);
        dArr9[1] = u10;
        double w11 = com.facebook.react.uimanager.Z.w(dArr9[0], u10);
        dArr3[0] = w11;
        double[] u11 = com.facebook.react.uimanager.Z.u(dArr9[1], dArr9[0], 1.0d, -w11);
        dArr9[1] = u11;
        double x11 = com.facebook.react.uimanager.Z.x(u11);
        dArr2[1] = x11;
        dArr9[1] = com.facebook.react.uimanager.Z.y(dArr9[1], x11);
        dArr3[0] = dArr3[0] / dArr2[1];
        double w12 = com.facebook.react.uimanager.Z.w(dArr9[0], dArr9[2]);
        dArr3[1] = w12;
        double[] u12 = com.facebook.react.uimanager.Z.u(dArr9[2], dArr9[0], 1.0d, -w12);
        dArr9[2] = u12;
        double w13 = com.facebook.react.uimanager.Z.w(dArr9[1], u12);
        dArr3[2] = w13;
        double[] u13 = com.facebook.react.uimanager.Z.u(dArr9[2], dArr9[1], 1.0d, -w13);
        dArr9[2] = u13;
        double x12 = com.facebook.react.uimanager.Z.x(u13);
        dArr2[2] = x12;
        double[] y11 = com.facebook.react.uimanager.Z.y(dArr9[2], x12);
        dArr9[2] = y11;
        double d11 = dArr3[1];
        double d12 = dArr2[2];
        dArr3[1] = d11 / d12;
        dArr3[2] = dArr3[2] / d12;
        if (com.facebook.react.uimanager.Z.w(dArr9[0], com.facebook.react.uimanager.Z.v(dArr9[1], y11)) < 0.0d) {
            for (int i14 = 0; i14 < 3; i14++) {
                dArr2[i14] = dArr2[i14] * (-1.0d);
                double[] dArr12 = dArr9[i14];
                dArr12[0] = dArr12[0] * (-1.0d);
                dArr12[1] = dArr12[1] * (-1.0d);
                dArr12[2] = dArr12[2] * (-1.0d);
            }
        }
        double[] dArr13 = dArr9[2];
        dArr5[0] = com.facebook.react.uimanager.Z.s((-Math.atan2(dArr13[1], dArr13[2])) * 57.29577951308232d);
        double[] dArr14 = dArr9[2];
        double d13 = -dArr14[0];
        double d14 = dArr14[1];
        double d15 = dArr14[2];
        dArr5[1] = com.facebook.react.uimanager.Z.s((-Math.atan2(d13, Math.sqrt((d14 * d14) + (d15 * d15)))) * 57.29577951308232d);
        dArr5[2] = com.facebook.react.uimanager.Z.s((-Math.atan2(dArr9[1][0], dArr9[0][0])) * 57.29577951308232d);
    }

    static RenderableView getRenderableViewByTag(int i10) {
        return mTagToRenderableView.get(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void invalidateSvgView(V v10) {
        SvgView svgView = v10.getSvgView();
        if (svgView != null) {
            svgView.invalidate();
        }
        if (v10 instanceof m0) {
            ((m0) v10).H().clearChildCache();
        }
    }

    private static boolean isZero(double d10) {
        return !Double.isNaN(d10) && Math.abs(d10) < EPSILON;
    }

    private static void resetTransformProperty(View view) {
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        view.setRotation(0.0f);
        view.setRotationX(0.0f);
        view.setRotationY(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setCameraDistance(0.0f);
    }

    static void runWhenViewIsAvailable(int i10, Runnable runnable) {
        mTagToRunnable.put(i10, runnable);
    }

    static void setRenderableView(int i10, RenderableView renderableView) {
        mTagToRenderableView.put(i10, renderableView);
        SparseArray<Runnable> sparseArray = mTagToRunnable;
        Runnable runnable = sparseArray.get(i10);
        if (runnable != null) {
            runnable.run();
            sparseArray.delete(i10);
        }
    }

    private static void setTransformProperty(View view, ReadableArray readableArray) {
        I0.d(readableArray, sTransformDecompositionArray);
        decomposeMatrix();
        b bVar = sMatrixDecompositionContext;
        view.setTranslationX(C1944g0.g((float) bVar.f28991j[0]));
        view.setTranslationY(C1944g0.g((float) bVar.f28991j[1]));
        view.setRotation((float) bVar.f28992k[2]);
        view.setRotationX((float) bVar.f28992k[0]);
        view.setRotationY((float) bVar.f28992k[1]);
        view.setScaleX((float) bVar.f28989h[0]);
        view.setScaleY((float) bVar.f28989h[1]);
        double[] dArr = bVar.f28988g;
        if (dArr.length > 2) {
            float f10 = (float) dArr[2];
            if (f10 == 0.0f) {
                f10 = 7.8125E-4f;
            }
            float f11 = (-1.0f) / f10;
            float f12 = C1978y.c().density;
            view.setCameraDistance(f12 * f12 * f11 * 5.0f);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected c1 getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return this.mClassName;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public Class<? extends com.facebook.react.uimanager.V> getShadowNodeClass() {
        return c.class;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.O
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @Z4.a(name = "clipPath")
    public void setClipPath(V v10, String str) {
        v10.setClipPath(str);
    }

    @Z4.a(name = "clipRule")
    public void setClipRule(V v10, int i10) {
        v10.setClipRule(i10);
    }

    @Z4.a(name = "display")
    public void setDisplay(V v10, String str) {
        v10.setDisplay(str);
    }

    @Z4.a(name = "markerEnd")
    public void setMarkerEnd(V v10, String str) {
        v10.setMarkerEnd(str);
    }

    @Z4.a(name = "markerMid")
    public void setMarkerMid(V v10, String str) {
        v10.setMarkerMid(str);
    }

    @Z4.a(name = "markerStart")
    public void setMarkerStart(V v10, String str) {
        v10.setMarkerStart(str);
    }

    @Z4.a(name = "mask")
    public void setMask(V v10, String str) {
        v10.setMask(str);
    }

    @Z4.a(name = "matrix")
    public void setMatrix(V v10, Dynamic dynamic) {
        v10.setMatrix(dynamic);
    }

    @Z4.a(name = "name")
    public void setName(V v10, String str) {
        v10.setName(str);
    }

    @Z4.a(defaultFloat = 1.0f, name = "opacity")
    public void setOpacity(V v10, float f10) {
        v10.setOpacity(f10);
    }

    @Z4.a(name = "pointerEvents")
    public void setPointerEvents(V v10, String str) {
        if (str == null) {
            v10.setPointerEvents(EnumC1946h0.AUTO);
        } else {
            v10.setPointerEvents(EnumC1946h0.valueOf(str.toUpperCase(Locale.US).replace("-", "_")));
        }
    }

    @Z4.a(name = "responsible")
    public void setResponsible(V v10, boolean z10) {
        v10.setResponsible(z10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(F0 f02, VirtualView virtualView) {
        super.addEventEmitters(f02, (F0) virtualView);
        virtualView.setOnHierarchyChangeListener(new a());
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public com.facebook.react.uimanager.V createShadowNodeInstance() {
        return new c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public VirtualView createViewInstance(F0 f02) {
        switch (this.svgClass.ordinal()) {
            case 0:
                return new C2923z(f02);
            case 1:
                return new H(f02);
            case 2:
                return new m0(f02);
            case 3:
                return new Z(f02);
            case 4:
                return new a0(f02);
            case 5:
                return new A(f02);
            case 6:
                return new C2899b(f02);
            case 7:
                return new C2905h(f02);
            case 8:
                return new B(f02);
            case 9:
                return new O(f02);
            case RequestError.EVENT_TIMEOUT /* 10 */:
                return new C2900c(f02);
            case 11:
                return new C2903f(f02);
            case 12:
                return new n0(f02);
            case 13:
                return new Q(f02);
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                return new C(f02);
            case HVError.SSL_CONNECT_ERROR /* 15 */:
                return new N(f02);
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                return new I(f02);
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                return new E(f02);
            case 18:
                return new C2918u(f02);
            case 19:
                return new C2907j(f02);
            case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                return new C2908k(f02);
            case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                return new C2909l(f02);
            case HVError.FACE_DETECTION_ERROR /* 22 */:
                return new C2910m(f02);
            case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                return new C2911n(f02);
            case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                return new C2912o(f02);
            case HVError.LOW_STORAGE_ERROR /* 25 */:
                return new D(f02);
            case 26:
                return new C2920w(f02);
            default:
                throw new IllegalStateException("Unexpected type " + this.svgClass.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(VirtualView virtualView) {
        super.onAfterUpdateTransaction((VirtualViewManager<V>) virtualView);
        invalidateSvgView(virtualView);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(VirtualView virtualView) {
        super.onDropViewInstance((VirtualViewManager<V>) virtualView);
        mTagToRenderableView.remove(virtualView.getId());
    }

    public void setMatrix(V v10, ReadableArray readableArray) {
        v10.setMatrix(readableArray);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.InterfaceC1945h
    public void setTransform(VirtualView virtualView, ReadableArray readableArray) {
        if (readableArray == null) {
            resetTransformProperty(virtualView);
        } else {
            setTransformProperty(virtualView, readableArray);
        }
        Matrix matrix = virtualView.getMatrix();
        virtualView.mTransform = matrix;
        virtualView.mTransformInvertible = matrix.invert(virtualView.mInvTransform);
    }

    @Z4.a(name = "transform")
    public void setTransform(V v10, Dynamic dynamic) {
        if (dynamic.getType() != ReadableType.Array) {
            return;
        }
        setTransform((VirtualView) v10, dynamic.asArray());
    }
}
