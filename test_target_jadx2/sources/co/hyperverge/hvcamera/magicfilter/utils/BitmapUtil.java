package co.hyperverge.hvcamera.magicfilter.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import co.hyperverge.hvcamera.HVLog;
import java.io.ByteArrayOutputStream;

/* loaded from: classes.dex */
public class BitmapUtil {
    private static final String TAG = "BitmapUtil";

    public static byte[] createByteArrayForFrame(byte[] bArr, int i10, int i11, int i12) {
        HVLog.d(TAG, "createByteArrayForFrame() called with: data = [" + bArr + "], finalHeight = [" + i10 + "], finalWidth = [" + i11 + "], mRotation = [" + i12 + "]");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (i12 != 90 && i12 != 270) {
            i11 = i10;
            i10 = i11;
        }
        int i13 = i10;
        int i14 = i11;
        new YuvImage(bArr, 17, i13, i14, null).compressToJpeg(new Rect(0, 0, i10, i11), 90, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        Matrix matrix = new Matrix();
        matrix.postRotate(i12);
        Bitmap createBitmap = Bitmap.createBitmap(decodeByteArray, 0, 0, i13, i14, matrix, false);
        createBitmap.compress(Bitmap.CompressFormat.JPEG, 90, byteArrayOutputStream2);
        createBitmap.recycle();
        return byteArrayOutputStream2.toByteArray();
    }
}
