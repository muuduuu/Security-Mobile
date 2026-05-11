package com.appsflyer.internal;

import android.content.Context;
import android.util.Base64;
import com.appsflyer.AFLogger;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.AbstractC3574i;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import nc.AbstractC3728a;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFc1vSDK implements AFc1tSDK {
    private final AFc1hSDK AFAdRevenueData;
    private final AFc1qSDK getMediationNetwork;
    private final Map<String, Integer> getMonetizationNetwork;
    private final AFc1rSDK getRevenue;

    public AFc1vSDK(AFc1hSDK aFc1hSDK, AFc1qSDK aFc1qSDK) {
        Intrinsics.checkNotNullParameter(aFc1hSDK, "");
        Intrinsics.checkNotNullParameter(aFc1qSDK, "");
        this.AFAdRevenueData = aFc1hSDK;
        this.getMediationNetwork = aFc1qSDK;
        this.getRevenue = new AFc1rSDK(CollectionsKt.m(new AFc1sSDK("ConversionsCache", CollectionsKt.e(AFe1pSDK.CONVERSION), 1), new AFc1sSDK("AttrCache", CollectionsKt.e(AFe1pSDK.ATTR), 1), new AFc1sSDK("OtherCache", CollectionsKt.m(AFe1pSDK.LAUNCH, AFe1pSDK.INAPP, AFe1pSDK.ADREVENUE, AFe1pSDK.ARS_VALIDATE, AFe1pSDK.PURCHASE_VALIDATE, AFe1pSDK.MANUAL_PURCHASE_VALIDATION, AFe1pSDK.SDK_SERVICES), 40)));
        this.getMonetizationNetwork = kotlin.collections.G.l(lc.t.a("ConversionsCache", 0), lc.t.a("AttrCache", 0), lc.t.a("OtherCache", 0));
    }

    private static AFc1uSDK AFAdRevenueData(File file) {
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), Charset.defaultCharset());
            try {
                char[] cArr = new char[(int) file.length()];
                inputStreamReader.read(cArr);
                AFc1uSDK aFc1uSDK = new AFc1uSDK(cArr);
                aFc1uSDK.getMediationNetwork = file.getName();
                kotlin.io.c.a(inputStreamReader, null);
                return aFc1uSDK;
            } finally {
            }
        } catch (Exception e10) {
            AFLogger.INSTANCE.e(AFg1cSDK.CACHE, "Error while loading request from cache", e10, false, false, true, false);
            return null;
        }
    }

    private final void getMonetizationNetwork() {
        for (AFc1sSDK aFc1sSDK : this.getRevenue.getMediationNetwork) {
            String str = aFc1sSDK.AFAdRevenueData;
            Context context = this.AFAdRevenueData.getMonetizationNetwork;
            Intrinsics.d(context);
            File file = new File(new File(context.getFilesDir(), "AFRequestCache"), str);
            if (file.exists()) {
                Map<String, Integer> map = this.getMonetizationNetwork;
                String str2 = aFc1sSDK.AFAdRevenueData;
                File[] listFiles = file.listFiles();
                map.put(str2, Integer.valueOf(listFiles != null ? listFiles.length : 0));
            } else {
                file.mkdirs();
                this.getMonetizationNetwork.put(aFc1sSDK.AFAdRevenueData, 0);
            }
        }
    }

    @Override // com.appsflyer.internal.AFc1tSDK
    public final List<AFc1uSDK> getCurrencyIso4217Code() {
        AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Get Cached Requests", false, 4, null);
        ArrayList arrayList = new ArrayList();
        ArrayList<File> arrayList2 = new ArrayList();
        try {
            Context context = this.AFAdRevenueData.getMonetizationNetwork;
            Intrinsics.d(context);
            if (!new File(context.getFilesDir(), "AFRequestCache").exists()) {
                Context context2 = this.AFAdRevenueData.getMonetizationNetwork;
                Intrinsics.d(context2);
                new File(context2.getFilesDir(), "AFRequestCache").mkdir();
            }
            Iterator<T> it = this.getRevenue.getMediationNetwork.iterator();
            while (it.hasNext()) {
                String str = ((AFc1sSDK) it.next()).AFAdRevenueData;
                Context context3 = this.AFAdRevenueData.getMonetizationNetwork;
                Intrinsics.d(context3);
                File file = new File(new File(context3.getFilesDir(), "AFRequestCache"), str);
                if (!file.exists()) {
                    file.mkdirs();
                }
                File[] listFiles = file.listFiles();
                if (listFiles == null) {
                    listFiles = new File[0];
                }
                CollectionsKt.A(arrayList2, listFiles);
            }
            for (File file2 : arrayList2) {
                AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Found cached request: " + file2.getName(), false, 4, null);
                AFc1uSDK AFAdRevenueData = AFAdRevenueData(file2);
                if (AFAdRevenueData != null) {
                    arrayList.add(AFAdRevenueData);
                }
            }
        } catch (Exception e10) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Could not get cached requests", e10, false, false, false, false, 120, null);
        }
        AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Found " + arrayList.size() + " Cached Requests", false, 4, null);
        return arrayList;
    }

    @Override // com.appsflyer.internal.AFc1tSDK
    public final void getMediationNetwork() {
        try {
            if (this.getMediationNetwork.getRevenue("AF_CACHE_VERSION", -1) == 2) {
                Context context = this.AFAdRevenueData.getMonetizationNetwork;
                Intrinsics.d(context);
                if (!new File(context.getFilesDir(), "AFRequestCache").exists()) {
                    Context context2 = this.AFAdRevenueData.getMonetizationNetwork;
                    Intrinsics.d(context2);
                    new File(context2.getFilesDir(), "AFRequestCache").mkdir();
                }
            } else {
                this.getMediationNetwork.getMediationNetwork("AF_CACHE_VERSION", 2);
                Context context3 = this.AFAdRevenueData.getMonetizationNetwork;
                Intrinsics.d(context3);
                if (new File(context3.getFilesDir(), "AFRequestCache").exists()) {
                    Context context4 = this.AFAdRevenueData.getMonetizationNetwork;
                    Intrinsics.d(context4);
                    kotlin.io.j.t(new File(context4.getFilesDir(), "AFRequestCache"));
                    Context context5 = this.AFAdRevenueData.getMonetizationNetwork;
                    Intrinsics.d(context5);
                    new File(context5.getFilesDir(), "AFRequestCache").mkdir();
                }
            }
            getMonetizationNetwork();
        } catch (Exception e10) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Could not init cache", e10, false, false, false, false, 120, null);
        }
    }

    @Override // com.appsflyer.internal.AFc1tSDK
    public final void getRevenue() {
        try {
            Context context = this.AFAdRevenueData.getMonetizationNetwork;
            Intrinsics.d(context);
            if (!new File(context.getFilesDir(), "AFRequestCache").exists()) {
                Context context2 = this.AFAdRevenueData.getMonetizationNetwork;
                Intrinsics.d(context2);
                new File(context2.getFilesDir(), "AFRequestCache").mkdir();
                return;
            }
            Iterator<T> it = this.getRevenue.getMediationNetwork.iterator();
            while (it.hasNext()) {
                String str = ((AFc1sSDK) it.next()).AFAdRevenueData;
                Context context3 = this.AFAdRevenueData.getMonetizationNetwork;
                Intrinsics.d(context3);
                File[] listFiles = new File(new File(context3.getFilesDir(), "AFRequestCache"), str).listFiles();
                if (listFiles != null) {
                    Intrinsics.checkNotNullExpressionValue(listFiles, "");
                    for (File file : listFiles) {
                        AFLogger aFLogger = AFLogger.INSTANCE;
                        AFg1cSDK aFg1cSDK = AFg1cSDK.CACHE;
                        AFh1ySDK.i$default(aFLogger, aFg1cSDK, "ClearCache : Found cached request " + file.getName(), false, 4, null);
                        AFh1ySDK.i$default(aFLogger, aFg1cSDK, "Deleting " + file.getName() + " from cache", false, 4, null);
                        file.delete();
                    }
                }
            }
            Context context4 = this.AFAdRevenueData.getMonetizationNetwork;
            Intrinsics.d(context4);
            kotlin.io.j.t(new File(context4.getFilesDir(), "AFRequestCache"));
            getMonetizationNetwork();
        } catch (Exception e10) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Could not clearCache request", e10, false, false, false, false, 120, null);
        }
    }

    private final String AFAdRevenueData(AFe1pSDK aFe1pSDK) {
        String str;
        AFc1sSDK mediationNetwork = getMediationNetwork(aFe1pSDK);
        if (mediationNetwork == null || (str = mediationNetwork.AFAdRevenueData) == null) {
            throw new UnsupportedOperationException("Cache do not support this type of events");
        }
        return str;
    }

    private final boolean getMediationNetwork(File file) {
        try {
            file.delete();
            getMonetizationNetwork();
            return true;
        } catch (Exception e10) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Could not delete " + file.getName() + " from cache", e10, false, false, false, false, 120, null);
            return false;
        }
    }

    private final AFc1sSDK getMediationNetwork(AFe1pSDK aFe1pSDK) {
        Object obj;
        Iterator<T> it = this.getRevenue.getMediationNetwork.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((AFc1sSDK) obj).getMediationNetwork.contains(aFe1pSDK)) {
                break;
            }
        }
        return (AFc1sSDK) obj;
    }

    @Override // com.appsflyer.internal.AFc1tSDK
    public final boolean getRevenue(String str) {
        if (str == null) {
            return false;
        }
        Context context = this.AFAdRevenueData.getMonetizationNetwork;
        Intrinsics.d(context);
        if (!new File(context.getFilesDir(), "AFRequestCache").exists()) {
            Context context2 = this.AFAdRevenueData.getMonetizationNetwork;
            Intrinsics.d(context2);
            new File(context2.getFilesDir(), "AFRequestCache").mkdir();
            return true;
        }
        AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Deleting " + str + " from cache", false, 4, null);
        Iterator<T> it = this.getRevenue.getMediationNetwork.iterator();
        while (it.hasNext()) {
            String str2 = ((AFc1sSDK) it.next()).AFAdRevenueData;
            Context context3 = this.AFAdRevenueData.getMonetizationNetwork;
            Intrinsics.d(context3);
            File file = new File(new File(new File(context3.getFilesDir(), "AFRequestCache"), str2), str);
            if (file.exists()) {
                return getMediationNetwork(file);
            }
        }
        return true;
    }

    @Override // com.appsflyer.internal.AFc1tSDK
    public final String getMediationNetwork(AFc1uSDK aFc1uSDK) {
        Exception exc;
        File file;
        AFLogger aFLogger;
        AFg1cSDK aFg1cSDK;
        String valueOf;
        String str;
        List d02;
        List<File> G02;
        Intrinsics.checkNotNullParameter(aFc1uSDK, "");
        try {
            AFe1pSDK aFe1pSDK = aFc1uSDK.AFAdRevenueData;
            Intrinsics.checkNotNullExpressionValue(aFe1pSDK, "");
            Context context = this.AFAdRevenueData.getMonetizationNetwork;
            Intrinsics.d(context);
            File file2 = new File(new File(context.getFilesDir(), "AFRequestCache"), AFAdRevenueData(aFe1pSDK));
            if (!file2.exists()) {
                file2.mkdirs();
            }
            aFLogger = AFLogger.INSTANCE;
            aFg1cSDK = AFg1cSDK.CACHE;
            AFh1ySDK.i$default(aFLogger, aFg1cSDK, "Caching request with URL: " + aFc1uSDK.getRevenue, false, 4, null);
            valueOf = String.valueOf(System.currentTimeMillis());
            file = new File(file2, valueOf);
        } catch (Exception e10) {
            exc = e10;
            file = null;
        }
        try {
            file.createNewFile();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file.getPath(), true), Charset.defaultCharset());
            try {
                outputStreamWriter.write("version=");
                outputStreamWriter.write(aFc1uSDK.getCurrencyIso4217Code);
                outputStreamWriter.write(10);
                outputStreamWriter.write("url=");
                outputStreamWriter.write(aFc1uSDK.getRevenue);
                outputStreamWriter.write(10);
                outputStreamWriter.write("data=");
                outputStreamWriter.write(Base64.encodeToString(aFc1uSDK.getMediationNetwork(), 2));
                outputStreamWriter.write(10);
                AFe1pSDK aFe1pSDK2 = aFc1uSDK.AFAdRevenueData;
                outputStreamWriter.write("type=");
                outputStreamWriter.write(aFe1pSDK2.name());
                outputStreamWriter.write(10);
                Map<String, String> map = aFc1uSDK.getMonetizationNetwork;
                if (map != null && !map.isEmpty()) {
                    outputStreamWriter.write("headers=");
                    Map<String, String> map2 = aFc1uSDK.getMonetizationNetwork;
                    Intrinsics.e(map2, "");
                    String jSONObject = new JSONObject(map2).toString();
                    Intrinsics.checkNotNullExpressionValue(jSONObject, "");
                    byte[] bytes = jSONObject.getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes, "");
                    outputStreamWriter.write(Base64.encodeToString(bytes, 2));
                    outputStreamWriter.write(10);
                }
                outputStreamWriter.flush();
                Unit unit = Unit.f36324a;
                kotlin.io.c.a(outputStreamWriter, null);
                AFh1ySDK.i$default(aFLogger, aFg1cSDK, "Cache request: done, cacheKey: " + valueOf, false, 4, null);
                AFe1pSDK aFe1pSDK3 = aFc1uSDK.AFAdRevenueData;
                Intrinsics.checkNotNullExpressionValue(aFe1pSDK3, "");
                AFc1sSDK mediationNetwork = getMediationNetwork(aFe1pSDK3);
                Integer valueOf2 = mediationNetwork != null ? Integer.valueOf(mediationNetwork.getMonetizationNetwork) : null;
                if (valueOf2 != null) {
                    int intValue = valueOf2.intValue();
                    Map<String, Integer> map3 = this.getMonetizationNetwork;
                    AFc1sSDK mediationNetwork2 = getMediationNetwork(aFe1pSDK3);
                    if (mediationNetwork2 != null && (str = mediationNetwork2.AFAdRevenueData) != null) {
                        Integer num = map3.get(str);
                        int intValue2 = num != null ? num.intValue() : 0;
                        if (intValue2 >= intValue) {
                            int i10 = (intValue2 + 1) - intValue;
                            AFh1ySDK.i$default(aFLogger, aFg1cSDK, "Cache overflown for type " + aFe1pSDK3 + ", removing " + i10 + " item(s)", false, 4, null);
                            Context context2 = this.AFAdRevenueData.getMonetizationNetwork;
                            Intrinsics.d(context2);
                            File file3 = new File(new File(context2.getFilesDir(), "AFRequestCache"), AFAdRevenueData(aFe1pSDK3));
                            if (!file3.exists()) {
                                file3.mkdirs();
                            }
                            File[] listFiles = file3.listFiles();
                            if (listFiles != null && (d02 = AbstractC3574i.d0(listFiles, new Comparator() { // from class: com.appsflyer.internal.AFc1vSDK.4
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // java.util.Comparator
                                public final int compare(T t10, T t11) {
                                    return AbstractC3728a.a(((File) t10).getName(), ((File) t11).getName());
                                }
                            })) != null && (G02 = CollectionsKt.G0(d02, i10)) != null) {
                                for (File file4 : G02) {
                                    file4.delete();
                                    AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Cache entry " + file4.getName() + " removed", false, 4, null);
                                }
                            }
                        }
                        getMonetizationNetwork();
                    } else {
                        throw new UnsupportedOperationException("Cache do not support this type of events");
                    }
                }
                return valueOf;
            } finally {
            }
        } catch (Exception e11) {
            exc = e11;
            if (file != null) {
                file.delete();
            }
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Could not cache request", exc, false, false, false, false, 120, null);
            return null;
        }
    }
}
