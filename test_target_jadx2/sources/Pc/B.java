package Pc;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;

/* loaded from: classes3.dex */
public final class B extends p implements Zc.B {

    /* renamed from: a, reason: collision with root package name */
    private final z f7717a;

    /* renamed from: b, reason: collision with root package name */
    private final Annotation[] f7718b;

    /* renamed from: c, reason: collision with root package name */
    private final String f7719c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f7720d;

    public B(z type, Annotation[] reflectAnnotations, String str, boolean z10) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(reflectAnnotations, "reflectAnnotations");
        this.f7717a = type;
        this.f7718b = reflectAnnotations;
        this.f7719c = str;
        this.f7720d = z10;
    }

    @Override // Zc.B
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public z getType() {
        return this.f7717a;
    }

    @Override // Zc.B
    public boolean b() {
        return this.f7720d;
    }

    @Override // Zc.B
    public id.f getName() {
        String str = this.f7719c;
        if (str != null) {
            return id.f.n(str);
        }
        return null;
    }

    @Override // Zc.InterfaceC1331d
    public boolean s() {
        return false;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(B.class.getName());
        sb2.append(": ");
        sb2.append(b() ? "vararg " : BuildConfig.FLAVOR);
        sb2.append(getName());
        sb2.append(": ");
        sb2.append(getType());
        return sb2.toString();
    }

    @Override // Zc.InterfaceC1331d
    public List i() {
        return i.b(this.f7718b);
    }

    @Override // Zc.InterfaceC1331d
    public e p(id.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return i.a(this.f7718b, fqName);
    }
}
