package Z3;

import java.util.LinkedHashSet;

/* renamed from: Z3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1327d {

    /* renamed from: a, reason: collision with root package name */
    private final int f12377a;

    /* renamed from: b, reason: collision with root package name */
    private final LinkedHashSet f12378b;

    public C1327d(int i10) {
        this.f12377a = i10;
        this.f12378b = new LinkedHashSet(i10);
    }

    public final synchronized boolean a(Object obj) {
        try {
            if (this.f12378b.size() == this.f12377a) {
                LinkedHashSet linkedHashSet = this.f12378b;
                linkedHashSet.remove(linkedHashSet.iterator().next());
            }
            this.f12378b.remove(obj);
        } catch (Throwable th) {
            throw th;
        }
        return this.f12378b.add(obj);
    }

    public final synchronized boolean b(Object obj) {
        return this.f12378b.contains(obj);
    }
}
