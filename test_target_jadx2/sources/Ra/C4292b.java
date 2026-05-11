package ra;

import Ea.d;
import Ea.e;
import Ea.f;
import Fa.c;
import android.app.Activity;
import android.content.Intent;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContext;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: ra.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4292b implements Ea.b, d, e, c {

    /* renamed from: a, reason: collision with root package name */
    private ReactContext f40539a;

    /* renamed from: b, reason: collision with root package name */
    private Map f40540b = new WeakHashMap();

    /* renamed from: c, reason: collision with root package name */
    private Map f40541c = new WeakHashMap();

    /* renamed from: ra.b$a */
    class a implements LifecycleEventListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ WeakReference f40542a;

        a(WeakReference weakReference) {
            this.f40542a = weakReference;
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostDestroy() {
            f fVar = (f) this.f40542a.get();
            if (fVar != null) {
                fVar.onHostDestroy();
            }
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostPause() {
            f fVar = (f) this.f40542a.get();
            if (fVar != null) {
                fVar.onHostPause();
            }
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostResume() {
            f fVar = (f) this.f40542a.get();
            if (fVar != null) {
                fVar.onHostResume();
            }
        }
    }

    /* renamed from: ra.b$b, reason: collision with other inner class name */
    class C0603b implements ActivityEventListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ WeakReference f40544a;

        C0603b(WeakReference weakReference) {
            this.f40544a = weakReference;
        }

        @Override // com.facebook.react.bridge.ActivityEventListener
        public void onActivityResult(Activity activity, int i10, int i11, Intent intent) {
            Ea.a aVar = (Ea.a) this.f40544a.get();
            if (aVar != null) {
                aVar.onActivityResult(activity, i10, i11, intent);
            }
        }

        @Override // com.facebook.react.bridge.ActivityEventListener
        public void onNewIntent(Intent intent) {
            Ea.a aVar = (Ea.a) this.f40544a.get();
            if (aVar != null) {
                aVar.onNewIntent(intent);
            }
        }
    }

    public C4292b(ReactContext reactContext) {
        this.f40539a = reactContext;
    }

    @Override // Ea.b
    public Activity a() {
        return g().getCurrentActivity();
    }

    @Override // Fa.c
    public void b(Ea.a aVar) {
        g().removeActivityEventListener((ActivityEventListener) this.f40541c.get(aVar));
        this.f40541c.remove(aVar);
    }

    @Override // Ea.k
    public void c() {
        Iterator it = new ArrayList(this.f40540b.values()).iterator();
        while (it.hasNext()) {
            ((LifecycleEventListener) it.next()).onHostDestroy();
        }
        Iterator it2 = this.f40540b.values().iterator();
        while (it2.hasNext()) {
            this.f40539a.removeLifecycleEventListener((LifecycleEventListener) it2.next());
        }
        this.f40540b.clear();
    }

    @Override // Fa.c
    public void d(f fVar) {
        this.f40540b.put(fVar, new a(new WeakReference(fVar)));
        this.f40539a.addLifecycleEventListener((LifecycleEventListener) this.f40540b.get(fVar));
    }

    @Override // Ea.d
    public List e() {
        return Arrays.asList(Ea.b.class, e.class, c.class);
    }

    @Override // Fa.c
    public void f(Ea.a aVar) {
        this.f40541c.put(aVar, new C0603b(new WeakReference(aVar)));
        this.f40539a.addActivityEventListener((ActivityEventListener) this.f40541c.get(aVar));
    }

    protected ReactContext g() {
        return this.f40539a;
    }
}
