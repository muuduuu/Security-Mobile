package D1;

import C1.InterfaceC0749b;
import androidx.work.impl.C1631q;
import androidx.work.impl.InterfaceC1636w;
import androidx.work.impl.P;
import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.UUID;
import x1.r;
import x1.z;

/* renamed from: D1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC0772b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final C1631q f1137a = new C1631q();

    /* renamed from: D1.b$a */
    class a extends AbstractRunnableC0772b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ P f1138b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ UUID f1139c;

        a(P p10, UUID uuid) {
            this.f1138b = p10;
            this.f1139c = uuid;
        }

        @Override // D1.AbstractRunnableC0772b
        void g() {
            WorkDatabase s10 = this.f1138b.s();
            s10.e();
            try {
                a(this.f1138b, this.f1139c.toString());
                s10.D();
                s10.i();
                f(this.f1138b);
            } catch (Throwable th) {
                s10.i();
                throw th;
            }
        }
    }

    /* renamed from: D1.b$b, reason: collision with other inner class name */
    class C0020b extends AbstractRunnableC0772b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ P f1140b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f1141c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f1142d;

        C0020b(P p10, String str, boolean z10) {
            this.f1140b = p10;
            this.f1141c = str;
            this.f1142d = z10;
        }

        @Override // D1.AbstractRunnableC0772b
        void g() {
            WorkDatabase s10 = this.f1140b.s();
            s10.e();
            try {
                Iterator it = s10.K().p(this.f1141c).iterator();
                while (it.hasNext()) {
                    a(this.f1140b, (String) it.next());
                }
                s10.D();
                s10.i();
                if (this.f1142d) {
                    f(this.f1140b);
                }
            } catch (Throwable th) {
                s10.i();
                throw th;
            }
        }
    }

    public static AbstractRunnableC0772b b(UUID uuid, P p10) {
        return new a(p10, uuid);
    }

    public static AbstractRunnableC0772b c(String str, P p10, boolean z10) {
        return new C0020b(p10, str, z10);
    }

    private void e(WorkDatabase workDatabase, String str) {
        C1.v K10 = workDatabase.K();
        InterfaceC0749b F10 = workDatabase.F();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            z.c r10 = K10.r(str2);
            if (r10 != z.c.SUCCEEDED && r10 != z.c.FAILED) {
                K10.u(str2);
            }
            linkedList.addAll(F10.b(str2));
        }
    }

    void a(P p10, String str) {
        e(p10.s(), str);
        p10.p().t(str, 1);
        Iterator it = p10.q().iterator();
        while (it.hasNext()) {
            ((InterfaceC1636w) it.next()).c(str);
        }
    }

    public x1.r d() {
        return this.f1137a;
    }

    void f(P p10) {
        androidx.work.impl.z.h(p10.l(), p10.s(), p10.q());
    }

    abstract void g();

    @Override // java.lang.Runnable
    public void run() {
        try {
            g();
            this.f1137a.a(x1.r.f44711a);
        } catch (Throwable th) {
            this.f1137a.a(new r.b.a(th));
        }
    }
}
