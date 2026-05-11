package com.chuckerteam.chucker.internal.data.room;

import P2.b;
import P2.c;
import P2.d;
import co.hyperverge.hypersnapsdk.utils.AppConstants;
import h1.s;
import h1.u;
import j1.AbstractC3479b;
import j1.e;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import l1.g;
import l1.h;

/* loaded from: classes.dex */
public final class ChuckerDatabase_Impl extends ChuckerDatabase {

    /* renamed from: q, reason: collision with root package name */
    private volatile c f20547q;

    /* renamed from: r, reason: collision with root package name */
    private volatile P2.a f20548r;

    @Override // com.chuckerteam.chucker.internal.data.room.ChuckerDatabase
    public c F() {
        c cVar;
        if (this.f20547q != null) {
            return this.f20547q;
        }
        synchronized (this) {
            try {
                if (this.f20547q == null) {
                    this.f20547q = new d(this);
                }
                cVar = this.f20547q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    @Override // com.chuckerteam.chucker.internal.data.room.ChuckerDatabase
    public P2.a G() {
        P2.a aVar;
        if (this.f20548r != null) {
            return this.f20548r;
        }
        synchronized (this) {
            try {
                if (this.f20548r == null) {
                    this.f20548r = new b(this);
                }
                aVar = this.f20548r;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    @Override // h1.s
    protected androidx.room.c g() {
        return new androidx.room.c(this, new HashMap(0), new HashMap(0), "throwables", "transactions");
    }

    @Override // h1.s
    protected h h(h1.h hVar) {
        return hVar.f33858c.a(h.b.a(hVar.f33856a).d(hVar.f33857b).c(new u(hVar, new a(4), "3ad896fa3ec863e554b9890fab536763", "ff9d4b6aab15b17c7fd7e9a0ef9f18c7")).b());
    }

    @Override // h1.s
    protected Map q() {
        HashMap hashMap = new HashMap();
        hashMap.put(c.class, d.h());
        hashMap.put(P2.a.class, b.m());
        return hashMap;
    }

    class a extends u.b {
        a(int i10) {
            super(i10);
        }

        @Override // h1.u.b
        public void a(g gVar) {
            gVar.Z("CREATE TABLE IF NOT EXISTS `throwables` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `tag` TEXT, `date` INTEGER, `clazz` TEXT, `message` TEXT, `content` TEXT)");
            gVar.Z("CREATE TABLE IF NOT EXISTS `transactions` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `requestDate` INTEGER, `responseDate` INTEGER, `tookMs` INTEGER, `protocol` TEXT, `method` TEXT, `url` TEXT, `host` TEXT, `path` TEXT, `scheme` TEXT, `responseTlsVersion` TEXT, `responseCipherSuite` TEXT, `requestPayloadSize` INTEGER, `requestContentType` TEXT, `requestHeaders` TEXT, `requestBody` TEXT, `isRequestBodyPlainText` INTEGER NOT NULL, `responseCode` INTEGER, `responseMessage` TEXT, `error` TEXT, `responsePayloadSize` INTEGER, `responseContentType` TEXT, `responseHeaders` TEXT, `responseBody` TEXT, `isResponseBodyPlainText` INTEGER NOT NULL, `responseImageData` BLOB)");
            gVar.Z("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            gVar.Z("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '3ad896fa3ec863e554b9890fab536763')");
        }

        @Override // h1.u.b
        public void b(g gVar) {
            gVar.Z("DROP TABLE IF EXISTS `throwables`");
            gVar.Z("DROP TABLE IF EXISTS `transactions`");
            if (((s) ChuckerDatabase_Impl.this).f33891h != null) {
                int size = ((s) ChuckerDatabase_Impl.this).f33891h.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((s.b) ((s) ChuckerDatabase_Impl.this).f33891h.get(i10)).b(gVar);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // h1.u.b
        public void c(g gVar) {
            if (((s) ChuckerDatabase_Impl.this).f33891h != null) {
                int size = ((s) ChuckerDatabase_Impl.this).f33891h.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((s.b) ((s) ChuckerDatabase_Impl.this).f33891h.get(i10)).a(gVar);
                }
            }
        }

        @Override // h1.u.b
        public void d(g gVar) {
            ((s) ChuckerDatabase_Impl.this).f33884a = gVar;
            ChuckerDatabase_Impl.this.w(gVar);
            if (((s) ChuckerDatabase_Impl.this).f33891h != null) {
                int size = ((s) ChuckerDatabase_Impl.this).f33891h.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((s.b) ((s) ChuckerDatabase_Impl.this).f33891h.get(i10)).c(gVar);
                }
            }
        }

        @Override // h1.u.b
        public void f(g gVar) {
            AbstractC3479b.b(gVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // h1.u.b
        public u.c g(g gVar) {
            HashMap hashMap = new HashMap(6);
            hashMap.put("id", new e.a("id", "INTEGER", false, 1, null, 1));
            hashMap.put("tag", new e.a("tag", "TEXT", false, 0, null, 1));
            hashMap.put("date", new e.a("date", "INTEGER", false, 0, null, 1));
            hashMap.put("clazz", new e.a("clazz", "TEXT", false, 0, null, 1));
            hashMap.put("message", new e.a("message", "TEXT", false, 0, null, 1));
            hashMap.put("content", new e.a("content", "TEXT", false, 0, null, 1));
            e eVar = new e("throwables", hashMap, new HashSet(0), new HashSet(0));
            e a10 = e.a(gVar, "throwables");
            if (!eVar.equals(a10)) {
                return new u.c(false, "throwables(com.chuckerteam.chucker.internal.data.entity.RecordedThrowable).\n Expected:\n" + eVar + "\n Found:\n" + a10);
            }
            HashMap hashMap2 = new HashMap(26);
            hashMap2.put("id", new e.a("id", "INTEGER", true, 1, null, 1));
            hashMap2.put("requestDate", new e.a("requestDate", "INTEGER", false, 0, null, 1));
            hashMap2.put("responseDate", new e.a("responseDate", "INTEGER", false, 0, null, 1));
            hashMap2.put("tookMs", new e.a("tookMs", "INTEGER", false, 0, null, 1));
            hashMap2.put("protocol", new e.a("protocol", "TEXT", false, 0, null, 1));
            hashMap2.put("method", new e.a("method", "TEXT", false, 0, null, 1));
            hashMap2.put("url", new e.a("url", "TEXT", false, 0, null, 1));
            hashMap2.put("host", new e.a("host", "TEXT", false, 0, null, 1));
            hashMap2.put("path", new e.a("path", "TEXT", false, 0, null, 1));
            hashMap2.put("scheme", new e.a("scheme", "TEXT", false, 0, null, 1));
            hashMap2.put("responseTlsVersion", new e.a("responseTlsVersion", "TEXT", false, 0, null, 1));
            hashMap2.put("responseCipherSuite", new e.a("responseCipherSuite", "TEXT", false, 0, null, 1));
            hashMap2.put("requestPayloadSize", new e.a("requestPayloadSize", "INTEGER", false, 0, null, 1));
            hashMap2.put("requestContentType", new e.a("requestContentType", "TEXT", false, 0, null, 1));
            hashMap2.put("requestHeaders", new e.a("requestHeaders", "TEXT", false, 0, null, 1));
            hashMap2.put("requestBody", new e.a("requestBody", "TEXT", false, 0, null, 1));
            hashMap2.put("isRequestBodyPlainText", new e.a("isRequestBodyPlainText", "INTEGER", true, 0, null, 1));
            hashMap2.put("responseCode", new e.a("responseCode", "INTEGER", false, 0, null, 1));
            hashMap2.put("responseMessage", new e.a("responseMessage", "TEXT", false, 0, null, 1));
            hashMap2.put(AppConstants.VIDEO_RECORDING_ERROR, new e.a(AppConstants.VIDEO_RECORDING_ERROR, "TEXT", false, 0, null, 1));
            hashMap2.put("responsePayloadSize", new e.a("responsePayloadSize", "INTEGER", false, 0, null, 1));
            hashMap2.put("responseContentType", new e.a("responseContentType", "TEXT", false, 0, null, 1));
            hashMap2.put("responseHeaders", new e.a("responseHeaders", "TEXT", false, 0, null, 1));
            hashMap2.put("responseBody", new e.a("responseBody", "TEXT", false, 0, null, 1));
            hashMap2.put("isResponseBodyPlainText", new e.a("isResponseBodyPlainText", "INTEGER", true, 0, null, 1));
            hashMap2.put("responseImageData", new e.a("responseImageData", "BLOB", false, 0, null, 1));
            e eVar2 = new e("transactions", hashMap2, new HashSet(0), new HashSet(0));
            e a11 = e.a(gVar, "transactions");
            if (eVar2.equals(a11)) {
                return new u.c(true, null);
            }
            return new u.c(false, "transactions(com.chuckerteam.chucker.internal.data.entity.HttpTransaction).\n Expected:\n" + eVar2 + "\n Found:\n" + a11);
        }

        @Override // h1.u.b
        public void e(g gVar) {
        }
    }
}
