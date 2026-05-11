package ea;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.C1944g0;
import java.util.Arrays;
import kotlin.collections.AbstractC3574i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import xc.C5142C;

/* renamed from: ea.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3109d {

    /* renamed from: J, reason: collision with root package name */
    public static final b f32330J = new b(null);

    /* renamed from: K, reason: collision with root package name */
    private static MotionEvent.PointerProperties[] f32331K;

    /* renamed from: L, reason: collision with root package name */
    private static MotionEvent.PointerCoords[] f32332L;

    /* renamed from: M, reason: collision with root package name */
    private static short f32333M;

    /* renamed from: A, reason: collision with root package name */
    private C3112g f32334A;

    /* renamed from: B, reason: collision with root package name */
    private p f32335B;

    /* renamed from: C, reason: collision with root package name */
    private InterfaceC3110e f32336C;

    /* renamed from: D, reason: collision with root package name */
    private int f32337D;

    /* renamed from: E, reason: collision with root package name */
    private int f32338E;

    /* renamed from: F, reason: collision with root package name */
    private int f32339F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f32340G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f32341H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f32342I;

    /* renamed from: a, reason: collision with root package name */
    private final int[] f32343a = new int[12];

    /* renamed from: b, reason: collision with root package name */
    private int f32344b;

    /* renamed from: c, reason: collision with root package name */
    private final int[] f32345c;

    /* renamed from: d, reason: collision with root package name */
    private int f32346d;

    /* renamed from: e, reason: collision with root package name */
    private View f32347e;

    /* renamed from: f, reason: collision with root package name */
    private int f32348f;

    /* renamed from: g, reason: collision with root package name */
    private float f32349g;

    /* renamed from: h, reason: collision with root package name */
    private float f32350h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f32351i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f32352j;

    /* renamed from: k, reason: collision with root package name */
    private int f32353k;

    /* renamed from: l, reason: collision with root package name */
    private WritableArray f32354l;

    /* renamed from: m, reason: collision with root package name */
    private WritableArray f32355m;

    /* renamed from: n, reason: collision with root package name */
    private int f32356n;

    /* renamed from: o, reason: collision with root package name */
    private int f32357o;

    /* renamed from: p, reason: collision with root package name */
    private final c[] f32358p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f32359q;

    /* renamed from: r, reason: collision with root package name */
    private float[] f32360r;

    /* renamed from: s, reason: collision with root package name */
    private short f32361s;

    /* renamed from: t, reason: collision with root package name */
    private float f32362t;

    /* renamed from: u, reason: collision with root package name */
    private float f32363u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f32364v;

    /* renamed from: w, reason: collision with root package name */
    private float f32365w;

    /* renamed from: x, reason: collision with root package name */
    private float f32366x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f32367y;

    /* renamed from: z, reason: collision with root package name */
    private int f32368z;

    /* renamed from: ea.d$a */
    public static final class a extends Exception {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC3109d handler, MotionEvent event, IllegalArgumentException e10) {
            super(StringsKt.f("\n    handler: " + C5142C.b(handler.getClass()).q() + "\n    state: " + handler.Q() + "\n    view: " + handler.U() + "\n    orchestrator: " + handler.N() + "\n    isEnabled: " + handler.a0() + "\n    isActive: " + handler.X() + "\n    isAwaiting: " + handler.Y() + "\n    trackedPointersCount: " + handler.f32344b + "\n    trackedPointers: " + AbstractC3574i.R(handler.f32343a, ", ", null, null, 0, null, null, 62, null) + "\n    while handling event: " + event + "\n    "), e10);
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(event, "event");
            Intrinsics.checkNotNullParameter(e10, "e");
        }
    }

    /* renamed from: ea.d$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean c(float f10) {
            return !Float.isNaN(f10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void d(int i10) {
            if (AbstractC3109d.f32331K == null) {
                AbstractC3109d.f32331K = new MotionEvent.PointerProperties[12];
                AbstractC3109d.f32332L = new MotionEvent.PointerCoords[12];
            }
            while (i10 > 0) {
                MotionEvent.PointerProperties[] pointerPropertiesArr = AbstractC3109d.f32331K;
                MotionEvent.PointerCoords[] pointerCoordsArr = null;
                if (pointerPropertiesArr == null) {
                    Intrinsics.v("pointerProps");
                    pointerPropertiesArr = null;
                }
                int i11 = i10 - 1;
                if (pointerPropertiesArr[i11] != null) {
                    return;
                }
                MotionEvent.PointerProperties[] pointerPropertiesArr2 = AbstractC3109d.f32331K;
                if (pointerPropertiesArr2 == null) {
                    Intrinsics.v("pointerProps");
                    pointerPropertiesArr2 = null;
                }
                pointerPropertiesArr2[i11] = new MotionEvent.PointerProperties();
                MotionEvent.PointerCoords[] pointerCoordsArr2 = AbstractC3109d.f32332L;
                if (pointerCoordsArr2 == null) {
                    Intrinsics.v("pointerCoords");
                } else {
                    pointerCoordsArr = pointerCoordsArr2;
                }
                pointerCoordsArr[i11] = new MotionEvent.PointerCoords();
                i10--;
            }
        }

        private b() {
        }
    }

    /* renamed from: ea.d$c */
    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final int f32369a;

        /* renamed from: b, reason: collision with root package name */
        private float f32370b;

        /* renamed from: c, reason: collision with root package name */
        private float f32371c;

        /* renamed from: d, reason: collision with root package name */
        private float f32372d;

        /* renamed from: e, reason: collision with root package name */
        private float f32373e;

        public c(int i10, float f10, float f11, float f12, float f13) {
            this.f32369a = i10;
            this.f32370b = f10;
            this.f32371c = f11;
            this.f32372d = f12;
            this.f32373e = f13;
        }

        public final float a() {
            return this.f32372d;
        }

        public final float b() {
            return this.f32373e;
        }

        public final int c() {
            return this.f32369a;
        }

        public final float d() {
            return this.f32370b;
        }

        public final float e() {
            return this.f32371c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f32369a == cVar.f32369a && Float.compare(this.f32370b, cVar.f32370b) == 0 && Float.compare(this.f32371c, cVar.f32371c) == 0 && Float.compare(this.f32372d, cVar.f32372d) == 0 && Float.compare(this.f32373e, cVar.f32373e) == 0;
        }

        public final void f(float f10) {
            this.f32372d = f10;
        }

        public final void g(float f10) {
            this.f32373e = f10;
        }

        public final void h(float f10) {
            this.f32370b = f10;
        }

        public int hashCode() {
            return (((((((Integer.hashCode(this.f32369a) * 31) + Float.hashCode(this.f32370b)) * 31) + Float.hashCode(this.f32371c)) * 31) + Float.hashCode(this.f32372d)) * 31) + Float.hashCode(this.f32373e);
        }

        public final void i(float f10) {
            this.f32371c = f10;
        }

        public String toString() {
            return "PointerData(pointerId=" + this.f32369a + ", x=" + this.f32370b + ", y=" + this.f32371c + ", absoluteX=" + this.f32372d + ", absoluteY=" + this.f32373e + ")";
        }
    }

    public AbstractC3109d() {
        int[] iArr = new int[2];
        for (int i10 = 0; i10 < 2; i10++) {
            iArr[i10] = 0;
        }
        this.f32345c = iArr;
        this.f32352j = true;
        c[] cVarArr = new c[12];
        for (int i11 = 0; i11 < 12; i11++) {
            cVarArr[i11] = null;
        }
        this.f32358p = cVarArr;
        this.f32337D = 3;
    }

    private final void A() {
        this.f32355m = null;
        for (c cVar : this.f32358p) {
            if (cVar != null) {
                m(cVar);
            }
        }
    }

    private final int C() {
        int[] iArr;
        int i10 = 0;
        while (i10 < this.f32344b) {
            int i11 = 0;
            while (true) {
                iArr = this.f32343a;
                if (i11 >= iArr.length || iArr[i11] == i10) {
                    break;
                }
                i11++;
            }
            if (i11 == iArr.length) {
                return i10;
            }
            i10++;
        }
        return i10;
    }

    private final void C0(MotionEvent motionEvent) {
        int toolType = motionEvent.getToolType(motionEvent.getActionIndex());
        int i10 = 1;
        if (toolType == 1) {
            i10 = 0;
        } else if (toolType != 2) {
            i10 = 3;
            if (toolType == 3) {
                i10 = 2;
            }
        }
        this.f32337D = i10;
    }

    private final Activity F(Context context) {
        if (context instanceof ReactContext) {
            return ((ReactContext) context).getCurrentActivity();
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return F(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    private final boolean Z(int i10) {
        int i11 = this.f32338E;
        return i11 == 0 ? i10 == 1 : (i10 & i11) != 0;
    }

    private final void d0(int i10) {
        UiThreadUtil.assertOnUiThread();
        if (this.f32348f == i10) {
            return;
        }
        if (this.f32357o > 0 && (i10 == 5 || i10 == 3 || i10 == 1)) {
            p();
        }
        int i11 = this.f32348f;
        this.f32348f = i10;
        if (i10 == 4) {
            short s10 = f32333M;
            f32333M = (short) (s10 + 1);
            this.f32361s = s10;
        }
        C3112g c3112g = this.f32334A;
        Intrinsics.d(c3112g);
        c3112g.w(this, i10, i11);
        k0(i10, i11);
    }

    private final boolean e0(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != this.f32344b) {
            return true;
        }
        int length = this.f32343a.length;
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = this.f32343a[i10];
            if (i11 != -1 && i11 != i10) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b6 A[EDGE_INSN: B:34:0x00b6->B:35:0x00b6 BREAK  A[LOOP:0: B:13:0x006d->B:31:0x00b3], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e0  */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.view.MotionEvent$PointerProperties[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final MotionEvent k(MotionEvent motionEvent) {
        int actionIndex;
        int pointerCount;
        MotionEvent.PointerCoords[] pointerCoordsArr;
        MotionEvent.PointerProperties[] pointerPropertiesArr;
        MotionEvent.PointerCoords[] pointerCoordsArr2;
        ?? r32;
        MotionEvent.PointerProperties[] pointerPropertiesArr2;
        MotionEvent.PointerCoords[] pointerCoordsArr3;
        if (!e0(motionEvent)) {
            return motionEvent;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i10 = 2;
        int i11 = 0;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 5) {
                    if (actionMasked != 6) {
                        i10 = actionMasked;
                        actionIndex = -1;
                        f32330J.d(this.f32344b);
                        float rawX = motionEvent.getRawX() - motionEvent.getX();
                        float rawY = motionEvent.getRawY() - motionEvent.getY();
                        motionEvent.offsetLocation(rawX, rawY);
                        pointerCount = motionEvent.getPointerCount();
                        int i12 = i10;
                        int i13 = 0;
                        while (true) {
                            pointerCoordsArr = null;
                            if (i11 >= pointerCount) {
                                break;
                            }
                            int pointerId = motionEvent.getPointerId(i11);
                            if (this.f32343a[pointerId] != -1) {
                                MotionEvent.PointerProperties[] pointerPropertiesArr3 = f32331K;
                                if (pointerPropertiesArr3 == null) {
                                    Intrinsics.v("pointerProps");
                                    pointerPropertiesArr3 = null;
                                }
                                motionEvent.getPointerProperties(i11, pointerPropertiesArr3[i13]);
                                MotionEvent.PointerProperties[] pointerPropertiesArr4 = f32331K;
                                if (pointerPropertiesArr4 == null) {
                                    Intrinsics.v("pointerProps");
                                    pointerPropertiesArr4 = null;
                                }
                                MotionEvent.PointerProperties pointerProperties = pointerPropertiesArr4[i13];
                                Intrinsics.d(pointerProperties);
                                pointerProperties.id = this.f32343a[pointerId];
                                MotionEvent.PointerCoords[] pointerCoordsArr4 = f32332L;
                                if (pointerCoordsArr4 == null) {
                                    Intrinsics.v("pointerCoords");
                                } else {
                                    pointerCoordsArr = pointerCoordsArr4;
                                }
                                motionEvent.getPointerCoords(i11, pointerCoordsArr[i13]);
                                if (i11 == actionIndex) {
                                    i12 |= i13 << 8;
                                }
                                i13++;
                            }
                            i11++;
                        }
                        pointerPropertiesArr = f32331K;
                        if (pointerPropertiesArr == null) {
                            Intrinsics.v("pointerProps");
                            pointerPropertiesArr = null;
                        }
                        if (pointerPropertiesArr.length != 0) {
                            MotionEvent.PointerCoords[] pointerCoordsArr5 = f32332L;
                            if (pointerCoordsArr5 == null) {
                                Intrinsics.v("pointerCoords");
                                pointerCoordsArr5 = null;
                            }
                            if (pointerCoordsArr5.length != 0) {
                                try {
                                    long downTime = motionEvent.getDownTime();
                                    long eventTime = motionEvent.getEventTime();
                                    MotionEvent.PointerProperties[] pointerPropertiesArr5 = f32331K;
                                    if (pointerPropertiesArr5 == null) {
                                        Intrinsics.v("pointerProps");
                                        pointerPropertiesArr2 = null;
                                    } else {
                                        pointerPropertiesArr2 = pointerPropertiesArr5;
                                    }
                                    MotionEvent.PointerCoords[] pointerCoordsArr6 = f32332L;
                                    if (pointerCoordsArr6 == null) {
                                        Intrinsics.v("pointerCoords");
                                        pointerCoordsArr3 = null;
                                    } else {
                                        pointerCoordsArr3 = pointerCoordsArr6;
                                    }
                                    MotionEvent obtain = MotionEvent.obtain(downTime, eventTime, i12, i13, pointerPropertiesArr2, pointerCoordsArr3, motionEvent.getMetaState(), motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
                                    Intrinsics.checkNotNullExpressionValue(obtain, "obtain(...)");
                                    float f10 = -rawX;
                                    float f11 = -rawY;
                                    motionEvent.offsetLocation(f10, f11);
                                    obtain.offsetLocation(f10, f11);
                                    return obtain;
                                } catch (IllegalArgumentException e10) {
                                    throw new a(this, motionEvent, e10);
                                }
                            }
                        }
                        pointerCoordsArr2 = f32332L;
                        if (pointerCoordsArr2 == null) {
                            Intrinsics.v("pointerCoords");
                            pointerCoordsArr2 = null;
                        }
                        int length = pointerCoordsArr2.length;
                        r32 = f32331K;
                        if (r32 == 0) {
                            Intrinsics.v("pointerProps");
                        } else {
                            pointerCoordsArr = r32;
                        }
                        throw new IllegalStateException("pointerCoords.size=" + length + ", pointerProps.size=" + pointerCoordsArr.length);
                    }
                }
            }
            actionIndex = motionEvent.getActionIndex();
            if (this.f32343a[motionEvent.getPointerId(actionIndex)] != -1) {
                i10 = this.f32344b == 1 ? 1 : 6;
            }
            f32330J.d(this.f32344b);
            float rawX2 = motionEvent.getRawX() - motionEvent.getX();
            float rawY2 = motionEvent.getRawY() - motionEvent.getY();
            motionEvent.offsetLocation(rawX2, rawY2);
            pointerCount = motionEvent.getPointerCount();
            int i122 = i10;
            int i132 = 0;
            while (true) {
                pointerCoordsArr = null;
                if (i11 >= pointerCount) {
                }
                i11++;
            }
            pointerPropertiesArr = f32331K;
            if (pointerPropertiesArr == null) {
            }
            if (pointerPropertiesArr.length != 0) {
            }
            pointerCoordsArr2 = f32332L;
            if (pointerCoordsArr2 == null) {
            }
            int length2 = pointerCoordsArr2.length;
            r32 = f32331K;
            if (r32 == 0) {
            }
            throw new IllegalStateException("pointerCoords.size=" + length2 + ", pointerProps.size=" + pointerCoordsArr.length);
        }
        actionIndex = motionEvent.getActionIndex();
        if (this.f32343a[motionEvent.getPointerId(actionIndex)] != -1) {
            i10 = this.f32344b == 1 ? 0 : 5;
        }
        f32330J.d(this.f32344b);
        float rawX22 = motionEvent.getRawX() - motionEvent.getX();
        float rawY22 = motionEvent.getRawY() - motionEvent.getY();
        motionEvent.offsetLocation(rawX22, rawY22);
        pointerCount = motionEvent.getPointerCount();
        int i1222 = i10;
        int i1322 = 0;
        while (true) {
            pointerCoordsArr = null;
            if (i11 >= pointerCount) {
            }
            i11++;
        }
        pointerPropertiesArr = f32331K;
        if (pointerPropertiesArr == null) {
        }
        if (pointerPropertiesArr.length != 0) {
        }
        pointerCoordsArr2 = f32332L;
        if (pointerCoordsArr2 == null) {
        }
        int length22 = pointerCoordsArr2.length;
        r32 = f32331K;
        if (r32 == 0) {
        }
        throw new IllegalStateException("pointerCoords.size=" + length22 + ", pointerProps.size=" + pointerCoordsArr.length);
    }

    private final void l(c cVar) {
        if (this.f32354l == null) {
            this.f32354l = Arguments.createArray();
        }
        WritableArray writableArray = this.f32354l;
        Intrinsics.d(writableArray);
        writableArray.pushMap(s(cVar));
    }

    private final void m(c cVar) {
        if (this.f32355m == null) {
            this.f32355m = Arguments.createArray();
        }
        WritableArray writableArray = this.f32355m;
        Intrinsics.d(writableArray);
        writableArray.pushMap(s(cVar));
    }

    private final void p() {
        this.f32356n = 4;
        this.f32354l = null;
        A();
        for (c cVar : this.f32358p) {
            if (cVar != null) {
                l(cVar);
            }
        }
        this.f32357o = 0;
        AbstractC3574i.p(this.f32358p, null, 0, 0, 6, null);
        w();
    }

    private final WritableMap s(c cVar) {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("id", cVar.c());
        createMap.putDouble("x", C1944g0.e(cVar.d()));
        createMap.putDouble("y", C1944g0.e(cVar.e()));
        createMap.putDouble("absoluteX", C1944g0.e(cVar.a()));
        createMap.putDouble("absoluteY", C1944g0.e(cVar.b()));
        return createMap;
    }

    private final void v(MotionEvent motionEvent, MotionEvent motionEvent2) {
        this.f32354l = null;
        this.f32356n = 1;
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        this.f32358p[pointerId] = new c(pointerId, motionEvent.getX(motionEvent.getActionIndex()), motionEvent.getY(motionEvent.getActionIndex()), (motionEvent2.getX(motionEvent.getActionIndex()) + (motionEvent2.getRawX() - motionEvent2.getX())) - this.f32345c[0], (motionEvent2.getY(motionEvent.getActionIndex()) + (motionEvent2.getRawY() - motionEvent2.getY())) - this.f32345c[1]);
        this.f32357o++;
        c cVar = this.f32358p[pointerId];
        Intrinsics.d(cVar);
        l(cVar);
        A();
        w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v0(AbstractC3109d this_applySelf) {
        Intrinsics.checkNotNullParameter(this_applySelf, "$this_applySelf");
        this_applySelf.o();
    }

    private final void x(MotionEvent motionEvent, MotionEvent motionEvent2) {
        this.f32354l = null;
        this.f32356n = 2;
        float rawX = motionEvent2.getRawX() - motionEvent2.getX();
        float rawY = motionEvent2.getRawY() - motionEvent2.getY();
        int pointerCount = motionEvent.getPointerCount();
        int i10 = 0;
        for (int i11 = 0; i11 < pointerCount; i11++) {
            c cVar = this.f32358p[motionEvent.getPointerId(i11)];
            if (cVar != null && (cVar.d() != motionEvent.getX(i11) || cVar.e() != motionEvent.getY(i11))) {
                cVar.h(motionEvent.getX(i11));
                cVar.i(motionEvent.getY(i11));
                cVar.f((motionEvent2.getX(i11) + rawX) - this.f32345c[0]);
                cVar.g((motionEvent2.getY(i11) + rawY) - this.f32345c[1]);
                l(cVar);
                i10++;
            }
        }
        if (i10 > 0) {
            A();
            w();
        }
    }

    private final void y(MotionEvent motionEvent, MotionEvent motionEvent2) {
        A();
        this.f32354l = null;
        this.f32356n = 3;
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        this.f32358p[pointerId] = new c(pointerId, motionEvent.getX(motionEvent.getActionIndex()), motionEvent.getY(motionEvent.getActionIndex()), (motionEvent2.getX(motionEvent.getActionIndex()) + (motionEvent2.getRawX() - motionEvent2.getX())) - this.f32345c[0], (motionEvent2.getY(motionEvent.getActionIndex()) + (motionEvent2.getRawY() - motionEvent2.getY())) - this.f32345c[1]);
        c cVar = this.f32358p[pointerId];
        Intrinsics.d(cVar);
        l(cVar);
        this.f32358p[pointerId] = null;
        this.f32357o--;
        w();
    }

    public final void A0(boolean z10) {
        this.f32359q = z10;
    }

    public final void B() {
        int i10 = this.f32348f;
        if (i10 == 4 || i10 == 0 || i10 == 2) {
            d0(1);
        }
    }

    public final AbstractC3109d B0(p pVar) {
        this.f32335B = pVar;
        return this;
    }

    public final int D() {
        return this.f32353k;
    }

    public final AbstractC3109d D0(boolean z10) {
        AbstractC3109d p02 = p0();
        p02.f32367y = z10;
        return p02;
    }

    public final int E() {
        return this.f32339F;
    }

    public final void E0(boolean z10) {
        this.f32342I = z10;
    }

    public final void F0(int i10) {
        this.f32346d = i10;
    }

    public final short G() {
        return this.f32361s;
    }

    protected final boolean G0(MotionEvent sourceEvent) {
        Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
        if (sourceEvent.getToolType(0) == 3) {
            if (sourceEvent.getAction() == 0 || sourceEvent.getAction() == 1 || sourceEvent.getAction() == 6 || sourceEvent.getAction() == 5 || !(sourceEvent.getAction() == 2 || Z(sourceEvent.getActionButton()))) {
                return false;
            }
            if (sourceEvent.getAction() == 2 && !Z(sourceEvent.getButtonState())) {
                return false;
            }
        }
        return true;
    }

    public final float H() {
        return (this.f32362t + this.f32365w) - this.f32345c[0];
    }

    public boolean H0(AbstractC3109d handler) {
        InterfaceC3110e interfaceC3110e;
        Intrinsics.checkNotNullParameter(handler, "handler");
        if (handler == this || (interfaceC3110e = this.f32336C) == null) {
            return false;
        }
        return interfaceC3110e.d(this, handler);
    }

    public final float I() {
        return (this.f32363u + this.f32366x) - this.f32345c[1];
    }

    public boolean I0(AbstractC3109d handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        if (handler == this) {
            return true;
        }
        InterfaceC3110e interfaceC3110e = this.f32336C;
        if (interfaceC3110e != null) {
            return interfaceC3110e.b(this, handler);
        }
        return false;
    }

    public final float J() {
        return this.f32362t;
    }

    public boolean J0(AbstractC3109d handler) {
        InterfaceC3110e interfaceC3110e;
        Intrinsics.checkNotNullParameter(handler, "handler");
        if (handler == this || (interfaceC3110e = this.f32336C) == null) {
            return false;
        }
        return interfaceC3110e.a(this, handler);
    }

    public final float K() {
        return this.f32363u;
    }

    public final boolean K0(AbstractC3109d handler) {
        InterfaceC3110e interfaceC3110e;
        Intrinsics.checkNotNullParameter(handler, "handler");
        if (handler == this || (interfaceC3110e = this.f32336C) == null) {
            return false;
        }
        return interfaceC3110e.c(this, handler);
    }

    public final boolean L() {
        return this.f32359q;
    }

    public final void L0(int i10) {
        int[] iArr = this.f32343a;
        if (iArr[i10] == -1) {
            iArr[i10] = C();
            this.f32344b++;
        }
    }

    public final int M() {
        return this.f32368z;
    }

    public final void M0(int i10) {
        int[] iArr = this.f32343a;
        if (iArr[i10] != -1) {
            iArr[i10] = -1;
            this.f32344b--;
        }
    }

    protected final C3112g N() {
        return this.f32334A;
    }

    protected final PointF N0(PointF point) {
        PointF E10;
        Intrinsics.checkNotNullParameter(point, "point");
        C3112g c3112g = this.f32334A;
        if (c3112g != null && (E10 = c3112g.E(this.f32347e, point)) != null) {
            return E10;
        }
        point.x = Float.NaN;
        point.y = Float.NaN;
        return point;
    }

    public final int O() {
        return this.f32337D;
    }

    public final void O0(MotionEvent event, MotionEvent sourceEvent) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
        if (event.getActionMasked() == 0 || event.getActionMasked() == 5) {
            v(event, sourceEvent);
            x(event, sourceEvent);
        } else if (event.getActionMasked() == 1 || event.getActionMasked() == 6) {
            x(event, sourceEvent);
            y(event, sourceEvent);
        } else if (event.getActionMasked() == 2) {
            x(event, sourceEvent);
        }
    }

    public final boolean P() {
        return this.f32342I;
    }

    public final boolean P0() {
        int i10;
        return (!this.f32352j || (i10 = this.f32348f) == 1 || i10 == 3 || i10 == 5 || this.f32344b <= 0) ? false : true;
    }

    public final int Q() {
        return this.f32348f;
    }

    public final void Q0(Function0 closure) {
        Intrinsics.checkNotNullParameter(closure, "closure");
        this.f32351i = true;
        closure.invoke();
        this.f32351i = false;
    }

    public final int R() {
        return this.f32346d;
    }

    public final int S() {
        return this.f32356n;
    }

    public final int T() {
        return this.f32357o;
    }

    public final View U() {
        return this.f32347e;
    }

    public final void V(MotionEvent transformedEvent, MotionEvent sourceEvent) {
        int i10;
        Intrinsics.checkNotNullParameter(transformedEvent, "transformedEvent");
        Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
        if (!this.f32352j || (i10 = this.f32348f) == 3 || i10 == 1 || i10 == 5 || this.f32344b < 1) {
            return;
        }
        try {
            MotionEvent[] motionEventArr = {k(transformedEvent), k(sourceEvent)};
            MotionEvent motionEvent = motionEventArr[0];
            MotionEvent motionEvent2 = motionEventArr[1];
            this.f32349g = motionEvent.getX();
            this.f32350h = motionEvent.getY();
            this.f32368z = motionEvent.getPointerCount();
            boolean c02 = c0(this.f32347e, this.f32349g, this.f32350h);
            this.f32351i = c02;
            if (this.f32367y && !c02) {
                int i11 = this.f32348f;
                if (i11 == 4) {
                    o();
                    return;
                } else {
                    if (i11 == 2) {
                        B();
                        return;
                    }
                    return;
                }
            }
            C3114i c3114i = C3114i.f32395a;
            this.f32362t = c3114i.b(motionEvent, true);
            this.f32363u = c3114i.c(motionEvent, true);
            this.f32365w = motionEvent.getRawX() - motionEvent.getX();
            this.f32366x = motionEvent.getRawY() - motionEvent.getY();
            if (sourceEvent.getAction() == 0 || sourceEvent.getAction() == 9 || sourceEvent.getAction() == 7) {
                C0(sourceEvent);
            }
            if (sourceEvent.getAction() == 9 || sourceEvent.getAction() == 7 || sourceEvent.getAction() == 10) {
                h0(motionEvent, motionEvent2);
            } else {
                g0(motionEvent, motionEvent2);
            }
            if (!Intrinsics.b(motionEvent, transformedEvent)) {
                motionEvent.recycle();
            }
            if (Intrinsics.b(motionEvent2, sourceEvent)) {
                return;
            }
            motionEvent2.recycle();
        } catch (a unused) {
            B();
        }
    }

    public final boolean W(AbstractC3109d other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int length = this.f32343a.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (this.f32343a[i10] != -1 && other.f32343a[i10] != -1) {
                return true;
            }
        }
        return false;
    }

    public final boolean X() {
        return this.f32340G;
    }

    public final boolean Y() {
        return this.f32341H;
    }

    public final boolean a0() {
        return this.f32352j;
    }

    public final boolean b0() {
        return this.f32351i;
    }

    public final boolean c0(View view, float f10, float f11) {
        float f12;
        Intrinsics.d(view);
        float width = view.getWidth();
        float height = view.getHeight();
        float[] fArr = this.f32360r;
        if (fArr != null) {
            float f13 = fArr[0];
            float f14 = fArr[1];
            float f15 = fArr[2];
            float f16 = fArr[3];
            b bVar = f32330J;
            float f17 = bVar.c(f13) ? 0.0f - f13 : 0.0f;
            r6 = bVar.c(f14) ? 0.0f - f14 : 0.0f;
            if (bVar.c(f15)) {
                width += f15;
            }
            if (bVar.c(f16)) {
                height += f16;
            }
            float f18 = fArr[4];
            float f19 = fArr[5];
            if (bVar.c(f18)) {
                if (!bVar.c(f13)) {
                    f17 = width - f18;
                } else if (!bVar.c(f15)) {
                    width = f18 + f17;
                }
            }
            if (bVar.c(f19)) {
                if (!bVar.c(f14)) {
                    r6 = height - f19;
                } else if (!bVar.c(f16)) {
                    height = f19 + r6;
                }
            }
            f12 = r6;
            r6 = f17;
        } else {
            f12 = 0.0f;
        }
        return r6 <= f10 && f10 <= width && f12 <= f11 && f11 <= height;
    }

    protected abstract void g0(MotionEvent motionEvent, MotionEvent motionEvent2);

    protected void h0(MotionEvent event, MotionEvent sourceEvent) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
    }

    public final void i() {
        j(false);
    }

    public void j(boolean z10) {
        if (!this.f32364v || z10) {
            int i10 = this.f32348f;
            if (i10 == 0 || i10 == 2) {
                d0(4);
            }
        }
    }

    public final void l0(View view, C3112g c3112g) {
        if (this.f32347e != null || this.f32334A != null) {
            throw new IllegalStateException("Already prepared or hasn't been reset");
        }
        Arrays.fill(this.f32343a, -1);
        this.f32344b = 0;
        this.f32348f = 0;
        this.f32347e = view;
        this.f32334A = c3112g;
        Activity F10 = F(view != null ? view.getContext() : null);
        View findViewById = F10 != null ? F10.findViewById(R.id.content) : null;
        if (findViewById != null) {
            findViewById.getLocationOnScreen(this.f32345c);
        } else {
            int[] iArr = this.f32345c;
            iArr[0] = 0;
            iArr[1] = 0;
        }
        i0();
    }

    public final void m0() {
        this.f32347e = null;
        this.f32334A = null;
        Arrays.fill(this.f32343a, -1);
        this.f32344b = 0;
        this.f32357o = 0;
        AbstractC3574i.p(this.f32358p, null, 0, 0, 6, null);
        this.f32356n = 0;
        j0();
    }

    public final void n() {
        if (this.f32348f == 0) {
            d0(2);
        }
    }

    public void n0() {
        this.f32359q = false;
        this.f32364v = false;
        this.f32367y = false;
        this.f32352j = true;
        this.f32360r = null;
    }

    public final void o() {
        int i10 = this.f32348f;
        if (i10 == 4 || i10 == 0 || i10 == 2 || this.f32341H) {
            f0();
            d0(3);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final AbstractC3109d p0() {
        Intrinsics.e(this, "null cannot be cast to non-null type ConcreteGestureHandlerT of com.swmansion.gesturehandler.core.GestureHandler");
        return this;
    }

    public final WritableArray q() {
        WritableArray writableArray = this.f32355m;
        this.f32355m = null;
        return writableArray;
    }

    public final void q0(int i10) {
        this.f32353k = i10;
    }

    public final WritableArray r() {
        WritableArray writableArray = this.f32354l;
        this.f32354l = null;
        return writableArray;
    }

    public final void r0(int i10) {
        this.f32339F = i10;
    }

    public final void s0(boolean z10) {
        this.f32340G = z10;
    }

    public void t(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        p pVar = this.f32335B;
        if (pVar != null) {
            pVar.a(p0(), event);
        }
    }

    public final void t0(boolean z10) {
        this.f32341H = z10;
    }

    public String toString() {
        String simpleName;
        View view = this.f32347e;
        if (view == null) {
            simpleName = null;
        } else {
            Intrinsics.d(view);
            simpleName = view.getClass().getSimpleName();
        }
        return getClass().getSimpleName() + "@[" + this.f32346d + "]:" + simpleName;
    }

    public void u(int i10, int i11) {
        p pVar = this.f32335B;
        if (pVar != null) {
            pVar.b(p0(), i10, i11);
        }
    }

    public final AbstractC3109d u0(boolean z10) {
        final AbstractC3109d p02 = p0();
        if (p02.f32347e != null && p02.f32352j != z10) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: ea.c
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC3109d.v0(AbstractC3109d.this);
                }
            });
        }
        p02.f32352j = z10;
        return p02;
    }

    public void w() {
        p pVar;
        if (this.f32354l == null || (pVar = this.f32335B) == null) {
            return;
        }
        pVar.c(p0());
    }

    public final AbstractC3109d w0(float f10, float f11, float f12, float f13, float f14, float f15) {
        AbstractC3109d p02 = p0();
        if (p02.f32360r == null) {
            p02.f32360r = new float[6];
        }
        float[] fArr = p02.f32360r;
        Intrinsics.d(fArr);
        fArr[0] = f10;
        float[] fArr2 = p02.f32360r;
        Intrinsics.d(fArr2);
        fArr2[1] = f11;
        float[] fArr3 = p02.f32360r;
        Intrinsics.d(fArr3);
        fArr3[2] = f12;
        float[] fArr4 = p02.f32360r;
        Intrinsics.d(fArr4);
        fArr4[3] = f13;
        float[] fArr5 = p02.f32360r;
        Intrinsics.d(fArr5);
        fArr5[4] = f14;
        float[] fArr6 = p02.f32360r;
        Intrinsics.d(fArr6);
        fArr6[5] = f15;
        b bVar = f32330J;
        if (bVar.c(f14) && bVar.c(f10) && bVar.c(f12)) {
            throw new IllegalArgumentException("Cannot have all of left, right and width defined");
        }
        if (bVar.c(f14) && !bVar.c(f10) && !bVar.c(f12)) {
            throw new IllegalArgumentException("When width is set one of left or right pads need to be defined");
        }
        if (bVar.c(f15) && bVar.c(f13) && bVar.c(f11)) {
            throw new IllegalArgumentException("Cannot have all of top, bottom and height defined");
        }
        if (!bVar.c(f15) || bVar.c(f13) || bVar.c(f11)) {
            return p02;
        }
        throw new IllegalArgumentException("When height is set one of top or bottom pads need to be defined");
    }

    public final AbstractC3109d x0(InterfaceC3110e interfaceC3110e) {
        AbstractC3109d p02 = p0();
        p02.f32336C = interfaceC3110e;
        return p02;
    }

    public final AbstractC3109d y0(boolean z10) {
        AbstractC3109d p02 = p0();
        p02.f32364v = z10;
        return p02;
    }

    public final void z() {
        int i10 = this.f32348f;
        if (i10 == 2 || i10 == 4) {
            d0(5);
        }
    }

    public final AbstractC3109d z0(int i10) {
        this.f32338E = i10;
        return this;
    }

    protected void f0() {
    }

    protected void i0() {
    }

    protected void j0() {
    }

    public void o0() {
    }

    protected void k0(int i10, int i11) {
    }
}
