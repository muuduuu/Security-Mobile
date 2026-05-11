package W1;

import O1.C1038i;
import O1.w;

/* loaded from: classes.dex */
public class j implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f11203a;

    /* renamed from: b, reason: collision with root package name */
    private final a f11204b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f11205c;

    public enum a {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static a forId(int i10) {
            return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? MERGE : EXCLUDE_INTERSECTIONS : INTERSECT : SUBTRACT : ADD : MERGE;
        }
    }

    public j(String str, a aVar, boolean z10) {
        this.f11203a = str;
        this.f11204b = aVar;
        this.f11205c = z10;
    }

    @Override // W1.c
    public Q1.c a(com.airbnb.lottie.o oVar, C1038i c1038i, X1.b bVar) {
        if (oVar.h0(w.MergePathsApi19)) {
            return new Q1.l(this);
        }
        b2.f.c("Animation contains merge paths but they are disabled.");
        return null;
    }

    public a b() {
        return this.f11204b;
    }

    public String c() {
        return this.f11203a;
    }

    public boolean d() {
        return this.f11205c;
    }

    public String toString() {
        return "MergePaths{mode=" + this.f11204b + '}';
    }
}
