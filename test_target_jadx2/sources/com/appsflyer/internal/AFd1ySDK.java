package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.ExceptionInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.AbstractC3574i;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AFd1ySDK implements AFc1cSDK {
    private final AFc1hSDK getMonetizationNetwork;

    public AFd1ySDK(AFc1hSDK aFc1hSDK) {
        Intrinsics.checkNotNullParameter(aFc1hSDK, "");
        this.getMonetizationNetwork = aFc1hSDK;
    }

    private final File AFAdRevenueData() {
        Context context = this.getMonetizationNetwork.getMonetizationNetwork;
        if (context == null) {
            return null;
        }
        File file = new File(context.getFilesDir(), "AFExceptionsCache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    @Override // com.appsflyer.internal.AFc1cSDK
    public final boolean getCurrencyIso4217Code() {
        return getMonetizationNetwork(new String[0]);
    }

    @Override // com.appsflyer.internal.AFc1cSDK
    public final int getMediationNetwork() {
        Iterator<T> it = getRevenue().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += ((ExceptionInfo) it.next()).counter;
        }
        return i10;
    }

    @Override // com.appsflyer.internal.AFc1cSDK
    public final boolean getMonetizationNetwork(String... strArr) {
        boolean z10;
        Intrinsics.checkNotNullParameter(strArr, "");
        synchronized (this) {
            try {
                File AFAdRevenueData = AFAdRevenueData();
                z10 = true;
                if (AFAdRevenueData != null) {
                    if (strArr.length == 0) {
                        AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "delete all exceptions", false, 4, null);
                        z10 = kotlin.io.j.t(AFAdRevenueData);
                    } else {
                        AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "delete all exceptions except for: " + AbstractC3574i.S(strArr, ", ", null, null, 0, null, null, 62, null), false, 4, null);
                        File[] listFiles = AFAdRevenueData.listFiles();
                        if (listFiles != null) {
                            Intrinsics.checkNotNullExpressionValue(listFiles, "");
                            ArrayList<File> arrayList = new ArrayList();
                            for (File file : listFiles) {
                                if (!AbstractC3574i.v(strArr, file.getName())) {
                                    arrayList.add(file);
                                }
                            }
                            ArrayList arrayList2 = new ArrayList(CollectionsKt.u(arrayList, 10));
                            for (File file2 : arrayList) {
                                Intrinsics.checkNotNullExpressionValue(file2, "");
                                arrayList2.add(Boolean.valueOf(kotlin.io.j.t(file2)));
                            }
                            Set S02 = CollectionsKt.S0(arrayList2);
                            if (S02.isEmpty()) {
                                S02 = kotlin.collections.O.c(Boolean.TRUE);
                            }
                            if (S02.size() != 1 || !((Boolean) CollectionsKt.c0(S02)).booleanValue()) {
                                z10 = false;
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006c A[Catch: all -> 0x0070, TryCatch #0 {all -> 0x0070, blocks: (B:4:0x0002, B:6:0x0009, B:8:0x000f, B:10:0x0019, B:24:0x006c, B:26:0x0072, B:31:0x004a, B:33:0x0074, B:35:0x007a, B:12:0x001b, B:14:0x0021, B:16:0x002f, B:18:0x0042), top: B:3:0x0002, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072 A[SYNTHETIC] */
    @Override // com.appsflyer.internal.AFc1cSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<ExceptionInfo> getRevenue() {
        List<ExceptionInfo> list;
        File[] listFiles;
        ArrayList arrayList;
        File[] listFiles2;
        synchronized (this) {
            try {
                File AFAdRevenueData = AFAdRevenueData();
                list = null;
                if (AFAdRevenueData != null && (listFiles = AFAdRevenueData.listFiles()) != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (File file : listFiles) {
                        try {
                            listFiles2 = file.listFiles();
                        } catch (Throwable th) {
                            AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "Could not get stored exceptions\n " + th.getMessage(), false, 4, null);
                        }
                        if (listFiles2 != null) {
                            Intrinsics.checkNotNullExpressionValue(listFiles2, "");
                            arrayList = new ArrayList();
                            for (File file2 : listFiles2) {
                                ExceptionInfo.Companion companion = ExceptionInfo.INSTANCE;
                                Intrinsics.checkNotNullExpressionValue(file2, "");
                                ExceptionInfo mediationNetwork = ExceptionInfo.Companion.getMediationNetwork(kotlin.io.j.i(file2, null, 1, null));
                                if (mediationNetwork != null) {
                                    arrayList.add(mediationNetwork);
                                }
                            }
                            if (arrayList == null) {
                                arrayList2.add(arrayList);
                            }
                        }
                        arrayList = null;
                        if (arrayList == null) {
                        }
                    }
                    list = CollectionsKt.w(arrayList2);
                }
                if (list == null) {
                    list = CollectionsKt.j();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return list;
    }

    @Override // com.appsflyer.internal.AFc1cSDK
    public final void getCurrencyIso4217Code(int i10, int i11) {
        File[] listFiles;
        synchronized (this) {
            try {
                File AFAdRevenueData = AFAdRevenueData();
                if (AFAdRevenueData != null && (listFiles = AFAdRevenueData.listFiles()) != null) {
                    Intrinsics.checkNotNullExpressionValue(listFiles, "");
                    ArrayList<File> arrayList = new ArrayList();
                    for (File file : listFiles) {
                        String name = file.getName();
                        Intrinsics.checkNotNullExpressionValue(name, "");
                        int mediationNetwork = AFk1xSDK.getMediationNetwork(name);
                        if (i10 > mediationNetwork || mediationNetwork > i11) {
                            arrayList.add(file);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.u(arrayList, 10));
                    for (File file2 : arrayList) {
                        Intrinsics.checkNotNullExpressionValue(file2, "");
                        arrayList2.add(Boolean.valueOf(kotlin.io.j.t(file2)));
                    }
                }
                Unit unit = Unit.f36324a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.appsflyer.internal.AFc1cSDK
    public final String AFAdRevenueData(Throwable th, String str) {
        String str2;
        File file;
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(str, "");
        synchronized (this) {
            File AFAdRevenueData = AFAdRevenueData();
            str2 = null;
            if (AFAdRevenueData != null) {
                file = new File(AFAdRevenueData, "6.17.5");
                if (!file.exists()) {
                    file.mkdirs();
                }
            } else {
                file = null;
            }
            if (file != null) {
                try {
                    ExceptionInfo revenue = AFd1sSDK.getRevenue(th, str);
                    String str3 = revenue.hashName;
                    File file2 = new File(file, str3);
                    if (file2.exists()) {
                        ExceptionInfo.Companion companion = ExceptionInfo.INSTANCE;
                        ExceptionInfo mediationNetwork = ExceptionInfo.Companion.getMediationNetwork(kotlin.io.j.i(file2, null, 1, null));
                        if (mediationNetwork != null) {
                            mediationNetwork.counter++;
                            revenue = mediationNetwork;
                        }
                    }
                    kotlin.io.j.k(file2, revenue.getMonetizationNetwork(), null, 2, null);
                    str2 = str3;
                } catch (Exception e10) {
                    AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "Could not cache exception\n " + e10.getMessage(), false, 4, null);
                }
            }
        }
        return str2;
    }
}
