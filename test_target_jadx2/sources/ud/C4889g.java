package ud;

import Kc.a0;
import dd.C3026c;
import fd.AbstractC3165a;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ud.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4889g {

    /* renamed from: a, reason: collision with root package name */
    private final fd.c f43666a;

    /* renamed from: b, reason: collision with root package name */
    private final C3026c f43667b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC3165a f43668c;

    /* renamed from: d, reason: collision with root package name */
    private final a0 f43669d;

    public C4889g(fd.c nameResolver, C3026c classProto, AbstractC3165a metadataVersion, a0 sourceElement) {
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(classProto, "classProto");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        Intrinsics.checkNotNullParameter(sourceElement, "sourceElement");
        this.f43666a = nameResolver;
        this.f43667b = classProto;
        this.f43668c = metadataVersion;
        this.f43669d = sourceElement;
    }

    public final fd.c a() {
        return this.f43666a;
    }

    public final C3026c b() {
        return this.f43667b;
    }

    public final AbstractC3165a c() {
        return this.f43668c;
    }

    public final a0 d() {
        return this.f43669d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4889g)) {
            return false;
        }
        C4889g c4889g = (C4889g) obj;
        return Intrinsics.b(this.f43666a, c4889g.f43666a) && Intrinsics.b(this.f43667b, c4889g.f43667b) && Intrinsics.b(this.f43668c, c4889g.f43668c) && Intrinsics.b(this.f43669d, c4889g.f43669d);
    }

    public int hashCode() {
        return (((((this.f43666a.hashCode() * 31) + this.f43667b.hashCode()) * 31) + this.f43668c.hashCode()) * 31) + this.f43669d.hashCode();
    }

    public String toString() {
        return "ClassData(nameResolver=" + this.f43666a + ", classProto=" + this.f43667b + ", metadataVersion=" + this.f43668c + ", sourceElement=" + this.f43669d + ')';
    }
}
