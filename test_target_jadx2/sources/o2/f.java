package o2;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.data.d;
import i2.EnumC3313a;
import java.io.IOException;
import java.io.InputStream;
import o2.n;
import t2.AbstractC4613i;
import t2.C4616l;

/* loaded from: classes.dex */
public final class f implements n {

    /* renamed from: a, reason: collision with root package name */
    private final Context f37823a;

    /* renamed from: b, reason: collision with root package name */
    private final e f37824b;

    private interface e {
        Class a();

        void b(Object obj);

        Object c(Resources.Theme theme, Resources resources, int i10);
    }

    f(Context context, e eVar) {
        this.f37823a = context.getApplicationContext();
        this.f37824b = eVar;
    }

    public static o c(Context context) {
        return new a(context);
    }

    public static o e(Context context) {
        return new b(context);
    }

    public static o g(Context context) {
        return new c(context);
    }

    @Override // o2.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public n.a b(Integer num, int i10, int i11, i2.h hVar) {
        Resources.Theme theme = (Resources.Theme) hVar.c(C4616l.f42290b);
        return new n.a(new C2.c(num), new d(theme, theme != null ? theme.getResources() : this.f37823a.getResources(), this.f37824b, num.intValue()));
    }

    @Override // o2.n
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean a(Integer num) {
        return true;
    }

    private static final class a implements o, e {

        /* renamed from: a, reason: collision with root package name */
        private final Context f37825a;

        a(Context context) {
            this.f37825a = context;
        }

        @Override // o2.f.e
        public Class a() {
            return AssetFileDescriptor.class;
        }

        @Override // o2.o
        public n e(r rVar) {
            return new f(this.f37825a, this);
        }

        @Override // o2.f.e
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void b(AssetFileDescriptor assetFileDescriptor) {
            assetFileDescriptor.close();
        }

        @Override // o2.f.e
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public AssetFileDescriptor c(Resources.Theme theme, Resources resources, int i10) {
            return resources.openRawResourceFd(i10);
        }

        @Override // o2.o
        public void d() {
        }
    }

    private static final class b implements o, e {

        /* renamed from: a, reason: collision with root package name */
        private final Context f37826a;

        b(Context context) {
            this.f37826a = context;
        }

        @Override // o2.f.e
        public Class a() {
            return Drawable.class;
        }

        @Override // o2.o
        public n e(r rVar) {
            return new f(this.f37826a, this);
        }

        @Override // o2.f.e
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Drawable c(Resources.Theme theme, Resources resources, int i10) {
            return AbstractC4613i.a(this.f37826a, i10, theme);
        }

        @Override // o2.o
        public void d() {
        }

        @Override // o2.f.e
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void b(Drawable drawable) {
        }
    }

    private static final class c implements o, e {

        /* renamed from: a, reason: collision with root package name */
        private final Context f37827a;

        c(Context context) {
            this.f37827a = context;
        }

        @Override // o2.f.e
        public Class a() {
            return InputStream.class;
        }

        @Override // o2.o
        public n e(r rVar) {
            return new f(this.f37827a, this);
        }

        @Override // o2.f.e
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void b(InputStream inputStream) {
            inputStream.close();
        }

        @Override // o2.f.e
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public InputStream c(Resources.Theme theme, Resources resources, int i10) {
            return resources.openRawResource(i10);
        }

        @Override // o2.o
        public void d() {
        }
    }

    private static final class d implements com.bumptech.glide.load.data.d {

        /* renamed from: a, reason: collision with root package name */
        private final Resources.Theme f37828a;

        /* renamed from: b, reason: collision with root package name */
        private final Resources f37829b;

        /* renamed from: c, reason: collision with root package name */
        private final e f37830c;

        /* renamed from: d, reason: collision with root package name */
        private final int f37831d;

        /* renamed from: e, reason: collision with root package name */
        private Object f37832e;

        d(Resources.Theme theme, Resources resources, e eVar, int i10) {
            this.f37828a = theme;
            this.f37829b = resources;
            this.f37830c = eVar;
            this.f37831d = i10;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return this.f37830c.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            Object obj = this.f37832e;
            if (obj != null) {
                try {
                    this.f37830c.b(obj);
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public EnumC3313a e() {
            return EnumC3313a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void f(com.bumptech.glide.h hVar, d.a aVar) {
            try {
                Object c10 = this.f37830c.c(this.f37828a, this.f37829b, this.f37831d);
                this.f37832e = c10;
                aVar.d(c10);
            } catch (Resources.NotFoundException e10) {
                aVar.c(e10);
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }
    }
}
