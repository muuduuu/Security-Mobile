package Tb;

import android.R;
import android.content.Context;
import androidx.fragment.app.AbstractActivityC1577t;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import kotlin.jvm.internal.Intrinsics;
import lc.o;
import lc.p;
import p.n;
import pc.AbstractC3868b;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractActivityC1577t f9679a;

    /* renamed from: b, reason: collision with root package name */
    private Executor f9680b;

    /* renamed from: c, reason: collision with root package name */
    private n.d f9681c;

    public static final class a extends n.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.coroutines.d f9682a;

        a(kotlin.coroutines.d dVar) {
            this.f9682a = dVar;
        }

        @Override // p.n.a
        public void a(int i10, CharSequence errString) {
            Intrinsics.checkNotNullParameter(errString, "errString");
            super.a(i10, errString);
            if (i10 == 10 || i10 == 13) {
                kotlin.coroutines.d dVar = this.f9682a;
                o.a aVar = o.f37128b;
                dVar.resumeWith(o.b(p.a(new Tb.a("User canceled the authentication", null, 2, null))));
            } else {
                kotlin.coroutines.d dVar2 = this.f9682a;
                o.a aVar2 = o.f37128b;
                dVar2.resumeWith(o.b(p.a(new Tb.a("Could not authenticate the user", null, 2, null))));
            }
        }

        @Override // p.n.a
        public void c(n.b result) {
            Intrinsics.checkNotNullParameter(result, "result");
            super.c(result);
            this.f9682a.resumeWith(o.b(result));
        }
    }

    public c(AbstractActivityC1577t currentActivity, Context context, String title) {
        Intrinsics.checkNotNullParameter(currentActivity, "currentActivity");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f9679a = currentActivity;
        Executor h10 = androidx.core.content.a.h(context);
        Intrinsics.checkNotNullExpressionValue(h10, "getMainExecutor(...)");
        this.f9680b = h10;
        n.d a10 = new n.d.a().e(title).d(context.getString(R.string.cancel)).a();
        Intrinsics.checkNotNullExpressionValue(a10, "build(...)");
        this.f9681c = a10;
    }

    public final Object a(Cipher cipher, kotlin.coroutines.d dVar) {
        kotlin.coroutines.h hVar = new kotlin.coroutines.h(AbstractC3868b.c(dVar));
        new n(this.f9679a, this.f9680b, new a(hVar)).b(this.f9681c, new n.c(cipher));
        Object a10 = hVar.a();
        if (a10 == AbstractC3868b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return a10;
    }
}
