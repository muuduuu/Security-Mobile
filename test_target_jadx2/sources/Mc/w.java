package Mc;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class w implements v {

    /* renamed from: a, reason: collision with root package name */
    private final List f6354a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f6355b;

    /* renamed from: c, reason: collision with root package name */
    private final List f6356c;

    /* renamed from: d, reason: collision with root package name */
    private final Set f6357d;

    public w(List allDependencies, Set modulesWhoseInternalsAreVisible, List directExpectedByDependencies, Set allExpectedByDependencies) {
        Intrinsics.checkNotNullParameter(allDependencies, "allDependencies");
        Intrinsics.checkNotNullParameter(modulesWhoseInternalsAreVisible, "modulesWhoseInternalsAreVisible");
        Intrinsics.checkNotNullParameter(directExpectedByDependencies, "directExpectedByDependencies");
        Intrinsics.checkNotNullParameter(allExpectedByDependencies, "allExpectedByDependencies");
        this.f6354a = allDependencies;
        this.f6355b = modulesWhoseInternalsAreVisible;
        this.f6356c = directExpectedByDependencies;
        this.f6357d = allExpectedByDependencies;
    }

    @Override // Mc.v
    public List a() {
        return this.f6354a;
    }

    @Override // Mc.v
    public Set b() {
        return this.f6355b;
    }

    @Override // Mc.v
    public List c() {
        return this.f6356c;
    }
}
