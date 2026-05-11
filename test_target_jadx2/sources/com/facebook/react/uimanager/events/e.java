package com.facebook.react.uimanager.events;

import android.util.LongSparseArray;
import android.view.Choreographer;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.modules.core.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import r4.AbstractC4012a;
import s5.C4313a;
import v4.AbstractC4929e;

/* loaded from: classes.dex */
public class e implements EventDispatcher, LifecycleEventListener {

    /* renamed from: q, reason: collision with root package name */
    private static final Comparator f22344q = new a();

    /* renamed from: c, reason: collision with root package name */
    private final ReactApplicationContext f22347c;

    /* renamed from: n, reason: collision with root package name */
    private volatile ReactEventEmitter f22358n;

    /* renamed from: a, reason: collision with root package name */
    private final Object f22345a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final Object f22346b = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final LongSparseArray f22348d = new LongSparseArray();

    /* renamed from: e, reason: collision with root package name */
    private final Map f22349e = AbstractC4929e.b();

    /* renamed from: f, reason: collision with root package name */
    private final c f22350f = new c();

    /* renamed from: g, reason: collision with root package name */
    private final ArrayList f22351g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    private final CopyOnWriteArrayList f22352h = new CopyOnWriteArrayList();

    /* renamed from: i, reason: collision with root package name */
    private final CopyOnWriteArrayList f22353i = new CopyOnWriteArrayList();

    /* renamed from: j, reason: collision with root package name */
    private final d f22354j = new d();

    /* renamed from: k, reason: collision with root package name */
    private final AtomicInteger f22355k = new AtomicInteger();

    /* renamed from: l, reason: collision with root package name */
    private com.facebook.react.uimanager.events.d[] f22356l = new com.facebook.react.uimanager.events.d[16];

    /* renamed from: m, reason: collision with root package name */
    private int f22357m = 0;

    /* renamed from: o, reason: collision with root package name */
    private short f22359o = 0;

    /* renamed from: p, reason: collision with root package name */
    private volatile boolean f22360p = false;

    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(com.facebook.react.uimanager.events.d dVar, com.facebook.react.uimanager.events.d dVar2) {
            if (dVar == null && dVar2 == null) {
                return 0;
            }
            if (dVar == null) {
                return -1;
            }
            if (dVar2 == null) {
                return 1;
            }
            long timestampMs = dVar.getTimestampMs() - dVar2.getTimestampMs();
            if (timestampMs == 0) {
                return 0;
            }
            return timestampMs < 0 ? -1 : 1;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.G();
        }
    }

    private class c implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            C4313a.c(0L, "DispatchEventsRunnable");
            try {
                C4313a.f(0L, "ScheduleDispatchFrameCallback", e.this.f22355k.getAndIncrement());
                e.this.f22360p = false;
                AbstractC4012a.c(e.this.f22358n);
                synchronized (e.this.f22346b) {
                    try {
                        if (e.this.f22357m > 0) {
                            if (e.this.f22357m > 1) {
                                Arrays.sort(e.this.f22356l, 0, e.this.f22357m, e.f22344q);
                            }
                            for (int i10 = 0; i10 < e.this.f22357m; i10++) {
                                com.facebook.react.uimanager.events.d dVar = e.this.f22356l[i10];
                                if (dVar != null) {
                                    C4313a.f(0L, dVar.getEventName(), dVar.getUniqueID());
                                    dVar.dispatchModern(e.this.f22358n);
                                    dVar.dispose();
                                }
                            }
                            e.this.B();
                            e.this.f22348d.clear();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Iterator it = e.this.f22353i.iterator();
                while (it.hasNext()) {
                    ((com.facebook.react.uimanager.events.a) it.next()).onBatchEventDispatched();
                }
            } finally {
                C4313a.i(0L);
            }
        }

        private c() {
        }
    }

    private class d implements Choreographer.FrameCallback {

        /* renamed from: a, reason: collision with root package name */
        private volatile boolean f22363a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f22364b;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.a();
            }
        }

        private void c() {
            if (G4.a.g()) {
                return;
            }
            com.facebook.react.modules.core.a.h().k(a.EnumC0379a.TIMERS_EVENTS, e.this.f22354j);
        }

        public void a() {
            if (this.f22363a) {
                return;
            }
            this.f22363a = true;
            c();
        }

        public void b() {
            if (this.f22363a) {
                return;
            }
            if (e.this.f22347c.isOnUiQueueThread()) {
                a();
            } else {
                e.this.f22347c.runOnUiQueueThread(new a());
            }
        }

        public void d() {
            this.f22364b = true;
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j10) {
            UiThreadUtil.assertOnUiThread();
            if (this.f22364b) {
                this.f22363a = false;
            } else {
                c();
            }
            C4313a.c(0L, "ScheduleDispatchFrameCallback");
            try {
                e.this.F();
                if (!e.this.f22360p) {
                    e.this.f22360p = true;
                    C4313a.l(0L, "ScheduleDispatchFrameCallback", e.this.f22355k.get());
                    e.this.f22347c.runOnJSQueueThread(e.this.f22350f);
                }
            } finally {
                C4313a.i(0L);
            }
        }

        private d() {
            this.f22363a = false;
            this.f22364b = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(ReactApplicationContext reactApplicationContext) {
        this.f22347c = reactApplicationContext;
        reactApplicationContext.addLifecycleEventListener(this);
        this.f22358n = new ReactEventEmitter(reactApplicationContext);
    }

    private void A(com.facebook.react.uimanager.events.d dVar) {
        int i10 = this.f22357m;
        com.facebook.react.uimanager.events.d[] dVarArr = this.f22356l;
        if (i10 == dVarArr.length) {
            this.f22356l = (com.facebook.react.uimanager.events.d[]) Arrays.copyOf(dVarArr, dVarArr.length * 2);
        }
        com.facebook.react.uimanager.events.d[] dVarArr2 = this.f22356l;
        int i11 = this.f22357m;
        this.f22357m = i11 + 1;
        dVarArr2[i11] = dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B() {
        Arrays.fill(this.f22356l, 0, this.f22357m, (Object) null);
        this.f22357m = 0;
    }

    private long C(int i10, String str, short s10) {
        short s11;
        Short sh = (Short) this.f22349e.get(str);
        if (sh != null) {
            s11 = sh.shortValue();
        } else {
            short s12 = this.f22359o;
            this.f22359o = (short) (s12 + 1);
            this.f22349e.put(str, Short.valueOf(s12));
            s11 = s12;
        }
        return D(i10, s11, s10);
    }

    private static long D(int i10, short s10, short s11) {
        return ((s10 & 65535) << 32) | i10 | ((s11 & 65535) << 48);
    }

    private void E() {
        if (this.f22358n != null) {
            this.f22354j.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F() {
        synchronized (this.f22345a) {
            synchronized (this.f22346b) {
                for (int i10 = 0; i10 < this.f22351g.size(); i10++) {
                    try {
                        com.facebook.react.uimanager.events.d dVar = (com.facebook.react.uimanager.events.d) this.f22351g.get(i10);
                        if (dVar.canCoalesce()) {
                            long C10 = C(dVar.getViewTag(), dVar.getEventName(), dVar.getCoalescingKey());
                            Integer num = (Integer) this.f22348d.get(C10);
                            com.facebook.react.uimanager.events.d dVar2 = null;
                            if (num == null) {
                                this.f22348d.put(C10, Integer.valueOf(this.f22357m));
                            } else {
                                com.facebook.react.uimanager.events.d dVar3 = this.f22356l[num.intValue()];
                                com.facebook.react.uimanager.events.d coalesce = dVar.coalesce(dVar3);
                                if (coalesce != dVar3) {
                                    this.f22348d.put(C10, Integer.valueOf(this.f22357m));
                                    this.f22356l[num.intValue()] = null;
                                    dVar2 = dVar3;
                                    dVar = coalesce;
                                } else {
                                    dVar2 = dVar;
                                    dVar = null;
                                }
                            }
                            if (dVar != null) {
                                A(dVar);
                            }
                            if (dVar2 != null) {
                                dVar2.dispose();
                            }
                        } else {
                            A(dVar);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            this.f22351g.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G() {
        UiThreadUtil.assertOnUiThread();
        this.f22354j.d();
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void a(int i10, RCTEventEmitter rCTEventEmitter) {
        this.f22358n.register(i10, rCTEventEmitter);
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void b(h hVar) {
        this.f22352h.add(hVar);
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void c(com.facebook.react.uimanager.events.d dVar) {
        AbstractC4012a.b(dVar.isInitialized(), "Dispatched event hasn't been initialized");
        Iterator it = this.f22352h.iterator();
        while (it.hasNext()) {
            ((h) it.next()).onEventDispatch(dVar);
        }
        synchronized (this.f22345a) {
            this.f22351g.add(dVar);
            C4313a.l(0L, dVar.getEventName(), dVar.getUniqueID());
        }
        E();
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void d() {
        E();
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void e(com.facebook.react.uimanager.events.a aVar) {
        this.f22353i.remove(aVar);
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void f(com.facebook.react.uimanager.events.a aVar) {
        this.f22353i.add(aVar);
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void g() {
        UiThreadUtil.runOnUiThread(new b());
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void h(int i10, RCTModernEventEmitter rCTModernEventEmitter) {
        this.f22358n.register(i10, rCTModernEventEmitter);
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void i(int i10) {
        this.f22358n.unregister(i10);
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void j(h hVar) {
        this.f22352h.remove(hVar);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        G();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        G();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        E();
    }
}
