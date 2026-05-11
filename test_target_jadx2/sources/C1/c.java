package C1;

import android.database.Cursor;
import j1.AbstractC3479b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class c implements InterfaceC0749b {

    /* renamed from: a, reason: collision with root package name */
    private final h1.s f755a;

    /* renamed from: b, reason: collision with root package name */
    private final h1.k f756b;

    class a extends h1.k {
        a(h1.s sVar) {
            super(sVar);
        }

        @Override // h1.AbstractC3222A
        public String e() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        @Override // h1.k
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(l1.k kVar, C0748a c0748a) {
            if (c0748a.b() == null) {
                kVar.s1(1);
            } else {
                kVar.b0(1, c0748a.b());
            }
            if (c0748a.a() == null) {
                kVar.s1(2);
            } else {
                kVar.b0(2, c0748a.a());
            }
        }
    }

    public c(h1.s sVar) {
        this.f755a = sVar;
        this.f756b = new a(sVar);
    }

    public static List e() {
        return Collections.emptyList();
    }

    @Override // C1.InterfaceC0749b
    public void a(C0748a c0748a) {
        this.f755a.d();
        this.f755a.e();
        try {
            this.f756b.j(c0748a);
            this.f755a.D();
        } finally {
            this.f755a.i();
        }
    }

    @Override // C1.InterfaceC0749b
    public List b(String str) {
        h1.v c10 = h1.v.c("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            c10.s1(1);
        } else {
            c10.b0(1, str);
        }
        this.f755a.d();
        Cursor c11 = AbstractC3479b.c(this.f755a, c10, false, null);
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

    @Override // C1.InterfaceC0749b
    public boolean c(String str) {
        h1.v c10 = h1.v.c("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            c10.s1(1);
        } else {
            c10.b0(1, str);
        }
        this.f755a.d();
        boolean z10 = false;
        Cursor c11 = AbstractC3479b.c(this.f755a, c10, false, null);
        try {
            if (c11.moveToFirst()) {
                z10 = c11.getInt(0) != 0;
            }
            return z10;
        } finally {
            c11.close();
            c10.f();
        }
    }

    @Override // C1.InterfaceC0749b
    public boolean d(String str) {
        h1.v c10 = h1.v.c("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            c10.s1(1);
        } else {
            c10.b0(1, str);
        }
        this.f755a.d();
        boolean z10 = false;
        Cursor c11 = AbstractC3479b.c(this.f755a, c10, false, null);
        try {
            if (c11.moveToFirst()) {
                z10 = c11.getInt(0) != 0;
            }
            return z10;
        } finally {
            c11.close();
            c10.f();
        }
    }
}
