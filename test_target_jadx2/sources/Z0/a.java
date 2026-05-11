package Z0;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private final Map f12276a = new LinkedHashMap();

    /* renamed from: Z0.a$a, reason: collision with other inner class name */
    public static final class C0228a extends a {

        /* renamed from: b, reason: collision with root package name */
        public static final C0228a f12277b = new C0228a();

        private C0228a() {
        }

        @Override // Z0.a
        public Object a(b key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return null;
        }
    }

    public interface b {
    }

    public abstract Object a(b bVar);

    public final Map b() {
        return this.f12276a;
    }
}
