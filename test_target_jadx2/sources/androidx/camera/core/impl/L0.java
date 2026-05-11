package androidx.camera.core.impl;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public class L0 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f14427a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f14428b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f14429c;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private boolean f14430a = true;

        /* renamed from: b, reason: collision with root package name */
        private Set f14431b;

        /* renamed from: c, reason: collision with root package name */
        private Set f14432c;

        public L0 a() {
            return new L0(this.f14430a, this.f14431b, this.f14432c);
        }

        public b b(Set set) {
            this.f14432c = new HashSet(set);
            return this;
        }

        public b c(Set set) {
            this.f14431b = new HashSet(set);
            return this;
        }

        public b d(boolean z10) {
            this.f14430a = z10;
            return this;
        }
    }

    public static L0 b() {
        return new b().d(true).a();
    }

    public boolean a(Class cls, boolean z10) {
        if (this.f14428b.contains(cls)) {
            return true;
        }
        if (this.f14429c.contains(cls)) {
            return false;
        }
        return this.f14427a && z10;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof L0)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        L0 l02 = (L0) obj;
        return this.f14427a == l02.f14427a && Objects.equals(this.f14428b, l02.f14428b) && Objects.equals(this.f14429c, l02.f14429c);
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f14427a), this.f14428b, this.f14429c);
    }

    public String toString() {
        return "QuirkSettings{enabledWhenDeviceHasQuirk=" + this.f14427a + ", forceEnabledQuirks=" + this.f14428b + ", forceDisabledQuirks=" + this.f14429c + '}';
    }

    private L0(boolean z10, Set set, Set set2) {
        this.f14427a = z10;
        this.f14428b = set == null ? Collections.emptySet() : new HashSet(set);
        this.f14429c = set2 == null ? Collections.emptySet() : new HashSet(set2);
    }
}
