package hd;

import fd.AbstractC3165a;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class e extends AbstractC3165a {

    /* renamed from: h, reason: collision with root package name */
    public static final a f34066h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    public static final e f34067i;

    /* renamed from: j, reason: collision with root package name */
    public static final e f34068j;

    /* renamed from: k, reason: collision with root package name */
    public static final e f34069k;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f34070g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        e eVar = new e(1, 9, 0);
        f34067i = eVar;
        f34068j = eVar.m();
        f34069k = new e(new int[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int[] versionArray, boolean z10) {
        super(Arrays.copyOf(versionArray, versionArray.length));
        Intrinsics.checkNotNullParameter(versionArray, "versionArray");
        this.f34070g = z10;
    }

    private final boolean i(e eVar) {
        if ((a() == 1 && b() == 0) || a() == 0) {
            return false;
        }
        return !l(eVar);
    }

    private final boolean l(e eVar) {
        if (a() > eVar.a()) {
            return true;
        }
        return a() >= eVar.a() && b() > eVar.b();
    }

    public final boolean h(e metadataVersionFromLanguageVersion) {
        Intrinsics.checkNotNullParameter(metadataVersionFromLanguageVersion, "metadataVersionFromLanguageVersion");
        if (a() == 2 && b() == 0) {
            e eVar = f34067i;
            if (eVar.a() == 1 && eVar.b() == 8) {
                return true;
            }
        }
        return i(metadataVersionFromLanguageVersion.k(this.f34070g));
    }

    public final boolean j() {
        return this.f34070g;
    }

    public final e k(boolean z10) {
        e eVar = z10 ? f34067i : f34068j;
        return eVar.l(this) ? eVar : this;
    }

    public final e m() {
        return (a() == 1 && b() == 9) ? new e(2, 0, 0) : new e(a(), b() + 1, 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(int... numbers) {
        this(numbers, false);
        Intrinsics.checkNotNullParameter(numbers, "numbers");
    }
}
