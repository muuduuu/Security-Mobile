package com.facebook.react.uimanager;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import v4.AbstractC4929e;

/* loaded from: classes.dex */
public final class i1 implements ComponentCallbacks2 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f22440a;

    /* renamed from: b, reason: collision with root package name */
    private final j1 f22441b;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f22442a;

        a(List list) {
            this.f22442a = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f22442a.iterator();
            while (it.hasNext()) {
                ((ViewManager) it.next()).trimMemory();
            }
        }
    }

    public i1(j1 j1Var) {
        this.f22440a = AbstractC4929e.b();
        this.f22441b = j1Var;
    }

    private ViewManager d(String str) {
        ViewManager b10 = this.f22441b.b(str);
        if (b10 != null) {
            this.f22440a.put(str, b10);
        }
        return b10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void g(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((ViewManager) it.next()).invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(List list, int i10) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((ViewManager) it.next()).onSurfaceStopped(i10);
        }
    }

    public synchronized ViewManager c(String str) {
        try {
            ViewManager viewManager = (ViewManager) this.f22440a.get(str);
            if (viewManager != null) {
                return viewManager;
            }
            String str2 = "RCT" + str;
            ViewManager viewManager2 = (ViewManager) this.f22440a.get(str2);
            if (viewManager2 != null) {
                return viewManager2;
            }
            if (this.f22441b == null) {
                throw new Q("No ViewManager found for class " + str);
            }
            ViewManager d10 = d(str);
            if (d10 != null) {
                return d10;
            }
            ViewManager d11 = d(str2);
            if (d11 != null) {
                return d11;
            }
            throw new Q("ViewManagerResolver returned null for either " + str + " or " + str2 + ", existing names are: " + this.f22441b.a());
        } catch (Throwable th) {
            throw th;
        }
    }

    synchronized ViewManager e(String str) {
        ViewManager viewManager = (ViewManager) this.f22440a.get(str);
        if (viewManager != null) {
            return viewManager;
        }
        if (this.f22441b == null) {
            return null;
        }
        return d(str);
    }

    public void f() {
        final ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.f22440a.values());
        }
        Runnable runnable = new Runnable() { // from class: com.facebook.react.uimanager.g1
            @Override // java.lang.Runnable
            public final void run() {
                i1.g(arrayList);
            }
        };
        if (UiThreadUtil.isOnUiThread()) {
            runnable.run();
        } else {
            UiThreadUtil.runOnUiThread(runnable);
        }
    }

    public void i(final int i10) {
        final ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.f22440a.values());
        }
        Runnable runnable = new Runnable() { // from class: com.facebook.react.uimanager.h1
            @Override // java.lang.Runnable
            public final void run() {
                i1.h(arrayList, i10);
            }
        };
        if (UiThreadUtil.isOnUiThread()) {
            runnable.run();
        } else {
            UiThreadUtil.runOnUiThread(runnable);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        onTrimMemory(0);
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.f22440a.values());
        }
        a aVar = new a(arrayList);
        if (UiThreadUtil.isOnUiThread()) {
            aVar.run();
        } else {
            UiThreadUtil.runOnUiThread(aVar);
        }
    }

    public i1(List list) {
        HashMap b10 = AbstractC4929e.b();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ViewManager viewManager = (ViewManager) it.next();
            b10.put(viewManager.getName(), viewManager);
        }
        this.f22440a = b10;
        this.f22441b = null;
    }
}
