package androidx.work;

import android.content.Context;
import androidx.work.a;
import java.util.Collections;
import java.util.List;
import o1.InterfaceC3739a;
import x1.AbstractC5094A;
import x1.n;

/* loaded from: classes.dex */
public final class WorkManagerInitializer implements InterfaceC3739a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f18093a = n.i("WrkMgrInitializer");

    @Override // o1.InterfaceC3739a
    public List a() {
        return Collections.emptyList();
    }

    @Override // o1.InterfaceC3739a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public AbstractC5094A b(Context context) {
        n.e().a(f18093a, "Initializing WorkManager with default configuration.");
        AbstractC5094A.h(context, new a.C0311a().a());
        return AbstractC5094A.f(context);
    }
}
