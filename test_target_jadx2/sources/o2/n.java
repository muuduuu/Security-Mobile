package o2;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public interface n {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final i2.f f37866a;

        /* renamed from: b, reason: collision with root package name */
        public final List f37867b;

        /* renamed from: c, reason: collision with root package name */
        public final com.bumptech.glide.load.data.d f37868c;

        public a(i2.f fVar, com.bumptech.glide.load.data.d dVar) {
            this(fVar, Collections.emptyList(), dVar);
        }

        public a(i2.f fVar, List list, com.bumptech.glide.load.data.d dVar) {
            this.f37866a = (i2.f) D2.k.d(fVar);
            this.f37867b = (List) D2.k.d(list);
            this.f37868c = (com.bumptech.glide.load.data.d) D2.k.d(dVar);
        }
    }

    boolean a(Object obj);

    a b(Object obj, int i10, int i11, i2.h hVar);
}
