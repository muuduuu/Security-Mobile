package hd;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class d {

    public static final class a extends d {

        /* renamed from: a, reason: collision with root package name */
        private final String f34062a;

        /* renamed from: b, reason: collision with root package name */
        private final String f34063b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String name, String desc) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(desc, "desc");
            this.f34062a = name;
            this.f34063b = desc;
        }

        @Override // hd.d
        public String a() {
            return c() + ':' + b();
        }

        @Override // hd.d
        public String b() {
            return this.f34063b;
        }

        @Override // hd.d
        public String c() {
            return this.f34062a;
        }

        public final String d() {
            return this.f34062a;
        }

        public final String e() {
            return this.f34063b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.b(this.f34062a, aVar.f34062a) && Intrinsics.b(this.f34063b, aVar.f34063b);
        }

        public int hashCode() {
            return (this.f34062a.hashCode() * 31) + this.f34063b.hashCode();
        }
    }

    public static final class b extends d {

        /* renamed from: a, reason: collision with root package name */
        private final String f34064a;

        /* renamed from: b, reason: collision with root package name */
        private final String f34065b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String name, String desc) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(desc, "desc");
            this.f34064a = name;
            this.f34065b = desc;
        }

        public static /* synthetic */ b e(b bVar, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = bVar.f34064a;
            }
            if ((i10 & 2) != 0) {
                str2 = bVar.f34065b;
            }
            return bVar.d(str, str2);
        }

        @Override // hd.d
        public String a() {
            return c() + b();
        }

        @Override // hd.d
        public String b() {
            return this.f34065b;
        }

        @Override // hd.d
        public String c() {
            return this.f34064a;
        }

        public final b d(String name, String desc) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(desc, "desc");
            return new b(name, desc);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.b(this.f34064a, bVar.f34064a) && Intrinsics.b(this.f34065b, bVar.f34065b);
        }

        public int hashCode() {
            return (this.f34064a.hashCode() * 31) + this.f34065b.hashCode();
        }
    }

    public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String a();

    public abstract String b();

    public abstract String c();

    public final String toString() {
        return a();
    }

    private d() {
    }
}
