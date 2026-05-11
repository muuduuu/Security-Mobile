package D8;

import D7.AbstractC0789m;
import D8.d;
import D8.f;
import V6.AbstractC1287s;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import co.hyperverge.hypersnapsdk.utils.AppConstants;
import com.google.android.gms.common.util.k;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import com.google.firebase.installations.d;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.conscrypt.BuildConfig;
import org.json.JSONException;
import org.json.JSONObject;
import y8.i;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f1388d = Pattern.compile("[0-9]+s");

    /* renamed from: e, reason: collision with root package name */
    private static final Charset f1389e = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    private final Context f1390a;

    /* renamed from: b, reason: collision with root package name */
    private final A8.b f1391b;

    /* renamed from: c, reason: collision with root package name */
    private final e f1392c = new e();

    public c(Context context, A8.b bVar) {
        this.f1390a = context;
        this.f1391b = bVar;
    }

    private static String a(String str, String str2, String str3) {
        String str4;
        if (TextUtils.isEmpty(str)) {
            str4 = BuildConfig.FLAVOR;
        } else {
            str4 = ", " + str;
        }
        return String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", str2, str3, str4);
    }

    private static JSONObject b(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:19.0.1");
            return jSONObject;
        } catch (JSONException e10) {
            throw new IllegalStateException(e10);
        }
    }

    private static JSONObject c() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:19.0.1");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            return jSONObject2;
        } catch (JSONException e10) {
            throw new IllegalStateException(e10);
        }
    }

    private String g() {
        try {
            Context context = this.f1390a;
            byte[] a10 = com.google.android.gms.common.util.a.a(context, context.getPackageName());
            if (a10 != null) {
                return k.b(a10, false);
            }
            Log.e("ContentValues", "Could not get fingerprint hash for package: " + this.f1390a.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("ContentValues", "No such package: " + this.f1390a.getPackageName(), e10);
            return null;
        }
    }

    private URL h(String str) {
        try {
            return new URL(String.format("https://%s/%s/%s", "firebaseinstallations.googleapis.com", "v1", str));
        } catch (MalformedURLException e10) {
            throw new com.google.firebase.installations.d(e10.getMessage(), d.a.UNAVAILABLE);
        }
    }

    private static byte[] i(JSONObject jSONObject) {
        return jSONObject.toString().getBytes("UTF-8");
    }

    private static boolean j(int i10) {
        return i10 >= 200 && i10 < 300;
    }

    private static void k() {
        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
    }

    private static void l(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        String p10 = p(httpURLConnection);
        if (TextUtils.isEmpty(p10)) {
            return;
        }
        Log.w("Firebase-Installations", p10);
        Log.w("Firebase-Installations", a(str, str2, str3));
    }

    private HttpURLConnection m(URL url, String str) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(ModuleDescriptor.MODULE_VERSION);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(ModuleDescriptor.MODULE_VERSION);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty(AppConstants.S3_CACHE_CONTROL, "no-cache");
            httpURLConnection.addRequestProperty("X-Android-Package", this.f1390a.getPackageName());
            i iVar = (i) this.f1391b.get();
            if (iVar != null) {
                try {
                    httpURLConnection.addRequestProperty("x-firebase-client", (String) AbstractC0789m.a(iVar.a()));
                } catch (InterruptedException e10) {
                    Thread.currentThread().interrupt();
                    Log.w("ContentValues", "Failed to get heartbeats header", e10);
                } catch (ExecutionException e11) {
                    Log.w("ContentValues", "Failed to get heartbeats header", e11);
                }
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", g());
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused) {
            throw new com.google.firebase.installations.d("Firebase Installations Service is unavailable. Please try again later.", d.a.UNAVAILABLE);
        }
    }

    static long n(String str) {
        AbstractC1287s.b(f1388d.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    private d o(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f1389e));
        f.a a10 = f.a();
        d.a a11 = d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                a11.f(jsonReader.nextString());
            } else if (nextName.equals("fid")) {
                a11.c(jsonReader.nextString());
            } else if (nextName.equals("refreshToken")) {
                a11.d(jsonReader.nextString());
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals("token")) {
                        a10.c(jsonReader.nextString());
                    } else if (nextName2.equals("expiresIn")) {
                        a10.d(n(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                a11.b(a10.a());
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return a11.e(d.b.OK).a();
    }

    private static String p(HttpURLConnection httpURLConnection) {
        InputStream errorStream = httpURLConnection.getErrorStream();
        if (errorStream == null) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f1389e));
        try {
            try {
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb2.append(readLine);
                    sb2.append('\n');
                }
                String format = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb2);
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                }
                return format;
            } catch (IOException unused2) {
                return null;
            }
        } catch (IOException unused3) {
            bufferedReader.close();
            return null;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (IOException unused4) {
            }
            throw th;
        }
    }

    private f q(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f1389e));
        f.a a10 = f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("token")) {
                a10.c(jsonReader.nextString());
            } else if (nextName.equals("expiresIn")) {
                a10.d(n(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return a10.b(f.b.OK).a();
    }

    private void r(HttpURLConnection httpURLConnection, String str, String str2) {
        t(httpURLConnection, i(b(str, str2)));
    }

    private void s(HttpURLConnection httpURLConnection) {
        t(httpURLConnection, i(c()));
    }

    private static void t(URLConnection uRLConnection, byte[] bArr) {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream == null) {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        try {
            gZIPOutputStream.write(bArr);
        } finally {
            try {
                gZIPOutputStream.close();
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public d d(String str, String str2, String str3, String str4, String str5) {
        int responseCode;
        d o10;
        if (!this.f1392c.b()) {
            throw new com.google.firebase.installations.d("Firebase Installations Service is unavailable. Please try again later.", d.a.UNAVAILABLE);
        }
        URL h10 = h(String.format("projects/%s/installations", str3));
        for (int i10 = 0; i10 <= 1; i10++) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection m10 = m(h10, str);
            try {
                try {
                    m10.setRequestMethod("POST");
                    m10.setDoOutput(true);
                    if (str5 != null) {
                        m10.addRequestProperty("x-goog-fis-android-iid-migration-auth", str5);
                    }
                    r(m10, str2, str4);
                    responseCode = m10.getResponseCode();
                    this.f1392c.f(responseCode);
                } catch (IOException | AssertionError unused) {
                }
                if (j(responseCode)) {
                    o10 = o(m10);
                } else {
                    l(m10, str4, str, str3);
                    if (responseCode == 429) {
                        throw new com.google.firebase.installations.d("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", d.a.TOO_MANY_REQUESTS);
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        k();
                        o10 = d.a().e(d.b.BAD_CONFIG).a();
                    }
                    m10.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
                m10.disconnect();
                TrafficStats.clearThreadStatsTag();
                return o10;
            } catch (Throwable th) {
                m10.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th;
            }
        }
        throw new com.google.firebase.installations.d("Firebase Installations Service is unavailable. Please try again later.", d.a.UNAVAILABLE);
    }

    public void e(String str, String str2, String str3, String str4) {
        int responseCode;
        URL h10 = h(String.format("projects/%s/installations/%s", str3, str2));
        int i10 = 0;
        while (i10 <= 1) {
            TrafficStats.setThreadStatsTag(32770);
            HttpURLConnection m10 = m(h10, str);
            try {
                m10.setRequestMethod("DELETE");
                m10.addRequestProperty("Authorization", "FIS_v2 " + str4);
                responseCode = m10.getResponseCode();
            } catch (IOException unused) {
            } catch (Throwable th) {
                m10.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th;
            }
            if (responseCode != 200 && responseCode != 401 && responseCode != 404) {
                l(m10, null, str, str3);
                if (responseCode != 429 && (responseCode < 500 || responseCode >= 600)) {
                    k();
                    throw new com.google.firebase.installations.d("Bad config while trying to delete FID", d.a.BAD_CONFIG);
                }
                i10++;
                m10.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
            m10.disconnect();
            TrafficStats.clearThreadStatsTag();
            return;
        }
        throw new com.google.firebase.installations.d("Firebase Installations Service is unavailable. Please try again later.", d.a.UNAVAILABLE);
    }

    public f f(String str, String str2, String str3, String str4) {
        int responseCode;
        f q10;
        if (!this.f1392c.b()) {
            throw new com.google.firebase.installations.d("Firebase Installations Service is unavailable. Please try again later.", d.a.UNAVAILABLE);
        }
        URL h10 = h(String.format("projects/%s/installations/%s/authTokens:generate", str3, str2));
        for (int i10 = 0; i10 <= 1; i10++) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection m10 = m(h10, str);
            try {
                try {
                    m10.setRequestMethod("POST");
                    m10.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    m10.setDoOutput(true);
                    s(m10);
                    responseCode = m10.getResponseCode();
                    this.f1392c.f(responseCode);
                } finally {
                    m10.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            } catch (IOException | AssertionError unused) {
            }
            if (j(responseCode)) {
                q10 = q(m10);
            } else {
                l(m10, null, str, str3);
                if (responseCode == 401 || responseCode == 404) {
                    q10 = f.a().b(f.b.AUTH_ERROR).a();
                } else {
                    if (responseCode == 429) {
                        throw new com.google.firebase.installations.d("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", d.a.TOO_MANY_REQUESTS);
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        k();
                        q10 = f.a().b(f.b.BAD_CONFIG).a();
                    }
                }
            }
            return q10;
        }
        throw new com.google.firebase.installations.d("Firebase Installations Service is unavailable. Please try again later.", d.a.UNAVAILABLE);
    }
}
