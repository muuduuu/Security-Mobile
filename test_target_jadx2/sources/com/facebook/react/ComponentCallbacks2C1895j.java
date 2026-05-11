package com.facebook.react;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import com.facebook.react.bridge.MemoryPressureListener;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.facebook.react.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class ComponentCallbacks2C1895j implements ComponentCallbacks2 {

    /* renamed from: a, reason: collision with root package name */
    private final CopyOnWriteArrayList f21707a = new CopyOnWriteArrayList();

    public ComponentCallbacks2C1895j(Context context) {
        context.getApplicationContext().registerComponentCallbacks(this);
    }

    private void c(int i10) {
        Iterator it = this.f21707a.iterator();
        while (it.hasNext()) {
            ((MemoryPressureListener) it.next()).handleMemoryPressure(i10);
        }
    }

    public void a(MemoryPressureListener memoryPressureListener) {
        if (this.f21707a.contains(memoryPressureListener)) {
            return;
        }
        this.f21707a.add(memoryPressureListener);
    }

    public void b(Context context) {
        context.getApplicationContext().unregisterComponentCallbacks(this);
    }

    public void d(MemoryPressureListener memoryPressureListener) {
        this.f21707a.remove(memoryPressureListener);
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        c(i10);
    }
}
