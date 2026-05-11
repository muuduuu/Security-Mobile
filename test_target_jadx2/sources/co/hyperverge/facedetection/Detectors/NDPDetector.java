package co.hyperverge.facedetection.Detectors;

import Z5.c;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Environment;
import android.util.Log;
import co.hyperverge.facedetection.DetectorUtils;
import co.hyperverge.facedetection.FileInterface;
import co.hyperverge.facedetection.HVFace;
import co.hyperverge.hypersnapsdk.service.framerecorder.HVFrameRecorder;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public class NDPDetector extends HVFaceDetector {
    private static final String TAG = "co.hyperverge.facedetection.Detectors.NDPDetector";
    private String JsonPath;
    private String LandmarkPath;
    AssetManager mgr;
    long model;

    private void SaveImage(Bitmap bitmap) {
        File file = new File(Environment.getExternalStorageDirectory().toString() + "/FACE_CROP_256_test");
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, "Image-" + System.currentTimeMillis() + ".jpg");
        if (file2.exists()) {
            file2.delete();
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            bitmap.compress(Bitmap.CompressFormat.JPEG, 85, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (Exception e10) {
            Log.d(TAG, e10.getMessage());
        }
    }

    public native synchronized String detectFaces(byte[] bArr, int i10, int i11, int i12, String str);

    @Override // co.hyperverge.facedetection.Detectors.HVFaceDetector
    public List<HVFace> detectFaces(FileInterface fileInterface) {
        Bitmap processBitmapFromPath = DetectorUtils.processBitmapFromPath(fileInterface.getPathOriginal());
        if (processBitmapFromPath == null) {
            return null;
        }
        List<HVFace> detectFacesFromBitmap = detectFacesFromBitmap(fileInterface, processBitmapFromPath);
        processBitmapFromPath.recycle();
        return detectFacesFromBitmap;
    }

    public native synchronized String detectFacesBitmap(Bitmap bitmap);

    @Override // co.hyperverge.facedetection.Detectors.HVFaceDetector
    protected List<HVFace> detectFacesFromBitmap(FileInterface fileInterface, Bitmap bitmap) {
        return null;
    }

    public ArrayList<ArrayList<Float>> detectFacesFromData(byte[] bArr, int i10, int i11, int i12) {
        if (bArr == null) {
            return null;
        }
        try {
            return getMatricesFromResponse(new JSONArray(detectFaces(bArr, i10, i11, i12, this.JsonPath)), i10, i11);
        } catch (Exception e10) {
            Log.e(TAG, e10.getLocalizedMessage());
            return null;
        }
    }

    public List<RectF> detectFacesFromData2(byte[] bArr, int i10, int i11, int i12) {
        ArrayList arrayList = new ArrayList();
        if (bArr == null) {
            return null;
        }
        try {
            Log.d("NPD", new JSONArray(detectFaces(bArr, i10, i11, i12, this.JsonPath)).toString());
        } catch (JSONException e10) {
            Log.d(TAG, e10.getMessage());
        }
        return arrayList;
    }

    public native synchronized int getAverageIntensity(byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, boolean z10);

    public int getAvgIntensity(byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, boolean z10) {
        if (!z10) {
            return getAverageIntensity(bArr, i10, i11, i12, i13, i14, i15, z10);
        }
        int round = Math.round((i12 / 2.0f) + (i13 / 2.0f));
        int round2 = Math.round((i14 / 2.0f) + (i15 / 2.0f));
        int round3 = Math.round((i13 - i12) / 4.0f);
        int round4 = Math.round((i15 - i14) / 4.0f);
        return getAverageIntensity(bArr, i10, i11, round - round3, round + round3, round2 - round4, round2 + round4, z10);
    }

    public ArrayList<ArrayList<Float>> getMatricesFromResponse(JSONArray jSONArray, int i10, int i11) {
        ArrayList<ArrayList<Float>> arrayList = new ArrayList<>(jSONArray.length());
        for (int i12 = 0; i12 < jSONArray.length(); i12++) {
            try {
                JSONArray jSONArray2 = jSONArray.getJSONArray(i12);
                arrayList.add(new ArrayList<>(jSONArray2.length()));
                ArrayList<Float> arrayList2 = arrayList.get(i12);
                for (int i13 = 0; i13 < jSONArray2.length(); i13 += 2) {
                    arrayList2.add(i13, Float.valueOf(jSONArray2.getInt(i13) / i10));
                    arrayList2.add(i13 + 1, Float.valueOf(jSONArray2.getInt(r6) / i11));
                }
            } catch (JSONException e10) {
                Log.d(TAG, e10.getMessage());
            }
        }
        return arrayList;
    }

    @Override // co.hyperverge.facedetection.Detectors.HVFaceDetector
    public boolean initialize(Context context) {
        c.a(context, "ndp-detector");
        AssetManager assets = context.getResources().getAssets();
        this.mgr = assets;
        loadModel(assets, this.LandmarkPath, HVFrameRecorder.VIDEO_HEIGHT, HVFrameRecorder.VIDEO_WIDTH, 20, 11);
        try {
            new File("/sdcard/saved/").mkdirs();
            return true;
        } catch (Exception e10) {
            Log.d(TAG, e10.getMessage());
            return true;
        }
    }

    public native synchronized void loadModel(AssetManager assetManager, String str, int i10, int i11, int i12, int i13);

    @Override // co.hyperverge.facedetection.Detectors.HVFaceDetector
    public void release() {
        releaseModel(this.model);
    }

    public native synchronized void releaseModel(long j10);

    public ArrayList<ArrayList<Float>> detectFacesFromBitmap(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        try {
            return getMatricesFromResponse(new JSONArray(detectFacesBitmap(bitmap)), bitmap.getWidth(), bitmap.getHeight());
        } catch (JSONException e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
