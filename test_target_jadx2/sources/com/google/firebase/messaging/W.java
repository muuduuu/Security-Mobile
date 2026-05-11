package com.google.firebase.messaging;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.messaging.AbstractC2840e;
import j0.C3476a;
import java.util.Map;

/* loaded from: classes2.dex */
public final class W extends W6.a {
    public static final Parcelable.Creator<W> CREATOR = new X();

    /* renamed from: a, reason: collision with root package name */
    Bundle f28093a;

    /* renamed from: b, reason: collision with root package name */
    private Map f28094b;

    /* renamed from: c, reason: collision with root package name */
    private c f28095c;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Bundle f28096a;

        /* renamed from: b, reason: collision with root package name */
        private final Map f28097b;

        public b(String str) {
            Bundle bundle = new Bundle();
            this.f28096a = bundle;
            this.f28097b = new C3476a();
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("google.to", str);
                return;
            }
            throw new IllegalArgumentException("Invalid to: " + str);
        }

        public b a(String str, String str2) {
            this.f28097b.put(str, str2);
            return this;
        }

        public W b() {
            Bundle bundle = new Bundle();
            for (Map.Entry entry : this.f28097b.entrySet()) {
                bundle.putString((String) entry.getKey(), (String) entry.getValue());
            }
            bundle.putAll(this.f28096a);
            this.f28096a.remove("from");
            return new W(bundle);
        }

        public b c(String str) {
            this.f28096a.putString("collapse_key", str);
            return this;
        }

        public b d(String str) {
            this.f28096a.putString("google.message_id", str);
            return this;
        }

        public b e(String str) {
            this.f28096a.putString("message_type", str);
            return this;
        }

        public b f(int i10) {
            this.f28096a.putString("google.ttl", String.valueOf(i10));
            return this;
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        private final String f28098a;

        /* renamed from: b, reason: collision with root package name */
        private final String f28099b;

        /* renamed from: c, reason: collision with root package name */
        private final String[] f28100c;

        /* renamed from: d, reason: collision with root package name */
        private final String f28101d;

        /* renamed from: e, reason: collision with root package name */
        private final String f28102e;

        /* renamed from: f, reason: collision with root package name */
        private final String[] f28103f;

        /* renamed from: g, reason: collision with root package name */
        private final String f28104g;

        /* renamed from: h, reason: collision with root package name */
        private final String f28105h;

        /* renamed from: i, reason: collision with root package name */
        private final String f28106i;

        /* renamed from: j, reason: collision with root package name */
        private final String f28107j;

        /* renamed from: k, reason: collision with root package name */
        private final String f28108k;

        /* renamed from: l, reason: collision with root package name */
        private final String f28109l;

        /* renamed from: m, reason: collision with root package name */
        private final String f28110m;

        /* renamed from: n, reason: collision with root package name */
        private final Uri f28111n;

        /* renamed from: o, reason: collision with root package name */
        private final String f28112o;

        /* renamed from: p, reason: collision with root package name */
        private final Integer f28113p;

        /* renamed from: q, reason: collision with root package name */
        private final Integer f28114q;

        /* renamed from: r, reason: collision with root package name */
        private final Integer f28115r;

        /* renamed from: s, reason: collision with root package name */
        private final int[] f28116s;

        /* renamed from: t, reason: collision with root package name */
        private final Long f28117t;

        /* renamed from: u, reason: collision with root package name */
        private final boolean f28118u;

        /* renamed from: v, reason: collision with root package name */
        private final boolean f28119v;

        /* renamed from: w, reason: collision with root package name */
        private final boolean f28120w;

        /* renamed from: x, reason: collision with root package name */
        private final boolean f28121x;

        /* renamed from: y, reason: collision with root package name */
        private final boolean f28122y;

        /* renamed from: z, reason: collision with root package name */
        private final long[] f28123z;

        private static String[] j(N n10, String str) {
            Object[] g10 = n10.g(str);
            if (g10 == null) {
                return null;
            }
            String[] strArr = new String[g10.length];
            for (int i10 = 0; i10 < g10.length; i10++) {
                strArr[i10] = String.valueOf(g10[i10]);
            }
            return strArr;
        }

        public String a() {
            return this.f28101d;
        }

        public String[] b() {
            return this.f28103f;
        }

        public String c() {
            return this.f28102e;
        }

        public String d() {
            return this.f28110m;
        }

        public String e() {
            return this.f28109l;
        }

        public String f() {
            return this.f28108k;
        }

        public String g() {
            return this.f28104g;
        }

        public Uri h() {
            String str = this.f28105h;
            if (str != null) {
                return Uri.parse(str);
            }
            return null;
        }

        public Uri i() {
            return this.f28111n;
        }

        public Integer k() {
            return this.f28115r;
        }

        public Integer l() {
            return this.f28113p;
        }

        public String m() {
            return this.f28106i;
        }

        public String n() {
            return this.f28112o;
        }

        public String o() {
            return this.f28098a;
        }

        public String[] p() {
            return this.f28100c;
        }

        public String q() {
            return this.f28099b;
        }

        public Integer r() {
            return this.f28114q;
        }

        private c(N n10) {
            this.f28098a = n10.p("gcm.n.title");
            this.f28099b = n10.h("gcm.n.title");
            this.f28100c = j(n10, "gcm.n.title");
            this.f28101d = n10.p("gcm.n.body");
            this.f28102e = n10.h("gcm.n.body");
            this.f28103f = j(n10, "gcm.n.body");
            this.f28104g = n10.p("gcm.n.icon");
            this.f28106i = n10.o();
            this.f28107j = n10.p("gcm.n.tag");
            this.f28108k = n10.p("gcm.n.color");
            this.f28109l = n10.p("gcm.n.click_action");
            this.f28110m = n10.p("gcm.n.android_channel_id");
            this.f28111n = n10.f();
            this.f28105h = n10.p("gcm.n.image");
            this.f28112o = n10.p("gcm.n.ticker");
            this.f28113p = n10.b("gcm.n.notification_priority");
            this.f28114q = n10.b("gcm.n.visibility");
            this.f28115r = n10.b("gcm.n.notification_count");
            this.f28118u = n10.a("gcm.n.sticky");
            this.f28119v = n10.a("gcm.n.local_only");
            this.f28120w = n10.a("gcm.n.default_sound");
            this.f28121x = n10.a("gcm.n.default_vibrate_timings");
            this.f28122y = n10.a("gcm.n.default_light_settings");
            this.f28117t = n10.j("gcm.n.event_time");
            this.f28116s = n10.e();
            this.f28123z = n10.q();
        }
    }

    public W(Bundle bundle) {
        this.f28093a = bundle;
    }

    private int y0(String str) {
        if ("high".equals(str)) {
            return 1;
        }
        return "normal".equals(str) ? 2 : 0;
    }

    public String F() {
        return this.f28093a.getString("from");
    }

    public String I() {
        String string = this.f28093a.getString("google.message_id");
        return string == null ? this.f28093a.getString("message_id") : string;
    }

    public String Z0() {
        return this.f28093a.getString("message_type");
    }

    public c a1() {
        if (this.f28095c == null && N.t(this.f28093a)) {
            this.f28095c = new c(new N(this.f28093a));
        }
        return this.f28095c;
    }

    public int g1() {
        String string = this.f28093a.getString("google.original_priority");
        if (string == null) {
            string = this.f28093a.getString("google.priority");
        }
        return y0(string);
    }

    public int i1() {
        String string = this.f28093a.getString("google.delivered_priority");
        if (string == null) {
            if ("1".equals(this.f28093a.getString("google.priority_reduced"))) {
                return 2;
            }
            string = this.f28093a.getString("google.priority");
        }
        return y0(string);
    }

    public String j() {
        return this.f28093a.getString("collapse_key");
    }

    public long m1() {
        Object obj = this.f28093a.get("google.sent_time");
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (!(obj instanceof String)) {
            return 0L;
        }
        try {
            return Long.parseLong((String) obj);
        } catch (NumberFormatException unused) {
            Log.w("FirebaseMessaging", "Invalid sent time: " + obj);
            return 0L;
        }
    }

    public String o1() {
        return this.f28093a.getString("google.to");
    }

    public int t1() {
        Object obj = this.f28093a.get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
            return 0;
        }
    }

    public Map u() {
        if (this.f28094b == null) {
            this.f28094b = AbstractC2840e.a.a(this.f28093a);
        }
        return this.f28094b;
    }

    void v1(Intent intent) {
        intent.putExtras(this.f28093a);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        X.c(this, parcel, i10);
    }
}
