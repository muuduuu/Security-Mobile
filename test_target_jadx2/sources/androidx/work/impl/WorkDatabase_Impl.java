package androidx.work.impl;

import C1.InterfaceC0749b;
import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import h1.s;
import h1.u;
import j1.AbstractC3479b;
import j1.e;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l1.h;

/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: q, reason: collision with root package name */
    private volatile C1.v f18210q;

    /* renamed from: r, reason: collision with root package name */
    private volatile InterfaceC0749b f18211r;

    /* renamed from: s, reason: collision with root package name */
    private volatile C1.z f18212s;

    /* renamed from: t, reason: collision with root package name */
    private volatile C1.j f18213t;

    /* renamed from: u, reason: collision with root package name */
    private volatile C1.o f18214u;

    /* renamed from: v, reason: collision with root package name */
    private volatile C1.r f18215v;

    /* renamed from: w, reason: collision with root package name */
    private volatile C1.e f18216w;

    @Override // androidx.work.impl.WorkDatabase
    public InterfaceC0749b F() {
        InterfaceC0749b interfaceC0749b;
        if (this.f18211r != null) {
            return this.f18211r;
        }
        synchronized (this) {
            try {
                if (this.f18211r == null) {
                    this.f18211r = new C1.c(this);
                }
                interfaceC0749b = this.f18211r;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC0749b;
    }

    @Override // androidx.work.impl.WorkDatabase
    public C1.e G() {
        C1.e eVar;
        if (this.f18216w != null) {
            return this.f18216w;
        }
        synchronized (this) {
            try {
                if (this.f18216w == null) {
                    this.f18216w = new C1.f(this);
                }
                eVar = this.f18216w;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public C1.j H() {
        C1.j jVar;
        if (this.f18213t != null) {
            return this.f18213t;
        }
        synchronized (this) {
            try {
                if (this.f18213t == null) {
                    this.f18213t = new C1.k(this);
                }
                jVar = this.f18213t;
            } catch (Throwable th) {
                throw th;
            }
        }
        return jVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public C1.o I() {
        C1.o oVar;
        if (this.f18214u != null) {
            return this.f18214u;
        }
        synchronized (this) {
            try {
                if (this.f18214u == null) {
                    this.f18214u = new C1.p(this);
                }
                oVar = this.f18214u;
            } catch (Throwable th) {
                throw th;
            }
        }
        return oVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public C1.r J() {
        C1.r rVar;
        if (this.f18215v != null) {
            return this.f18215v;
        }
        synchronized (this) {
            try {
                if (this.f18215v == null) {
                    this.f18215v = new C1.s(this);
                }
                rVar = this.f18215v;
            } catch (Throwable th) {
                throw th;
            }
        }
        return rVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public C1.v K() {
        C1.v vVar;
        if (this.f18210q != null) {
            return this.f18210q;
        }
        synchronized (this) {
            try {
                if (this.f18210q == null) {
                    this.f18210q = new C1.w(this);
                }
                vVar = this.f18210q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return vVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public C1.z L() {
        C1.z zVar;
        if (this.f18212s != null) {
            return this.f18212s;
        }
        synchronized (this) {
            try {
                if (this.f18212s == null) {
                    this.f18212s = new C1.A(this);
                }
                zVar = this.f18212s;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zVar;
    }

    @Override // h1.s
    protected androidx.room.c g() {
        return new androidx.room.c(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // h1.s
    protected l1.h h(h1.h hVar) {
        return hVar.f33858c.a(h.b.a(hVar.f33856a).d(hVar.f33857b).c(new h1.u(hVar, new a(20), "7d73d21f1bd82c9e5268b6dcf9fde2cb", "3071c8717539de5d5353f4c8cd59a032")).b());
    }

    @Override // h1.s
    public List j(Map map) {
        return Arrays.asList(new H(), new I(), new J(), new K(), new L(), new M());
    }

    @Override // h1.s
    public Set p() {
        return new HashSet();
    }

    @Override // h1.s
    protected Map q() {
        HashMap hashMap = new HashMap();
        hashMap.put(C1.v.class, C1.w.E());
        hashMap.put(InterfaceC0749b.class, C1.c.e());
        hashMap.put(C1.z.class, C1.A.f());
        hashMap.put(C1.j.class, C1.k.j());
        hashMap.put(C1.o.class, C1.p.c());
        hashMap.put(C1.r.class, C1.s.c());
        hashMap.put(C1.e.class, C1.f.c());
        hashMap.put(C1.g.class, C1.h.a());
        return hashMap;
    }

    class a extends u.b {
        a(int i10) {
            super(i10);
        }

        @Override // h1.u.b
        public void a(l1.g gVar) {
            gVar.Z("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.Z("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            gVar.Z("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            gVar.Z("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
            gVar.Z("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            gVar.Z("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
            gVar.Z("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.Z("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            gVar.Z("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.Z("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.Z("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            gVar.Z("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.Z("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            gVar.Z("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            gVar.Z("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '7d73d21f1bd82c9e5268b6dcf9fde2cb')");
        }

        @Override // h1.u.b
        public void b(l1.g gVar) {
            gVar.Z("DROP TABLE IF EXISTS `Dependency`");
            gVar.Z("DROP TABLE IF EXISTS `WorkSpec`");
            gVar.Z("DROP TABLE IF EXISTS `WorkTag`");
            gVar.Z("DROP TABLE IF EXISTS `SystemIdInfo`");
            gVar.Z("DROP TABLE IF EXISTS `WorkName`");
            gVar.Z("DROP TABLE IF EXISTS `WorkProgress`");
            gVar.Z("DROP TABLE IF EXISTS `Preference`");
            if (((h1.s) WorkDatabase_Impl.this).f33891h != null) {
                int size = ((h1.s) WorkDatabase_Impl.this).f33891h.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((s.b) ((h1.s) WorkDatabase_Impl.this).f33891h.get(i10)).b(gVar);
                }
            }
        }

        @Override // h1.u.b
        public void c(l1.g gVar) {
            if (((h1.s) WorkDatabase_Impl.this).f33891h != null) {
                int size = ((h1.s) WorkDatabase_Impl.this).f33891h.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((s.b) ((h1.s) WorkDatabase_Impl.this).f33891h.get(i10)).a(gVar);
                }
            }
        }

        @Override // h1.u.b
        public void d(l1.g gVar) {
            ((h1.s) WorkDatabase_Impl.this).f33884a = gVar;
            gVar.Z("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.w(gVar);
            if (((h1.s) WorkDatabase_Impl.this).f33891h != null) {
                int size = ((h1.s) WorkDatabase_Impl.this).f33891h.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((s.b) ((h1.s) WorkDatabase_Impl.this).f33891h.get(i10)).c(gVar);
                }
            }
        }

        @Override // h1.u.b
        public void f(l1.g gVar) {
            AbstractC3479b.b(gVar);
        }

        @Override // h1.u.b
        public u.c g(l1.g gVar) {
            HashMap hashMap = new HashMap(2);
            hashMap.put("work_spec_id", new e.a("work_spec_id", "TEXT", true, 1, null, 1));
            hashMap.put("prerequisite_id", new e.a("prerequisite_id", "TEXT", true, 2, null, 1));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new e.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            hashSet.add(new e.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new e.C0515e("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            hashSet2.add(new e.C0515e("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id"), Arrays.asList("ASC")));
            j1.e eVar = new j1.e("Dependency", hashMap, hashSet, hashSet2);
            j1.e a10 = j1.e.a(gVar, "Dependency");
            if (!eVar.equals(a10)) {
                return new u.c(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + eVar + "\n Found:\n" + a10);
            }
            HashMap hashMap2 = new HashMap(30);
            hashMap2.put("id", new e.a("id", "TEXT", true, 1, null, 1));
            hashMap2.put(Keys.STATE, new e.a(Keys.STATE, "INTEGER", true, 0, null, 1));
            hashMap2.put("worker_class_name", new e.a("worker_class_name", "TEXT", true, 0, null, 1));
            hashMap2.put("input_merger_class_name", new e.a("input_merger_class_name", "TEXT", true, 0, null, 1));
            hashMap2.put("input", new e.a("input", "BLOB", true, 0, null, 1));
            hashMap2.put("output", new e.a("output", "BLOB", true, 0, null, 1));
            hashMap2.put("initial_delay", new e.a("initial_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("interval_duration", new e.a("interval_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("flex_duration", new e.a("flex_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("run_attempt_count", new e.a("run_attempt_count", "INTEGER", true, 0, null, 1));
            hashMap2.put("backoff_policy", new e.a("backoff_policy", "INTEGER", true, 0, null, 1));
            hashMap2.put("backoff_delay_duration", new e.a("backoff_delay_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("last_enqueue_time", new e.a("last_enqueue_time", "INTEGER", true, 0, "-1", 1));
            hashMap2.put("minimum_retention_duration", new e.a("minimum_retention_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("schedule_requested_at", new e.a("schedule_requested_at", "INTEGER", true, 0, null, 1));
            hashMap2.put("run_in_foreground", new e.a("run_in_foreground", "INTEGER", true, 0, null, 1));
            hashMap2.put("out_of_quota_policy", new e.a("out_of_quota_policy", "INTEGER", true, 0, null, 1));
            hashMap2.put("period_count", new e.a("period_count", "INTEGER", true, 0, "0", 1));
            hashMap2.put("generation", new e.a("generation", "INTEGER", true, 0, "0", 1));
            hashMap2.put("next_schedule_time_override", new e.a("next_schedule_time_override", "INTEGER", true, 0, "9223372036854775807", 1));
            hashMap2.put("next_schedule_time_override_generation", new e.a("next_schedule_time_override_generation", "INTEGER", true, 0, "0", 1));
            hashMap2.put("stop_reason", new e.a("stop_reason", "INTEGER", true, 0, "-256", 1));
            hashMap2.put("required_network_type", new e.a("required_network_type", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_charging", new e.a("requires_charging", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_device_idle", new e.a("requires_device_idle", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_battery_not_low", new e.a("requires_battery_not_low", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_storage_not_low", new e.a("requires_storage_not_low", "INTEGER", true, 0, null, 1));
            hashMap2.put("trigger_content_update_delay", new e.a("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("trigger_max_content_delay", new e.a("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("content_uri_triggers", new e.a("content_uri_triggers", "BLOB", true, 0, null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new e.C0515e("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at"), Arrays.asList("ASC")));
            hashSet4.add(new e.C0515e("index_WorkSpec_last_enqueue_time", false, Arrays.asList("last_enqueue_time"), Arrays.asList("ASC")));
            j1.e eVar2 = new j1.e("WorkSpec", hashMap2, hashSet3, hashSet4);
            j1.e a11 = j1.e.a(gVar, "WorkSpec");
            if (!eVar2.equals(a11)) {
                return new u.c(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + eVar2 + "\n Found:\n" + a11);
            }
            HashMap hashMap3 = new HashMap(2);
            hashMap3.put("tag", new e.a("tag", "TEXT", true, 1, null, 1));
            hashMap3.put("work_spec_id", new e.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new e.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new e.C0515e("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            j1.e eVar3 = new j1.e("WorkTag", hashMap3, hashSet5, hashSet6);
            j1.e a12 = j1.e.a(gVar, "WorkTag");
            if (!eVar3.equals(a12)) {
                return new u.c(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + eVar3 + "\n Found:\n" + a12);
            }
            HashMap hashMap4 = new HashMap(3);
            hashMap4.put("work_spec_id", new e.a("work_spec_id", "TEXT", true, 1, null, 1));
            hashMap4.put("generation", new e.a("generation", "INTEGER", true, 2, "0", 1));
            hashMap4.put("system_id", new e.a("system_id", "INTEGER", true, 0, null, 1));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new e.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            j1.e eVar4 = new j1.e("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
            j1.e a13 = j1.e.a(gVar, "SystemIdInfo");
            if (!eVar4.equals(a13)) {
                return new u.c(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + eVar4 + "\n Found:\n" + a13);
            }
            HashMap hashMap5 = new HashMap(2);
            hashMap5.put("name", new e.a("name", "TEXT", true, 1, null, 1));
            hashMap5.put("work_spec_id", new e.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new e.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new e.C0515e("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            j1.e eVar5 = new j1.e("WorkName", hashMap5, hashSet8, hashSet9);
            j1.e a14 = j1.e.a(gVar, "WorkName");
            if (!eVar5.equals(a14)) {
                return new u.c(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + eVar5 + "\n Found:\n" + a14);
            }
            HashMap hashMap6 = new HashMap(2);
            hashMap6.put("work_spec_id", new e.a("work_spec_id", "TEXT", true, 1, null, 1));
            hashMap6.put(ReactProgressBarViewManager.PROP_PROGRESS, new e.a(ReactProgressBarViewManager.PROP_PROGRESS, "BLOB", true, 0, null, 1));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new e.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            j1.e eVar6 = new j1.e("WorkProgress", hashMap6, hashSet10, new HashSet(0));
            j1.e a15 = j1.e.a(gVar, "WorkProgress");
            if (!eVar6.equals(a15)) {
                return new u.c(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + eVar6 + "\n Found:\n" + a15);
            }
            HashMap hashMap7 = new HashMap(2);
            hashMap7.put("key", new e.a("key", "TEXT", true, 1, null, 1));
            hashMap7.put("long_value", new e.a("long_value", "INTEGER", false, 0, null, 1));
            j1.e eVar7 = new j1.e("Preference", hashMap7, new HashSet(0), new HashSet(0));
            j1.e a16 = j1.e.a(gVar, "Preference");
            if (eVar7.equals(a16)) {
                return new u.c(true, null);
            }
            return new u.c(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + eVar7 + "\n Found:\n" + a16);
        }

        @Override // h1.u.b
        public void e(l1.g gVar) {
        }
    }
}
