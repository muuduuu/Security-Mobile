package j4;

import android.graphics.Bitmap;
import q4.C3919a;

/* renamed from: j4.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3499g {

    /* renamed from: a, reason: collision with root package name */
    private int f35799a;

    /* renamed from: b, reason: collision with root package name */
    private long f35800b;

    /* renamed from: c, reason: collision with root package name */
    private final int f35801c;

    /* renamed from: d, reason: collision with root package name */
    private final int f35802d;

    /* renamed from: e, reason: collision with root package name */
    private final f3.h f35803e;

    /* renamed from: j4.g$a */
    class a implements f3.h {
        a() {
        }

        @Override // f3.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Bitmap bitmap) {
            try {
                C3499g.this.a(bitmap);
            } finally {
                bitmap.recycle();
            }
        }
    }

    public C3499g(int i10, int i11) {
        b3.l.b(Boolean.valueOf(i10 > 0));
        b3.l.b(Boolean.valueOf(i11 > 0));
        this.f35801c = i10;
        this.f35802d = i11;
        this.f35803e = new a();
    }

    public synchronized void a(Bitmap bitmap) {
        int g10 = C3919a.g(bitmap);
        b3.l.c(this.f35799a > 0, "No bitmaps registered.");
        long j10 = g10;
        b3.l.d(j10 <= this.f35800b, "Bitmap size bigger than the total registered size: %d, %d", Integer.valueOf(g10), Long.valueOf(this.f35800b));
        this.f35800b -= j10;
        this.f35799a--;
    }

    public synchronized int b() {
        return this.f35799a;
    }

    public synchronized int c() {
        return this.f35801c;
    }

    public synchronized int d() {
        return this.f35802d;
    }

    public f3.h e() {
        return this.f35803e;
    }

    public synchronized long f() {
        return this.f35800b;
    }

    public synchronized boolean g(Bitmap bitmap) {
        int g10 = C3919a.g(bitmap);
        int i10 = this.f35799a;
        if (i10 < this.f35801c) {
            long j10 = this.f35800b;
            long j11 = g10;
            if (j10 + j11 <= this.f35802d) {
                this.f35799a = i10 + 1;
                this.f35800b = j10 + j11;
                return true;
            }
        }
        return false;
    }
}
