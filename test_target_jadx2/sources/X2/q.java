package x2;

import android.util.Log;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    private final Set f44753a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b, reason: collision with root package name */
    private final Set f44754b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    private boolean f44755c;

    public boolean a(com.bumptech.glide.request.d dVar) {
        boolean z10 = true;
        if (dVar == null) {
            return true;
        }
        boolean remove = this.f44753a.remove(dVar);
        if (!this.f44754b.remove(dVar) && !remove) {
            z10 = false;
        }
        if (z10) {
            dVar.clear();
        }
        return z10;
    }

    public void b() {
        Iterator it = D2.l.k(this.f44753a).iterator();
        while (it.hasNext()) {
            a((com.bumptech.glide.request.d) it.next());
        }
        this.f44754b.clear();
    }

    public void c() {
        this.f44755c = true;
        for (com.bumptech.glide.request.d dVar : D2.l.k(this.f44753a)) {
            if (dVar.isRunning() || dVar.isComplete()) {
                dVar.clear();
                this.f44754b.add(dVar);
            }
        }
    }

    public void d() {
        this.f44755c = true;
        for (com.bumptech.glide.request.d dVar : D2.l.k(this.f44753a)) {
            if (dVar.isRunning()) {
                dVar.pause();
                this.f44754b.add(dVar);
            }
        }
    }

    public void e() {
        for (com.bumptech.glide.request.d dVar : D2.l.k(this.f44753a)) {
            if (!dVar.isComplete() && !dVar.isCleared()) {
                dVar.clear();
                if (this.f44755c) {
                    this.f44754b.add(dVar);
                } else {
                    dVar.begin();
                }
            }
        }
    }

    public void f() {
        this.f44755c = false;
        for (com.bumptech.glide.request.d dVar : D2.l.k(this.f44753a)) {
            if (!dVar.isComplete() && !dVar.isRunning()) {
                dVar.begin();
            }
        }
        this.f44754b.clear();
    }

    public void g(com.bumptech.glide.request.d dVar) {
        this.f44753a.add(dVar);
        if (!this.f44755c) {
            dVar.begin();
            return;
        }
        dVar.clear();
        if (Log.isLoggable("RequestTracker", 2)) {
            Log.v("RequestTracker", "Paused, delaying request");
        }
        this.f44754b.add(dVar);
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f44753a.size() + ", isPaused=" + this.f44755c + "}";
    }
}
