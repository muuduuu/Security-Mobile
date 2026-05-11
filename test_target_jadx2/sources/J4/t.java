package j4;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public class t implements i {

    /* renamed from: a, reason: collision with root package name */
    protected final InterfaceC3487A f35827a = new j();

    /* renamed from: b, reason: collision with root package name */
    private final int f35828b;

    /* renamed from: c, reason: collision with root package name */
    private int f35829c;

    /* renamed from: d, reason: collision with root package name */
    private final G f35830d;

    /* renamed from: e, reason: collision with root package name */
    private int f35831e;

    public t(int i10, int i11, G g10, e3.d dVar) {
        this.f35828b = i10;
        this.f35829c = i11;
        this.f35830d = g10;
        if (dVar != null) {
            dVar.a(this);
        }
    }

    private Bitmap h(int i10) {
        this.f35830d.a(i10);
        return Bitmap.createBitmap(1, i10, Bitmap.Config.ALPHA_8);
    }

    private synchronized void k(int i10) {
        Bitmap bitmap;
        while (this.f35831e > i10 && (bitmap = (Bitmap) this.f35827a.b()) != null) {
            int a10 = this.f35827a.a(bitmap);
            this.f35831e -= a10;
            this.f35830d.e(a10);
        }
    }

    @Override // e3.f
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public synchronized Bitmap get(int i10) {
        try {
            int i11 = this.f35831e;
            int i12 = this.f35828b;
            if (i11 > i12) {
                k(i12);
            }
            Bitmap bitmap = (Bitmap) this.f35827a.get(i10);
            if (bitmap == null) {
                return h(i10);
            }
            int a10 = this.f35827a.a(bitmap);
            this.f35831e -= a10;
            this.f35830d.b(a10);
            return bitmap;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // e3.f, f3.h
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public void a(Bitmap bitmap) {
        int a10 = this.f35827a.a(bitmap);
        if (a10 <= this.f35829c) {
            this.f35830d.g(a10);
            this.f35827a.put(bitmap);
            synchronized (this) {
                this.f35831e += a10;
            }
        }
    }
}
