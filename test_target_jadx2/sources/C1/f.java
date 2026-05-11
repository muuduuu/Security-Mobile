package C1;

import android.database.Cursor;
import j1.AbstractC3479b;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    private final h1.s f760a;

    /* renamed from: b, reason: collision with root package name */
    private final h1.k f761b;

    class a extends h1.k {
        a(h1.s sVar) {
            super(sVar);
        }

        @Override // h1.AbstractC3222A
        public String e() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        @Override // h1.k
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(l1.k kVar, d dVar) {
            if (dVar.a() == null) {
                kVar.s1(1);
            } else {
                kVar.b0(1, dVar.a());
            }
            if (dVar.b() == null) {
                kVar.s1(2);
            } else {
                kVar.G0(2, dVar.b().longValue());
            }
        }
    }

    public f(h1.s sVar) {
        this.f760a = sVar;
        this.f761b = new a(sVar);
    }

    public static List c() {
        return Collections.emptyList();
    }

    @Override // C1.e
    public void a(d dVar) {
        this.f760a.d();
        this.f760a.e();
        try {
            this.f761b.j(dVar);
            this.f760a.D();
        } finally {
            this.f760a.i();
        }
    }

    @Override // C1.e
    public Long b(String str) {
        h1.v c10 = h1.v.c("SELECT long_value FROM Preference where `key`=?", 1);
        if (str == null) {
            c10.s1(1);
        } else {
            c10.b0(1, str);
        }
        this.f760a.d();
        Long l10 = null;
        Cursor c11 = AbstractC3479b.c(this.f760a, c10, false, null);
        try {
            if (c11.moveToFirst() && !c11.isNull(0)) {
                l10 = Long.valueOf(c11.getLong(0));
            }
            return l10;
        } finally {
            c11.close();
            c10.f();
        }
    }
}
