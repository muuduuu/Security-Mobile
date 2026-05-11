package D1;

import androidx.work.impl.P;
import java.util.List;

/* loaded from: classes.dex */
public abstract class u implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final androidx.work.impl.utils.futures.c f1163a = androidx.work.impl.utils.futures.c.t();

    class a extends u {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ P f1164b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f1165c;

        a(P p10, String str) {
            this.f1164b = p10;
            this.f1165c = str;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // D1.u
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public List c() {
            return (List) C1.u.f789z.apply(this.f1164b.s().K().z(this.f1165c));
        }
    }

    public static u a(P p10, String str) {
        return new a(p10, str);
    }

    public h8.d b() {
        return this.f1163a;
    }

    abstract Object c();

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f1163a.p(c());
        } catch (Throwable th) {
            this.f1163a.q(th);
        }
    }
}
