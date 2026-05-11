package com.facebook.react.modules.debug;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class e {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(ArrayList arrayList, long j10) {
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = arrayList.get(i11);
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            if (((Number) obj).longValue() < j10) {
                i10++;
            }
        }
        if (i10 > 0) {
            int i12 = size - i10;
            for (int i13 = 0; i13 < i12; i13++) {
                arrayList.set(i13, arrayList.get(i13 + i10));
            }
            CollectionsKt.Y(arrayList, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long e(ArrayList arrayList, long j10, long j11) {
        Iterator it = arrayList.iterator();
        long j12 = -1;
        while (it.hasNext()) {
            Long l10 = (Long) it.next();
            Intrinsics.d(l10);
            long longValue = l10.longValue();
            if (j10 <= longValue && longValue < j11) {
                j12 = l10.longValue();
            } else if (l10.longValue() >= j11) {
                break;
            }
        }
        return j12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(ArrayList arrayList, long j10, long j11) {
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            long longValue = ((Number) it.next()).longValue();
            if (j10 <= longValue && longValue < j11) {
                return true;
            }
        }
        return false;
    }
}
