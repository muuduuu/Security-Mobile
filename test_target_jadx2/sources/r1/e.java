package R1;

import c2.C1718a;
import java.util.List;

/* loaded from: classes.dex */
public class e extends g {

    /* renamed from: i, reason: collision with root package name */
    private final W1.d f8400i;

    public e(List list) {
        super(list);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            W1.d dVar = (W1.d) ((C1718a) list.get(i11)).f19336b;
            if (dVar != null) {
                i10 = Math.max(i10, dVar.f());
            }
        }
        this.f8400i = new W1.d(new float[i10], new int[i10]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R1.a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public W1.d i(C1718a c1718a, float f10) {
        this.f8400i.g((W1.d) c1718a.f19336b, (W1.d) c1718a.f19337c, f10);
        return this.f8400i;
    }
}
