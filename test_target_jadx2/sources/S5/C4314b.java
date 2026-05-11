package s5;

import androidx.camera.core.impl.O0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;

/* renamed from: s5.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4314b {

    /* renamed from: a, reason: collision with root package name */
    public static final C4314b f40774a = new C4314b();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f40775b;

    /* renamed from: s5.b$a */
    public static abstract class a {
        public abstract a a(String str, int i10);

        public abstract a b(String str, Object obj);

        public abstract void c();
    }

    /* renamed from: s5.b$b, reason: collision with other inner class name */
    private static final class C0612b extends a {

        /* renamed from: a, reason: collision with root package name */
        private final long f40776a;

        public C0612b(long j10) {
            this.f40776a = j10;
        }

        @Override // s5.C4314b.a
        public a a(String key, int i10) {
            Intrinsics.checkNotNullParameter(key, "key");
            return this;
        }

        @Override // s5.C4314b.a
        public a b(String key, Object value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            return this;
        }

        @Override // s5.C4314b.a
        public void c() {
            C4313a.i(this.f40776a);
        }
    }

    /* renamed from: s5.b$c */
    private static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        private final long f40777a;

        /* renamed from: b, reason: collision with root package name */
        private final String f40778b;

        /* renamed from: c, reason: collision with root package name */
        private final List f40779c;

        public c(long j10, String sectionName) {
            Intrinsics.checkNotNullParameter(sectionName, "sectionName");
            this.f40777a = j10;
            this.f40778b = sectionName;
            this.f40779c = new ArrayList();
        }

        private final void d(String str, String str2) {
            this.f40779c.add(str + ": " + str2);
        }

        @Override // s5.C4314b.a
        public a a(String key, int i10) {
            Intrinsics.checkNotNullParameter(key, "key");
            d(key, String.valueOf(i10));
            return this;
        }

        @Override // s5.C4314b.a
        public a b(String key, Object value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            d(key, value.toString());
            return this;
        }

        @Override // s5.C4314b.a
        public void c() {
            String str;
            long j10 = this.f40777a;
            String str2 = this.f40778b;
            if (!C4314b.f40775b || this.f40779c.isEmpty()) {
                str = BuildConfig.FLAVOR;
            } else {
                str = " (" + O0.a(", ", this.f40779c) + ")";
            }
            C4313a.c(j10, str2 + str);
        }
    }

    private C4314b() {
    }

    public static final a a(long j10, String sectionName) {
        Intrinsics.checkNotNullParameter(sectionName, "sectionName");
        return new c(j10, sectionName);
    }

    public static final a b(long j10) {
        return new C0612b(j10);
    }
}
