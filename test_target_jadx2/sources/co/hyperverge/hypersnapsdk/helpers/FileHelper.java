package co.hyperverge.hypersnapsdk.helpers;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.util.Log;
import co.hyperverge.facedetection.FaceDetectorApi;
import co.hyperverge.hypersnapsdk.model.HVFaceObj;
import co.hyperverge.hypersnapsdk.objects.HVFaceConfig;
import co.hyperverge.hypersnapsdk.utils.HVLogUtils;
import co.hyperverge.hypersnapsdk.utils.Utils;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class FileHelper {
    private static final String TAG = "co.hyperverge.hypersnapsdk.helpers.FileHelper";

    public static class Dimensions {
        public int height;
        public int width;

        public Dimensions(int i10, int i11) {
            this.width = i10;
            this.height = i11;
        }

        public int getHeight() {
            return this.height;
        }

        public JSONObject getInvertedJSON() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", this.height);
            jSONObject.put("height", this.width);
            return jSONObject;
        }

        public JSONObject getJSON() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", this.width);
            jSONObject.put("height", this.height);
            return jSONObject;
        }

        public int getWidth() {
            return this.width;
        }

        public String toString() {
            return this.width + " X " + this.height;
        }
    }

    public static int calculateInSampleSize(Dimensions dimensions, Dimensions dimensions2) {
        HVLogUtils.d(TAG, "calculateInSampleSize() called with: original = [" + dimensions + "], scaled = [" + dimensions2 + "]");
        int i10 = dimensions.height;
        int i11 = dimensions.width;
        int i12 = 1;
        if (i10 > dimensions2.height || i11 > dimensions2.width) {
            int i13 = i10 / 2;
            int i14 = i11 / 2;
            while (i13 / i12 > dimensions2.height && i14 / i12 > dimensions2.width) {
                i12 *= 2;
            }
        }
        return i12;
    }

    public static Dimensions compressFile(Context context, String str, String str2, int i10, int i11, int i12) {
        Dimensions bitmapDimension = getBitmapDimension(str);
        Dimensions scaledDim = getScaledDim(bitmapDimension, i10);
        try {
            Bitmap decodeSampledBitmapFromFile = decodeSampledBitmapFromFile(str, bitmapDimension, scaledDim);
            if (decodeSampledBitmapFromFile == null) {
                return null;
            }
            try {
                if (scaledDim.width < decodeSampledBitmapFromFile.getWidth()) {
                    decodeSampledBitmapFromFile = Bitmap.createScaledBitmap(decodeSampledBitmapFromFile, scaledDim.width, scaledDim.height, true);
                }
                ExifInterface exifInterface = new ExifInterface(str);
                Bitmap fixRotation = fixRotation(decodeSampledBitmapFromFile, exifInterface.getAttributeInt("Orientation", 0));
                if (fixRotation == null) {
                    return null;
                }
                scaledDim.width = fixRotation.getWidth();
                scaledDim.height = fixRotation.getHeight();
                FileOutputStream fileOutputStream = new FileOutputStream(str2);
                fixRotation.compress(Bitmap.CompressFormat.JPEG, i11, fileOutputStream);
                fixRotation.recycle();
                fileOutputStream.close();
                fileOutputStream.flush();
                ExifInterface exifInterface2 = new ExifInterface(str2);
                copyExifTag(exifInterface, exifInterface2, "DateTime");
                copyExifTag(exifInterface, exifInterface2, "GPSLatitude");
                copyExifTag(exifInterface, exifInterface2, "GPSLatitudeRef");
                copyExifTag(exifInterface, exifInterface2, "GPSLongitude");
                copyExifTag(exifInterface, exifInterface2, "GPSLongitudeRef");
                exifInterface2.saveAttributes();
                return scaledDim;
            } catch (Throwable th) {
                Log.e(TAG, Utils.getErrorMessage(th));
                if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                    SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(th);
                }
                return null;
            }
        } catch (Throwable th2) {
            Log.e(TAG, Utils.getErrorMessage(th2));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(th2);
            }
            return null;
        }
    }

    public static Dimensions compressToFile(Context context, String str, String str2, int i10, int i11, int i12) {
        Dimensions bitmapDimension = getBitmapDimension(str);
        Dimensions scaledDim = getScaledDim(bitmapDimension, i10);
        try {
            Bitmap decodeSampledBitmapFromFile = decodeSampledBitmapFromFile(str, bitmapDimension, scaledDim);
            if (decodeSampledBitmapFromFile == null) {
                return null;
            }
            try {
                if (scaledDim.width < decodeSampledBitmapFromFile.getWidth()) {
                    decodeSampledBitmapFromFile = Bitmap.createScaledBitmap(decodeSampledBitmapFromFile, scaledDim.width, scaledDim.height, true);
                }
                Bitmap fixRotation = fixRotation(decodeSampledBitmapFromFile, i12);
                if (fixRotation == null) {
                    return null;
                }
                scaledDim.width = fixRotation.getWidth();
                scaledDim.height = fixRotation.getHeight();
                FileOutputStream openFileOutput = context.openFileOutput(str2, 0);
                fixRotation.compress(Bitmap.CompressFormat.JPEG, i11, openFileOutput);
                fixRotation.recycle();
                openFileOutput.close();
                openFileOutput.flush();
                return scaledDim;
            } catch (Throwable th) {
                Log.e(TAG, Utils.getErrorMessage(th));
                if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                    SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(th);
                }
                return null;
            }
        } catch (Throwable th2) {
            Log.e(TAG, Utils.getErrorMessage(th2));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(th2);
            }
            return null;
        }
    }

    public static void copyExifTag(ExifInterface exifInterface, ExifInterface exifInterface2, String str) {
        HVLogUtils.d(TAG, "copyExifTag() called with: from = [" + exifInterface + "], to = [" + exifInterface2 + "], tag = [" + str + "]");
        if (exifInterface.getAttribute(str) != null) {
            exifInterface2.setAttribute(str, exifInterface.getAttribute(str));
        }
    }

    public static Bitmap decodeSampledBitmapFromFile(String str, Dimensions dimensions, Dimensions dimensions2) {
        HVLogUtils.d(TAG, "decodeSampledBitmapFromFile() called with: filePath = [" + str + "], original = [" + dimensions + "], scaled = [" + dimensions2 + "]");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = calculateInSampleSize(dimensions, dimensions2);
        return BitmapFactory.decodeFile(str, options);
    }

    public static boolean delete(File file) {
        File[] listFiles;
        HVLogUtils.d(TAG, "delete() called with: file = [" + file + "]");
        if (!file.exists()) {
            return false;
        }
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                delete(file2);
            }
        }
        return file.delete();
    }

    public static Bitmap fixRotation(Bitmap bitmap, int i10) {
        HVLogUtils.d(TAG, "fixRotation() called with: bitmap = [" + bitmap + "], orientation = [" + i10 + "]");
        if (i10 == 1) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        switch (i10) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                break;
            case 3:
                matrix.setRotate(180.0f);
                break;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 6:
                matrix.setRotate(90.0f);
                break;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 8:
                matrix.setRotate(-90.0f);
                break;
            default:
                return bitmap;
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            bitmap.recycle();
            return createBitmap;
        } catch (OutOfMemoryError e10) {
            Log.e(TAG, Utils.getErrorMessage(e10));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() == null) {
                return null;
            }
            SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            return null;
        }
    }

    public static Dimensions getBitmapDimension(String str) {
        HVLogUtils.d(TAG, "getBitmapDimension() called with: filePath = [" + str + "]");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        return new Dimensions(options.outWidth, options.outHeight);
    }

    public static List<Integer> getCoordinatesFromFaceObj(HVFaceObj hVFaceObj, Bitmap bitmap) {
        HVLogUtils.d(TAG, "getCoordinatesFromFaceObj() called with: face = [" + hVFaceObj + "], bitmap = [" + bitmap + "]");
        ArrayList arrayList = new ArrayList();
        if (hVFaceObj != null && hVFaceObj.getFaceLocation() != null) {
            try {
                JSONObject jSONObject = new JSONObject(hVFaceObj.getFaceLocation());
                int actualLeftTopX = hVFaceObj.getActualLeftTopX(jSONObject.getInt("ltx"), bitmap.getWidth());
                int actualLeftTopY = hVFaceObj.getActualLeftTopY(jSONObject.getInt("lty"), bitmap.getHeight());
                int actualLeftTopX2 = hVFaceObj.getActualLeftTopX(jSONObject.getInt("rbx"), bitmap.getWidth());
                int actualLeftTopY2 = hVFaceObj.getActualLeftTopY(jSONObject.getInt("rby"), bitmap.getHeight());
                arrayList.add(Integer.valueOf(actualLeftTopX));
                arrayList.add(Integer.valueOf(actualLeftTopY));
                arrayList.add(Integer.valueOf(actualLeftTopX2));
                arrayList.add(Integer.valueOf(actualLeftTopY2));
            } catch (JSONException e10) {
                Log.e(TAG, Utils.getErrorMessage(e10));
                if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                    SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
                }
            }
        }
        return arrayList;
    }

    public static Bitmap getCroppedBitmap(Bitmap bitmap, float f10, float f11) {
        try {
            float max = Math.max((bitmap.getHeight() * 1.0f) / f10, (bitmap.getHeight() * 1.0f) / f11);
            return max > 1.0f ? Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() / max), (int) (bitmap.getHeight() / max), true) : bitmap;
        } catch (Exception e10) {
            Log.e(TAG, Utils.getErrorMessage(e10));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() == null) {
                return bitmap;
            }
            SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            return bitmap;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap getCroppedFaceFromBitmap(Bitmap bitmap, List<Integer> list, HVFaceConfig hVFaceConfig) {
        HVLogUtils.d(TAG, "getCroppedFaceFromBitmap() called with: bitmap = [" + bitmap + "], coordinates = [" + list + "], faceConfig = [" + hVFaceConfig + "]");
        if (bitmap != null && !list.isEmpty()) {
            int i10 = 0;
            try {
                int intValue = list.get(0).intValue();
                int intValue2 = list.get(1).intValue();
                int intValue3 = list.get(2).intValue();
                int intValue4 = list.get(3).intValue();
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                int i11 = intValue3 - intValue;
                int i12 = intValue4 - intValue2;
                float topPadding = hVFaceConfig.getTopPadding() > 0.0f ? i12 * hVFaceConfig.getTopPadding() : 0.0f;
                float bottomPadding = hVFaceConfig.getBottomPadding() > 0.0f ? i12 * hVFaceConfig.getBottomPadding() : 0.0f;
                int leftPadding = (int) (intValue - (hVFaceConfig.getLeftPadding() > 0.0f ? i11 * hVFaceConfig.getLeftPadding() : 0.0f));
                int rightPadding = (int) (intValue3 + (hVFaceConfig.getRightPadding() > 0.0f ? i11 * hVFaceConfig.getRightPadding() : 0.0f));
                int i13 = (int) (intValue2 - topPadding);
                int i14 = (int) (intValue4 + bottomPadding);
                if (leftPadding < 0) {
                    leftPadding = 0;
                }
                if (i13 < 0) {
                    i13 = 0;
                }
                if (rightPadding > width) {
                    rightPadding = width;
                }
                if (i14 > height) {
                    i14 = height;
                }
                int i15 = rightPadding - leftPadding;
                int i16 = i14 - i13;
                if (leftPadding + i15 > width) {
                    leftPadding = 0;
                } else {
                    width = i15;
                }
                if (i13 < 0) {
                    i13 = 0;
                }
                if (i13 + i16 <= height) {
                    height = i16;
                    i10 = i13;
                }
                return Bitmap.createBitmap(bitmap, leftPadding, i10, width, height);
            } catch (Exception e10) {
                e = e10;
                String str = TAG;
                HVLogUtils.e(str, "getCroppedFaceFromBitmap(): exception = [" + Utils.getErrorMessage(e) + "]", e);
                Log.e(str, Utils.getErrorMessage(e));
                if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                    SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e);
                }
                return null;
            } catch (OutOfMemoryError e11) {
                e = e11;
                String str2 = TAG;
                HVLogUtils.e(str2, "getCroppedFaceFromBitmap(): exception = [" + Utils.getErrorMessage(e) + "]", e);
                Log.e(str2, Utils.getErrorMessage(e));
                if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                }
                return null;
            }
        }
        return null;
    }

    public static Dimensions getDimAfterScaling(Dimensions dimensions, int i10) {
        HVLogUtils.d(TAG, "getDimAfterScaling() called with: originalDim = [" + dimensions + "], maxDim = [" + i10 + "]");
        int i11 = dimensions.width;
        int i12 = dimensions.height;
        if (i11 > i12) {
            if (i11 > i10) {
                i12 = (i12 * i10) / i11;
                int calculateInSampleSize = calculateInSampleSize(dimensions, new Dimensions(i10, i12));
                return new Dimensions(dimensions.getWidth() / calculateInSampleSize, dimensions.getHeight() / calculateInSampleSize);
            }
        } else if (i12 > i10) {
            i11 = (i11 * i10) / i12;
            i12 = i10;
        }
        i10 = i11;
        int calculateInSampleSize2 = calculateInSampleSize(dimensions, new Dimensions(i10, i12));
        return new Dimensions(dimensions.getWidth() / calculateInSampleSize2, dimensions.getHeight() / calculateInSampleSize2);
    }

    public static HVFaceObj getFaceFromBitmapNPD(Bitmap bitmap) {
        HVLogUtils.d(TAG, "getFaceFromBitmapNPD() called with: source = [" + bitmap + "]");
        Dimensions dimAfterScaling = getDimAfterScaling(new Dimensions(bitmap.getWidth(), bitmap.getHeight()), 512);
        try {
            Bitmap copy = Bitmap.createScaledBitmap(bitmap, dimAfterScaling.width, dimAfterScaling.height, false).copy(Bitmap.Config.ARGB_8888, false);
            ArrayList<ArrayList<Float>> detectFacesFromBitmap = FaceDetectorApi.detectFacesFromBitmap(copy);
            HVFaceObj hVFaceObj = new HVFaceObj();
            if (detectFacesFromBitmap.size() > 0) {
                ArrayList<Float> faceCoordinates = Utils.getFaceCoordinates(detectFacesFromBitmap);
                hVFaceObj.setFaceLocation(faceCoordinates.get(0).floatValue(), faceCoordinates.get(1).floatValue(), faceCoordinates.get(2).floatValue(), faceCoordinates.get(3).floatValue());
                copy.recycle();
            }
            return hVFaceObj;
        } catch (Exception | NoClassDefFoundError e10) {
            String str = TAG;
            HVLogUtils.e(str, "getFaceFromBitmapNPD(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
            Log.e(str, Utils.getErrorMessage(e10));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() == null) {
                return null;
            }
            SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            return null;
        }
    }

    public static double getFileSizeInBytes(String str) {
        if (str == null) {
            return -1.0d;
        }
        File file = new File(str);
        if (file.exists() && file.isFile()) {
            return file.length();
        }
        HVLogUtils.e(TAG, "File does not exist: " + str);
        return -1.0d;
    }

    public static String getNameWithoutExtension(File file) {
        HVLogUtils.d(TAG, "getNameWithoutExtension() called with: file = [" + file + "]");
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(".");
        return lastIndexOf >= 0 ? name.substring(0, lastIndexOf) : name;
    }

    public static Dimensions getScaledDim(Dimensions dimensions, int i10) {
        HVLogUtils.d(TAG, "getScaledDim() called with: originalDim = [" + dimensions + "], maxDim = [" + i10 + "]");
        int i11 = dimensions.width;
        int i12 = dimensions.height;
        if (i11 > i10) {
            i12 = (i12 * i10) / i11;
        } else {
            i10 = i11;
        }
        return new Dimensions(i10, i12);
    }

    public static boolean isRotation90(int i10) {
        HVLogUtils.d(TAG, "isRotation90() called with: orientation = [" + i10 + "]");
        if (i10 == 1) {
            return false;
        }
        return i10 == 5 || i10 == 6 || i10 == 7 || i10 == 8;
    }

    public static Bitmap processBitmap(String str) {
        HVLogUtils.d(TAG, "processBitmap() called with: filepath = [" + str + "]");
        try {
            new BitmapFactory.Options().inPreferredConfig = Bitmap.Config.ARGB_8888;
            return BitmapFactory.decodeFile(str);
        } catch (Exception e10) {
            String str2 = TAG;
            HVLogUtils.e(str2, "getFaceFromBitmapNPD(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
            Log.e(str2, Utils.getErrorMessage(e10));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() == null) {
                return null;
            }
            SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            return null;
        } catch (OutOfMemoryError e11) {
            String str3 = TAG;
            HVLogUtils.e(str3, "getFaceFromBitmapNPD(): exception = [" + Utils.getErrorMessage(e11) + "]", e11);
            Log.e(str3, Utils.getErrorMessage(e11));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() == null) {
                return null;
            }
            SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e11);
            return null;
        }
    }

    public static Bitmap rotateBitmap(Bitmap bitmap, int i10) {
        HVLogUtils.d(TAG, "rotateBitmap() called with: bitmap = [" + bitmap + "], orientation = [" + i10 + "]");
        Matrix matrix = new Matrix();
        switch (i10) {
            case 3:
                matrix.setRotate(180.0f);
                break;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 6:
                matrix.setRotate(90.0f);
                break;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 8:
                matrix.setRotate(-90.0f);
                break;
            default:
                return bitmap;
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            bitmap.recycle();
            return createBitmap;
        } catch (OutOfMemoryError e10) {
            String str = TAG;
            HVLogUtils.e(str, "getFaceFromBitmapNPD(): exception = [" + Utils.getErrorMessage(e10) + "]", e10);
            Log.e(str, Utils.getErrorMessage(e10));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() == null) {
                return null;
            }
            SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            return null;
        }
    }
}
