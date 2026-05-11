package com.ReactNativeBlobUtil;

import Td.B;
import Td.D;
import Td.E;
import Td.F;
import Td.G;
import Td.InterfaceC1229e;
import Td.InterfaceC1230f;
import Td.v;
import Td.x;
import Td.z;
import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.util.Base64;
import android.webkit.CookieManager;
import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
public class l extends BroadcastReceiver implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    com.ReactNativeBlobUtil.b f19926a;

    /* renamed from: b, reason: collision with root package name */
    String f19927b;

    /* renamed from: c, reason: collision with root package name */
    String f19928c;

    /* renamed from: d, reason: collision with root package name */
    String f19929d;

    /* renamed from: e, reason: collision with root package name */
    String f19930e;

    /* renamed from: f, reason: collision with root package name */
    String f19931f;

    /* renamed from: g, reason: collision with root package name */
    String f19932g;

    /* renamed from: h, reason: collision with root package name */
    ReadableArray f19933h;

    /* renamed from: i, reason: collision with root package name */
    ReadableMap f19934i;

    /* renamed from: j, reason: collision with root package name */
    Callback f19935j;

    /* renamed from: k, reason: collision with root package name */
    long f19936k;

    /* renamed from: l, reason: collision with root package name */
    long f19937l;

    /* renamed from: m, reason: collision with root package name */
    com.ReactNativeBlobUtil.a f19938m;

    /* renamed from: n, reason: collision with root package name */
    f f19939n;

    /* renamed from: o, reason: collision with root package name */
    h f19940o;

    /* renamed from: q, reason: collision with root package name */
    WritableMap f19942q;

    /* renamed from: t, reason: collision with root package name */
    B f19945t;

    /* renamed from: u, reason: collision with root package name */
    boolean f19946u;

    /* renamed from: x, reason: collision with root package name */
    private Future f19949x;

    /* renamed from: z, reason: collision with root package name */
    public static HashMap f19925z = new HashMap();

    /* renamed from: A, reason: collision with root package name */
    public static HashMap f19921A = new HashMap();

    /* renamed from: B, reason: collision with root package name */
    static HashMap f19922B = new HashMap();

    /* renamed from: C, reason: collision with root package name */
    static HashMap f19923C = new HashMap();

    /* renamed from: D, reason: collision with root package name */
    static Td.l f19924D = new Td.l();

    /* renamed from: p, reason: collision with root package name */
    g f19941p = g.Auto;

    /* renamed from: r, reason: collision with root package name */
    boolean f19943r = false;

    /* renamed from: s, reason: collision with root package name */
    ArrayList f19944s = new ArrayList();

    /* renamed from: v, reason: collision with root package name */
    private final int f19947v = 1314;

    /* renamed from: w, reason: collision with root package name */
    private ScheduledExecutorService f19948w = Executors.newScheduledThreadPool(1);

    /* renamed from: y, reason: collision with root package name */
    private Handler f19950y = new Handler(new a());

    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what == 1314 && message.getData().getLong("downloadManagerId") == l.this.f19937l) {
                DownloadManager downloadManager = (DownloadManager) com.ReactNativeBlobUtil.e.f19857b.getApplicationContext().getSystemService("download");
                DownloadManager.Query query = new DownloadManager.Query();
                query.setFilterById(l.this.f19937l);
                Cursor query2 = downloadManager.query(query);
                if (query2 != null && query2.moveToFirst()) {
                    long j10 = query2.getInt(query2.getColumnIndex("bytes_so_far"));
                    long j11 = query2.getLong(query2.getColumnIndex("total_size"));
                    query2.close();
                    j l10 = l.l(l.this.f19927b);
                    float f10 = j11 > 0 ? j10 / j11 : 0.0f;
                    if (l10 != null && l10.a(f10)) {
                        WritableMap createMap = Arguments.createMap();
                        createMap.putString("taskId", String.valueOf(l.this.f19927b));
                        createMap.putString("written", String.valueOf(j10));
                        createMap.putString("total", String.valueOf(j11));
                        createMap.putString("chunk", BuildConfig.FLAVOR);
                        ((DeviceEventManagerModule.RCTDeviceEventEmitter) com.ReactNativeBlobUtil.e.f19857b.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("ReactNativeBlobUtilProgress", createMap);
                    }
                    if (j11 == j10) {
                        l.this.f19949x.cancel(true);
                    }
                }
            }
            return true;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Message obtainMessage = l.this.f19950y.obtainMessage();
            Bundle bundle = new Bundle();
            bundle.putLong("downloadManagerId", l.this.f19937l);
            obtainMessage.setData(bundle);
            obtainMessage.what = 1314;
            l.this.f19950y.sendMessage(obtainMessage);
        }
    }

    class c implements x {
        c() {
        }

        @Override // Td.x
        public F intercept(x.a aVar) {
            l.this.f19944s.add(aVar.t().n().toString());
            return aVar.a(aVar.t());
        }
    }

    class d implements x {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ D f19954a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f19955b;

        d(l lVar, D d10) {
            this.f19954a = d10;
            this.f19955b = lVar;
        }

        @Override // Td.x
        public F intercept(x.a aVar) {
            G aVar2;
            F f10 = null;
            try {
                f10 = aVar.a(this.f19954a);
                int ordinal = this.f19955b.f19940o.ordinal();
                if (ordinal == 0) {
                    aVar2 = new M1.a(com.ReactNativeBlobUtil.e.f19857b, this.f19955b.f19927b, f10.b(), this.f19955b.f19926a.f19847m.booleanValue());
                } else if (ordinal != 1) {
                    aVar2 = new M1.a(com.ReactNativeBlobUtil.e.f19857b, this.f19955b.f19927b, f10.b(), this.f19955b.f19926a.f19847m.booleanValue());
                } else {
                    ReactApplicationContext reactApplicationContext = com.ReactNativeBlobUtil.e.f19857b;
                    String str = this.f19955b.f19927b;
                    G b10 = f10.b();
                    l lVar = this.f19955b;
                    aVar2 = new M1.c(reactApplicationContext, str, b10, lVar.f19931f, lVar.f19926a.f19845k.booleanValue());
                }
                return f10.t().b(aVar2).c();
            } catch (SocketException unused) {
                this.f19955b.f19943r = true;
                if (f10 != null) {
                    f10.close();
                }
                return aVar.a(aVar.t());
            } catch (SocketTimeoutException unused2) {
                this.f19955b.f19943r = true;
                if (f10 != null) {
                    f10.close();
                }
                return aVar.a(aVar.t());
            } catch (Exception unused3) {
                if (f10 != null) {
                    f10.close();
                }
                return aVar.a(aVar.t());
            }
        }
    }

    class e implements InterfaceC1230f {
        e() {
        }

        @Override // Td.InterfaceC1230f
        public void c(InterfaceC1229e interfaceC1229e, F f10) {
            ReadableMap readableMap = l.this.f19926a.f19839e;
            if (readableMap != null) {
                boolean hasKey = readableMap.hasKey("title");
                String str = BuildConfig.FLAVOR;
                String string = hasKey ? l.this.f19926a.f19839e.getString("title") : BuildConfig.FLAVOR;
                if (readableMap.hasKey("description")) {
                    str = readableMap.getString("description");
                }
                String str2 = str;
                String string2 = readableMap.hasKey("mime") ? readableMap.getString("mime") : "text/plain";
                boolean z10 = readableMap.hasKey("mediaScannable") ? readableMap.getBoolean("mediaScannable") : false;
                boolean z11 = readableMap.hasKey("notification") ? readableMap.getBoolean("notification") : false;
                DownloadManager downloadManager = (DownloadManager) com.ReactNativeBlobUtil.e.f19857b.getSystemService("download");
                l lVar = l.this;
                downloadManager.addCompletedDownload(string, str2, z10, string2, lVar.f19931f, lVar.f19936k, z11);
            }
            l.this.g(f10);
        }

        @Override // Td.InterfaceC1230f
        public void d(InterfaceC1229e interfaceC1229e, IOException iOException) {
            l.f(l.this.f19927b);
            l lVar = l.this;
            if (lVar.f19942q == null) {
                lVar.f19942q = Arguments.createMap();
            }
            if (iOException.getClass().equals(SocketTimeoutException.class)) {
                l.this.f19942q.putBoolean("timeout", true);
                l.this.o("The request timed out.", null, null);
            } else {
                l.this.o(iOException.getLocalizedMessage(), null, null);
            }
            l.this.q();
        }
    }

    enum f {
        Form,
        SingleFile,
        AsIs,
        WithoutBody,
        Others
    }

    enum g {
        Auto,
        UTF8,
        BASE64
    }

    enum h {
        KeepInMemory,
        FileStorage
    }

    public l(ReadableMap readableMap, String str, String str2, String str3, ReadableMap readableMap2, String str4, ReadableArray readableArray, B b10, Callback callback) {
        this.f19928c = str2.toUpperCase(Locale.ROOT);
        com.ReactNativeBlobUtil.b bVar = new com.ReactNativeBlobUtil.b(readableMap);
        this.f19926a = bVar;
        this.f19927b = str;
        this.f19929d = str3;
        this.f19934i = readableMap2;
        this.f19935j = callback;
        this.f19930e = str4;
        this.f19933h = readableArray;
        this.f19945t = b10;
        this.f19946u = false;
        if ((bVar.f19835a.booleanValue() || this.f19926a.f19837c != null) && !r()) {
            this.f19940o = h.FileStorage;
        } else {
            this.f19940o = h.KeepInMemory;
        }
        if (str4 != null) {
            this.f19939n = f.SingleFile;
        } else if (readableArray != null) {
            this.f19939n = f.Form;
        } else {
            this.f19939n = f.WithoutBody;
        }
    }

    public static void f(String str) {
        InterfaceC1229e interfaceC1229e = (InterfaceC1229e) f19925z.get(str);
        if (interfaceC1229e != null) {
            interfaceC1229e.cancel();
            f19925z.remove(str);
        }
        if (f19921A.containsKey(str)) {
            ((DownloadManager) com.ReactNativeBlobUtil.e.f19857b.getApplicationContext().getSystemService("download")).remove(((Long) f19921A.get(str)).longValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(F f10) {
        boolean p10 = p(f10);
        WritableMap n10 = n(f10, p10);
        h(n10.copy());
        h(n(f10, p10));
        int ordinal = this.f19940o.ordinal();
        String str = null;
        if (ordinal == 0) {
            if (p10) {
                try {
                    if (this.f19926a.f19844j.booleanValue()) {
                        String n11 = com.ReactNativeBlobUtil.d.n(this.f19927b);
                        InputStream a10 = f10.b().a();
                        FileOutputStream fileOutputStream = new FileOutputStream(new File(n11));
                        byte[] bArr = new byte[10240];
                        while (true) {
                            int read = a10.read(bArr);
                            if (read == -1) {
                                break;
                            } else {
                                fileOutputStream.write(bArr, 0, read);
                            }
                        }
                        a10.close();
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        o(null, "path", n11, n10.copy());
                    }
                } catch (IOException unused) {
                    o("ReactNativeBlobUtil failed to encode response data to BASE64 string.", n10.copy());
                }
            }
            byte[] b10 = f10.b().b();
            if (r()) {
                throw new IllegalStateException("Write file with transform was specified but the shared file transformer is not set");
            }
            if (this.f19941p == g.BASE64) {
                o(null, "base64", Base64.encodeToString(b10, 2), n10.copy());
                return;
            }
            try {
                Charset forName = Charset.forName("UTF-8");
                forName.newDecoder().decode(ByteBuffer.wrap(b10));
                o(null, "utf8", new String(b10, forName));
            } catch (CharacterCodingException unused2) {
                if (this.f19941p == g.UTF8) {
                    o(null, "utf8", new String(b10), n10.copy());
                } else {
                    o(null, "base64", Base64.encodeToString(b10, 2), n10.copy());
                }
            }
        } else if (ordinal != 1) {
            try {
                o(null, "utf8", new String(f10.b().b(), "UTF-8"), n10.copy());
            } catch (IOException unused3) {
                o("ReactNativeBlobUtil failed to encode response data to UTF8 string.", n10.copy());
            }
        } else {
            G b11 = f10.b();
            try {
                b11.b();
            } catch (Exception unused4) {
            }
            try {
                M1.c cVar = (M1.c) b11;
                if (cVar == null || cVar.n()) {
                    String replace = this.f19931f.replace("?append=true", BuildConfig.FLAVOR);
                    this.f19931f = replace;
                    o(null, "path", replace, n10.copy());
                } else {
                    o("Download interrupted.", n10.copy());
                }
            } catch (ClassCastException unused5) {
                if (b11 == null) {
                    o("Unexpected FileStorage response with no file.", n10.copy());
                    return;
                }
                try {
                    boolean z10 = b11.j().X().size() > 0;
                    boolean z11 = b11.e() > 0;
                    if (z10 && z11) {
                        str = b11.l();
                    }
                } catch (IOException e10) {
                    e10.printStackTrace();
                }
                o("Unexpected FileStorage response file: " + str, n10.copy());
                return;
            }
        }
        f10.b().close();
        q();
    }

    private void h(WritableMap writableMap) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) com.ReactNativeBlobUtil.e.f19857b.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("ReactNativeBlobUtilState", writableMap);
    }

    private String j(v vVar, String str) {
        String c10 = vVar.c(str);
        if (c10 != null) {
            return c10;
        }
        Locale locale = Locale.ROOT;
        return vVar.c(str.toLowerCase(locale)) == null ? BuildConfig.FLAVOR : vVar.c(str.toLowerCase(locale));
    }

    private String k(HashMap hashMap, String str) {
        String str2 = (String) hashMap.get(str);
        if (str2 != null) {
            return str2;
        }
        String str3 = (String) hashMap.get(str.toLowerCase(Locale.ROOT));
        return str3 == null ? BuildConfig.FLAVOR : str3;
    }

    public static j l(String str) {
        if (f19922B.containsKey(str)) {
            return (j) f19922B.get(str);
        }
        return null;
    }

    public static j m(String str) {
        if (f19923C.containsKey(str)) {
            return (j) f19923C.get(str);
        }
        return null;
    }

    private WritableMap n(F f10, boolean z10) {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("status", f10.f());
        createMap.putString(Keys.STATE, "2");
        createMap.putString("taskId", this.f19927b);
        createMap.putBoolean("timeout", this.f19943r);
        WritableMap createMap2 = Arguments.createMap();
        for (int i10 = 0; i10 < f10.p().size(); i10++) {
            createMap2.putString(f10.p().h(i10), f10.p().v(i10));
        }
        WritableArray createArray = Arguments.createArray();
        Iterator it = this.f19944s.iterator();
        while (it.hasNext()) {
            createArray.pushString((String) it.next());
        }
        createMap.putArray("redirects", createArray);
        createMap.putMap("headers", createMap2);
        v p10 = f10.p();
        if (z10) {
            createMap.putString("respType", "blob");
        } else if (j(p10, Keys.CONTENT_TYPE).equalsIgnoreCase("text/")) {
            createMap.putString("respType", "text");
        } else if (j(p10, Keys.CONTENT_TYPE).contains("application/json")) {
            createMap.putString("respType", "json");
        } else {
            createMap.putString("respType", BuildConfig.FLAVOR);
        }
        return createMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(Object... objArr) {
        if (this.f19946u) {
            return;
        }
        this.f19935j.invoke(objArr);
        this.f19946u = true;
    }

    private boolean p(F f10) {
        boolean z10;
        String j10 = j(f10.p(), "Content-Type");
        boolean equalsIgnoreCase = j10.equalsIgnoreCase("text/");
        boolean equalsIgnoreCase2 = j10.equalsIgnoreCase("application/json");
        if (this.f19926a.f19849o != null) {
            for (int i10 = 0; i10 < this.f19926a.f19849o.size(); i10++) {
                Locale locale = Locale.ROOT;
                if (j10.toLowerCase(locale).contains(this.f19926a.f19849o.getString(i10).toLowerCase(locale))) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        return (equalsIgnoreCase2 && equalsIgnoreCase) || z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        if (f19925z.containsKey(this.f19927b)) {
            f19925z.remove(this.f19927b);
        }
        if (f19921A.containsKey(this.f19927b)) {
            f19921A.remove(this.f19927b);
        }
        if (f19923C.containsKey(this.f19927b)) {
            f19923C.remove(this.f19927b);
        }
        if (f19922B.containsKey(this.f19927b)) {
            f19922B.remove(this.f19927b);
        }
        com.ReactNativeBlobUtil.a aVar = this.f19938m;
        if (aVar != null) {
            aVar.b();
        }
    }

    private boolean r() {
        return this.f19926a.f19836b.booleanValue() && (this.f19926a.f19835a.booleanValue() || this.f19926a.f19837c != null);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0148 A[Catch: Exception -> 0x0150, TryCatch #0 {Exception -> 0x0150, blocks: (B:45:0x013b, B:47:0x0148, B:49:0x0152, B:50:0x0159), top: B:44:0x013b }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0152 A[Catch: Exception -> 0x0150, TryCatch #0 {Exception -> 0x0150, blocks: (B:45:0x013b, B:47:0x0148, B:49:0x0152, B:50:0x0159), top: B:44:0x013b }] */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onReceive(Context context, Intent intent) {
        String str;
        String str2;
        Cursor query;
        if (!"android.intent.action.DOWNLOAD_COMPLETE".equals(intent.getAction())) {
            return;
        }
        Context applicationContext = com.ReactNativeBlobUtil.e.f19857b.getApplicationContext();
        if (intent.getExtras().getLong("extra_download_id") != this.f19937l) {
            return;
        }
        q();
        DownloadManager.Query query2 = new DownloadManager.Query();
        query2.setFilterById(this.f19937l);
        DownloadManager downloadManager = (DownloadManager) applicationContext.getSystemService("download");
        downloadManager.query(query2);
        Cursor query3 = downloadManager.query(query2);
        if (query3 == null) {
            o("Download manager failed to download from  " + this.f19929d + ". Query was unsuccessful ", null, null);
            return;
        }
        try {
            try {
                if (query3.moveToFirst()) {
                    int i10 = query3.getInt(query3.getColumnIndex("status"));
                    if (i10 == 16) {
                        o("Download manager failed to download from  " + this.f19929d + ". Status Code = " + i10, null, null);
                        return;
                    }
                    String string = query3.getString(query3.getColumnIndex("local_uri"));
                    if (string != null && (query = applicationContext.getContentResolver().query(Uri.parse(string), new String[]{"_data"}, null, null, null)) != null) {
                        query.moveToFirst();
                        str = query.getString(0);
                        query.close();
                        query3.close();
                        if (!this.f19926a.f19839e.hasKey("path") || this.f19926a.f19839e.hasKey("storeLocal")) {
                            str2 = this.f19932g;
                            if (new File(str2).exists()) {
                                throw new Exception("Download manager download failed, the file does not downloaded to destination.");
                            }
                            o(null, "path", str2);
                            return;
                        }
                        if (Build.VERSION.SDK_INT < 29 || !this.f19926a.f19839e.hasKey("storeInDownloads") || !this.f19926a.f19839e.getBoolean("storeInDownloads")) {
                            if (str == null) {
                                o("Download manager could not resolve downloaded file path.", "path", null);
                                return;
                            } else {
                                o(null, "path", str);
                                return;
                            }
                        }
                        Uri uriForDownloadedFile = downloadManager.getUriForDownloadedFile(this.f19937l);
                        if (uriForDownloadedFile == null) {
                            o("Download manager could not resolve downloaded file uri.", "path", null);
                            return;
                        } else {
                            o(null, "path", uriForDownloadedFile.toString());
                            return;
                        }
                    }
                }
                str2 = this.f19932g;
                if (new File(str2).exists()) {
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                o(e10.getLocalizedMessage(), null);
                return;
            }
            str = null;
            query3.close();
            if (this.f19926a.f19839e.hasKey("path")) {
            }
        } finally {
            query3.close();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:173:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x05ab A[Catch: Exception -> 0x0331, TryCatch #2 {Exception -> 0x0331, blocks: (B:108:0x0320, B:110:0x032a, B:111:0x033a, B:113:0x0345, B:115:0x0357, B:121:0x0366, B:125:0x036d, B:128:0x0373, B:120:0x0380, B:132:0x0383, B:134:0x0390, B:136:0x0395, B:137:0x03a4, B:139:0x03ad, B:140:0x03b1, B:142:0x03b7, B:149:0x03c9, B:159:0x03d1, B:152:0x03d6, B:155:0x03de, B:145:0x03e3, B:162:0x03f4, B:165:0x03fe, B:167:0x0408, B:170:0x0413, B:171:0x049f, B:178:0x058d, B:180:0x05ab, B:181:0x05b7, B:183:0x04bc, B:185:0x04c4, B:187:0x04ce, B:190:0x04d9, B:191:0x04e0, B:192:0x04ed, B:193:0x0518, B:194:0x0543, B:195:0x0419, B:197:0x0427, B:198:0x0443, B:200:0x0447, B:202:0x044f, B:205:0x045a, B:207:0x0466, B:210:0x0473, B:211:0x0478, B:213:0x048a, B:214:0x048d, B:216:0x0493, B:217:0x0496, B:218:0x049b, B:220:0x042e, B:222:0x0434, B:224:0x043a, B:225:0x043f, B:228:0x03a1, B:229:0x0334), top: B:107:0x0320, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0543 A[Catch: Exception -> 0x0331, TryCatch #2 {Exception -> 0x0331, blocks: (B:108:0x0320, B:110:0x032a, B:111:0x033a, B:113:0x0345, B:115:0x0357, B:121:0x0366, B:125:0x036d, B:128:0x0373, B:120:0x0380, B:132:0x0383, B:134:0x0390, B:136:0x0395, B:137:0x03a4, B:139:0x03ad, B:140:0x03b1, B:142:0x03b7, B:149:0x03c9, B:159:0x03d1, B:152:0x03d6, B:155:0x03de, B:145:0x03e3, B:162:0x03f4, B:165:0x03fe, B:167:0x0408, B:170:0x0413, B:171:0x049f, B:178:0x058d, B:180:0x05ab, B:181:0x05b7, B:183:0x04bc, B:185:0x04c4, B:187:0x04ce, B:190:0x04d9, B:191:0x04e0, B:192:0x04ed, B:193:0x0518, B:194:0x0543, B:195:0x0419, B:197:0x0427, B:198:0x0443, B:200:0x0447, B:202:0x044f, B:205:0x045a, B:207:0x0466, B:210:0x0473, B:211:0x0478, B:213:0x048a, B:214:0x048d, B:216:0x0493, B:217:0x0496, B:218:0x049b, B:220:0x042e, B:222:0x0434, B:224:0x043a, B:225:0x043f, B:228:0x03a1, B:229:0x0334), top: B:107:0x0320, inners: #0 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void run() {
        int ordinal;
        long j10;
        Context applicationContext = com.ReactNativeBlobUtil.e.f19857b.getApplicationContext();
        ReadableMap readableMap = this.f19926a.f19839e;
        if (readableMap != null && readableMap.hasKey("useDownloadManager") && this.f19926a.f19839e.getBoolean("useDownloadManager")) {
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(this.f19929d));
            if (this.f19926a.f19839e.hasKey("notification") && this.f19926a.f19839e.getBoolean("notification")) {
                request.setNotificationVisibility(1);
            } else {
                request.setNotificationVisibility(2);
            }
            if (this.f19926a.f19839e.hasKey("title")) {
                request.setTitle(this.f19926a.f19839e.getString("title"));
            }
            if (this.f19926a.f19839e.hasKey("description")) {
                request.setDescription(this.f19926a.f19839e.getString("description"));
            }
            if (this.f19926a.f19839e.hasKey("path")) {
                String string = this.f19926a.f19839e.getString("path");
                File file = new File(string);
                File parentFile = file.getParentFile();
                if (!file.exists() && parentFile != null && !parentFile.exists() && !parentFile.mkdirs() && !parentFile.exists()) {
                    o("Failed to create parent directory of '" + string + "'", null, null);
                    return;
                }
                request.setDestinationUri(Uri.parse("file://" + string));
                this.f19932g = string;
            }
            if (this.f19926a.f19839e.hasKey("storeLocal") && this.f19926a.f19839e.getBoolean("storeLocal")) {
                String str = ((String) com.ReactNativeBlobUtil.d.m(com.ReactNativeBlobUtil.e.f19857b).get("DownloadDir")) + UUID.randomUUID().toString();
                File file2 = new File(str);
                File parentFile2 = file2.getParentFile();
                if (!file2.exists() && parentFile2 != null && !parentFile2.exists() && !parentFile2.mkdirs() && !parentFile2.exists()) {
                    o("Failed to create parent directory of '" + str + "'", null, null);
                    return;
                }
                request.setDestinationUri(Uri.parse("file://" + str));
                this.f19932g = str;
            }
            if (this.f19926a.f19839e.hasKey("mime")) {
                request.setMimeType(this.f19926a.f19839e.getString("mime"));
            }
            if (this.f19926a.f19839e.hasKey("mediaScannable") && this.f19926a.f19839e.getBoolean("mediaScannable")) {
                request.allowScanningByMediaScanner();
            }
            if (Build.VERSION.SDK_INT >= 29 && this.f19926a.f19839e.hasKey("storeInDownloads") && this.f19926a.f19839e.getBoolean("storeInDownloads")) {
                String string2 = this.f19926a.f19839e.getString("title");
                if (string2 == null || string2.isEmpty()) {
                    string2 = UUID.randomUUID().toString();
                }
                String str2 = this.f19926a.f19838d;
                if (str2 != null && !str2.isEmpty()) {
                    string2 = string2 + "." + this.f19926a.f19838d;
                }
                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, string2);
            }
            ReadableMapKeySetIterator keySetIterator = this.f19934i.keySetIterator();
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                request.addRequestHeader(nextKey, this.f19934i.getString(nextKey));
            }
            try {
                URL url = new URL(this.f19929d);
                request.addRequestHeader("Cookie", CookieManager.getInstance().getCookie(url.getProtocol() + "://" + url.getHost()));
            } catch (MalformedURLException e10) {
                e10.printStackTrace();
            }
            long enqueue = ((DownloadManager) applicationContext.getSystemService("download")).enqueue(request);
            this.f19937l = enqueue;
            f19921A.put(this.f19927b, Long.valueOf(enqueue));
            if (Build.VERSION.SDK_INT >= 34) {
                applicationContext.registerReceiver(this, new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"), 2);
            } else {
                applicationContext.registerReceiver(this, new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"));
            }
            this.f19949x = this.f19948w.scheduleAtFixedRate(new b(), 0L, 100L, TimeUnit.MILLISECONDS);
            return;
        }
        String str3 = this.f19927b;
        String str4 = this.f19926a.f19838d;
        String str5 = (str4 == null || str4.isEmpty()) ? BuildConfig.FLAVOR : "." + this.f19926a.f19838d;
        String str6 = this.f19926a.f19842h;
        if (str6 != null) {
            str3 = n.b(str6);
            if (str3 == null) {
                str3 = this.f19927b;
            }
            File file3 = new File(com.ReactNativeBlobUtil.d.n(str3) + str5);
            if (file3.exists()) {
                o(null, "path", file3.getAbsolutePath());
                return;
            }
        }
        com.ReactNativeBlobUtil.b bVar = this.f19926a;
        String str7 = bVar.f19837c;
        if (str7 != null) {
            this.f19931f = str7;
        } else if (bVar.f19835a.booleanValue()) {
            this.f19931f = com.ReactNativeBlobUtil.d.n(str3) + str5;
        }
        try {
            B.a c10 = this.f19926a.f19840f.booleanValue() ? n.c(this.f19945t) : this.f19945t.A();
            if (this.f19926a.f19841g.booleanValue()) {
                ConnectivityManager connectivityManager = (ConnectivityManager) com.ReactNativeBlobUtil.e.f19857b.getSystemService("connectivity");
                for (Network network : connectivityManager.getAllNetworks()) {
                    NetworkInfo networkInfo = connectivityManager.getNetworkInfo(network);
                    NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
                    if (networkCapabilities != null && networkInfo != null && networkInfo.isConnected() && networkCapabilities.hasTransport(1)) {
                        c10.c0(Proxy.NO_PROXY);
                        c10.g0(network.getSocketFactory());
                    }
                }
                o("No available WiFi connections.", null, null);
                q();
                return;
            }
            D.a aVar = new D.a();
            try {
                aVar.y(new URL(this.f19929d));
            } catch (MalformedURLException e11) {
                e11.printStackTrace();
            }
            HashMap hashMap = new HashMap();
            ReadableMap readableMap2 = this.f19934i;
            if (readableMap2 != null) {
                ReadableMapKeySetIterator keySetIterator2 = readableMap2.keySetIterator();
                while (keySetIterator2.hasNextKey()) {
                    String nextKey2 = keySetIterator2.nextKey();
                    String string3 = this.f19934i.getString(nextKey2);
                    if (!nextKey2.equalsIgnoreCase("RNFB-Response")) {
                        Locale locale = Locale.ROOT;
                        aVar.l(nextKey2.toLowerCase(locale), string3);
                        hashMap.put(nextKey2.toLowerCase(locale), string3);
                    } else if (string3.equalsIgnoreCase("base64")) {
                        this.f19941p = g.BASE64;
                    } else if (string3.equalsIgnoreCase("utf8")) {
                        this.f19941p = g.UTF8;
                    }
                }
            }
            if (!this.f19928c.equalsIgnoreCase("post") && !this.f19928c.equalsIgnoreCase("put") && !this.f19928c.equalsIgnoreCase("patch")) {
                this.f19939n = f.WithoutBody;
                boolean equalsIgnoreCase = k(hashMap, "Transfer-Encoding").equalsIgnoreCase("chunked");
                ordinal = this.f19939n.ordinal();
                if (ordinal != 0) {
                    com.ReactNativeBlobUtil.a l10 = new com.ReactNativeBlobUtil.a(this.f19927b).a(equalsIgnoreCase).m(this.f19939n).j(this.f19933h).l(z.g("multipart/form-data; boundary=" + ("ReactNativeBlobUtil-" + this.f19927b)));
                    this.f19938m = l10;
                    aVar.n(this.f19928c, l10);
                } else if (ordinal == 1) {
                    com.ReactNativeBlobUtil.a l11 = new com.ReactNativeBlobUtil.a(this.f19927b).a(equalsIgnoreCase).m(this.f19939n).k(this.f19930e).l(z.g(k(hashMap, Keys.CONTENT_TYPE)));
                    this.f19938m = l11;
                    aVar.n(this.f19928c, l11);
                } else if (ordinal == 2) {
                    com.ReactNativeBlobUtil.a l12 = new com.ReactNativeBlobUtil.a(this.f19927b).a(equalsIgnoreCase).m(this.f19939n).k(this.f19930e).l(z.g(k(hashMap, Keys.CONTENT_TYPE)));
                    this.f19938m = l12;
                    aVar.n(this.f19928c, l12);
                } else if (ordinal == 3) {
                    if (!this.f19928c.equalsIgnoreCase("post") && !this.f19928c.equalsIgnoreCase("put") && !this.f19928c.equalsIgnoreCase("patch")) {
                        aVar.n(this.f19928c, null);
                    }
                    aVar.n(this.f19928c, E.create((z) null, new byte[0]));
                }
                D b10 = aVar.b();
                c10.b(new c());
                c10.a(new d(this, b10));
                j10 = this.f19926a.f19846l;
                if (j10 >= 0) {
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    c10.g(j10, timeUnit);
                    c10.d0(this.f19926a.f19846l, timeUnit);
                }
                c10.h(f19924D);
                c10.e0(false);
                c10.p(this.f19926a.f19848n.booleanValue());
                c10.q(this.f19926a.f19848n.booleanValue());
                c10.e0(true);
                InterfaceC1229e a10 = i(c10).c().a(b10);
                f19925z.put(this.f19927b, a10);
                a10.g1(new e());
            }
            String k10 = k(hashMap, "Content-Type");
            Locale locale2 = Locale.ROOT;
            String lowerCase = k10.toLowerCase(locale2);
            if (this.f19933h != null) {
                this.f19939n = f.Form;
            } else if (lowerCase == null || lowerCase.isEmpty()) {
                if (!lowerCase.equalsIgnoreCase(BuildConfig.FLAVOR)) {
                    aVar.l("Content-Type", "application/octet-stream");
                }
                this.f19939n = f.SingleFile;
            }
            String str8 = this.f19930e;
            if (str8 != null) {
                if (!str8.startsWith("ReactNativeBlobUtil-file://") && !this.f19930e.startsWith("ReactNativeBlobUtil-content://")) {
                    if (!lowerCase.toLowerCase(locale2).contains(";base64") && !lowerCase.toLowerCase(locale2).startsWith("application/octet")) {
                        this.f19939n = f.AsIs;
                    }
                    String replace = lowerCase.replace(";base64", BuildConfig.FLAVOR).replace(";BASE64", BuildConfig.FLAVOR);
                    if (hashMap.containsKey(Keys.CONTENT_TYPE)) {
                        hashMap.put(Keys.CONTENT_TYPE, replace);
                    }
                    if (hashMap.containsKey("Content-Type")) {
                        hashMap.put("Content-Type", replace);
                    }
                    this.f19939n = f.SingleFile;
                }
                this.f19939n = f.SingleFile;
            }
            boolean equalsIgnoreCase2 = k(hashMap, "Transfer-Encoding").equalsIgnoreCase("chunked");
            ordinal = this.f19939n.ordinal();
            if (ordinal != 0) {
            }
            D b102 = aVar.b();
            c10.b(new c());
            c10.a(new d(this, b102));
            j10 = this.f19926a.f19846l;
            if (j10 >= 0) {
            }
            c10.h(f19924D);
            c10.e0(false);
            c10.p(this.f19926a.f19848n.booleanValue());
            c10.q(this.f19926a.f19848n.booleanValue());
            c10.e0(true);
            InterfaceC1229e a102 = i(c10).c().a(b102);
            f19925z.put(this.f19927b, a102);
            a102.g1(new e());
        } catch (Exception e12) {
            e12.printStackTrace();
            q();
            o("ReactNativeBlobUtil request error: " + e12.getMessage() + e12.getCause());
        }
    }

    public static B.a i(B.a aVar) {
        return aVar;
    }
}
