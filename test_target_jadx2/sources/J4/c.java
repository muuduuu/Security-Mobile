package J4;

import android.util.SparseArray;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.modules.appregistry.AppRegistry;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import r4.AbstractC4012a;

/* loaded from: classes.dex */
public class c {

    /* renamed from: g, reason: collision with root package name */
    private static final WeakHashMap f4768g = new WeakHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f4769a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f4770b = new CopyOnWriteArraySet();

    /* renamed from: c, reason: collision with root package name */
    private final AtomicInteger f4771c = new AtomicInteger(0);

    /* renamed from: d, reason: collision with root package name */
    private final Set f4772d = new CopyOnWriteArraySet();

    /* renamed from: e, reason: collision with root package name */
    private final Map f4773e = new ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    private final SparseArray f4774f = new SparseArray();

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ J4.a f4775a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f4776b;

        a(J4.a aVar, int i10) {
            this.f4775a = aVar;
            this.f4776b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.o(this.f4775a, this.f4776b);
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f4778a;

        b(int i10) {
            this.f4778a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = c.this.f4770b.iterator();
            while (it.hasNext()) {
                ((d) it.next()).a(this.f4778a);
            }
        }
    }

    private c(ReactContext reactContext) {
        this.f4769a = new WeakReference(reactContext);
    }

    public static c f(ReactContext reactContext) {
        WeakHashMap weakHashMap = f4768g;
        c cVar = (c) weakHashMap.get(reactContext);
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c(reactContext);
        weakHashMap.put(reactContext, cVar2);
        return cVar2;
    }

    private void k(int i10) {
        Runnable runnable = (Runnable) this.f4774f.get(i10);
        if (runnable != null) {
            UiThreadUtil.removeOnUiThread(runnable);
            this.f4774f.remove(i10);
        }
    }

    private void m(final int i10, long j10) {
        Runnable runnable = new Runnable() { // from class: J4.b
            @Override // java.lang.Runnable
            public final void run() {
                c.this.i(i10);
            }
        };
        this.f4774f.append(i10, runnable);
        UiThreadUtil.runOnUiThread(runnable, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void o(J4.a aVar, int i10) {
        try {
            UiThreadUtil.assertOnUiThread();
            ReactContext reactContext = (ReactContext) AbstractC4012a.d((ReactContext) this.f4769a.get(), "Tried to start a task on a react context that has already been destroyed");
            if (reactContext.getLifecycleState() == LifecycleState.RESUMED && !aVar.e()) {
                throw new IllegalStateException("Tried to start task " + aVar.c() + " while in foreground, but this is not allowed.");
            }
            this.f4772d.add(Integer.valueOf(i10));
            this.f4773e.put(Integer.valueOf(i10), new J4.a(aVar));
            if (reactContext.hasActiveReactInstance()) {
                ((AppRegistry) reactContext.getJSModule(AppRegistry.class)).startHeadlessTask(i10, aVar.c(), aVar.a());
            } else {
                ReactSoftExceptionLogger.logSoftException("HeadlessJsTaskContext", new RuntimeException("Cannot start headless task, CatalystInstance not available"));
            }
            if (aVar.d() > 0) {
                m(i10, aVar.d());
            }
            Iterator it = this.f4770b.iterator();
            while (it.hasNext()) {
                ((d) it.next()).b(i10);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void d(d dVar) {
        this.f4770b.add(dVar);
        Iterator it = this.f4772d.iterator();
        while (it.hasNext()) {
            dVar.b(((Integer) it.next()).intValue());
        }
    }

    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public synchronized void i(int i10) {
        boolean remove = this.f4772d.remove(Integer.valueOf(i10));
        this.f4773e.remove(Integer.valueOf(i10));
        k(i10);
        if (remove) {
            UiThreadUtil.runOnUiThread(new b(i10));
        }
    }

    public boolean g() {
        return this.f4772d.size() > 0;
    }

    public synchronized boolean h(int i10) {
        return this.f4772d.contains(Integer.valueOf(i10));
    }

    public void j(d dVar) {
        this.f4770b.remove(dVar);
    }

    public synchronized boolean l(int i10) {
        J4.a aVar = (J4.a) this.f4773e.get(Integer.valueOf(i10));
        AbstractC4012a.b(aVar != null, "Tried to retrieve non-existent task config with id " + i10 + ".");
        e b10 = aVar.b();
        if (!b10.a()) {
            return false;
        }
        k(i10);
        UiThreadUtil.runOnUiThread(new a(new J4.a(aVar.c(), aVar.a(), aVar.d(), aVar.e(), b10.c()), i10), b10.b());
        return true;
    }

    public synchronized int n(J4.a aVar) {
        int incrementAndGet;
        incrementAndGet = this.f4771c.incrementAndGet();
        o(aVar, incrementAndGet);
        return incrementAndGet;
    }
}
