package L6;

import S6.a;
import S6.g;
import android.content.Context;
import com.google.android.gms.tasks.Task;

/* loaded from: classes2.dex */
public abstract class b extends g {

    /* renamed from: k, reason: collision with root package name */
    private static final a.g f5699k;

    /* renamed from: l, reason: collision with root package name */
    private static final a.AbstractC0172a f5700l;

    /* renamed from: m, reason: collision with root package name */
    private static final S6.a f5701m;

    static {
        a.g gVar = new a.g();
        f5699k = gVar;
        c cVar = new c();
        f5700l = cVar;
        f5701m = new S6.a("SmsRetriever.API", cVar, gVar);
    }

    public b(Context context) {
        super(context, f5701m, a.d.f8818Q, g.a.f8847c);
    }

    public abstract Task M();
}
