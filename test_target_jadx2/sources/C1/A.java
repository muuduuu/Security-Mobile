package C1;

import C1.z;
import android.database.Cursor;
import h1.AbstractC3222A;
import j1.AbstractC3479b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class A implements z {

    /* renamed from: a, reason: collision with root package name */
    private final h1.s f743a;

    /* renamed from: b, reason: collision with root package name */
    private final h1.k f744b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC3222A f745c;

    class a extends h1.k {
        a(h1.s sVar) {
            super(sVar);
        }

        @Override // h1.AbstractC3222A
        public String e() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // h1.k
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(l1.k kVar, y yVar) {
            if (yVar.a() == null) {
                kVar.s1(1);
            } else {
                kVar.b0(1, yVar.a());
            }
            if (yVar.b() == null) {
                kVar.s1(2);
            } else {
                kVar.b0(2, yVar.b());
            }
        }
    }

    class b extends AbstractC3222A {
        b(h1.s sVar) {
            super(sVar);
        }

        @Override // h1.AbstractC3222A
        public String e() {
            return "DELETE FROM worktag WHERE work_spec_id=?";
        }
    }

    public A(h1.s sVar) {
        this.f743a = sVar;
        this.f744b = new a(sVar);
        this.f745c = new b(sVar);
    }

    public static List f() {
        return Collections.emptyList();
    }

    @Override // C1.z
    public void a(y yVar) {
        this.f743a.d();
        this.f743a.e();
        try {
            this.f744b.j(yVar);
            this.f743a.D();
        } finally {
            this.f743a.i();
        }
    }

    @Override // C1.z
    public List b(String str) {
        h1.v c10 = h1.v.c("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            c10.s1(1);
        } else {
            c10.b0(1, str);
        }
        this.f743a.d();
        Cursor c11 = AbstractC3479b.c(this.f743a, c10, false, null);
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

    @Override // C1.z
    public void c(String str, Set set) {
        z.a.a(this, str, set);
    }

    @Override // C1.z
    public void d(String str) {
        this.f743a.d();
        l1.k b10 = this.f745c.b();
        if (str == null) {
            b10.s1(1);
        } else {
            b10.b0(1, str);
        }
        this.f743a.e();
        try {
            b10.j0();
            this.f743a.D();
        } finally {
            this.f743a.i();
            this.f745c.h(b10);
        }
    }
}
