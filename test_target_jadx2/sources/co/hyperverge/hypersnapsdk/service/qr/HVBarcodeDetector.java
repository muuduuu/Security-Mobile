package co.hyperverge.hypersnapsdk.service.qr;

import E7.b;
import F7.a;
import F7.b;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import android.util.SparseArray;
import co.hyperverge.hypersnapsdk.utils.HVLogUtils;
import java.nio.ByteBuffer;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
public class HVBarcodeDetector {
    public static final String TAG = "co.hyperverge.hypersnapsdk.service.qr.HVBarcodeDetector";
    private b detector;

    public String detect(Bitmap bitmap) {
        HVLogUtils.d(TAG, "detect() called with: bitmap = [" + bitmap + "]");
        if (this.detector != null) {
            SparseArray a10 = this.detector.a(new b.a().b(bitmap).a());
            if (a10.size() != 0) {
                return ((a) a10.valueAt(0)).f2567b;
            }
        }
        return BuildConfig.FLAVOR;
    }

    public void initialiseHVBarcodeDetector(Context context, int i10) {
        if (context != null) {
            this.detector = new b.a(context).b(i10).a();
        } else {
            Log.e(TAG, "context is null");
        }
    }

    public String detect(byte[] bArr, int i10, int i11) {
        HVLogUtils.d(TAG, "detect() called with: frames = [" + bArr + "], width = [" + i10 + "], height = [" + i11 + "]");
        SparseArray a10 = this.detector.a(new b.a().c(ByteBuffer.wrap(bArr), i10, i11, 17).a());
        if (a10.size() != 0) {
            return ((a) a10.valueAt(0)).f2567b;
        }
        return BuildConfig.FLAVOR;
    }
}
