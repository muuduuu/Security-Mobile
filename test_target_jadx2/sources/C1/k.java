package C1;

import C1.j;
import android.database.Cursor;
import h1.AbstractC3222A;
import j1.AbstractC3478a;
import j1.AbstractC3479b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class k implements j {

    /* renamed from: a, reason: collision with root package name */
    private final h1.s f766a;

    /* renamed from: b, reason: collision with root package name */
    private final h1.k f767b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC3222A f768c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC3222A f769d;

    class a extends h1.k {
        a(h1.s sVar) {
            super(sVar);
        }

        @Override // h1.AbstractC3222A
        public String e() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
        }

        @Override // h1.k
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(l1.k kVar, i iVar) {
            String str = iVar.f763a;
            if (str == null) {
                kVar.s1(1);
            } else {
                kVar.b0(1, str);
            }
            kVar.G0(2, iVar.a());
            kVar.G0(3, iVar.f765c);
        }
    }

    class b extends AbstractC3222A {
        b(h1.s sVar) {
            super(sVar);
        }

        @Override // h1.AbstractC3222A
        public String e() {
            return "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?";
        }
    }

    class c extends AbstractC3222A {
        c(h1.s sVar) {
            super(sVar);
        }

        @Override // h1.AbstractC3222A
        public String e() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public k(h1.s sVar) {
        this.f766a = sVar;
        this.f767b = new a(sVar);
        this.f768c = new b(sVar);
        this.f769d = new c(sVar);
    }

    public static List j() {
        return Collections.emptyList();
    }

    @Override // C1.j
    public List a() {
        h1.v c10 = h1.v.c("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.f766a.d();
        Cursor c11 = AbstractC3479b.c(this.f766a, c10, false, null);
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

    @Override // C1.j
    public void b(i iVar) {
        this.f766a.d();
        this.f766a.e();
        try {
            this.f767b.j(iVar);
            this.f766a.D();
        } finally {
            this.f766a.i();
        }
    }

    @Override // C1.j
    public i e(m mVar) {
        return j.a.a(this, mVar);
    }

    @Override // C1.j
    public void f(String str, int i10) {
        this.f766a.d();
        l1.k b10 = this.f768c.b();
        if (str == null) {
            b10.s1(1);
        } else {
            b10.b0(1, str);
        }
        b10.G0(2, i10);
        this.f766a.e();
        try {
            b10.j0();
            this.f766a.D();
        } finally {
            this.f766a.i();
            this.f768c.h(b10);
        }
    }

    @Override // C1.j
    public void g(m mVar) {
        j.a.b(this, mVar);
    }

    @Override // C1.j
    public void h(String str) {
        this.f766a.d();
        l1.k b10 = this.f769d.b();
        if (str == null) {
            b10.s1(1);
        } else {
            b10.b0(1, str);
        }
        this.f766a.e();
        try {
            b10.j0();
            this.f766a.D();
        } finally {
            this.f766a.i();
            this.f769d.h(b10);
        }
    }

    @Override // C1.j
    public i i(String str, int i10) {
        h1.v c10 = h1.v.c("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?", 2);
        if (str == null) {
            c10.s1(1);
        } else {
            c10.b0(1, str);
        }
        c10.G0(2, i10);
        this.f766a.d();
        i iVar = null;
        String string = null;
        Cursor c11 = AbstractC3479b.c(this.f766a, c10, false, null);
        try {
            int e10 = AbstractC3478a.e(c11, "work_spec_id");
            int e11 = AbstractC3478a.e(c11, "generation");
            int e12 = AbstractC3478a.e(c11, "system_id");
            if (c11.moveToFirst()) {
                if (!c11.isNull(e10)) {
                    string = c11.getString(e10);
                }
                iVar = new i(string, c11.getInt(e11), c11.getInt(e12));
            }
            return iVar;
        } finally {
            c11.close();
            c10.f();
        }
    }
}
