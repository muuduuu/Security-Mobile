package p6;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import java.io.IOException;
import q6.C3923a;
import q6.C3924b;

/* renamed from: p6.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3800d extends com.github.penfeizhou.animation.decode.a {

    /* renamed from: f, reason: collision with root package name */
    private static final PorterDuffXfermode f38340f = new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER);

    /* renamed from: g, reason: collision with root package name */
    private static final PorterDuffXfermode f38341g = new PorterDuffXfermode(PorterDuff.Mode.SRC);

    /* renamed from: a, reason: collision with root package name */
    final int f38342a;

    /* renamed from: b, reason: collision with root package name */
    final int f38343b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f38344c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f38345d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f38346e;

    public C3800d(C3923a c3923a, C3799c c3799c) {
        super(c3923a);
        this.frameWidth = c3799c.f38333f;
        this.frameHeight = c3799c.f38334g;
        this.frameX = c3799c.f38331d;
        this.frameY = c3799c.f38332e;
        int i10 = c3799c.f38335h;
        this.frameDuration = i10;
        if (i10 == 0) {
            this.frameDuration = 100;
        }
        this.f38344c = c3799c.d();
        this.f38345d = c3799c.e();
        this.f38342a = c3799c.f38349c + 24;
        int i11 = c3799c.f38348b;
        this.f38343b = (i11 - 16) + (i11 & 1);
        this.f38346e = c3799c.f38337j != null;
    }

    private int b(C3924b c3924b) {
        int i10 = 30 + this.f38343b;
        c3924b.d(i10);
        c3924b.h("RIFF");
        c3924b.j(i10);
        c3924b.h("WEBP");
        c3924b.j(k.f38354g);
        c3924b.j(10);
        c3924b.b((byte) (this.f38346e ? 16 : 0));
        c3924b.i(0);
        c3924b.g(this.frameWidth);
        c3924b.g(this.frameHeight);
        try {
            ((C3923a) this.reader).reset();
            ((C3923a) this.reader).skip(this.f38342a);
            ((C3923a) this.reader).read(c3924b.f(), c3924b.a(), this.f38343b);
        } catch (IOException e10) {
            e10.printStackTrace();
        }
        return i10;
    }

    @Override // com.github.penfeizhou.animation.decode.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Bitmap draw(Canvas canvas, Paint paint, int i10, Bitmap bitmap, C3924b c3924b) {
        Bitmap decodeByteArray;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = false;
        options.inSampleSize = i10;
        options.inMutable = true;
        options.inBitmap = bitmap;
        int b10 = b(c3924b);
        byte[] f10 = c3924b.f();
        try {
            decodeByteArray = BitmapFactory.decodeByteArray(f10, 0, b10, options);
        } catch (IllegalArgumentException unused) {
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            options2.inJustDecodeBounds = false;
            options2.inSampleSize = i10;
            options2.inMutable = true;
            decodeByteArray = BitmapFactory.decodeByteArray(f10, 0, b10, options2);
        }
        if (decodeByteArray == null) {
            return bitmap;
        }
        if (this.f38344c) {
            paint.setXfermode(f38341g);
        } else {
            paint.setXfermode(f38340f);
        }
        Rect rect = this.srcRect;
        rect.left = 0;
        rect.top = 0;
        rect.right = decodeByteArray.getWidth();
        this.srcRect.bottom = decodeByteArray.getHeight();
        Rect rect2 = this.dstRect;
        int i11 = this.frameX;
        float f11 = i10;
        rect2.left = (int) ((i11 * 2.0f) / f11);
        rect2.top = (int) ((this.frameY * 2.0f) / f11);
        rect2.right = (int) (((i11 * 2.0f) / f11) + decodeByteArray.getWidth());
        this.dstRect.bottom = (int) (((this.frameY * 2.0f) / f11) + decodeByteArray.getHeight());
        canvas.drawBitmap(decodeByteArray, this.srcRect, this.dstRect, paint);
        return decodeByteArray;
    }
}
