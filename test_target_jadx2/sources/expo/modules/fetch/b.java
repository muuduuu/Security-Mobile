package expo.modules.fetch;

import Td.D;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    private D f32662a;

    public b(D d10) {
        this.f32662a = d10;
    }

    public final void a(D d10) {
        this.f32662a = d10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.b(this.f32662a, ((b) obj).f32662a);
    }

    public int hashCode() {
        D d10 = this.f32662a;
        if (d10 == null) {
            return 0;
        }
        return d10.hashCode();
    }

    public String toString() {
        return "RequestHolder(request=" + this.f32662a + ")";
    }
}
