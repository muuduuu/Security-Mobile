package mc;

import java.util.Map;
import kotlin.collections.AbstractC3571f;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: mc.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3665a extends AbstractC3571f {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return e((Map.Entry) obj);
        }
        return false;
    }

    public final boolean e(Map.Entry element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return h(element);
    }

    public abstract boolean h(Map.Entry entry);

    public /* bridge */ boolean j(Map.Entry entry) {
        return super.remove(entry);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            return j((Map.Entry) obj);
        }
        return false;
    }
}
