package be;

import Td.C1232h;
import Td.F;
import Td.o;
import Td.v;
import Td.w;
import Wd.m;
import Wd.p;
import ge.n;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.G;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import pe.C3877e;
import pe.C3880h;

/* loaded from: classes3.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    private static final C3880h f19056a;

    /* renamed from: b, reason: collision with root package name */
    private static final C3880h f19057b;

    static {
        C3880h.a aVar = C3880h.f38683d;
        f19056a = aVar.d("\"\\");
        f19057b = aVar.d("\t ,=");
    }

    public static final List a(v vVar, String headerName) {
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        Intrinsics.checkNotNullParameter(headerName, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = vVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (StringsKt.r(headerName, vVar.h(i10), true)) {
                try {
                    c(new C3877e().T0(vVar.v(i10)), arrayList);
                } catch (EOFException e10) {
                    n.f33789a.g().k("Unable to parse challenge", 5, e10);
                }
            }
        }
        return arrayList;
    }

    public static final boolean b(F f10) {
        Intrinsics.checkNotNullParameter(f10, "<this>");
        if (Intrinsics.b(f10.z().i(), "HEAD")) {
            return false;
        }
        int f11 = f10.f();
        return (((f11 >= 100 && f11 < 200) || f11 == 204 || f11 == 304) && p.j(f10) == -1 && !StringsKt.r("chunked", F.o(f10, "Transfer-Encoding", null, 2, null), true)) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ba, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ba, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void c(C3877e c3877e, List list) {
        String e10;
        int F10;
        LinkedHashMap linkedHashMap;
        while (true) {
            String str = null;
            while (true) {
                if (str == null) {
                    g(c3877e);
                    str = e(c3877e);
                    if (str == null) {
                        return;
                    }
                }
                boolean g10 = g(c3877e);
                e10 = e(c3877e);
                if (e10 == null) {
                    if (c3877e.p0()) {
                        list.add(new C1232h(str, G.h()));
                        return;
                    }
                    return;
                }
                F10 = m.F(c3877e, (byte) 61);
                boolean g11 = g(c3877e);
                if (g10 || (!g11 && !c3877e.p0())) {
                    linkedHashMap = new LinkedHashMap();
                    int F11 = F10 + m.F(c3877e, (byte) 61);
                    while (true) {
                        if (e10 == null) {
                            e10 = e(c3877e);
                            if (!g(c3877e)) {
                                F11 = m.F(c3877e, (byte) 61);
                            }
                        }
                        if (F11 != 0) {
                            if (F11 > 1 || g(c3877e)) {
                                return;
                            }
                            String d10 = h(c3877e, (byte) 34) ? d(c3877e) : e(c3877e);
                            if (d10 == null || ((String) linkedHashMap.put(e10, d10)) != null) {
                                return;
                            }
                            if (!g(c3877e) && !c3877e.p0()) {
                                return;
                            } else {
                                e10 = null;
                            }
                        }
                    }
                }
                list.add(new C1232h(str, linkedHashMap));
                str = e10;
            }
            Map singletonMap = Collections.singletonMap(null, e10 + StringsKt.v("=", F10));
            Intrinsics.checkNotNullExpressionValue(singletonMap, "singletonMap(...)");
            list.add(new C1232h(str, singletonMap));
        }
    }

    private static final String d(C3877e c3877e) {
        if (c3877e.readByte() != 34) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        C3877e c3877e2 = new C3877e();
        while (true) {
            long W02 = c3877e.W0(f19056a);
            if (W02 == -1) {
                return null;
            }
            if (c3877e.p(W02) == 34) {
                c3877e2.N0(c3877e, W02);
                c3877e.readByte();
                return c3877e2.F1();
            }
            if (c3877e.size() == W02 + 1) {
                return null;
            }
            c3877e2.N0(c3877e, W02);
            c3877e.readByte();
            c3877e2.N0(c3877e, 1L);
        }
    }

    private static final String e(C3877e c3877e) {
        long W02 = c3877e.W0(f19057b);
        if (W02 == -1) {
            W02 = c3877e.size();
        }
        if (W02 != 0) {
            return c3877e.R(W02);
        }
        return null;
    }

    public static final void f(o oVar, w url, v headers) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        if (oVar == o.f10187b) {
            return;
        }
        List e10 = Td.n.f10161k.e(url, headers);
        if (e10.isEmpty()) {
            return;
        }
        oVar.b(url, e10);
    }

    private static final boolean g(C3877e c3877e) {
        boolean z10 = false;
        while (!c3877e.p0()) {
            byte p10 = c3877e.p(0L);
            if (p10 == 44) {
                c3877e.readByte();
                z10 = true;
            } else {
                if (p10 != 32 && p10 != 9) {
                    break;
                }
                c3877e.readByte();
            }
        }
        return z10;
    }

    private static final boolean h(C3877e c3877e, byte b10) {
        return !c3877e.p0() && c3877e.p(0L) == b10;
    }
}
