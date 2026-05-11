package com.sslpublickeypinning;

import Td.B;
import Td.C1231g;
import Td.D;
import Td.F;
import Td.x;
import android.util.Log;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.network.NetworkingModule;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import javax.net.ssl.SSLPeerUnverifiedException;

/* loaded from: classes2.dex */
public class SslPublicKeyPinningModule extends SslPublicKeyPinningSpec implements x {
    private static final String EXPIRATION_DATE_KEY = "expirationDate";
    private static final String INCLUDE_SUBDOMAINS_KEY = "includeSubdomains";
    public static final String NAME = "SslPublicKeyPinning";
    private static final String PUBLIC_KEY_HASHES_KEY = "publicKeyHashes";
    private static final String SSL_PINNING_ERROR_EVENT_NAME = "pinning-error";
    private static final String SSL_PINNING_ERROR_MESSAGE_EVENT_KEY = "message";
    private static final String SSL_PINNING_ERROR_SERVER_HOSTNAME_EVENT_KEY = "serverHostname";
    private static C1231g certificatePinner = null;
    private static boolean isCustomClientBuilderInitialized = false;

    public SslPublicKeyPinningModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public static C1231g getCertificatePinner() {
        return certificatePinner;
    }

    private static NetworkingModule.e getPreviousCustomClientBuilder() {
        try {
            Field declaredField = NetworkingModule.class.getDeclaredField("customClientBuilder");
            declaredField.setAccessible(true);
            android.support.v4.media.session.b.a(declaredField.get(null));
            return null;
        } catch (Throwable th) {
            Log.e("SslPublicKeyPinning", "Unable to retrieve previous custom client builder", th);
            return null;
        }
    }

    private static void initializeCertificatePinner(ReadableMap readableMap) {
        C1231g.a aVar = new C1231g.a();
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            ReadableMap map = readableMap.getMap(nextKey);
            if (map != null) {
                String string = map.getString(EXPIRATION_DATE_KEY);
                if (string != null) {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
                    simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                    Date parse = simpleDateFormat.parse(string);
                    if (parse != null && System.currentTimeMillis() > parse.getTime()) {
                        Log.w("SslPublicKeyPinning", "Ignoring pinning configuration for " + nextKey + " as it has expired");
                    }
                }
                boolean z10 = map.hasKey(INCLUDE_SUBDOMAINS_KEY) && map.getBoolean(INCLUDE_SUBDOMAINS_KEY);
                ReadableArray array = map.getArray(PUBLIC_KEY_HASHES_KEY);
                if (array != null) {
                    int size = array.size();
                    String[] strArr = new String[size];
                    for (int i10 = 0; i10 < size; i10++) {
                        strArr[i10] = "sha256/" + array.getString(i10);
                    }
                    if (z10) {
                        nextKey = "**." + nextKey;
                    }
                    aVar.a(nextKey, strArr);
                }
            }
        }
        certificatePinner = aVar.b();
    }

    private void initializeCustomClientBuilder() {
        if (isCustomClientBuilderInitialized) {
            return;
        }
        isCustomClientBuilderInitialized = true;
        getPreviousCustomClientBuilder();
        final NetworkingModule.e eVar = null;
        NetworkingModule.setCustomClientBuilder(new com.facebook.react.modules.network.c(eVar) { // from class: com.sslpublickeypinning.a
            @Override // com.facebook.react.modules.network.c
            public final void a(B.a aVar) {
                SslPublicKeyPinningModule.this.lambda$initializeCustomClientBuilder$0(null, aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initializeCustomClientBuilder$0(NetworkingModule.e eVar, B.a aVar) {
        if (eVar != null) {
            eVar.a(aVar);
        }
        C1231g c1231g = certificatePinner;
        if (c1231g != null) {
            aVar.f(c1231g).a(this);
        }
    }

    @Override // com.sslpublickeypinning.NativeSslPublicKeyPinningSpec
    @ReactMethod
    public void addListener(String str) {
    }

    @Override // com.sslpublickeypinning.NativeSslPublicKeyPinningSpec
    @ReactMethod
    public void disable(Promise promise) {
        certificatePinner = null;
        promise.resolve(null);
    }

    public void emitPinningErrorEvent(D d10, String str) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString(SSL_PINNING_ERROR_SERVER_HOSTNAME_EVENT_KEY, d10.n().w().getHost());
        if (str != null) {
            writableNativeMap.putString(SSL_PINNING_ERROR_MESSAGE_EVENT_KEY, str);
        }
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(SSL_PINNING_ERROR_EVENT_NAME, writableNativeMap);
    }

    @Override // com.sslpublickeypinning.NativeSslPublicKeyPinningSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "SslPublicKeyPinning";
    }

    @Override // com.sslpublickeypinning.NativeSslPublicKeyPinningSpec
    @ReactMethod
    public void initialize(ReadableMap readableMap, Promise promise) {
        try {
            initializeCertificatePinner(readableMap);
            initializeCustomClientBuilder();
            promise.resolve(null);
        } catch (Throwable th) {
            promise.reject(th);
        }
    }

    @Override // Td.x
    public F intercept(x.a aVar) {
        D t10 = aVar.t();
        try {
            return aVar.a(t10);
        } catch (SSLPeerUnverifiedException e10) {
            String message = e10.getMessage();
            if (message != null && message.startsWith("Certificate pinning failure")) {
                emitPinningErrorEvent(t10, message);
            }
            throw e10;
        }
    }

    @Override // com.sslpublickeypinning.NativeSslPublicKeyPinningSpec
    @ReactMethod
    public void removeListeners(double d10) {
    }
}
