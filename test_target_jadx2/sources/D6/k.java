package d6;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import e6.C3087a;
import e6.C3088b;
import java.io.IOException;

/* loaded from: classes2.dex */
public class k extends com.github.penfeizhou.animation.decode.a {
    public k(C3087a c3087a) {
        super(c3087a);
    }

    @Override // com.github.penfeizhou.animation.decode.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Bitmap draw(Canvas canvas, Paint paint, int i10, Bitmap bitmap, C3088b c3088b) {
        Bitmap decodeStream;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = false;
        options.inSampleSize = i10;
        options.inMutable = true;
        options.inBitmap = bitmap;
        Bitmap bitmap2 = null;
        try {
            ((C3087a) this.reader).reset();
            try {
                decodeStream = BitmapFactory.decodeStream(((C3087a) this.reader).toInputStream(), null, options);
            } catch (IllegalArgumentException unused) {
                BitmapFactory.Options options2 = new BitmapFactory.Options();
                options2.inJustDecodeBounds = false;
                options2.inSampleSize = i10;
                options2.inMutable = true;
                decodeStream = BitmapFactory.decodeStream(((C3087a) this.reader).toInputStream(), null, options2);
            }
            try {
                paint.setXfermode(null);
                canvas.drawBitmap(decodeStream, 0.0f, 0.0f, paint);
                return decodeStream;
            } catch (IOException e10) {
                e = e10;
                bitmap2 = decodeStream;
                e.printStackTrace();
                return bitmap2;
            }
        } catch (IOException e11) {
            e = e11;
        }
    }
}
