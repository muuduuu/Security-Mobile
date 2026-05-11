package com.groww.skynet.internal.interceptor;

import L2.d;
import L2.e;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ne.a;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f28827a = new b();

    private b() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ArrayList arrayList = new ArrayList();
        ne.a aVar = new ne.a(null, 1, 0 == true ? 1 : 0);
        aVar.c(a.b.BODY);
        arrayList.add(aVar);
        arrayList.add(new d.a(context).e(new L2.b(context, true, e.b.ONE_DAY)).b(true).c());
        return arrayList;
    }
}
