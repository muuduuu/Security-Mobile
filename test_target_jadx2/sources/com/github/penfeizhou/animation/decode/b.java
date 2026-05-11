package com.github.penfeizhou.animation.decode;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.github.penfeizhou.animation.io.Reader;
import i6.C3322a;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.LockSupport;
import n6.InterfaceC3710b;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: u, reason: collision with root package name */
    private static final String f23149u = "b";

    /* renamed from: v, reason: collision with root package name */
    private static final Rect f23150v = new Rect();

    /* renamed from: a, reason: collision with root package name */
    private final int f23151a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3710b f23152b;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f23153c;

    /* renamed from: f, reason: collision with root package name */
    private int f23156f;

    /* renamed from: h, reason: collision with root package name */
    private final Set f23158h;

    /* renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f23159i;

    /* renamed from: j, reason: collision with root package name */
    private final Runnable f23160j;

    /* renamed from: k, reason: collision with root package name */
    protected int f23161k;

    /* renamed from: l, reason: collision with root package name */
    private final Set f23162l;

    /* renamed from: m, reason: collision with root package name */
    private final Object f23163m;

    /* renamed from: n, reason: collision with root package name */
    protected Map f23164n;

    /* renamed from: o, reason: collision with root package name */
    protected ByteBuffer f23165o;

    /* renamed from: p, reason: collision with root package name */
    protected volatile Rect f23166p;

    /* renamed from: q, reason: collision with root package name */
    private com.github.penfeizhou.animation.io.e f23167q;

    /* renamed from: r, reason: collision with root package name */
    private Reader f23168r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f23169s;

    /* renamed from: t, reason: collision with root package name */
    private volatile k f23170t;

    /* renamed from: d, reason: collision with root package name */
    protected List f23154d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    protected int f23155e = -1;

    /* renamed from: g, reason: collision with root package name */
    private Integer f23157g = null;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.f23159i.get()) {
                return;
            }
            if (!b.this.q()) {
                b.this.R();
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            long Q10 = b.this.Q();
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            b.this.f23153c.removeCallbacks(b.this.f23160j);
            b.this.f23153c.postDelayed(this, Math.max(0L, Q10 - currentTimeMillis2));
            Iterator it = b.this.f23158h.iterator();
            while (it.hasNext()) {
                ((j) it.next()).a(b.this.f23165o);
            }
        }
    }

    /* renamed from: com.github.penfeizhou.animation.decode.b$b, reason: collision with other inner class name */
    class RunnableC0392b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ j f23172a;

        RunnableC0392b(j jVar) {
            this.f23172a = jVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.f23158h.add(this.f23172a);
        }
    }

    class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ j f23174a;

        c(j jVar) {
            this.f23174a = jVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.f23158h.remove(this.f23174a);
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.f23158h.size() == 0) {
                b.this.R();
            }
        }
    }

    class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Thread f23177a;

        e(Thread thread) {
            this.f23177a = thread;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    if (b.this.f23166p == null) {
                        if (b.this.f23168r == null) {
                            b bVar = b.this;
                            bVar.f23168r = bVar.A(bVar.f23152b.a());
                        } else {
                            b.this.f23168r.reset();
                        }
                        b bVar2 = b.this;
                        bVar2.D(bVar2.I(bVar2.f23168r));
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                    b.this.f23166p = b.f23150v;
                }
                LockSupport.unpark(this.f23177a);
            } catch (Throwable th) {
                LockSupport.unpark(this.f23177a);
                throw th;
            }
        }
    }

    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.E();
        }
    }

    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.F();
        }
    }

    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.f23156f = 0;
            b bVar = b.this;
            bVar.f23155e = -1;
            bVar.f23169s = false;
        }
    }

    class i implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f23182a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f23183b;

        i(int i10, boolean z10) {
            this.f23182a = i10;
            this.f23183b = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.F();
            try {
                b bVar = b.this;
                bVar.f23161k = this.f23182a;
                bVar.D(bVar.I(bVar.A(bVar.f23152b.a())));
                if (this.f23183b) {
                    b.this.E();
                }
            } catch (IOException e10) {
                e10.printStackTrace();
            }
        }
    }

    public interface j {
        void a(ByteBuffer byteBuffer);

        void b();

        void onEnd();
    }

    private enum k {
        IDLE,
        RUNNING,
        INITIALIZING,
        FINISHING
    }

    public b(InterfaceC3710b interfaceC3710b, j jVar) {
        HashSet hashSet = new HashSet();
        this.f23158h = hashSet;
        this.f23159i = new AtomicBoolean(true);
        this.f23160j = new a();
        this.f23161k = 1;
        this.f23162l = new HashSet();
        this.f23163m = new Object();
        this.f23164n = new WeakHashMap();
        this.f23167q = C();
        this.f23168r = null;
        this.f23169s = false;
        this.f23170t = k.IDLE;
        this.f23152b = interfaceC3710b;
        if (jVar != null) {
            hashSet.add(jVar);
        }
        int a10 = C3322a.b().a();
        this.f23151a = a10;
        this.f23153c = new Handler(C3322a.b().c(a10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D(Rect rect) {
        this.f23166p = rect;
        this.f23165o = ByteBuffer.allocate((((rect.width() * rect.height()) / (B() * B())) + 1) * 4);
        if (this.f23167q == null) {
            this.f23167q = C();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E() {
        this.f23159i.compareAndSet(true, false);
        long currentTimeMillis = System.currentTimeMillis();
        try {
            if (w() == 0) {
                try {
                    Reader reader = this.f23168r;
                    if (reader == null) {
                        this.f23168r = A(this.f23152b.a());
                    } else {
                        reader.reset();
                    }
                    D(I(this.f23168r));
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            String str = f23149u;
            Log.i(str, r() + " Set state to RUNNING,cost " + (System.currentTimeMillis() - currentTimeMillis));
            this.f23170t = k.RUNNING;
            if (z() != 0 && this.f23169s) {
                Log.i(str, r() + " No need to started");
                return;
            }
            this.f23155e = -1;
            this.f23153c.removeCallbacks(this.f23160j);
            this.f23160j.run();
            Iterator it = this.f23158h.iterator();
            while (it.hasNext()) {
                ((j) it.next()).b();
            }
        } catch (Throwable th2) {
            Log.i(f23149u, r() + " Set state to RUNNING,cost " + (System.currentTimeMillis() - currentTimeMillis));
            this.f23170t = k.RUNNING;
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F() {
        this.f23153c.removeCallbacks(this.f23160j);
        this.f23154d.clear();
        synchronized (this.f23163m) {
            try {
                for (Bitmap bitmap : this.f23162l) {
                    if (bitmap != null && !bitmap.isRecycled()) {
                        bitmap.recycle();
                    }
                }
                this.f23162l.clear();
            } finally {
            }
        }
        if (this.f23165o != null) {
            this.f23165o = null;
        }
        this.f23164n.clear();
        try {
            Reader reader = this.f23168r;
            if (reader != null) {
                reader.close();
                this.f23168r = null;
            }
            com.github.penfeizhou.animation.io.e eVar = this.f23167q;
            if (eVar != null) {
                eVar.close();
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        }
        K();
        this.f23170t = k.IDLE;
        Iterator it = this.f23158h.iterator();
        while (it.hasNext()) {
            ((j) it.next()).onEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long Q() {
        int i10 = this.f23155e + 1;
        this.f23155e = i10;
        if (i10 >= w()) {
            this.f23155e = 0;
            this.f23156f++;
        }
        com.github.penfeizhou.animation.decode.a u10 = u(this.f23155e);
        if (u10 == null) {
            return 0L;
        }
        M(u10);
        return u10.frameDuration;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean q() {
        if (!G() || w() == 0) {
            return false;
        }
        if (z() <= 0 || this.f23156f < z() - 1) {
            return true;
        }
        if (this.f23156f == z() - 1 && this.f23155e < w() - 1) {
            return true;
        }
        this.f23169s = true;
        return false;
    }

    private String r() {
        return BuildConfig.FLAVOR;
    }

    private int z() {
        Integer num = this.f23157g;
        return num != null ? num.intValue() : x();
    }

    protected abstract Reader A(Reader reader);

    public int B() {
        return this.f23161k;
    }

    protected abstract com.github.penfeizhou.animation.io.e C();

    public boolean G() {
        return this.f23170t == k.RUNNING || this.f23170t == k.INITIALIZING;
    }

    protected Bitmap H(int i10, int i11) {
        synchronized (this.f23163m) {
            try {
                Iterator it = this.f23162l.iterator();
                Bitmap bitmap = null;
                while (it.hasNext()) {
                    int i12 = i10 * i11 * 4;
                    Bitmap bitmap2 = (Bitmap) it.next();
                    if (bitmap2 != null && bitmap2.getAllocationByteCount() >= i12) {
                        it.remove();
                        if (bitmap2.getWidth() == i10) {
                            if (bitmap2.getHeight() != i11) {
                            }
                            bitmap2.eraseColor(0);
                            return bitmap2;
                        }
                        if (i10 > 0 && i11 > 0) {
                            bitmap2.reconfigure(i10, i11, Bitmap.Config.ARGB_8888);
                        }
                        bitmap2.eraseColor(0);
                        return bitmap2;
                    }
                    bitmap = bitmap2;
                }
                if (i10 <= 0 || i11 <= 0) {
                    return null;
                }
                try {
                    try {
                        bitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                } catch (OutOfMemoryError e11) {
                    e11.printStackTrace();
                }
                return bitmap;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected abstract Rect I(Reader reader);

    protected void J(Bitmap bitmap) {
        synchronized (this.f23163m) {
            if (bitmap != null) {
                try {
                    this.f23162l.add(bitmap);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    protected abstract void K();

    public void L(j jVar) {
        this.f23153c.post(new c(jVar));
    }

    protected abstract void M(com.github.penfeizhou.animation.decode.a aVar);

    public void N() {
        this.f23153c.post(new h());
    }

    public int O(int i10, int i11) {
        int t10 = t(i10, i11);
        if (t10 != B()) {
            boolean G10 = G();
            this.f23153c.removeCallbacks(this.f23160j);
            this.f23153c.post(new i(t10, G10));
        }
        return t10;
    }

    public void P() {
        if (this.f23166p == f23150v) {
            return;
        }
        if (this.f23170t != k.RUNNING) {
            k kVar = this.f23170t;
            k kVar2 = k.INITIALIZING;
            if (kVar != kVar2) {
                if (this.f23170t == k.FINISHING) {
                    Log.e(f23149u, r() + " Processing,wait for finish at " + this.f23170t);
                }
                this.f23170t = kVar2;
                if (Looper.myLooper() == this.f23153c.getLooper()) {
                    E();
                    return;
                } else {
                    this.f23153c.post(new f());
                    return;
                }
            }
        }
        Log.i(f23149u, r() + " Already started");
    }

    public void R() {
        if (this.f23166p == f23150v) {
            return;
        }
        k kVar = this.f23170t;
        k kVar2 = k.FINISHING;
        if (kVar == kVar2 || this.f23170t == k.IDLE) {
            Log.i(f23149u, r() + "No need to stop");
            return;
        }
        if (this.f23170t == k.INITIALIZING) {
            Log.e(f23149u, r() + "Processing,wait for finish at " + this.f23170t);
        }
        this.f23170t = kVar2;
        if (Looper.myLooper() == this.f23153c.getLooper()) {
            F();
        } else {
            this.f23153c.post(new g());
        }
    }

    public void S() {
        this.f23153c.post(new d());
    }

    public void p(j jVar) {
        this.f23153c.post(new RunnableC0392b(jVar));
    }

    public Rect s() {
        if (this.f23166p == null) {
            if (this.f23170t == k.FINISHING) {
                Log.e(f23149u, "In finishing,do not interrupt");
            }
            Thread currentThread = Thread.currentThread();
            this.f23153c.post(new e(currentThread));
            LockSupport.park(currentThread);
        }
        return this.f23166p == null ? f23150v : this.f23166p;
    }

    protected int t(int i10, int i11) {
        int i12 = 1;
        if (i10 != 0 && i11 != 0) {
            int min = Math.min(s().width() / i10, s().height() / i11);
            while (true) {
                int i13 = i12 * 2;
                if (i13 > min) {
                    break;
                }
                i12 = i13;
            }
        }
        return i12;
    }

    public com.github.penfeizhou.animation.decode.a u(int i10) {
        if (i10 < 0 || i10 >= this.f23154d.size()) {
            return null;
        }
        return (com.github.penfeizhou.animation.decode.a) this.f23154d.get(i10);
    }

    public Bitmap v(int i10) {
        if (this.f23170t != k.IDLE) {
            Log.e(f23149u, r() + ",stop first");
            return null;
        }
        this.f23170t = k.RUNNING;
        this.f23159i.compareAndSet(true, false);
        if (this.f23154d.size() == 0) {
            Reader reader = this.f23168r;
            if (reader == null) {
                this.f23168r = A(this.f23152b.a());
            } else {
                reader.reset();
            }
            D(I(this.f23168r));
        }
        if (i10 < 0) {
            i10 += this.f23154d.size();
        }
        int i11 = i10 >= 0 ? i10 : 0;
        this.f23155e = -1;
        while (this.f23155e < i11 && q()) {
            Q();
        }
        this.f23165o.rewind();
        Bitmap createBitmap = Bitmap.createBitmap(s().width() / B(), s().height() / B(), Bitmap.Config.ARGB_8888);
        createBitmap.copyPixelsFromBuffer(this.f23165o);
        F();
        return createBitmap;
    }

    public int w() {
        return this.f23154d.size();
    }

    protected abstract int x();

    public int y() {
        int i10;
        synchronized (this.f23163m) {
            try {
                i10 = 0;
                for (Bitmap bitmap : this.f23162l) {
                    if (!bitmap.isRecycled()) {
                        i10 += bitmap.getAllocationByteCount();
                    }
                }
                ByteBuffer byteBuffer = this.f23165o;
                if (byteBuffer != null) {
                    i10 += byteBuffer.capacity();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i10;
    }
}
