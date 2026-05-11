package R1;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private final List f8401a;

    /* renamed from: b, reason: collision with root package name */
    private final List f8402b;

    /* renamed from: c, reason: collision with root package name */
    private final List f8403c;

    public h(List list) {
        this.f8403c = list;
        this.f8401a = new ArrayList(list.size());
        this.f8402b = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f8401a.add(((W1.i) list.get(i10)).b().p());
            this.f8402b.add(((W1.i) list.get(i10)).c().p());
        }
    }

    public List a() {
        return this.f8401a;
    }

    public List b() {
        return this.f8403c;
    }

    public List c() {
        return this.f8402b;
    }
}
