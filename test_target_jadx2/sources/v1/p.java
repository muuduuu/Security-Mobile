package V1;

import c2.C1718a;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
abstract class p implements o {

    /* renamed from: a, reason: collision with root package name */
    final List f10786a;

    p(List list) {
        this.f10786a = list;
    }

    @Override // V1.o
    public boolean o() {
        if (this.f10786a.isEmpty()) {
            return true;
        }
        return this.f10786a.size() == 1 && ((C1718a) this.f10786a.get(0)).i();
    }

    @Override // V1.o
    public List q() {
        return this.f10786a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (!this.f10786a.isEmpty()) {
            sb2.append("values=");
            sb2.append(Arrays.toString(this.f10786a.toArray()));
        }
        return sb2.toString();
    }
}
