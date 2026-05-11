package T6;

import android.os.Looper;
import com.google.android.gms.common.api.internal.AbstractC2006a;

/* loaded from: classes2.dex */
public final class T extends C {

    /* renamed from: c, reason: collision with root package name */
    private final S6.g f9384c;

    public T(S6.g gVar) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f9384c = gVar;
    }

    @Override // S6.h
    public final AbstractC2006a g(AbstractC2006a abstractC2006a) {
        return this.f9384c.v(abstractC2006a);
    }

    @Override // S6.h
    public final AbstractC2006a h(AbstractC2006a abstractC2006a) {
        return this.f9384c.z(abstractC2006a);
    }

    @Override // S6.h
    public final Looper k() {
        return this.f9384c.G();
    }
}
