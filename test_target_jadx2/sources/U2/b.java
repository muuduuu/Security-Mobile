package U2;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b implements U2.a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f10331b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final File f10332a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(File file) {
            Intrinsics.checkNotNullParameter(file, "file");
            return new b(file, null);
        }

        public final b b(File file) {
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (file != null) {
                return new b(file, defaultConstructorMarker);
            }
            return null;
        }

        private a() {
        }
    }

    public /* synthetic */ b(File file, DefaultConstructorMarker defaultConstructorMarker) {
        this(file);
    }

    public static final b b(File file) {
        return f10331b.a(file);
    }

    public static final b c(File file) {
        return f10331b.b(file);
    }

    @Override // U2.a
    public InputStream a() {
        return new FileInputStream(this.f10332a);
    }

    public final File d() {
        return this.f10332a;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof b)) {
            return false;
        }
        return Intrinsics.b(this.f10332a, ((b) obj).f10332a);
    }

    public int hashCode() {
        return this.f10332a.hashCode();
    }

    @Override // U2.a
    public long size() {
        return this.f10332a.length();
    }

    private b(File file) {
        this.f10332a = file;
    }
}
