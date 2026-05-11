package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
public final class AFd1gSDK {
    private final int getRevenue;

    public AFd1gSDK(int i10) {
        this.getRevenue = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String getMediationNetwork(HttpURLConnection httpURLConnection) {
        BufferedReader bufferedReader;
        InputStream errorStream;
        InputStreamReader inputStreamReader = null;
        try {
            try {
                errorStream = httpURLConnection.getInputStream();
            } catch (Exception e10) {
                errorStream = httpURLConnection.getErrorStream();
                AFLogger.INSTANCE.e(AFg1cSDK.HTTP_CLIENT, e10.getMessage() != null ? e10.getMessage() : BuildConfig.FLAVOR, e10, false, false, false, false);
            }
            if (errorStream == null) {
                return BuildConfig.FLAVOR;
            }
            StringBuilder sb2 = new StringBuilder();
            InputStreamReader inputStreamReader2 = new InputStreamReader(errorStream, Charset.defaultCharset());
            try {
                BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader2);
                boolean z10 = true;
                while (true) {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine == null) {
                            String obj = sb2.toString();
                            inputStreamReader2.close();
                            bufferedReader2.close();
                            return obj;
                        }
                        if (!z10) {
                            sb2.append('\n');
                        }
                        sb2.append(readLine);
                        z10 = false;
                    } catch (Throwable th) {
                        inputStreamReader = inputStreamReader2;
                        bufferedReader = bufferedReader2;
                        th = th;
                        if (inputStreamReader != null) {
                        }
                        if (bufferedReader != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = null;
                inputStreamReader = inputStreamReader2;
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedReader = null;
            if (inputStreamReader != null) {
                inputStreamReader.close();
            }
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            throw th;
        }
    }

    public final AFe1wSDK<String> getCurrencyIso4217Code(AFd1bSDK aFd1bSDK) {
        HttpURLConnection httpURLConnection;
        BufferedOutputStream bufferedOutputStream;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            byte[] revenue = aFd1bSDK.getRevenue();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(aFd1bSDK.getMonetizationNetwork);
            sb2.append(":");
            sb2.append(aFd1bSDK.getMediationNetwork);
            StringBuilder sb3 = new StringBuilder(sb2.toString());
            byte[] revenue2 = aFd1bSDK.getRevenue();
            if (aFd1bSDK.getMonetizationNetwork() && revenue2 != null) {
                try {
                    String str = aFd1bSDK.getMediationNetwork() ? "<encrypted>" : new String(revenue2, Charset.defaultCharset());
                    sb3.append("\n payload: ");
                    sb3.append(str);
                } catch (Throwable th) {
                    th = th;
                    httpURLConnection = null;
                    try {
                        AFd1aSDK aFd1aSDK = new AFd1aSDK(System.currentTimeMillis() - currentTimeMillis);
                        StringBuilder sb4 = new StringBuilder("error: ");
                        sb4.append(th);
                        sb4.append("\n took ");
                        sb4.append(aFd1aSDK.getMediationNetwork);
                        sb4.append("ms");
                        String obj = sb4.toString();
                        AFLogger aFLogger = AFLogger.INSTANCE;
                        AFg1cSDK aFg1cSDK = AFg1cSDK.HTTP_CLIENT;
                        StringBuilder sb5 = new StringBuilder("[");
                        sb5.append(aFd1bSDK.hashCode());
                        sb5.append("] ");
                        sb5.append(obj);
                        aFLogger.e(aFg1cSDK, sb5.toString(), th, false, false, false);
                        throw new HttpException(th, aFd1aSDK);
                    } catch (Throwable th2) {
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        throw th2;
                    }
                }
            }
            for (Map.Entry<String, String> entry : aFd1bSDK.AFAdRevenueData.entrySet()) {
                sb3.append("\n ");
                sb3.append(entry.getKey());
                sb3.append(": ");
                sb3.append(entry.getValue());
            }
            StringBuilder sb6 = new StringBuilder("[");
            sb6.append(aFd1bSDK.hashCode());
            sb6.append("] ");
            sb6.append((Object) sb3);
            AFLogger.INSTANCE.d(AFg1cSDK.HTTP_CLIENT, sb6.toString());
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(aFd1bSDK.getMediationNetwork).openConnection();
            try {
                httpURLConnection2.setRequestMethod(aFd1bSDK.getMonetizationNetwork);
                if (aFd1bSDK.getCurrencyIso4217Code()) {
                    httpURLConnection2.setUseCaches(false);
                }
                if (!aFd1bSDK.component1()) {
                    httpURLConnection2.setInstanceFollowRedirects(false);
                }
                try {
                    int i10 = this.getRevenue;
                    int i11 = aFd1bSDK.component4;
                    if (i11 != -1) {
                        i10 = i11;
                    }
                    httpURLConnection2.setConnectTimeout(i10);
                    httpURLConnection2.setReadTimeout(i10);
                    httpURLConnection2.addRequestProperty("Content-Type", aFd1bSDK.getMediationNetwork() ? "application/octet-stream" : "application/json");
                    for (Map.Entry<String, String> entry2 : aFd1bSDK.AFAdRevenueData.entrySet()) {
                        httpURLConnection2.setRequestProperty(entry2.getKey(), entry2.getValue());
                    }
                    if (revenue != null) {
                        httpURLConnection2.setDoOutput(true);
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append(revenue.length);
                        httpURLConnection2.setRequestProperty("Content-Length", sb7.toString());
                        try {
                            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(httpURLConnection2.getOutputStream());
                            try {
                                bufferedOutputStream2.write(revenue);
                                bufferedOutputStream2.close();
                            } catch (Throwable th3) {
                                th = th3;
                                bufferedOutputStream = bufferedOutputStream2;
                                if (bufferedOutputStream != null) {
                                    bufferedOutputStream.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            bufferedOutputStream = null;
                        }
                    }
                    boolean z10 = httpURLConnection2.getResponseCode() / 100 == 2;
                    String mediationNetwork = aFd1bSDK.AFAdRevenueData() ? getMediationNetwork(httpURLConnection2) : BuildConfig.FLAVOR;
                    AFd1aSDK aFd1aSDK2 = new AFd1aSDK(System.currentTimeMillis() - currentTimeMillis);
                    StringBuilder sb8 = new StringBuilder("response code:");
                    sb8.append(httpURLConnection2.getResponseCode());
                    sb8.append(" ");
                    sb8.append(httpURLConnection2.getResponseMessage());
                    sb8.append("\n body:");
                    sb8.append(mediationNetwork);
                    sb8.append("\n took ");
                    sb8.append(aFd1aSDK2.getMediationNetwork);
                    sb8.append("ms");
                    String obj2 = sb8.toString();
                    AFLogger aFLogger2 = AFLogger.INSTANCE;
                    AFg1cSDK aFg1cSDK2 = AFg1cSDK.HTTP_CLIENT;
                    StringBuilder sb9 = new StringBuilder("[");
                    sb9.append(aFd1bSDK.hashCode());
                    sb9.append("] ");
                    sb9.append(obj2);
                    aFLogger2.d(aFg1cSDK2, sb9.toString());
                    HashMap hashMap = new HashMap(httpURLConnection2.getHeaderFields());
                    hashMap.remove(null);
                    AFe1wSDK<String> aFe1wSDK = new AFe1wSDK<>(mediationNetwork, httpURLConnection2.getResponseCode(), z10, hashMap, aFd1aSDK2);
                    httpURLConnection2.disconnect();
                    return aFe1wSDK;
                } catch (Throwable th5) {
                    th = th5;
                    httpURLConnection = httpURLConnection2;
                    AFd1aSDK aFd1aSDK3 = new AFd1aSDK(System.currentTimeMillis() - currentTimeMillis);
                    StringBuilder sb42 = new StringBuilder("error: ");
                    sb42.append(th);
                    sb42.append("\n took ");
                    sb42.append(aFd1aSDK3.getMediationNetwork);
                    sb42.append("ms");
                    String obj3 = sb42.toString();
                    AFLogger aFLogger3 = AFLogger.INSTANCE;
                    AFg1cSDK aFg1cSDK3 = AFg1cSDK.HTTP_CLIENT;
                    StringBuilder sb52 = new StringBuilder("[");
                    sb52.append(aFd1bSDK.hashCode());
                    sb52.append("] ");
                    sb52.append(obj3);
                    aFLogger3.e(aFg1cSDK3, sb52.toString(), th, false, false, false);
                    throw new HttpException(th, aFd1aSDK3);
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Throwable th7) {
            th = th7;
            httpURLConnection = null;
        }
    }
}
