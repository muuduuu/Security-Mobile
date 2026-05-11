package com.google.android.gms.measurement.internal;

import V6.AbstractC1287s;
import W6.b;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C2194b;
import com.google.android.gms.internal.measurement.C2207c3;
import com.google.android.gms.internal.measurement.C2216d3;
import com.google.android.gms.internal.measurement.C2225e3;
import com.google.android.gms.internal.measurement.C2270j3;
import com.google.android.gms.internal.measurement.C2288l3;
import com.google.android.gms.internal.measurement.C2301m7;
import com.google.android.gms.internal.measurement.C2359t3;
import com.google.android.gms.internal.measurement.C2368u3;
import com.google.android.gms.internal.measurement.C2377v3;
import com.google.android.gms.internal.measurement.z7;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPOutputStream;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public final class g7 extends M6 {
    g7(b7 b7Var) {
        super(b7Var);
    }

    private static final String A(boolean z10, boolean z11, boolean z12) {
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            sb2.append("Dynamic ");
        }
        if (z11) {
            sb2.append("Sequence ");
        }
        if (z12) {
            sb2.append("Session-Scoped ");
        }
        return sb2.toString();
    }

    private static final Object B(com.google.android.gms.internal.measurement.W2 w22) {
        if (w22.E()) {
            return w22.F();
        }
        if (w22.G()) {
            return Long.valueOf(w22.H());
        }
        if (w22.K()) {
            return Double.valueOf(w22.L());
        }
        if (w22.N() > 0) {
            return Y(w22.M());
        }
        return null;
    }

    private static final void C(Uri.Builder builder, String[] strArr, Bundle bundle, Set set) {
        for (String str : strArr) {
            String[] split = str.split(",");
            String str2 = split[0];
            String str3 = split[split.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                z(builder, str3, string, set);
            }
        }
    }

    private static final void D(StringBuilder sb2, int i10, String str, C2270j3 c2270j3) {
        if (c2270j3 == null) {
            return;
        }
        y(sb2, 3);
        sb2.append(str);
        sb2.append(" {\n");
        if (c2270j3.F() != 0) {
            y(sb2, 4);
            sb2.append("results: ");
            int i11 = 0;
            for (Long l10 : c2270j3.E()) {
                int i12 = i11 + 1;
                if (i11 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l10);
                i11 = i12;
            }
            sb2.append('\n');
        }
        if (c2270j3.D() != 0) {
            y(sb2, 4);
            sb2.append("status: ");
            int i13 = 0;
            for (Long l11 : c2270j3.C()) {
                int i14 = i13 + 1;
                if (i13 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l11);
                i13 = i14;
            }
            sb2.append('\n');
        }
        if (c2270j3.H() != 0) {
            y(sb2, 4);
            sb2.append("dynamic_filter_timestamps: {");
            int i15 = 0;
            for (com.google.android.gms.internal.measurement.Q2 q22 : c2270j3.G()) {
                int i16 = i15 + 1;
                if (i15 != 0) {
                    sb2.append(", ");
                }
                sb2.append(q22.C() ? Integer.valueOf(q22.D()) : null);
                sb2.append(":");
                sb2.append(q22.E() ? Long.valueOf(q22.F()) : null);
                i15 = i16;
            }
            sb2.append("}\n");
        }
        if (c2270j3.J() != 0) {
            y(sb2, 4);
            sb2.append("sequence_filter_timestamps: {");
            int i17 = 0;
            for (C2288l3 c2288l3 : c2270j3.I()) {
                int i18 = i17 + 1;
                if (i17 != 0) {
                    sb2.append(", ");
                }
                sb2.append(c2288l3.C() ? Integer.valueOf(c2288l3.D()) : null);
                sb2.append(": [");
                Iterator it = c2288l3.E().iterator();
                int i19 = 0;
                while (it.hasNext()) {
                    long longValue = ((Long) it.next()).longValue();
                    int i20 = i19 + 1;
                    if (i19 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(longValue);
                    i19 = i20;
                }
                sb2.append("]");
                i17 = i18;
            }
            sb2.append("}\n");
        }
        y(sb2, 3);
        sb2.append("}\n");
    }

    private static final void E(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj == null) {
            return;
        }
        y(sb2, i10 + 1);
        sb2.append(str);
        sb2.append(": ");
        sb2.append(obj);
        sb2.append('\n');
    }

    private static final void F(StringBuilder sb2, int i10, String str, com.google.android.gms.internal.measurement.J1 j12) {
        if (j12 == null) {
            return;
        }
        y(sb2, i10);
        sb2.append(str);
        sb2.append(" {\n");
        if (j12.C()) {
            int N10 = j12.N();
            E(sb2, i10, "comparison_type", N10 != 1 ? N10 != 2 ? N10 != 3 ? N10 != 4 ? "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN" : "UNKNOWN_COMPARISON_TYPE");
        }
        if (j12.D()) {
            E(sb2, i10, "match_as_float", Boolean.valueOf(j12.E()));
        }
        if (j12.F()) {
            E(sb2, i10, "comparison_value", j12.G());
        }
        if (j12.H()) {
            E(sb2, i10, "min_comparison_value", j12.I());
        }
        if (j12.J()) {
            E(sb2, i10, "max_comparison_value", j12.K());
        }
        y(sb2, i10);
        sb2.append("}\n");
    }

    static boolean O(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    static boolean P(List list, int i10) {
        if (i10 < list.size() * 64) {
            return ((1 << (i10 % 64)) & ((Long) list.get(i10 / 64)).longValue()) != 0;
        }
        return false;
    }

    static List Q(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            long j10 = 0;
            for (int i11 = 0; i11 < 64; i11++) {
                int i12 = (i10 * 64) + i11;
                if (i12 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i12)) {
                    j10 |= 1 << i11;
                }
            }
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }

    static com.google.android.gms.internal.measurement.G5 W(com.google.android.gms.internal.measurement.G5 g52, byte[] bArr) {
        com.google.android.gms.internal.measurement.T4 a10 = com.google.android.gms.internal.measurement.T4.a();
        return a10 != null ? g52.i1(bArr, a10) : g52.t1(bArr);
    }

    static int X(C2216d3 c2216d3, String str) {
        for (int i10 = 0; i10 < c2216d3.f1(); i10++) {
            if (str.equals(c2216d3.h1(i10).E())) {
                return i10;
            }
        }
        return -1;
    }

    static Bundle[] Y(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.W2 w22 = (com.google.android.gms.internal.measurement.W2) it.next();
            if (w22 != null) {
                Bundle bundle = new Bundle();
                for (com.google.android.gms.internal.measurement.W2 w23 : w22.M()) {
                    if (w23.E()) {
                        bundle.putString(w23.D(), w23.F());
                    } else if (w23.G()) {
                        bundle.putLong(w23.D(), w23.H());
                    } else if (w23.K()) {
                        bundle.putDouble(w23.D(), w23.L());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    static final void o(com.google.android.gms.internal.measurement.R2 r22, String str, Object obj) {
        List y10 = r22.y();
        int i10 = 0;
        while (true) {
            if (i10 >= y10.size()) {
                i10 = -1;
                break;
            } else if (str.equals(((com.google.android.gms.internal.measurement.W2) y10.get(i10)).D())) {
                break;
            } else {
                i10++;
            }
        }
        com.google.android.gms.internal.measurement.V2 O10 = com.google.android.gms.internal.measurement.W2.O();
        O10.z(str);
        O10.D(((Long) obj).longValue());
        if (i10 >= 0) {
            r22.C(i10, O10);
        } else {
            r22.E(O10);
        }
    }

    static final boolean p(I i10, n7 n7Var) {
        AbstractC1287s.m(i10);
        AbstractC1287s.m(n7Var);
        return !TextUtils.isEmpty(n7Var.f26198b);
    }

    static final Bundle q(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.W2 w22 = (com.google.android.gms.internal.measurement.W2) it.next();
            String D10 = w22.D();
            if (w22.K()) {
                bundle.putDouble(D10, w22.L());
            } else if (w22.I()) {
                bundle.putFloat(D10, w22.J());
            } else if (w22.E()) {
                bundle.putString(D10, w22.F());
            } else if (w22.G()) {
                bundle.putLong(D10, w22.H());
            }
        }
        return bundle;
    }

    static final com.google.android.gms.internal.measurement.W2 r(com.google.android.gms.internal.measurement.S2 s22, String str) {
        for (com.google.android.gms.internal.measurement.W2 w22 : s22.C()) {
            if (w22.D().equals(str)) {
                return w22;
            }
        }
        return null;
    }

    static final Map s(com.google.android.gms.internal.measurement.S2 s22, String... strArr) {
        Object B10;
        HashMap hashMap = new HashMap();
        for (com.google.android.gms.internal.measurement.W2 w22 : s22.C()) {
            if (Arrays.asList(strArr).contains(w22.D()) && (B10 = B(w22)) != null) {
                hashMap.put(w22.D(), B10);
            }
        }
        return hashMap;
    }

    static final Map t(com.google.android.gms.internal.measurement.S2 s22, String str) {
        Object B10;
        HashMap hashMap = new HashMap();
        for (com.google.android.gms.internal.measurement.W2 w22 : s22.C()) {
            if (w22.D().startsWith("gad_") && (B10 = B(w22)) != null) {
                hashMap.put(w22.D(), B10);
            }
        }
        return hashMap;
    }

    static final Object u(com.google.android.gms.internal.measurement.S2 s22, String str) {
        com.google.android.gms.internal.measurement.W2 r10 = r(s22, str);
        if (r10 == null) {
            return null;
        }
        return B(r10);
    }

    static final Object v(com.google.android.gms.internal.measurement.S2 s22, String str, Object obj) {
        Object u10 = u(s22, str);
        return u10 == null ? obj : u10;
    }

    private final void w(StringBuilder sb2, int i10, List list) {
        if (list == null) {
            return;
        }
        int i11 = i10 + 1;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.W2 w22 = (com.google.android.gms.internal.measurement.W2) it.next();
            if (w22 != null) {
                y(sb2, i11);
                sb2.append("param {\n");
                E(sb2, i11, "name", w22.C() ? this.f25694a.D().b(w22.D()) : null);
                E(sb2, i11, "string_value", w22.E() ? w22.F() : null);
                E(sb2, i11, "int_value", w22.G() ? Long.valueOf(w22.H()) : null);
                E(sb2, i11, "double_value", w22.K() ? Double.valueOf(w22.L()) : null);
                if (w22.N() > 0) {
                    w(sb2, i11, w22.M());
                }
                y(sb2, i11);
                sb2.append("}\n");
            }
        }
    }

    private final void x(StringBuilder sb2, int i10, com.google.android.gms.internal.measurement.F1 f12) {
        String str;
        if (f12 == null) {
            return;
        }
        y(sb2, i10);
        sb2.append("filter {\n");
        if (f12.G()) {
            E(sb2, i10, "complement", Boolean.valueOf(f12.H()));
        }
        if (f12.I()) {
            E(sb2, i10, "param_name", this.f25694a.D().b(f12.J()));
        }
        if (f12.C()) {
            int i11 = i10 + 1;
            com.google.android.gms.internal.measurement.P1 D10 = f12.D();
            if (D10 != null) {
                y(sb2, i11);
                sb2.append("string_filter {\n");
                if (D10.C()) {
                    switch (D10.L()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    E(sb2, i11, "match_type", str);
                }
                if (D10.D()) {
                    E(sb2, i11, "expression", D10.E());
                }
                if (D10.F()) {
                    E(sb2, i11, "case_sensitive", Boolean.valueOf(D10.G()));
                }
                if (D10.I() > 0) {
                    y(sb2, i10 + 2);
                    sb2.append("expression_list {\n");
                    for (String str2 : D10.H()) {
                        y(sb2, i10 + 3);
                        sb2.append(str2);
                        sb2.append("\n");
                    }
                    sb2.append("}\n");
                }
                y(sb2, i11);
                sb2.append("}\n");
            }
        }
        if (f12.E()) {
            F(sb2, i10 + 1, "number_filter", f12.F());
        }
        y(sb2, i10);
        sb2.append("}\n");
    }

    private static final void y(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("  ");
        }
    }

    private static final void z(Uri.Builder builder, String str, String str2, Set set) {
        if (set.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    final void G(C2368u3 c2368u3, Object obj) {
        AbstractC1287s.m(obj);
        c2368u3.B();
        c2368u3.D();
        c2368u3.G();
        if (obj instanceof String) {
            c2368u3.A((String) obj);
            return;
        }
        if (obj instanceof Long) {
            c2368u3.C(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            c2368u3.E(((Double) obj).doubleValue());
        } else {
            this.f25694a.a().o().b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    final void H(com.google.android.gms.internal.measurement.V2 v22, Object obj) {
        AbstractC1287s.m(obj);
        v22.C();
        v22.E();
        v22.H();
        v22.M();
        if (obj instanceof String) {
            v22.B((String) obj);
            return;
        }
        if (obj instanceof Long) {
            v22.D(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            v22.G(((Double) obj).doubleValue());
            return;
        }
        if (!(obj instanceof Bundle[])) {
            this.f25694a.a().o().b("Ignoring invalid (type) event param value", obj);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                com.google.android.gms.internal.measurement.V2 O10 = com.google.android.gms.internal.measurement.W2.O();
                for (String str : bundle.keySet()) {
                    com.google.android.gms.internal.measurement.V2 O11 = com.google.android.gms.internal.measurement.W2.O();
                    O11.z(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        O11.D(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        O11.B((String) obj2);
                    } else if (obj2 instanceof Double) {
                        O11.G(((Double) obj2).doubleValue());
                    }
                    O10.K(O11);
                }
                if (O10.J() > 0) {
                    arrayList.add((com.google.android.gms.internal.measurement.W2) O10.v());
                }
            }
        }
        v22.L(arrayList);
    }

    final B6 I(String str, C2216d3 c2216d3, com.google.android.gms.internal.measurement.R2 r22, String str2) {
        int indexOf;
        C2301m7.a();
        C2760q3 c2760q3 = this.f25694a;
        if (!c2760q3.w().H(str, AbstractC2671f2.f25968Q0)) {
            return null;
        }
        long a10 = c2760q3.f().a();
        Set a11 = f7.a(c2760q3.w().C(str, AbstractC2671f2.f26042v0).split(","));
        b7 b7Var = this.f25405b;
        O6 C02 = b7Var.C0();
        String x10 = C02.f25405b.D0().x(str);
        Uri.Builder builder = new Uri.Builder();
        C2760q3 c2760q32 = C02.f25694a;
        builder.scheme(c2760q32.w().C(str, AbstractC2671f2.f26028o0));
        if (TextUtils.isEmpty(x10)) {
            builder.authority(c2760q32.w().C(str, AbstractC2671f2.f26030p0));
        } else {
            String C10 = c2760q32.w().C(str, AbstractC2671f2.f26030p0);
            StringBuilder sb2 = new StringBuilder(String.valueOf(x10).length() + 1 + String.valueOf(C10).length());
            sb2.append(x10);
            sb2.append(".");
            sb2.append(C10);
            builder.authority(sb2.toString());
        }
        builder.path(c2760q32.w().C(str, AbstractC2671f2.f26032q0));
        z(builder, "gmp_app_id", c2216d3.u0(), a11);
        c2760q3.w().A();
        z(builder, "gmp_version", String.valueOf(133005L), a11);
        String V10 = c2216d3.V();
        C2724m w10 = c2760q3.w();
        C2663e2 c2663e2 = AbstractC2671f2.f25974T0;
        if (w10.H(str, c2663e2) && b7Var.D0().N(str)) {
            V10 = BuildConfig.FLAVOR;
        }
        z(builder, "app_instance_id", V10, a11);
        z(builder, "rdid", c2216d3.P(), a11);
        z(builder, "bundle_id", c2216d3.K(), a11);
        String K10 = r22.K();
        String a12 = AbstractC2641b4.a(K10);
        if (true != TextUtils.isEmpty(a12)) {
            K10 = a12;
        }
        z(builder, "app_event_name", K10, a11);
        z(builder, "app_version", String.valueOf(c2216d3.B0()), a11);
        String B10 = c2216d3.B();
        if (c2760q3.w().H(str, c2663e2) && b7Var.D0().K(str) && !TextUtils.isEmpty(B10) && (indexOf = B10.indexOf(".")) != -1) {
            B10 = B10.substring(0, indexOf);
        }
        z(builder, "os_version", B10, a11);
        z(builder, "timestamp", String.valueOf(r22.N()), a11);
        if (c2216d3.S()) {
            z(builder, "lat", "1", a11);
        }
        z(builder, "privacy_sandbox_version", String.valueOf(c2216d3.h0()), a11);
        z(builder, "trigger_uri_source", "1", a11);
        z(builder, "trigger_uri_timestamp", String.valueOf(a10), a11);
        z(builder, "request_uuid", str2, a11);
        List<com.google.android.gms.internal.measurement.W2> y10 = r22.y();
        Bundle bundle = new Bundle();
        for (com.google.android.gms.internal.measurement.W2 w22 : y10) {
            String D10 = w22.D();
            if (w22.K()) {
                bundle.putString(D10, String.valueOf(w22.L()));
            } else if (w22.I()) {
                bundle.putString(D10, String.valueOf(w22.J()));
            } else if (w22.E()) {
                bundle.putString(D10, w22.F());
            } else if (w22.G()) {
                bundle.putString(D10, String.valueOf(w22.H()));
            }
        }
        C(builder, c2760q3.w().C(str, AbstractC2671f2.f26040u0).split("\\|"), bundle, a11);
        List<C2377v3> e12 = c2216d3.e1();
        Bundle bundle2 = new Bundle();
        for (C2377v3 c2377v3 : e12) {
            String E10 = c2377v3.E();
            if (c2377v3.L()) {
                bundle2.putString(E10, String.valueOf(c2377v3.M()));
            } else if (c2377v3.J()) {
                bundle2.putString(E10, String.valueOf(c2377v3.K()));
            } else if (c2377v3.F()) {
                bundle2.putString(E10, c2377v3.G());
            } else if (c2377v3.H()) {
                bundle2.putString(E10, String.valueOf(c2377v3.I()));
            }
        }
        C(builder, c2760q3.w().C(str, AbstractC2671f2.f26038t0).split("\\|"), bundle2, a11);
        z(builder, "dma", true != c2216d3.d0() ? "0" : "1", a11);
        if (!c2216d3.f0().isEmpty()) {
            z(builder, "dma_cps", c2216d3.f0(), a11);
        }
        if (c2216d3.l0()) {
            com.google.android.gms.internal.measurement.A2 m02 = c2216d3.m0();
            if (!m02.N().isEmpty()) {
                z(builder, "dl_gclid", m02.N(), a11);
            }
            if (!m02.P().isEmpty()) {
                z(builder, "dl_gbraid", m02.P(), a11);
            }
            if (!m02.R().isEmpty()) {
                z(builder, "dl_gs", m02.R(), a11);
            }
            if (m02.T() > 0) {
                z(builder, "dl_ss_ts", String.valueOf(m02.T()), a11);
            }
            if (!m02.V().isEmpty()) {
                z(builder, "mr_gclid", m02.V(), a11);
            }
            if (!m02.X().isEmpty()) {
                z(builder, "mr_gbraid", m02.X(), a11);
            }
            if (!m02.Z().isEmpty()) {
                z(builder, "mr_gs", m02.Z(), a11);
            }
            if (m02.b0() > 0) {
                z(builder, "mr_click_ts", String.valueOf(m02.b0()), a11);
            }
        }
        return new B6(builder.build().toString(), a10, 1);
    }

    final com.google.android.gms.internal.measurement.S2 J(D d10) {
        com.google.android.gms.internal.measurement.R2 M10 = com.google.android.gms.internal.measurement.S2.M();
        M10.Q(d10.f25350e);
        G g10 = d10.f25351f;
        F f10 = new F(g10);
        while (f10.hasNext()) {
            String next = f10.next();
            com.google.android.gms.internal.measurement.V2 O10 = com.google.android.gms.internal.measurement.W2.O();
            O10.z(next);
            Object j10 = g10.j(next);
            AbstractC1287s.m(j10);
            H(O10, j10);
            M10.E(O10);
        }
        String str = d10.f25348c;
        if (!TextUtils.isEmpty(str) && g10.j("_o") == null) {
            com.google.android.gms.internal.measurement.V2 O11 = com.google.android.gms.internal.measurement.W2.O();
            O11.z("_o");
            O11.B(str);
            M10.D((com.google.android.gms.internal.measurement.W2) O11.v());
        }
        return (com.google.android.gms.internal.measurement.S2) M10.v();
    }

    final String K(C2207c3 c2207c3) {
        com.google.android.gms.internal.measurement.E2 W02;
        if (c2207c3 == null) {
            return BuildConfig.FLAVOR;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nbatch {\n");
        if (c2207c3.H()) {
            E(sb2, 0, "upload_subdomain", c2207c3.I());
        }
        if (c2207c3.F()) {
            E(sb2, 0, "sgtm_join_id", c2207c3.G());
        }
        for (C2225e3 c2225e3 : c2207c3.C()) {
            if (c2225e3 != null) {
                y(sb2, 1);
                sb2.append("bundle {\n");
                if (c2225e3.c0()) {
                    E(sb2, 1, "protocol_version", Integer.valueOf(c2225e3.d1()));
                }
                z7.a();
                C2760q3 c2760q3 = this.f25694a;
                if (c2760q3.w().H(c2225e3.C(), AbstractC2671f2.f25962N0) && c2225e3.J0()) {
                    E(sb2, 1, "session_stitching_token", c2225e3.K0());
                }
                E(sb2, 1, "platform", c2225e3.A2());
                if (c2225e3.E()) {
                    E(sb2, 1, "gmp_version", Long.valueOf(c2225e3.F()));
                }
                if (c2225e3.G()) {
                    E(sb2, 1, "uploading_gmp_version", Long.valueOf(c2225e3.H()));
                }
                if (c2225e3.F0()) {
                    E(sb2, 1, "dynamite_version", Long.valueOf(c2225e3.G0()));
                }
                if (c2225e3.Y()) {
                    E(sb2, 1, "config_version", Long.valueOf(c2225e3.Z()));
                }
                E(sb2, 1, "gmp_app_id", c2225e3.R());
                E(sb2, 1, "app_id", c2225e3.C());
                E(sb2, 1, "app_version", c2225e3.D());
                if (c2225e3.W()) {
                    E(sb2, 1, "app_version_major", Integer.valueOf(c2225e3.X()));
                }
                E(sb2, 1, "firebase_instance_id", c2225e3.V());
                if (c2225e3.M()) {
                    E(sb2, 1, "dev_cert_hash", Long.valueOf(c2225e3.N()));
                }
                E(sb2, 1, "app_store", c2225e3.G2());
                if (c2225e3.q2()) {
                    E(sb2, 1, "upload_timestamp_millis", Long.valueOf(c2225e3.r2()));
                }
                if (c2225e3.s2()) {
                    E(sb2, 1, "start_timestamp_millis", Long.valueOf(c2225e3.t2()));
                }
                if (c2225e3.u2()) {
                    E(sb2, 1, "end_timestamp_millis", Long.valueOf(c2225e3.v2()));
                }
                if (c2225e3.w2()) {
                    E(sb2, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(c2225e3.x2()));
                }
                if (c2225e3.y2()) {
                    E(sb2, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(c2225e3.z2()));
                }
                E(sb2, 1, "app_instance_id", c2225e3.L());
                E(sb2, 1, "resettable_device_id", c2225e3.I());
                E(sb2, 1, "ds_id", c2225e3.b0());
                if (c2225e3.J()) {
                    E(sb2, 1, "limited_ad_tracking", Boolean.valueOf(c2225e3.K()));
                }
                E(sb2, 1, "os_version", c2225e3.B2());
                E(sb2, 1, "device_model", c2225e3.C2());
                E(sb2, 1, "user_default_language", c2225e3.D2());
                if (c2225e3.E2()) {
                    E(sb2, 1, "time_zone_offset_minutes", Integer.valueOf(c2225e3.F2()));
                }
                if (c2225e3.O()) {
                    E(sb2, 1, "bundle_sequential_index", Integer.valueOf(c2225e3.P()));
                }
                if (c2225e3.X0()) {
                    E(sb2, 1, "delivery_index", Integer.valueOf(c2225e3.Y0()));
                }
                if (c2225e3.S()) {
                    E(sb2, 1, "service_upload", Boolean.valueOf(c2225e3.T()));
                }
                E(sb2, 1, "health_monitor", c2225e3.Q());
                if (c2225e3.D0()) {
                    E(sb2, 1, "retry_counter", Integer.valueOf(c2225e3.E0()));
                }
                if (c2225e3.H0()) {
                    E(sb2, 1, "consent_signals", c2225e3.I0());
                }
                if (c2225e3.Q0()) {
                    E(sb2, 1, "is_dma_region", Boolean.valueOf(c2225e3.R0()));
                }
                if (c2225e3.S0()) {
                    E(sb2, 1, "core_platform_services", c2225e3.T0());
                }
                if (c2225e3.O0()) {
                    E(sb2, 1, "consent_diagnostics", c2225e3.P0());
                }
                if (c2225e3.L0()) {
                    E(sb2, 1, "target_os_version", Long.valueOf(c2225e3.M0()));
                }
                C2301m7.a();
                if (c2760q3.w().H(c2225e3.C(), AbstractC2671f2.f25968Q0)) {
                    E(sb2, 1, "ad_services_version", Integer.valueOf(c2225e3.U0()));
                    if (c2225e3.V0() && (W02 = c2225e3.W0()) != null) {
                        y(sb2, 2);
                        sb2.append("attribution_eligibility_status {\n");
                        E(sb2, 2, "eligible", Boolean.valueOf(W02.C()));
                        E(sb2, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(W02.D()));
                        E(sb2, 2, "pre_r", Boolean.valueOf(W02.E()));
                        E(sb2, 2, "r_extensions_too_old", Boolean.valueOf(W02.F()));
                        E(sb2, 2, "adservices_extension_too_old", Boolean.valueOf(W02.G()));
                        E(sb2, 2, "ad_storage_not_allowed", Boolean.valueOf(W02.H()));
                        E(sb2, 2, "measurement_manager_disabled", Boolean.valueOf(W02.I()));
                        y(sb2, 2);
                        sb2.append("}\n");
                    }
                }
                if (c2225e3.Z0()) {
                    com.google.android.gms.internal.measurement.A2 a12 = c2225e3.a1();
                    y(sb2, 2);
                    sb2.append("ad_campaign_info {\n");
                    if (a12.M()) {
                        E(sb2, 2, "deep_link_gclid", a12.N());
                    }
                    if (a12.O()) {
                        E(sb2, 2, "deep_link_gbraid", a12.P());
                    }
                    if (a12.Q()) {
                        E(sb2, 2, "deep_link_gad_source", a12.R());
                    }
                    if (a12.S()) {
                        E(sb2, 2, "deep_link_session_millis", Long.valueOf(a12.T()));
                    }
                    if (a12.U()) {
                        E(sb2, 2, "market_referrer_gclid", a12.V());
                    }
                    if (a12.W()) {
                        E(sb2, 2, "market_referrer_gbraid", a12.X());
                    }
                    if (a12.Y()) {
                        E(sb2, 2, "market_referrer_gad_source", a12.Z());
                    }
                    if (a12.a0()) {
                        E(sb2, 2, "market_referrer_click_millis", Long.valueOf(a12.b0()));
                    }
                    y(sb2, 2);
                    sb2.append("}\n");
                }
                if (c2225e3.d0()) {
                    E(sb2, 1, "batching_timestamp_millis", Long.valueOf(c2225e3.e0()));
                }
                if (c2225e3.b1()) {
                    C2359t3 c12 = c2225e3.c1();
                    y(sb2, 2);
                    sb2.append("sgtm_diagnostics {\n");
                    int H10 = c12.H();
                    E(sb2, 2, "upload_type", H10 != 1 ? H10 != 2 ? H10 != 3 ? H10 != 4 ? "SDK_SERVICE_UPLOAD" : "PACKAGE_SERVICE_UPLOAD" : "SDK_CLIENT_UPLOAD" : "GA_UPLOAD" : "UPLOAD_TYPE_UNKNOWN");
                    E(sb2, 2, "client_upload_eligibility", c12.C().name());
                    int I10 = c12.I();
                    E(sb2, 2, "service_upload_eligibility", I10 != 1 ? I10 != 2 ? I10 != 3 ? I10 != 4 ? I10 != 5 ? "NON_PLAY_MISSING_SGTM_SERVER_URL" : "MISSING_SGTM_PROXY_INFO" : "MISSING_SGTM_SETTINGS" : "NOT_IN_ROLLOUT" : "SERVICE_UPLOAD_ELIGIBLE" : "SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN");
                    y(sb2, 2);
                    sb2.append("}\n");
                }
                if (c2225e3.f0()) {
                    com.google.android.gms.internal.measurement.O2 g02 = c2225e3.g0();
                    y(sb2, 2);
                    sb2.append("consent_info_extra {\n");
                    for (com.google.android.gms.internal.measurement.L2 l22 : g02.C()) {
                        y(sb2, 3);
                        sb2.append("limited_data_modes {\n");
                        int E10 = l22.E();
                        E(sb2, 3, "type", E10 != 1 ? E10 != 2 ? E10 != 3 ? E10 != 4 ? "AD_PERSONALIZATION" : "AD_USER_DATA" : "ANALYTICS_STORAGE" : "AD_STORAGE" : "CONSENT_TYPE_UNSPECIFIED");
                        int F10 = l22.F();
                        E(sb2, 3, "mode", F10 != 1 ? F10 != 2 ? "NO_DATA_MODE" : "LIMITED_MODE" : "NOT_LIMITED");
                        y(sb2, 3);
                        sb2.append("}\n");
                    }
                    y(sb2, 2);
                    sb2.append("}\n");
                }
                List<C2377v3> n22 = c2225e3.n2();
                if (n22 != null) {
                    for (C2377v3 c2377v3 : n22) {
                        if (c2377v3 != null) {
                            y(sb2, 2);
                            sb2.append("user_property {\n");
                            E(sb2, 2, "set_timestamp_millis", c2377v3.C() ? Long.valueOf(c2377v3.D()) : null);
                            E(sb2, 2, "name", c2760q3.D().c(c2377v3.E()));
                            E(sb2, 2, "string_value", c2377v3.G());
                            E(sb2, 2, "int_value", c2377v3.H() ? Long.valueOf(c2377v3.I()) : null);
                            E(sb2, 2, "double_value", c2377v3.L() ? Double.valueOf(c2377v3.M()) : null);
                            y(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.G2> U10 = c2225e3.U();
                if (U10 != null) {
                    for (com.google.android.gms.internal.measurement.G2 g22 : U10) {
                        if (g22 != null) {
                            y(sb2, 2);
                            sb2.append("audience_membership {\n");
                            if (g22.C()) {
                                E(sb2, 2, "audience_id", Integer.valueOf(g22.D()));
                            }
                            if (g22.H()) {
                                E(sb2, 2, "new_audience", Boolean.valueOf(g22.I()));
                            }
                            D(sb2, 2, "current_data", g22.E());
                            if (g22.F()) {
                                D(sb2, 2, "previous_data", g22.G());
                            }
                            y(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.S2> h22 = c2225e3.h2();
                if (h22 != null) {
                    for (com.google.android.gms.internal.measurement.S2 s22 : h22) {
                        if (s22 != null) {
                            y(sb2, 2);
                            sb2.append("event {\n");
                            E(sb2, 2, "name", c2760q3.D().a(s22.F()));
                            if (s22.G()) {
                                E(sb2, 2, "timestamp_millis", Long.valueOf(s22.H()));
                            }
                            if (s22.I()) {
                                E(sb2, 2, "previous_timestamp_millis", Long.valueOf(s22.J()));
                            }
                            if (s22.K()) {
                                E(sb2, 2, "count", Integer.valueOf(s22.L()));
                            }
                            if (s22.D() != 0) {
                                w(sb2, 2, s22.C());
                            }
                            y(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                y(sb2, 1);
                sb2.append("}\n");
            }
        }
        sb2.append("} // End-of-batch\n");
        return sb2.toString();
    }

    final String L(com.google.android.gms.internal.measurement.D1 d12) {
        if (d12 == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nevent_filter {\n");
        if (d12.C()) {
            E(sb2, 0, "filter_id", Integer.valueOf(d12.D()));
        }
        E(sb2, 0, "event_name", this.f25694a.D().a(d12.E()));
        String A10 = A(d12.K(), d12.L(), d12.N());
        if (!A10.isEmpty()) {
            E(sb2, 0, "filter_type", A10);
        }
        if (d12.I()) {
            F(sb2, 1, "event_count_filter", d12.J());
        }
        if (d12.G() > 0) {
            sb2.append("  filters {\n");
            Iterator it = d12.F().iterator();
            while (it.hasNext()) {
                x(sb2, 2, (com.google.android.gms.internal.measurement.F1) it.next());
            }
        }
        y(sb2, 1);
        sb2.append("}\n}\n");
        return sb2.toString();
    }

    final String M(com.google.android.gms.internal.measurement.L1 l12) {
        if (l12 == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nproperty_filter {\n");
        if (l12.C()) {
            E(sb2, 0, "filter_id", Integer.valueOf(l12.D()));
        }
        E(sb2, 0, "property_name", this.f25694a.D().c(l12.E()));
        String A10 = A(l12.G(), l12.H(), l12.J());
        if (!A10.isEmpty()) {
            E(sb2, 0, "filter_type", A10);
        }
        x(sb2, 1, l12.F());
        sb2.append("}\n");
        return sb2.toString();
    }

    final Parcelable N(byte[] bArr, Parcelable.Creator creator) {
        Parcelable parcelable = null;
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            try {
                obtain.unmarshall(bArr, 0, bArr.length);
                obtain.setDataPosition(0);
                parcelable = (Parcelable) creator.createFromParcel(obtain);
            } catch (b.a unused) {
                this.f25694a.a().o().a("Failed to load parcelable from buffer");
            }
            return parcelable;
        } finally {
            obtain.recycle();
        }
    }

    final List R(List list, List list2) {
        int i10;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                this.f25694a.a().r().b("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    this.f25694a.a().r().c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i11 = size2;
            i10 = size;
            size = i11;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i10);
    }

    final boolean S(long j10, long j11) {
        return j10 == 0 || j11 <= 0 || Math.abs(this.f25694a.f().a() - j10) > j11;
    }

    final long T(byte[] bArr) {
        AbstractC1287s.m(bArr);
        C2760q3 c2760q3 = this.f25694a;
        c2760q3.C().h();
        MessageDigest C10 = l7.C();
        if (C10 != null) {
            return l7.D(C10.digest(bArr));
        }
        c2760q3.a().o().a("Failed to get MD5");
        return 0L;
    }

    final long U(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        return T(str.getBytes(Charset.forName("UTF-8")));
    }

    final byte[] V(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            this.f25694a.a().o().b("Failed to gzip content", e10);
            throw e10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        r5 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (r4 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        r3 = (android.os.Parcelable[]) r3;
        r4 = r3.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (r7 >= r4) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        r8 = r3[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if ((r8 instanceof android.os.Bundle) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        r5.add(Z((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0080, code lost:
    
        r0.put(r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0054, code lost:
    
        if ((r3 instanceof java.util.ArrayList) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0056, code lost:
    
        r3 = (java.util.ArrayList) r3;
        r4 = r3.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005d, code lost:
    
        if (r7 >= r4) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005f, code lost:
    
        r8 = r3.get(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0065, code lost:
    
        if ((r8 instanceof android.os.Bundle) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0067, code lost:
    
        r5.add(Z((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0070, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0075, code lost:
    
        if ((r3 instanceof android.os.Bundle) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0077, code lost:
    
        r5.add(Z((android.os.Bundle) r3, false));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final Map Z(Bundle bundle, boolean z10) {
        HashMap hashMap = new HashMap();
        Iterator<String> it = bundle.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            Object obj = bundle.get(next);
            boolean z11 = obj instanceof Parcelable[];
            if (!z11 && !(obj instanceof ArrayList) && !(obj instanceof Bundle)) {
                if (obj != null) {
                    hashMap.put(next, obj);
                }
            }
        }
        return hashMap;
    }

    @Override // com.google.android.gms.measurement.internal.M6
    protected final boolean l() {
        return false;
    }

    final I m(C2194b c2194b) {
        Object obj;
        Bundle n10 = n(c2194b.f(), true);
        String obj2 = (!n10.containsKey("_o") || (obj = n10.get("_o")) == null) ? "app" : obj.toString();
        String b10 = AbstractC2641b4.b(c2194b.b());
        if (b10 == null) {
            b10 = c2194b.b();
        }
        return new I(b10, new G(n10), obj2, c2194b.a());
    }

    final Bundle n(Map map, boolean z10) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z10) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList2.add(n((Map) arrayList.get(i10), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }
}
