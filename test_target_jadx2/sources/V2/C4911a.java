package v2;

import D2.l;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import f2.C3139c;
import f2.C3140d;
import f2.C3141e;
import f2.InterfaceC3137a;
import i2.EnumC3314b;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;
import l2.InterfaceC3600b;
import l2.InterfaceC3602d;
import q2.C3917n;

/* renamed from: v2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4911a implements i2.j {

    /* renamed from: f, reason: collision with root package name */
    private static final C0629a f43811f = new C0629a();

    /* renamed from: g, reason: collision with root package name */
    private static final b f43812g = new b();

    /* renamed from: a, reason: collision with root package name */
    private final Context f43813a;

    /* renamed from: b, reason: collision with root package name */
    private final List f43814b;

    /* renamed from: c, reason: collision with root package name */
    private final b f43815c;

    /* renamed from: d, reason: collision with root package name */
    private final C0629a f43816d;

    /* renamed from: e, reason: collision with root package name */
    private final C4912b f43817e;

    /* renamed from: v2.a$a, reason: collision with other inner class name */
    static class C0629a {
        C0629a() {
        }

        InterfaceC3137a a(InterfaceC3137a.InterfaceC0480a interfaceC0480a, C3139c c3139c, ByteBuffer byteBuffer, int i10) {
            return new C3141e(interfaceC0480a, c3139c, byteBuffer, i10);
        }
    }

    /* renamed from: v2.a$b */
    static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Queue f43818a = l.g(0);

        b() {
        }

        synchronized C3140d a(ByteBuffer byteBuffer) {
            C3140d c3140d;
            try {
                c3140d = (C3140d) this.f43818a.poll();
                if (c3140d == null) {
                    c3140d = new C3140d();
                }
            } catch (Throwable th) {
                throw th;
            }
            return c3140d.p(byteBuffer);
        }

        synchronized void b(C3140d c3140d) {
            c3140d.a();
            this.f43818a.offer(c3140d);
        }
    }

    public C4911a(Context context, List list, InterfaceC3602d interfaceC3602d, InterfaceC3600b interfaceC3600b) {
        this(context, list, interfaceC3602d, interfaceC3600b, f43812g, f43811f);
    }

    private C4915e c(ByteBuffer byteBuffer, int i10, int i11, C3140d c3140d, i2.h hVar) {
        long b10 = D2.g.b();
        try {
            C3139c c10 = c3140d.c();
            if (c10.b() > 0 && c10.c() == 0) {
                Bitmap.Config config = hVar.c(AbstractC4919i.f43858a) == EnumC3314b.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                InterfaceC3137a a10 = this.f43816d.a(this.f43817e, c10, byteBuffer, e(c10, i10, i11));
                a10.e(config);
                a10.c();
                Bitmap b11 = a10.b();
                if (b11 == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        Log.v("BufferGifDecoder", "Decoded GIF from stream in " + D2.g.a(b10));
                    }
                    return null;
                }
                C4915e c4915e = new C4915e(new C4913c(this.f43813a, a10, C3917n.c(), i10, i11, b11));
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    Log.v("BufferGifDecoder", "Decoded GIF from stream in " + D2.g.a(b10));
                }
                return c4915e;
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + D2.g.a(b10));
            }
        }
    }

    private static int e(C3139c c3139c, int i10, int i11) {
        int min = Math.min(c3139c.a() / i11, c3139c.d() / i10);
        int max = Math.max(1, min == 0 ? 0 : Integer.highestOneBit(min));
        if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
            Log.v("BufferGifDecoder", "Downsampling GIF, sampleSize: " + max + ", target dimens: [" + i10 + "x" + i11 + "], actual dimens: [" + c3139c.d() + "x" + c3139c.a() + "]");
        }
        return max;
    }

    @Override // i2.j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public C4915e b(ByteBuffer byteBuffer, int i10, int i11, i2.h hVar) {
        C3140d a10 = this.f43815c.a(byteBuffer);
        try {
            return c(byteBuffer, i10, i11, a10, hVar);
        } finally {
            this.f43815c.b(a10);
        }
    }

    @Override // i2.j
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean a(ByteBuffer byteBuffer, i2.h hVar) {
        return !((Boolean) hVar.c(AbstractC4919i.f43859b)).booleanValue() && com.bumptech.glide.load.a.g(this.f43814b, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }

    C4911a(Context context, List list, InterfaceC3602d interfaceC3602d, InterfaceC3600b interfaceC3600b, b bVar, C0629a c0629a) {
        this.f43813a = context.getApplicationContext();
        this.f43814b = list;
        this.f43816d = c0629a;
        this.f43817e = new C4912b(interfaceC3602d, interfaceC3600b);
        this.f43815c = bVar;
    }
}
