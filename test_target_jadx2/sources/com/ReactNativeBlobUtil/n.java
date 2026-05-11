package com.ReactNativeBlobUtil;

import Td.B;
import android.net.Uri;
import android.util.Base64;
import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static X509TrustManager f19961a;

    class a implements HostnameVerifier {
        a() {
        }

        @Override // javax.net.ssl.HostnameVerifier
        public boolean verify(String str, SSLSession sSLSession) {
            return true;
        }
    }

    public static void a(String str) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString(Keys.EVENT, "warn");
        createMap.putString("detail", str);
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) e.f19857b.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("ReactNativeBlobUtilMessage", createMap);
    }

    public static String b(String str) {
        try {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(str.getBytes());
                byte[] digest = messageDigest.digest();
                StringBuilder sb2 = new StringBuilder();
                for (byte b10 : digest) {
                    sb2.append(String.format(Locale.ROOT, "%02x", Integer.valueOf(b10 & 255)));
                }
                return sb2.toString();
            } catch (Exception e10) {
                e10.printStackTrace();
                return null;
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    public static B.a c(B b10) {
        try {
            X509TrustManager x509TrustManager = f19961a;
            if (x509TrustManager == null) {
                throw new IllegalStateException("Use of own trust manager but none defined");
            }
            TrustManager[] trustManagerArr = {x509TrustManager};
            SSLContext sSLContext = SSLContext.getInstance("SSL");
            sSLContext.init(null, trustManagerArr, new SecureRandom());
            SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
            B.a A10 = b10.A();
            A10.h0(socketFactory, f19961a);
            A10.Y(new a());
            return A10;
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    public static boolean d(String str) {
        return str != null && str.startsWith("bundle-assets://");
    }

    public static boolean e(String str) {
        return str != null && str.startsWith("content://");
    }

    public static String f(String str) {
        if (str == null) {
            return null;
        }
        if (!str.matches("\\w+\\:.*")) {
            return str;
        }
        if (str.startsWith("file://")) {
            return str.replace("file://", BuildConfig.FLAVOR);
        }
        return str.startsWith("bundle-assets://") ? str : N1.c.c(e.f19857b, Uri.parse(str));
    }

    public static byte[] g(String str, String str2) {
        return str2.equalsIgnoreCase("ascii") ? str.getBytes(Charset.forName("US-ASCII")) : str2.toLowerCase(Locale.ROOT).contains("base64") ? Base64.decode(str, 2) : str2.equalsIgnoreCase("utf8") ? str.getBytes(Charset.forName("UTF-8")) : str.getBytes(Charset.forName("US-ASCII"));
    }
}
