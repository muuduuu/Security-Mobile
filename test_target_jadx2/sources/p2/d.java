package P2;

import android.database.Cursor;
import androidx.lifecycle.AbstractC1604v;
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

/* loaded from: classes.dex */
public final class d implements P2.c {

    /* renamed from: a, reason: collision with root package name */
    private final s f7454a;

    /* renamed from: b, reason: collision with root package name */
    private final k f7455b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC3222A f7456c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC3222A f7457d;

    class a extends k {
        a(s sVar) {
            super(sVar);
        }

        @Override // h1.AbstractC3222A
        public String e() {
            return "INSERT OR ABORT INTO `throwables` (`id`,`tag`,`date`,`clazz`,`message`,`content`) VALUES (?,?,?,?,?,?)";
        }

        @Override // h1.k
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(l1.k kVar, com.chuckerteam.chucker.internal.data.entity.c cVar) {
            if (cVar.d() == null) {
                kVar.s1(1);
            } else {
                kVar.G0(1, cVar.d().longValue());
            }
            if (cVar.f() == null) {
                kVar.s1(2);
            } else {
                kVar.b0(2, cVar.f());
            }
            if (cVar.c() == null) {
                kVar.s1(3);
            } else {
                kVar.G0(3, cVar.c().longValue());
            }
            if (cVar.a() == null) {
                kVar.s1(4);
            } else {
                kVar.b0(4, cVar.a());
            }
            if (cVar.e() == null) {
                kVar.s1(5);
            } else {
                kVar.b0(5, cVar.e());
            }
            if (cVar.b() == null) {
                kVar.s1(6);
            } else {
                kVar.b0(6, cVar.b());
            }
        }
    }

    class b extends AbstractC3222A {
        b(s sVar) {
            super(sVar);
        }

        @Override // h1.AbstractC3222A
        public String e() {
            return "DELETE FROM throwables";
        }
    }

    class c extends AbstractC3222A {
        c(s sVar) {
            super(sVar);
        }

        @Override // h1.AbstractC3222A
        public String e() {
            return "DELETE FROM throwables WHERE date <= ?";
        }
    }

    /* renamed from: P2.d$d, reason: collision with other inner class name */
    class CallableC0144d implements Callable {
        CallableC0144d() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit call() {
            l1.k b10 = d.this.f7456c.b();
            d.this.f7454a.e();
            try {
                b10.j0();
                d.this.f7454a.D();
                return Unit.f36324a;
            } finally {
                d.this.f7454a.i();
                d.this.f7456c.h(b10);
            }
        }
    }

    class e implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f7462a;

        e(long j10) {
            this.f7462a = j10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit call() {
            l1.k b10 = d.this.f7457d.b();
            b10.G0(1, this.f7462a);
            d.this.f7454a.e();
            try {
                b10.j0();
                d.this.f7454a.D();
                return Unit.f36324a;
            } finally {
                d.this.f7454a.i();
                d.this.f7457d.h(b10);
            }
        }
    }

    class f implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ v f7464a;

        f(v vVar) {
            this.f7464a = vVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            Cursor c10 = AbstractC3479b.c(d.this.f7454a, this.f7464a, false, null);
            try {
                int e10 = AbstractC3478a.e(c10, "id");
                int e11 = AbstractC3478a.e(c10, "tag");
                int e12 = AbstractC3478a.e(c10, "date");
                int e13 = AbstractC3478a.e(c10, "clazz");
                int e14 = AbstractC3478a.e(c10, "message");
                ArrayList arrayList = new ArrayList(c10.getCount());
                while (c10.moveToNext()) {
                    arrayList.add(new com.chuckerteam.chucker.internal.data.entity.d(c10.isNull(e10) ? null : Long.valueOf(c10.getLong(e10)), c10.isNull(e11) ? null : c10.getString(e11), c10.isNull(e12) ? null : Long.valueOf(c10.getLong(e12)), c10.isNull(e13) ? null : c10.getString(e13), c10.isNull(e14) ? null : c10.getString(e14)));
                }
                return arrayList;
            } finally {
                c10.close();
            }
        }

        protected void finalize() {
            this.f7464a.f();
        }
    }

    class g implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ v f7466a;

        g(v vVar) {
            this.f7466a = vVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.chuckerteam.chucker.internal.data.entity.c call() {
            com.chuckerteam.chucker.internal.data.entity.c cVar = null;
            Cursor c10 = AbstractC3479b.c(d.this.f7454a, this.f7466a, false, null);
            try {
                int e10 = AbstractC3478a.e(c10, "id");
                int e11 = AbstractC3478a.e(c10, "tag");
                int e12 = AbstractC3478a.e(c10, "date");
                int e13 = AbstractC3478a.e(c10, "clazz");
                int e14 = AbstractC3478a.e(c10, "message");
                int e15 = AbstractC3478a.e(c10, "content");
                if (c10.moveToFirst()) {
                    cVar = new com.chuckerteam.chucker.internal.data.entity.c(c10.isNull(e10) ? null : Long.valueOf(c10.getLong(e10)), c10.isNull(e11) ? null : c10.getString(e11), c10.isNull(e12) ? null : Long.valueOf(c10.getLong(e12)), c10.isNull(e13) ? null : c10.getString(e13), c10.isNull(e14) ? null : c10.getString(e14), c10.isNull(e15) ? null : c10.getString(e15));
                }
                return cVar;
            } finally {
                c10.close();
            }
        }

        protected void finalize() {
            this.f7466a.f();
        }
    }

    public d(s sVar) {
        this.f7454a = sVar;
        this.f7455b = new a(sVar);
        this.f7456c = new b(sVar);
        this.f7457d = new c(sVar);
    }

    public static List h() {
        return Collections.emptyList();
    }

    @Override // P2.c
    public AbstractC1604v a(long j10) {
        v c10 = v.c("SELECT * FROM throwables WHERE id = ?", 1);
        c10.G0(1, j10);
        return this.f7454a.m().e(new String[]{"throwables"}, false, new g(c10));
    }

    @Override // P2.c
    public Object b(kotlin.coroutines.d dVar) {
        return h1.f.b(this.f7454a, true, new CallableC0144d(), dVar);
    }

    @Override // P2.c
    public Object c(long j10, kotlin.coroutines.d dVar) {
        return h1.f.b(this.f7454a, true, new e(j10), dVar);
    }

    @Override // P2.c
    public AbstractC1604v d() {
        return this.f7454a.m().e(new String[]{"throwables"}, false, new f(v.c("SELECT id,tag,date,clazz,message FROM throwables ORDER BY date DESC", 0)));
    }
}
