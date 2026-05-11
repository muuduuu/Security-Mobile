package C1;

import C1.u;
import android.database.Cursor;
import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import h1.AbstractC3222A;
import j1.AbstractC3478a;
import j1.AbstractC3479b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import x1.C5100d;
import x1.EnumC5097a;
import x1.z;

/* loaded from: classes.dex */
public final class w implements v {

    /* renamed from: a, reason: collision with root package name */
    private final h1.s f832a;

    /* renamed from: b, reason: collision with root package name */
    private final h1.k f833b;

    /* renamed from: c, reason: collision with root package name */
    private final h1.j f834c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC3222A f835d;

    /* renamed from: e, reason: collision with root package name */
    private final AbstractC3222A f836e;

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC3222A f837f;

    /* renamed from: g, reason: collision with root package name */
    private final AbstractC3222A f838g;

    /* renamed from: h, reason: collision with root package name */
    private final AbstractC3222A f839h;

    /* renamed from: i, reason: collision with root package name */
    private final AbstractC3222A f840i;

    /* renamed from: j, reason: collision with root package name */
    private final AbstractC3222A f841j;

    /* renamed from: k, reason: collision with root package name */
    private final AbstractC3222A f842k;

    /* renamed from: l, reason: collision with root package name */
    private final AbstractC3222A f843l;

    /* renamed from: m, reason: collision with root package name */
    private final AbstractC3222A f844m;

    /* renamed from: n, reason: collision with root package name */
    private final AbstractC3222A f845n;

    /* renamed from: o, reason: collision with root package name */
    private final AbstractC3222A f846o;

    /* renamed from: p, reason: collision with root package name */
    private final AbstractC3222A f847p;

    /* renamed from: q, reason: collision with root package name */
    private final AbstractC3222A f848q;

    /* renamed from: r, reason: collision with root package name */
    private final AbstractC3222A f849r;

    class a extends AbstractC3222A {
        a(h1.s sVar) {
            super(sVar);
        }

        @Override // h1.AbstractC3222A
        public String e() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    class b extends AbstractC3222A {
        b(h1.s sVar) {
            super(sVar);
        }

        @Override // h1.AbstractC3222A
        public String e() {
            return "UPDATE workspec SET next_schedule_time_override=? WHERE id=?";
        }
    }

    class c extends AbstractC3222A {
        c(h1.s sVar) {
            super(sVar);
        }

        @Override // h1.AbstractC3222A
        public String e() {
            return "UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)";
        }
    }

    class d extends AbstractC3222A {
        d(h1.s sVar) {
            super(sVar);
        }

        @Override // h1.AbstractC3222A
        public String e() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    class e extends AbstractC3222A {
        e(h1.s sVar) {
            super(sVar);
        }

        @Override // h1.AbstractC3222A
        public String e() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    class f extends AbstractC3222A {
        f(h1.s sVar) {
            super(sVar);
        }

        @Override // h1.AbstractC3222A
        public String e() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    class g extends AbstractC3222A {
        g(h1.s sVar) {
            super(sVar);
        }

        @Override // h1.AbstractC3222A
        public String e() {
            return "UPDATE workspec SET generation=generation+1 WHERE id=?";
        }
    }

    class h extends AbstractC3222A {
        h(h1.s sVar) {
            super(sVar);
        }

        @Override // h1.AbstractC3222A
        public String e() {
            return "UPDATE workspec SET stop_reason=? WHERE id=?";
        }
    }

    class i extends h1.k {
        i(h1.s sVar) {
            super(sVar);
        }

        @Override // h1.AbstractC3222A
        public String e() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // h1.k
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(l1.k kVar, u uVar) {
            String str = uVar.f790a;
            if (str == null) {
                kVar.s1(1);
            } else {
                kVar.b0(1, str);
            }
            B b10 = B.f748a;
            kVar.G0(2, B.j(uVar.f791b));
            String str2 = uVar.f792c;
            if (str2 == null) {
                kVar.s1(3);
            } else {
                kVar.b0(3, str2);
            }
            String str3 = uVar.f793d;
            if (str3 == null) {
                kVar.s1(4);
            } else {
                kVar.b0(4, str3);
            }
            byte[] l10 = androidx.work.b.l(uVar.f794e);
            if (l10 == null) {
                kVar.s1(5);
            } else {
                kVar.P0(5, l10);
            }
            byte[] l11 = androidx.work.b.l(uVar.f795f);
            if (l11 == null) {
                kVar.s1(6);
            } else {
                kVar.P0(6, l11);
            }
            kVar.G0(7, uVar.f796g);
            kVar.G0(8, uVar.f797h);
            kVar.G0(9, uVar.f798i);
            kVar.G0(10, uVar.f800k);
            kVar.G0(11, B.a(uVar.f801l));
            kVar.G0(12, uVar.f802m);
            kVar.G0(13, uVar.f803n);
            kVar.G0(14, uVar.f804o);
            kVar.G0(15, uVar.f805p);
            kVar.G0(16, uVar.f806q ? 1L : 0L);
            kVar.G0(17, B.h(uVar.f807r));
            kVar.G0(18, uVar.i());
            kVar.G0(19, uVar.f());
            kVar.G0(20, uVar.g());
            kVar.G0(21, uVar.h());
            kVar.G0(22, uVar.j());
            C5100d c5100d = uVar.f799j;
            if (c5100d == null) {
                kVar.s1(23);
                kVar.s1(24);
                kVar.s1(25);
                kVar.s1(26);
                kVar.s1(27);
                kVar.s1(28);
                kVar.s1(29);
                kVar.s1(30);
                return;
            }
            kVar.G0(23, B.g(c5100d.d()));
            kVar.G0(24, c5100d.g() ? 1L : 0L);
            kVar.G0(25, c5100d.h() ? 1L : 0L);
            kVar.G0(26, c5100d.f() ? 1L : 0L);
            kVar.G0(27, c5100d.i() ? 1L : 0L);
            kVar.G0(28, c5100d.b());
            kVar.G0(29, c5100d.a());
            byte[] i10 = B.i(c5100d.c());
            if (i10 == null) {
                kVar.s1(30);
            } else {
                kVar.P0(30, i10);
            }
        }
    }

    class j extends h1.j {
        j(h1.s sVar) {
            super(sVar);
        }

        @Override // h1.AbstractC3222A
        public String e() {
            return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`next_schedule_time_override` = ?,`next_schedule_time_override_generation` = ?,`stop_reason` = ?,`required_network_type` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
        }

        @Override // h1.j
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(l1.k kVar, u uVar) {
            String str = uVar.f790a;
            if (str == null) {
                kVar.s1(1);
            } else {
                kVar.b0(1, str);
            }
            B b10 = B.f748a;
            kVar.G0(2, B.j(uVar.f791b));
            String str2 = uVar.f792c;
            if (str2 == null) {
                kVar.s1(3);
            } else {
                kVar.b0(3, str2);
            }
            String str3 = uVar.f793d;
            if (str3 == null) {
                kVar.s1(4);
            } else {
                kVar.b0(4, str3);
            }
            byte[] l10 = androidx.work.b.l(uVar.f794e);
            if (l10 == null) {
                kVar.s1(5);
            } else {
                kVar.P0(5, l10);
            }
            byte[] l11 = androidx.work.b.l(uVar.f795f);
            if (l11 == null) {
                kVar.s1(6);
            } else {
                kVar.P0(6, l11);
            }
            kVar.G0(7, uVar.f796g);
            kVar.G0(8, uVar.f797h);
            kVar.G0(9, uVar.f798i);
            kVar.G0(10, uVar.f800k);
            kVar.G0(11, B.a(uVar.f801l));
            kVar.G0(12, uVar.f802m);
            kVar.G0(13, uVar.f803n);
            kVar.G0(14, uVar.f804o);
            kVar.G0(15, uVar.f805p);
            kVar.G0(16, uVar.f806q ? 1L : 0L);
            kVar.G0(17, B.h(uVar.f807r));
            kVar.G0(18, uVar.i());
            kVar.G0(19, uVar.f());
            kVar.G0(20, uVar.g());
            kVar.G0(21, uVar.h());
            kVar.G0(22, uVar.j());
            C5100d c5100d = uVar.f799j;
            if (c5100d != null) {
                kVar.G0(23, B.g(c5100d.d()));
                kVar.G0(24, c5100d.g() ? 1L : 0L);
                kVar.G0(25, c5100d.h() ? 1L : 0L);
                kVar.G0(26, c5100d.f() ? 1L : 0L);
                kVar.G0(27, c5100d.i() ? 1L : 0L);
                kVar.G0(28, c5100d.b());
                kVar.G0(29, c5100d.a());
                byte[] i10 = B.i(c5100d.c());
                if (i10 == null) {
                    kVar.s1(30);
                } else {
                    kVar.P0(30, i10);
                }
            } else {
                kVar.s1(23);
                kVar.s1(24);
                kVar.s1(25);
                kVar.s1(26);
                kVar.s1(27);
                kVar.s1(28);
                kVar.s1(29);
                kVar.s1(30);
            }
            String str4 = uVar.f790a;
            if (str4 == null) {
                kVar.s1(31);
            } else {
                kVar.b0(31, str4);
            }
        }
    }

    class k extends AbstractC3222A {
        k(h1.s sVar) {
            super(sVar);
        }

        @Override // h1.AbstractC3222A
        public String e() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    class l extends AbstractC3222A {
        l(h1.s sVar) {
            super(sVar);
        }

        @Override // h1.AbstractC3222A
        public String e() {
            return "UPDATE workspec SET state=? WHERE id=?";
        }
    }

    class m extends AbstractC3222A {
        m(h1.s sVar) {
            super(sVar);
        }

        @Override // h1.AbstractC3222A
        public String e() {
            return "UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?";
        }
    }

    class n extends AbstractC3222A {
        n(h1.s sVar) {
            super(sVar);
        }

        @Override // h1.AbstractC3222A
        public String e() {
            return "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
        }
    }

    class o extends AbstractC3222A {
        o(h1.s sVar) {
            super(sVar);
        }

        @Override // h1.AbstractC3222A
        public String e() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    class p extends AbstractC3222A {
        p(h1.s sVar) {
            super(sVar);
        }

        @Override // h1.AbstractC3222A
        public String e() {
            return "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
        }
    }

    class q extends AbstractC3222A {
        q(h1.s sVar) {
            super(sVar);
        }

        @Override // h1.AbstractC3222A
        public String e() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    public w(h1.s sVar) {
        this.f832a = sVar;
        this.f833b = new i(sVar);
        this.f834c = new j(sVar);
        this.f835d = new k(sVar);
        this.f836e = new l(sVar);
        this.f837f = new m(sVar);
        this.f838g = new n(sVar);
        this.f839h = new o(sVar);
        this.f840i = new p(sVar);
        this.f841j = new q(sVar);
        this.f842k = new a(sVar);
        this.f843l = new b(sVar);
        this.f844m = new c(sVar);
        this.f845n = new d(sVar);
        this.f846o = new e(sVar);
        this.f847p = new f(sVar);
        this.f848q = new g(sVar);
        this.f849r = new h(sVar);
    }

    private void C(HashMap hashMap) {
        int i10;
        Set<String> keySet = hashMap.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (hashMap.size() > 999) {
            HashMap hashMap2 = new HashMap(999);
            loop0: while (true) {
                i10 = 0;
                for (String str : keySet) {
                    hashMap2.put(str, (ArrayList) hashMap.get(str));
                    i10++;
                    if (i10 == 999) {
                        break;
                    }
                }
                C(hashMap2);
                hashMap2 = new HashMap(999);
            }
            if (i10 > 0) {
                C(hashMap2);
                return;
            }
            return;
        }
        StringBuilder b10 = j1.d.b();
        b10.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int size = keySet.size();
        j1.d.a(b10, size);
        b10.append(")");
        h1.v c10 = h1.v.c(b10.toString(), size);
        int i11 = 1;
        for (String str2 : keySet) {
            if (str2 == null) {
                c10.s1(i11);
            } else {
                c10.b0(i11, str2);
            }
            i11++;
        }
        Cursor c11 = AbstractC3479b.c(this.f832a, c10, false, null);
        try {
            int d10 = AbstractC3478a.d(c11, "work_spec_id");
            if (d10 == -1) {
                return;
            }
            while (c11.moveToNext()) {
                ArrayList arrayList = (ArrayList) hashMap.get(c11.getString(d10));
                if (arrayList != null) {
                    arrayList.add(androidx.work.b.g(c11.isNull(0) ? null : c11.getBlob(0)));
                }
            }
        } finally {
            c11.close();
        }
    }

    private void D(HashMap hashMap) {
        int i10;
        Set<String> keySet = hashMap.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (hashMap.size() > 999) {
            HashMap hashMap2 = new HashMap(999);
            loop0: while (true) {
                i10 = 0;
                for (String str : keySet) {
                    hashMap2.put(str, (ArrayList) hashMap.get(str));
                    i10++;
                    if (i10 == 999) {
                        break;
                    }
                }
                D(hashMap2);
                hashMap2 = new HashMap(999);
            }
            if (i10 > 0) {
                D(hashMap2);
                return;
            }
            return;
        }
        StringBuilder b10 = j1.d.b();
        b10.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int size = keySet.size();
        j1.d.a(b10, size);
        b10.append(")");
        h1.v c10 = h1.v.c(b10.toString(), size);
        int i11 = 1;
        for (String str2 : keySet) {
            if (str2 == null) {
                c10.s1(i11);
            } else {
                c10.b0(i11, str2);
            }
            i11++;
        }
        Cursor c11 = AbstractC3479b.c(this.f832a, c10, false, null);
        try {
            int d10 = AbstractC3478a.d(c11, "work_spec_id");
            if (d10 == -1) {
                return;
            }
            while (c11.moveToNext()) {
                ArrayList arrayList = (ArrayList) hashMap.get(c11.getString(d10));
                if (arrayList != null) {
                    arrayList.add(c11.isNull(0) ? null : c11.getString(0));
                }
            }
        } finally {
            c11.close();
        }
    }

    public static List E() {
        return Collections.emptyList();
    }

    @Override // C1.v
    public List A(int i10) {
        h1.v vVar;
        int i11;
        boolean z10;
        int i12;
        boolean z11;
        int i13;
        boolean z12;
        int i14;
        boolean z13;
        int i15;
        boolean z14;
        h1.v c10 = h1.v.c("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?", 1);
        c10.G0(1, i10);
        this.f832a.d();
        Cursor c11 = AbstractC3479b.c(this.f832a, c10, false, null);
        try {
            int e10 = AbstractC3478a.e(c11, "id");
            int e11 = AbstractC3478a.e(c11, Keys.STATE);
            int e12 = AbstractC3478a.e(c11, "worker_class_name");
            int e13 = AbstractC3478a.e(c11, "input_merger_class_name");
            int e14 = AbstractC3478a.e(c11, "input");
            int e15 = AbstractC3478a.e(c11, "output");
            int e16 = AbstractC3478a.e(c11, "initial_delay");
            int e17 = AbstractC3478a.e(c11, "interval_duration");
            int e18 = AbstractC3478a.e(c11, "flex_duration");
            int e19 = AbstractC3478a.e(c11, "run_attempt_count");
            int e20 = AbstractC3478a.e(c11, "backoff_policy");
            int e21 = AbstractC3478a.e(c11, "backoff_delay_duration");
            int e22 = AbstractC3478a.e(c11, "last_enqueue_time");
            int e23 = AbstractC3478a.e(c11, "minimum_retention_duration");
            vVar = c10;
            try {
                int e24 = AbstractC3478a.e(c11, "schedule_requested_at");
                int e25 = AbstractC3478a.e(c11, "run_in_foreground");
                int e26 = AbstractC3478a.e(c11, "out_of_quota_policy");
                int e27 = AbstractC3478a.e(c11, "period_count");
                int e28 = AbstractC3478a.e(c11, "generation");
                int e29 = AbstractC3478a.e(c11, "next_schedule_time_override");
                int e30 = AbstractC3478a.e(c11, "next_schedule_time_override_generation");
                int e31 = AbstractC3478a.e(c11, "stop_reason");
                int e32 = AbstractC3478a.e(c11, "required_network_type");
                int e33 = AbstractC3478a.e(c11, "requires_charging");
                int e34 = AbstractC3478a.e(c11, "requires_device_idle");
                int e35 = AbstractC3478a.e(c11, "requires_battery_not_low");
                int e36 = AbstractC3478a.e(c11, "requires_storage_not_low");
                int e37 = AbstractC3478a.e(c11, "trigger_content_update_delay");
                int e38 = AbstractC3478a.e(c11, "trigger_max_content_delay");
                int e39 = AbstractC3478a.e(c11, "content_uri_triggers");
                int i16 = e23;
                ArrayList arrayList = new ArrayList(c11.getCount());
                while (c11.moveToNext()) {
                    String string = c11.isNull(e10) ? null : c11.getString(e10);
                    z.c f10 = B.f(c11.getInt(e11));
                    String string2 = c11.isNull(e12) ? null : c11.getString(e12);
                    String string3 = c11.isNull(e13) ? null : c11.getString(e13);
                    androidx.work.b g10 = androidx.work.b.g(c11.isNull(e14) ? null : c11.getBlob(e14));
                    androidx.work.b g11 = androidx.work.b.g(c11.isNull(e15) ? null : c11.getBlob(e15));
                    long j10 = c11.getLong(e16);
                    long j11 = c11.getLong(e17);
                    long j12 = c11.getLong(e18);
                    int i17 = c11.getInt(e19);
                    EnumC5097a c12 = B.c(c11.getInt(e20));
                    long j13 = c11.getLong(e21);
                    long j14 = c11.getLong(e22);
                    int i18 = i16;
                    long j15 = c11.getLong(i18);
                    int i19 = e10;
                    int i20 = e24;
                    long j16 = c11.getLong(i20);
                    e24 = i20;
                    int i21 = e25;
                    if (c11.getInt(i21) != 0) {
                        e25 = i21;
                        i11 = e26;
                        z10 = true;
                    } else {
                        e25 = i21;
                        i11 = e26;
                        z10 = false;
                    }
                    x1.s e40 = B.e(c11.getInt(i11));
                    e26 = i11;
                    int i22 = e27;
                    int i23 = c11.getInt(i22);
                    e27 = i22;
                    int i24 = e28;
                    int i25 = c11.getInt(i24);
                    e28 = i24;
                    int i26 = e29;
                    long j17 = c11.getLong(i26);
                    e29 = i26;
                    int i27 = e30;
                    int i28 = c11.getInt(i27);
                    e30 = i27;
                    int i29 = e31;
                    int i30 = c11.getInt(i29);
                    e31 = i29;
                    int i31 = e32;
                    x1.o d10 = B.d(c11.getInt(i31));
                    e32 = i31;
                    int i32 = e33;
                    if (c11.getInt(i32) != 0) {
                        e33 = i32;
                        i12 = e34;
                        z11 = true;
                    } else {
                        e33 = i32;
                        i12 = e34;
                        z11 = false;
                    }
                    if (c11.getInt(i12) != 0) {
                        e34 = i12;
                        i13 = e35;
                        z12 = true;
                    } else {
                        e34 = i12;
                        i13 = e35;
                        z12 = false;
                    }
                    if (c11.getInt(i13) != 0) {
                        e35 = i13;
                        i14 = e36;
                        z13 = true;
                    } else {
                        e35 = i13;
                        i14 = e36;
                        z13 = false;
                    }
                    if (c11.getInt(i14) != 0) {
                        e36 = i14;
                        i15 = e37;
                        z14 = true;
                    } else {
                        e36 = i14;
                        i15 = e37;
                        z14 = false;
                    }
                    long j18 = c11.getLong(i15);
                    e37 = i15;
                    int i33 = e38;
                    long j19 = c11.getLong(i33);
                    e38 = i33;
                    int i34 = e39;
                    e39 = i34;
                    arrayList.add(new u(string, f10, string2, string3, g10, g11, j10, j11, j12, new C5100d(d10, z11, z12, z13, z14, j18, j19, B.b(c11.isNull(i34) ? null : c11.getBlob(i34))), i17, c12, j13, j14, j15, j16, z10, e40, i23, i25, j17, i28, i30));
                    e10 = i19;
                    i16 = i18;
                }
                c11.close();
                vVar.f();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                c11.close();
                vVar.f();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            vVar = c10;
        }
    }

    @Override // C1.v
    public int B() {
        this.f832a.d();
        l1.k b10 = this.f846o.b();
        this.f832a.e();
        try {
            int j02 = b10.j0();
            this.f832a.D();
            return j02;
        } finally {
            this.f832a.i();
            this.f846o.h(b10);
        }
    }

    @Override // C1.v
    public void a(String str) {
        this.f832a.d();
        l1.k b10 = this.f835d.b();
        if (str == null) {
            b10.s1(1);
        } else {
            b10.b0(1, str);
        }
        this.f832a.e();
        try {
            b10.j0();
            this.f832a.D();
        } finally {
            this.f832a.i();
            this.f835d.h(b10);
        }
    }

    @Override // C1.v
    public void b(String str) {
        this.f832a.d();
        l1.k b10 = this.f838g.b();
        if (str == null) {
            b10.s1(1);
        } else {
            b10.b0(1, str);
        }
        this.f832a.e();
        try {
            b10.j0();
            this.f832a.D();
        } finally {
            this.f832a.i();
            this.f838g.h(b10);
        }
    }

    @Override // C1.v
    public int c(String str, long j10) {
        this.f832a.d();
        l1.k b10 = this.f845n.b();
        b10.G0(1, j10);
        if (str == null) {
            b10.s1(2);
        } else {
            b10.b0(2, str);
        }
        this.f832a.e();
        try {
            int j02 = b10.j0();
            this.f832a.D();
            return j02;
        } finally {
            this.f832a.i();
            this.f845n.h(b10);
        }
    }

    @Override // C1.v
    public List d(String str) {
        h1.v c10 = h1.v.c("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            c10.s1(1);
        } else {
            c10.b0(1, str);
        }
        this.f832a.d();
        Cursor c11 = AbstractC3479b.c(this.f832a, c10, false, null);
        try {
            ArrayList arrayList = new ArrayList(c11.getCount());
            while (c11.moveToNext()) {
                arrayList.add(new u.b(c11.isNull(0) ? null : c11.getString(0), B.f(c11.getInt(1))));
            }
            return arrayList;
        } finally {
            c11.close();
            c10.f();
        }
    }

    @Override // C1.v
    public List e(long j10) {
        h1.v vVar;
        int i10;
        boolean z10;
        int i11;
        boolean z11;
        int i12;
        boolean z12;
        int i13;
        boolean z13;
        int i14;
        boolean z14;
        h1.v c10 = h1.v.c("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC", 1);
        c10.G0(1, j10);
        this.f832a.d();
        Cursor c11 = AbstractC3479b.c(this.f832a, c10, false, null);
        try {
            int e10 = AbstractC3478a.e(c11, "id");
            int e11 = AbstractC3478a.e(c11, Keys.STATE);
            int e12 = AbstractC3478a.e(c11, "worker_class_name");
            int e13 = AbstractC3478a.e(c11, "input_merger_class_name");
            int e14 = AbstractC3478a.e(c11, "input");
            int e15 = AbstractC3478a.e(c11, "output");
            int e16 = AbstractC3478a.e(c11, "initial_delay");
            int e17 = AbstractC3478a.e(c11, "interval_duration");
            int e18 = AbstractC3478a.e(c11, "flex_duration");
            int e19 = AbstractC3478a.e(c11, "run_attempt_count");
            int e20 = AbstractC3478a.e(c11, "backoff_policy");
            int e21 = AbstractC3478a.e(c11, "backoff_delay_duration");
            int e22 = AbstractC3478a.e(c11, "last_enqueue_time");
            int e23 = AbstractC3478a.e(c11, "minimum_retention_duration");
            vVar = c10;
            try {
                int e24 = AbstractC3478a.e(c11, "schedule_requested_at");
                int e25 = AbstractC3478a.e(c11, "run_in_foreground");
                int e26 = AbstractC3478a.e(c11, "out_of_quota_policy");
                int e27 = AbstractC3478a.e(c11, "period_count");
                int e28 = AbstractC3478a.e(c11, "generation");
                int e29 = AbstractC3478a.e(c11, "next_schedule_time_override");
                int e30 = AbstractC3478a.e(c11, "next_schedule_time_override_generation");
                int e31 = AbstractC3478a.e(c11, "stop_reason");
                int e32 = AbstractC3478a.e(c11, "required_network_type");
                int e33 = AbstractC3478a.e(c11, "requires_charging");
                int e34 = AbstractC3478a.e(c11, "requires_device_idle");
                int e35 = AbstractC3478a.e(c11, "requires_battery_not_low");
                int e36 = AbstractC3478a.e(c11, "requires_storage_not_low");
                int e37 = AbstractC3478a.e(c11, "trigger_content_update_delay");
                int e38 = AbstractC3478a.e(c11, "trigger_max_content_delay");
                int e39 = AbstractC3478a.e(c11, "content_uri_triggers");
                int i15 = e23;
                ArrayList arrayList = new ArrayList(c11.getCount());
                while (c11.moveToNext()) {
                    String string = c11.isNull(e10) ? null : c11.getString(e10);
                    z.c f10 = B.f(c11.getInt(e11));
                    String string2 = c11.isNull(e12) ? null : c11.getString(e12);
                    String string3 = c11.isNull(e13) ? null : c11.getString(e13);
                    androidx.work.b g10 = androidx.work.b.g(c11.isNull(e14) ? null : c11.getBlob(e14));
                    androidx.work.b g11 = androidx.work.b.g(c11.isNull(e15) ? null : c11.getBlob(e15));
                    long j11 = c11.getLong(e16);
                    long j12 = c11.getLong(e17);
                    long j13 = c11.getLong(e18);
                    int i16 = c11.getInt(e19);
                    EnumC5097a c12 = B.c(c11.getInt(e20));
                    long j14 = c11.getLong(e21);
                    long j15 = c11.getLong(e22);
                    int i17 = i15;
                    long j16 = c11.getLong(i17);
                    int i18 = e10;
                    int i19 = e24;
                    long j17 = c11.getLong(i19);
                    e24 = i19;
                    int i20 = e25;
                    if (c11.getInt(i20) != 0) {
                        e25 = i20;
                        i10 = e26;
                        z10 = true;
                    } else {
                        e25 = i20;
                        i10 = e26;
                        z10 = false;
                    }
                    x1.s e40 = B.e(c11.getInt(i10));
                    e26 = i10;
                    int i21 = e27;
                    int i22 = c11.getInt(i21);
                    e27 = i21;
                    int i23 = e28;
                    int i24 = c11.getInt(i23);
                    e28 = i23;
                    int i25 = e29;
                    long j18 = c11.getLong(i25);
                    e29 = i25;
                    int i26 = e30;
                    int i27 = c11.getInt(i26);
                    e30 = i26;
                    int i28 = e31;
                    int i29 = c11.getInt(i28);
                    e31 = i28;
                    int i30 = e32;
                    x1.o d10 = B.d(c11.getInt(i30));
                    e32 = i30;
                    int i31 = e33;
                    if (c11.getInt(i31) != 0) {
                        e33 = i31;
                        i11 = e34;
                        z11 = true;
                    } else {
                        e33 = i31;
                        i11 = e34;
                        z11 = false;
                    }
                    if (c11.getInt(i11) != 0) {
                        e34 = i11;
                        i12 = e35;
                        z12 = true;
                    } else {
                        e34 = i11;
                        i12 = e35;
                        z12 = false;
                    }
                    if (c11.getInt(i12) != 0) {
                        e35 = i12;
                        i13 = e36;
                        z13 = true;
                    } else {
                        e35 = i12;
                        i13 = e36;
                        z13 = false;
                    }
                    if (c11.getInt(i13) != 0) {
                        e36 = i13;
                        i14 = e37;
                        z14 = true;
                    } else {
                        e36 = i13;
                        i14 = e37;
                        z14 = false;
                    }
                    long j19 = c11.getLong(i14);
                    e37 = i14;
                    int i32 = e38;
                    long j20 = c11.getLong(i32);
                    e38 = i32;
                    int i33 = e39;
                    e39 = i33;
                    arrayList.add(new u(string, f10, string2, string3, g10, g11, j11, j12, j13, new C5100d(d10, z11, z12, z13, z14, j19, j20, B.b(c11.isNull(i33) ? null : c11.getBlob(i33))), i16, c12, j14, j15, j16, j17, z10, e40, i22, i24, j18, i27, i29));
                    e10 = i18;
                    i15 = i17;
                }
                c11.close();
                vVar.f();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                c11.close();
                vVar.f();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            vVar = c10;
        }
    }

    @Override // C1.v
    public List f(int i10) {
        h1.v vVar;
        int i11;
        boolean z10;
        int i12;
        boolean z11;
        int i13;
        boolean z12;
        int i14;
        boolean z13;
        int i15;
        boolean z14;
        h1.v c10 = h1.v.c("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))", 1);
        c10.G0(1, i10);
        this.f832a.d();
        Cursor c11 = AbstractC3479b.c(this.f832a, c10, false, null);
        try {
            int e10 = AbstractC3478a.e(c11, "id");
            int e11 = AbstractC3478a.e(c11, Keys.STATE);
            int e12 = AbstractC3478a.e(c11, "worker_class_name");
            int e13 = AbstractC3478a.e(c11, "input_merger_class_name");
            int e14 = AbstractC3478a.e(c11, "input");
            int e15 = AbstractC3478a.e(c11, "output");
            int e16 = AbstractC3478a.e(c11, "initial_delay");
            int e17 = AbstractC3478a.e(c11, "interval_duration");
            int e18 = AbstractC3478a.e(c11, "flex_duration");
            int e19 = AbstractC3478a.e(c11, "run_attempt_count");
            int e20 = AbstractC3478a.e(c11, "backoff_policy");
            int e21 = AbstractC3478a.e(c11, "backoff_delay_duration");
            int e22 = AbstractC3478a.e(c11, "last_enqueue_time");
            int e23 = AbstractC3478a.e(c11, "minimum_retention_duration");
            vVar = c10;
            try {
                int e24 = AbstractC3478a.e(c11, "schedule_requested_at");
                int e25 = AbstractC3478a.e(c11, "run_in_foreground");
                int e26 = AbstractC3478a.e(c11, "out_of_quota_policy");
                int e27 = AbstractC3478a.e(c11, "period_count");
                int e28 = AbstractC3478a.e(c11, "generation");
                int e29 = AbstractC3478a.e(c11, "next_schedule_time_override");
                int e30 = AbstractC3478a.e(c11, "next_schedule_time_override_generation");
                int e31 = AbstractC3478a.e(c11, "stop_reason");
                int e32 = AbstractC3478a.e(c11, "required_network_type");
                int e33 = AbstractC3478a.e(c11, "requires_charging");
                int e34 = AbstractC3478a.e(c11, "requires_device_idle");
                int e35 = AbstractC3478a.e(c11, "requires_battery_not_low");
                int e36 = AbstractC3478a.e(c11, "requires_storage_not_low");
                int e37 = AbstractC3478a.e(c11, "trigger_content_update_delay");
                int e38 = AbstractC3478a.e(c11, "trigger_max_content_delay");
                int e39 = AbstractC3478a.e(c11, "content_uri_triggers");
                int i16 = e23;
                ArrayList arrayList = new ArrayList(c11.getCount());
                while (c11.moveToNext()) {
                    String string = c11.isNull(e10) ? null : c11.getString(e10);
                    z.c f10 = B.f(c11.getInt(e11));
                    String string2 = c11.isNull(e12) ? null : c11.getString(e12);
                    String string3 = c11.isNull(e13) ? null : c11.getString(e13);
                    androidx.work.b g10 = androidx.work.b.g(c11.isNull(e14) ? null : c11.getBlob(e14));
                    androidx.work.b g11 = androidx.work.b.g(c11.isNull(e15) ? null : c11.getBlob(e15));
                    long j10 = c11.getLong(e16);
                    long j11 = c11.getLong(e17);
                    long j12 = c11.getLong(e18);
                    int i17 = c11.getInt(e19);
                    EnumC5097a c12 = B.c(c11.getInt(e20));
                    long j13 = c11.getLong(e21);
                    long j14 = c11.getLong(e22);
                    int i18 = i16;
                    long j15 = c11.getLong(i18);
                    int i19 = e10;
                    int i20 = e24;
                    long j16 = c11.getLong(i20);
                    e24 = i20;
                    int i21 = e25;
                    if (c11.getInt(i21) != 0) {
                        e25 = i21;
                        i11 = e26;
                        z10 = true;
                    } else {
                        e25 = i21;
                        i11 = e26;
                        z10 = false;
                    }
                    x1.s e40 = B.e(c11.getInt(i11));
                    e26 = i11;
                    int i22 = e27;
                    int i23 = c11.getInt(i22);
                    e27 = i22;
                    int i24 = e28;
                    int i25 = c11.getInt(i24);
                    e28 = i24;
                    int i26 = e29;
                    long j17 = c11.getLong(i26);
                    e29 = i26;
                    int i27 = e30;
                    int i28 = c11.getInt(i27);
                    e30 = i27;
                    int i29 = e31;
                    int i30 = c11.getInt(i29);
                    e31 = i29;
                    int i31 = e32;
                    x1.o d10 = B.d(c11.getInt(i31));
                    e32 = i31;
                    int i32 = e33;
                    if (c11.getInt(i32) != 0) {
                        e33 = i32;
                        i12 = e34;
                        z11 = true;
                    } else {
                        e33 = i32;
                        i12 = e34;
                        z11 = false;
                    }
                    if (c11.getInt(i12) != 0) {
                        e34 = i12;
                        i13 = e35;
                        z12 = true;
                    } else {
                        e34 = i12;
                        i13 = e35;
                        z12 = false;
                    }
                    if (c11.getInt(i13) != 0) {
                        e35 = i13;
                        i14 = e36;
                        z13 = true;
                    } else {
                        e35 = i13;
                        i14 = e36;
                        z13 = false;
                    }
                    if (c11.getInt(i14) != 0) {
                        e36 = i14;
                        i15 = e37;
                        z14 = true;
                    } else {
                        e36 = i14;
                        i15 = e37;
                        z14 = false;
                    }
                    long j18 = c11.getLong(i15);
                    e37 = i15;
                    int i33 = e38;
                    long j19 = c11.getLong(i33);
                    e38 = i33;
                    int i34 = e39;
                    e39 = i34;
                    arrayList.add(new u(string, f10, string2, string3, g10, g11, j10, j11, j12, new C5100d(d10, z11, z12, z13, z14, j18, j19, B.b(c11.isNull(i34) ? null : c11.getBlob(i34))), i17, c12, j13, j14, j15, j16, z10, e40, i23, i25, j17, i28, i30));
                    e10 = i19;
                    i16 = i18;
                }
                c11.close();
                vVar.f();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                c11.close();
                vVar.f();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            vVar = c10;
        }
    }

    @Override // C1.v
    public void g(String str, int i10) {
        this.f832a.d();
        l1.k b10 = this.f849r.b();
        b10.G0(1, i10);
        if (str == null) {
            b10.s1(2);
        } else {
            b10.b0(2, str);
        }
        this.f832a.e();
        try {
            b10.j0();
            this.f832a.D();
        } finally {
            this.f832a.i();
            this.f849r.h(b10);
        }
    }

    @Override // C1.v
    public void h(u uVar) {
        this.f832a.d();
        this.f832a.e();
        try {
            this.f834c.j(uVar);
            this.f832a.D();
        } finally {
            this.f832a.i();
        }
    }

    @Override // C1.v
    public List i() {
        h1.v vVar;
        int e10;
        int e11;
        int e12;
        int e13;
        int e14;
        int e15;
        int e16;
        int e17;
        int e18;
        int e19;
        int e20;
        int e21;
        int e22;
        int e23;
        int i10;
        boolean z10;
        int i11;
        boolean z11;
        int i12;
        boolean z12;
        int i13;
        boolean z13;
        int i14;
        boolean z14;
        h1.v c10 = h1.v.c("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.f832a.d();
        Cursor c11 = AbstractC3479b.c(this.f832a, c10, false, null);
        try {
            e10 = AbstractC3478a.e(c11, "id");
            e11 = AbstractC3478a.e(c11, Keys.STATE);
            e12 = AbstractC3478a.e(c11, "worker_class_name");
            e13 = AbstractC3478a.e(c11, "input_merger_class_name");
            e14 = AbstractC3478a.e(c11, "input");
            e15 = AbstractC3478a.e(c11, "output");
            e16 = AbstractC3478a.e(c11, "initial_delay");
            e17 = AbstractC3478a.e(c11, "interval_duration");
            e18 = AbstractC3478a.e(c11, "flex_duration");
            e19 = AbstractC3478a.e(c11, "run_attempt_count");
            e20 = AbstractC3478a.e(c11, "backoff_policy");
            e21 = AbstractC3478a.e(c11, "backoff_delay_duration");
            e22 = AbstractC3478a.e(c11, "last_enqueue_time");
            e23 = AbstractC3478a.e(c11, "minimum_retention_duration");
            vVar = c10;
        } catch (Throwable th) {
            th = th;
            vVar = c10;
        }
        try {
            int e24 = AbstractC3478a.e(c11, "schedule_requested_at");
            int e25 = AbstractC3478a.e(c11, "run_in_foreground");
            int e26 = AbstractC3478a.e(c11, "out_of_quota_policy");
            int e27 = AbstractC3478a.e(c11, "period_count");
            int e28 = AbstractC3478a.e(c11, "generation");
            int e29 = AbstractC3478a.e(c11, "next_schedule_time_override");
            int e30 = AbstractC3478a.e(c11, "next_schedule_time_override_generation");
            int e31 = AbstractC3478a.e(c11, "stop_reason");
            int e32 = AbstractC3478a.e(c11, "required_network_type");
            int e33 = AbstractC3478a.e(c11, "requires_charging");
            int e34 = AbstractC3478a.e(c11, "requires_device_idle");
            int e35 = AbstractC3478a.e(c11, "requires_battery_not_low");
            int e36 = AbstractC3478a.e(c11, "requires_storage_not_low");
            int e37 = AbstractC3478a.e(c11, "trigger_content_update_delay");
            int e38 = AbstractC3478a.e(c11, "trigger_max_content_delay");
            int e39 = AbstractC3478a.e(c11, "content_uri_triggers");
            int i15 = e23;
            ArrayList arrayList = new ArrayList(c11.getCount());
            while (c11.moveToNext()) {
                String string = c11.isNull(e10) ? null : c11.getString(e10);
                z.c f10 = B.f(c11.getInt(e11));
                String string2 = c11.isNull(e12) ? null : c11.getString(e12);
                String string3 = c11.isNull(e13) ? null : c11.getString(e13);
                androidx.work.b g10 = androidx.work.b.g(c11.isNull(e14) ? null : c11.getBlob(e14));
                androidx.work.b g11 = androidx.work.b.g(c11.isNull(e15) ? null : c11.getBlob(e15));
                long j10 = c11.getLong(e16);
                long j11 = c11.getLong(e17);
                long j12 = c11.getLong(e18);
                int i16 = c11.getInt(e19);
                EnumC5097a c12 = B.c(c11.getInt(e20));
                long j13 = c11.getLong(e21);
                long j14 = c11.getLong(e22);
                int i17 = i15;
                long j15 = c11.getLong(i17);
                int i18 = e10;
                int i19 = e24;
                long j16 = c11.getLong(i19);
                e24 = i19;
                int i20 = e25;
                if (c11.getInt(i20) != 0) {
                    e25 = i20;
                    i10 = e26;
                    z10 = true;
                } else {
                    e25 = i20;
                    i10 = e26;
                    z10 = false;
                }
                x1.s e40 = B.e(c11.getInt(i10));
                e26 = i10;
                int i21 = e27;
                int i22 = c11.getInt(i21);
                e27 = i21;
                int i23 = e28;
                int i24 = c11.getInt(i23);
                e28 = i23;
                int i25 = e29;
                long j17 = c11.getLong(i25);
                e29 = i25;
                int i26 = e30;
                int i27 = c11.getInt(i26);
                e30 = i26;
                int i28 = e31;
                int i29 = c11.getInt(i28);
                e31 = i28;
                int i30 = e32;
                x1.o d10 = B.d(c11.getInt(i30));
                e32 = i30;
                int i31 = e33;
                if (c11.getInt(i31) != 0) {
                    e33 = i31;
                    i11 = e34;
                    z11 = true;
                } else {
                    e33 = i31;
                    i11 = e34;
                    z11 = false;
                }
                if (c11.getInt(i11) != 0) {
                    e34 = i11;
                    i12 = e35;
                    z12 = true;
                } else {
                    e34 = i11;
                    i12 = e35;
                    z12 = false;
                }
                if (c11.getInt(i12) != 0) {
                    e35 = i12;
                    i13 = e36;
                    z13 = true;
                } else {
                    e35 = i12;
                    i13 = e36;
                    z13 = false;
                }
                if (c11.getInt(i13) != 0) {
                    e36 = i13;
                    i14 = e37;
                    z14 = true;
                } else {
                    e36 = i13;
                    i14 = e37;
                    z14 = false;
                }
                long j18 = c11.getLong(i14);
                e37 = i14;
                int i32 = e38;
                long j19 = c11.getLong(i32);
                e38 = i32;
                int i33 = e39;
                e39 = i33;
                arrayList.add(new u(string, f10, string2, string3, g10, g11, j10, j11, j12, new C5100d(d10, z11, z12, z13, z14, j18, j19, B.b(c11.isNull(i33) ? null : c11.getBlob(i33))), i16, c12, j13, j14, j15, j16, z10, e40, i22, i24, j17, i27, i29));
                e10 = i18;
                i15 = i17;
            }
            c11.close();
            vVar.f();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            c11.close();
            vVar.f();
            throw th;
        }
    }

    @Override // C1.v
    public void j(String str, androidx.work.b bVar) {
        this.f832a.d();
        l1.k b10 = this.f839h.b();
        byte[] l10 = androidx.work.b.l(bVar);
        if (l10 == null) {
            b10.s1(1);
        } else {
            b10.P0(1, l10);
        }
        if (str == null) {
            b10.s1(2);
        } else {
            b10.b0(2, str);
        }
        this.f832a.e();
        try {
            b10.j0();
            this.f832a.D();
        } finally {
            this.f832a.i();
            this.f839h.h(b10);
        }
    }

    @Override // C1.v
    public void k(String str, long j10) {
        this.f832a.d();
        l1.k b10 = this.f840i.b();
        b10.G0(1, j10);
        if (str == null) {
            b10.s1(2);
        } else {
            b10.b0(2, str);
        }
        this.f832a.e();
        try {
            b10.j0();
            this.f832a.D();
        } finally {
            this.f832a.i();
            this.f840i.h(b10);
        }
    }

    @Override // C1.v
    public List l() {
        h1.v vVar;
        int e10;
        int e11;
        int e12;
        int e13;
        int e14;
        int e15;
        int e16;
        int e17;
        int e18;
        int e19;
        int e20;
        int e21;
        int e22;
        int e23;
        int i10;
        boolean z10;
        int i11;
        boolean z11;
        int i12;
        boolean z12;
        int i13;
        boolean z13;
        int i14;
        boolean z14;
        h1.v c10 = h1.v.c("SELECT * FROM workspec WHERE state=1", 0);
        this.f832a.d();
        Cursor c11 = AbstractC3479b.c(this.f832a, c10, false, null);
        try {
            e10 = AbstractC3478a.e(c11, "id");
            e11 = AbstractC3478a.e(c11, Keys.STATE);
            e12 = AbstractC3478a.e(c11, "worker_class_name");
            e13 = AbstractC3478a.e(c11, "input_merger_class_name");
            e14 = AbstractC3478a.e(c11, "input");
            e15 = AbstractC3478a.e(c11, "output");
            e16 = AbstractC3478a.e(c11, "initial_delay");
            e17 = AbstractC3478a.e(c11, "interval_duration");
            e18 = AbstractC3478a.e(c11, "flex_duration");
            e19 = AbstractC3478a.e(c11, "run_attempt_count");
            e20 = AbstractC3478a.e(c11, "backoff_policy");
            e21 = AbstractC3478a.e(c11, "backoff_delay_duration");
            e22 = AbstractC3478a.e(c11, "last_enqueue_time");
            e23 = AbstractC3478a.e(c11, "minimum_retention_duration");
            vVar = c10;
        } catch (Throwable th) {
            th = th;
            vVar = c10;
        }
        try {
            int e24 = AbstractC3478a.e(c11, "schedule_requested_at");
            int e25 = AbstractC3478a.e(c11, "run_in_foreground");
            int e26 = AbstractC3478a.e(c11, "out_of_quota_policy");
            int e27 = AbstractC3478a.e(c11, "period_count");
            int e28 = AbstractC3478a.e(c11, "generation");
            int e29 = AbstractC3478a.e(c11, "next_schedule_time_override");
            int e30 = AbstractC3478a.e(c11, "next_schedule_time_override_generation");
            int e31 = AbstractC3478a.e(c11, "stop_reason");
            int e32 = AbstractC3478a.e(c11, "required_network_type");
            int e33 = AbstractC3478a.e(c11, "requires_charging");
            int e34 = AbstractC3478a.e(c11, "requires_device_idle");
            int e35 = AbstractC3478a.e(c11, "requires_battery_not_low");
            int e36 = AbstractC3478a.e(c11, "requires_storage_not_low");
            int e37 = AbstractC3478a.e(c11, "trigger_content_update_delay");
            int e38 = AbstractC3478a.e(c11, "trigger_max_content_delay");
            int e39 = AbstractC3478a.e(c11, "content_uri_triggers");
            int i15 = e23;
            ArrayList arrayList = new ArrayList(c11.getCount());
            while (c11.moveToNext()) {
                String string = c11.isNull(e10) ? null : c11.getString(e10);
                z.c f10 = B.f(c11.getInt(e11));
                String string2 = c11.isNull(e12) ? null : c11.getString(e12);
                String string3 = c11.isNull(e13) ? null : c11.getString(e13);
                androidx.work.b g10 = androidx.work.b.g(c11.isNull(e14) ? null : c11.getBlob(e14));
                androidx.work.b g11 = androidx.work.b.g(c11.isNull(e15) ? null : c11.getBlob(e15));
                long j10 = c11.getLong(e16);
                long j11 = c11.getLong(e17);
                long j12 = c11.getLong(e18);
                int i16 = c11.getInt(e19);
                EnumC5097a c12 = B.c(c11.getInt(e20));
                long j13 = c11.getLong(e21);
                long j14 = c11.getLong(e22);
                int i17 = i15;
                long j15 = c11.getLong(i17);
                int i18 = e10;
                int i19 = e24;
                long j16 = c11.getLong(i19);
                e24 = i19;
                int i20 = e25;
                if (c11.getInt(i20) != 0) {
                    e25 = i20;
                    i10 = e26;
                    z10 = true;
                } else {
                    e25 = i20;
                    i10 = e26;
                    z10 = false;
                }
                x1.s e40 = B.e(c11.getInt(i10));
                e26 = i10;
                int i21 = e27;
                int i22 = c11.getInt(i21);
                e27 = i21;
                int i23 = e28;
                int i24 = c11.getInt(i23);
                e28 = i23;
                int i25 = e29;
                long j17 = c11.getLong(i25);
                e29 = i25;
                int i26 = e30;
                int i27 = c11.getInt(i26);
                e30 = i26;
                int i28 = e31;
                int i29 = c11.getInt(i28);
                e31 = i28;
                int i30 = e32;
                x1.o d10 = B.d(c11.getInt(i30));
                e32 = i30;
                int i31 = e33;
                if (c11.getInt(i31) != 0) {
                    e33 = i31;
                    i11 = e34;
                    z11 = true;
                } else {
                    e33 = i31;
                    i11 = e34;
                    z11 = false;
                }
                if (c11.getInt(i11) != 0) {
                    e34 = i11;
                    i12 = e35;
                    z12 = true;
                } else {
                    e34 = i11;
                    i12 = e35;
                    z12 = false;
                }
                if (c11.getInt(i12) != 0) {
                    e35 = i12;
                    i13 = e36;
                    z13 = true;
                } else {
                    e35 = i12;
                    i13 = e36;
                    z13 = false;
                }
                if (c11.getInt(i13) != 0) {
                    e36 = i13;
                    i14 = e37;
                    z14 = true;
                } else {
                    e36 = i13;
                    i14 = e37;
                    z14 = false;
                }
                long j18 = c11.getLong(i14);
                e37 = i14;
                int i32 = e38;
                long j19 = c11.getLong(i32);
                e38 = i32;
                int i33 = e39;
                e39 = i33;
                arrayList.add(new u(string, f10, string2, string3, g10, g11, j10, j11, j12, new C5100d(d10, z11, z12, z13, z14, j18, j19, B.b(c11.isNull(i33) ? null : c11.getBlob(i33))), i16, c12, j13, j14, j15, j16, z10, e40, i22, i24, j17, i27, i29));
                e10 = i18;
                i15 = i17;
            }
            c11.close();
            vVar.f();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            c11.close();
            vVar.f();
            throw th;
        }
    }

    @Override // C1.v
    public int m(z.c cVar, String str) {
        this.f832a.d();
        l1.k b10 = this.f836e.b();
        b10.G0(1, B.j(cVar));
        if (str == null) {
            b10.s1(2);
        } else {
            b10.b0(2, str);
        }
        this.f832a.e();
        try {
            int j02 = b10.j0();
            this.f832a.D();
            return j02;
        } finally {
            this.f832a.i();
            this.f836e.h(b10);
        }
    }

    @Override // C1.v
    public boolean n() {
        boolean z10 = false;
        h1.v c10 = h1.v.c("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
        this.f832a.d();
        Cursor c11 = AbstractC3479b.c(this.f832a, c10, false, null);
        try {
            if (c11.moveToFirst()) {
                if (c11.getInt(0) != 0) {
                    z10 = true;
                }
            }
            return z10;
        } finally {
            c11.close();
            c10.f();
        }
    }

    @Override // C1.v
    public void o(u uVar) {
        this.f832a.d();
        this.f832a.e();
        try {
            this.f833b.j(uVar);
            this.f832a.D();
        } finally {
            this.f832a.i();
        }
    }

    @Override // C1.v
    public List p(String str) {
        h1.v c10 = h1.v.c("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            c10.s1(1);
        } else {
            c10.b0(1, str);
        }
        this.f832a.d();
        Cursor c11 = AbstractC3479b.c(this.f832a, c10, false, null);
        try {
            ArrayList arrayList = new ArrayList(c11.getCount());
            while (c11.moveToNext()) {
                arrayList.add(c11.isNull(0) ? null : c11.getString(0));
            }
            return arrayList;
        } finally {
            c11.close();
            c10.f();
        }
    }

    @Override // C1.v
    public List q() {
        h1.v vVar;
        int e10;
        int e11;
        int e12;
        int e13;
        int e14;
        int e15;
        int e16;
        int e17;
        int e18;
        int e19;
        int e20;
        int e21;
        int e22;
        int e23;
        int i10;
        boolean z10;
        int i11;
        boolean z11;
        int i12;
        boolean z12;
        int i13;
        boolean z13;
        int i14;
        boolean z14;
        h1.v c10 = h1.v.c("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time", 0);
        this.f832a.d();
        Cursor c11 = AbstractC3479b.c(this.f832a, c10, false, null);
        try {
            e10 = AbstractC3478a.e(c11, "id");
            e11 = AbstractC3478a.e(c11, Keys.STATE);
            e12 = AbstractC3478a.e(c11, "worker_class_name");
            e13 = AbstractC3478a.e(c11, "input_merger_class_name");
            e14 = AbstractC3478a.e(c11, "input");
            e15 = AbstractC3478a.e(c11, "output");
            e16 = AbstractC3478a.e(c11, "initial_delay");
            e17 = AbstractC3478a.e(c11, "interval_duration");
            e18 = AbstractC3478a.e(c11, "flex_duration");
            e19 = AbstractC3478a.e(c11, "run_attempt_count");
            e20 = AbstractC3478a.e(c11, "backoff_policy");
            e21 = AbstractC3478a.e(c11, "backoff_delay_duration");
            e22 = AbstractC3478a.e(c11, "last_enqueue_time");
            e23 = AbstractC3478a.e(c11, "minimum_retention_duration");
            vVar = c10;
        } catch (Throwable th) {
            th = th;
            vVar = c10;
        }
        try {
            int e24 = AbstractC3478a.e(c11, "schedule_requested_at");
            int e25 = AbstractC3478a.e(c11, "run_in_foreground");
            int e26 = AbstractC3478a.e(c11, "out_of_quota_policy");
            int e27 = AbstractC3478a.e(c11, "period_count");
            int e28 = AbstractC3478a.e(c11, "generation");
            int e29 = AbstractC3478a.e(c11, "next_schedule_time_override");
            int e30 = AbstractC3478a.e(c11, "next_schedule_time_override_generation");
            int e31 = AbstractC3478a.e(c11, "stop_reason");
            int e32 = AbstractC3478a.e(c11, "required_network_type");
            int e33 = AbstractC3478a.e(c11, "requires_charging");
            int e34 = AbstractC3478a.e(c11, "requires_device_idle");
            int e35 = AbstractC3478a.e(c11, "requires_battery_not_low");
            int e36 = AbstractC3478a.e(c11, "requires_storage_not_low");
            int e37 = AbstractC3478a.e(c11, "trigger_content_update_delay");
            int e38 = AbstractC3478a.e(c11, "trigger_max_content_delay");
            int e39 = AbstractC3478a.e(c11, "content_uri_triggers");
            int i15 = e23;
            ArrayList arrayList = new ArrayList(c11.getCount());
            while (c11.moveToNext()) {
                String string = c11.isNull(e10) ? null : c11.getString(e10);
                z.c f10 = B.f(c11.getInt(e11));
                String string2 = c11.isNull(e12) ? null : c11.getString(e12);
                String string3 = c11.isNull(e13) ? null : c11.getString(e13);
                androidx.work.b g10 = androidx.work.b.g(c11.isNull(e14) ? null : c11.getBlob(e14));
                androidx.work.b g11 = androidx.work.b.g(c11.isNull(e15) ? null : c11.getBlob(e15));
                long j10 = c11.getLong(e16);
                long j11 = c11.getLong(e17);
                long j12 = c11.getLong(e18);
                int i16 = c11.getInt(e19);
                EnumC5097a c12 = B.c(c11.getInt(e20));
                long j13 = c11.getLong(e21);
                long j14 = c11.getLong(e22);
                int i17 = i15;
                long j15 = c11.getLong(i17);
                int i18 = e10;
                int i19 = e24;
                long j16 = c11.getLong(i19);
                e24 = i19;
                int i20 = e25;
                if (c11.getInt(i20) != 0) {
                    e25 = i20;
                    i10 = e26;
                    z10 = true;
                } else {
                    e25 = i20;
                    i10 = e26;
                    z10 = false;
                }
                x1.s e40 = B.e(c11.getInt(i10));
                e26 = i10;
                int i21 = e27;
                int i22 = c11.getInt(i21);
                e27 = i21;
                int i23 = e28;
                int i24 = c11.getInt(i23);
                e28 = i23;
                int i25 = e29;
                long j17 = c11.getLong(i25);
                e29 = i25;
                int i26 = e30;
                int i27 = c11.getInt(i26);
                e30 = i26;
                int i28 = e31;
                int i29 = c11.getInt(i28);
                e31 = i28;
                int i30 = e32;
                x1.o d10 = B.d(c11.getInt(i30));
                e32 = i30;
                int i31 = e33;
                if (c11.getInt(i31) != 0) {
                    e33 = i31;
                    i11 = e34;
                    z11 = true;
                } else {
                    e33 = i31;
                    i11 = e34;
                    z11 = false;
                }
                if (c11.getInt(i11) != 0) {
                    e34 = i11;
                    i12 = e35;
                    z12 = true;
                } else {
                    e34 = i11;
                    i12 = e35;
                    z12 = false;
                }
                if (c11.getInt(i12) != 0) {
                    e35 = i12;
                    i13 = e36;
                    z13 = true;
                } else {
                    e35 = i12;
                    i13 = e36;
                    z13 = false;
                }
                if (c11.getInt(i13) != 0) {
                    e36 = i13;
                    i14 = e37;
                    z14 = true;
                } else {
                    e36 = i13;
                    i14 = e37;
                    z14 = false;
                }
                long j18 = c11.getLong(i14);
                e37 = i14;
                int i32 = e38;
                long j19 = c11.getLong(i32);
                e38 = i32;
                int i33 = e39;
                e39 = i33;
                arrayList.add(new u(string, f10, string2, string3, g10, g11, j10, j11, j12, new C5100d(d10, z11, z12, z13, z14, j18, j19, B.b(c11.isNull(i33) ? null : c11.getBlob(i33))), i16, c12, j13, j14, j15, j16, z10, e40, i22, i24, j17, i27, i29));
                e10 = i18;
                i15 = i17;
            }
            c11.close();
            vVar.f();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            c11.close();
            vVar.f();
            throw th;
        }
    }

    @Override // C1.v
    public z.c r(String str) {
        h1.v c10 = h1.v.c("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            c10.s1(1);
        } else {
            c10.b0(1, str);
        }
        this.f832a.d();
        z.c cVar = null;
        Cursor c11 = AbstractC3479b.c(this.f832a, c10, false, null);
        try {
            if (c11.moveToFirst()) {
                Integer valueOf = c11.isNull(0) ? null : Integer.valueOf(c11.getInt(0));
                if (valueOf != null) {
                    B b10 = B.f748a;
                    cVar = B.f(valueOf.intValue());
                }
            }
            return cVar;
        } finally {
            c11.close();
            c10.f();
        }
    }

    @Override // C1.v
    public u s(String str) {
        h1.v vVar;
        u uVar;
        int i10;
        boolean z10;
        int i11;
        boolean z11;
        int i12;
        boolean z12;
        int i13;
        boolean z13;
        int i14;
        boolean z14;
        h1.v c10 = h1.v.c("SELECT * FROM workspec WHERE id=?", 1);
        if (str == null) {
            c10.s1(1);
        } else {
            c10.b0(1, str);
        }
        this.f832a.d();
        Cursor c11 = AbstractC3479b.c(this.f832a, c10, false, null);
        try {
            int e10 = AbstractC3478a.e(c11, "id");
            int e11 = AbstractC3478a.e(c11, Keys.STATE);
            int e12 = AbstractC3478a.e(c11, "worker_class_name");
            int e13 = AbstractC3478a.e(c11, "input_merger_class_name");
            int e14 = AbstractC3478a.e(c11, "input");
            int e15 = AbstractC3478a.e(c11, "output");
            int e16 = AbstractC3478a.e(c11, "initial_delay");
            int e17 = AbstractC3478a.e(c11, "interval_duration");
            int e18 = AbstractC3478a.e(c11, "flex_duration");
            int e19 = AbstractC3478a.e(c11, "run_attempt_count");
            int e20 = AbstractC3478a.e(c11, "backoff_policy");
            int e21 = AbstractC3478a.e(c11, "backoff_delay_duration");
            int e22 = AbstractC3478a.e(c11, "last_enqueue_time");
            int e23 = AbstractC3478a.e(c11, "minimum_retention_duration");
            vVar = c10;
            try {
                int e24 = AbstractC3478a.e(c11, "schedule_requested_at");
                int e25 = AbstractC3478a.e(c11, "run_in_foreground");
                int e26 = AbstractC3478a.e(c11, "out_of_quota_policy");
                int e27 = AbstractC3478a.e(c11, "period_count");
                int e28 = AbstractC3478a.e(c11, "generation");
                int e29 = AbstractC3478a.e(c11, "next_schedule_time_override");
                int e30 = AbstractC3478a.e(c11, "next_schedule_time_override_generation");
                int e31 = AbstractC3478a.e(c11, "stop_reason");
                int e32 = AbstractC3478a.e(c11, "required_network_type");
                int e33 = AbstractC3478a.e(c11, "requires_charging");
                int e34 = AbstractC3478a.e(c11, "requires_device_idle");
                int e35 = AbstractC3478a.e(c11, "requires_battery_not_low");
                int e36 = AbstractC3478a.e(c11, "requires_storage_not_low");
                int e37 = AbstractC3478a.e(c11, "trigger_content_update_delay");
                int e38 = AbstractC3478a.e(c11, "trigger_max_content_delay");
                int e39 = AbstractC3478a.e(c11, "content_uri_triggers");
                if (c11.moveToFirst()) {
                    String string = c11.isNull(e10) ? null : c11.getString(e10);
                    z.c f10 = B.f(c11.getInt(e11));
                    String string2 = c11.isNull(e12) ? null : c11.getString(e12);
                    String string3 = c11.isNull(e13) ? null : c11.getString(e13);
                    androidx.work.b g10 = androidx.work.b.g(c11.isNull(e14) ? null : c11.getBlob(e14));
                    androidx.work.b g11 = androidx.work.b.g(c11.isNull(e15) ? null : c11.getBlob(e15));
                    long j10 = c11.getLong(e16);
                    long j11 = c11.getLong(e17);
                    long j12 = c11.getLong(e18);
                    int i15 = c11.getInt(e19);
                    EnumC5097a c12 = B.c(c11.getInt(e20));
                    long j13 = c11.getLong(e21);
                    long j14 = c11.getLong(e22);
                    long j15 = c11.getLong(e23);
                    long j16 = c11.getLong(e24);
                    if (c11.getInt(e25) != 0) {
                        i10 = e26;
                        z10 = true;
                    } else {
                        i10 = e26;
                        z10 = false;
                    }
                    x1.s e40 = B.e(c11.getInt(i10));
                    int i16 = c11.getInt(e27);
                    int i17 = c11.getInt(e28);
                    long j17 = c11.getLong(e29);
                    int i18 = c11.getInt(e30);
                    int i19 = c11.getInt(e31);
                    x1.o d10 = B.d(c11.getInt(e32));
                    if (c11.getInt(e33) != 0) {
                        i11 = e34;
                        z11 = true;
                    } else {
                        i11 = e34;
                        z11 = false;
                    }
                    if (c11.getInt(i11) != 0) {
                        i12 = e35;
                        z12 = true;
                    } else {
                        i12 = e35;
                        z12 = false;
                    }
                    if (c11.getInt(i12) != 0) {
                        i13 = e36;
                        z13 = true;
                    } else {
                        i13 = e36;
                        z13 = false;
                    }
                    if (c11.getInt(i13) != 0) {
                        i14 = e37;
                        z14 = true;
                    } else {
                        i14 = e37;
                        z14 = false;
                    }
                    uVar = new u(string, f10, string2, string3, g10, g11, j10, j11, j12, new C5100d(d10, z11, z12, z13, z14, c11.getLong(i14), c11.getLong(e38), B.b(c11.isNull(e39) ? null : c11.getBlob(e39))), i15, c12, j13, j14, j15, j16, z10, e40, i16, i17, j17, i18, i19);
                } else {
                    uVar = null;
                }
                c11.close();
                vVar.f();
                return uVar;
            } catch (Throwable th) {
                th = th;
                c11.close();
                vVar.f();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            vVar = c10;
        }
    }

    @Override // C1.v
    public int t(String str) {
        this.f832a.d();
        l1.k b10 = this.f842k.b();
        if (str == null) {
            b10.s1(1);
        } else {
            b10.b0(1, str);
        }
        this.f832a.e();
        try {
            int j02 = b10.j0();
            this.f832a.D();
            return j02;
        } finally {
            this.f832a.i();
            this.f842k.h(b10);
        }
    }

    @Override // C1.v
    public int u(String str) {
        this.f832a.d();
        l1.k b10 = this.f837f.b();
        if (str == null) {
            b10.s1(1);
        } else {
            b10.b0(1, str);
        }
        this.f832a.e();
        try {
            int j02 = b10.j0();
            this.f832a.D();
            return j02;
        } finally {
            this.f832a.i();
            this.f837f.h(b10);
        }
    }

    @Override // C1.v
    public List v(String str) {
        h1.v c10 = h1.v.c("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            c10.s1(1);
        } else {
            c10.b0(1, str);
        }
        this.f832a.d();
        Cursor c11 = AbstractC3479b.c(this.f832a, c10, false, null);
        try {
            ArrayList arrayList = new ArrayList(c11.getCount());
            while (c11.moveToNext()) {
                arrayList.add(androidx.work.b.g(c11.isNull(0) ? null : c11.getBlob(0)));
            }
            return arrayList;
        } finally {
            c11.close();
            c10.f();
        }
    }

    @Override // C1.v
    public int w(String str) {
        this.f832a.d();
        l1.k b10 = this.f841j.b();
        if (str == null) {
            b10.s1(1);
        } else {
            b10.b0(1, str);
        }
        this.f832a.e();
        try {
            int j02 = b10.j0();
            this.f832a.D();
            return j02;
        } finally {
            this.f832a.i();
            this.f841j.h(b10);
        }
    }

    @Override // C1.v
    public int x() {
        h1.v c10 = h1.v.c("Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)", 0);
        this.f832a.d();
        Cursor c11 = AbstractC3479b.c(this.f832a, c10, false, null);
        try {
            return c11.moveToFirst() ? c11.getInt(0) : 0;
        } finally {
            c11.close();
            c10.f();
        }
    }

    @Override // C1.v
    public void y(String str, int i10) {
        this.f832a.d();
        l1.k b10 = this.f844m.b();
        if (str == null) {
            b10.s1(1);
        } else {
            b10.b0(1, str);
        }
        b10.G0(2, i10);
        this.f832a.e();
        try {
            b10.j0();
            this.f832a.D();
        } finally {
            this.f832a.i();
            this.f844m.h(b10);
        }
    }

    @Override // C1.v
    public List z(String str) {
        h1.v c10 = h1.v.c("SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            c10.s1(1);
        } else {
            c10.b0(1, str);
        }
        this.f832a.d();
        this.f832a.e();
        try {
            Cursor c11 = AbstractC3479b.c(this.f832a, c10, true, null);
            try {
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                while (c11.moveToNext()) {
                    String string = c11.getString(0);
                    if (((ArrayList) hashMap.get(string)) == null) {
                        hashMap.put(string, new ArrayList());
                    }
                    String string2 = c11.getString(0);
                    if (((ArrayList) hashMap2.get(string2)) == null) {
                        hashMap2.put(string2, new ArrayList());
                    }
                }
                c11.moveToPosition(-1);
                D(hashMap);
                C(hashMap2);
                ArrayList arrayList = new ArrayList(c11.getCount());
                while (c11.moveToNext()) {
                    String string3 = c11.isNull(0) ? null : c11.getString(0);
                    z.c f10 = B.f(c11.getInt(1));
                    androidx.work.b g10 = androidx.work.b.g(c11.isNull(2) ? null : c11.getBlob(2));
                    int i10 = c11.getInt(3);
                    int i11 = c11.getInt(4);
                    long j10 = c11.getLong(13);
                    long j11 = c11.getLong(14);
                    long j12 = c11.getLong(15);
                    EnumC5097a c12 = B.c(c11.getInt(16));
                    long j13 = c11.getLong(17);
                    long j14 = c11.getLong(18);
                    int i12 = c11.getInt(19);
                    long j15 = c11.getLong(20);
                    int i13 = c11.getInt(21);
                    C5100d c5100d = new C5100d(B.d(c11.getInt(5)), c11.getInt(6) != 0, c11.getInt(7) != 0, c11.getInt(8) != 0, c11.getInt(9) != 0, c11.getLong(10), c11.getLong(11), B.b(c11.isNull(12) ? null : c11.getBlob(12)));
                    ArrayList arrayList2 = (ArrayList) hashMap.get(c11.getString(0));
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    ArrayList arrayList3 = arrayList2;
                    ArrayList arrayList4 = (ArrayList) hashMap2.get(c11.getString(0));
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                    }
                    arrayList.add(new u.c(string3, f10, g10, j10, j11, j12, c5100d, i10, c12, j13, j14, i12, i11, j15, i13, arrayList3, arrayList4));
                }
                this.f832a.D();
                c11.close();
                c10.f();
                return arrayList;
            } catch (Throwable th) {
                c11.close();
                c10.f();
                throw th;
            }
        } finally {
            this.f832a.i();
        }
    }
}
