package r2;

import android.graphics.Bitmap;
import java.io.IOException;
import java.io.InputStream;
import l2.InterfaceC3600b;
import l2.InterfaceC3602d;
import r2.t;

/* loaded from: classes.dex */
public class E implements i2.j {

    /* renamed from: a, reason: collision with root package name */
    private final t f39124a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3600b f39125b;

    static class a implements t.b {

        /* renamed from: a, reason: collision with root package name */
        private final C f39126a;

        /* renamed from: b, reason: collision with root package name */
        private final D2.d f39127b;

        a(C c10, D2.d dVar) {
            this.f39126a = c10;
            this.f39127b = dVar;
        }

        @Override // r2.t.b
        public void a() {
            this.f39126a.b();
        }

        @Override // r2.t.b
        public void b(InterfaceC3602d interfaceC3602d, Bitmap bitmap) {
            IOException a10 = this.f39127b.a();
            if (a10 != null) {
                if (bitmap == null) {
                    throw a10;
                }
                interfaceC3602d.c(bitmap);
                throw a10;
            }
        }
    }

    public E(t tVar, InterfaceC3600b interfaceC3600b) {
        this.f39124a = tVar;
        this.f39125b = interfaceC3600b;
    }

    @Override // i2.j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public k2.v b(InputStream inputStream, int i10, int i11, i2.h hVar) {
        boolean z10;
        C c10;
        if (inputStream instanceof C) {
            c10 = (C) inputStream;
            z10 = false;
        } else {
            z10 = true;
            c10 = new C(inputStream, this.f39125b);
        }
        D2.d b10 = D2.d.b(c10);
        try {
            return this.f39124a.e(new D2.i(b10), i10, i11, hVar, new a(c10, b10));
        } finally {
            b10.c();
            if (z10) {
                c10.c();
            }
        }
    }

    @Override // i2.j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(InputStream inputStream, i2.h hVar) {
        return this.f39124a.p(inputStream);
    }
}
