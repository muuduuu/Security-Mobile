package kotlin.coroutines;

import java.io.Serializable;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;
import xc.m;

/* loaded from: classes.dex */
public final class c implements CoroutineContext, Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final CoroutineContext f36367a;

    /* renamed from: b, reason: collision with root package name */
    private final CoroutineContext.Element f36368b;

    static final class a extends m implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f36369a = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String acc, CoroutineContext.Element element) {
            Intrinsics.checkNotNullParameter(acc, "acc");
            Intrinsics.checkNotNullParameter(element, "element");
            if (acc.length() == 0) {
                return element.toString();
            }
            return acc + ", " + element;
        }
    }

    public c(CoroutineContext left, CoroutineContext.Element element) {
        Intrinsics.checkNotNullParameter(left, "left");
        Intrinsics.checkNotNullParameter(element, "element");
        this.f36367a = left;
        this.f36368b = element;
    }

    private final boolean e(CoroutineContext.Element element) {
        return Intrinsics.b(a(element.getKey()), element);
    }

    private final boolean h(c cVar) {
        while (e(cVar.f36368b)) {
            CoroutineContext coroutineContext = cVar.f36367a;
            if (!(coroutineContext instanceof c)) {
                Intrinsics.e(coroutineContext, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return e((CoroutineContext.Element) coroutineContext);
            }
            cVar = (c) coroutineContext;
        }
        return false;
    }

    private final int k() {
        int i10 = 2;
        c cVar = this;
        while (true) {
            CoroutineContext coroutineContext = cVar.f36367a;
            cVar = coroutineContext instanceof c ? (c) coroutineContext : null;
            if (cVar == null) {
                return i10;
            }
            i10++;
        }
    }

    @Override // kotlin.coroutines.CoroutineContext
    public Object K(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(this.f36367a.K(obj, operation), this.f36368b);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext.Element a(CoroutineContext.b key) {
        Intrinsics.checkNotNullParameter(key, "key");
        c cVar = this;
        while (true) {
            CoroutineContext.Element a10 = cVar.f36368b.a(key);
            if (a10 != null) {
                return a10;
            }
            CoroutineContext coroutineContext = cVar.f36367a;
            if (!(coroutineContext instanceof c)) {
                return coroutineContext.a(key);
            }
            cVar = (c) coroutineContext;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (cVar.k() != k() || !cVar.h(this)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f36367a.hashCode() + this.f36368b.hashCode();
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext l(CoroutineContext coroutineContext) {
        return CoroutineContext.a.a(this, coroutineContext);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext t(CoroutineContext.b key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (this.f36368b.a(key) != null) {
            return this.f36367a;
        }
        CoroutineContext t10 = this.f36367a.t(key);
        return t10 == this.f36367a ? this : t10 == g.f36372a ? this.f36368b : new c(t10, this.f36368b);
    }

    public String toString() {
        return '[' + ((String) K(BuildConfig.FLAVOR, a.f36369a)) + ']';
    }
}
