package l2;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class k implements InterfaceC3602d {

    /* renamed from: k, reason: collision with root package name */
    private static final Bitmap.Config f37029k = Bitmap.Config.ARGB_8888;

    /* renamed from: a, reason: collision with root package name */
    private final l f37030a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f37031b;

    /* renamed from: c, reason: collision with root package name */
    private final long f37032c;

    /* renamed from: d, reason: collision with root package name */
    private final a f37033d;

    /* renamed from: e, reason: collision with root package name */
    private long f37034e;

    /* renamed from: f, reason: collision with root package name */
    private long f37035f;

    /* renamed from: g, reason: collision with root package name */
    private int f37036g;

    /* renamed from: h, reason: collision with root package name */
    private int f37037h;

    /* renamed from: i, reason: collision with root package name */
    private int f37038i;

    /* renamed from: j, reason: collision with root package name */
    private int f37039j;

    private interface a {
        void a(Bitmap bitmap);

        void b(Bitmap bitmap);
    }

    k(long j10, l lVar, Set set) {
        this.f37032c = j10;
        this.f37034e = j10;
        this.f37030a = lVar;
        this.f37031b = set;
        this.f37033d = new b();
    }

    private static void f(Bitmap.Config config) {
        Bitmap.Config config2;
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        config2 = Bitmap.Config.HARDWARE;
        if (config != config2) {
            return;
        }
        throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
    }

    private static Bitmap g(int i10, int i11, Bitmap.Config config) {
        if (config == null) {
            config = f37029k;
        }
        return Bitmap.createBitmap(i10, i11, config);
    }

    private void h() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            i();
        }
    }

    private void i() {
        Log.v("LruBitmapPool", "Hits=" + this.f37036g + ", misses=" + this.f37037h + ", puts=" + this.f37038i + ", evictions=" + this.f37039j + ", currentSize=" + this.f37035f + ", maxSize=" + this.f37034e + "\nStrategy=" + this.f37030a);
    }

    private void j() {
        q(this.f37034e);
    }

    private static Set k() {
        Bitmap.Config config;
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i10 = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i10 >= 26) {
            config = Bitmap.Config.HARDWARE;
            hashSet.remove(config);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    private static l l() {
        return new n();
    }

    private synchronized Bitmap m(int i10, int i11, Bitmap.Config config) {
        Bitmap d10;
        try {
            f(config);
            d10 = this.f37030a.d(i10, i11, config != null ? config : f37029k);
            if (d10 == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    Log.d("LruBitmapPool", "Missing bitmap=" + this.f37030a.a(i10, i11, config));
                }
                this.f37037h++;
            } else {
                this.f37036g++;
                this.f37035f -= this.f37030a.b(d10);
                this.f37033d.a(d10);
                p(d10);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Get bitmap=" + this.f37030a.a(i10, i11, config));
            }
            h();
        } catch (Throwable th) {
            throw th;
        }
        return d10;
    }

    private static void o(Bitmap bitmap) {
        bitmap.setPremultiplied(true);
    }

    private static void p(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        o(bitmap);
    }

    private synchronized void q(long j10) {
        while (this.f37035f > j10) {
            try {
                Bitmap removeLast = this.f37030a.removeLast();
                if (removeLast == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        i();
                    }
                    this.f37035f = 0L;
                    return;
                }
                this.f37033d.a(removeLast);
                this.f37035f -= this.f37030a.b(removeLast);
                this.f37039j++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    Log.d("LruBitmapPool", "Evicting bitmap=" + this.f37030a.e(removeLast));
                }
                h();
                removeLast.recycle();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // l2.InterfaceC3602d
    public void a(int i10) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i10);
        }
        if (i10 >= 40 || i10 >= 20) {
            b();
        } else if (i10 >= 20 || i10 == 15) {
            q(n() / 2);
        }
    }

    @Override // l2.InterfaceC3602d
    public void b() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        q(0L);
    }

    @Override // l2.InterfaceC3602d
    public synchronized void c(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable() && this.f37030a.b(bitmap) <= this.f37034e && this.f37031b.contains(bitmap.getConfig())) {
                int b10 = this.f37030a.b(bitmap);
                this.f37030a.c(bitmap);
                this.f37033d.b(bitmap);
                this.f37038i++;
                this.f37035f += b10;
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    Log.v("LruBitmapPool", "Put bitmap in pool=" + this.f37030a.e(bitmap));
                }
                h();
                j();
                return;
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + this.f37030a.e(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f37031b.contains(bitmap.getConfig()));
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // l2.InterfaceC3602d
    public Bitmap d(int i10, int i11, Bitmap.Config config) {
        Bitmap m10 = m(i10, i11, config);
        if (m10 == null) {
            return g(i10, i11, config);
        }
        m10.eraseColor(0);
        return m10;
    }

    @Override // l2.InterfaceC3602d
    public Bitmap e(int i10, int i11, Bitmap.Config config) {
        Bitmap m10 = m(i10, i11, config);
        return m10 == null ? g(i10, i11, config) : m10;
    }

    public long n() {
        return this.f37034e;
    }

    public k(long j10) {
        this(j10, l(), k());
    }

    private static final class b implements a {
        b() {
        }

        @Override // l2.k.a
        public void a(Bitmap bitmap) {
        }

        @Override // l2.k.a
        public void b(Bitmap bitmap) {
        }
    }
}
