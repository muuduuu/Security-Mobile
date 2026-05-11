package com.nextbillion.gobbler.internal.db;

import h1.s;
import h1.u;
import j1.AbstractC3479b;
import j1.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l1.g;
import l1.h;
import x9.b;
import x9.c;
import x9.d;
import x9.e;

/* loaded from: classes2.dex */
public final class GobblerDatabase_Impl extends GobblerDatabase {

    /* renamed from: s, reason: collision with root package name */
    private volatile b f29153s;

    /* renamed from: t, reason: collision with root package name */
    private volatile d f29154t;

    @Override // com.nextbillion.gobbler.internal.db.GobblerDatabase
    public b I() {
        b bVar;
        if (this.f29153s != null) {
            return this.f29153s;
        }
        synchronized (this) {
            try {
                if (this.f29153s == null) {
                    this.f29153s = new c(this);
                }
                bVar = this.f29153s;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    @Override // com.nextbillion.gobbler.internal.db.GobblerDatabase
    public d J() {
        d dVar;
        if (this.f29154t != null) {
            return this.f29154t;
        }
        synchronized (this) {
            try {
                if (this.f29154t == null) {
                    this.f29154t = new e(this);
                }
                dVar = this.f29154t;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }

    @Override // h1.s
    protected androidx.room.c g() {
        return new androidx.room.c(this, new HashMap(0), new HashMap(0), "gobbler_events", "gobbler_logs");
    }

    @Override // h1.s
    protected h h(h1.h hVar) {
        return hVar.f33858c.a(h.b.a(hVar.f33856a).d(hVar.f33857b).c(new u(hVar, new a(2), "88ca1b44f7b4eb4d6adda0cae687ad8c", "0c1a574034bcde4150e26f3a2ec97ac4")).b());
    }

    @Override // h1.s
    public List j(Map map) {
        return new ArrayList();
    }

    @Override // h1.s
    public Set p() {
        return new HashSet();
    }

    @Override // h1.s
    protected Map q() {
        HashMap hashMap = new HashMap();
        hashMap.put(b.class, c.i());
        hashMap.put(d.class, e.i());
        return hashMap;
    }

    class a extends u.b {
        a(int i10) {
            super(i10);
        }

        @Override // h1.u.b
        public void a(g gVar) {
            gVar.Z("CREATE TABLE IF NOT EXISTS `gobbler_events` (`event_id` TEXT NOT NULL, `created_at` INTEGER NOT NULL, `event_bytes` BLOB NOT NULL, `sync_status` TEXT NOT NULL, `request_id` TEXT, PRIMARY KEY(`event_id`))");
            gVar.Z("CREATE TABLE IF NOT EXISTS `gobbler_logs` (`event_id` TEXT NOT NULL, `created_at` INTEGER NOT NULL, `event_bytes` BLOB NOT NULL, `sync_status` TEXT NOT NULL, `request_id` TEXT, PRIMARY KEY(`event_id`))");
            gVar.Z("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            gVar.Z("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '88ca1b44f7b4eb4d6adda0cae687ad8c')");
        }

        @Override // h1.u.b
        public void b(g gVar) {
            gVar.Z("DROP TABLE IF EXISTS `gobbler_events`");
            gVar.Z("DROP TABLE IF EXISTS `gobbler_logs`");
            List list = ((s) GobblerDatabase_Impl.this).f33891h;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((s.b) it.next()).b(gVar);
                }
            }
        }

        @Override // h1.u.b
        public void c(g gVar) {
            List list = ((s) GobblerDatabase_Impl.this).f33891h;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((s.b) it.next()).a(gVar);
                }
            }
        }

        @Override // h1.u.b
        public void d(g gVar) {
            ((s) GobblerDatabase_Impl.this).f33884a = gVar;
            GobblerDatabase_Impl.this.w(gVar);
            List list = ((s) GobblerDatabase_Impl.this).f33891h;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((s.b) it.next()).c(gVar);
                }
            }
        }

        @Override // h1.u.b
        public void f(g gVar) {
            AbstractC3479b.b(gVar);
        }

        @Override // h1.u.b
        public u.c g(g gVar) {
            HashMap hashMap = new HashMap(5);
            hashMap.put("event_id", new e.a("event_id", "TEXT", true, 1, null, 1));
            hashMap.put("created_at", new e.a("created_at", "INTEGER", true, 0, null, 1));
            hashMap.put("event_bytes", new e.a("event_bytes", "BLOB", true, 0, null, 1));
            hashMap.put("sync_status", new e.a("sync_status", "TEXT", true, 0, null, 1));
            hashMap.put("request_id", new e.a("request_id", "TEXT", false, 0, null, 1));
            j1.e eVar = new j1.e("gobbler_events", hashMap, new HashSet(0), new HashSet(0));
            j1.e a10 = j1.e.a(gVar, "gobbler_events");
            if (!eVar.equals(a10)) {
                return new u.c(false, "gobbler_events(com.nextbillion.gobbler.internal.db.entity.EventEntity).\n Expected:\n" + eVar + "\n Found:\n" + a10);
            }
            HashMap hashMap2 = new HashMap(5);
            hashMap2.put("event_id", new e.a("event_id", "TEXT", true, 1, null, 1));
            hashMap2.put("created_at", new e.a("created_at", "INTEGER", true, 0, null, 1));
            hashMap2.put("event_bytes", new e.a("event_bytes", "BLOB", true, 0, null, 1));
            hashMap2.put("sync_status", new e.a("sync_status", "TEXT", true, 0, null, 1));
            hashMap2.put("request_id", new e.a("request_id", "TEXT", false, 0, null, 1));
            j1.e eVar2 = new j1.e("gobbler_logs", hashMap2, new HashSet(0), new HashSet(0));
            j1.e a11 = j1.e.a(gVar, "gobbler_logs");
            if (eVar2.equals(a11)) {
                return new u.c(true, null);
            }
            return new u.c(false, "gobbler_logs(com.nextbillion.gobbler.internal.db.entity.LogEntity).\n Expected:\n" + eVar2 + "\n Found:\n" + a11);
        }

        @Override // h1.u.b
        public void e(g gVar) {
        }
    }
}
