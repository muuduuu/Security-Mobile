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
public final class e implements x9.d {

    /* renamed from: a, reason: collision with root package name */
    private final s f44914a;

    /* renamed from: b, reason: collision with root package name */
    private final k f44915b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC3222A f44916c;

    class a extends k {
        a(s sVar) {
            super(sVar);
        }

        @Override // h1.AbstractC3222A
        protected String e() {
            return "INSERT OR REPLACE INTO `gobbler_logs` (`event_id`,`created_at`,`event_bytes`,`sync_status`,`request_id`) VALUES (?,?,?,?,?)";
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
            return "DELETE FROM gobbler_logs WHERE request_id == ?";
        }
    }

    class c implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C5180a f44919a;

        c(C5180a c5180a) {
            this.f44919a = c5180a;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit call() {
            e.this.f44914a.e();
            try {
                e.this.f44915b.j(this.f44919a);
                e.this.f44914a.D();
                return Unit.f36324a;
            } finally {
                e.this.f44914a.i();
            }
        }
    }

    class d implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f44921a;

        d(String str) {
            this.f44921a = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit call() {
            l1.k b10 = e.this.f44916c.b();
            String str = this.f44921a;
            if (str == null) {
                b10.s1(1);
            } else {
                b10.b0(1, str);
            }
            try {
                e.this.f44914a.e();
                try {
                    b10.j0();
                    e.this.f44914a.D();
                    return Unit.f36324a;
                } finally {
                    e.this.f44914a.i();
                }
            } finally {
                e.this.f44916c.h(b10);
            }
        }
    }

    /* renamed from: x9.e$e, reason: collision with other inner class name */
    class CallableC0656e implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ v f44923a;

        CallableC0656e(v vVar) {
            this.f44923a = vVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer call() {
            Integer num = null;
            Cursor c10 = AbstractC3479b.c(e.this.f44914a, this.f44923a, false, null);
            try {
                if (c10.moveToFirst() && !c10.isNull(0)) {
                    num = Integer.valueOf(c10.getInt(0));
                }
                return num;
            } finally {
                c10.close();
                this.f44923a.f();
            }
        }
    }

    class f implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ v f44925a;

        f(v vVar) {
            this.f44925a = vVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            Cursor c10 = AbstractC3479b.c(e.this.f44914a, this.f44925a, false, null);
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
                this.f44925a.f();
            }
        }
    }

    class g implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f44927a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f44928b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f44929c;

        g(List list, String str, String str2) {
            this.f44927a = list;
            this.f44928b = str;
            this.f44929c = str2;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit call() {
            StringBuilder b10 = j1.d.b();
            b10.append("UPDATE gobbler_logs SET sync_status = ");
            b10.append("?");
            b10.append(", request_id = ");
            b10.append("?");
            b10.append(" WHERE event_id IN (");
            j1.d.a(b10, this.f44927a.size());
            b10.append(")");
            l1.k f10 = e.this.f44914a.f(b10.toString());
            String str = this.f44928b;
            if (str == null) {
                f10.s1(1);
            } else {
                f10.b0(1, str);
            }
            String str2 = this.f44929c;
            if (str2 == null) {
                f10.s1(2);
            } else {
                f10.b0(2, str2);
            }
            int i10 = 3;
            for (String str3 : this.f44927a) {
                if (str3 == null) {
                    f10.s1(i10);
                } else {
                    f10.b0(i10, str3);
                }
                i10++;
            }
            e.this.f44914a.e();
            try {
                f10.j0();
                e.this.f44914a.D();
                return Unit.f36324a;
            } finally {
                e.this.f44914a.i();
            }
        }
    }

    public e(s sVar) {
        this.f44914a = sVar;
        this.f44915b = new a(sVar);
        this.f44916c = new b(sVar);
    }

    public static List i() {
        return Collections.emptyList();
    }

    @Override // x9.InterfaceC5137a
    public Object a(String str, kotlin.coroutines.d dVar) {
        return h1.f.b(this.f44914a, true, new d(str), dVar);
    }

    @Override // x9.InterfaceC5137a
    public Object b(String str, String str2, List list, kotlin.coroutines.d dVar) {
        return h1.f.b(this.f44914a, true, new g(list, str2, str), dVar);
    }

    @Override // x9.InterfaceC5137a
    public Object c(String str, kotlin.coroutines.d dVar) {
        v c10 = v.c("SELECT COUNT(*) FROM gobbler_logs WHERE sync_status = ?", 1);
        if (str == null) {
            c10.s1(1);
        } else {
            c10.b0(1, str);
        }
        return h1.f.a(this.f44914a, false, AbstractC3479b.a(), new CallableC0656e(c10), dVar);
    }

    @Override // x9.InterfaceC5137a
    public Object d(String str, int i10, kotlin.coroutines.d dVar) {
        v c10 = v.c("SELECT * FROM gobbler_logs WHERE sync_status = ? ORDER BY created_at ASC LIMIT ?", 2);
        if (str == null) {
            c10.s1(1);
        } else {
            c10.b0(1, str);
        }
        c10.G0(2, i10);
        return h1.f.a(this.f44914a, false, AbstractC3479b.a(), new f(c10), dVar);
    }

    @Override // x9.InterfaceC5137a
    public Object e(C5180a c5180a, kotlin.coroutines.d dVar) {
        return h1.f.b(this.f44914a, true, new c(c5180a), dVar);
    }
}
