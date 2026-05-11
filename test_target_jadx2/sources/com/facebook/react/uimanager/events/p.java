package com.facebook.react.uimanager.events;

import android.view.MotionEvent;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.uimanager.events.r;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import r4.AbstractC4012a;

/* loaded from: classes.dex */
public final class p extends d {

    /* renamed from: f, reason: collision with root package name */
    public static final a f22401f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    private static final String f22402g = p.class.getSimpleName();

    /* renamed from: h, reason: collision with root package name */
    private static final y0.e f22403h = new y0.e(3);

    /* renamed from: a, reason: collision with root package name */
    private MotionEvent f22404a;

    /* renamed from: b, reason: collision with root package name */
    private r f22405b;

    /* renamed from: c, reason: collision with root package name */
    private short f22406c;

    /* renamed from: d, reason: collision with root package name */
    private float f22407d;

    /* renamed from: e, reason: collision with root package name */
    private float f22408e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final p a(int i10, int i11, r rVar, MotionEvent motionEvent, long j10, float f10, float f11, q touchEventCoalescingKeyHelper) {
            Intrinsics.checkNotNullParameter(touchEventCoalescingKeyHelper, "touchEventCoalescingKeyHelper");
            p pVar = (p) p.f22403h.b();
            if (pVar == null) {
                pVar = new p(null);
            }
            Object c10 = AbstractC4012a.c(motionEvent);
            Intrinsics.checkNotNullExpressionValue(c10, "assertNotNull(...)");
            pVar.g(i10, i11, rVar, (MotionEvent) c10, j10, f10, f11, touchEventCoalescingKeyHelper);
            return pVar;
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22409a;

        static {
            int[] iArr = new int[r.values().length];
            try {
                iArr[r.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[r.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[r.CANCEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[r.MOVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f22409a = iArr;
        }
    }

    public /* synthetic */ p(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(int i10, int i11, r rVar, MotionEvent motionEvent, long j10, float f10, float f11, q qVar) {
        super.init(i10, i11, motionEvent.getEventTime());
        short s10 = 0;
        SoftAssertions.assertCondition(j10 != Long.MIN_VALUE, "Gesture start time must be initialized");
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            qVar.a(j10);
        } else if (action == 1) {
            qVar.e(j10);
        } else if (action == 2) {
            s10 = qVar.b(j10);
        } else if (action == 3) {
            qVar.e(j10);
        } else {
            if (action != 5 && action != 6) {
                throw new RuntimeException("Unhandled MotionEvent action: " + action);
            }
            qVar.d(j10);
        }
        this.f22404a = MotionEvent.obtain(motionEvent);
        this.f22405b = rVar;
        this.f22406c = s10;
        this.f22407d = f10;
        this.f22408e = f11;
    }

    public static final p h(int i10, int i11, r rVar, MotionEvent motionEvent, long j10, float f10, float f11, q qVar) {
        return f22401f.a(i10, i11, rVar, motionEvent, j10, f10, f11, qVar);
    }

    private final boolean i() {
        if (this.f22404a != null) {
            return true;
        }
        ReactSoftExceptionLogger.logSoftException(f22402g, new IllegalStateException("Cannot dispatch a TouchEvent that has no MotionEvent; the TouchEvent has been recycled"));
        return false;
    }

    public final MotionEvent c() {
        Object c10 = AbstractC4012a.c(this.f22404a);
        Intrinsics.checkNotNullExpressionValue(c10, "assertNotNull(...)");
        return (MotionEvent) c10;
    }

    @Override // com.facebook.react.uimanager.events.d
    public boolean canCoalesce() {
        r rVar = (r) AbstractC4012a.c(this.f22405b);
        int i10 = rVar == null ? -1 : b.f22409a[rVar.ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return false;
        }
        if (i10 == 4) {
            return true;
        }
        throw new RuntimeException("Unknown touch event type: " + this.f22405b);
    }

    public final r d() {
        Object c10 = AbstractC4012a.c(this.f22405b);
        Intrinsics.checkNotNullExpressionValue(c10, "assertNotNull(...)");
        return (r) c10;
    }

    @Override // com.facebook.react.uimanager.events.d
    public void dispatch(RCTEventEmitter rctEventEmitter) {
        Intrinsics.checkNotNullParameter(rctEventEmitter, "rctEventEmitter");
        if (i()) {
            s.d(rctEventEmitter, this);
        }
    }

    @Override // com.facebook.react.uimanager.events.d
    public void dispatchModern(RCTModernEventEmitter rctEventEmitter) {
        Intrinsics.checkNotNullParameter(rctEventEmitter, "rctEventEmitter");
        if (i()) {
            rctEventEmitter.receiveTouches(this);
        }
    }

    public final float e() {
        return this.f22407d;
    }

    public final float f() {
        return this.f22408e;
    }

    @Override // com.facebook.react.uimanager.events.d
    public short getCoalescingKey() {
        return this.f22406c;
    }

    @Override // com.facebook.react.uimanager.events.d
    protected int getEventCategory() {
        r rVar = this.f22405b;
        if (rVar == null) {
            return 2;
        }
        int i10 = b.f22409a[rVar.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2 || i10 == 3) {
            return 1;
        }
        if (i10 == 4) {
            return 4;
        }
        throw new lc.m();
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        r.a aVar = r.Companion;
        Object c10 = AbstractC4012a.c(this.f22405b);
        Intrinsics.checkNotNullExpressionValue(c10, "assertNotNull(...)");
        return aVar.a((r) c10);
    }

    @Override // com.facebook.react.uimanager.events.d
    public void onDispose() {
        MotionEvent motionEvent = this.f22404a;
        if (motionEvent != null) {
            motionEvent.recycle();
        }
        this.f22404a = null;
        try {
            f22403h.a(this);
        } catch (IllegalStateException e10) {
            ReactSoftExceptionLogger.logSoftException(f22402g, e10);
        }
    }

    private p() {
    }
}
