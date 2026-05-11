package com.facebook.react.modules.network;

import Td.A;
import Td.B;
import Td.D;
import Td.E;
import Td.F;
import Td.G;
import Td.InterfaceC1229e;
import Td.InterfaceC1230f;
import Td.v;
import Td.x;
import Td.y;
import Td.z;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import c3.AbstractC1721a;
import com.facebook.fbreact.specs.NativeNetworkingAndroidSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.conscrypt.BuildConfig;
import pe.C3880h;
import pe.M;
import pe.r;
import z4.C5254a;

@K4.a(name = "Networking")
/* loaded from: classes.dex */
public final class NetworkingModule extends NativeNetworkingAndroidSpec {
    private static final int CHUNK_TIMEOUT_NS = 100000000;
    private static final String CONTENT_ENCODING_HEADER_NAME = "content-encoding";
    private static final String CONTENT_TYPE_HEADER_NAME = "content-type";
    private static final int MAX_CHUNK_SIZE_BETWEEN_FLUSHES = 8192;
    private static final String REQUEST_BODY_KEY_BASE64 = "base64";
    private static final String REQUEST_BODY_KEY_FORMDATA = "formData";
    private static final String REQUEST_BODY_KEY_STRING = "string";
    private static final String REQUEST_BODY_KEY_URI = "uri";
    private static final String TAG = "Networking";
    private static final String USER_AGENT_HEADER_NAME = "user-agent";
    private static com.facebook.react.modules.network.c customClientBuilder;
    private final B mClient;
    private final com.facebook.react.modules.network.e mCookieHandler;
    private final com.facebook.react.modules.network.a mCookieJarContainer;
    private final String mDefaultUserAgent;
    private final List<f> mRequestBodyHandlers;
    private final Set<Integer> mRequestIds;
    private final List<g> mResponseHandlers;
    private boolean mShuttingDown;
    private final List<h> mUriHandlers;

    class a implements j {

        /* renamed from: a, reason: collision with root package name */
        long f21820a = System.nanoTime();

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f21821b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ReactApplicationContext f21822c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f21823d;

        a(String str, ReactApplicationContext reactApplicationContext, int i10) {
            this.f21821b = str;
            this.f21822c = reactApplicationContext;
            this.f21823d = i10;
        }

        @Override // com.facebook.react.modules.network.j
        public void a(long j10, long j11, boolean z10) {
            long nanoTime = System.nanoTime();
            if ((z10 || NetworkingModule.shouldDispatch(nanoTime, this.f21820a)) && !this.f21821b.equals("text")) {
                p.c(this.f21822c, this.f21823d, j10, j11);
                this.f21820a = nanoTime;
            }
        }
    }

    class b implements InterfaceC1230f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f21825a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ReactApplicationContext f21826b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f21827c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f21828d;

        b(int i10, ReactApplicationContext reactApplicationContext, String str, boolean z10) {
            this.f21825a = i10;
            this.f21826b = reactApplicationContext;
            this.f21827c = str;
            this.f21828d = z10;
        }

        @Override // Td.InterfaceC1230f
        public void c(InterfaceC1229e interfaceC1229e, F f10) {
            if (NetworkingModule.this.mShuttingDown) {
                return;
            }
            NetworkingModule.this.removeRequest(this.f21825a);
            p.h(this.f21826b, this.f21825a, f10.f(), NetworkingModule.translateHeaders(f10.p()), f10.z().n().toString());
            try {
                G b10 = f10.b();
                if ("gzip".equalsIgnoreCase(f10.l("Content-Encoding")) && b10 != null) {
                    r rVar = new r(b10.j());
                    String l10 = f10.l("Content-Type");
                    b10 = G.g(l10 != null ? z.g(l10) : null, -1L, M.c(rVar));
                }
                for (g gVar : NetworkingModule.this.mResponseHandlers) {
                    if (gVar.b(this.f21827c)) {
                        p.a(this.f21826b, this.f21825a, gVar.a(b10));
                        p.g(this.f21826b, this.f21825a);
                        return;
                    }
                }
                if (this.f21828d && this.f21827c.equals("text")) {
                    NetworkingModule.this.readWithProgress(this.f21825a, b10);
                    p.g(this.f21826b, this.f21825a);
                    return;
                }
                String str = BuildConfig.FLAVOR;
                if (this.f21827c.equals("text")) {
                    try {
                        str = b10.l();
                    } catch (IOException e10) {
                        if (!f10.z().i().equalsIgnoreCase("HEAD")) {
                            p.f(this.f21826b, this.f21825a, e10.getMessage(), e10);
                        }
                    }
                } else if (this.f21827c.equals(NetworkingModule.REQUEST_BODY_KEY_BASE64)) {
                    str = Base64.encodeToString(b10.b(), 2);
                }
                p.b(this.f21826b, this.f21825a, str);
                p.g(this.f21826b, this.f21825a);
            } catch (IOException e11) {
                p.f(this.f21826b, this.f21825a, e11.getMessage(), e11);
            }
        }

        @Override // Td.InterfaceC1230f
        public void d(InterfaceC1229e interfaceC1229e, IOException iOException) {
            String str;
            if (NetworkingModule.this.mShuttingDown) {
                return;
            }
            NetworkingModule.this.removeRequest(this.f21825a);
            if (iOException.getMessage() != null) {
                str = iOException.getMessage();
            } else {
                str = "Error while executing request: " + iOException.getClass().getSimpleName();
            }
            p.f(this.f21826b, this.f21825a, str, iOException);
        }
    }

    class c implements j {

        /* renamed from: a, reason: collision with root package name */
        long f21830a = System.nanoTime();

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ReactApplicationContext f21831b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f21832c;

        c(ReactApplicationContext reactApplicationContext, int i10) {
            this.f21831b = reactApplicationContext;
            this.f21832c = i10;
        }

        @Override // com.facebook.react.modules.network.j
        public void a(long j10, long j11, boolean z10) {
            long nanoTime = System.nanoTime();
            if (z10 || NetworkingModule.shouldDispatch(nanoTime, this.f21830a)) {
                p.d(this.f21831b, this.f21832c, j10, j11);
                this.f21830a = nanoTime;
            }
        }
    }

    class d extends GuardedAsyncTask {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f21834a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ReactContext reactContext, int i10) {
            super(reactContext);
            this.f21834a = i10;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void doInBackgroundGuarded(Void... voidArr) {
            C5254a.a(NetworkingModule.this.mClient, Integer.valueOf(this.f21834a));
        }
    }

    public interface e extends com.facebook.react.modules.network.c {
    }

    public interface f {
        boolean a(ReadableMap readableMap);

        E b(ReadableMap readableMap, String str);
    }

    public interface g {
        WritableMap a(G g10);

        boolean b(String str);
    }

    public interface h {
        WritableMap a(Uri uri);

        boolean b(Uri uri, String str);
    }

    public NetworkingModule(ReactApplicationContext reactApplicationContext, String str, B b10, List<Object> list) {
        super(reactApplicationContext);
        this.mRequestBodyHandlers = new ArrayList();
        this.mUriHandlers = new ArrayList();
        this.mResponseHandlers = new ArrayList();
        if (list != null) {
            B.a A10 = b10.A();
            Iterator<Object> it = list.iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                throw null;
            }
            b10 = A10.c();
        }
        this.mClient = b10;
        this.mCookieHandler = new com.facebook.react.modules.network.e(reactApplicationContext);
        this.mCookieJarContainer = (com.facebook.react.modules.network.a) b10.n();
        this.mShuttingDown = false;
        this.mDefaultUserAgent = str;
        this.mRequestIds = new HashSet();
    }

    private synchronized void addRequest(int i10) {
        this.mRequestIds.add(Integer.valueOf(i10));
    }

    private static void applyCustomBuilder(B.a aVar) {
        com.facebook.react.modules.network.c cVar = customClientBuilder;
        if (cVar != null) {
            cVar.a(aVar);
        }
    }

    private synchronized void cancelAllRequests() {
        try {
            Iterator<Integer> it = this.mRequestIds.iterator();
            while (it.hasNext()) {
                cancelRequest(it.next().intValue());
            }
            this.mRequestIds.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    private void cancelRequest(int i10) {
        new d(getReactApplicationContext(), i10).execute(new Void[0]);
    }

    private A.a constructMultipartBody(ReadableArray readableArray, String str, int i10) {
        z zVar;
        A.a aVar = new A.a();
        aVar.f(z.g(str));
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        int size = readableArray.size();
        for (int i11 = 0; i11 < size; i11++) {
            ReadableMap map = readableArray.getMap(i11);
            v extractHeaders = extractHeaders(map.getArray("headers"), null);
            if (extractHeaders == null) {
                p.f(reactApplicationContextIfActiveOrWarn, i10, "Missing or invalid header format for FormData part.", null);
                return null;
            }
            String c10 = extractHeaders.c("content-type");
            if (c10 != null) {
                zVar = z.g(c10);
                extractHeaders = extractHeaders.m().i("content-type").f();
            } else {
                zVar = null;
            }
            if (map.hasKey(REQUEST_BODY_KEY_STRING)) {
                aVar.c(extractHeaders, E.create(zVar, map.getString(REQUEST_BODY_KEY_STRING)));
            } else if (!map.hasKey(REQUEST_BODY_KEY_URI)) {
                p.f(reactApplicationContextIfActiveOrWarn, i10, "Unrecognized FormData part.", null);
            } else {
                if (zVar == null) {
                    p.f(reactApplicationContextIfActiveOrWarn, i10, "Binary FormData part needs a content-type header.", null);
                    return null;
                }
                String string = map.getString(REQUEST_BODY_KEY_URI);
                InputStream h10 = o.h(getReactApplicationContext(), string);
                if (h10 == null) {
                    p.f(reactApplicationContextIfActiveOrWarn, i10, "Could not retrieve file for uri " + string, null);
                    return null;
                }
                aVar.c(extractHeaders, o.c(zVar, h10));
            }
        }
        return aVar;
    }

    private v extractHeaders(ReadableArray readableArray, ReadableMap readableMap) {
        String str;
        if (readableArray == null) {
            return null;
        }
        v.a aVar = new v.a();
        int size = readableArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ReadableArray array = readableArray.getArray(i10);
            if (array != null && array.size() == 2) {
                String a10 = com.facebook.react.modules.network.f.a(array.getString(0));
                String string = array.getString(1);
                if (a10 != null && string != null) {
                    aVar.e(a10, string);
                }
            }
            return null;
        }
        if (aVar.g(USER_AGENT_HEADER_NAME) == null && (str = this.mDefaultUserAgent) != null) {
            aVar.a(USER_AGENT_HEADER_NAME, str);
        }
        if (readableMap == null || !readableMap.hasKey(REQUEST_BODY_KEY_STRING)) {
            aVar.i(CONTENT_ENCODING_HEADER_NAME);
        }
        return aVar.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ F lambda$sendRequestInternal$0(String str, ReactApplicationContext reactApplicationContext, int i10, x.a aVar) {
        F a10 = aVar.a(aVar.t());
        return a10.t().b(new l(a10.b(), new a(str, reactApplicationContext, i10))).c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void readWithProgress(int i10, G g10) {
        long j10;
        long j11 = -1;
        try {
            l lVar = (l) g10;
            j10 = lVar.s();
            try {
                j11 = lVar.e();
            } catch (ClassCastException unused) {
            }
        } catch (ClassCastException unused2) {
            j10 = -1;
        }
        m mVar = new m(g10.f() == null ? StandardCharsets.UTF_8 : g10.f().a(StandardCharsets.UTF_8));
        InputStream a10 = g10.a();
        try {
            byte[] bArr = new byte[MAX_CHUNK_SIZE_BETWEEN_FLUSHES];
            ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
            while (true) {
                int read = a10.read(bArr);
                if (read == -1) {
                    return;
                } else {
                    p.e(reactApplicationContextIfActiveOrWarn, i10, mVar.a(bArr, read), j10, j11);
                }
            }
        } finally {
            a10.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void removeRequest(int i10) {
        this.mRequestIds.remove(Integer.valueOf(i10));
    }

    public static void setCustomClientBuilder(com.facebook.react.modules.network.c cVar) {
        customClientBuilder = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean shouldDispatch(long j10, long j11) {
        return j11 + 100000000 < j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static WritableMap translateHeaders(v vVar) {
        Bundle bundle = new Bundle();
        for (int i10 = 0; i10 < vVar.size(); i10++) {
            String h10 = vVar.h(i10);
            if (bundle.containsKey(h10)) {
                bundle.putString(h10, bundle.getString(h10) + ", " + vVar.v(i10));
            } else {
                bundle.putString(h10, vVar.v(i10));
            }
        }
        return Arguments.fromBundle(bundle);
    }

    private E wrapRequestBodyWithProgressEmitter(E e10, int i10) {
        if (e10 == null) {
            return null;
        }
        return o.e(e10, new c(getReactApplicationContextIfActiveOrWarn(), i10));
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    public void abortRequest(double d10) {
        int i10 = (int) d10;
        cancelRequest(i10);
        removeRequest(i10);
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    public void addListener(String str) {
    }

    public void addRequestBodyHandler(f fVar) {
        this.mRequestBodyHandlers.add(fVar);
    }

    public void addResponseHandler(g gVar) {
        this.mResponseHandlers.add(gVar);
    }

    public void addUriHandler(h hVar) {
        this.mUriHandlers.add(hVar);
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    @ReactMethod
    public void clearCookies(Callback callback) {
        this.mCookieHandler.d(callback);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        this.mCookieJarContainer.a(new y(this.mCookieHandler));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        this.mShuttingDown = true;
        cancelAllRequests();
        this.mCookieHandler.e();
        this.mCookieJarContainer.c();
        this.mRequestBodyHandlers.clear();
        this.mResponseHandlers.clear();
        this.mUriHandlers.clear();
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    public void removeListeners(double d10) {
    }

    public void removeRequestBodyHandler(f fVar) {
        this.mRequestBodyHandlers.remove(fVar);
    }

    public void removeResponseHandler(g gVar) {
        this.mResponseHandlers.remove(gVar);
    }

    public void removeUriHandler(h hVar) {
        this.mUriHandlers.remove(hVar);
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    public void sendRequest(String str, String str2, double d10, ReadableArray readableArray, ReadableMap readableMap, String str3, boolean z10, double d11, boolean z11) {
        int i10 = (int) d10;
        try {
            sendRequestInternal(str, str2, i10, readableArray, readableMap, str3, z10, (int) d11, z11);
        } catch (Throwable th) {
            AbstractC1721a.n("Networking", "Failed to send url request: " + str2, th);
            p.f(getReactApplicationContextIfActiveOrWarn(), i10, th.getMessage(), th);
        }
    }

    public void sendRequestInternal(String str, String str2, final int i10, ReadableArray readableArray, ReadableMap readableMap, final String str3, boolean z10, int i11, boolean z11) {
        f fVar;
        E g10;
        final ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        try {
            Uri parse = Uri.parse(str2);
            for (h hVar : this.mUriHandlers) {
                if (hVar.b(parse, str3)) {
                    p.a(reactApplicationContextIfActiveOrWarn, i10, hVar.a(parse));
                    p.g(reactApplicationContextIfActiveOrWarn, i10);
                    return;
                }
            }
            try {
                D.a x10 = new D.a().x(str2);
                if (i10 != 0) {
                    x10.v(Integer.valueOf(i10));
                }
                B.a A10 = this.mClient.A();
                applyCustomBuilder(A10);
                if (!z11) {
                    A10.j(Td.o.f10187b);
                }
                if (z10) {
                    A10.b(new x() { // from class: com.facebook.react.modules.network.g
                        @Override // Td.x
                        public final F intercept(x.a aVar) {
                            F lambda$sendRequestInternal$0;
                            lambda$sendRequestInternal$0 = NetworkingModule.this.lambda$sendRequestInternal$0(str3, reactApplicationContextIfActiveOrWarn, i10, aVar);
                            return lambda$sendRequestInternal$0;
                        }
                    });
                }
                if (i11 != this.mClient.h()) {
                    A10.e(i11, TimeUnit.MILLISECONDS);
                }
                B c10 = A10.c();
                v extractHeaders = extractHeaders(readableArray, readableMap);
                if (extractHeaders == null) {
                    p.f(reactApplicationContextIfActiveOrWarn, i10, "Unrecognized headers format", null);
                    return;
                }
                String c11 = extractHeaders.c("content-type");
                String c12 = extractHeaders.c(CONTENT_ENCODING_HEADER_NAME);
                x10.m(extractHeaders);
                if (readableMap != null) {
                    Iterator<f> it = this.mRequestBodyHandlers.iterator();
                    while (it.hasNext()) {
                        fVar = it.next();
                        if (fVar.a(readableMap)) {
                            break;
                        }
                    }
                }
                fVar = null;
                if (readableMap != null) {
                    Locale locale = Locale.ROOT;
                    if (!str.toLowerCase(locale).equals("get") && !str.toLowerCase(locale).equals("head")) {
                        if (fVar != null) {
                            g10 = fVar.b(readableMap, c11);
                        } else if (readableMap.hasKey(REQUEST_BODY_KEY_STRING)) {
                            if (c11 == null) {
                                p.f(reactApplicationContextIfActiveOrWarn, i10, "Payload is set but no content-type header specified", null);
                                return;
                            }
                            String string = readableMap.getString(REQUEST_BODY_KEY_STRING);
                            z g11 = z.g(c11);
                            if (o.i(c12)) {
                                g10 = o.d(g11, string);
                                if (g10 == null) {
                                    p.f(reactApplicationContextIfActiveOrWarn, i10, "Failed to gzip request body", null);
                                    return;
                                }
                            } else {
                                g10 = E.create(g11, string.getBytes(g11 == null ? StandardCharsets.UTF_8 : g11.a(StandardCharsets.UTF_8)));
                            }
                        } else if (readableMap.hasKey(REQUEST_BODY_KEY_BASE64)) {
                            if (c11 == null) {
                                p.f(reactApplicationContextIfActiveOrWarn, i10, "Payload is set but no content-type header specified", null);
                                return;
                            }
                            g10 = E.create(z.g(c11), C3880h.d(readableMap.getString(REQUEST_BODY_KEY_BASE64)));
                        } else if (readableMap.hasKey(REQUEST_BODY_KEY_URI)) {
                            if (c11 == null) {
                                p.f(reactApplicationContextIfActiveOrWarn, i10, "Payload is set but no content-type header specified", null);
                                return;
                            }
                            String string2 = readableMap.getString(REQUEST_BODY_KEY_URI);
                            InputStream h10 = o.h(getReactApplicationContext(), string2);
                            if (h10 == null) {
                                p.f(reactApplicationContextIfActiveOrWarn, i10, "Could not retrieve file for uri " + string2, null);
                                return;
                            }
                            g10 = o.c(z.g(c11), h10);
                        } else if (readableMap.hasKey(REQUEST_BODY_KEY_FORMDATA)) {
                            if (c11 == null) {
                                c11 = "multipart/form-data";
                            }
                            A.a constructMultipartBody = constructMultipartBody(readableMap.getArray(REQUEST_BODY_KEY_FORMDATA), c11, i10);
                            if (constructMultipartBody == null) {
                                return;
                            } else {
                                g10 = constructMultipartBody.e();
                            }
                        } else {
                            g10 = o.g(str);
                        }
                        x10.n(str, wrapRequestBodyWithProgressEmitter(g10, i10));
                        addRequest(i10);
                        c10.a(x10.b()).g1(new b(i10, reactApplicationContextIfActiveOrWarn, str3, z10));
                    }
                }
                g10 = o.g(str);
                x10.n(str, wrapRequestBodyWithProgressEmitter(g10, i10));
                addRequest(i10);
                c10.a(x10.b()).g1(new b(i10, reactApplicationContextIfActiveOrWarn, str3, z10));
            } catch (Exception e10) {
                p.f(reactApplicationContextIfActiveOrWarn, i10, e10.getMessage(), null);
            }
        } catch (IOException e11) {
            p.f(reactApplicationContextIfActiveOrWarn, i10, e11.getMessage(), e11);
        }
    }

    NetworkingModule(ReactApplicationContext reactApplicationContext, String str, B b10) {
        this(reactApplicationContext, str, b10, null);
    }

    public NetworkingModule(ReactApplicationContext reactApplicationContext) {
        this(reactApplicationContext, null, com.facebook.react.modules.network.h.b(reactApplicationContext), null);
    }

    public NetworkingModule(ReactApplicationContext reactApplicationContext, List<Object> list) {
        this(reactApplicationContext, null, com.facebook.react.modules.network.h.b(reactApplicationContext), list);
    }

    public NetworkingModule(ReactApplicationContext reactApplicationContext, String str) {
        this(reactApplicationContext, str, com.facebook.react.modules.network.h.b(reactApplicationContext), null);
    }
}
