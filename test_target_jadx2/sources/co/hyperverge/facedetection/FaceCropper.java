package co.hyperverge.facedetection;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.util.Log;
import co.hyperverge.facedetection.FileUtils;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class FaceCropper {
    private static final String LOG_TAG = "co.hyperverge.facedetection.FaceCropper";
    private static final int MAX_FACE_DIM = 140;
    private static final boolean copyToExternal = false;

    public static String cropFaceAndStore(Context context, HVFace hVFace) {
        try {
            Bitmap croppedFaceFromBitmap = getCroppedFaceFromBitmap(processBitmapFromPath(hVFace.getFilePath()), hVFace);
            String saveCroppedBitmapToPhone = saveCroppedBitmapToPhone(context, hVFace.getFaceLabel() + ".jpg", croppedFaceFromBitmap);
            croppedFaceFromBitmap.recycle();
            return saveCroppedBitmapToPhone;
        } catch (NullPointerException e10) {
            Log.d(LOG_TAG, e10.getMessage());
            return null;
        }
    }

    private static Bitmap getCroppedFaceFromBitmap(Bitmap bitmap, HVFace hVFace) {
        try {
            JSONObject jSONObject = new JSONObject(hVFace.getFaceLocation());
            return Bitmap.createBitmap(bitmap, hVFace.getActualLeftTopX(jSONObject.getInt("ltx"), bitmap.getWidth()), hVFace.getActualLeftTopY(jSONObject.getInt("lty"), bitmap.getHeight()), hVFace.getActualWidth(jSONObject.getInt("width"), bitmap.getWidth()), hVFace.getActualHeight(jSONObject.getInt("height"), bitmap.getHeight()));
        } catch (Exception e10) {
            Log.d(LOG_TAG, e10.getMessage());
            return bitmap;
        }
    }

    private static Bitmap grayscaleBitmap(Bitmap bitmap) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        for (int i10 = 0; i10 < width; i10++) {
            for (int i11 = 0; i11 < height; i11++) {
                int alpha = Color.alpha(bitmap.getPixel(i10, i11));
                int red = (int) ((Color.red(r6) * 0.299d) + (Color.green(r6) * 0.587d) + (Color.blue(r6) * 0.114d));
                createBitmap.setPixel(i10, i11, Color.argb(alpha, red, red, red));
            }
        }
        return createBitmap;
    }

    private static Bitmap processBitmapFromPath(String str) {
        FileUtils.Dimensions bitmapDimension = FileUtils.getBitmapDimension(str);
        try {
            return FileUtils.decodeSampledBitmapFromFileForFace(str, bitmapDimension, FileUtils.getScaledDim(bitmapDimension, 512));
        } catch (Exception e10) {
            Log.d(LOG_TAG, e10.getMessage());
            return null;
        }
    }

    private static String saveCroppedBitmapToPhone(Context context, String str, Bitmap bitmap) {
        FileOutputStream fileOutputStream = null;
        try {
            try {
                try {
                    fileOutputStream = context.openFileOutput(str, 0);
                    float height = ((bitmap.getWidth() > bitmap.getHeight() ? bitmap.getHeight() : bitmap.getWidth()) * 1.0f) / 140.0f;
                    if (height > 1.0f) {
                        bitmap = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() / height), (int) (bitmap.getHeight() / height), true);
                    }
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 95, fileOutputStream);
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                } catch (Exception e10) {
                    Log.d(LOG_TAG, e10.getMessage());
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                }
            } catch (IOException e11) {
                Log.d(LOG_TAG, e11.getMessage());
            }
            return context.getFilesDir() + "/" + str;
        } catch (Throwable th) {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e12) {
                    Log.d(LOG_TAG, e12.getMessage());
                }
            }
            throw th;
        }
    }

    public static String cropFaceAndStore(Context context, HVFace hVFace, Bitmap bitmap) {
        try {
            Bitmap croppedFaceFromBitmap = getCroppedFaceFromBitmap(bitmap, hVFace);
            String saveCroppedBitmapToPhone = saveCroppedBitmapToPhone(context, hVFace.getFaceLabel() + ".jpg", croppedFaceFromBitmap);
            croppedFaceFromBitmap.recycle();
            return saveCroppedBitmapToPhone;
        } catch (NullPointerException e10) {
            Log.d(LOG_TAG, e10.getMessage());
            return null;
        }
    }
}
