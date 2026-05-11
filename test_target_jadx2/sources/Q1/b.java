package Q1;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final List f7915a = new ArrayList();

    void a(u uVar) {
        this.f7915a.add(uVar);
    }

    public void b(Path path) {
        for (int size = this.f7915a.size() - 1; size >= 0; size--) {
            b2.l.b(path, (u) this.f7915a.get(size));
        }
    }
}
