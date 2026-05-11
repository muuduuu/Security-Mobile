package com.google.android.datatransport.cct;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.appsflyer.AdRevenueScheme;
import com.google.android.datatransport.cct.d;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import s6.C4317c;
import t6.AbstractC4622a;
import t6.AbstractC4631j;
import t6.AbstractC4632k;
import t6.AbstractC4633l;
import t6.AbstractC4634m;
import t6.AbstractC4635n;
import t6.AbstractC4636o;
import t6.EnumC4637p;
import t8.InterfaceC4820a;
import u6.h;
import u6.i;
import v6.AbstractC4954f;
import v6.AbstractC4955g;
import v6.InterfaceC4961m;
import y6.AbstractC5177a;
import z6.AbstractC5260b;
import z6.InterfaceC5259a;
import z6.InterfaceC5261c;

/* loaded from: classes2.dex */
final class d implements InterfaceC4961m {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4820a f23206a;

    /* renamed from: b, reason: collision with root package name */
    private final ConnectivityManager f23207b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f23208c;

    /* renamed from: d, reason: collision with root package name */
    final URL f23209d;

    /* renamed from: e, reason: collision with root package name */
    private final E6.a f23210e;

    /* renamed from: f, reason: collision with root package name */
    private final E6.a f23211f;

    /* renamed from: g, reason: collision with root package name */
    private final int f23212g;

    static final class a {

        /* renamed from: a, reason: collision with root package name */
        final URL f23213a;

        /* renamed from: b, reason: collision with root package name */
        final AbstractC4631j f23214b;

        /* renamed from: c, reason: collision with root package name */
        final String f23215c;

        a(URL url, AbstractC4631j abstractC4631j, String str) {
            this.f23213a = url;
            this.f23214b = abstractC4631j;
            this.f23215c = str;
        }

        a a(URL url) {
            return new a(url, this.f23214b, this.f23215c);
        }
    }

    static final class b {

        /* renamed from: a, reason: collision with root package name */
        final int f23216a;

        /* renamed from: b, reason: collision with root package name */
        final URL f23217b;

        /* renamed from: c, reason: collision with root package name */
        final long f23218c;

        b(int i10, URL url, long j10) {
            this.f23216a = i10;
            this.f23217b = url;
            this.f23218c = j10;
        }
    }

    d(Context context, E6.a aVar, E6.a aVar2, int i10) {
        this.f23206a = AbstractC4631j.b();
        this.f23208c = context;
        this.f23207b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f23209d = n(com.google.android.datatransport.cct.a.f23197c);
        this.f23210e = aVar2;
        this.f23211f = aVar;
        this.f23212g = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public b e(a aVar) {
        AbstractC5177a.f("CctTransportBackend", "Making request to: %s", aVar.f23213a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f23213a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f23212g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.1.9"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.f23215c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.f23206a.a(aVar.f23214b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    AbstractC5177a.f("CctTransportBackend", "Status Code: %d", Integer.valueOf(responseCode));
                    AbstractC5177a.b("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    AbstractC5177a.b("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream m10 = m(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                        try {
                            b bVar = new b(responseCode, null, AbstractC4635n.b(new BufferedReader(new InputStreamReader(m10))).c());
                            if (m10 != null) {
                                m10.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return bVar;
                        } finally {
                        }
                    } catch (Throwable th) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } finally {
                }
            } catch (Throwable th3) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (ConnectException e10) {
            e = e10;
            AbstractC5177a.d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (UnknownHostException e11) {
            e = e11;
            AbstractC5177a.d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (IOException e12) {
            e = e12;
            AbstractC5177a.d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        } catch (t8.b e13) {
            e = e13;
            AbstractC5177a.d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        }
    }

    private static int f(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return AbstractC4636o.b.UNKNOWN_MOBILE_SUBTYPE.getValue();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return AbstractC4636o.b.COMBINED.getValue();
        }
        if (AbstractC4636o.b.forNumber(subtype) != null) {
            return subtype;
        }
        return 0;
    }

    private static int g(NetworkInfo networkInfo) {
        return networkInfo == null ? AbstractC4636o.c.NONE.getValue() : networkInfo.getType();
    }

    private static int h(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e10) {
            AbstractC5177a.d("CctTransportBackend", "Unable to find version code for package", e10);
            return -1;
        }
    }

    private AbstractC4631j i(AbstractC4954f abstractC4954f) {
        AbstractC4633l.a j10;
        HashMap hashMap = new HashMap();
        for (i iVar : abstractC4954f.b()) {
            String j11 = iVar.j();
            if (hashMap.containsKey(j11)) {
                ((List) hashMap.get(j11)).add(iVar);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(iVar);
                hashMap.put(j11, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            i iVar2 = (i) ((List) entry.getValue()).get(0);
            AbstractC4634m.a b10 = AbstractC4634m.a().f(EnumC4637p.DEFAULT).g(this.f23211f.a()).h(this.f23210e.a()).b(AbstractC4632k.a().c(AbstractC4632k.b.ANDROID_FIREBASE).b(AbstractC4622a.a().m(Integer.valueOf(iVar2.g("sdk-version"))).j(iVar2.b("model")).f(iVar2.b("hardware")).d(iVar2.b("device")).l(iVar2.b("product")).k(iVar2.b("os-uild")).h(iVar2.b("manufacturer")).e(iVar2.b("fingerprint")).c(iVar2.b(AdRevenueScheme.COUNTRY)).g(iVar2.b("locale")).i(iVar2.b("mcc_mnc")).b(iVar2.b("application_build")).a()).a());
            try {
                b10.i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                b10.j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (i iVar3 : (List) entry.getValue()) {
                h e10 = iVar3.e();
                C4317c b11 = e10.b();
                if (b11.equals(C4317c.b("proto"))) {
                    j10 = AbstractC4633l.j(e10.a());
                } else if (b11.equals(C4317c.b("json"))) {
                    j10 = AbstractC4633l.i(new String(e10.a(), Charset.forName("UTF-8")));
                } else {
                    AbstractC5177a.g("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", b11);
                }
                j10.c(iVar3.f()).d(iVar3.k()).h(iVar3.h("tz-offset")).e(AbstractC4636o.a().c(AbstractC4636o.c.forNumber(iVar3.g("net-type"))).b(AbstractC4636o.b.forNumber(iVar3.g("mobile-subtype"))).a());
                if (iVar3.d() != null) {
                    j10.b(iVar3.d());
                }
                arrayList3.add(j10.a());
            }
            b10.c(arrayList3);
            arrayList2.add(b10.a());
        }
        return AbstractC4631j.a(arrayList2);
    }

    private static TelephonyManager j(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    static long k() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ a l(a aVar, b bVar) {
        URL url = bVar.f23217b;
        if (url == null) {
            return null;
        }
        AbstractC5177a.b("CctTransportBackend", "Following redirect to: %s", url);
        return aVar.a(bVar.f23217b);
    }

    private static InputStream m(InputStream inputStream, String str) {
        return "gzip".equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    private static URL n(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException("Invalid url: " + str, e10);
        }
    }

    @Override // v6.InterfaceC4961m
    public AbstractC4955g a(AbstractC4954f abstractC4954f) {
        AbstractC4631j i10 = i(abstractC4954f);
        URL url = this.f23209d;
        if (abstractC4954f.c() != null) {
            try {
                com.google.android.datatransport.cct.a c10 = com.google.android.datatransport.cct.a.c(abstractC4954f.c());
                r3 = c10.d() != null ? c10.d() : null;
                if (c10.e() != null) {
                    url = n(c10.e());
                }
            } catch (IllegalArgumentException unused) {
                return AbstractC4955g.a();
            }
        }
        try {
            b bVar = (b) AbstractC5260b.a(5, new a(url, i10, r3), new InterfaceC5259a() { // from class: com.google.android.datatransport.cct.b
                @Override // z6.InterfaceC5259a
                public final Object apply(Object obj) {
                    d.b e10;
                    e10 = d.this.e((d.a) obj);
                    return e10;
                }
            }, new InterfaceC5261c() { // from class: com.google.android.datatransport.cct.c
                @Override // z6.InterfaceC5261c
                public final Object a(Object obj, Object obj2) {
                    d.a l10;
                    l10 = d.l((d.a) obj, (d.b) obj2);
                    return l10;
                }
            });
            int i11 = bVar.f23216a;
            if (i11 == 200) {
                return AbstractC4955g.e(bVar.f23218c);
            }
            if (i11 < 500 && i11 != 404) {
                return i11 == 400 ? AbstractC4955g.d() : AbstractC4955g.a();
            }
            return AbstractC4955g.f();
        } catch (IOException e10) {
            AbstractC5177a.d("CctTransportBackend", "Could not make request to the backend", e10);
            return AbstractC4955g.f();
        }
    }

    @Override // v6.InterfaceC4961m
    public i b(i iVar) {
        NetworkInfo activeNetworkInfo = this.f23207b.getActiveNetworkInfo();
        return iVar.l().a("sdk-version", Build.VERSION.SDK_INT).c("model", Build.MODEL).c("hardware", Build.HARDWARE).c("device", Build.DEVICE).c("product", Build.PRODUCT).c("os-uild", Build.ID).c("manufacturer", Build.MANUFACTURER).c("fingerprint", Build.FINGERPRINT).b("tz-offset", k()).a("net-type", g(activeNetworkInfo)).a("mobile-subtype", f(activeNetworkInfo)).c(AdRevenueScheme.COUNTRY, Locale.getDefault().getCountry()).c("locale", Locale.getDefault().getLanguage()).c("mcc_mnc", j(this.f23208c).getSimOperator()).c("application_build", Integer.toString(h(this.f23208c))).d();
    }

    d(Context context, E6.a aVar, E6.a aVar2) {
        this(context, aVar, aVar2, 130000);
    }
}
