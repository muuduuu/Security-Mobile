package androidx.camera.core.impl;

import androidx.camera.core.impl.AbstractC1429c0;
import androidx.concurrent.futures.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;

/* renamed from: androidx.camera.core.impl.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1435f0 {

    /* renamed from: androidx.camera.core.impl.f0$a */
    class a implements G.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f14575a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c.a f14576b;

        a(boolean z10, c.a aVar) {
            this.f14575a = z10;
            this.f14576b = aVar;
        }

        @Override // G.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(List list) {
            y0.f.g(list);
            ArrayList arrayList = new ArrayList(list);
            if (this.f14575a) {
                arrayList.removeAll(Collections.singleton(null));
            }
            this.f14576b.c(arrayList);
        }

        @Override // G.c
        public void onFailure(Throwable th) {
            if (th instanceof TimeoutException) {
                this.f14576b.f(th);
            } else {
                this.f14576b.c(Collections.emptyList());
            }
        }
    }

    public static void c(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((AbstractC1429c0) it.next()).e();
        }
    }

    public static void d(List list) {
        if (list.isEmpty()) {
            return;
        }
        int i10 = 0;
        do {
            try {
                ((AbstractC1429c0) list.get(i10)).l();
                i10++;
            } catch (AbstractC1429c0.a e10) {
                for (int i11 = i10 - 1; i11 >= 0; i11--) {
                    ((AbstractC1429c0) list.get(i11)).e();
                }
                throw e10;
            }
        } while (i10 < list.size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object f(final h8.d dVar, Executor executor, boolean z10, Collection collection, c.a aVar) {
        aVar.a(new Runnable() { // from class: androidx.camera.core.impl.e0
            @Override // java.lang.Runnable
            public final void run() {
                h8.d.this.cancel(true);
            }
        }, executor);
        G.n.j(dVar, new a(z10, aVar), executor);
        return "surfaceList[" + collection + "]";
    }

    public static h8.d g(final Collection collection, final boolean z10, long j10, final Executor executor, ScheduledExecutorService scheduledExecutorService) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(G.n.B(((AbstractC1429c0) it.next()).j()));
        }
        final h8.d z11 = G.n.z(j10, scheduledExecutorService, G.n.F(arrayList));
        return androidx.concurrent.futures.c.a(new c.InterfaceC0253c() { // from class: androidx.camera.core.impl.d0
            @Override // androidx.concurrent.futures.c.InterfaceC0253c
            public final Object a(c.a aVar) {
                Object f10;
                f10 = AbstractC1435f0.f(h8.d.this, executor, z10, collection, aVar);
                return f10;
            }
        });
    }
}
