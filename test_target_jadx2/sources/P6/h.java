package p6;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.io.IOException;
import q6.C3923a;
import q6.C3924b;

/* loaded from: classes2.dex */
public class h extends com.github.penfeizhou.animation.decode.a {
    public h(C3923a c3923a, int i10, int i11) {
        super(c3923a);
        this.frameWidth = i10;
        this.frameHeight = i11;
    }

    @Override // com.github.penfeizhou.animation.decode.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Bitmap draw(Canvas canvas, Paint paint, int i10, Bitmap bitmap, C3924b c3924b) {
        Bitmap decodeStream;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = false;
        options.inSampleSize = i10;
        options.inMutable = true;
        options.inBitmap = bitmap;
        Bitmap bitmap2 = null;
        try {
            try {
                decodeStream = BitmapFactory.decodeStream(((C3923a) this.reader).toInputStream(), null, options);
            } catch (IllegalArgumentException e10) {
                e10.printStackTrace();
                BitmapFactory.Options options2 = new BitmapFactory.Options();
                options2.inJustDecodeBounds = false;
                options2.inSampleSize = i10;
                options2.inMutable = true;
                decodeStream = BitmapFactory.decodeStream(((C3923a) this.reader).toInputStream(), null, options2);
            }
            try {
                paint.setXfermode(null);
                canvas.drawBitmap(decodeStream, 0.0f, 0.0f, paint);
                return decodeStream;
            } catch (IOException e11) {
                e = e11;
                bitmap2 = decodeStream;
                e.printStackTrace();
                return bitmap2;
            }
        } catch (IOException e12) {
            e = e12;
            e.printStackTrace();
            return bitmap2;
        }
    }
}
