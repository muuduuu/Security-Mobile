package androidx.lifecycle;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class W {

    /* renamed from: a, reason: collision with root package name */
    private final Map f17111a = new LinkedHashMap();

    public final void a() {
        Iterator it = this.f17111a.values().iterator();
        while (it.hasNext()) {
            ((S) it.next()).b();
        }
        this.f17111a.clear();
    }

    public final S b(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (S) this.f17111a.get(key);
    }

    public final Set c() {
        return new HashSet(this.f17111a.keySet());
    }

    public final void d(String key, S viewModel) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        S s10 = (S) this.f17111a.put(key, viewModel);
        if (s10 != null) {
            s10.b();
        }
    }
}
