package M0;

import M0.f;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.AbstractC3574i;
import kotlin.collections.CollectionsKt;
import kotlin.collections.G;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import xc.m;

/* loaded from: classes.dex */
public final class c extends f {

    /* renamed from: a, reason: collision with root package name */
    private final Map f5960a;

    /* renamed from: b, reason: collision with root package name */
    private final b f5961b;

    static final class a extends m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f5962a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(Map.Entry entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            Object value = entry.getValue();
            return "  " + ((f.a) entry.getKey()).a() + " = " + (value instanceof byte[] ? AbstractC3574i.Q((byte[]) value, ", ", "[", "]", 0, null, null, 56, null) : String.valueOf(entry.getValue()));
        }
    }

    public /* synthetic */ c(Map map, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new LinkedHashMap() : map, (i10 & 2) != 0 ? true : z10);
    }

    @Override // M0.f
    public Map a() {
        Pair pair;
        Set<Map.Entry> entrySet = this.f5960a.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.d.d(G.d(CollectionsKt.u(entrySet, 10)), 16));
        for (Map.Entry entry : entrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
                pair = new Pair(key, copyOf);
            } else {
                pair = new Pair(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(pair.c(), pair.d());
        }
        return M0.a.b(linkedHashMap);
    }

    @Override // M0.f
    public Object b(f.a key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = this.f5960a.get(key);
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    public final void e() {
        if (this.f5961b.a()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[LOOP:0: B:16:0x002f->B:31:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        boolean z10;
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        Map map = cVar.f5960a;
        if (map == this.f5960a) {
            return true;
        }
        if (map.size() != this.f5960a.size()) {
            return false;
        }
        Map map2 = cVar.f5960a;
        if (!map2.isEmpty()) {
            for (Map.Entry entry : map2.entrySet()) {
                Object obj2 = this.f5960a.get(entry.getKey());
                if (obj2 != null) {
                    Object value = entry.getValue();
                    if (!(value instanceof byte[])) {
                        z10 = Intrinsics.b(value, obj2);
                    } else if ((obj2 instanceof byte[]) && Arrays.equals((byte[]) value, (byte[]) obj2)) {
                        z10 = true;
                    }
                    if (z10) {
                        return false;
                    }
                }
                z10 = false;
                if (z10) {
                }
            }
        }
        return true;
    }

    public final void f() {
        this.f5961b.b(true);
    }

    public final void g(f.b... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        e();
        if (pairs.length <= 0) {
            return;
        }
        f.b bVar = pairs[0];
        throw null;
    }

    public final Object h(f.a key) {
        Intrinsics.checkNotNullParameter(key, "key");
        e();
        return this.f5960a.remove(key);
    }

    public int hashCode() {
        Iterator it = this.f5960a.entrySet().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            i10 += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return i10;
    }

    public final void i(f.a key, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        j(key, obj);
    }

    public final void j(f.a key, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        e();
        if (obj == null) {
            h(key);
            return;
        }
        if (obj instanceof Set) {
            this.f5960a.put(key, M0.a.a((Set) obj));
            return;
        }
        if (!(obj instanceof byte[])) {
            this.f5960a.put(key, obj);
            return;
        }
        Map map = this.f5960a;
        byte[] bArr = (byte[]) obj;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        map.put(key, copyOf);
    }

    public String toString() {
        return CollectionsKt.l0(this.f5960a.entrySet(), ",\n", "{\n", "\n}", 0, null, a.f5962a, 24, null);
    }

    public c(Map preferencesMap, boolean z10) {
        Intrinsics.checkNotNullParameter(preferencesMap, "preferencesMap");
        this.f5960a = preferencesMap;
        this.f5961b = new b(z10);
    }
}
