package v;

import android.view.Surface;
import java.util.Objects;
import v.C4900k;

/* renamed from: v.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC4905p implements C4900k.a {

    /* renamed from: a, reason: collision with root package name */
    final Object f43801a;

    AbstractC4905p(Object obj) {
        this.f43801a = obj;
    }

    @Override // v.C4900k.a
    public abstract Surface a();

    @Override // v.C4900k.a
    public void c(Surface surface) {
        y0.f.h(surface, "Surface must not be null");
        if (a() == surface) {
            throw new IllegalStateException("Surface is already added!");
        }
        if (!j()) {
            throw new IllegalStateException("Cannot have 2 surfaces for a non-sharing configuration");
        }
        throw new IllegalArgumentException("Exceeds maximum number of surfaces");
    }

    public boolean equals(Object obj) {
        if (obj instanceof AbstractC4905p) {
            return Objects.equals(this.f43801a, ((AbstractC4905p) obj).f43801a);
        }
        return false;
    }

    public int hashCode() {
        return this.f43801a.hashCode();
    }

    abstract boolean j();

    @Override // v.C4900k.a
    public void b(long j10) {
    }

    @Override // v.C4900k.a
    public void h(int i10) {
    }
}
