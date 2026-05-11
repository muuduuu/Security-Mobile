package co.hyperverge.facedetection;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class FileUtils {
    private static final String LOG_TAG = "co.hyperverge.facedetection.FileUtils";

    public static class Dimensions {
        int height;
        int width;

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
        int i10 = dimensions.height;
        int i11 = dimensions.width;
        int i12 = 1;
        if (i10 > dimensions2.height || i11 > dimensions2.width) {
            int i13 = i10 / 2;
            int i14 = i11 / 2;
            while (i13 / i12 >= dimensions2.height && i14 / i12 >= dimensions2.width) {
                i12 *= 2;
            }
        }
        return i12;
    }

    public static Dimensions compressToFile(Context context, String str, String str2, int i10, int i11, int i12) {
        Dimensions bitmapDimension = getBitmapDimension(str);
        Dimensions scaledDim = getScaledDim(bitmapDimension, i10);
        try {
            Bitmap decodeSampledBitmapFromFile = decodeSampledBitmapFromFile(str, bitmapDimension, scaledDim);
            if (decodeSampledBitmapFromFile == null) {
                Log.e(LOG_TAG, "BMP null at: " + str);
                return null;
            }
            try {
                if (scaledDim.width < decodeSampledBitmapFromFile.getWidth()) {
                    decodeSampledBitmapFromFile = Bitmap.createScaledBitmap(decodeSampledBitmapFromFile, scaledDim.width, scaledDim.height, true);
                }
                Bitmap fixRotation = fixRotation(decodeSampledBitmapFromFile, i12);
                scaledDim.width = fixRotation.getWidth();
                scaledDim.height = fixRotation.getHeight();
                FileOutputStream openFileOutput = context.openFileOutput(str2, 0);
                fixRotation.compress(Bitmap.CompressFormat.JPEG, i11, openFileOutput);
                fixRotation.recycle();
                openFileOutput.close();
                openFileOutput.flush();
                return scaledDim;
            } catch (Throwable unused) {
                Log.e(LOG_TAG, "Failed in scaling: " + str);
                return null;
            }
        } catch (Throwable unused2) {
            Log.e(LOG_TAG, "Failed in decode: " + str);
            return null;
        }
    }

    public static void copy(Context context, String str, String str2) {
        FileInputStream fileInputStream = new FileInputStream(str);
        FileOutputStream openFileOutput = context.openFileOutput(str2, 0);
        FileChannel channel = fileInputStream.getChannel();
        channel.transferTo(0L, channel.size(), openFileOutput.getChannel());
        fileInputStream.close();
        openFileOutput.close();
    }

    public static boolean copyFile(InputStream inputStream, OutputStream outputStream) {
        try {
            try {
                byte[] bArr = new byte[1024];
                long j10 = 0;
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    outputStream.write(bArr, 0, read);
                    j10 += read;
                }
                return j10 != 0;
            } catch (IOException e10) {
                Log.d(LOG_TAG, e10.getMessage());
                try {
                    inputStream.close();
                    outputStream.close();
                } catch (IOException e11) {
                    Log.d(LOG_TAG, e11.getMessage());
                }
                return false;
            }
        } finally {
            try {
                inputStream.close();
                outputStream.close();
            } catch (IOException e12) {
                Log.d(LOG_TAG, e12.getMessage());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0058 A[Catch: IOException -> 0x0054, TRY_LEAVE, TryCatch #3 {IOException -> 0x0054, blocks: (B:34:0x0050, B:27:0x0058), top: B:33:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0050 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void copyFileFromRawToOthers(Context context, int i10, String str) {
        FileOutputStream fileOutputStream;
        Throwable th;
        Exception e10;
        InputStream openRawResource = context.getResources().openRawResource(i10);
        try {
            try {
                fileOutputStream = new FileOutputStream(str);
                try {
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = openRawResource.read(bArr);
                            if (read <= 0) {
                                openRawResource.close();
                                fileOutputStream.close();
                                return;
                            }
                            fileOutputStream.write(bArr, 0, read);
                        }
                    } catch (Exception e11) {
                        e10 = e11;
                        Log.d(LOG_TAG, e10.getMessage());
                        if (openRawResource != null) {
                            openRawResource.close();
                        }
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (openRawResource != null) {
                        try {
                            openRawResource.close();
                        } catch (IOException e12) {
                            Log.d(LOG_TAG, e12.getMessage());
                            throw th;
                        }
                    }
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    throw th;
                }
            } catch (IOException e13) {
                Log.d(LOG_TAG, e13.getMessage());
            }
        } catch (Exception e14) {
            fileOutputStream = null;
            e10 = e14;
        } catch (Throwable th3) {
            fileOutputStream = null;
            th = th3;
            if (openRawResource != null) {
            }
            if (fileOutputStream != null) {
            }
            throw th;
        }
    }

    public static Bitmap decodeSampledBitmapFromFile(String str, Dimensions dimensions, Dimensions dimensions2) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = calculateInSampleSize(dimensions, dimensions2);
        return BitmapFactory.decodeFile(str, options);
    }

    public static Bitmap decodeSampledBitmapFromFileForFace(String str, Dimensions dimensions, Dimensions dimensions2) {
        Bitmap bitmap = null;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = calculateInSampleSize(dimensions, dimensions2);
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            bitmap = BitmapFactory.decodeFile(str, options);
            return fixRotation(bitmap, new ExifInterface(str).getAttributeInt("Orientation", 0));
        } catch (Exception e10) {
            Log.d(LOG_TAG, e10.getMessage());
            return bitmap;
        }
    }

    public static void deleteFile(String str) {
        if (str == null) {
            return;
        }
        File file = new File(str);
        if (file.exists()) {
            file.delete();
        }
    }

    public static Bitmap fixRotation(Bitmap bitmap, int i10) {
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
            Log.d(LOG_TAG, e10.getMessage());
            return bitmap;
        }
    }

    public static Dimensions getBitmapDimension(String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        return new Dimensions(options.outWidth, options.outHeight);
    }

    public static File[] getFileList(Context context) {
        return context.getFilesDir().listFiles();
    }

    public static long getFileSize(String str) {
        return new File(str).length();
    }

    public static Dimensions getScaledDim(Dimensions dimensions, int i10) {
        int i11 = dimensions.width;
        int i12 = dimensions.height;
        if (i11 > i12) {
            if (i11 > i10) {
                i12 = (i12 * i10) / i11;
                return new Dimensions(i10, i12);
            }
        } else if (i12 > i10) {
            i11 = (i11 * i10) / i12;
            i12 = i10;
        }
        i10 = i11;
        return new Dimensions(i10, i12);
    }

    public static boolean isRotation90(int i10) {
        if (i10 == 1) {
            return false;
        }
        return i10 == 5 || i10 == 6 || i10 == 7 || i10 == 8;
    }

    public static void copy(File file, File file2) {
        FileInputStream fileInputStream = new FileInputStream(file);
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        FileChannel channel = fileInputStream.getChannel();
        channel.transferTo(0L, channel.size(), fileOutputStream.getChannel());
        fileInputStream.close();
        fileOutputStream.close();
    }
}
