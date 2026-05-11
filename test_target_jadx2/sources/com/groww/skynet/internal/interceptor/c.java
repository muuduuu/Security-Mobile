package com.groww.skynet.internal.interceptor;

import Td.F;
import Td.x;
import co.hyperverge.hypersnapsdk.utils.AppConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.d;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public final class c implements x {
    @Override // Td.x
    public F intercept(x.a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        F a10 = chain.a(chain.t());
        try {
            String o10 = F.o(a10, AppConstants.S3_CACHE_CONTROL, null, 2, null);
            String o11 = F.o(a10, "Age", null, 2, null);
            if (o10 == null || !StringsKt.K(o10, "public", false, 2, null)) {
                return a10;
            }
            List split$default = StringsKt.split$default(o10, new String[]{","}, false, 0, 6, null);
            ArrayList arrayList = new ArrayList(CollectionsKt.u(split$default, 10));
            Iterator it = split$default.iterator();
            while (it.hasNext()) {
                arrayList.add(StringsKt.S0((String) it.next()).toString());
            }
            List<String> Q02 = CollectionsKt.Q0(arrayList);
            Integer num = null;
            for (String str : Q02) {
                if (StringsKt.F(str, "max-age=", false, 2, null)) {
                    num = StringsKt.toIntOrNull(StringsKt.I0(str, "max-age=", null, 2, null));
                }
            }
            if (num == null) {
                return a10;
            }
            Integer intOrNull = o11 != null ? StringsKt.toIntOrNull(o11) : null;
            int d10 = intOrNull != null ? d.d(num.intValue() - intOrNull.intValue(), 0) : 0;
            List<String> list = Q02;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.u(list, 10));
            for (String str2 : list) {
                if (StringsKt.F(str2, "max-age=", false, 2, null)) {
                    str2 = "max-age=" + d10;
                }
                arrayList2.add(str2);
            }
            return a10.t().i(AppConstants.S3_CACHE_CONTROL, CollectionsKt.l0(arrayList2, ",", null, null, 0, null, null, 62, null)).c();
        } catch (Exception unused) {
            return a10;
        }
    }
}
