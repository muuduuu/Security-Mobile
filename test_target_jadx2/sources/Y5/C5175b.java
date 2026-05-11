package y5;

import java.io.Serializable;
import java.util.Objects;

/* renamed from: y5.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5175b implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    protected static final C5175b f45321e = new C5175b(false, null);

    /* renamed from: a, reason: collision with root package name */
    protected final transient Object f45322a;

    /* renamed from: b, reason: collision with root package name */
    protected final int f45323b;

    /* renamed from: c, reason: collision with root package name */
    protected final int f45324c;

    /* renamed from: d, reason: collision with root package name */
    protected final boolean f45325d;

    protected C5175b(boolean z10, Object obj) {
        this(z10, obj, -1, -1);
    }

    public static C5175b a(boolean z10, Object obj) {
        return new C5175b(z10, obj);
    }

    public static C5175b c() {
        return f45321e;
    }

    public Object b() {
        return this.f45322a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj != null && (obj instanceof C5175b) && this.f45322a == ((C5175b) obj).f45322a;
    }

    public int hashCode() {
        return Objects.hashCode(this.f45322a);
    }

    protected C5175b(boolean z10, Object obj, int i10, int i11) {
        this.f45325d = z10;
        this.f45322a = obj;
        this.f45323b = i10;
        this.f45324c = i11;
    }
}
