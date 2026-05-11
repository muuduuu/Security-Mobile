package U1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class e {

    /* renamed from: c, reason: collision with root package name */
    public static final e f10321c = new e("COMPOSITION");

    /* renamed from: a, reason: collision with root package name */
    private final List f10322a;

    /* renamed from: b, reason: collision with root package name */
    private f f10323b;

    public e(String... strArr) {
        this.f10322a = Arrays.asList(strArr);
    }

    private boolean b() {
        return ((String) this.f10322a.get(r0.size() - 1)).equals("**");
    }

    private boolean f(String str) {
        return "__container".equals(str);
    }

    public e a(String str) {
        e eVar = new e(this);
        eVar.f10322a.add(str);
        return eVar;
    }

    public boolean c(String str, int i10) {
        if (i10 >= this.f10322a.size()) {
            return false;
        }
        boolean z10 = i10 == this.f10322a.size() - 1;
        String str2 = (String) this.f10322a.get(i10);
        if (!str2.equals("**")) {
            return (z10 || (i10 == this.f10322a.size() + (-2) && b())) && (str2.equals(str) || str2.equals("*"));
        }
        if (!z10 && ((String) this.f10322a.get(i10 + 1)).equals(str)) {
            return i10 == this.f10322a.size() + (-2) || (i10 == this.f10322a.size() + (-3) && b());
        }
        if (z10) {
            return true;
        }
        int i11 = i10 + 1;
        if (i11 < this.f10322a.size() - 1) {
            return false;
        }
        return ((String) this.f10322a.get(i11)).equals(str);
    }

    public f d() {
        return this.f10323b;
    }

    public int e(String str, int i10) {
        if (f(str)) {
            return 0;
        }
        if (((String) this.f10322a.get(i10)).equals("**")) {
            return (i10 != this.f10322a.size() - 1 && ((String) this.f10322a.get(i10 + 1)).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (!this.f10322a.equals(eVar.f10322a)) {
            return false;
        }
        f fVar = this.f10323b;
        f fVar2 = eVar.f10323b;
        return fVar != null ? fVar.equals(fVar2) : fVar2 == null;
    }

    public boolean g(String str, int i10) {
        if (f(str)) {
            return true;
        }
        if (i10 >= this.f10322a.size()) {
            return false;
        }
        return ((String) this.f10322a.get(i10)).equals(str) || ((String) this.f10322a.get(i10)).equals("**") || ((String) this.f10322a.get(i10)).equals("*");
    }

    public boolean h(String str, int i10) {
        return "__container".equals(str) || i10 < this.f10322a.size() - 1 || ((String) this.f10322a.get(i10)).equals("**");
    }

    public int hashCode() {
        int hashCode = this.f10322a.hashCode() * 31;
        f fVar = this.f10323b;
        return hashCode + (fVar != null ? fVar.hashCode() : 0);
    }

    public e i(f fVar) {
        e eVar = new e(this);
        eVar.f10323b = fVar;
        return eVar;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("KeyPath{keys=");
        sb2.append(this.f10322a);
        sb2.append(",resolved=");
        sb2.append(this.f10323b != null);
        sb2.append('}');
        return sb2.toString();
    }

    private e(e eVar) {
        this.f10322a = new ArrayList(eVar.f10322a);
        this.f10323b = eVar.f10323b;
    }
}
