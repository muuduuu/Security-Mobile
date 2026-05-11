package co.hyperverge.facedetection;

import android.graphics.Bitmap;
import android.util.Log;
import co.hyperverge.facedetection.FileUtils;
import org.conscrypt.PSKKeyManager;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class DetectorUtils {
    private static final String TAG = "co.hyperverge.facedetection.DetectorUtils";

    public static JSONObject performFaceCalculations(float f10, float f11, float f12, float f13, float f14, float f15) {
        JSONObject jSONObject = new JSONObject();
        float f16 = f10 / f14;
        float f17 = f11 / f15;
        float f18 = f12 / f14;
        float f19 = f13 / f15;
        if (f16 < 0.0f) {
            f16 = 0.0f;
        }
        if (f17 < 0.0f) {
            f17 = 0.0f;
        }
        if (f18 + f16 > 1.0f) {
            f18 = 1.0f - f16;
        }
        if (f19 + f17 > 1.0f) {
            f19 = 1.0f - f17;
        }
        try {
            jSONObject.put("ltx", f16);
            jSONObject.put("lty", f17);
            jSONObject.put("rbx", f16 + f18);
            jSONObject.put("rby", f17 + f19);
        } catch (JSONException e10) {
            Log.d(TAG, e10.getMessage());
        }
        return jSONObject;
    }

    public static Bitmap processBitmapFromPath(String str) {
        FileUtils.Dimensions bitmapDimension = FileUtils.getBitmapDimension(str);
        try {
            return FileUtils.decodeSampledBitmapFromFileForFace(str, bitmapDimension, FileUtils.getScaledDim(bitmapDimension, PSKKeyManager.MAX_KEY_LENGTH_BYTES));
        } catch (Exception e10) {
            Log.d(TAG, e10.getMessage());
            return null;
        }
    }
}
