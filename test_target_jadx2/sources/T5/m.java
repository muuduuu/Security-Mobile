package T5;

import java.io.Serializable;

/* loaded from: classes2.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final m f9298a = new e();

    static class a extends m {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f9299b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f9300c;

        a(String str, String str2) {
            this.f9299b = str;
            this.f9300c = str2;
        }

        @Override // T5.m
        public String c(String str) {
            return this.f9299b + str + this.f9300c;
        }

        public String toString() {
            return "[PreAndSuffixTransformer('" + this.f9299b + "','" + this.f9300c + "')]";
        }
    }

    static class b extends m {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f9301b;

        b(String str) {
            this.f9301b = str;
        }

        @Override // T5.m
        public String c(String str) {
            return this.f9301b + str;
        }

        public String toString() {
            return "[PrefixTransformer('" + this.f9301b + "')]";
        }
    }

    static class c extends m {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f9302b;

        c(String str) {
            this.f9302b = str;
        }

        @Override // T5.m
        public String c(String str) {
            return str + this.f9302b;
        }

        public String toString() {
            return "[SuffixTransformer('" + this.f9302b + "')]";
        }
    }

    public static class d extends m implements Serializable {

        /* renamed from: b, reason: collision with root package name */
        protected final m f9303b;

        /* renamed from: c, reason: collision with root package name */
        protected final m f9304c;

        public d(m mVar, m mVar2) {
            this.f9303b = mVar;
            this.f9304c = mVar2;
        }

        @Override // T5.m
        public String c(String str) {
            return this.f9303b.c(this.f9304c.c(str));
        }

        public String toString() {
            return "[ChainedTransformer(" + this.f9303b + ", " + this.f9304c + ")]";
        }
    }

    protected m() {
    }

    public static m a(m mVar, m mVar2) {
        return new d(mVar, mVar2);
    }

    public static m b(String str, String str2) {
        boolean z10 = false;
        boolean z11 = (str == null || str.isEmpty()) ? false : true;
        if (str2 != null && !str2.isEmpty()) {
            z10 = true;
        }
        return z11 ? z10 ? new a(str, str2) : new b(str) : z10 ? new c(str2) : f9298a;
    }

    public abstract String c(String str);

    protected static final class e extends m implements Serializable {
        protected e() {
        }

        @Override // T5.m
        public String c(String str) {
            return str;
        }
    }
}
