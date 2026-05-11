package K5;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Member;

/* renamed from: K5.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0928i extends AbstractC0921b implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    protected final transient G f5395a;

    /* renamed from: b, reason: collision with root package name */
    protected final transient p f5396b;

    protected AbstractC0928i(G g10, p pVar) {
        this.f5395a = g10;
        this.f5396b = pVar;
    }

    @Override // K5.AbstractC0921b
    public final Annotation b(Class cls) {
        p pVar = this.f5396b;
        if (pVar == null) {
            return null;
        }
        return pVar.a(cls);
    }

    @Override // K5.AbstractC0921b
    public final boolean f(Class cls) {
        p pVar = this.f5396b;
        if (pVar == null) {
            return false;
        }
        return pVar.b(cls);
    }

    @Override // K5.AbstractC0921b
    public boolean g(Class[] clsArr) {
        p pVar = this.f5396b;
        if (pVar == null) {
            return false;
        }
        return pVar.c(clsArr);
    }

    public final void h(boolean z10) {
        Member l10 = l();
        if (l10 != null) {
            T5.f.g(l10, z10);
        }
    }

    public p i() {
        return this.f5396b;
    }

    public abstract Class j();

    public String k() {
        return j().getName() + "#" + c();
    }

    public abstract Member l();

    public abstract Object m(Object obj);

    public abstract AbstractC0921b n(p pVar);
}
