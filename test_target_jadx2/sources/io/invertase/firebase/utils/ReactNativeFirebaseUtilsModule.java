package io.invertase.firebase.utils;

import android.app.Activity;
import android.content.IntentSender;
import android.os.Environment;
import android.provider.Settings;
import android.util.Log;
import co.hyperverge.hypersnapsdk.utils.AppConstants;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.common.C2010b;
import com.google.android.gms.common.C2017i;
import io.invertase.firebase.app.a;
import io.invertase.firebase.common.ReactNativeFirebaseModule;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public class ReactNativeFirebaseUtilsModule extends ReactNativeFirebaseModule {
    private static final String FIREBASE_TEST_LAB = "firebase.test.lab";
    private static final String KEY_CACHE_DIRECTORY = "CACHES_DIRECTORY";
    private static final String KEY_DOCUMENT_DIRECTORY = "DOCUMENT_DIRECTORY";
    private static final String KEY_EXTERNAL_DIRECTORY = "EXTERNAL_DIRECTORY";
    private static final String KEY_EXT_STORAGE_DIRECTORY = "EXTERNAL_STORAGE_DIRECTORY";
    private static final String KEY_LIBRARY_DIRECTORY = "LIBRARY_DIRECTORY";
    private static final String KEY_MAIN_BUNDLE = "MAIN_BUNDLE";
    private static final String KEY_MOVIES_DIRECTORY = "MOVIES_DIRECTORY";
    private static final String KEY_PICS_DIRECTORY = "PICTURES_DIRECTORY";
    private static final String KEY_TEMP_DIRECTORY = "TEMP_DIRECTORY";
    private static final String TAG = "Utils";

    public ReactNativeFirebaseUtilsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext, TAG);
    }

    private WritableMap getPlayServicesStatusMap() {
        WritableMap createMap = Arguments.createMap();
        C2017i q10 = C2017i.q();
        int i10 = q10.i(getContext());
        createMap.putInt("status", i10);
        if (i10 == 0) {
            createMap.putBoolean("isAvailable", true);
        } else {
            createMap.putBoolean("isAvailable", false);
            createMap.putString(AppConstants.VIDEO_RECORDING_ERROR, q10.g(i10));
            createMap.putBoolean("isUserResolvableError", q10.m(i10));
            createMap.putBoolean("hasResolution", new C2010b(i10).y0());
        }
        return createMap;
    }

    private int isGooglePlayServicesAvailable() {
        return C2017i.q().i(getContext());
    }

    private static Boolean isRunningInTestLab() {
        return Boolean.valueOf("true".equals(Settings.System.getString(a.a().getContentResolver(), FIREBASE_TEST_LAB)));
    }

    @ReactMethod
    public void androidGetPlayServicesStatus(Promise promise) {
        promise.resolve(getPlayServicesStatusMap());
    }

    @ReactMethod
    public void androidMakePlayServicesAvailable() {
        Activity activity;
        if (isGooglePlayServicesAvailable() == 0 || (activity = getActivity()) == null) {
            return;
        }
        C2017i.q().r(activity);
    }

    @ReactMethod
    public void androidPromptForPlayServices() {
        Activity activity;
        int isGooglePlayServicesAvailable = isGooglePlayServicesAvailable();
        C2017i q10 = C2017i.q();
        if (isGooglePlayServicesAvailable == 0 || !q10.m(isGooglePlayServicesAvailable) || (activity = getActivity()) == null) {
            return;
        }
        q10.n(activity, isGooglePlayServicesAvailable, isGooglePlayServicesAvailable).show();
    }

    @ReactMethod
    public void androidResolutionForPlayServices() {
        Activity activity;
        int isGooglePlayServicesAvailable = isGooglePlayServicesAvailable();
        C2010b c2010b = new C2010b(isGooglePlayServicesAvailable);
        if (c2010b.Z0() || !c2010b.y0() || (activity = getActivity()) == null) {
            return;
        }
        try {
            c2010b.a1(activity, isGooglePlayServicesAvailable);
        } catch (IntentSender.SendIntentException e10) {
            Log.d(TAG, "resolutionForPlayServices", e10);
        }
    }

    @Override // io.invertase.firebase.common.ReactNativeFirebaseModule, com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put("isRunningInTestLab", isRunningInTestLab());
        hashMap.put("androidPlayServices", getPlayServicesStatusMap());
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        hashMap.put(KEY_MAIN_BUNDLE, BuildConfig.FLAVOR);
        hashMap.put(KEY_LIBRARY_DIRECTORY, reactApplicationContext.getFilesDir().getAbsolutePath());
        hashMap.put(KEY_TEMP_DIRECTORY, reactApplicationContext.getCacheDir().getAbsolutePath());
        hashMap.put(KEY_CACHE_DIRECTORY, reactApplicationContext.getCacheDir().getAbsolutePath());
        File externalFilesDir = reactApplicationContext.getExternalFilesDir(null);
        if (externalFilesDir != null) {
            hashMap.put(KEY_DOCUMENT_DIRECTORY, externalFilesDir.getAbsolutePath());
        } else {
            hashMap.put(KEY_DOCUMENT_DIRECTORY, reactApplicationContext.getFilesDir().getAbsolutePath());
        }
        if (!hashMap.containsKey(KEY_DOCUMENT_DIRECTORY)) {
            hashMap.put(KEY_DOCUMENT_DIRECTORY, reactApplicationContext.getFilesDir().getAbsolutePath());
        }
        hashMap.put(KEY_PICS_DIRECTORY, Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getAbsolutePath());
        hashMap.put(KEY_MOVIES_DIRECTORY, Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES).getAbsolutePath());
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory != null) {
            hashMap.put(KEY_EXT_STORAGE_DIRECTORY, externalStorageDirectory.getAbsolutePath());
        }
        if (externalFilesDir != null) {
            hashMap.put(KEY_EXTERNAL_DIRECTORY, externalFilesDir.getAbsolutePath());
        }
        return hashMap;
    }
}
