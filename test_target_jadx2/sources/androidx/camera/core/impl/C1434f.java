package androidx.camera.core.impl;

import androidx.camera.core.impl.InterfaceC1441i0;
import java.util.List;

/* renamed from: androidx.camera.core.impl.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1434f extends InterfaceC1441i0.b {

    /* renamed from: a, reason: collision with root package name */
    private final int f14571a;

    /* renamed from: b, reason: collision with root package name */
    private final int f14572b;

    /* renamed from: c, reason: collision with root package name */
    private final List f14573c;

    /* renamed from: d, reason: collision with root package name */
    private final List f14574d;

    C1434f(int i10, int i11, List list, List list2) {
        this.f14571a = i10;
        this.f14572b = i11;
        if (list == null) {
            throw new NullPointerException("Null audioProfiles");
        }
        this.f14573c = list;
        if (list2 == null) {
            throw new NullPointerException("Null videoProfiles");
        }
        this.f14574d = list2;
    }

    @Override // androidx.camera.core.impl.InterfaceC1441i0
    public int a() {
        return this.f14571a;
    }

    @Override // androidx.camera.core.impl.InterfaceC1441i0
    public int b() {
        return this.f14572b;
    }

    @Override // androidx.camera.core.impl.InterfaceC1441i0
    public List c() {
        return this.f14573c;
    }

    @Override // androidx.camera.core.impl.InterfaceC1441i0
    public List d() {
        return this.f14574d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InterfaceC1441i0.b)) {
            return false;
        }
        InterfaceC1441i0.b bVar = (InterfaceC1441i0.b) obj;
        return this.f14571a == bVar.a() && this.f14572b == bVar.b() && this.f14573c.equals(bVar.c()) && this.f14574d.equals(bVar.d());
    }

    public int hashCode() {
        return ((((((this.f14571a ^ 1000003) * 1000003) ^ this.f14572b) * 1000003) ^ this.f14573c.hashCode()) * 1000003) ^ this.f14574d.hashCode();
    }

    public String toString() {
        return "ImmutableEncoderProfilesProxy{defaultDurationSeconds=" + this.f14571a + ", recommendedFileFormat=" + this.f14572b + ", audioProfiles=" + this.f14573c + ", videoProfiles=" + this.f14574d + "}";
    }
}
