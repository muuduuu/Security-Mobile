package co.hyperverge.hypersnapsdk.utils;

import co.hyperverge.hypersnapsdk.model.HVStateData;
import co.hyperverge.hypersnapsdk.objects.HVError;
import co.hyperverge.hypersnapsdk.objects.HVResponse;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lc.o;
import org.conscrypt.BuildConfig;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0002\u001a\u00020\u0003*\u00020\u0004H\u0000\u001a\u000e\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u00020\u0004H\u0000\u001a<\u0010\u0006\u001a\u00020\u0003*\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"TAG", BuildConfig.FLAVOR, "clearDirectory", BuildConfig.FLAVOR, "Ljava/io/File;", "createDirectory", "saveSDKResultToFile", "moduleId", "hvError", "Lco/hyperverge/hypersnapsdk/objects/HVError;", "hvResponse", "Lco/hyperverge/hypersnapsdk/objects/HVResponse;", "qrResult", "Lorg/json/JSONObject;", "hypersnapsdk_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FileExtensionsKt {
    private static final String TAG = "FileExtensions";

    public static final void clearDirectory(File file) {
        File[] listFiles;
        Intrinsics.checkNotNullParameter(file, "<this>");
        HVLogUtils.d(TAG, "clearDirectory() called called with filePath: " + file.getAbsolutePath());
        if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                file2.delete();
            }
        }
    }

    public static final String createDirectory(File file) {
        Object b10;
        Intrinsics.checkNotNullParameter(file, "<this>");
        HVLogUtils.d(TAG, "createDirectory() called with filePath: " + file.getAbsolutePath());
        try {
            o.a aVar = lc.o.f37128b;
        } catch (Throwable th) {
            o.a aVar2 = lc.o.f37128b;
            b10 = lc.o.b(lc.p.a(th));
        }
        if (!file.exists() && !file.mkdirs()) {
            b10 = lc.o.b(Unit.f36324a);
            Throwable d10 = lc.o.d(b10);
            if (d10 == null) {
                return "createDirectory() failed for " + file.getAbsolutePath() + " due to an unexpected error";
            }
            HVLogUtils.e(TAG, "createDirectory() failed for " + file.getAbsolutePath() + " : " + d10.getMessage());
            return "createDirectory() failed for " + file.getAbsolutePath() + " : " + d10.getMessage();
        }
        return null;
    }

    public static final void saveSDKResultToFile(File file, String str, HVError hVError, HVResponse hVResponse, JSONObject jSONObject) {
        StringBuilder sb2;
        FileWriter fileWriter;
        HVLogUtils.d(TAG, "saveSDKResultToFile() called with: context = [" + file + "], hvError = [" + hVError + "], hvResponse = [" + hVResponse + "], qrResult = [" + jSONObject + ']');
        if (file == null) {
            HVLogUtils.e(TAG, "saveSDKResultToFile: context is null");
            return;
        }
        String t10 = new com.google.gson.e().t(new HVStateData(hVError, hVResponse, jSONObject));
        FileWriter fileWriter2 = null;
        try {
            try {
                File file2 = new File(file, "hv/sdkResult");
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                StringBuilder sb3 = new StringBuilder();
                if (str == null) {
                    str = "hv_data";
                }
                sb3.append(str);
                sb3.append(".json");
                fileWriter = new FileWriter(new File(file2, sb3.toString()), false);
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            fileWriter.write(t10);
            try {
                fileWriter.close();
            } catch (IOException e11) {
                e = e11;
                sb2 = new StringBuilder();
                sb2.append("saveSDKResultToFile: exception closing writer: ");
                sb2.append(Utils.getErrorMessage(e));
                HVLogUtils.e(TAG, sb2.toString());
            }
        } catch (Exception e12) {
            e = e12;
            fileWriter2 = fileWriter;
            HVLogUtils.e(TAG, "saveSDKResultToFile: exception writing file: " + Utils.getErrorMessage(e));
            if (fileWriter2 != null) {
                try {
                    fileWriter2.close();
                } catch (IOException e13) {
                    e = e13;
                    sb2 = new StringBuilder();
                    sb2.append("saveSDKResultToFile: exception closing writer: ");
                    sb2.append(Utils.getErrorMessage(e));
                    HVLogUtils.e(TAG, sb2.toString());
                }
            }
        } catch (Throwable th2) {
            th = th2;
            fileWriter2 = fileWriter;
            if (fileWriter2 != null) {
                try {
                    fileWriter2.close();
                } catch (IOException e14) {
                    HVLogUtils.e(TAG, "saveSDKResultToFile: exception closing writer: " + Utils.getErrorMessage(e14));
                }
            }
            throw th;
        }
    }

    public static /* synthetic */ void saveSDKResultToFile$default(File file, String str, HVError hVError, HVResponse hVResponse, JSONObject jSONObject, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            hVError = null;
        }
        if ((i10 & 4) != 0) {
            hVResponse = null;
        }
        if ((i10 & 8) != 0) {
            jSONObject = null;
        }
        saveSDKResultToFile(file, str, hVError, hVResponse, jSONObject);
    }
}
