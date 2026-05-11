package x9;

import android.database.Cursor;
import h1.AbstractC3222A;
import h1.k;
import h1.s;
import h1.v;
import j1.AbstractC3478a;
import j1.AbstractC3479b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import y9.C5180a;

/* loaded from: classes2.dex */
public final class c implements x9.b {

    /* renamed from: a, reason: collision with root package name */
    private final s f44897a;

    /* renamed from: b, reason: collision with root package name */
    private final k f44898b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC3222A f44899c;

    class a extends k {
        a(s sVar) {
            super(sVar);
        }

        @Override // h1.AbstractC3222A
        protected String e() {
            return "INSERT OR REPLACE INTO `gobbler_events` (`event_id`,`created_at`,`event_bytes`,`sync_status`,`request_id`) VALUES (?,?,?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // h1.k
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(l1.k kVar, C5180a c5180a) {
            if (c5180a.c() == null) {
                kVar.s1(1);
            } else {
                kVar.b0(1, c5180a.c());
            }
            kVar.G0(2, c5180a.a());
            if (c5180a.b() == null) {
                kVar.s1(3);
            } else {
                kVar.P0(3, c5180a.b());
            }
            if (c5180a.e() == null) {
                kVar.s1(4);
            } else {
                kVar.b0(4, c5180a.e());
            }
            if (c5180a.d() == null) {
                kVar.s1(5);
            } else {
                kVar.b0(5, c5180a.d());
            }
        }
    }

    class b extends AbstractC3222A {
        b(s sVar) {
            super(sVar);
        }

        @Override // h1.AbstractC3222A
        public String e() {
            return "DELETE FROM gobbler_events WHERE request_id == ?";
        }
    }

    /* renamed from: x9.c$c, reason: collision with other inner class name */
    class CallableC0655c implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C5180a f44902a;

        CallableC0655c(C5180a c5180a) {
            this.f44902a = c5180a;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit call() {
            c.this.f44897a.e();
            try {
                c.this.f44898b.j(this.f44902a);
                c.this.f44897a.D();
                return Unit.f36324a;
            } finally {
                c.this.f44897a.i();
            }
        }
    }

    class d implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f44904a;

        d(String str) {
            this.f44904a = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit call() {
            l1.k b10 = c.this.f44899c.b();
            String str = this.f44904a;
            if (str == null) {
                b10.s1(1);
            } else {
                b10.b0(1, str);
            }
            try {
                c.this.f44897a.e();
                try {
                    b10.j0();
                    c.this.f44897a.D();
                    return Unit.f36324a;
                } finally {
                    c.this.f44897a.i();
                }
            } finally {
                c.this.f44899c.h(b10);
            }
        }
    }

    class e implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ v f44906a;

        e(v vVar) {
            this.f44906a = vVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer call() {
            Integer num = null;
            Cursor c10 = AbstractC3479b.c(c.this.f44897a, this.f44906a, false, null);
            try {
                if (c10.moveToFirst() && !c10.isNull(0)) {
                    num = Integer.valueOf(c10.getInt(0));
                }
                return num;
            } finally {
                c10.close();
                this.f44906a.f();
            }
        }
    }

    class f implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ v f44908a;

        f(v vVar) {
            this.f44908a = vVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            Cursor c10 = AbstractC3479b.c(c.this.f44897a, this.f44908a, false, null);
            try {
                int e10 = AbstractC3478a.e(c10, "event_id");
                int e11 = AbstractC3478a.e(c10, "created_at");
                int e12 = AbstractC3478a.e(c10, "event_bytes");
                int e13 = AbstractC3478a.e(c10, "sync_status");
                int e14 = AbstractC3478a.e(c10, "request_id");
                ArrayList arrayList = new ArrayList(c10.getCount());
                while (c10.moveToNext()) {
                    arrayList.add(new C5180a(c10.isNull(e10) ? null : c10.getString(e10), c10.getLong(e11), c10.isNull(e12) ? null : c10.getBlob(e12), c10.isNull(e13) ? null : c10.getString(e13), c10.isNull(e14) ? null : c10.getString(e14)));
                }
                return arrayList;
            } finally {
                c10.close();
                this.f44908a.f();
            }
        }
    }

    class g implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f44910a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f44911b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f44912c;

        g(List list, String str, String str2) {
            this.f44910a = list;
            this.f44911b = str;
            this.f44912c = str2;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit call() {
            StringBuilder b10 = j1.d.b();
            b10.append("UPDATE gobbler_events SET sync_status = ");
            b10.append("?");
            b10.append(", request_id = ");
            b10.append("?");
            b10.append(" WHERE event_id IN (");
            j1.d.a(b10, this.f44910a.size());
            b10.append(")");
            l1.k f10 = c.this.f44897a.f(b10.toString());
            String str = this.f44911b;
            if (str == null) {
                f10.s1(1);
            } else {
                f10.b0(1, str);
            }
            String str2 = this.f44912c;
            if (str2 == null) {
                f10.s1(2);
            } else {
                f10.b0(2, str2);
            }
            int i10 = 3;
            for (String str3 : this.f44910a) {
                if (str3 == null) {
                    f10.s1(i10);
                } else {
                    f10.b0(i10, str3);
                }
                i10++;
            }
            c.this.f44897a.e();
            try {
                f10.j0();
                c.this.f44897a.D();
                return Unit.f36324a;
            } finally {
                c.this.f44897a.i();
            }
        }
    }

    public c(s sVar) {
        this.f44897a = sVar;
        this.f44898b = new a(sVar);
        this.f44899c = new b(sVar);
    }

    public static List i() {
        return Collections.emptyList();
    }

    @Override // x9.InterfaceC5137a
    public Object a(String str, kotlin.coroutines.d dVar) {
        return h1.f.b(this.f44897a, true, new d(str), dVar);
    }

    @Override // x9.InterfaceC5137a
    public Object b(String str, String str2, List list, kotlin.coroutines.d dVar) {
        return h1.f.b(this.f44897a, true, new g(list, str2, str), dVar);
    }

    @Override // x9.InterfaceC5137a
    public Object c(String str, kotlin.coroutines.d dVar) {
        v c10 = v.c("SELECT COUNT(*) FROM gobbler_events WHERE sync_status = ?", 1);
        if (str == null) {
            c10.s1(1);
        } else {
            c10.b0(1, str);
        }
        return h1.f.a(this.f44897a, false, AbstractC3479b.a(), new e(c10), dVar);
    }

    @Override // x9.InterfaceC5137a
    public Object d(String str, int i10, kotlin.coroutines.d dVar) {
        v c10 = v.c("SELECT * FROM gobbler_events WHERE sync_status = ? ORDER BY created_at ASC LIMIT ?", 2);
        if (str == null) {
            c10.s1(1);
        } else {
            c10.b0(1, str);
        }
        c10.G0(2, i10);
        return h1.f.a(this.f44897a, false, AbstractC3479b.a(), new f(c10), dVar);
    }

    @Override // x9.InterfaceC5137a
    public Object e(C5180a c5180a, kotlin.coroutines.d dVar) {
        return h1.f.b(this.f44897a, true, new CallableC0655c(c5180a), dVar);
    }
}
