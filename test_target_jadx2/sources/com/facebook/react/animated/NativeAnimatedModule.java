package com.facebook.react.animated;

import a5.C1351a;
import co.hyperverge.hypersnapsdk.activities.HVRetakeActivity;
import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;
import com.facebook.fbreact.specs.NativeAnimatedModuleSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerListener;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.a;
import com.facebook.react.uimanager.C1936c0;
import com.facebook.react.uimanager.J0;
import com.facebook.react.uimanager.L0;
import com.facebook.react.uimanager.N;
import com.facebook.react.uimanager.UIManagerModule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import r4.AbstractC4012a;

@K4.a(name = NativeAnimatedModuleSpec.NAME)
/* loaded from: classes.dex */
public class NativeAnimatedModule extends NativeAnimatedModuleSpec implements LifecycleEventListener, UIManagerListener {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final boolean ANIMATED_MODULE_DEBUG = false;
    private final N mAnimatedFrameCallback;
    private boolean mBatchingControlledByJS;
    private volatile long mCurrentBatchNumber;
    private volatile long mCurrentFrameNumber;
    private boolean mEnqueuedAnimationOnFrame;
    private boolean mInitializedForFabric;
    private boolean mInitializedForNonFabric;
    private final AtomicReference<com.facebook.react.animated.p> mNodesManager;
    private int mNumFabricAnimations;
    private int mNumNonFabricAnimations;
    private final A mOperations;
    private final A mPreOperations;
    private final com.facebook.react.modules.core.a mReactChoreographer;
    private int mUIManagerType;

    private class A {

        /* renamed from: a, reason: collision with root package name */
        private final Queue f21188a;

        /* renamed from: b, reason: collision with root package name */
        private B f21189b;

        private List b(long j10) {
            if (d()) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            while (true) {
                B b10 = this.f21189b;
                if (b10 != null) {
                    if (b10.b() > j10) {
                        break;
                    }
                    arrayList.add(this.f21189b);
                    this.f21189b = null;
                }
                B b11 = (B) this.f21188a.poll();
                if (b11 == null) {
                    break;
                }
                if (b11.b() > j10) {
                    this.f21189b = b11;
                    break;
                }
                arrayList.add(b11);
            }
            return arrayList;
        }

        void a(B b10) {
            this.f21188a.add(b10);
        }

        void c(long j10, com.facebook.react.animated.p pVar) {
            List b10 = b(j10);
            if (b10 != null) {
                Iterator it = b10.iterator();
                while (it.hasNext()) {
                    ((B) it.next()).a(pVar);
                }
            }
        }

        boolean d() {
            return this.f21188a.isEmpty() && this.f21189b == null;
        }

        private A() {
            this.f21188a = new ConcurrentLinkedQueue();
            this.f21189b = null;
        }
    }

    private abstract class B {

        /* renamed from: a, reason: collision with root package name */
        long f21191a;

        abstract void a(com.facebook.react.animated.p pVar);

        public long b() {
            return this.f21191a;
        }

        public void c(long j10) {
            this.f21191a = j10;
        }

        private B() {
            this.f21191a = -1L;
        }
    }

    /* renamed from: com.facebook.react.animated.NativeAnimatedModule$a, reason: case insensitive filesystem */
    class C1860a extends B {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f21193c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ double f21194d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1860a(int i10, double d10) {
            super();
            this.f21193c = i10;
            this.f21194d = d10;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.B
        public void a(com.facebook.react.animated.p pVar) {
            pVar.v(this.f21193c, this.f21194d);
        }
    }

    /* renamed from: com.facebook.react.animated.NativeAnimatedModule$b, reason: case insensitive filesystem */
    class C1861b extends B {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f21196c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ double f21197d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1861b(int i10, double d10) {
            super();
            this.f21196c = i10;
            this.f21197d = d10;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.B
        public void a(com.facebook.react.animated.p pVar) {
            pVar.u(this.f21196c, this.f21197d);
        }
    }

    class c extends B {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f21199c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i10) {
            super();
            this.f21199c = i10;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.B
        public void a(com.facebook.react.animated.p pVar) {
            pVar.j(this.f21199c);
        }
    }

    class d extends B {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f21201c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i10) {
            super();
            this.f21201c = i10;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.B
        public void a(com.facebook.react.animated.p pVar) {
            pVar.i(this.f21201c);
        }
    }

    class e extends B {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f21203c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f21204d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ReadableMap f21205e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Callback f21206f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i10, int i11, ReadableMap readableMap, Callback callback) {
            super();
            this.f21203c = i10;
            this.f21204d = i11;
            this.f21205e = readableMap;
            this.f21206f = callback;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.B
        public void a(com.facebook.react.animated.p pVar) {
            pVar.w(this.f21203c, this.f21204d, this.f21205e, this.f21206f);
        }
    }

    class f extends B {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f21208c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(int i10) {
            super();
            this.f21208c = i10;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.B
        public void a(com.facebook.react.animated.p pVar) {
            pVar.y(this.f21208c);
        }
    }

    class g extends B {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f21210c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f21211d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(int i10, int i11) {
            super();
            this.f21210c = i10;
            this.f21211d = i11;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.B
        public void a(com.facebook.react.animated.p pVar) {
            pVar.d(this.f21210c, this.f21211d);
        }
    }

    class h extends B {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f21213c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f21214d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(int i10, int i11) {
            super();
            this.f21213c = i10;
            this.f21214d = i11;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.B
        public void a(com.facebook.react.animated.p pVar) {
            pVar.g(this.f21213c, this.f21214d);
        }
    }

    class i extends B {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f21216c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f21217d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(int i10, int i11) {
            super();
            this.f21216c = i10;
            this.f21217d = i11;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.B
        public void a(com.facebook.react.animated.p pVar) {
            pVar.c(this.f21216c, this.f21217d);
        }
    }

    class j extends B {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f21219c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f21220d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(int i10, int i11) {
            super();
            this.f21219c = i10;
            this.f21220d = i11;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.B
        public void a(com.facebook.react.animated.p pVar) {
            pVar.f(this.f21219c, this.f21220d);
        }
    }

    class k extends N {
        k(ReactContext reactContext) {
            super(reactContext);
        }

        @Override // com.facebook.react.uimanager.N
        protected void doFrameGuarded(long j10) {
            try {
                NativeAnimatedModule.this.mEnqueuedAnimationOnFrame = false;
                com.facebook.react.animated.p nodesManager = NativeAnimatedModule.this.getNodesManager();
                if (nodesManager != null && nodesManager.o()) {
                    nodesManager.t(j10);
                }
                if (nodesManager != null && NativeAnimatedModule.this.mReactChoreographer != null) {
                    if (!G4.a.l() || nodesManager.o()) {
                        NativeAnimatedModule.this.enqueueFrameCallback();
                    }
                }
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    class l extends B {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f21223c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(int i10) {
            super();
            this.f21223c = i10;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.B
        public void a(com.facebook.react.animated.p pVar) {
            pVar.s(this.f21223c);
        }
    }

    class m extends B {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f21225c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f21226d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ReadableMap f21227e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(int i10, String str, ReadableMap readableMap) {
            super();
            this.f21225c = i10;
            this.f21226d = str;
            this.f21227e = readableMap;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.B
        public void a(com.facebook.react.animated.p pVar) {
            pVar.b(this.f21225c, this.f21226d, this.f21227e);
        }
    }

    class n extends B {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f21229c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f21230d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f21231e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(int i10, String str, int i11) {
            super();
            this.f21229c = i10;
            this.f21230d = str;
            this.f21231e = i11;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.B
        public void a(com.facebook.react.animated.p pVar) {
            pVar.r(this.f21229c, this.f21230d, this.f21231e);
        }
    }

    class o extends B {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f21233c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Callback f21234d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(int i10, Callback callback) {
            super();
            this.f21233c = i10;
            this.f21234d = callback;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.B
        public void a(com.facebook.react.animated.p pVar) {
            pVar.m(this.f21233c, this.f21234d);
        }
    }

    class p extends B {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f21236c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ReadableArray f21237d;

        class a implements com.facebook.react.animated.c {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f21239a;

            a(int i10) {
                this.f21239a = i10;
            }

            @Override // com.facebook.react.animated.c
            public void a(double d10) {
                WritableMap createMap = Arguments.createMap();
                createMap.putInt("tag", this.f21239a);
                createMap.putDouble("value", d10);
                ReactApplicationContext reactApplicationContextIfActiveOrWarn = NativeAnimatedModule.this.getReactApplicationContextIfActiveOrWarn();
                if (reactApplicationContextIfActiveOrWarn != null) {
                    reactApplicationContextIfActiveOrWarn.emitDeviceEvent("onAnimatedValueUpdate", createMap);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(int i10, ReadableArray readableArray) {
            super();
            this.f21236c = i10;
            this.f21237d = readableArray;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.B
        public void a(com.facebook.react.animated.p pVar) {
            NativeAnimatedModule.this.getReactApplicationContextIfActiveOrWarn();
            int i10 = 0;
            while (i10 < this.f21236c) {
                int i11 = i10 + 1;
                switch (q.f21241a[z.fromId(this.f21237d.getInt(i10)).ordinal()]) {
                    case 1:
                        i10 += 2;
                        pVar.m(this.f21237d.getInt(i11), null);
                        break;
                    case 2:
                        i10 += 2;
                        int i12 = this.f21237d.getInt(i11);
                        pVar.x(i12, new a(i12));
                        break;
                    case 3:
                        i10 += 2;
                        pVar.A(this.f21237d.getInt(i11));
                        break;
                    case 4:
                        i10 += 2;
                        pVar.y(this.f21237d.getInt(i11));
                        break;
                    case 5:
                        i10 += 2;
                        pVar.j(this.f21237d.getInt(i11));
                        break;
                    case 6:
                        i10 += 2;
                        pVar.i(this.f21237d.getInt(i11));
                        break;
                    case 7:
                        i10 += 2;
                        pVar.s(this.f21237d.getInt(i11));
                        break;
                    case 8:
                        i10 += 2;
                        pVar.h(this.f21237d.getInt(i11));
                        break;
                    case 9:
                    case RequestError.EVENT_TIMEOUT /* 10 */:
                        i10 += 2;
                        break;
                    case 11:
                        int i13 = i10 + 2;
                        i10 += 3;
                        pVar.e(this.f21237d.getInt(i11), this.f21237d.getMap(i13));
                        break;
                    case 12:
                        int i14 = i10 + 2;
                        i10 += 3;
                        pVar.B(this.f21237d.getInt(i11), this.f21237d.getMap(i14));
                        break;
                    case 13:
                        int i15 = i10 + 2;
                        i10 += 3;
                        pVar.d(this.f21237d.getInt(i11), this.f21237d.getInt(i15));
                        break;
                    case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                        int i16 = i10 + 2;
                        i10 += 3;
                        pVar.g(this.f21237d.getInt(i11), this.f21237d.getInt(i16));
                        break;
                    case HVError.SSL_CONNECT_ERROR /* 15 */:
                        int i17 = i10 + 2;
                        i10 += 3;
                        pVar.v(this.f21237d.getInt(i11), this.f21237d.getDouble(i17));
                        break;
                    case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                        int i18 = i10 + 2;
                        i10 += 3;
                        pVar.v(this.f21237d.getInt(i11), this.f21237d.getDouble(i18));
                        break;
                    case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                        int i19 = i10 + 2;
                        int i20 = this.f21237d.getInt(i11);
                        i10 += 3;
                        int i21 = this.f21237d.getInt(i19);
                        NativeAnimatedModule.this.decrementInFlightAnimationsForViewTag(i21);
                        pVar.f(i20, i21);
                        break;
                    case 18:
                        if (G4.a.l()) {
                            NativeAnimatedModule.this.enqueueFrameCallback();
                        }
                        int i22 = this.f21237d.getInt(i11);
                        int i23 = i10 + 3;
                        int i24 = this.f21237d.getInt(i10 + 2);
                        i10 += 4;
                        pVar.w(i22, i24, this.f21237d.getMap(i23), null);
                        break;
                    case 19:
                        int i25 = this.f21237d.getInt(i11);
                        NativeAnimatedModule.this.decrementInFlightAnimationsForViewTag(i25);
                        int i26 = i10 + 3;
                        String string = this.f21237d.getString(i10 + 2);
                        i10 += 4;
                        pVar.r(i25, string, this.f21237d.getInt(i26));
                        break;
                    case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                        int i27 = i10 + 2;
                        i10 += 3;
                        pVar.c(this.f21237d.getInt(i11), this.f21237d.getInt(i27));
                        break;
                    case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                        int i28 = this.f21237d.getInt(i11);
                        int i29 = i10 + 3;
                        String string2 = this.f21237d.getString(i10 + 2);
                        i10 += 4;
                        pVar.b(i28, string2, this.f21237d.getMap(i29));
                        break;
                    default:
                        throw new IllegalArgumentException("Batch animation execution op: unknown op code");
                }
            }
        }
    }

    static /* synthetic */ class q {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f21241a;

        static {
            int[] iArr = new int[z.values().length];
            f21241a = iArr;
            try {
                iArr[z.OP_CODE_GET_VALUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21241a[z.OP_START_LISTENING_TO_ANIMATED_NODE_VALUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21241a[z.OP_STOP_LISTENING_TO_ANIMATED_NODE_VALUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21241a[z.OP_CODE_STOP_ANIMATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21241a[z.OP_CODE_FLATTEN_ANIMATED_NODE_OFFSET.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21241a[z.OP_CODE_EXTRACT_ANIMATED_NODE_OFFSET.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21241a[z.OP_CODE_RESTORE_DEFAULT_VALUES.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f21241a[z.OP_CODE_DROP_ANIMATED_NODE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f21241a[z.OP_CODE_ADD_LISTENER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f21241a[z.OP_CODE_REMOVE_LISTENERS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f21241a[z.OP_CODE_CREATE_ANIMATED_NODE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f21241a[z.OP_CODE_UPDATE_ANIMATED_NODE_CONFIG.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f21241a[z.OP_CODE_CONNECT_ANIMATED_NODES.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f21241a[z.OP_CODE_DISCONNECT_ANIMATED_NODES.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f21241a[z.OP_CODE_SET_ANIMATED_NODE_VALUE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f21241a[z.OP_CODE_SET_ANIMATED_NODE_OFFSET.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f21241a[z.OP_CODE_DISCONNECT_ANIMATED_NODE_FROM_VIEW.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f21241a[z.OP_CODE_START_ANIMATING_NODE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f21241a[z.OP_CODE_REMOVE_ANIMATED_EVENT_FROM_VIEW.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f21241a[z.OP_CODE_CONNECT_ANIMATED_NODE_TO_VIEW.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f21241a[z.OP_CODE_ADD_ANIMATED_EVENT_TO_VIEW.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
        }
    }

    class r implements J0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f21242a;

        r(long j10) {
            this.f21242a = j10;
        }

        @Override // com.facebook.react.uimanager.J0
        public void a(C1936c0 c1936c0) {
            NativeAnimatedModule.this.mPreOperations.c(this.f21242a, NativeAnimatedModule.this.getNodesManager());
        }
    }

    class s implements J0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f21244a;

        s(long j10) {
            this.f21244a = j10;
        }

        @Override // com.facebook.react.uimanager.J0
        public void a(C1936c0 c1936c0) {
            NativeAnimatedModule.this.mOperations.c(this.f21244a, NativeAnimatedModule.this.getNodesManager());
        }
    }

    class t extends B {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f21246c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ReadableMap f21247d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(int i10, ReadableMap readableMap) {
            super();
            this.f21246c = i10;
            this.f21247d = readableMap;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.B
        public void a(com.facebook.react.animated.p pVar) {
            pVar.e(this.f21246c, this.f21247d);
        }
    }

    class u extends B {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f21249c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ReadableMap f21250d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(int i10, ReadableMap readableMap) {
            super();
            this.f21249c = i10;
            this.f21250d = readableMap;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.B
        public void a(com.facebook.react.animated.p pVar) {
            pVar.B(this.f21249c, this.f21250d);
        }
    }

    class v implements com.facebook.react.animated.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f21252a;

        v(int i10) {
            this.f21252a = i10;
        }

        @Override // com.facebook.react.animated.c
        public void a(double d10) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("tag", this.f21252a);
            createMap.putDouble("value", d10);
            ReactApplicationContext reactApplicationContextIfActiveOrWarn = NativeAnimatedModule.this.getReactApplicationContextIfActiveOrWarn();
            if (reactApplicationContextIfActiveOrWarn != null) {
                reactApplicationContextIfActiveOrWarn.emitDeviceEvent("onAnimatedValueUpdate", createMap);
            }
        }
    }

    class w extends B {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f21254c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.facebook.react.animated.c f21255d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(int i10, com.facebook.react.animated.c cVar) {
            super();
            this.f21254c = i10;
            this.f21255d = cVar;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.B
        public void a(com.facebook.react.animated.p pVar) {
            pVar.x(this.f21254c, this.f21255d);
        }
    }

    class x extends B {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f21257c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(int i10) {
            super();
            this.f21257c = i10;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.B
        public void a(com.facebook.react.animated.p pVar) {
            pVar.A(this.f21257c);
        }
    }

    class y extends B {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f21259c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(int i10) {
            super();
            this.f21259c = i10;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.B
        public void a(com.facebook.react.animated.p pVar) {
            pVar.h(this.f21259c);
        }
    }

    private enum z {
        OP_CODE_CREATE_ANIMATED_NODE(1),
        OP_CODE_UPDATE_ANIMATED_NODE_CONFIG(2),
        OP_CODE_GET_VALUE(3),
        OP_START_LISTENING_TO_ANIMATED_NODE_VALUE(4),
        OP_STOP_LISTENING_TO_ANIMATED_NODE_VALUE(5),
        OP_CODE_CONNECT_ANIMATED_NODES(6),
        OP_CODE_DISCONNECT_ANIMATED_NODES(7),
        OP_CODE_START_ANIMATING_NODE(8),
        OP_CODE_STOP_ANIMATION(9),
        OP_CODE_SET_ANIMATED_NODE_VALUE(10),
        OP_CODE_SET_ANIMATED_NODE_OFFSET(11),
        OP_CODE_FLATTEN_ANIMATED_NODE_OFFSET(12),
        OP_CODE_EXTRACT_ANIMATED_NODE_OFFSET(13),
        OP_CODE_CONNECT_ANIMATED_NODE_TO_VIEW(14),
        OP_CODE_DISCONNECT_ANIMATED_NODE_FROM_VIEW(15),
        OP_CODE_RESTORE_DEFAULT_VALUES(16),
        OP_CODE_DROP_ANIMATED_NODE(17),
        OP_CODE_ADD_ANIMATED_EVENT_TO_VIEW(18),
        OP_CODE_REMOVE_ANIMATED_EVENT_FROM_VIEW(19),
        OP_CODE_ADD_LISTENER(20),
        OP_CODE_REMOVE_LISTENERS(21);

        private static z[] valueMap = null;
        private final int value;

        z(int i10) {
            this.value = i10;
        }

        public static z fromId(int i10) {
            if (valueMap == null) {
                valueMap = values();
            }
            return valueMap[i10 - 1];
        }

        public int getValue() {
            return this.value;
        }
    }

    public NativeAnimatedModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mOperations = new A();
        this.mPreOperations = new A();
        this.mNodesManager = new AtomicReference<>();
        this.mBatchingControlledByJS = false;
        this.mInitializedForFabric = false;
        this.mInitializedForNonFabric = false;
        this.mEnqueuedAnimationOnFrame = false;
        this.mUIManagerType = 1;
        this.mNumFabricAnimations = 0;
        this.mNumNonFabricAnimations = 0;
        this.mReactChoreographer = com.facebook.react.modules.core.a.h();
        this.mAnimatedFrameCallback = new k(reactApplicationContext);
    }

    private void addOperation(B b10) {
        b10.c(this.mCurrentBatchNumber);
        this.mOperations.a(b10);
    }

    private void addPreOperation(B b10) {
        b10.c(this.mCurrentBatchNumber);
        this.mPreOperations.a(b10);
    }

    private void addUnbatchedOperation(B b10) {
        b10.c(-1L);
        this.mOperations.a(b10);
    }

    private void clearFrameCallback() {
        ((com.facebook.react.modules.core.a) AbstractC4012a.c(this.mReactChoreographer)).n(a.EnumC0379a.NATIVE_ANIMATED_MODULE, this.mAnimatedFrameCallback);
        this.mEnqueuedAnimationOnFrame = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void decrementInFlightAnimationsForViewTag(int i10) {
        if (C1351a.a(i10) == 2) {
            this.mNumFabricAnimations--;
        } else {
            this.mNumNonFabricAnimations--;
        }
        int i11 = this.mNumNonFabricAnimations;
        if (i11 == 0 && this.mNumFabricAnimations > 0 && this.mUIManagerType != 2) {
            this.mUIManagerType = 2;
        } else {
            if (this.mNumFabricAnimations != 0 || i11 <= 0 || this.mUIManagerType == 1) {
                return;
            }
            this.mUIManagerType = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void enqueueFrameCallback() {
        if (this.mEnqueuedAnimationOnFrame) {
            return;
        }
        ((com.facebook.react.modules.core.a) AbstractC4012a.c(this.mReactChoreographer)).k(a.EnumC0379a.NATIVE_ANIMATED_MODULE, this.mAnimatedFrameCallback);
        this.mEnqueuedAnimationOnFrame = true;
    }

    private void initializeLifecycleEventListenersForViewTag(int i10) {
        UIManager g10;
        int a10 = C1351a.a(i10);
        this.mUIManagerType = a10;
        if (a10 == 2) {
            this.mNumFabricAnimations++;
        } else {
            this.mNumNonFabricAnimations++;
        }
        com.facebook.react.animated.p nodesManager = getNodesManager();
        if (nodesManager != null) {
            nodesManager.p(this.mUIManagerType);
        } else {
            ReactSoftExceptionLogger.logSoftException(NativeAnimatedModuleSpec.NAME, new RuntimeException("initializeLifecycleEventListenersForViewTag could not get NativeAnimatedNodesManager"));
        }
        if (this.mUIManagerType == 2) {
            if (this.mInitializedForFabric) {
                return;
            }
        } else if (this.mInitializedForNonFabric) {
            return;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        if (reactApplicationContext == null || (g10 = L0.g(reactApplicationContext, this.mUIManagerType)) == null) {
            return;
        }
        g10.addUIManagerEventListener(this);
        if (this.mUIManagerType == 2) {
            this.mInitializedForFabric = true;
        } else {
            this.mInitializedForNonFabric = true;
        }
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void addAnimatedEventToView(double d10, String str, ReadableMap readableMap) {
        int i10 = (int) d10;
        initializeLifecycleEventListenersForViewTag(i10);
        addOperation(new m(i10, str, readableMap));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void addListener(String str) {
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void connectAnimatedNodeToView(double d10, double d11) {
        int i10 = (int) d11;
        initializeLifecycleEventListenersForViewTag(i10);
        addOperation(new i((int) d10, i10));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void connectAnimatedNodes(double d10, double d11) {
        addOperation(new g((int) d10, (int) d11));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void createAnimatedNode(double d10, ReadableMap readableMap) {
        addOperation(new t((int) d10, readableMap));
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didDispatchMountItems(UIManager uIManager) {
        if (this.mUIManagerType != 2) {
            return;
        }
        long j10 = this.mCurrentBatchNumber - 1;
        if (!this.mBatchingControlledByJS) {
            this.mCurrentFrameNumber++;
            if (this.mCurrentFrameNumber - this.mCurrentBatchNumber > 2) {
                this.mCurrentBatchNumber = this.mCurrentFrameNumber;
                j10 = this.mCurrentBatchNumber;
            }
        }
        this.mPreOperations.c(j10, getNodesManager());
        this.mOperations.c(j10, getNodesManager());
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didMountItems(UIManager uIManager) {
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didScheduleMountItems(UIManager uIManager) {
        this.mCurrentFrameNumber++;
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void disconnectAnimatedNodeFromView(double d10, double d11) {
        int i10 = (int) d11;
        decrementInFlightAnimationsForViewTag(i10);
        addOperation(new j((int) d10, i10));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void disconnectAnimatedNodes(double d10, double d11) {
        addOperation(new h((int) d10, (int) d11));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void dropAnimatedNode(double d10) {
        addOperation(new y((int) d10));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void extractAnimatedNodeOffset(double d10) {
        addOperation(new d((int) d10));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void finishOperationBatch() {
        this.mBatchingControlledByJS = false;
        this.mCurrentBatchNumber++;
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void flattenAnimatedNodeOffset(double d10) {
        addOperation(new c((int) d10));
    }

    public com.facebook.react.animated.p getNodesManager() {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn;
        if (this.mNodesManager.get() == null && (reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn()) != null) {
            androidx.camera.view.i.a(this.mNodesManager, null, new com.facebook.react.animated.p(reactApplicationContextIfActiveOrWarn));
        }
        return this.mNodesManager.get();
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void getValue(double d10, Callback callback) {
        addOperation(new o((int) d10, callback));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        getReactApplicationContext().addLifecycleEventListener(this);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        super.invalidate();
        getReactApplicationContext().removeLifecycleEventListener(this);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        clearFrameCallback();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        clearFrameCallback();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        enqueueFrameCallback();
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void queueAndExecuteBatchedOperations(ReadableArray readableArray) {
        int size = readableArray.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            switch (q.f21241a[z.fromId(readableArray.getInt(i10)).ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case RequestError.EVENT_TIMEOUT /* 10 */:
                    i10 += 2;
                    continue;
                case 11:
                case 12:
                case 13:
                case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                case HVError.SSL_CONNECT_ERROR /* 15 */:
                case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                    i10 += 3;
                    continue;
                case 18:
                case 19:
                    break;
                case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                    int i12 = i10 + 2;
                    i10 += 3;
                    initializeLifecycleEventListenersForViewTag(readableArray.getInt(i12));
                    continue;
                case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                    initializeLifecycleEventListenersForViewTag(readableArray.getInt(i11));
                    break;
                default:
                    throw new IllegalArgumentException("Batch animation execution op: fetching viewTag: unknown op code");
            }
            i10 += 4;
        }
        startOperationBatch();
        addUnbatchedOperation(new p(size, readableArray));
        finishOperationBatch();
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void removeAnimatedEventFromView(double d10, String str, double d11) {
        int i10 = (int) d10;
        decrementInFlightAnimationsForViewTag(i10);
        addOperation(new n(i10, str, (int) d11));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void removeListeners(double d10) {
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void restoreDefaultValues(double d10) {
        addPreOperation(new l((int) d10));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void setAnimatedNodeOffset(double d10, double d11) {
        addOperation(new C1861b((int) d10, d11));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void setAnimatedNodeValue(double d10, double d11) {
        addOperation(new C1860a((int) d10, d11));
    }

    public void setNodesManager(com.facebook.react.animated.p pVar) {
        this.mNodesManager.set(pVar);
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void startAnimatingNode(double d10, double d11, ReadableMap readableMap, Callback callback) {
        addUnbatchedOperation(new e((int) d10, (int) d11, readableMap, callback));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void startListeningToAnimatedNodeValue(double d10) {
        int i10 = (int) d10;
        addOperation(new w(i10, new v(i10)));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void startOperationBatch() {
        this.mBatchingControlledByJS = true;
        this.mCurrentBatchNumber++;
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void stopAnimation(double d10) {
        addOperation(new f((int) d10));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void stopListeningToAnimatedNodeValue(double d10) {
        addOperation(new x((int) d10));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void updateAnimatedNodeConfig(double d10, ReadableMap readableMap) {
        addOperation(new u((int) d10, readableMap));
    }

    public void userDrivenScrollEnded(int i10) {
        com.facebook.react.animated.p pVar = this.mNodesManager.get();
        if (pVar == null) {
            return;
        }
        Set l10 = pVar.l(i10, "topScrollEnded");
        if (l10.isEmpty()) {
            return;
        }
        WritableArray createArray = Arguments.createArray();
        Iterator it = l10.iterator();
        while (it.hasNext()) {
            createArray.pushInt(((Integer) it.next()).intValue());
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putArray("tags", createArray);
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            reactApplicationContextIfActiveOrWarn.emitDeviceEvent("onUserDrivenAnimationEnded", createMap);
        }
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void willDispatchViewUpdates(UIManager uIManager) {
        if ((this.mOperations.d() && this.mPreOperations.d()) || this.mUIManagerType == 2) {
            return;
        }
        long j10 = this.mCurrentBatchNumber;
        this.mCurrentBatchNumber = 1 + j10;
        r rVar = new r(j10);
        s sVar = new s(j10);
        UIManagerModule uIManagerModule = (UIManagerModule) uIManager;
        uIManagerModule.prependUIBlock(rVar);
        uIManagerModule.addUIBlock(sVar);
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void willMountItems(UIManager uIManager) {
    }
}
