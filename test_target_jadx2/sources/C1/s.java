package C1;

import h1.AbstractC3222A;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class s implements r {

    /* renamed from: a, reason: collision with root package name */
    private final h1.s f780a;

    /* renamed from: b, reason: collision with root package name */
    private final h1.k f781b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC3222A f782c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC3222A f783d;

    class a extends h1.k {
        a(h1.s sVar) {
            super(sVar);
        }

        @Override // h1.AbstractC3222A
        public String e() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        @Override // h1.k
        public /* bridge */ /* synthetic */ void i(l1.k kVar, Object obj) {
            android.support.v4.media.session.b.a(obj);
            l(kVar, null);
        }

        public void l(l1.k kVar, q qVar) {
            throw null;
        }
    }

    class b extends AbstractC3222A {
        b(h1.s sVar) {
            super(sVar);
        }

        @Override // h1.AbstractC3222A
        public String e() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    class c extends AbstractC3222A {
        c(h1.s sVar) {
            super(sVar);
        }

        @Override // h1.AbstractC3222A
        public String e() {
            return "DELETE FROM WorkProgress";
        }
    }

    public s(h1.s sVar) {
        this.f780a = sVar;
        this.f781b = new a(sVar);
        this.f782c = new b(sVar);
        this.f783d = new c(sVar);
    }

    public static List c() {
        return Collections.emptyList();
    }

    @Override // C1.r
    public void a(String str) {
        this.f780a.d();
        l1.k b10 = this.f782c.b();
        if (str == null) {
            b10.s1(1);
        } else {
            b10.b0(1, str);
        }
        this.f780a.e();
        try {
            b10.j0();
            this.f780a.D();
        } finally {
            this.f780a.i();
            this.f782c.h(b10);
        }
    }

    @Override // C1.r
    public void b() {
        this.f780a.d();
        l1.k b10 = this.f783d.b();
        this.f780a.e();
        try {
            b10.j0();
            this.f780a.D();
        } finally {
            this.f780a.i();
            this.f783d.h(b10);
        }
    }
}
