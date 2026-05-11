package com.facebook.react.modules.websocket;

import Td.B;
import Td.D;
import Td.F;
import Td.J;
import Td.K;
import c3.AbstractC1721a;
import co.hyperverge.hypersnapsdk.utils.AppConstants;
import com.facebook.fbreact.specs.NativeWebSocketModuleSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.network.c;
import com.facebook.react.modules.network.e;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import org.conscrypt.BuildConfig;
import pe.C3880h;

@K4.a(name = NativeWebSocketModuleSpec.NAME)
/* loaded from: classes.dex */
public final class WebSocketModule extends NativeWebSocketModuleSpec {
    private static c customClientBuilder;
    private final Map<Integer, b> mContentHandlers;
    private e mCookieHandler;
    private final Map<Integer, J> mWebSocketConnections;

    class a extends K {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f21876a;

        a(int i10) {
            this.f21876a = i10;
        }

        @Override // Td.K
        public void a(J j10, int i10, String str) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("id", this.f21876a);
            createMap.putInt(AppConstants.RETAKE_ERROR_CODE, i10);
            createMap.putString("reason", str);
            WebSocketModule.this.sendEvent("websocketClosed", createMap);
        }

        @Override // Td.K
        public void b(J j10, int i10, String str) {
            j10.f(i10, str);
        }

        @Override // Td.K
        public void c(J j10, Throwable th, F f10) {
            WebSocketModule.this.notifyWebSocketFailed(this.f21876a, th.getMessage());
        }

        @Override // Td.K
        public void d(J j10, String str) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("id", this.f21876a);
            createMap.putString("type", "text");
            b bVar = (b) WebSocketModule.this.mContentHandlers.get(Integer.valueOf(this.f21876a));
            if (bVar != null) {
                bVar.b(str, createMap);
            } else {
                createMap.putString("data", str);
            }
            WebSocketModule.this.sendEvent("websocketMessage", createMap);
        }

        @Override // Td.K
        public void e(J j10, C3880h c3880h) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("id", this.f21876a);
            createMap.putString("type", "binary");
            b bVar = (b) WebSocketModule.this.mContentHandlers.get(Integer.valueOf(this.f21876a));
            if (bVar != null) {
                bVar.a(c3880h, createMap);
            } else {
                createMap.putString("data", c3880h.b());
            }
            WebSocketModule.this.sendEvent("websocketMessage", createMap);
        }

        @Override // Td.K
        public void f(J j10, F f10) {
            WebSocketModule.this.mWebSocketConnections.put(Integer.valueOf(this.f21876a), j10);
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("id", this.f21876a);
            createMap.putString("protocol", f10.n("Sec-WebSocket-Protocol", BuildConfig.FLAVOR));
            WebSocketModule.this.sendEvent("websocketOpen", createMap);
        }
    }

    public interface b {
        void a(C3880h c3880h, WritableMap writableMap);

        void b(String str, WritableMap writableMap);
    }

    public WebSocketModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mWebSocketConnections = new ConcurrentHashMap();
        this.mContentHandlers = new ConcurrentHashMap();
        this.mCookieHandler = new e(reactApplicationContext);
    }

    private static void applyCustomBuilder(B.a aVar) {
        c cVar = customClientBuilder;
        if (cVar != null) {
            cVar.a(aVar);
        }
    }

    private String getCookie(String str) {
        try {
            List list = (List) this.mCookieHandler.get(new URI(getDefaultOrigin(str)), new HashMap()).get("Cookie");
            if (list != null && !list.isEmpty()) {
                return (String) list.get(0);
            }
            return null;
        } catch (IOException | URISyntaxException unused) {
            throw new IllegalArgumentException("Unable to get cookie from " + str);
        }
    }

    private static String getDefaultOrigin(String str) {
        char c10;
        try {
            String str2 = BuildConfig.FLAVOR;
            URI uri = new URI(str);
            String scheme = uri.getScheme();
            int hashCode = scheme.hashCode();
            if (hashCode == 3804) {
                if (scheme.equals("ws")) {
                    c10 = 1;
                }
                c10 = 65535;
            } else if (hashCode == 118039) {
                if (scheme.equals("wss")) {
                    c10 = 0;
                }
                c10 = 65535;
            } else if (hashCode != 3213448) {
                if (hashCode == 99617003 && scheme.equals("https")) {
                    c10 = 3;
                }
                c10 = 65535;
            } else {
                if (scheme.equals("http")) {
                    c10 = 2;
                }
                c10 = 65535;
            }
            if (c10 == 0) {
                str2 = BuildConfig.FLAVOR + "https";
            } else if (c10 == 1) {
                str2 = BuildConfig.FLAVOR + "http";
            } else if (c10 == 2 || c10 == 3) {
                str2 = BuildConfig.FLAVOR + uri.getScheme();
            }
            return uri.getPort() != -1 ? String.format("%s://%s:%s", str2, uri.getHost(), Integer.valueOf(uri.getPort())) : String.format("%s://%s", str2, uri.getHost());
        } catch (URISyntaxException unused) {
            throw new IllegalArgumentException("Unable to set " + str + " as default origin header");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyWebSocketFailed(int i10, String str) {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("id", i10);
        createMap.putString("message", str);
        sendEvent("websocketFailed", createMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendEvent(String str, WritableMap writableMap) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        if (reactApplicationContext.hasActiveReactInstance()) {
            reactApplicationContext.emitDeviceEvent(str, writableMap);
        }
    }

    public static void setCustomClientBuilder(c cVar) {
        customClientBuilder = cVar;
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void addListener(String str) {
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void close(double d10, String str, double d11) {
        int i10 = (int) d11;
        J j10 = this.mWebSocketConnections.get(Integer.valueOf(i10));
        if (j10 == null) {
            return;
        }
        try {
            j10.f((int) d10, str);
            this.mWebSocketConnections.remove(Integer.valueOf(i10));
            this.mContentHandlers.remove(Integer.valueOf(i10));
        } catch (Exception e10) {
            AbstractC1721a.n("ReactNative", "Could not close WebSocket connection for id " + i10, e10);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void connect(String str, ReadableArray readableArray, ReadableMap readableMap, double d10) {
        boolean z10;
        int i10 = (int) d10;
        B.a aVar = new B.a();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        B.a d02 = aVar.g(10L, timeUnit).i0(10L, timeUnit).d0(0L, TimeUnit.MINUTES);
        applyCustomBuilder(d02);
        B c10 = d02.c();
        D.a x10 = new D.a().v(Integer.valueOf(i10)).x(str);
        String cookie = getCookie(str);
        if (cookie != null) {
            x10.a("Cookie", cookie);
        }
        if (readableMap != null && readableMap.hasKey("headers") && readableMap.getType("headers").equals(ReadableType.Map)) {
            ReadableMap map = readableMap.getMap("headers");
            ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
            z10 = false;
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                if (ReadableType.String.equals(map.getType(nextKey))) {
                    if (nextKey.equalsIgnoreCase("origin")) {
                        z10 = true;
                    }
                    x10.a(nextKey, map.getString(nextKey));
                } else {
                    AbstractC1721a.J("ReactNative", "Ignoring: requested " + nextKey + ", value not a string");
                }
            }
        } else {
            z10 = false;
        }
        if (!z10) {
            x10.a("origin", getDefaultOrigin(str));
        }
        if (readableArray != null && readableArray.size() > 0) {
            StringBuilder sb2 = new StringBuilder(BuildConfig.FLAVOR);
            for (int i11 = 0; i11 < readableArray.size(); i11++) {
                String trim = readableArray.getString(i11).trim();
                if (!trim.isEmpty() && !trim.contains(",")) {
                    sb2.append(trim);
                    sb2.append(",");
                }
            }
            if (sb2.length() > 0) {
                sb2.replace(sb2.length() - 1, sb2.length(), BuildConfig.FLAVOR);
                x10.a("Sec-WebSocket-Protocol", sb2.toString());
            }
        }
        c10.B(x10.b(), new a(i10));
        c10.o().c().shutdown();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        Iterator<J> it = this.mWebSocketConnections.values().iterator();
        while (it.hasNext()) {
            it.next().f(1001, null);
        }
        this.mWebSocketConnections.clear();
        this.mContentHandlers.clear();
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void ping(double d10) {
        int i10 = (int) d10;
        J j10 = this.mWebSocketConnections.get(Integer.valueOf(i10));
        if (j10 != null) {
            try {
                j10.b(C3880h.f38684e);
                return;
            } catch (Exception e10) {
                notifyWebSocketFailed(i10, e10.getMessage());
                return;
            }
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("id", i10);
        createMap.putString("message", "client is null");
        sendEvent("websocketFailed", createMap);
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putInt("id", i10);
        createMap2.putInt(AppConstants.RETAKE_ERROR_CODE, 0);
        createMap2.putString("reason", "client is null");
        sendEvent("websocketClosed", createMap2);
        this.mWebSocketConnections.remove(Integer.valueOf(i10));
        this.mContentHandlers.remove(Integer.valueOf(i10));
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void removeListeners(double d10) {
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void send(String str, double d10) {
        int i10 = (int) d10;
        J j10 = this.mWebSocketConnections.get(Integer.valueOf(i10));
        if (j10 != null) {
            try {
                j10.a(str);
                return;
            } catch (Exception e10) {
                notifyWebSocketFailed(i10, e10.getMessage());
                return;
            }
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("id", i10);
        createMap.putString("message", "client is null");
        sendEvent("websocketFailed", createMap);
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putInt("id", i10);
        createMap2.putInt(AppConstants.RETAKE_ERROR_CODE, 0);
        createMap2.putString("reason", "client is null");
        sendEvent("websocketClosed", createMap2);
        this.mWebSocketConnections.remove(Integer.valueOf(i10));
        this.mContentHandlers.remove(Integer.valueOf(i10));
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void sendBinary(String str, double d10) {
        int i10 = (int) d10;
        J j10 = this.mWebSocketConnections.get(Integer.valueOf(i10));
        if (j10 != null) {
            try {
                j10.b(C3880h.d(str));
                return;
            } catch (Exception e10) {
                notifyWebSocketFailed(i10, e10.getMessage());
                return;
            }
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("id", i10);
        createMap.putString("message", "client is null");
        sendEvent("websocketFailed", createMap);
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putInt("id", i10);
        createMap2.putInt(AppConstants.RETAKE_ERROR_CODE, 0);
        createMap2.putString("reason", "client is null");
        sendEvent("websocketClosed", createMap2);
        this.mWebSocketConnections.remove(Integer.valueOf(i10));
        this.mContentHandlers.remove(Integer.valueOf(i10));
    }

    public void setContentHandler(int i10, b bVar) {
        if (bVar != null) {
            this.mContentHandlers.put(Integer.valueOf(i10), bVar);
        } else {
            this.mContentHandlers.remove(Integer.valueOf(i10));
        }
    }

    public void sendBinary(C3880h c3880h, int i10) {
        J j10 = this.mWebSocketConnections.get(Integer.valueOf(i10));
        if (j10 == null) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("id", i10);
            createMap.putString("message", "client is null");
            sendEvent("websocketFailed", createMap);
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putInt("id", i10);
            createMap2.putInt(AppConstants.RETAKE_ERROR_CODE, 0);
            createMap2.putString("reason", "client is null");
            sendEvent("websocketClosed", createMap2);
            this.mWebSocketConnections.remove(Integer.valueOf(i10));
            this.mContentHandlers.remove(Integer.valueOf(i10));
            return;
        }
        try {
            j10.b(c3880h);
        } catch (Exception e10) {
            notifyWebSocketFailed(i10, e10.getMessage());
        }
    }
}
