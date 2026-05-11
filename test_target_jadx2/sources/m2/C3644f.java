package m2;

import android.content.Context;
import java.io.File;
import m2.AbstractC3642d;

/* renamed from: m2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3644f extends AbstractC3642d {

    /* renamed from: m2.f$a */
    class a implements AbstractC3642d.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f37306a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f37307b;

        a(Context context, String str) {
            this.f37306a = context;
            this.f37307b = str;
        }

        @Override // m2.AbstractC3642d.a
        public File a() {
            File cacheDir = this.f37306a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f37307b != null ? new File(cacheDir, this.f37307b) : cacheDir;
        }
    }

    public C3644f(Context context) {
        this(context, "image_manager_disk_cache", 262144000L);
    }

    public C3644f(Context context, String str, long j10) {
        super(new a(context, str), j10);
    }
}
