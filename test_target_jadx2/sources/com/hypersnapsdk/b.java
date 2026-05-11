package com.hypersnapsdk;

import android.util.Log;
import co.hyperverge.hypersnapsdk.activities.HVRetakeActivity;
import co.hyperverge.hypersnapsdk.objects.HVBaseResponse;
import co.hyperverge.hypersnapsdk.objects.HVResponse;
import co.hyperverge.hypersnapsdk.utils.AppConstants;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class b {
    public static WritableMap a(HVBaseResponse hVBaseResponse, WritableMap writableMap) {
        JSONObject apiResult = hVBaseResponse.getApiResult();
        JSONObject apiHeaders = hVBaseResponse.getApiHeaders();
        String imageURI = hVBaseResponse.getImageURI();
        String fullImageURI = hVBaseResponse.getFullImageURI();
        String action = hVBaseResponse.getAction();
        String retakeMessage = hVBaseResponse.getRetakeMessage();
        String videoUri = hVBaseResponse.getVideoUri();
        HashMap<String, List<String>> gestureLivenessImageUrls = hVBaseResponse.getGestureLivenessImageUrls();
        if (apiResult != null) {
            try {
                writableMap.putMap("apiResult", RNHVNetworkHelper.convertJsonToMap(apiResult));
                writableMap.putString(HVRetakeActivity.IMAGE_URI_TAG, imageURI);
                if (fullImageURI != null && !fullImageURI.isEmpty()) {
                    writableMap.putString("fullImageUri", fullImageURI);
                }
                if (retakeMessage != null && !retakeMessage.isEmpty()) {
                    writableMap.putString(AppConstants.RETAKE_MESSAGE, retakeMessage);
                }
                if (action != null && !action.isEmpty()) {
                    writableMap.putString("action", action);
                }
                if (videoUri != null && !videoUri.isEmpty()) {
                    writableMap.putString("videoUri", videoUri);
                }
                if (gestureLivenessImageUrls != null && !gestureLivenessImageUrls.isEmpty()) {
                    writableMap.putMap("gestureLivenessUrls", RNHVNetworkHelper.convertJsonToMap(new JSONObject(gestureLivenessImageUrls)));
                }
            } catch (Exception e10) {
                String message = e10.getMessage();
                Objects.requireNonNull(message);
                Log.e("RNHVUtils", message);
            }
        }
        if (apiHeaders != null) {
            try {
                writableMap.putMap("apiHeaders", RNHVNetworkHelper.convertJsonToMap(apiHeaders));
            } catch (Exception e11) {
                String message2 = e11.getMessage();
                Objects.requireNonNull(message2);
                Log.e("RNHVUtils", message2);
            }
        }
        return writableMap;
    }

    public static WritableArray b(HVResponse hVResponse) {
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        try {
            Iterator<HVBaseResponse> it = hVResponse.getRetakeAttemptResponses().iterator();
            while (it.hasNext()) {
                writableNativeArray.pushMap(a(it.next(), new WritableNativeMap()));
            }
        } catch (Exception e10) {
            Log.e("RNHVUtils", e10.getMessage());
        }
        return writableNativeArray;
    }
}
