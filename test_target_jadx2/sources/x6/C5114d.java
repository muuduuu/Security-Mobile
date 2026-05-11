package x6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.conscrypt.BuildConfig;

/* renamed from: x6.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5114d {

    /* renamed from: c, reason: collision with root package name */
    private static final C5114d f44795c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final String f44796a;

    /* renamed from: b, reason: collision with root package name */
    private final List f44797b;

    /* renamed from: x6.d$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private String f44798a = BuildConfig.FLAVOR;

        /* renamed from: b, reason: collision with root package name */
        private List f44799b = new ArrayList();

        a() {
        }

        public C5114d a() {
            return new C5114d(this.f44798a, Collections.unmodifiableList(this.f44799b));
        }

        public a b(List list) {
            this.f44799b = list;
            return this;
        }

        public a c(String str) {
            this.f44798a = str;
            return this;
        }
    }

    C5114d(String str, List list) {
        this.f44796a = str;
        this.f44797b = list;
    }

    public static a c() {
        return new a();
    }

    public List a() {
        return this.f44797b;
    }

    public String b() {
        return this.f44796a;
    }
}
