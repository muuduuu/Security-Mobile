package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.widget.ImageView;
import com.squareup.picasso.AbstractC2924a;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public class u {

    /* renamed from: o, reason: collision with root package name */
    static final Handler f29623o = new a(Looper.getMainLooper());

    /* renamed from: p, reason: collision with root package name */
    static volatile u f29624p = null;

    /* renamed from: a, reason: collision with root package name */
    private final g f29625a;

    /* renamed from: b, reason: collision with root package name */
    private final c f29626b;

    /* renamed from: c, reason: collision with root package name */
    private final List f29627c;

    /* renamed from: d, reason: collision with root package name */
    final Context f29628d;

    /* renamed from: e, reason: collision with root package name */
    final i f29629e;

    /* renamed from: f, reason: collision with root package name */
    final InterfaceC2927d f29630f;

    /* renamed from: g, reason: collision with root package name */
    final B f29631g;

    /* renamed from: h, reason: collision with root package name */
    final Map f29632h;

    /* renamed from: i, reason: collision with root package name */
    final Map f29633i;

    /* renamed from: j, reason: collision with root package name */
    final ReferenceQueue f29634j;

    /* renamed from: k, reason: collision with root package name */
    final Bitmap.Config f29635k;

    /* renamed from: l, reason: collision with root package name */
    boolean f29636l;

    /* renamed from: m, reason: collision with root package name */
    volatile boolean f29637m;

    /* renamed from: n, reason: collision with root package name */
    boolean f29638n;

    static class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 3) {
                AbstractC2924a abstractC2924a = (AbstractC2924a) message.obj;
                if (abstractC2924a.g().f29637m) {
                    G.t("Main", "canceled", abstractC2924a.f29535b.d(), "target got garbage collected");
                }
                abstractC2924a.f29534a.a(abstractC2924a.k());
                return;
            }
            int i11 = 0;
            if (i10 == 8) {
                List list = (List) message.obj;
                int size = list.size();
                while (i11 < size) {
                    RunnableC2926c runnableC2926c = (RunnableC2926c) list.get(i11);
                    runnableC2926c.f29556b.d(runnableC2926c);
                    i11++;
                }
                return;
            }
            if (i10 != 13) {
                throw new AssertionError("Unknown handler message received: " + message.what);
            }
            List list2 = (List) message.obj;
            int size2 = list2.size();
            while (i11 < size2) {
                AbstractC2924a abstractC2924a2 = (AbstractC2924a) list2.get(i11);
                abstractC2924a2.f29534a.l(abstractC2924a2);
                i11++;
            }
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Context f29639a;

        /* renamed from: b, reason: collision with root package name */
        private j f29640b;

        /* renamed from: c, reason: collision with root package name */
        private ExecutorService f29641c;

        /* renamed from: d, reason: collision with root package name */
        private InterfaceC2927d f29642d;

        /* renamed from: e, reason: collision with root package name */
        private g f29643e;

        /* renamed from: f, reason: collision with root package name */
        private List f29644f;

        /* renamed from: g, reason: collision with root package name */
        private Bitmap.Config f29645g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f29646h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f29647i;

        public b(Context context) {
            if (context == null) {
                throw new IllegalArgumentException("Context must not be null.");
            }
            this.f29639a = context.getApplicationContext();
        }

        public u a() {
            Context context = this.f29639a;
            if (this.f29640b == null) {
                this.f29640b = new t(context);
            }
            if (this.f29642d == null) {
                this.f29642d = new n(context);
            }
            if (this.f29641c == null) {
                this.f29641c = new w();
            }
            if (this.f29643e == null) {
                this.f29643e = g.f29652a;
            }
            B b10 = new B(this.f29642d);
            return new u(context, new i(context, this.f29641c, u.f29623o, this.f29640b, this.f29642d, b10), this.f29642d, null, this.f29643e, this.f29644f, b10, this.f29645g, this.f29646h, this.f29647i);
        }

        public b b(j jVar) {
            if (jVar == null) {
                throw new IllegalArgumentException("Downloader must not be null.");
            }
            if (this.f29640b != null) {
                throw new IllegalStateException("Downloader already set.");
            }
            this.f29640b = jVar;
            return this;
        }

        public b c(boolean z10) {
            this.f29647i = z10;
            return this;
        }
    }

    private static class c extends Thread {

        /* renamed from: a, reason: collision with root package name */
        private final ReferenceQueue f29648a;

        /* renamed from: b, reason: collision with root package name */
        private final Handler f29649b;

        class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Exception f29650a;

            a(Exception exc) {
                this.f29650a = exc;
            }

            @Override // java.lang.Runnable
            public void run() {
                throw new RuntimeException(this.f29650a);
            }
        }

        c(ReferenceQueue referenceQueue, Handler handler) {
            this.f29648a = referenceQueue;
            this.f29649b = handler;
            setDaemon(true);
            setName("Picasso-refQueue");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    AbstractC2924a.C0435a c0435a = (AbstractC2924a.C0435a) this.f29648a.remove(1000L);
                    Message obtainMessage = this.f29649b.obtainMessage();
                    if (c0435a != null) {
                        obtainMessage.what = 3;
                        obtainMessage.obj = c0435a.f29546a;
                        this.f29649b.sendMessage(obtainMessage);
                    } else {
                        obtainMessage.recycle();
                    }
                } catch (InterruptedException unused) {
                    return;
                } catch (Exception e10) {
                    this.f29649b.post(new a(e10));
                    return;
                }
            }
        }
    }

    public interface d {
    }

    public enum e {
        MEMORY(-16711936),
        DISK(-16776961),
        NETWORK(-65536);

        final int debugColor;

        e(int i10) {
            this.debugColor = i10;
        }
    }

    public enum f {
        LOW,
        NORMAL,
        HIGH
    }

    public interface g {

        /* renamed from: a, reason: collision with root package name */
        public static final g f29652a = new a();

        static class a implements g {
            a() {
            }

            @Override // com.squareup.picasso.u.g
            public x a(x xVar) {
                return xVar;
            }
        }

        x a(x xVar);
    }

    u(Context context, i iVar, InterfaceC2927d interfaceC2927d, d dVar, g gVar, List list, B b10, Bitmap.Config config, boolean z10, boolean z11) {
        this.f29628d = context;
        this.f29629e = iVar;
        this.f29630f = interfaceC2927d;
        this.f29625a = gVar;
        this.f29635k = config;
        ArrayList arrayList = new ArrayList((list != null ? list.size() : 0) + 7);
        arrayList.add(new A(context));
        if (list != null) {
            arrayList.addAll(list);
        }
        arrayList.add(new C2929f(context));
        arrayList.add(new p(context));
        arrayList.add(new C2930g(context));
        arrayList.add(new C2925b(context));
        arrayList.add(new l(context));
        arrayList.add(new s(iVar.f29584d, b10));
        this.f29627c = Collections.unmodifiableList(arrayList);
        this.f29631g = b10;
        this.f29632h = new WeakHashMap();
        this.f29633i = new WeakHashMap();
        this.f29636l = z10;
        this.f29637m = z11;
        ReferenceQueue referenceQueue = new ReferenceQueue();
        this.f29634j = referenceQueue;
        c cVar = new c(referenceQueue, f29623o);
        this.f29626b = cVar;
        cVar.start();
    }

    private void f(Bitmap bitmap, e eVar, AbstractC2924a abstractC2924a, Exception exc) {
        if (abstractC2924a.l()) {
            return;
        }
        if (!abstractC2924a.m()) {
            this.f29632h.remove(abstractC2924a.k());
        }
        if (bitmap == null) {
            abstractC2924a.c(exc);
            if (this.f29637m) {
                G.t("Main", "errored", abstractC2924a.f29535b.d(), exc.getMessage());
                return;
            }
            return;
        }
        if (eVar == null) {
            throw new AssertionError("LoadedFrom cannot be null.");
        }
        abstractC2924a.b(bitmap, eVar);
        if (this.f29637m) {
            G.t("Main", "completed", abstractC2924a.f29535b.d(), "from " + eVar);
        }
    }

    void a(Object obj) {
        G.c();
        AbstractC2924a abstractC2924a = (AbstractC2924a) this.f29632h.remove(obj);
        if (abstractC2924a != null) {
            abstractC2924a.a();
            this.f29629e.c(abstractC2924a);
        }
        if (obj instanceof ImageView) {
            h hVar = (h) this.f29633i.remove((ImageView) obj);
            if (hVar != null) {
                hVar.a();
            }
        }
    }

    public void b(ImageView imageView) {
        if (imageView == null) {
            throw new IllegalArgumentException("view cannot be null.");
        }
        a(imageView);
    }

    public void c(D d10) {
        if (d10 == null) {
            throw new IllegalArgumentException("target cannot be null.");
        }
        a(d10);
    }

    void d(RunnableC2926c runnableC2926c) {
        AbstractC2924a h10 = runnableC2926c.h();
        List i10 = runnableC2926c.i();
        boolean z10 = (i10 == null || i10.isEmpty()) ? false : true;
        if (h10 != null || z10) {
            Uri uri = runnableC2926c.j().f29666d;
            Exception k10 = runnableC2926c.k();
            Bitmap s10 = runnableC2926c.s();
            e o10 = runnableC2926c.o();
            if (h10 != null) {
                f(s10, o10, h10, k10);
            }
            if (z10) {
                int size = i10.size();
                for (int i11 = 0; i11 < size; i11++) {
                    f(s10, o10, (AbstractC2924a) i10.get(i11), k10);
                }
            }
        }
    }

    void e(ImageView imageView, h hVar) {
        if (this.f29633i.containsKey(imageView)) {
            a(imageView);
        }
        this.f29633i.put(imageView, hVar);
    }

    void g(AbstractC2924a abstractC2924a) {
        Object k10 = abstractC2924a.k();
        if (k10 != null && this.f29632h.get(k10) != abstractC2924a) {
            a(k10);
            this.f29632h.put(k10, abstractC2924a);
        }
        m(abstractC2924a);
    }

    List h() {
        return this.f29627c;
    }

    public y i(Uri uri) {
        return new y(this, uri, 0);
    }

    public y j(String str) {
        if (str == null) {
            return new y(this, null, 0);
        }
        if (str.trim().length() != 0) {
            return i(Uri.parse(str));
        }
        throw new IllegalArgumentException("Path must not be empty.");
    }

    Bitmap k(String str) {
        Bitmap a10 = this.f29630f.a(str);
        if (a10 != null) {
            this.f29631g.d();
        } else {
            this.f29631g.e();
        }
        return a10;
    }

    void l(AbstractC2924a abstractC2924a) {
        Bitmap k10 = q.shouldReadFromMemoryCache(abstractC2924a.f29538e) ? k(abstractC2924a.d()) : null;
        if (k10 == null) {
            g(abstractC2924a);
            if (this.f29637m) {
                G.s("Main", "resumed", abstractC2924a.f29535b.d());
                return;
            }
            return;
        }
        e eVar = e.MEMORY;
        f(k10, eVar, abstractC2924a, null);
        if (this.f29637m) {
            G.t("Main", "completed", abstractC2924a.f29535b.d(), "from " + eVar);
        }
    }

    void m(AbstractC2924a abstractC2924a) {
        this.f29629e.h(abstractC2924a);
    }

    x n(x xVar) {
        x a10 = this.f29625a.a(xVar);
        if (a10 != null) {
            return a10;
        }
        throw new IllegalStateException("Request transformer " + this.f29625a.getClass().getCanonicalName() + " returned null for " + xVar);
    }
}
