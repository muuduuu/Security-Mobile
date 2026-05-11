package com.facebook.react.uimanager.events;

import android.os.Handler;
import android.view.Choreographer;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.modules.core.a;
import com.facebook.react.uimanager.L0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import s5.C4313a;

/* loaded from: classes.dex */
public class j implements EventDispatcher, LifecycleEventListener {

    /* renamed from: h, reason: collision with root package name */
    private static final Handler f22367h = UiThreadUtil.getUiThreadHandler();

    /* renamed from: a, reason: collision with root package name */
    private final ReactEventEmitter f22368a;

    /* renamed from: b, reason: collision with root package name */
    private final ReactApplicationContext f22369b;

    /* renamed from: c, reason: collision with root package name */
    private final CopyOnWriteArrayList f22370c = new CopyOnWriteArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final CopyOnWriteArrayList f22371d = new CopyOnWriteArrayList();

    /* renamed from: e, reason: collision with root package name */
    private final c f22372e = new c();

    /* renamed from: f, reason: collision with root package name */
    private boolean f22373f = false;

    /* renamed from: g, reason: collision with root package name */
    private final Runnable f22374g = new a();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j.this.f22373f = false;
            C4313a.c(0L, "BatchEventDispatchedListeners");
            try {
                Iterator it = j.this.f22371d.iterator();
                while (it.hasNext()) {
                    ((com.facebook.react.uimanager.events.a) it.next()).onBatchEventDispatched();
                }
            } finally {
                C4313a.i(0L);
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j.this.p();
        }
    }

    private class c implements Choreographer.FrameCallback {

        /* renamed from: a, reason: collision with root package name */
        private volatile boolean f22377a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f22378b;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.b();
            }
        }

        private void a() {
            com.facebook.react.modules.core.a.h().k(a.EnumC0379a.TIMERS_EVENTS, j.this.f22372e);
        }

        public void b() {
            if (this.f22377a) {
                return;
            }
            this.f22377a = true;
            a();
        }

        public void c() {
            if (this.f22377a) {
                return;
            }
            if (j.this.f22369b.isOnUiQueueThread()) {
                b();
            } else {
                j.this.f22369b.runOnUiQueueThread(new a());
            }
        }

        public void d() {
            this.f22378b = true;
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j10) {
            UiThreadUtil.assertOnUiThread();
            if (this.f22378b) {
                this.f22377a = false;
            } else {
                a();
            }
            C4313a.c(0L, "BatchEventDispatchedListeners");
            try {
                Iterator it = j.this.f22371d.iterator();
                while (it.hasNext()) {
                    ((com.facebook.react.uimanager.events.a) it.next()).onBatchEventDispatched();
                }
            } finally {
                C4313a.i(0L);
            }
        }

        private c() {
            this.f22377a = false;
            this.f22378b = false;
        }
    }

    public j(ReactApplicationContext reactApplicationContext) {
        this.f22369b = reactApplicationContext;
        reactApplicationContext.addLifecycleEventListener(this);
        this.f22368a = new ReactEventEmitter(reactApplicationContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        UiThreadUtil.assertOnUiThread();
        if (!G4.a.u()) {
            this.f22372e.d();
        } else {
            this.f22373f = false;
            f22367h.removeCallbacks(this.f22374g);
        }
    }

    private void q(d dVar) {
        C4313a.c(0L, "FabricEventDispatcher.dispatchSynchronous('" + dVar.getEventName() + "')");
        try {
            UIManager g10 = L0.g(this.f22369b, 2);
            if (g10 instanceof o) {
                ((o) g10).receiveEvent(dVar.getSurfaceId(), dVar.getViewTag(), dVar.getEventName(), dVar.canCoalesce(), dVar.getEventData(), dVar.getEventCategory(), true);
            } else {
                ReactSoftExceptionLogger.logSoftException("FabricEventDispatcher", new ReactNoCrashSoftException("Fabric UIManager expected to implement SynchronousEventReceiver."));
            }
            C4313a.i(0L);
        } catch (Throwable th) {
            C4313a.i(0L);
            throw th;
        }
    }

    private void r() {
        if (!G4.a.u()) {
            this.f22372e.c();
        } else {
            if (this.f22373f) {
                return;
            }
            this.f22373f = true;
            f22367h.postAtFrontOfQueue(this.f22374g);
        }
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void a(int i10, RCTEventEmitter rCTEventEmitter) {
        this.f22368a.register(i10, rCTEventEmitter);
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void b(h hVar) {
        this.f22370c.add(hVar);
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void c(d dVar) {
        Iterator it = this.f22370c.iterator();
        while (it.hasNext()) {
            ((h) it.next()).onEventDispatch(dVar);
        }
        if (dVar.experimental_isSynchronous()) {
            q(dVar);
        } else {
            dVar.dispatchModern(this.f22368a);
        }
        dVar.dispose();
        r();
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void d() {
        r();
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void e(com.facebook.react.uimanager.events.a aVar) {
        this.f22371d.remove(aVar);
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void f(com.facebook.react.uimanager.events.a aVar) {
        this.f22371d.add(aVar);
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void g() {
        UiThreadUtil.runOnUiThread(new b());
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void h(int i10, RCTModernEventEmitter rCTModernEventEmitter) {
        this.f22368a.register(i10, rCTModernEventEmitter);
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void i(int i10) {
        this.f22368a.unregister(i10);
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void j(h hVar) {
        this.f22370c.remove(hVar);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        p();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        p();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        r();
    }
}
