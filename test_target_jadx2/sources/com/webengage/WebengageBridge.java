package com.webengage;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.webengage.sdk.android.Channel;
import com.webengage.sdk.android.Logger;
import com.webengage.sdk.android.WebEngage;
import com.webengage.sdk.android.actions.render.InAppNotificationData;
import com.webengage.sdk.android.actions.render.PushNotificationData;
import com.webengage.sdk.android.callbacks.InAppNotificationCallbacks;
import com.webengage.sdk.android.callbacks.PushNotificationCallbacks;
import com.webengage.sdk.android.callbacks.StateChangeCallbacks;
import com.webengage.sdk.android.callbacks.WESecurityCallback;
import com.webengage.sdk.android.utils.Gender;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import org.conscrypt.BuildConfig;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class WebengageBridge extends ReactContextBaseJavaModule implements PushNotificationCallbacks, InAppNotificationCallbacks, WESecurityCallback {
    private static final String TAG = "webengageBridge";
    private ReactApplicationContext reactApplicationContext;
    private static final String DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
    private static final int DATE_FORMAT_LENGTH = DATE_FORMAT.replaceAll("'", BuildConfig.FLAVOR).length();
    private static int listenerCount = 0;
    private static volatile WebengageBridge INSTANCE = null;
    private static final Object lock = new Object();
    private static final HashMap<String, WritableMap> queuedMap = new HashMap<>();

    class a extends StateChangeCallbacks {
        a() {
        }

        @Override // com.webengage.sdk.android.callbacks.StateChangeCallbacks
        public void onAnonymousIdChanged(Context context, String str) {
            WritableMap createMap = Arguments.createMap();
            createMap.putString("anonymousID", str);
            WebengageBridge.sendEvent(WebengageBridge.this.reactApplicationContext, "onAnonymousIdChanged", createMap);
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f30120a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            f30120a = iArr;
            try {
                iArr[ReadableType.Null.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30120a[ReadableType.Boolean.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30120a[ReadableType.Number.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f30120a[ReadableType.String.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f30120a[ReadableType.Map.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f30120a[ReadableType.Array.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private WebengageBridge(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Log.d(TAG, "MyLogs Constructor called");
        WebEngage.registerPushNotificationCallback(this);
        WebEngage.registerInAppNotificationCallback(this);
        WebEngage.registerWESecurityCallback(this);
        listenerCount = 0;
    }

    public static WritableArray convertJsonArrayToWriteable(JSONArray jSONArray) {
        Object obj;
        WritableArray createArray = Arguments.createArray();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                obj = jSONArray.get(i10);
            } catch (JSONException e10) {
                Logger.e(TAG, i10 + " should be within bounds of array " + String.valueOf(jSONArray), e10);
                obj = null;
            }
            if (obj instanceof JSONObject) {
                createArray.pushMap(convertJsonObjectToWriteable((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                createArray.pushArray(convertJsonArrayToWriteable((JSONArray) obj));
            } else if (obj instanceof String) {
                createArray.pushString((String) obj);
            } else if (obj instanceof Double) {
                createArray.pushDouble(((Double) obj).doubleValue());
            } else if (obj instanceof Integer) {
                createArray.pushInt(((Integer) obj).intValue());
            } else if (obj instanceof Boolean) {
                createArray.pushBoolean(((Boolean) obj).booleanValue());
            } else if (obj == null) {
                createArray.pushNull();
            } else {
                Logger.e(TAG, "Unrecognized object: " + String.valueOf(obj));
            }
        }
        return createArray;
    }

    private ReadableMap convertJsonObjectToReadable(JSONObject jSONObject) {
        return convertJsonObjectToWriteable(jSONObject);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0057 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0061 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static WritableMap convertJsonObjectToWriteable(JSONObject jSONObject) {
        Object obj;
        WritableMap createMap = Arguments.createMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                obj = jSONObject.get(next);
            } catch (JSONException e10) {
                Logger.e(TAG, "Key " + next + " should exist in " + String.valueOf(jSONObject), e10);
                obj = null;
                if (obj instanceof JSONObject) {
                }
            } catch (Exception e11) {
                Logger.e(TAG, "Exception while getting value for " + next, e11);
                obj = null;
                if (obj instanceof JSONObject) {
                }
            }
            if (obj instanceof JSONObject) {
                createMap.putMap(next, convertJsonObjectToWriteable((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                createMap.putArray(next, convertJsonArrayToWriteable((JSONArray) obj));
            } else if (obj instanceof String) {
                createMap.putString(next, (String) obj);
            } else if (obj instanceof Double) {
                createMap.putDouble(next, ((Double) obj).doubleValue());
            } else if (obj instanceof Integer) {
                createMap.putInt(next, ((Integer) obj).intValue());
            } else if (obj instanceof Boolean) {
                createMap.putBoolean(next, ((Boolean) obj).booleanValue());
            } else if (obj == null || obj == JSONObject.NULL) {
                createMap.putNull(next);
            } else {
                Logger.e(TAG, "Unrecognized value for " + next + ": " + String.valueOf(obj));
            }
        }
        return createMap;
    }

    public static WritableArray convertListToWritableArray(List<Object> list) {
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        for (Object obj : list) {
            if (obj == null) {
                writableNativeArray.pushNull();
            } else if (obj instanceof Boolean) {
                writableNativeArray.pushBoolean(((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                writableNativeArray.pushInt(((Integer) obj).intValue());
            } else if (obj instanceof Double) {
                writableNativeArray.pushDouble(((Double) obj).doubleValue());
            } else if (obj instanceof String) {
                writableNativeArray.pushString((String) obj);
            } else if (obj instanceof Map) {
                writableNativeArray.pushMap(convertMapToWritableMap((Map) obj));
            } else if (obj instanceof List) {
                writableNativeArray.pushArray(convertListToWritableArray((List) obj));
            }
        }
        return writableNativeArray;
    }

    public static WritableMap convertMapToWritableMap(Map<String, Object> map) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                writableNativeMap.putNull(key);
            } else if (value instanceof Boolean) {
                writableNativeMap.putBoolean(key, ((Boolean) value).booleanValue());
            } else if (value instanceof Integer) {
                writableNativeMap.putInt(key, ((Integer) value).intValue());
            } else if (value instanceof Double) {
                writableNativeMap.putDouble(key, ((Double) value).doubleValue());
            } else if (value instanceof String) {
                writableNativeMap.putString(key, (String) value);
            } else if (value instanceof Map) {
                writableNativeMap.putMap(key, convertMapToWritableMap((Map) value));
            } else if (value instanceof List) {
                writableNativeMap.putArray(key, convertListToWritableArray((List) value));
            }
        }
        return writableNativeMap;
    }

    private static Date getDate(String str) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_FORMAT, Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            return simpleDateFormat.parse(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static WebengageBridge getInstance() {
        Logger.d(TAG, "getInstance without context: ");
        if (INSTANCE == null) {
            synchronized (lock) {
                INSTANCE = new WebengageBridge(null);
            }
        }
        return INSTANCE;
    }

    private List<Object> recursivelyDeconstructReadableArray(ReadableArray readableArray) {
        ArrayList arrayList = new ArrayList(readableArray.size());
        for (int i10 = 0; i10 < readableArray.size(); i10++) {
            switch (b.f30120a[readableArray.getType(i10).ordinal()]) {
                case 1:
                    arrayList.add(i10, null);
                    break;
                case 2:
                    arrayList.add(i10, Boolean.valueOf(readableArray.getBoolean(i10)));
                    break;
                case 3:
                    arrayList.add(i10, Double.valueOf(readableArray.getDouble(i10)));
                    break;
                case 4:
                    String string = readableArray.getString(i10);
                    if (string.length() == DATE_FORMAT_LENGTH) {
                        Date date = getDate(string);
                        if (date != null) {
                            arrayList.add(i10, date);
                            break;
                        } else {
                            arrayList.add(i10, string);
                            break;
                        }
                    } else {
                        arrayList.add(i10, string);
                        break;
                    }
                case 5:
                    arrayList.add(i10, recursivelyDeconstructReadableMap(readableArray.getMap(i10)));
                    break;
                case 6:
                    arrayList.add(i10, recursivelyDeconstructReadableArray(readableArray.getArray(i10)));
                    break;
                default:
                    Logger.e(TAG, "Could not convert object at index " + i10);
                    break;
            }
        }
        return arrayList;
    }

    private Map<String, Object> recursivelyDeconstructReadableMap(ReadableMap readableMap) {
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        HashMap hashMap = new HashMap();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            switch (b.f30120a[readableMap.getType(nextKey).ordinal()]) {
                case 1:
                    hashMap.put(nextKey, null);
                    break;
                case 2:
                    hashMap.put(nextKey, Boolean.valueOf(readableMap.getBoolean(nextKey)));
                    break;
                case 3:
                    hashMap.put(nextKey, Double.valueOf(readableMap.getDouble(nextKey)));
                    break;
                case 4:
                    String string = readableMap.getString(nextKey);
                    if (string.length() != DATE_FORMAT_LENGTH) {
                        hashMap.put(nextKey, string);
                        break;
                    } else {
                        Date date = getDate(string);
                        if (date == null) {
                            hashMap.put(nextKey, string);
                            break;
                        } else {
                            hashMap.put(nextKey, date);
                            break;
                        }
                    }
                case 5:
                    hashMap.put(nextKey, recursivelyDeconstructReadableMap(readableMap.getMap(nextKey)));
                    break;
                case 6:
                    hashMap.put(nextKey, recursivelyDeconstructReadableArray(readableMap.getArray(nextKey)));
                    break;
                default:
                    Logger.e(TAG, "Could not convert object with key: " + nextKey);
                    break;
            }
        }
        return hashMap;
    }

    public static void sendEvent(ReactContext reactContext, String str, WritableMap writableMap) {
        try {
            if (listenerCount <= 0 || reactContext == null) {
                Logger.d(TAG, "QUEUEING event: " + str);
                queuedMap.put(str, writableMap);
            } else if (reactContext.hasCatalystInstance()) {
                Logger.d(TAG, "Bridge hasActiveCatalystInstance");
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMap);
            } else {
                try {
                    Logger.d(TAG, "Using bridgeless mode for emitting event");
                    ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMap);
                } catch (UnsupportedOperationException e10) {
                    Logger.d(TAG, "Bridgeless mode not supported: " + e10.getMessage());
                    queuedMap.put(str, writableMap);
                }
            }
        } catch (Exception e11) {
            Logger.d(TAG, "ERROR: " + e11);
            queuedMap.put(str, writableMap);
        }
    }

    @ReactMethod
    public void deleteAttribute(String str) {
        WebEngage.get().user().deleteAttribute(str);
    }

    @ReactMethod
    public void deleteAttributes(ReadableArray readableArray) {
        int size = readableArray.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            if (readableArray.getType(i10) == ReadableType.String) {
                arrayList.add(readableArray.getString(i10));
            } else {
                Logger.e(TAG, "Invalid data type at index " + i10 + ", key must be String.");
            }
        }
        WebEngage.get().user().deleteAttributes(arrayList);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return TAG;
    }

    @ReactMethod
    public void init(boolean z10) {
        WebEngage.registerPushNotificationCallback(this);
        WebEngage.registerInAppNotificationCallback(this);
        WebEngage.registerWESecurityCallback(this);
    }

    @ReactMethod
    public void login(String str) {
        Logger.d(TAG, "login without jwt: " + str);
        WebEngage.get().user().login(str);
    }

    @ReactMethod
    public void loginWithSecureToken(String str, String str2) {
        Logger.d(TAG, "login with jwt: " + str + "| JWT -  " + str2);
        WebEngage.get().user().login(str, str2);
    }

    @ReactMethod
    public void logout() {
        WebEngage.get().user().logout();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
    
        r9 = null;
     */
    @Override // com.webengage.sdk.android.callbacks.InAppNotificationCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onInAppNotificationClicked(Context context, InAppNotificationData inAppNotificationData, String str) {
        String str2;
        Logger.d(TAG, "action id: " + str);
        JSONObject data = inAppNotificationData.getData();
        String str3 = null;
        List<String> list = null;
        str3 = null;
        try {
            JSONArray jSONArray = data.isNull("actions") ? null : data.getJSONArray("actions");
            if (jSONArray != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= jSONArray.length()) {
                        break;
                    }
                    JSONObject jSONObject = jSONArray.getJSONObject(i10);
                    String optString = jSONObject.isNull("actionEId") ? null : jSONObject.optString("actionEId");
                    if (optString == null || !optString.equals(str)) {
                        i10++;
                    } else if (!jSONObject.isNull("actionLink")) {
                        str2 = jSONObject.getString("actionLink");
                    }
                }
                try {
                    list = Uri.parse(str2).getPathSegments();
                } catch (Exception unused) {
                }
                if (list != null) {
                    try {
                        if (list.size() > 1) {
                            str3 = list.get(1);
                            Logger.d(TAG, "action link: " + str3);
                        }
                    } catch (JSONException e10) {
                        str3 = str2;
                        e = e10;
                        Logger.e(TAG, "JSONException while getting action link from in-app notification data", e);
                        WritableMap convertJsonObjectToWriteable = convertJsonObjectToWriteable(data);
                        convertJsonObjectToWriteable.putString("deepLink", str3);
                        convertJsonObjectToWriteable.putString("clickId", str);
                        sendEvent(this.reactApplicationContext, "notificationClicked", convertJsonObjectToWriteable);
                        return false;
                    }
                }
                str3 = str2;
                Logger.d(TAG, "action link: " + str3);
            }
        } catch (JSONException e11) {
            e = e11;
        }
        WritableMap convertJsonObjectToWriteable2 = convertJsonObjectToWriteable(data);
        convertJsonObjectToWriteable2.putString("deepLink", str3);
        convertJsonObjectToWriteable2.putString("clickId", str);
        sendEvent(this.reactApplicationContext, "notificationClicked", convertJsonObjectToWriteable2);
        return false;
    }

    @Override // com.webengage.sdk.android.callbacks.InAppNotificationCallbacks
    public void onInAppNotificationDismissed(Context context, InAppNotificationData inAppNotificationData) {
        sendEvent(this.reactApplicationContext, "notificationDismissed", convertJsonObjectToWriteable(inAppNotificationData.getData()));
    }

    @Override // com.webengage.sdk.android.callbacks.InAppNotificationCallbacks
    public InAppNotificationData onInAppNotificationPrepared(Context context, InAppNotificationData inAppNotificationData) {
        sendEvent(this.reactApplicationContext, "notificationPrepared", convertJsonObjectToWriteable(inAppNotificationData.getData()));
        return inAppNotificationData;
    }

    @Override // com.webengage.sdk.android.callbacks.InAppNotificationCallbacks
    public void onInAppNotificationShown(Context context, InAppNotificationData inAppNotificationData) {
        WritableMap convertJsonObjectToWriteable = convertJsonObjectToWriteable(inAppNotificationData.getData());
        Logger.d(TAG, "in-app notification data: " + convertJsonObjectToWriteable);
        sendEvent(this.reactApplicationContext, "notificationShown", convertJsonObjectToWriteable);
    }

    @ReactMethod
    public void onMessageReceived(ReadableMap readableMap) {
        Map<String, Object> recursivelyDeconstructReadableMap = recursivelyDeconstructReadableMap(readableMap);
        Logger.d(TAG, "onMessageReceived " + recursivelyDeconstructReadableMap);
        Map<String, String> map = (Map) recursivelyDeconstructReadableMap.get("data");
        if (map != null && map.containsKey("source") && "webengage".equals(map.get("source"))) {
            WebEngage.get().receive(map);
        }
    }

    @Override // com.webengage.sdk.android.callbacks.PushNotificationCallbacks
    public boolean onPushNotificationActionClicked(Context context, PushNotificationData pushNotificationData, String str) {
        WritableMap fromBundle = Arguments.fromBundle(pushNotificationData.getCustomData());
        fromBundle.putMap("userData", convertJsonObjectToWriteable(pushNotificationData.getPushPayloadJSON()));
        fromBundle.putString("deeplink", pushNotificationData.getCallToActionById(str).getAction());
        sendEvent(this.reactApplicationContext, "pushNotificationClicked", fromBundle);
        return false;
    }

    @Override // com.webengage.sdk.android.callbacks.PushNotificationCallbacks
    public boolean onPushNotificationClicked(Context context, PushNotificationData pushNotificationData) {
        WritableMap fromBundle = Arguments.fromBundle(pushNotificationData.getCustomData());
        fromBundle.putMap("userData", convertJsonObjectToWriteable(pushNotificationData.getPushPayloadJSON()));
        fromBundle.putString("deeplink", pushNotificationData.getPrimeCallToAction().getAction());
        sendEvent(this.reactApplicationContext, "pushNotificationClicked", fromBundle);
        return false;
    }

    @Override // com.webengage.sdk.android.callbacks.PushNotificationCallbacks
    public void onPushNotificationDismissed(Context context, PushNotificationData pushNotificationData) {
        WritableMap fromBundle = Arguments.fromBundle(pushNotificationData.getCustomData());
        fromBundle.putMap("userData", convertJsonObjectToWriteable(pushNotificationData.getPushPayloadJSON()));
        fromBundle.putString("deeplink", pushNotificationData.getPrimeCallToAction().getAction());
        sendEvent(this.reactApplicationContext, "pushNotificationDismissed", fromBundle);
    }

    @Override // com.webengage.sdk.android.callbacks.PushNotificationCallbacks
    public PushNotificationData onPushNotificationReceived(Context context, PushNotificationData pushNotificationData) {
        WritableMap fromBundle = Arguments.fromBundle(pushNotificationData.getCustomData());
        fromBundle.putMap("userData", convertJsonObjectToWriteable(pushNotificationData.getPushPayloadJSON()));
        fromBundle.putString("deeplink", pushNotificationData.getPrimeCallToAction().getAction());
        return pushNotificationData;
    }

    @Override // com.webengage.sdk.android.callbacks.PushNotificationCallbacks
    public void onPushNotificationShown(Context context, PushNotificationData pushNotificationData) {
        WritableMap fromBundle = Arguments.fromBundle(pushNotificationData.getCustomData());
        fromBundle.putMap("userData", convertJsonObjectToWriteable(pushNotificationData.getPushPayloadJSON()));
        fromBundle.putString("deeplink", pushNotificationData.getPrimeCallToAction().getAction());
        sendEvent(this.reactApplicationContext, "pushNotificationShown", fromBundle);
    }

    @Override // com.webengage.sdk.android.callbacks.WESecurityCallback
    public void onSecurityException(Map<String, Object> map) {
        Logger.d("WebEngage", "onSecurity Exception!!!");
        sendEvent(this.reactApplicationContext, "tokenInvalidated", convertMapToWritableMap(map));
    }

    public void registerWEStateChangeCallback() {
        if (this.reactApplicationContext != null) {
            WebEngage.registerStateChangeCallback(new a());
        }
    }

    @ReactMethod
    public void screenNavigated(String str) {
        WebEngage.get().analytics().screenNavigated(str);
    }

    @ReactMethod
    public void screenNavigatedWithData(String str, ReadableMap readableMap) {
        WebEngage.get().analytics().screenNavigated(str, recursivelyDeconstructReadableMap(readableMap));
    }

    @ReactMethod
    public void sendFcmToken(String str) {
        WebEngage.get().setRegistrationID(str);
    }

    @ReactMethod
    public void setAttribute(ReadableMap readableMap) {
        new JSONObject();
        Map<String, ? extends Object> recursivelyDeconstructReadableMap = recursivelyDeconstructReadableMap(readableMap);
        Logger.d(TAG, "Setting user attributes: " + recursivelyDeconstructReadableMap);
        WebEngage.get().user().setAttributes(recursivelyDeconstructReadableMap);
    }

    @ReactMethod
    public void setBirthDateString(String str) {
        WebEngage.get().user().setBirthDate(str);
    }

    @ReactMethod
    public void setCompany(String str) {
        WebEngage.get().user().setCompany(str);
    }

    @ReactMethod
    public void setDevicePushOptIn(Boolean bool) {
        WebEngage.get().user().setDevicePushOptIn(bool.booleanValue());
    }

    @ReactMethod
    public void setEmail(String str) {
        WebEngage.get().user().setEmail(str);
    }

    @ReactMethod
    public void setFirstName(String str) {
        WebEngage.get().user().setFirstName(str);
    }

    @ReactMethod
    public void setGender(String str) {
        WebEngage.get().user().setGender(Gender.valueByString(str));
    }

    @ReactMethod
    public void setHashedEmail(String str) {
        WebEngage.get().user().setHashedEmail(str);
    }

    @ReactMethod
    public void setHashedPhone(String str) {
        WebEngage.get().user().setHashedPhoneNumber(str);
    }

    @ReactMethod
    public void setLastName(String str) {
        WebEngage.get().user().setLastName(str);
    }

    @ReactMethod
    public void setLocation(Double d10, Double d11) {
        WebEngage.get().user().setLocation(d10.doubleValue(), d11.doubleValue());
    }

    @ReactMethod
    public void setOptIn(String str, boolean z10) {
        if ("push".equalsIgnoreCase(str)) {
            WebEngage.get().user().setOptIn(Channel.PUSH, z10);
            return;
        }
        if ("sms".equalsIgnoreCase(str)) {
            WebEngage.get().user().setOptIn(Channel.SMS, z10);
            return;
        }
        if ("email".equalsIgnoreCase(str)) {
            WebEngage.get().user().setOptIn(Channel.EMAIL, z10);
            return;
        }
        if ("in_app".equalsIgnoreCase(str)) {
            WebEngage.get().user().setOptIn(Channel.IN_APP, z10);
            return;
        }
        if ("whatsapp".equalsIgnoreCase(str)) {
            WebEngage.get().user().setOptIn(Channel.WHATSAPP, z10);
            return;
        }
        if ("viber".equalsIgnoreCase(str)) {
            WebEngage.get().user().setOptIn(Channel.VIBER, z10);
            return;
        }
        Logger.e(TAG, "Invalid channel: " + str + ". Must be one of [push, sms, email, in_app, whatsapp, viber].");
    }

    @ReactMethod
    public void setPhone(String str) {
        WebEngage.get().user().setPhoneNumber(str);
    }

    public void setReactNativeContext(ReactApplicationContext reactApplicationContext) {
        listenerCount = 0;
        this.reactApplicationContext = reactApplicationContext;
        registerWEStateChangeCallback();
    }

    @ReactMethod
    public void setSecureToken(String str, String str2) {
        Logger.d(TAG, "setSecureToken updating token- " + str2 + " | for id - " + str);
        WebEngage.get().setSecurityToken(str, str2);
    }

    @ReactMethod
    public void startGAIDTracking() {
        WebEngage.get().startGAIDTracking();
    }

    @ReactMethod
    public void trackEventWithName(String str) {
        WebEngage.get().analytics().track(str);
    }

    @ReactMethod
    public void trackEventWithNameAndData(String str, ReadableMap readableMap) {
        WebEngage.get().analytics().track(str, recursivelyDeconstructReadableMap(readableMap));
    }

    @ReactMethod
    public void updateListenerCount() {
        listenerCount++;
        Logger.e(TAG, "updateListenerCount: " + listenerCount);
        synchronized (lock) {
            try {
                if (listenerCount > 0) {
                    HashMap hashMap = new HashMap();
                    hashMap.putAll(queuedMap);
                    for (Map.Entry entry : hashMap.entrySet()) {
                        sendEvent(this.reactApplicationContext, (String) entry.getKey(), (WritableMap) entry.getValue());
                        queuedMap.remove(entry.getKey());
                        Logger.d(TAG, "Sending queued event: " + ((String) entry.getKey()));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static WebengageBridge getInstance(ReactApplicationContext reactApplicationContext) {
        Logger.d(TAG, "getInstance: " + reactApplicationContext);
        if (INSTANCE == null) {
            synchronized (lock) {
                INSTANCE = new WebengageBridge(reactApplicationContext);
            }
        }
        return INSTANCE;
    }
}
