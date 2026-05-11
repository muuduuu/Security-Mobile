package co.hyperverge.hypersnapsdk.network;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import co.hyperverge.hypersnapsdk.helpers.SDKInternalConfig;
import co.hyperverge.hypersnapsdk.utils.Utils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public class HVUtils {
    private static final String TAG = "HVUtils";

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00aa, code lost:
    
        r3.write(r4.toByteArray());
        r3.flush();
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b7, code lost:
    
        r2 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00da, code lost:
    
        r1 = r9.getAbsolutePath();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00de, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e2, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String compressImageToSize(String str, int i10) {
        String str2 = TAG;
        File file = new File(str);
        if (file.length() / 1024 <= i10) {
            return str;
        }
        String[] split = file.getName().split("\\.");
        long j10 = i10 * 1024;
        long j11 = j10 - (((int) (j10 / 100)) * 10);
        try {
            File file2 = new File(file.getParent(), split[0] + "_compressed.jpg");
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Bitmap decodeFile = BitmapFactory.decodeFile(str);
            int i11 = 90;
            int i12 = 5;
            while (true) {
                int i13 = (i12 + i11) / 2;
                try {
                    byteArrayOutputStream.flush();
                    byteArrayOutputStream.reset();
                } catch (IOException e10) {
                    Log.e(str2, Utils.getErrorMessage(e10));
                    if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                        SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
                    }
                }
                decodeFile.compress(Bitmap.CompressFormat.JPEG, i13, byteArrayOutputStream);
                String str3 = str2;
                long size = byteArrayOutputStream.size();
                if (size > j10) {
                    i11 = i13 - 1;
                } else {
                    i12 = i13 + 1;
                }
                if (i13 < 5 || (size < j10 && size > j11)) {
                    try {
                        try {
                            break;
                        } catch (Exception e11) {
                            e = e11;
                            str2 = str3;
                            String str4 = null;
                            Log.e(str2, Utils.getErrorMessage(e));
                            if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                                SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e);
                            }
                            return str4;
                        }
                    } catch (IOException e12) {
                        str2 = str3;
                        Log.e(str2, Utils.getErrorMessage(e12));
                        if (SDKInternalConfig.getInstance().getErrorMonitoringService() != null) {
                            SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e12);
                        }
                    }
                } else {
                    str2 = str3;
                }
            }
        } catch (Exception e13) {
            e = e13;
        }
        return str4;
    }
}
