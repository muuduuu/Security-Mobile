package qc;

import java.io.Serializable;
import kotlin.collections.AbstractC3568c;
import kotlin.collections.AbstractC3574i;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
final class b extends AbstractC3568c implements EnumEntries, Serializable {

    /* renamed from: b, reason: collision with root package name */
    private final Enum[] f38884b;

    public b(Enum[] entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        this.f38884b = entries;
    }

    @Override // kotlin.collections.AbstractC3566a
    public int c() {
        return this.f38884b.length;
    }

    @Override // kotlin.collections.AbstractC3566a, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Enum) {
            return e((Enum) obj);
        }
        return false;
    }

    public boolean e(Enum element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return ((Enum) AbstractC3574i.G(this.f38884b, element.ordinal())) == element;
    }

    @Override // kotlin.collections.AbstractC3568c, java.util.List
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public Enum get(int i10) {
        AbstractC3568c.f36342a.b(i10, this.f38884b.length);
        return this.f38884b[i10];
    }

    @Override // kotlin.collections.AbstractC3568c, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Enum) {
            return j((Enum) obj);
        }
        return -1;
    }

    public int j(Enum element) {
        Intrinsics.checkNotNullParameter(element, "element");
        int ordinal = element.ordinal();
        if (((Enum) AbstractC3574i.G(this.f38884b, ordinal)) == element) {
            return ordinal;
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractC3568c, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return m((Enum) obj);
        }
        return -1;
    }

    public int m(Enum element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return indexOf(element);
    }
}
