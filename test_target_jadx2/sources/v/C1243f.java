package V;

import V.C1254q;
import android.location.Location;
import java.io.File;
import org.conscrypt.BuildConfig;

/* renamed from: V.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1243f extends C1254q.b {

    /* renamed from: a, reason: collision with root package name */
    private final long f10613a;

    /* renamed from: b, reason: collision with root package name */
    private final long f10614b;

    /* renamed from: c, reason: collision with root package name */
    private final Location f10615c;

    /* renamed from: d, reason: collision with root package name */
    private final File f10616d;

    /* renamed from: V.f$b */
    static final class b extends C1254q.b.a {

        /* renamed from: a, reason: collision with root package name */
        private Long f10617a;

        /* renamed from: b, reason: collision with root package name */
        private Long f10618b;

        /* renamed from: c, reason: collision with root package name */
        private Location f10619c;

        /* renamed from: d, reason: collision with root package name */
        private File f10620d;

        b() {
        }

        @Override // V.C1254q.b.a
        C1254q.b c() {
            Long l10 = this.f10617a;
            String str = BuildConfig.FLAVOR;
            if (l10 == null) {
                str = BuildConfig.FLAVOR + " fileSizeLimit";
            }
            if (this.f10618b == null) {
                str = str + " durationLimitMillis";
            }
            if (this.f10620d == null) {
                str = str + " file";
            }
            if (str.isEmpty()) {
                return new C1243f(this.f10617a.longValue(), this.f10618b.longValue(), this.f10619c, this.f10620d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // V.C1254q.b.a
        C1254q.b.a d(File file) {
            if (file == null) {
                throw new NullPointerException("Null file");
            }
            this.f10620d = file;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // V.AbstractC1255s.b.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public C1254q.b.a a(long j10) {
            this.f10618b = Long.valueOf(j10);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // V.AbstractC1255s.b.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C1254q.b.a b(long j10) {
            this.f10617a = Long.valueOf(j10);
            return this;
        }
    }

    @Override // V.AbstractC1255s.b
    long a() {
        return this.f10614b;
    }

    @Override // V.AbstractC1255s.b
    long b() {
        return this.f10613a;
    }

    @Override // V.AbstractC1255s.b
    Location c() {
        return this.f10615c;
    }

    @Override // V.C1254q.b
    File d() {
        return this.f10616d;
    }

    public boolean equals(Object obj) {
        Location location;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1254q.b)) {
            return false;
        }
        C1254q.b bVar = (C1254q.b) obj;
        return this.f10613a == bVar.b() && this.f10614b == bVar.a() && ((location = this.f10615c) != null ? location.equals(bVar.c()) : bVar.c() == null) && this.f10616d.equals(bVar.d());
    }

    public int hashCode() {
        long j10 = this.f10613a;
        long j11 = this.f10614b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003;
        Location location = this.f10615c;
        return ((i10 ^ (location == null ? 0 : location.hashCode())) * 1000003) ^ this.f10616d.hashCode();
    }

    public String toString() {
        return "FileOutputOptionsInternal{fileSizeLimit=" + this.f10613a + ", durationLimitMillis=" + this.f10614b + ", location=" + this.f10615c + ", file=" + this.f10616d + "}";
    }

    private C1243f(long j10, long j11, Location location, File file) {
        this.f10613a = j10;
        this.f10614b = j11;
        this.f10615c = location;
        this.f10616d = file;
    }
}
