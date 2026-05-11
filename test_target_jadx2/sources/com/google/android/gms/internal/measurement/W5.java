package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class W5 extends AbstractC2192a6 {
    W5() {
        super(null);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2192a6
    public final void a() {
        if (!b()) {
            if (c() > 0) {
                android.support.v4.media.session.b.a(((X5) d(0)).b());
                throw null;
            }
            Iterator it = e().iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(((Map.Entry) it.next()).getKey());
                throw null;
            }
        }
        super.a();
    }
}
