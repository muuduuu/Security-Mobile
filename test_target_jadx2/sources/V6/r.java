package V6;

import D7.C0787k;
import com.google.android.gms.tasks.Task;

/* loaded from: classes2.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    private static final U f11006a = new Q();

    public interface a {
        Object a(S6.o oVar);
    }

    public static Task a(S6.k kVar, a aVar) {
        U u10 = f11006a;
        C0787k c0787k = new C0787k();
        kVar.c(new S(kVar, c0787k, aVar, u10));
        return c0787k.a();
    }

    public static Task b(S6.k kVar) {
        return a(kVar, new T());
    }
}
