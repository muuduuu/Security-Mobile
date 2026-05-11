package T5;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class j {

    public static final class a implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final Set f9294a;

        /* renamed from: b, reason: collision with root package name */
        private final Set f9295b;

        private a(Set set, Set set2) {
            this.f9294a = set == null ? Collections.emptySet() : set;
            this.f9295b = set2;
        }

        public static a a(Set set, Set set2) {
            return new a(set, set2);
        }

        public boolean b(Object obj) {
            Set set = this.f9295b;
            return !(set == null || set.contains(obj)) || this.f9294a.contains(obj);
        }
    }

    public static a a(Set set, Set set2) {
        if (set2 == null && (set == null || set.isEmpty())) {
            return null;
        }
        return a.a(set, set2);
    }

    public static boolean b(Object obj, Collection collection, Collection collection2) {
        if (collection == null && collection2 == null) {
            return false;
        }
        return collection2 == null ? collection.contains(obj) : collection == null ? !collection2.contains(obj) : !collection2.contains(obj) || collection.contains(obj);
    }
}
