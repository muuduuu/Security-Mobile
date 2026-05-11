package me;

import Td.n;
import Td.o;
import Td.w;
import Wd.m;
import java.io.IOException;
import java.net.CookieHandler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.G;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lc.t;
import org.conscrypt.BuildConfig;

/* loaded from: classes3.dex */
public final class a implements o {

    /* renamed from: c, reason: collision with root package name */
    private final CookieHandler f37500c;

    public a(CookieHandler cookieHandler) {
        Intrinsics.checkNotNullParameter(cookieHandler, "cookieHandler");
        this.f37500c = cookieHandler;
    }

    private final List e(w wVar, String str) {
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            int k10 = m.k(str, ";,", i10, length);
            int j10 = m.j(str, '=', i10, k10);
            String I10 = m.I(str, i10, j10);
            if (!StringsKt.F(I10, "$", false, 2, null)) {
                String I11 = j10 < k10 ? m.I(str, j10 + 1, k10) : BuildConfig.FLAVOR;
                if (StringsKt.F(I11, "\"", false, 2, null) && StringsKt.q(I11, "\"", false, 2, null) && I11.length() >= 2) {
                    I11 = I11.substring(1, I11.length() - 1);
                    Intrinsics.checkNotNullExpressionValue(I11, "substring(...)");
                }
                arrayList.add(new n.a().d(I10).e(I11).b(wVar.h()).a());
            }
            i10 = k10 + 1;
        }
        return arrayList;
    }

    @Override // Td.o
    public void b(w url, List cookies) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(cookies, "cookies");
        ArrayList arrayList = new ArrayList();
        Iterator it = cookies.iterator();
        while (it.hasNext()) {
            arrayList.add(Wd.a.c((n) it.next(), true));
        }
        try {
            this.f37500c.put(url.v(), G.e(t.a("Set-Cookie", arrayList)));
        } catch (IOException e10) {
            ge.n g10 = ge.n.f33789a.g();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Saving cookies failed for ");
            w t10 = url.t("/...");
            Intrinsics.d(t10);
            sb2.append(t10);
            g10.k(sb2.toString(), 5, e10);
        }
    }

    @Override // Td.o
    public List d(w url) {
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            Map<String, List<String>> map = this.f37500c.get(url.v(), G.h());
            Intrinsics.d(map);
            ArrayList arrayList = null;
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                String key = entry.getKey();
                List<String> value = entry.getValue();
                if (StringsKt.r("Cookie", key, true) || StringsKt.r("Cookie2", key, true)) {
                    Intrinsics.d(value);
                    if (!value.isEmpty()) {
                        for (String str : value) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            Intrinsics.d(str);
                            arrayList.addAll(e(url, str));
                        }
                    }
                }
            }
            if (arrayList == null) {
                return CollectionsKt.j();
            }
            List unmodifiableList = Collections.unmodifiableList(arrayList);
            Intrinsics.d(unmodifiableList);
            return unmodifiableList;
        } catch (IOException e10) {
            ge.n g10 = ge.n.f33789a.g();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Loading cookies failed for ");
            w t10 = url.t("/...");
            Intrinsics.d(t10);
            sb2.append(t10);
            g10.k(sb2.toString(), 5, e10);
            return CollectionsKt.j();
        }
    }
}
