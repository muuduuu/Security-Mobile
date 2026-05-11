package x6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.conscrypt.BuildConfig;
import u6.l;

/* renamed from: x6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5111a {

    /* renamed from: e, reason: collision with root package name */
    private static final C5111a f44778e = new C0653a().b();

    /* renamed from: a, reason: collision with root package name */
    private final f f44779a;

    /* renamed from: b, reason: collision with root package name */
    private final List f44780b;

    /* renamed from: c, reason: collision with root package name */
    private final C5112b f44781c;

    /* renamed from: d, reason: collision with root package name */
    private final String f44782d;

    /* renamed from: x6.a$a, reason: collision with other inner class name */
    public static final class C0653a {

        /* renamed from: a, reason: collision with root package name */
        private f f44783a = null;

        /* renamed from: b, reason: collision with root package name */
        private List f44784b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private C5112b f44785c = null;

        /* renamed from: d, reason: collision with root package name */
        private String f44786d = BuildConfig.FLAVOR;

        C0653a() {
        }

        public C0653a a(C5114d c5114d) {
            this.f44784b.add(c5114d);
            return this;
        }

        public C5111a b() {
            return new C5111a(this.f44783a, Collections.unmodifiableList(this.f44784b), this.f44785c, this.f44786d);
        }

        public C0653a c(String str) {
            this.f44786d = str;
            return this;
        }

        public C0653a d(C5112b c5112b) {
            this.f44785c = c5112b;
            return this;
        }

        public C0653a e(f fVar) {
            this.f44783a = fVar;
            return this;
        }
    }

    C5111a(f fVar, List list, C5112b c5112b, String str) {
        this.f44779a = fVar;
        this.f44780b = list;
        this.f44781c = c5112b;
        this.f44782d = str;
    }

    public static C0653a e() {
        return new C0653a();
    }

    public String a() {
        return this.f44782d;
    }

    public C5112b b() {
        return this.f44781c;
    }

    public List c() {
        return this.f44780b;
    }

    public f d() {
        return this.f44779a;
    }

    public byte[] f() {
        return l.a(this);
    }
}
