package C1;

import android.database.Cursor;
import j1.AbstractC3479b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class p implements o {

    /* renamed from: a, reason: collision with root package name */
    private final h1.s f777a;

    /* renamed from: b, reason: collision with root package name */
    private final h1.k f778b;

    class a extends h1.k {
        a(h1.s sVar) {
            super(sVar);
        }

        @Override // h1.AbstractC3222A
        public String e() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // h1.k
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(l1.k kVar, n nVar) {
            if (nVar.a() == null) {
                kVar.s1(1);
            } else {
                kVar.b0(1, nVar.a());
            }
            if (nVar.b() == null) {
                kVar.s1(2);
            } else {
                kVar.b0(2, nVar.b());
            }
        }
    }

    public p(h1.s sVar) {
        this.f777a = sVar;
        this.f778b = new a(sVar);
    }

    public static List c() {
        return Collections.emptyList();
    }

    @Override // C1.o
    public void a(n nVar) {
        this.f777a.d();
        this.f777a.e();
        try {
            this.f778b.j(nVar);
            this.f777a.D();
        } finally {
            this.f777a.i();
        }
    }

    @Override // C1.o
    public List b(String str) {
        h1.v c10 = h1.v.c("SELECT name FROM workname WHERE work_spec_id=?", 1);
        if (str == null) {
            c10.s1(1);
        } else {
            c10.b0(1, str);
        }
        this.f777a.d();
        Cursor c11 = AbstractC3479b.c(this.f777a, c10, false, null);
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
}
