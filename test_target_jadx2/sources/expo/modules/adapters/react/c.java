package expo.modules.adapters.react;

import Ea.d;
import com.facebook.react.P;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public class c implements d {

    /* renamed from: a, reason: collision with root package name */
    private Collection f32580a = new ArrayList();

    public void a(P p10) {
        this.f32580a.add(p10);
    }

    public Collection b() {
        return this.f32580a;
    }

    @Override // Ea.d
    public List e() {
        return Collections.singletonList(c.class);
    }
}
