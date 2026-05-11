package com.swmansion.gesturehandler.react;

import android.util.SparseArray;
import android.view.View;
import com.facebook.react.bridge.UiThreadUtil;
import ea.AbstractC3109d;
import ea.InterfaceC3113h;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class g implements InterfaceC3113h {

    /* renamed from: a, reason: collision with root package name */
    private final SparseArray f29772a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray f29773b = new SparseArray();

    /* renamed from: c, reason: collision with root package name */
    private final SparseArray f29774c = new SparseArray();

    private final synchronized void d(final AbstractC3109d abstractC3109d) {
        try {
            Integer num = (Integer) this.f29773b.get(abstractC3109d.R());
            if (num != null) {
                this.f29773b.remove(abstractC3109d.R());
                ArrayList arrayList = (ArrayList) this.f29774c.get(num.intValue());
                if (arrayList != null) {
                    synchronized (arrayList) {
                        arrayList.remove(abstractC3109d);
                    }
                    if (arrayList.size() == 0) {
                        this.f29774c.remove(num.intValue());
                    }
                }
            }
            if (abstractC3109d.U() != null) {
                UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.swmansion.gesturehandler.react.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.e(AbstractC3109d.this);
                    }
                });
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(AbstractC3109d handler) {
        Intrinsics.checkNotNullParameter(handler, "$handler");
        handler.o();
    }

    private final synchronized void k(int i10, AbstractC3109d abstractC3109d) {
        try {
            if (this.f29773b.get(abstractC3109d.R()) != null) {
                throw new IllegalStateException(("Handler " + abstractC3109d + " already attached").toString());
            }
            this.f29773b.put(abstractC3109d.R(), Integer.valueOf(i10));
            Object obj = this.f29774c.get(i10);
            if (obj == null) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(abstractC3109d);
                this.f29774c.put(i10, arrayList);
            } else {
                synchronized (obj) {
                    ((ArrayList) obj).add(abstractC3109d);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // ea.InterfaceC3113h
    public synchronized ArrayList a(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return i(view.getId());
    }

    public final synchronized boolean c(int i10, int i11, int i12) {
        boolean z10;
        AbstractC3109d abstractC3109d = (AbstractC3109d) this.f29772a.get(i10);
        if (abstractC3109d != null) {
            d(abstractC3109d);
            abstractC3109d.q0(i12);
            k(i11, abstractC3109d);
            z10 = true;
        } else {
            z10 = false;
        }
        return z10;
    }

    public final synchronized void f() {
        this.f29772a.clear();
        this.f29773b.clear();
        this.f29774c.clear();
    }

    public final synchronized void g(int i10) {
        AbstractC3109d abstractC3109d = (AbstractC3109d) this.f29772a.get(i10);
        if (abstractC3109d != null) {
            d(abstractC3109d);
            this.f29772a.remove(i10);
        }
    }

    public final synchronized AbstractC3109d h(int i10) {
        return (AbstractC3109d) this.f29772a.get(i10);
    }

    public final synchronized ArrayList i(int i10) {
        return (ArrayList) this.f29774c.get(i10);
    }

    public final synchronized void j(AbstractC3109d handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f29772a.put(handler.R(), handler);
    }
}
