package com.facebook.react.modules.core;

import android.util.SparseArray;
import android.view.Choreographer;
import co.hyperverge.hypersnapsdk.service.framerecorder.HVFrameRecorder;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.modules.core.JavaTimerManager;
import com.facebook.react.modules.core.a;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import v4.k;
import xc.m;
import zc.AbstractC5272a;

/* loaded from: classes.dex */
public class JavaTimerManager implements LifecycleEventListener, J4.d {

    /* renamed from: q, reason: collision with root package name */
    private static final a f21729q = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final ReactApplicationContext f21730a;

    /* renamed from: b, reason: collision with root package name */
    private final O4.d f21731b;

    /* renamed from: c, reason: collision with root package name */
    private final com.facebook.react.modules.core.a f21732c;

    /* renamed from: d, reason: collision with root package name */
    private final C4.e f21733d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f21734e;

    /* renamed from: f, reason: collision with root package name */
    private final Object f21735f;

    /* renamed from: g, reason: collision with root package name */
    private final SparseArray f21736g;

    /* renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f21737h;

    /* renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f21738i;

    /* renamed from: j, reason: collision with root package name */
    private final e f21739j;

    /* renamed from: k, reason: collision with root package name */
    private final c f21740k;

    /* renamed from: l, reason: collision with root package name */
    private b f21741l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f21742m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f21743n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f21744o;

    /* renamed from: p, reason: collision with root package name */
    private final PriorityQueue f21745p;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean b(d dVar, long j10) {
            return !dVar.b() && ((long) dVar.a()) < j10;
        }

        private a() {
        }
    }

    private final class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final long f21746a;

        /* renamed from: b, reason: collision with root package name */
        private volatile boolean f21747b;

        public b(long j10) {
            this.f21746a = j10;
        }

        public final void a() {
            this.f21747b = true;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            if (this.f21747b) {
                return;
            }
            long c10 = k.c() - (this.f21746a / HVFrameRecorder.BITRATE);
            long a10 = k.a() - c10;
            if (16.666666f - c10 < 1.0f) {
                return;
            }
            Object obj = JavaTimerManager.this.f21735f;
            JavaTimerManager javaTimerManager = JavaTimerManager.this;
            synchronized (obj) {
                z10 = javaTimerManager.f21744o;
                Unit unit = Unit.f36324a;
            }
            if (z10) {
                JavaTimerManager.this.f21731b.callIdleCallbacks(a10);
            }
            JavaTimerManager.this.f21741l = null;
        }
    }

    private final class c implements Choreographer.FrameCallback {
        public c() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j10) {
            if (!JavaTimerManager.this.f21737h.get() || JavaTimerManager.this.f21738i.get()) {
                b bVar = JavaTimerManager.this.f21741l;
                if (bVar != null) {
                    bVar.a();
                }
                JavaTimerManager javaTimerManager = JavaTimerManager.this;
                javaTimerManager.f21741l = javaTimerManager.new b(j10);
                JavaTimerManager.this.f21730a.runOnJSQueueThread(JavaTimerManager.this.f21741l);
                JavaTimerManager.this.f21732c.k(a.EnumC0379a.IDLE_EVENT, this);
            }
        }
    }

    private static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final int f21750a;

        /* renamed from: b, reason: collision with root package name */
        private long f21751b;

        /* renamed from: c, reason: collision with root package name */
        private final int f21752c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f21753d;

        public d(int i10, long j10, int i11, boolean z10) {
            this.f21750a = i10;
            this.f21751b = j10;
            this.f21752c = i11;
            this.f21753d = z10;
        }

        public final int a() {
            return this.f21752c;
        }

        public final boolean b() {
            return this.f21753d;
        }

        public final long c() {
            return this.f21751b;
        }

        public final int d() {
            return this.f21750a;
        }

        public final void e(long j10) {
            this.f21751b = j10;
        }
    }

    private final class e implements Choreographer.FrameCallback {

        /* renamed from: a, reason: collision with root package name */
        private WritableArray f21754a;

        public e() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j10) {
            d dVar;
            if (!JavaTimerManager.this.f21737h.get() || JavaTimerManager.this.f21738i.get()) {
                long j11 = j10 / HVFrameRecorder.BITRATE;
                Object obj = JavaTimerManager.this.f21734e;
                JavaTimerManager javaTimerManager = JavaTimerManager.this;
                synchronized (obj) {
                    while (!javaTimerManager.f21745p.isEmpty()) {
                        try {
                            Object peek = javaTimerManager.f21745p.peek();
                            Intrinsics.d(peek);
                            if (((d) peek).c() >= j11 || (dVar = (d) javaTimerManager.f21745p.poll()) == null) {
                                break;
                            }
                            if (this.f21754a == null) {
                                this.f21754a = Arguments.createArray();
                            }
                            WritableArray writableArray = this.f21754a;
                            if (writableArray != null) {
                                writableArray.pushInt(dVar.d());
                            }
                            if (dVar.b()) {
                                dVar.e(dVar.a() + j11);
                                javaTimerManager.f21745p.add(dVar);
                            } else {
                                javaTimerManager.f21736g.remove(dVar.d());
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    Unit unit = Unit.f36324a;
                }
                WritableArray writableArray2 = this.f21754a;
                if (writableArray2 != null) {
                    JavaTimerManager.this.f21731b.callTimers(writableArray2);
                    this.f21754a = null;
                }
                JavaTimerManager.this.f21732c.k(a.EnumC0379a.TIMERS_EVENTS, this);
            }
        }
    }

    static final class f extends m implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        public static final f f21756a = new f();

        f() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(d dVar, d dVar2) {
            return Integer.valueOf(AbstractC5272a.a(dVar.c() - dVar2.c()));
        }
    }

    public JavaTimerManager(ReactApplicationContext reactApplicationContext, O4.d javaScriptTimerExecutor, com.facebook.react.modules.core.a reactChoreographer, C4.e devSupportManager) {
        Intrinsics.checkNotNullParameter(reactApplicationContext, "reactApplicationContext");
        Intrinsics.checkNotNullParameter(javaScriptTimerExecutor, "javaScriptTimerExecutor");
        Intrinsics.checkNotNullParameter(reactChoreographer, "reactChoreographer");
        Intrinsics.checkNotNullParameter(devSupportManager, "devSupportManager");
        this.f21730a = reactApplicationContext;
        this.f21731b = javaScriptTimerExecutor;
        this.f21732c = reactChoreographer;
        this.f21733d = devSupportManager;
        this.f21734e = new Object();
        this.f21735f = new Object();
        this.f21736g = new SparseArray();
        this.f21737h = new AtomicBoolean(true);
        this.f21738i = new AtomicBoolean(false);
        this.f21739j = new e();
        this.f21740k = new c();
        final f fVar = f.f21756a;
        this.f21745p = new PriorityQueue(11, new Comparator() { // from class: O4.e
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int A10;
                A10 = JavaTimerManager.A(Function2.this, obj, obj2);
                return A10;
            }
        });
        reactApplicationContext.addLifecycleEventListener(this);
        J4.c.f(reactApplicationContext).d(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int A(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(obj, obj2)).intValue();
    }

    private final void q() {
        if (this.f21743n) {
            this.f21732c.n(a.EnumC0379a.IDLE_EVENT, this.f21740k);
            this.f21743n = false;
        }
    }

    private final void r() {
        J4.c f10 = J4.c.f(this.f21730a);
        if (this.f21742m && this.f21737h.get() && !f10.g()) {
            this.f21732c.n(a.EnumC0379a.TIMERS_EVENTS, this.f21739j);
            this.f21742m = false;
        }
    }

    private final void u() {
        if (!this.f21737h.get() || this.f21738i.get()) {
            return;
        }
        r();
    }

    private final void v() {
        synchronized (this.f21735f) {
            try {
                if (this.f21744o) {
                    y();
                }
                Unit unit = Unit.f36324a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void x() {
        if (this.f21742m) {
            return;
        }
        this.f21732c.k(a.EnumC0379a.TIMERS_EVENTS, this.f21739j);
        this.f21742m = true;
    }

    private final void y() {
        if (this.f21743n) {
            return;
        }
        this.f21732c.k(a.EnumC0379a.IDLE_EVENT, this.f21740k);
        this.f21743n = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(JavaTimerManager this$0, boolean z10) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        synchronized (this$0.f21735f) {
            try {
                if (z10) {
                    this$0.y();
                } else {
                    this$0.q();
                }
                Unit unit = Unit.f36324a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // J4.d
    public void a(int i10) {
        if (J4.c.f(this.f21730a).g()) {
            return;
        }
        this.f21738i.set(false);
        r();
        u();
    }

    @Override // J4.d
    public void b(int i10) {
        if (this.f21738i.getAndSet(true)) {
            return;
        }
        x();
        v();
    }

    public void createTimer(int i10, long j10, boolean z10) {
        d dVar = new d(i10, (k.b() / HVFrameRecorder.BITRATE) + j10, (int) j10, z10);
        synchronized (this.f21734e) {
            this.f21745p.add(dVar);
            this.f21736g.put(i10, dVar);
            Unit unit = Unit.f36324a;
        }
    }

    public void deleteTimer(int i10) {
        synchronized (this.f21734e) {
            d dVar = (d) this.f21736g.get(i10);
            if (dVar == null) {
                return;
            }
            Intrinsics.d(dVar);
            this.f21736g.remove(i10);
            this.f21745p.remove(dVar);
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        r();
        u();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        this.f21737h.set(true);
        r();
        u();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        this.f21737h.set(false);
        x();
        v();
    }

    public void s(int i10, int i11, double d10, boolean z10) {
        long a10 = k.a();
        long j10 = (long) d10;
        if (this.f21733d.n() && Math.abs(j10 - a10) > 60000) {
            this.f21731b.emitTimeDriftWarning("Debugger and device times have drifted by more than 60s. Please correct this by running adb shell \"date `date +%m%d%H%M%Y.%S`\" on your debugger machine.");
        }
        long max = Math.max(0L, (j10 - a10) + i11);
        if (i11 != 0 || z10) {
            createTimer(i10, max, z10);
            return;
        }
        WritableArray createArray = Arguments.createArray();
        createArray.pushInt(i10);
        O4.d dVar = this.f21731b;
        Intrinsics.d(createArray);
        dVar.callTimers(createArray);
    }

    public void setSendIdleEvents(final boolean z10) {
        synchronized (this.f21735f) {
            this.f21744o = z10;
            Unit unit = Unit.f36324a;
        }
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: O4.f
            @Override // java.lang.Runnable
            public final void run() {
                JavaTimerManager.z(JavaTimerManager.this, z10);
            }
        });
    }

    public final boolean t(long j10) {
        synchronized (this.f21734e) {
            d dVar = (d) this.f21745p.peek();
            if (dVar == null) {
                return false;
            }
            if (f21729q.b(dVar, j10)) {
                return true;
            }
            Iterator it = this.f21745p.iterator();
            while (it.hasNext()) {
                d dVar2 = (d) it.next();
                a aVar = f21729q;
                Intrinsics.d(dVar2);
                if (aVar.b(dVar2, j10)) {
                    return true;
                }
            }
            Unit unit = Unit.f36324a;
            return false;
        }
    }

    public void w() {
        J4.c.f(this.f21730a).j(this);
        this.f21730a.removeLifecycleEventListener(this);
        r();
        q();
    }
}
