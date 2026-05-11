package v;

import A.B;
import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import v.C4896g;

/* renamed from: v.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C4897h implements C4896g.a {

    /* renamed from: a, reason: collision with root package name */
    private final DynamicRangeProfiles f43786a;

    C4897h(Object obj) {
        this.f43786a = (DynamicRangeProfiles) obj;
    }

    private Long d(B b10) {
        return AbstractC4893d.a(b10, this.f43786a);
    }

    private static Set e(Set set) {
        if (set.isEmpty()) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(f(((Long) it.next()).longValue()));
        }
        return Collections.unmodifiableSet(hashSet);
    }

    private static B f(long j10) {
        return (B) y0.f.h(AbstractC4893d.b(j10), "Dynamic range profile cannot be converted to a DynamicRange object: " + j10);
    }

    @Override // v.C4896g.a
    public DynamicRangeProfiles a() {
        return this.f43786a;
    }

    @Override // v.C4896g.a
    public Set b(B b10) {
        Long d10 = d(b10);
        y0.f.b(d10 != null, "DynamicRange is not supported: " + b10);
        return e(this.f43786a.getProfileCaptureRequestConstraints(d10.longValue()));
    }

    @Override // v.C4896g.a
    public Set c() {
        return e(this.f43786a.getSupportedProfiles());
    }
}
