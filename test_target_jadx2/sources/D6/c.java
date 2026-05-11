package d6;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import e6.C3087a;
import e6.C3088b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.CRC32;

/* loaded from: classes2.dex */
public class c extends com.github.penfeizhou.animation.decode.a {

    /* renamed from: f, reason: collision with root package name */
    private static final byte[] f31245f = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* renamed from: g, reason: collision with root package name */
    private static final byte[] f31246g = {0, 0, 0, 0, 73, 69, 78, 68, -82, 66, 96, -126};

    /* renamed from: h, reason: collision with root package name */
    private static final ThreadLocal f31247h = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final byte f31248a;

    /* renamed from: b, reason: collision with root package name */
    public final byte f31249b;

    /* renamed from: c, reason: collision with root package name */
    byte[] f31250c;

    /* renamed from: d, reason: collision with root package name */
    List f31251d;

    /* renamed from: e, reason: collision with root package name */
    List f31252e;

    public c(C3087a c3087a, f fVar) {
        super(c3087a);
        this.f31251d = new ArrayList();
        this.f31252e = new ArrayList();
        this.f31248a = fVar.f31266m;
        this.f31249b = fVar.f31265l;
        int i10 = fVar.f31263j * 1000;
        short s10 = fVar.f31264k;
        int i11 = i10 / (s10 == 0 ? (short) 100 : s10);
        this.frameDuration = i11;
        if (i11 < 10) {
            this.frameDuration = 100;
        }
        this.frameWidth = fVar.f31259f;
        this.frameHeight = fVar.f31260g;
        this.frameX = fVar.f31261h;
        this.frameY = fVar.f31262i;
    }

    private int b(C3088b c3088b) {
        int i10;
        Iterator it = this.f31252e.iterator();
        int i11 = 33;
        while (it.hasNext()) {
            i11 += ((e) it.next()).f31253a + 12;
        }
        for (e eVar : this.f31251d) {
            if (eVar instanceof h) {
                i10 = eVar.f31253a + 12;
            } else if (eVar instanceof g) {
                i10 = eVar.f31253a + 8;
            }
            i11 += i10;
        }
        int length = i11 + f31246g.length;
        c3088b.d(length);
        c3088b.c(f31245f);
        c3088b.h(13);
        int a10 = c3088b.a();
        c3088b.g(j.f31271h);
        c3088b.h(this.frameWidth);
        c3088b.h(this.frameHeight);
        c3088b.c(this.f31250c);
        CRC32 c10 = c();
        c10.reset();
        c10.update(c3088b.f(), a10, 17);
        c3088b.h((int) c10.getValue());
        for (e eVar2 : this.f31252e) {
            if (!(eVar2 instanceof i)) {
                ((C3087a) this.reader).reset();
                ((C3087a) this.reader).skip(eVar2.f31256d);
                ((C3087a) this.reader).read(c3088b.f(), c3088b.a(), eVar2.f31253a + 12);
                c3088b.e(eVar2.f31253a + 12);
            }
        }
        for (e eVar3 : this.f31251d) {
            if (eVar3 instanceof h) {
                ((C3087a) this.reader).reset();
                ((C3087a) this.reader).skip(eVar3.f31256d);
                ((C3087a) this.reader).read(c3088b.f(), c3088b.a(), eVar3.f31253a + 12);
                c3088b.e(eVar3.f31253a + 12);
            } else if (eVar3 instanceof g) {
                c3088b.h(eVar3.f31253a - 4);
                int a11 = c3088b.a();
                c3088b.g(h.f31269e);
                ((C3087a) this.reader).reset();
                ((C3087a) this.reader).skip(eVar3.f31256d + 12);
                ((C3087a) this.reader).read(c3088b.f(), c3088b.a(), eVar3.f31253a - 4);
                c3088b.e(eVar3.f31253a - 4);
                c10.reset();
                c10.update(c3088b.f(), a11, eVar3.f31253a);
                c3088b.h((int) c10.getValue());
            }
        }
        c3088b.c(f31246g);
        return length;
    }

    private CRC32 c() {
        ThreadLocal threadLocal = f31247h;
        CRC32 crc32 = (CRC32) threadLocal.get();
        if (crc32 != null) {
            return crc32;
        }
        CRC32 crc322 = new CRC32();
        threadLocal.set(crc322);
        return crc322;
    }

    @Override // com.github.penfeizhou.animation.decode.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Bitmap draw(Canvas canvas, Paint paint, int i10, Bitmap bitmap, C3088b c3088b) {
        Bitmap decodeByteArray;
        try {
            int b10 = b(c3088b);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = false;
            options.inSampleSize = i10;
            options.inMutable = true;
            options.inBitmap = bitmap;
            byte[] f10 = c3088b.f();
            try {
                decodeByteArray = BitmapFactory.decodeByteArray(f10, 0, b10, options);
            } catch (IllegalArgumentException unused) {
                BitmapFactory.Options options2 = new BitmapFactory.Options();
                options2.inJustDecodeBounds = false;
                options2.inSampleSize = i10;
                options2.inMutable = true;
                decodeByteArray = BitmapFactory.decodeByteArray(f10, 0, b10, options2);
            }
            Rect rect = this.srcRect;
            rect.left = 0;
            rect.top = 0;
            rect.right = decodeByteArray.getWidth();
            this.srcRect.bottom = decodeByteArray.getHeight();
            Rect rect2 = this.dstRect;
            int i11 = this.frameX;
            float f11 = i10;
            rect2.left = (int) (i11 / f11);
            rect2.top = (int) (this.frameY / f11);
            rect2.right = (int) ((i11 / f11) + decodeByteArray.getWidth());
            this.dstRect.bottom = (int) ((this.frameY / f11) + decodeByteArray.getHeight());
            canvas.drawBitmap(decodeByteArray, this.srcRect, this.dstRect, paint);
            return decodeByteArray;
        } catch (IOException e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
