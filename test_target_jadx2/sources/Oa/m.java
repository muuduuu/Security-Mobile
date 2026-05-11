package Oa;

import Db.C0792a;
import Db.C0794c;
import Jd.AbstractC0887i;
import Jd.AbstractC0891k;
import Jd.C0874b0;
import Td.A;
import Td.B;
import Td.D;
import Td.InterfaceC1229e;
import Td.InterfaceC1230f;
import Td.v;
import Td.x;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.util.Base64;
import android.util.Log;
import co.hyperverge.hypersnapsdk.utils.AppConstants;
import expo.modules.filesystem.DeletingOptions;
import expo.modules.filesystem.DownloadOptions;
import expo.modules.filesystem.EncodingType;
import expo.modules.filesystem.FileSystemUploadOptions;
import expo.modules.filesystem.FileSystemUploadType;
import expo.modules.filesystem.InfoOptions;
import expo.modules.filesystem.MakeDirectoryOptions;
import expo.modules.filesystem.ReadingOptions;
import expo.modules.filesystem.RelocatingOptions;
import expo.modules.filesystem.WritingOptions;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kb.InterfaceC3558b;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lc.t;
import org.conscrypt.BuildConfig;
import pc.AbstractC3868b;
import pe.AbstractC3887o;
import pe.C3877e;
import pe.InterfaceC3878f;
import pe.InterfaceC3879g;
import pe.b0;
import q1.AbstractC3901a;
import u5.C4870a;
import vb.C5006a;
import vb.C5009d;
import vb.EnumC5010e;
import xb.AbstractC5139a;
import xc.C5142C;
import xc.z;

@Metadata(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0016\u0018\u00002\u00020\u0001:\u0005vYw\\`B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J'\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010!\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\rH\u0003¢\u0006\u0004\b!\u0010\"J'\u0010(\u001a\u00020\u00052\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\t2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\tH\u0002¢\u0006\u0004\b+\u0010,J/\u00104\u001a\u0002032\u0006\u0010-\u001a\u00020\r2\u0006\u0010.\u001a\u00020\r2\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b4\u00105J'\u00107\u001a\u0002062\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u0002012\u0006\u0010*\u001a\u00020\tH\u0002¢\u0006\u0004\b7\u00108J\u001a\u0010<\u001a\u0004\u0018\u00010;2\u0006\u0010:\u001a\u000209H\u0082@¢\u0006\u0004\b<\u0010=J\u0017\u0010>\u001a\u00020\r2\u0006\u0010*\u001a\u00020\tH\u0002¢\u0006\u0004\b>\u0010?J\u0017\u0010@\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\tH\u0002¢\u0006\u0004\b@\u0010\fJ\u0017\u0010B\u001a\u00020A2\u0006\u0010*\u001a\u00020\tH\u0002¢\u0006\u0004\bB\u0010CJ\u0017\u0010D\u001a\u00020\u001d2\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\bD\u0010\u001fJ\u0017\u0010F\u001a\u00020E2\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\bF\u0010GJ\u0019\u0010H\u001a\u0004\u0018\u00010#2\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\bH\u0010IJ\u0013\u0010J\u001a\u00020\t*\u00020\u0004H\u0002¢\u0006\u0004\bJ\u0010KJ\u0017\u0010M\u001a\u00020\r2\u0006\u0010L\u001a\u00020\rH\u0002¢\u0006\u0004\bM\u0010NJ\u0017\u0010Q\u001a\u00020P2\u0006\u0010O\u001a\u00020\u001dH\u0002¢\u0006\u0004\bQ\u0010RJ\u0017\u0010V\u001a\u00020U2\u0006\u0010T\u001a\u00020SH\u0002¢\u0006\u0004\bV\u0010WJ\u000f\u0010Y\u001a\u00020XH\u0017¢\u0006\u0004\bY\u0010ZR\u0018\u0010^\u001a\u0004\u0018\u00010[8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0018\u0010b\u001a\u0004\u0018\u00010_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR \u0010g\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020d0c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010k\u001a\u00020h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010o\u001a\u00020l8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bm\u0010nR\u0016\u0010r\u001a\u0004\u0018\u00010[8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bp\u0010qR\u0018\u0010u\u001a\u00020&*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bs\u0010t¨\u0006x"}, d2 = {"LOa/m;", "Lxb/a;", "<init>", "()V", "Landroid/net/Uri;", BuildConfig.FLAVOR, "K", "(Landroid/net/Uri;)V", "J", "Ljava/io/File;", "dir", "P", "(Ljava/io/File;)V", BuildConfig.FLAVOR, "path", "Ljava/util/EnumSet;", "Lkb/c;", "f0", "(Ljava/lang/String;)Ljava/util/EnumSet;", "uri", "h0", "(Landroid/net/Uri;)Ljava/util/EnumSet;", "g0", "permission", "errorMsg", "R", "(Landroid/net/Uri;Lkb/c;Ljava/lang/String;)V", "Q", "(Landroid/net/Uri;Lkb/c;)V", "Ljava/io/InputStream;", "c0", "(Landroid/net/Uri;)Ljava/io/InputStream;", "resourceName", "d0", "(Ljava/lang/String;)Ljava/io/InputStream;", "LN0/a;", "documentFile", "outputDir", BuildConfig.FLAVOR, "copy", "j0", "(LN0/a;Ljava/io/File;Z)V", "file", "L", "(Ljava/io/File;)Landroid/net/Uri;", "url", "fileUriString", "Lexpo/modules/filesystem/FileSystemUploadOptions;", "options", "LOa/s;", "decorator", "LTd/D;", "N", "(Ljava/lang/String;Ljava/lang/String;Lexpo/modules/filesystem/FileSystemUploadOptions;LOa/s;)LTd/D;", "LTd/E;", "M", "(Lexpo/modules/filesystem/FileSystemUploadOptions;LOa/s;Ljava/io/File;)LTd/E;", "LOa/m$a;", "params", BuildConfig.FLAVOR, "O", "(LOa/m$a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "b0", "(Ljava/io/File;)Ljava/lang/String;", "S", BuildConfig.FLAVOR, "U", "(Ljava/io/File;)J", "V", "Ljava/io/OutputStream;", "Z", "(Landroid/net/Uri;)Ljava/io/OutputStream;", "X", "(Landroid/net/Uri;)LN0/a;", "i0", "(Landroid/net/Uri;)Ljava/io/File;", "uriStr", "e0", "(Ljava/lang/String;)Ljava/lang/String;", "inputStream", BuildConfig.FLAVOR, "W", "(Ljava/io/InputStream;)[B", "LTd/v;", "headers", "Landroid/os/Bundle;", "k0", "(LTd/v;)Landroid/os/Bundle;", "Lxb/c;", "b", "()Lxb/c;", "LTd/B;", "d", "LTd/B;", "client", "Lpb/m;", "e", "Lpb/m;", "dirPermissionsRequest", BuildConfig.FLAVOR, "LOa/m$e;", "f", "Ljava/util/Map;", "taskHandlers", "LJd/N;", "g", "LJd/N;", "moduleCoroutineScope", "Landroid/content/Context;", "T", "()Landroid/content/Context;", "context", "Y", "()LTd/B;", "okHttpClient", "a0", "(Landroid/net/Uri;)Z", "isSAFUri", C4870a.f43493a, "c", "expo-file-system_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public class m extends AbstractC5139a {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Td.B client;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private pb.m dirPermissionsRequest;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Map taskHandlers = new HashMap();

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Jd.N moduleCoroutineScope = Jd.O.a(C0874b0.a());

    public static final class A extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final A f7170a = new A();

        public A() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(MakeDirectoryOptions.class);
        }
    }

    public static final class A0 extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final A0 f7171a = new A0();

        public A0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(String.class);
        }
    }

    public static final class B extends xc.m implements Function1 {
        public B() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            String c10;
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            Object obj = objArr[0];
            MakeDirectoryOptions makeDirectoryOptions = (MakeDirectoryOptions) objArr[1];
            c10 = n.c((String) obj);
            Uri parse = Uri.parse(c10);
            m mVar = m.this;
            Intrinsics.d(parse);
            mVar.Q(parse, kb.c.WRITE);
            if (!Intrinsics.b(parse.getScheme(), "file")) {
                throw new IOException("Unsupported scheme for location '" + parse + "'.");
            }
            File i02 = m.this.i0(parse);
            boolean isDirectory = i02.isDirectory();
            boolean intermediates = makeDirectoryOptions.getIntermediates();
            if ((intermediates ? i02.mkdirs() : i02.mkdir()) || (intermediates && isDirectory)) {
                return Unit.f36324a;
            }
            throw new f(parse);
        }
    }

    public static final class B0 extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final B0 f7173a = new B0();

        public B0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(String.class);
        }
    }

    public static final class C extends xc.m implements Function2 {
        public C() {
            super(2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Object[] objArr, pb.m promise) {
            String c10;
            Intrinsics.checkNotNullParameter(objArr, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(promise, "promise");
            c10 = n.c((String) promise);
            Uri parse = Uri.parse(c10);
            m mVar = m.this;
            Intrinsics.d(parse);
            mVar.Q(parse, kb.c.READ);
            if (!Intrinsics.b(parse.getScheme(), "file")) {
                if (m.this.a0(parse)) {
                    throw new r();
                }
                throw new IOException("Unsupported scheme for location '" + parse + "'.");
            }
            File[] listFiles = m.this.i0(parse).listFiles();
            if (listFiles == null) {
                throw new j(parse);
            }
            ArrayList arrayList = new ArrayList(listFiles.length);
            int length = listFiles.length;
            for (int i10 = 0; i10 < length; i10++) {
                File file = listFiles[i10];
                arrayList.add(file != null ? file.getName() : null);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (pb.m) obj2);
            return Unit.f36324a;
        }
    }

    public static final class C0 extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final C0 f7175a = new C0();

        public C0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(String.class);
        }
    }

    public static final class D extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final D f7176a = new D();

        public D() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.f(String.class);
        }
    }

    public static final class D0 extends xc.m implements Function2 {
        public D0() {
            super(2);
        }

        public final void a(Activity sender, vb.j payload) {
            Intrinsics.checkNotNullParameter(sender, "sender");
            Intrinsics.checkNotNullParameter(payload, "payload");
            int a10 = payload.a();
            int b10 = payload.b();
            Intent c10 = payload.c();
            if (a10 != 5394 || m.this.dirPermissionsRequest == null) {
                return;
            }
            Bundle bundle = new Bundle();
            if (b10 != -1 || c10 == null) {
                bundle.putBoolean("granted", false);
            } else {
                Uri data = c10.getData();
                int flags = c10.getFlags() & 3;
                if (data != null) {
                    m.this.a().x().getContentResolver().takePersistableUriPermission(data, flags);
                }
                bundle.putBoolean("granted", true);
                bundle.putString("directoryUri", String.valueOf(data));
            }
            pb.m mVar = m.this.dirPermissionsRequest;
            if (mVar != null) {
                mVar.resolve(bundle);
            }
            m.this.dirPermissionsRequest = null;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Activity) obj, (vb.j) obj2);
            return Unit.f36324a;
        }
    }

    public static final class E extends xc.m implements Function1 {
        public E() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            String c10;
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            c10 = n.c((String) objArr[0]);
            Uri parse = Uri.parse(c10);
            m mVar = m.this;
            Intrinsics.d(parse);
            mVar.Q(parse, kb.c.READ);
            if (!Intrinsics.b(parse.getScheme(), "file")) {
                if (m.this.a0(parse)) {
                    throw new r();
                }
                throw new IOException("Unsupported scheme for location '" + parse + "'.");
            }
            File[] listFiles = m.this.i0(parse).listFiles();
            if (listFiles == null) {
                throw new j(parse);
            }
            ArrayList arrayList = new ArrayList(listFiles.length);
            int length = listFiles.length;
            for (int i10 = 0; i10 < length; i10++) {
                File file = listFiles[i10];
                arrayList.add(file != null ? file.getName() : null);
            }
            return arrayList;
        }
    }

    public static final class E0 extends xc.m implements Function0 {
        public E0() {
            super(0);
        }

        public final void a() {
            try {
                m mVar = m.this;
                File filesDir = mVar.T().getFilesDir();
                Intrinsics.checkNotNullExpressionValue(filesDir, "getFilesDir(...)");
                mVar.P(filesDir);
                m mVar2 = m.this;
                File cacheDir = mVar2.T().getCacheDir();
                Intrinsics.checkNotNullExpressionValue(cacheDir, "getCacheDir(...)");
                mVar2.P(cacheDir);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f36324a;
        }
    }

    public static final class F extends xc.m implements Function1 {
        public F() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
            return Double.valueOf(kotlin.ranges.d.f(BigInteger.valueOf(statFs.getBlockCountLong()).multiply(BigInteger.valueOf(statFs.getBlockSizeLong())).doubleValue(), Math.pow(2.0d, 53.0d) - 1));
        }
    }

    public static final class F0 extends xc.m implements Function0 {
        public F0() {
            super(0);
        }

        public final void a() {
            String str;
            try {
                Jd.O.c(m.this.moduleCoroutineScope, new Da.d(null, 1, null));
            } catch (IllegalStateException unused) {
                str = n.f7276a;
                Log.e(str, "The scope does not have a job in it");
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f36324a;
        }
    }

    public static final class G extends xc.m implements Function1 {
        public G() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
            return Double.valueOf(kotlin.ranges.d.f(BigInteger.valueOf(statFs.getAvailableBlocksLong()).multiply(BigInteger.valueOf(statFs.getBlockSizeLong())).doubleValue(), Math.pow(2.0d, 53.0d) - 1));
        }
    }

    public static final class G0 implements x {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1044c f7181a;

        public G0(InterfaceC1044c interfaceC1044c) {
            this.f7181a = interfaceC1044c;
        }

        @Override // Td.x
        public final Td.F intercept(x.a chain) {
            Intrinsics.checkNotNullParameter(chain, "chain");
            Td.F a10 = chain.a(chain.t());
            return a10.t().b(new C1046d(a10.b(), this.f7181a)).c();
        }
    }

    public static final class H extends xc.m implements Function2 {
        public H() {
            super(2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Object[] objArr, pb.m promise) {
            String c10;
            Intrinsics.checkNotNullParameter(objArr, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(promise, "promise");
            String str = (String) promise;
            c10 = n.c(str);
            Uri parse = Uri.parse(c10);
            m mVar = m.this;
            Intrinsics.d(parse);
            mVar.Q(parse, kb.c.WRITE);
            m.this.Q(parse, kb.c.READ);
            m.this.J(parse);
            if (!Intrinsics.b(parse.getScheme(), "file")) {
                throw new q(str);
            }
            m.this.L(m.this.i0(parse)).toString();
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (pb.m) obj2);
            return Unit.f36324a;
        }
    }

    static final class H0 extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        int f7183a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1040a f7184b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ m f7185c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        H0(C1040a c1040a, m mVar, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f7184b = c1040a;
            this.f7185c = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            return new H0(this.f7184b, this.f7185c, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Jd.N n10, kotlin.coroutines.d dVar) {
            return ((H0) create(n10, dVar)).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String str;
            String str2;
            AbstractC3868b.e();
            if (this.f7183a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lc.p.b(obj);
            C1040a c1040a = this.f7184b;
            DownloadOptions a10 = c1040a.a();
            InterfaceC1229e b10 = c1040a.b();
            File c10 = c1040a.c();
            boolean d10 = c1040a.d();
            pb.m e10 = c1040a.e();
            try {
                Td.F j10 = b10.j();
                Td.G b11 = j10.b();
                Intrinsics.d(b11);
                BufferedInputStream bufferedInputStream = new BufferedInputStream(b11.a());
                FileOutputStream fileOutputStream = new FileOutputStream(c10, d10);
                byte[] bArr = new byte[1024];
                z zVar = new z();
                while (true) {
                    int read = bufferedInputStream.read(bArr);
                    zVar.f45000a = read;
                    if (read == -1) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, read);
                }
                Bundle bundle = new Bundle();
                m mVar = this.f7185c;
                bundle.putString("uri", Uri.fromFile(c10).toString());
                bundle.putInt("status", j10.f());
                bundle.putBundle("headers", mVar.k0(j10.p()));
                Boolean a11 = kotlin.coroutines.jvm.internal.b.a(a10.getMd5());
                if (!a11.booleanValue()) {
                    a11 = null;
                }
                if (a11 != null) {
                    bundle.putString("md5", mVar.b0(c10));
                }
                j10.close();
                e10.resolve(bundle);
            } catch (Exception e11) {
                if (b10.e()) {
                    e10.resolve(null);
                    return null;
                }
                String message = e11.getMessage();
                if (message != null) {
                    str2 = n.f7276a;
                    kotlin.coroutines.jvm.internal.b.b(Log.e(str2, message));
                }
                str = n.f7276a;
                Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
                e10.reject(str, e11.getMessage(), e11);
            }
            return null;
        }
    }

    public static final class I extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final I f7186a = new I();

        public I() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(String.class);
        }
    }

    public static final class J extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final J f7187a = new J();

        public J() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(InfoOptions.class);
        }
    }

    public static final class K extends xc.m implements Function1 {
        public K() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            String c10;
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            String str = (String) objArr[0];
            c10 = n.c(str);
            Uri parse = Uri.parse(c10);
            m mVar = m.this;
            Intrinsics.d(parse);
            mVar.Q(parse, kb.c.WRITE);
            m.this.Q(parse, kb.c.READ);
            m.this.J(parse);
            if (!Intrinsics.b(parse.getScheme(), "file")) {
                throw new q(str);
            }
            return m.this.L(m.this.i0(parse)).toString();
        }
    }

    public static final class L extends xc.m implements Function2 {
        public L() {
            super(2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Object[] objArr, pb.m promise) {
            String c10;
            Intrinsics.checkNotNullParameter(objArr, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(promise, "promise");
            c10 = n.c((String) promise);
            Uri parse = Uri.parse(c10);
            m mVar = m.this;
            Intrinsics.d(parse);
            mVar.Q(parse, kb.c.READ);
            if (!m.this.a0(parse)) {
                throw new IOException("The URI '" + parse + "' is not a Storage Access Framework URI. Try using FileSystem.readDirectoryAsync instead.");
            }
            N0.a h10 = N0.a.h(m.this.T(), parse);
            if (h10 == null || !h10.f() || !h10.k()) {
                throw new j(parse);
            }
            N0.a[] m10 = h10.m();
            Intrinsics.checkNotNullExpressionValue(m10, "listFiles(...)");
            ArrayList arrayList = new ArrayList(m10.length);
            for (N0.a aVar : m10) {
                arrayList.add(aVar.j().toString());
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (pb.m) obj2);
            return Unit.f36324a;
        }
    }

    public static final class M extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final M f7190a = new M();

        public M() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(String.class);
        }
    }

    public static final class N extends xc.m implements Function1 {
        public N() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            String c10;
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            c10 = n.c((String) objArr[0]);
            Uri parse = Uri.parse(c10);
            m mVar = m.this;
            Intrinsics.d(parse);
            mVar.Q(parse, kb.c.READ);
            if (!m.this.a0(parse)) {
                throw new IOException("The URI '" + parse + "' is not a Storage Access Framework URI. Try using FileSystem.readDirectoryAsync instead.");
            }
            N0.a h10 = N0.a.h(m.this.T(), parse);
            if (h10 == null || !h10.f() || !h10.k()) {
                throw new j(parse);
            }
            N0.a[] m10 = h10.m();
            Intrinsics.checkNotNullExpressionValue(m10, "listFiles(...)");
            ArrayList arrayList = new ArrayList(m10.length);
            for (N0.a aVar : m10) {
                arrayList.add(aVar.j().toString());
            }
            return arrayList;
        }
    }

    public static final class O extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final O f7192a = new O();

        public O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(String.class);
        }
    }

    public static final class P extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final P f7193a = new P();

        public P() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(String.class);
        }
    }

    public static final class Q extends xc.m implements Function1 {
        public Q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            String c10;
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            Object obj = objArr[0];
            String str = (String) objArr[1];
            c10 = n.c((String) obj);
            Uri parse = Uri.parse(c10);
            m mVar = m.this;
            Intrinsics.d(parse);
            mVar.Q(parse, kb.c.WRITE);
            if (!m.this.a0(parse)) {
                throw new IOException("The URI '" + parse + "' is not a Storage Access Framework URI. Try using FileSystem.makeDirectoryAsync instead.");
            }
            N0.a X10 = m.this.X(parse);
            if (X10 != null && !X10.k()) {
                throw new f(parse);
            }
            N0.a c11 = X10 != null ? X10.c(str) : null;
            if (c11 == null) {
                throw new f(null);
            }
            Intrinsics.d(c11);
            return c11.j().toString();
        }
    }

    public static final class R extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final R f7195a = new R();

        public R() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(String.class);
        }
    }

    public static final class S extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final S f7196a = new S();

        public S() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(String.class);
        }
    }

    public static final class T extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final T f7197a = new T();

        public T() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(String.class);
        }
    }

    public static final class U extends xc.m implements Function1 {
        public U() {
            super(1);
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x013c A[Catch: FileNotFoundException -> 0x017f, TryCatch #0 {FileNotFoundException -> 0x017f, blocks: (B:28:0x00f9, B:30:0x00ff, B:35:0x010e, B:37:0x0114, B:39:0x013c, B:41:0x0162, B:44:0x0179, B:45:0x017e, B:46:0x0123, B:49:0x012a, B:50:0x0134), top: B:27:0x00f9 }] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0179 A[Catch: FileNotFoundException -> 0x017f, TryCatch #0 {FileNotFoundException -> 0x017f, blocks: (B:28:0x00f9, B:30:0x00ff, B:35:0x010e, B:37:0x0114, B:39:0x013c, B:41:0x0162, B:44:0x0179, B:45:0x017e, B:46:0x0123, B:49:0x012a, B:50:0x0134), top: B:27:0x00f9 }] */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invoke(Object[] objArr) {
            String c10;
            Uri uri;
            Bundle bundle;
            InputStream d02;
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            Object obj = objArr[0];
            InfoOptions infoOptions = (InfoOptions) objArr[1];
            c10 = n.c((String) obj);
            Uri parse = Uri.parse(c10);
            if (Intrinsics.b(parse.getScheme(), "file")) {
                m mVar = m.this;
                Intrinsics.e(c10, "null cannot be cast to non-null type kotlin.String");
                c10 = mVar.e0(c10);
                uri = Uri.parse(c10);
            } else {
                uri = parse;
            }
            m mVar2 = m.this;
            Intrinsics.d(uri);
            mVar2.Q(uri, kb.c.READ);
            if (Intrinsics.b(parse.getScheme(), "file")) {
                m mVar3 = m.this;
                Intrinsics.d(uri);
                File i02 = mVar3.i0(uri);
                if (i02.exists()) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putBoolean("exists", true);
                    bundle2.putBoolean("isDirectory", i02.isDirectory());
                    bundle2.putString("uri", Uri.fromFile(i02).toString());
                    bundle2.putDouble("size", m.this.U(i02));
                    bundle2.putDouble("modificationTime", i02.lastModified() * 0.001d);
                    Boolean md5 = infoOptions.getMd5();
                    if (!Intrinsics.b(md5, Boolean.TRUE)) {
                        md5 = null;
                    }
                    if (md5 == null) {
                        return bundle2;
                    }
                    bundle2.putString("md5", m.this.b0(i02));
                    return bundle2;
                }
                bundle = new Bundle();
                bundle.putBoolean("exists", false);
                bundle.putBoolean("isDirectory", false);
            } else {
                if (!Intrinsics.b(parse.getScheme(), "content") && !Intrinsics.b(parse.getScheme(), "asset") && parse.getScheme() != null) {
                    throw new IOException("Unsupported scheme for location '" + parse + "'.");
                }
                try {
                    String scheme = parse.getScheme();
                    if (scheme != null) {
                        int hashCode = scheme.hashCode();
                        if (hashCode != 93121264) {
                            if (hashCode == 951530617 && scheme.equals("content")) {
                                d02 = m.this.T().getContentResolver().openInputStream(parse);
                            }
                        } else if (scheme.equals("asset")) {
                            m mVar4 = m.this;
                            Intrinsics.d(parse);
                            d02 = mVar4.c0(parse);
                        }
                        if (d02 != null) {
                            throw new FileNotFoundException();
                        }
                        Bundle bundle3 = new Bundle();
                        bundle3.putBoolean("exists", true);
                        bundle3.putBoolean("isDirectory", false);
                        bundle3.putString("uri", parse.toString());
                        bundle3.putDouble("size", d02.available());
                        if (Intrinsics.b(infoOptions.getMd5(), Boolean.TRUE)) {
                            char[] a10 = se.a.a(te.a.d(d02));
                            Intrinsics.checkNotNullExpressionValue(a10, "encodeHex(...)");
                            bundle3.putString("md5", new String(a10));
                        }
                        return bundle3;
                    }
                    d02 = m.this.d0(c10);
                    if (d02 != null) {
                    }
                } catch (FileNotFoundException unused) {
                    bundle = new Bundle();
                    bundle.putBoolean("exists", false);
                    bundle.putBoolean("isDirectory", false);
                }
            }
            return bundle;
        }
    }

    public static final class V extends xc.m implements Function1 {
        public V() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            String c10;
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            Object obj = objArr[0];
            Object obj2 = objArr[1];
            String str = (String) objArr[2];
            String str2 = (String) obj2;
            c10 = n.c((String) obj);
            Uri parse = Uri.parse(c10);
            m mVar = m.this;
            Intrinsics.d(parse);
            mVar.Q(parse, kb.c.WRITE);
            if (!m.this.a0(parse)) {
                throw new IOException("The URI '" + parse + "' is not a Storage Access Framework URI.");
            }
            N0.a X10 = m.this.X(parse);
            if (X10 == null || !X10.k()) {
                throw new g(parse);
            }
            N0.a d10 = X10.d(str, str2);
            if (d10 == null) {
                throw new g(null);
            }
            Intrinsics.d(d10);
            return d10.j().toString();
        }
    }

    public static final class W extends xc.m implements Function2 {
        public W() {
            super(2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Object[] objArr, pb.m promise) {
            InterfaceC1229e a10;
            Intrinsics.checkNotNullParameter(objArr, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(promise, "promise");
            C1048e c1048e = (C1048e) m.this.taskHandlers.get((String) promise);
            if (c1048e == null || (a10 = c1048e.a()) == null) {
                return;
            }
            a10.cancel();
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (pb.m) obj2);
            return Unit.f36324a;
        }
    }

    public static final class X extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final X f7201a = new X();

        public X() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(String.class);
        }
    }

    public static final class Y extends xc.m implements Function1 {
        public Y() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            InterfaceC1229e a10;
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            C1048e c1048e = (C1048e) m.this.taskHandlers.get((String) objArr[0]);
            if (c1048e == null || (a10 = c1048e.a()) == null) {
                return null;
            }
            a10.cancel();
            return Unit.f36324a;
        }
    }

    public static final class Z extends xc.m implements Function2 {
        public Z() {
            super(2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Object[] objArr, pb.m promise) {
            Intrinsics.checkNotNullParameter(objArr, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(promise, "promise");
            String str = (String) promise;
            C1048e c1048e = (C1048e) m.this.taskHandlers.get(str);
            if (c1048e == null) {
                throw new IOException("No download object available");
            }
            if (!(c1048e instanceof C1042b)) {
                throw new h();
            }
            c1048e.a().cancel();
            m.this.taskHandlers.remove(str);
            new Bundle().putString("resumeData", String.valueOf(m.this.i0(((C1042b) c1048e).b()).length()));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (pb.m) obj2);
            return Unit.f36324a;
        }
    }

    /* renamed from: Oa.m$a, reason: case insensitive filesystem */
    private static final class C1040a {

        /* renamed from: a, reason: collision with root package name */
        private final DownloadOptions f7204a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC1229e f7205b;

        /* renamed from: c, reason: collision with root package name */
        private final File f7206c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f7207d;

        /* renamed from: e, reason: collision with root package name */
        private final pb.m f7208e;

        public C1040a(DownloadOptions options, InterfaceC1229e call, File file, boolean z10, pb.m promise) {
            Intrinsics.checkNotNullParameter(options, "options");
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(file, "file");
            Intrinsics.checkNotNullParameter(promise, "promise");
            this.f7204a = options;
            this.f7205b = call;
            this.f7206c = file;
            this.f7207d = z10;
            this.f7208e = promise;
        }

        public final DownloadOptions a() {
            return this.f7204a;
        }

        public final InterfaceC1229e b() {
            return this.f7205b;
        }

        public final File c() {
            return this.f7206c;
        }

        public final boolean d() {
            return this.f7207d;
        }

        public final pb.m e() {
            return this.f7208e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1040a)) {
                return false;
            }
            C1040a c1040a = (C1040a) obj;
            return Intrinsics.b(this.f7204a, c1040a.f7204a) && Intrinsics.b(this.f7205b, c1040a.f7205b) && Intrinsics.b(this.f7206c, c1040a.f7206c) && this.f7207d == c1040a.f7207d && Intrinsics.b(this.f7208e, c1040a.f7208e);
        }

        public int hashCode() {
            return (((((((this.f7204a.hashCode() * 31) + this.f7205b.hashCode()) * 31) + this.f7206c.hashCode()) * 31) + Boolean.hashCode(this.f7207d)) * 31) + this.f7208e.hashCode();
        }

        public String toString() {
            return "DownloadResumableTaskParams(options=" + this.f7204a + ", call=" + this.f7205b + ", file=" + this.f7206c + ", isResume=" + this.f7207d + ", promise=" + this.f7208e + ")";
        }
    }

    /* renamed from: Oa.m$a0, reason: case insensitive filesystem */
    public static final class C1041a0 extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final C1041a0 f7209a = new C1041a0();

        public C1041a0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(String.class);
        }
    }

    /* renamed from: Oa.m$b, reason: case insensitive filesystem */
    private static final class C1042b extends C1048e {

        /* renamed from: b, reason: collision with root package name */
        private final Uri f7210b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1042b(Uri fileUri, InterfaceC1229e call) {
            super(call);
            Intrinsics.checkNotNullParameter(fileUri, "fileUri");
            Intrinsics.checkNotNullParameter(call, "call");
            this.f7210b = fileUri;
        }

        public final Uri b() {
            return this.f7210b;
        }
    }

    /* renamed from: Oa.m$b0, reason: case insensitive filesystem */
    public static final class C1043b0 extends xc.m implements Function1 {
        public C1043b0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            String str = (String) objArr[0];
            C1048e c1048e = (C1048e) m.this.taskHandlers.get(str);
            if (c1048e == null) {
                throw new IOException("No download object available");
            }
            if (!(c1048e instanceof C1042b)) {
                throw new h();
            }
            c1048e.a().cancel();
            m.this.taskHandlers.remove(str);
            File i02 = m.this.i0(((C1042b) c1048e).b());
            Bundle bundle = new Bundle();
            bundle.putString("resumeData", String.valueOf(i02.length()));
            return bundle;
        }
    }

    /* renamed from: Oa.m$c, reason: case insensitive filesystem */
    public interface InterfaceC1044c {
        void a(long j10, long j11, boolean z10);
    }

    /* renamed from: Oa.m$c0, reason: case insensitive filesystem */
    public static final class C1045c0 extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final C1045c0 f7212a = new C1045c0();

        public C1045c0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(String.class);
        }
    }

    /* renamed from: Oa.m$d, reason: case insensitive filesystem */
    private static final class C1046d extends Td.G {

        /* renamed from: c, reason: collision with root package name */
        private final Td.G f7213c;

        /* renamed from: d, reason: collision with root package name */
        private final InterfaceC1044c f7214d;

        /* renamed from: e, reason: collision with root package name */
        private InterfaceC3879g f7215e;

        /* renamed from: Oa.m$d$a */
        public static final class a extends AbstractC3887o {

            /* renamed from: b, reason: collision with root package name */
            private long f7216b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C1046d f7217c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b0 b0Var, C1046d c1046d) {
                super(b0Var);
                this.f7217c = c1046d;
            }

            @Override // pe.AbstractC3887o, pe.b0
            public long b2(C3877e sink, long j10) {
                Intrinsics.checkNotNullParameter(sink, "sink");
                long b22 = super.b2(sink, j10);
                this.f7216b += b22 != -1 ? b22 : 0L;
                InterfaceC1044c interfaceC1044c = this.f7217c.f7214d;
                long j11 = this.f7216b;
                Td.G g10 = this.f7217c.f7213c;
                interfaceC1044c.a(j11, g10 != null ? g10.e() : -1L, b22 == -1);
                return b22;
            }
        }

        public C1046d(Td.G g10, InterfaceC1044c progressListener) {
            Intrinsics.checkNotNullParameter(progressListener, "progressListener");
            this.f7213c = g10;
            this.f7214d = progressListener;
        }

        private final b0 p(b0 b0Var) {
            return new a(b0Var, this);
        }

        @Override // Td.G
        public long e() {
            Td.G g10 = this.f7213c;
            if (g10 != null) {
                return g10.e();
            }
            return -1L;
        }

        @Override // Td.G
        public Td.z f() {
            Td.G g10 = this.f7213c;
            if (g10 != null) {
                return g10.f();
            }
            return null;
        }

        @Override // Td.G
        public InterfaceC3879g j() {
            InterfaceC3879g interfaceC3879g = this.f7215e;
            if (interfaceC3879g != null) {
                return interfaceC3879g;
            }
            Td.G g10 = this.f7213c;
            Intrinsics.d(g10);
            return pe.M.c(p(g10.j()));
        }
    }

    /* renamed from: Oa.m$d0, reason: case insensitive filesystem */
    public static final class C1047d0 extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final C1047d0 f7218a = new C1047d0();

        public C1047d0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(ReadingOptions.class);
        }
    }

    /* renamed from: Oa.m$e, reason: case insensitive filesystem */
    private static class C1048e {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC1229e f7219a;

        public C1048e(InterfaceC1229e call) {
            Intrinsics.checkNotNullParameter(call, "call");
            this.f7219a = call;
        }

        public final InterfaceC1229e a() {
            return this.f7219a;
        }
    }

    /* renamed from: Oa.m$e0, reason: case insensitive filesystem */
    public static final class C1049e0 extends xc.m implements Function1 {
        public C1049e0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            String c10;
            String encodeToString;
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            Object obj = objArr[0];
            ReadingOptions readingOptions = (ReadingOptions) objArr[1];
            String str = (String) obj;
            c10 = n.c(str);
            Uri parse = Uri.parse(c10);
            m mVar = m.this;
            Intrinsics.d(parse);
            mVar.Q(parse, kb.c.READ);
            if (readingOptions.getEncoding() != EncodingType.BASE64) {
                if (Intrinsics.b(parse.getScheme(), "file")) {
                    return ue.d.i(new FileInputStream(m.this.i0(parse)));
                }
                if (Intrinsics.b(parse.getScheme(), "asset")) {
                    return ue.d.i(m.this.c0(parse));
                }
                if (parse.getScheme() == null) {
                    return ue.d.i(m.this.d0(str));
                }
                if (m.this.a0(parse)) {
                    return ue.d.i(m.this.T().getContentResolver().openInputStream(parse));
                }
                throw new IOException("Unsupported scheme for location '" + parse + "'.");
            }
            InputStream V10 = m.this.V(parse);
            try {
                if (readingOptions.getLength() == null || readingOptions.getPosition() == null) {
                    encodeToString = Base64.encodeToString(m.this.W(V10), 2);
                } else {
                    byte[] bArr = new byte[readingOptions.getLength().intValue()];
                    V10.skip(readingOptions.getPosition().intValue());
                    encodeToString = Base64.encodeToString(bArr, 0, V10.read(bArr, 0, readingOptions.getLength().intValue()), 2);
                }
                Unit unit = Unit.f36324a;
                kotlin.io.c.a(V10, null);
                return encodeToString;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    kotlin.io.c.a(V10, th);
                    throw th2;
                }
            }
        }
    }

    /* renamed from: Oa.m$f, reason: case insensitive filesystem */
    public /* synthetic */ class C1050f {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7221a;

        static {
            int[] iArr = new int[FileSystemUploadType.values().length];
            try {
                iArr[FileSystemUploadType.BINARY_CONTENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FileSystemUploadType.MULTIPART.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f7221a = iArr;
        }
    }

    /* renamed from: Oa.m$f0, reason: case insensitive filesystem */
    public static final class C1051f0 extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final C1051f0 f7222a = new C1051f0();

        public C1051f0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(String.class);
        }
    }

    /* renamed from: Oa.m$g, reason: case insensitive filesystem */
    public static final class C1052g implements InterfaceC1230f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ pb.m f7223a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f7224b;

        C1052g(pb.m mVar, m mVar2) {
            this.f7223a = mVar;
            this.f7224b = mVar2;
        }

        @Override // Td.InterfaceC1230f
        public void c(InterfaceC1229e call, Td.F response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            Bundle bundle = new Bundle();
            m mVar = this.f7224b;
            Td.G b10 = response.b();
            bundle.putString("body", b10 != null ? b10.l() : null);
            bundle.putInt("status", response.f());
            bundle.putBundle("headers", mVar.k0(response.p()));
            response.close();
            this.f7223a.resolve(bundle);
        }

        @Override // Td.InterfaceC1230f
        public void d(InterfaceC1229e call, IOException e10) {
            String str;
            String str2;
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(e10, "e");
            str = n.f7276a;
            Log.e(str, String.valueOf(e10.getMessage()));
            pb.m mVar = this.f7223a;
            str2 = n.f7276a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            mVar.reject(str2, e10.getMessage(), e10);
        }
    }

    /* renamed from: Oa.m$g0, reason: case insensitive filesystem */
    public static final class C1053g0 extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final C1053g0 f7225a = new C1053g0();

        public C1053g0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(String.class);
        }
    }

    /* renamed from: Oa.m$h, reason: case insensitive filesystem */
    static final class C1054h implements s {

        /* renamed from: a, reason: collision with root package name */
        public static final C1054h f7226a = new C1054h();

        C1054h() {
        }

        @Override // Oa.s
        public final Td.E a(Td.E requestBody) {
            Intrinsics.checkNotNullParameter(requestBody, "requestBody");
            return requestBody;
        }
    }

    /* renamed from: Oa.m$h0, reason: case insensitive filesystem */
    public static final class C1055h0 extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final C1055h0 f7227a = new C1055h0();

        public C1055h0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(WritingOptions.class);
        }
    }

    /* renamed from: Oa.m$i, reason: case insensitive filesystem */
    public static final class C1056i implements InterfaceC1230f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ pb.m f7228a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f7229b;

        C1056i(pb.m mVar, m mVar2) {
            this.f7228a = mVar;
            this.f7229b = mVar2;
        }

        @Override // Td.InterfaceC1230f
        public void c(InterfaceC1229e call, Td.F response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            Bundle bundle = new Bundle();
            Td.G b10 = response.b();
            m mVar = this.f7229b;
            bundle.putString("body", b10 != null ? b10.l() : null);
            bundle.putInt("status", response.f());
            bundle.putBundle("headers", mVar.k0(response.p()));
            response.close();
            this.f7228a.resolve(bundle);
        }

        @Override // Td.InterfaceC1230f
        public void d(InterfaceC1229e call, IOException e10) {
            String str;
            String str2;
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(e10, "e");
            if (call.e()) {
                this.f7228a.resolve(null);
                return;
            }
            str = n.f7276a;
            Log.e(str, String.valueOf(e10.getMessage()));
            pb.m mVar = this.f7228a;
            str2 = n.f7276a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            mVar.reject(str2, e10.getMessage(), e10);
        }
    }

    public static final class i0 extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final i0 f7230a = new i0();

        public i0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(FileSystemUploadOptions.class);
        }
    }

    /* renamed from: Oa.m$j, reason: case insensitive filesystem */
    public static final class C1057j implements c {

        /* renamed from: a, reason: collision with root package name */
        private long f7231a = -1;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f7232b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ m f7233c;

        C1057j(String str, m mVar) {
            this.f7232b = str;
            this.f7233c = mVar;
        }

        @Override // Oa.c
        public void a(long j10, long j11) {
            Bundle bundle = new Bundle();
            Bundle bundle2 = new Bundle();
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis > this.f7231a + 100 || j10 == j11) {
                this.f7231a = currentTimeMillis;
                bundle2.putDouble("totalBytesSent", j10);
                bundle2.putDouble("totalBytesExpectedToSend", j11);
                bundle.putString(AppConstants.PARAMS_UUID, this.f7232b);
                bundle.putBundle("data", bundle2);
                this.f7233c.f("expo-file-system.uploadProgress", bundle);
            }
        }
    }

    public static final class j0 extends xc.m implements Function2 {
        public j0() {
            super(2);
        }

        public final void a(Object[] objArr, pb.m promise) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            Intrinsics.checkNotNullParameter(promise, "promise");
            Object obj = objArr[0];
            Object obj2 = objArr[1];
            Object obj3 = objArr[2];
            FileSystemUploadOptions fileSystemUploadOptions = (FileSystemUploadOptions) objArr[3];
            String str = (String) obj3;
            C1057j c1057j = new C1057j(str, m.this);
            m mVar = m.this;
            Td.D N10 = mVar.N((String) obj, (String) obj2, fileSystemUploadOptions, new C1058k(c1057j));
            Td.B Y10 = m.this.Y();
            Intrinsics.d(Y10);
            InterfaceC1229e a10 = Y10.a(N10);
            m.this.taskHandlers.put(str, new C1048e(a10));
            a10.g1(new C1056i(promise, m.this));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (pb.m) obj2);
            return Unit.f36324a;
        }
    }

    /* renamed from: Oa.m$k, reason: case insensitive filesystem */
    static final class C1058k implements s {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f7235a;

        C1058k(c cVar) {
            this.f7235a = cVar;
        }

        @Override // Oa.s
        public final Td.E a(Td.E requestBody) {
            Intrinsics.checkNotNullParameter(requestBody, "requestBody");
            return new b(requestBody, this.f7235a);
        }
    }

    public static final class k0 extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final k0 f7236a = new k0();

        public k0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(String.class);
        }
    }

    /* renamed from: Oa.m$l, reason: case insensitive filesystem */
    public static final class C1059l implements InterfaceC1230f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ pb.m f7237a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f7238b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Uri f7239c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ DownloadOptions f7240d;

        C1059l(pb.m mVar, m mVar2, Uri uri, DownloadOptions downloadOptions) {
            this.f7237a = mVar;
            this.f7238b = mVar2;
            this.f7239c = uri;
            this.f7240d = downloadOptions;
        }

        @Override // Td.InterfaceC1230f
        public void c(InterfaceC1229e call, Td.F response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            m mVar = this.f7238b;
            Uri uri = this.f7239c;
            Intrinsics.checkNotNullExpressionValue(uri, "$uri");
            File i02 = mVar.i0(uri);
            i02.delete();
            InterfaceC3878f b10 = pe.M.b(pe.N.g(i02, false, 1, null));
            Td.G b11 = response.b();
            Intrinsics.d(b11);
            b10.s0(b11.j());
            b10.close();
            Bundle bundle = new Bundle();
            m mVar2 = this.f7238b;
            DownloadOptions downloadOptions = this.f7240d;
            bundle.putString("uri", Uri.fromFile(i02).toString());
            bundle.putInt("status", response.f());
            bundle.putBundle("headers", mVar2.k0(response.p()));
            if (downloadOptions.getMd5()) {
                bundle.putString("md5", mVar2.b0(i02));
            }
            response.close();
            this.f7237a.resolve(bundle);
        }

        @Override // Td.InterfaceC1230f
        public void d(InterfaceC1229e call, IOException e10) {
            String str;
            String str2;
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(e10, "e");
            str = n.f7276a;
            Log.e(str, String.valueOf(e10.getMessage()));
            pb.m mVar = this.f7237a;
            str2 = n.f7276a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            mVar.reject(str2, e10.getMessage(), e10);
        }
    }

    public static final class l0 extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final l0 f7241a = new l0();

        public l0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.f(String.class);
        }
    }

    /* renamed from: Oa.m$m, reason: collision with other inner class name */
    static final class C0139m extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        int f7242a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C1040a f7244c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0139m(C1040a c1040a, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f7244c = c1040a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            return m.this.new C0139m(this.f7244c, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Jd.N n10, kotlin.coroutines.d dVar) {
            return ((C0139m) create(n10, dVar)).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = AbstractC3868b.e();
            int i10 = this.f7242a;
            if (i10 == 0) {
                lc.p.b(obj);
                m mVar = m.this;
                C1040a c1040a = this.f7244c;
                this.f7242a = 1;
                if (mVar.O(c1040a, this) == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                lc.p.b(obj);
            }
            return Unit.f36324a;
        }
    }

    public static final class m0 extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final m0 f7245a = new m0();

        public m0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(DownloadOptions.class);
        }
    }

    /* renamed from: Oa.m$n, reason: case insensitive filesystem */
    public static final class C1060n implements InterfaceC1044c {

        /* renamed from: a, reason: collision with root package name */
        private long f7246a = -1;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f7247b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f7248c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ m f7249d;

        C1060n(String str, String str2, m mVar) {
            this.f7247b = str;
            this.f7248c = str2;
            this.f7249d = mVar;
        }

        @Override // Oa.m.InterfaceC1044c
        public void a(long j10, long j11, boolean z10) {
            Bundle bundle = new Bundle();
            Bundle bundle2 = new Bundle();
            String str = this.f7247b;
            long parseLong = j10 + (str != null ? Long.parseLong(str) : 0L);
            String str2 = this.f7247b;
            long parseLong2 = j11 + (str2 != null ? Long.parseLong(str2) : 0L);
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis > this.f7246a + 100 || parseLong == parseLong2) {
                this.f7246a = currentTimeMillis;
                bundle2.putDouble("totalBytesWritten", parseLong);
                bundle2.putDouble("totalBytesExpectedToWrite", parseLong2);
                bundle.putString(AppConstants.PARAMS_UUID, this.f7248c);
                bundle.putBundle("data", bundle2);
                this.f7249d.f("expo-file-system.downloadProgress", bundle);
            }
        }
    }

    public static final class n0 extends xc.m implements Function2 {
        public n0() {
            super(2);
        }

        public final void a(Object[] objArr, pb.m promise) {
            String c10;
            InterfaceC1229e a10;
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            Intrinsics.checkNotNullParameter(promise, "promise");
            Object obj = objArr[0];
            Object obj2 = objArr[1];
            DownloadOptions downloadOptions = (DownloadOptions) objArr[2];
            String str = (String) obj;
            c10 = n.c((String) obj2);
            Uri parse = Uri.parse(c10);
            m mVar = m.this;
            Intrinsics.d(parse);
            mVar.Q(parse, kb.c.WRITE);
            m.this.J(parse);
            if (!StringsKt.K(str, ":", false, 2, null)) {
                Context T10 = m.this.T();
                InputStream openRawResource = T10.getResources().openRawResource(T10.getResources().getIdentifier(str, "raw", T10.getPackageName()));
                Intrinsics.checkNotNullExpressionValue(openRawResource, "openRawResource(...)");
                InterfaceC3879g c11 = pe.M.c(pe.M.k(openRawResource));
                File i02 = m.this.i0(parse);
                i02.delete();
                InterfaceC3878f b10 = pe.M.b(pe.N.g(i02, false, 1, null));
                b10.s0(c11);
                b10.close();
                Bundle bundle = new Bundle();
                bundle.putString("uri", Uri.fromFile(i02).toString());
                boolean md5 = downloadOptions.getMd5();
                if ((md5 ? Boolean.valueOf(md5) : null) != null) {
                    bundle.putString("md5", m.this.b0(i02));
                }
                promise.resolve(bundle);
                return;
            }
            if (!Intrinsics.b("file", parse.getScheme())) {
                throw new IOException("Unsupported scheme for location '" + parse + "'.");
            }
            D.a x10 = new D.a().x(str);
            if (downloadOptions.getHeaders() != null) {
                for (Map.Entry<String, String> entry : downloadOptions.getHeaders().entrySet()) {
                    x10.a(entry.getKey(), entry.getValue());
                }
            }
            Td.B Y10 = m.this.Y();
            if (Y10 != null && (a10 = Y10.a(x10.b())) != null) {
                a10.g1(new C1059l(promise, m.this, parse, downloadOptions));
                r6 = Unit.f36324a;
            }
            if (r6 == null) {
                promise.h(new o());
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (pb.m) obj2);
            return Unit.f36324a;
        }
    }

    /* renamed from: Oa.m$o, reason: case insensitive filesystem */
    public static final class C1061o extends xc.m implements Function1 {
        public C1061o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            String c10;
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            Object obj = objArr[0];
            Object obj2 = objArr[1];
            WritingOptions writingOptions = (WritingOptions) objArr[2];
            String str = (String) obj2;
            c10 = n.c((String) obj);
            Uri parse = Uri.parse(c10);
            m mVar = m.this;
            Intrinsics.d(parse);
            mVar.Q(parse, kb.c.WRITE);
            EncodingType encoding = writingOptions.getEncoding();
            OutputStream Z10 = m.this.Z(parse);
            try {
                if (encoding == EncodingType.BASE64) {
                    Z10.write(Base64.decode(str, 0));
                } else {
                    OutputStreamWriter outputStreamWriter = new OutputStreamWriter(Z10);
                    try {
                        outputStreamWriter.write(str);
                        Unit unit = Unit.f36324a;
                        kotlin.io.c.a(outputStreamWriter, null);
                    } finally {
                    }
                }
                Unit unit2 = Unit.f36324a;
                kotlin.io.c.a(Z10, null);
                return Unit.f36324a;
            } finally {
            }
        }
    }

    public static final class o0 extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final o0 f7252a = new o0();

        public o0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(String.class);
        }
    }

    /* renamed from: Oa.m$p, reason: case insensitive filesystem */
    public static final class C1062p extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final C1062p f7253a = new C1062p();

        public C1062p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(String.class);
        }
    }

    public static final class p0 extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final p0 f7254a = new p0();

        public p0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(String.class);
        }
    }

    /* renamed from: Oa.m$q, reason: case insensitive filesystem */
    public static final class C1063q extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final C1063q f7255a = new C1063q();

        public C1063q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(DeletingOptions.class);
        }
    }

    public static final class q0 extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final q0 f7256a = new q0();

        public q0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(String.class);
        }
    }

    /* renamed from: Oa.m$r, reason: case insensitive filesystem */
    public static final class C1064r extends xc.m implements Function1 {
        public C1064r() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            String c10;
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            Object obj = objArr[0];
            DeletingOptions deletingOptions = (DeletingOptions) objArr[1];
            c10 = n.c((String) obj);
            Uri parse = Uri.parse(c10);
            Uri withAppendedPath = Uri.withAppendedPath(parse, "..");
            m mVar = m.this;
            Intrinsics.d(withAppendedPath);
            mVar.R(withAppendedPath, kb.c.WRITE, "Location '" + parse + "' isn't deletable.");
            if (Intrinsics.b(parse.getScheme(), "file")) {
                m mVar2 = m.this;
                Intrinsics.d(parse);
                File i02 = mVar2.i0(parse);
                if (i02.exists()) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        ue.c.k(i02);
                    } else {
                        m.this.S(i02);
                    }
                } else if (!deletingOptions.getIdempotent()) {
                    throw new l(parse);
                }
            } else {
                m mVar3 = m.this;
                Intrinsics.d(parse);
                if (!mVar3.a0(parse)) {
                    throw new IOException("Unsupported scheme for location '" + parse + "'.");
                }
                N0.a X10 = m.this.X(parse);
                if (X10 != null && X10.f()) {
                    X10.e();
                } else if (!deletingOptions.getIdempotent()) {
                    throw new l(parse);
                }
            }
            return Unit.f36324a;
        }
    }

    public static final class r0 extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final r0 f7258a = new r0();

        public r0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(DownloadOptions.class);
        }
    }

    /* renamed from: Oa.m$s, reason: case insensitive filesystem */
    public static final class C1065s extends xc.m implements Function2 {
        public C1065s() {
            super(2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Object[] objArr, pb.m promise) {
            String c10;
            String c11;
            Intrinsics.checkNotNullParameter(objArr, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(promise, "promise");
            RelocatingOptions relocatingOptions = (RelocatingOptions) promise;
            c10 = n.c(relocatingOptions.getFrom());
            Uri parse = Uri.parse(c10);
            m mVar = m.this;
            Uri withAppendedPath = Uri.withAppendedPath(parse, "..");
            Intrinsics.checkNotNullExpressionValue(withAppendedPath, "withAppendedPath(...)");
            kb.c cVar = kb.c.WRITE;
            mVar.R(withAppendedPath, cVar, "Location '" + parse + "' isn't movable.");
            c11 = n.c(relocatingOptions.getTo());
            Uri parse2 = Uri.parse(c11);
            m mVar2 = m.this;
            Intrinsics.d(parse2);
            mVar2.Q(parse2, cVar);
            if (Intrinsics.b(parse.getScheme(), "file")) {
                m mVar3 = m.this;
                Intrinsics.d(parse);
                if (!mVar3.i0(parse).renameTo(m.this.i0(parse2))) {
                    throw new i(parse, parse2);
                }
                return;
            }
            m mVar4 = m.this;
            Intrinsics.d(parse);
            if (!mVar4.a0(parse)) {
                throw new IOException("Unsupported scheme for location '" + parse + "'.");
            }
            N0.a X10 = m.this.X(parse);
            if (X10 == null || !X10.f()) {
                throw new i(parse, parse2);
            }
            m.this.j0(X10, m.this.i0(parse2), false);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (pb.m) obj2);
            return Unit.f36324a;
        }
    }

    public static final class s0 extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final s0 f7260a = new s0();

        public s0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.f(String.class);
        }
    }

    /* renamed from: Oa.m$t, reason: case insensitive filesystem */
    public static final class C1066t extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final C1066t f7261a = new C1066t();

        public C1066t() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(RelocatingOptions.class);
        }
    }

    public static final class t0 extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final t0 f7262a = new t0();

        public t0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.f(String.class);
        }
    }

    /* renamed from: Oa.m$u, reason: case insensitive filesystem */
    public static final class C1067u extends xc.m implements Function1 {
        public C1067u() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            String c10;
            String c11;
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            RelocatingOptions relocatingOptions = (RelocatingOptions) objArr[0];
            c10 = n.c(relocatingOptions.getFrom());
            Uri parse = Uri.parse(c10);
            m mVar = m.this;
            Uri withAppendedPath = Uri.withAppendedPath(parse, "..");
            Intrinsics.checkNotNullExpressionValue(withAppendedPath, "withAppendedPath(...)");
            kb.c cVar = kb.c.WRITE;
            mVar.R(withAppendedPath, cVar, "Location '" + parse + "' isn't movable.");
            c11 = n.c(relocatingOptions.getTo());
            Uri parse2 = Uri.parse(c11);
            m mVar2 = m.this;
            Intrinsics.d(parse2);
            mVar2.Q(parse2, cVar);
            if (Intrinsics.b(parse.getScheme(), "file")) {
                m mVar3 = m.this;
                Intrinsics.d(parse);
                if (!mVar3.i0(parse).renameTo(m.this.i0(parse2))) {
                    throw new i(parse, parse2);
                }
            } else {
                m mVar4 = m.this;
                Intrinsics.d(parse);
                if (!mVar4.a0(parse)) {
                    throw new IOException("Unsupported scheme for location '" + parse + "'.");
                }
                N0.a X10 = m.this.X(parse);
                if (X10 == null || !X10.f()) {
                    throw new i(parse, parse2);
                }
                m.this.j0(X10, m.this.i0(parse2), false);
            }
            return Unit.f36324a;
        }
    }

    public static final class u0 extends xc.m implements Function2 {
        public u0() {
            super(2);
        }

        public final void a(Object[] objArr, pb.m promise) {
            String c10;
            B.a A10;
            B.a a10;
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            Intrinsics.checkNotNullParameter(promise, "promise");
            Object obj = objArr[0];
            Object obj2 = objArr[1];
            Object obj3 = objArr[2];
            Object obj4 = objArr[3];
            String str = (String) objArr[4];
            DownloadOptions downloadOptions = (DownloadOptions) obj4;
            String str2 = (String) obj3;
            String str3 = (String) obj;
            c10 = n.c((String) obj2);
            Uri parse = Uri.parse(c10);
            m mVar = m.this;
            Intrinsics.d(parse);
            mVar.J(parse);
            if (!Intrinsics.b(parse.getScheme(), "file")) {
                throw new IOException("Unsupported scheme for location '" + parse + "'.");
            }
            C1060n c1060n = new C1060n(str, str2, m.this);
            Td.B Y10 = m.this.Y();
            Td.B c11 = (Y10 == null || (A10 = Y10.A()) == null || (a10 = A10.a(new G0(c1060n))) == null) ? null : a10.c();
            if (c11 == null) {
                promise.h(new o());
                return;
            }
            D.a aVar = new D.a();
            if (str != null) {
                aVar.a("Range", "bytes=" + str + "-");
            }
            if (downloadOptions.getHeaders() != null) {
                for (Map.Entry<String, String> entry : downloadOptions.getHeaders().entrySet()) {
                    aVar.a(entry.getKey(), entry.getValue());
                }
            }
            InterfaceC1229e a11 = c11.a(aVar.x(str3).b());
            m.this.taskHandlers.put(str2, new C1042b(parse, a11));
            AbstractC0891k.d(m.this.moduleCoroutineScope, null, null, m.this.new C0139m(new C1040a(downloadOptions, a11, m.this.i0(parse), str != null, promise), null), 3, null);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (pb.m) obj2);
            return Unit.f36324a;
        }
    }

    /* renamed from: Oa.m$v, reason: case insensitive filesystem */
    public static final class C1068v extends xc.m implements Function2 {
        public C1068v() {
            super(2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Object[] objArr, pb.m promise) {
            String c10;
            String c11;
            Intrinsics.checkNotNullParameter(objArr, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(promise, "promise");
            RelocatingOptions relocatingOptions = (RelocatingOptions) promise;
            c10 = n.c(relocatingOptions.getFrom());
            Uri parse = Uri.parse(c10);
            m mVar = m.this;
            Intrinsics.d(parse);
            mVar.R(parse, kb.c.READ, "Location '" + parse + "' isn't readable.");
            c11 = n.c(relocatingOptions.getTo());
            Uri parse2 = Uri.parse(c11);
            m mVar2 = m.this;
            Intrinsics.d(parse2);
            mVar2.Q(parse2, kb.c.WRITE);
            if (Intrinsics.b(parse.getScheme(), "file")) {
                File i02 = m.this.i0(parse);
                File i03 = m.this.i0(parse2);
                if (i02.isDirectory()) {
                    ue.c.c(i02, i03);
                    return;
                } else {
                    ue.c.f(i02, i03);
                    return;
                }
            }
            if (m.this.a0(parse)) {
                N0.a X10 = m.this.X(parse);
                if (X10 == null || !X10.f()) {
                    throw new k(parse);
                }
                m.this.j0(X10, m.this.i0(parse2), true);
                return;
            }
            if (Intrinsics.b(parse.getScheme(), "content")) {
                ue.d.a(m.this.T().getContentResolver().openInputStream(parse), new FileOutputStream(m.this.i0(parse2)));
                return;
            }
            if (Intrinsics.b(parse.getScheme(), "asset")) {
                ue.d.a(m.this.c0(parse), new FileOutputStream(m.this.i0(parse2)));
                return;
            }
            if (parse.getScheme() == null) {
                ue.d.a(m.this.d0(relocatingOptions.getFrom()), new FileOutputStream(m.this.i0(parse2)));
                return;
            }
            throw new IOException("Unsupported scheme for location '" + parse + "'.");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (pb.m) obj2);
            return Unit.f36324a;
        }
    }

    public static final class v0 extends xc.m implements Function2 {
        public v0() {
            super(2);
        }

        public final void a(Object[] objArr, pb.m promise) {
            String c10;
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            Intrinsics.checkNotNullParameter(promise, "promise");
            String str = (String) objArr[0];
            if (m.this.dirPermissionsRequest != null) {
                throw new p();
            }
            Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
            if (Build.VERSION.SDK_INT >= 26 && str != null) {
                c10 = n.c(str);
                Uri parse = Uri.parse(c10);
                if (parse != null) {
                    intent.putExtra("android.provider.extra.INITIAL_URI", parse);
                }
            }
            m.this.dirPermissionsRequest = promise;
            m.this.a().x().startActivityForResult(intent, 5394);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (pb.m) obj2);
            return Unit.f36324a;
        }
    }

    /* renamed from: Oa.m$w, reason: case insensitive filesystem */
    public static final class C1069w extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final C1069w f7267a = new C1069w();

        public C1069w() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(RelocatingOptions.class);
        }
    }

    public static final class w0 extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final w0 f7268a = new w0();

        public w0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(String.class);
        }
    }

    /* renamed from: Oa.m$x, reason: case insensitive filesystem */
    public static final class C1070x extends xc.m implements Function1 {
        public C1070x() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            String c10;
            String c11;
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            RelocatingOptions relocatingOptions = (RelocatingOptions) objArr[0];
            c10 = n.c(relocatingOptions.getFrom());
            Uri parse = Uri.parse(c10);
            m mVar = m.this;
            Intrinsics.d(parse);
            mVar.R(parse, kb.c.READ, "Location '" + parse + "' isn't readable.");
            c11 = n.c(relocatingOptions.getTo());
            Uri parse2 = Uri.parse(c11);
            m mVar2 = m.this;
            Intrinsics.d(parse2);
            mVar2.Q(parse2, kb.c.WRITE);
            if (Intrinsics.b(parse.getScheme(), "file")) {
                File i02 = m.this.i0(parse);
                File i03 = m.this.i0(parse2);
                if (i02.isDirectory()) {
                    ue.c.c(i02, i03);
                } else {
                    ue.c.f(i02, i03);
                }
                return Unit.f36324a;
            }
            if (m.this.a0(parse)) {
                N0.a X10 = m.this.X(parse);
                if (X10 == null || !X10.f()) {
                    throw new k(parse);
                }
                m.this.j0(X10, m.this.i0(parse2), true);
                return Unit.f36324a;
            }
            if (Intrinsics.b(parse.getScheme(), "content")) {
                return Integer.valueOf(ue.d.a(m.this.T().getContentResolver().openInputStream(parse), new FileOutputStream(m.this.i0(parse2))));
            }
            if (Intrinsics.b(parse.getScheme(), "asset")) {
                return Integer.valueOf(ue.d.a(m.this.c0(parse), new FileOutputStream(m.this.i0(parse2))));
            }
            if (parse.getScheme() == null) {
                return Integer.valueOf(ue.d.a(m.this.d0(relocatingOptions.getFrom()), new FileOutputStream(m.this.i0(parse2))));
            }
            throw new IOException("Unsupported scheme for location '" + parse + "'.");
        }
    }

    public static final class x0 extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final x0 f7270a = new x0();

        public x0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(String.class);
        }
    }

    /* renamed from: Oa.m$y, reason: case insensitive filesystem */
    public static final class C1071y extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final C1071y f7271a = new C1071y();

        public C1071y() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(String.class);
        }
    }

    public static final class y0 extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final y0 f7272a = new y0();

        public y0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(FileSystemUploadOptions.class);
        }
    }

    /* renamed from: Oa.m$z, reason: case insensitive filesystem */
    public static final class C1072z extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final C1072z f7273a = new C1072z();

        public C1072z() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(String.class);
        }
    }

    public static final class z0 extends xc.m implements Function2 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ xb.b f7275b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z0(xb.b bVar) {
            super(2);
            this.f7275b = bVar;
        }

        public final void a(Object[] objArr, pb.m promise) {
            Unit unit;
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            Intrinsics.checkNotNullParameter(promise, "promise");
            Object obj = objArr[0];
            Object obj2 = objArr[1];
            FileSystemUploadOptions fileSystemUploadOptions = (FileSystemUploadOptions) objArr[2];
            m mVar = m.this;
            Td.D N10 = mVar.N((String) obj, (String) obj2, fileSystemUploadOptions, C1054h.f7226a);
            Td.B Y10 = m.this.Y();
            if (Y10 != null) {
                Y10.a(N10).g1(new C1052g(promise, m.this));
                unit = Unit.f36324a;
            } else {
                unit = null;
            }
            if (unit == null) {
                promise.h(new o());
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (pb.m) obj2);
            return Unit.f36324a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(Uri uri) {
        File i02 = i0(uri);
        File parentFile = i02.getParentFile();
        if (parentFile == null || !parentFile.exists()) {
            throw new IOException("Directory for '" + i02.getPath() + "' doesn't exist. Please make sure directory '" + i02.getParent() + "' exists before calling downloadAsync.");
        }
    }

    private final void K(Uri uri) {
        File i02 = i0(uri);
        if (i02.exists()) {
            return;
        }
        throw new IOException("Directory for '" + i02.getPath() + "' doesn't exist.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Uri L(File file) {
        Uri h10 = androidx.core.content.b.h(a().x().getApplication(), a().x().getApplication().getPackageName() + ".FileSystemFileProvider", file);
        Intrinsics.checkNotNullExpressionValue(h10, "getUriForFile(...)");
        return h10;
    }

    private final Td.E M(FileSystemUploadOptions options, s decorator, File file) {
        int i10 = C1050f.f7221a[options.getUploadType().ordinal()];
        if (i10 == 1) {
            return decorator.a(Td.E.Companion.g(file, null));
        }
        if (i10 != 2) {
            throw new lc.m();
        }
        A.a f10 = new A.a(null, 1, null).f(Td.A.f9780k);
        Map<String, String> parameters = options.getParameters();
        if (parameters != null) {
            for (Map.Entry<String, String> entry : parameters.entrySet()) {
                f10.a(entry.getKey(), entry.getValue().toString());
            }
        }
        String mimeType = options.getMimeType();
        if (mimeType == null) {
            mimeType = URLConnection.guessContentTypeFromName(file.getName());
            Intrinsics.checkNotNullExpressionValue(mimeType, "guessContentTypeFromName(...)");
        }
        String fieldName = options.getFieldName();
        if (fieldName == null) {
            fieldName = file.getName();
        }
        Intrinsics.d(fieldName);
        f10.b(fieldName, file.getName(), decorator.a(Td.E.Companion.g(file, Td.z.f10239e.b(mimeType))));
        return f10.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Td.D N(String url, String fileUriString, FileSystemUploadOptions options, s decorator) {
        String c10;
        c10 = n.c(fileUriString);
        Uri parse = Uri.parse(c10);
        Intrinsics.d(parse);
        Q(parse, kb.c.READ);
        K(parse);
        D.a x10 = new D.a().x(url);
        Map<String, String> headers = options.getHeaders();
        if (headers != null) {
            for (Map.Entry<String, String> entry : headers.entrySet()) {
                x10.a(entry.getKey(), entry.getValue());
            }
        }
        return x10.n(options.getHttpMethod().getValue(), M(options, decorator, i0(parse))).b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object O(C1040a c1040a, kotlin.coroutines.d dVar) {
        return AbstractC0887i.g(C0874b0.b(), new H0(c1040a, this, null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P(File dir) {
        if (dir.isDirectory() || dir.mkdirs()) {
            return;
        }
        throw new IOException("Couldn't create directory '" + dir + "'");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q(Uri uri, kb.c permission) {
        if (permission == kb.c.READ) {
            R(uri, permission, "Location '" + uri + "' isn't readable.");
        }
        if (permission == kb.c.WRITE) {
            R(uri, permission, "Location '" + uri + "' isn't writable.");
        }
        R(uri, permission, "Location '" + uri + "' doesn't have permission '" + permission.name() + "'.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R(Uri uri, kb.c permission, String errorMsg) {
        EnumSet h02 = h0(uri);
        if (h02 == null || !h02.contains(permission)) {
            throw new IOException(errorMsg);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S(File file) {
        if (!file.isDirectory()) {
            if (file.delete()) {
                return;
            }
            throw new IOException("Unable to delete file: " + file);
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            throw new IOException("Failed to list contents of " + file);
        }
        IOException e10 = null;
        for (File file2 : listFiles) {
            try {
                Intrinsics.d(file2);
                S(file2);
            } catch (IOException e11) {
                e10 = e11;
            }
        }
        if (e10 != null) {
            throw e10;
        }
        if (file.delete()) {
            return;
        }
        throw new IOException("Unable to delete directory " + file + ".");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context T() {
        Context w10 = a().w();
        if (w10 != null) {
            return w10;
        }
        throw new expo.modules.kotlin.exception.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long U(File file) {
        Object obj;
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return 0L;
        }
        ArrayList arrayList = new ArrayList(listFiles.length);
        for (File file2 : listFiles) {
            Intrinsics.d(file2);
            arrayList.add(Long.valueOf(U(file2)));
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            while (it.hasNext()) {
                next = Long.valueOf(((Number) next).longValue() + ((Number) it.next()).longValue());
            }
            obj = next;
        } else {
            obj = null;
        }
        Long l10 = (Long) obj;
        if (l10 != null) {
            return l10.longValue();
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InputStream V(Uri uri) {
        if (Intrinsics.b(uri.getScheme(), "file")) {
            return new FileInputStream(i0(uri));
        }
        if (Intrinsics.b(uri.getScheme(), "asset")) {
            return c0(uri);
        }
        if (a0(uri)) {
            InputStream openInputStream = T().getContentResolver().openInputStream(uri);
            Intrinsics.d(openInputStream);
            return openInputStream;
        }
        throw new IOException("Unsupported scheme for location '" + uri + "'.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] W(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (IOException unused) {
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        try {
            byteArrayOutputStream.close();
        } catch (IOException unused2) {
        }
        return byteArray;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final N0.a X(Uri uri) {
        N0.a g10 = N0.a.g(T(), uri);
        return (g10 == null || !g10.l()) ? N0.a.h(T(), uri) : g10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized Td.B Y() {
        try {
            if (this.client == null) {
                B.a aVar = new B.a();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                this.client = aVar.g(60L, timeUnit).d0(60L, timeUnit).i0(60L, timeUnit).c();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.client;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OutputStream Z(Uri uri) {
        OutputStream openOutputStream;
        if (Intrinsics.b(uri.getScheme(), "file")) {
            openOutputStream = new FileOutputStream(i0(uri));
        } else {
            if (!a0(uri)) {
                throw new IOException("Unsupported scheme for location '" + uri + "'.");
            }
            openOutputStream = T().getContentResolver().openOutputStream(uri);
            Intrinsics.d(openOutputStream);
        }
        Intrinsics.d(openOutputStream);
        return openOutputStream;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean a0(Uri uri) {
        if (!Intrinsics.b(uri.getScheme(), "content")) {
            return false;
        }
        String host = uri.getHost();
        return host != null ? StringsKt.F(host, "com.android.externalstorage", false, 2, null) : false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String b0(File file) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            char[] a10 = se.a.a(te.a.d(fileInputStream));
            Intrinsics.checkNotNullExpressionValue(a10, "encodeHex(...)");
            String str = new String(a10);
            kotlin.io.c.a(fileInputStream, null);
            return str;
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InputStream c0(Uri uri) {
        String path = uri.getPath();
        if (path == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Intrinsics.checkNotNullExpressionValue(path, "requireNotNull(...)");
        String substring = path.substring(1);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        InputStream open = T().getAssets().open(substring);
        Intrinsics.checkNotNullExpressionValue(open, "open(...)");
        return open;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InputStream d0(String resourceName) {
        int identifier = T().getResources().getIdentifier(resourceName, "raw", T().getPackageName());
        if (identifier != 0 || (identifier = T().getResources().getIdentifier(resourceName, "drawable", T().getPackageName())) != 0) {
            InputStream openRawResource = T().getResources().openRawResource(identifier);
            Intrinsics.checkNotNullExpressionValue(openRawResource, "openRawResource(...)");
            return openRawResource;
        }
        throw new FileNotFoundException("No resource found with the name '" + resourceName + "'");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String e0(String uriStr) {
        String substring = uriStr.substring(StringsKt.W(uriStr, ':', 0, false, 6, null) + 3);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    private final EnumSet f0(String path) {
        InterfaceC3558b n10 = a().n();
        if (n10 != null) {
            return n10.a(T(), path);
        }
        return null;
    }

    private final EnumSet g0(Uri uri) {
        N0.a X10 = X(uri);
        EnumSet noneOf = EnumSet.noneOf(kb.c.class);
        if (X10 != null) {
            if (X10.a()) {
                noneOf.add(kb.c.READ);
            }
            if (X10.b()) {
                noneOf.add(kb.c.WRITE);
            }
        }
        Intrinsics.checkNotNullExpressionValue(noneOf, "apply(...)");
        return noneOf;
    }

    private final EnumSet h0(Uri uri) {
        return a0(uri) ? g0(uri) : Intrinsics.b(uri.getScheme(), "content") ? EnumSet.of(kb.c.READ) : Intrinsics.b(uri.getScheme(), "asset") ? EnumSet.of(kb.c.READ) : Intrinsics.b(uri.getScheme(), "file") ? f0(uri.getPath()) : uri.getScheme() == null ? EnumSet.of(kb.c.READ) : EnumSet.noneOf(kb.c.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File i0(Uri uri) {
        if (uri.getPath() != null) {
            String path = uri.getPath();
            Intrinsics.d(path);
            return new File(path);
        }
        throw new IOException("Invalid Uri: " + uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j0(N0.a documentFile, File outputDir, boolean copy) {
        if (!documentFile.f()) {
            return;
        }
        if (!outputDir.isDirectory()) {
            File parentFile = outputDir.getParentFile();
            if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                throw new IOException("Couldn't create folder in output dir.");
            }
        } else if (!outputDir.exists() && !outputDir.mkdirs()) {
            throw new IOException("Couldn't create folder in output dir.");
        }
        if (documentFile.k()) {
            N0.a[] m10 = documentFile.m();
            Intrinsics.checkNotNullExpressionValue(m10, "listFiles(...)");
            for (N0.a aVar : m10) {
                Intrinsics.d(aVar);
                j0(aVar, outputDir, copy);
            }
            if (copy) {
                return;
            }
            documentFile.e();
            return;
        }
        String i10 = documentFile.i();
        if (i10 == null) {
            return;
        }
        File file = outputDir.isDirectory() ? new File(outputDir.getPath(), i10) : new File(outputDir.getPath());
        InputStream openInputStream = T().getContentResolver().openInputStream(documentFile.j());
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                ue.d.a(openInputStream, fileOutputStream);
                kotlin.io.c.a(fileOutputStream, null);
                kotlin.io.c.a(openInputStream, null);
                if (copy) {
                    return;
                }
                documentFile.e();
            } finally {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                kotlin.io.c.a(openInputStream, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bundle k0(v headers) {
        Bundle bundle = new Bundle();
        int size = headers.size();
        for (int i10 = 0; i10 < size; i10++) {
            String h10 = headers.h(i10);
            if (bundle.containsKey(h10)) {
                bundle.putString(h10, bundle.getString(h10) + ", " + headers.v(i10));
            } else {
                bundle.putString(h10, headers.v(i10));
            }
        }
        return bundle;
    }

    @Override // xb.AbstractC5139a
    public xb.c b() {
        Class cls;
        Object obj;
        Object obj2;
        Object obj3;
        wb.g kVar;
        wb.g kVar2;
        wb.g kVar3;
        wb.g kVar4;
        wb.g kVar5;
        Class cls2;
        Object obj4;
        Boolean bool;
        wb.g eVar;
        Object obj5;
        Boolean bool2;
        wb.g kVar6;
        AbstractC3901a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            xb.b bVar = new xb.b(this);
            bVar.o("ExponentFileSystem");
            bVar.c(t.a("documentDirectory", Uri.fromFile(T().getFilesDir()).toString() + "/"), t.a("cacheDirectory", Uri.fromFile(T().getCacheDir()).toString() + "/"), t.a("bundleDirectory", "asset:///"));
            bVar.d("expo-file-system.downloadProgress", "expo-file-system.uploadProgress");
            Map s10 = bVar.s();
            EnumC5010e enumC5010e = EnumC5010e.MODULE_CREATE;
            s10.put(enumC5010e, new C5006a(enumC5010e, new E0()));
            C0794c c0794c = C0794c.f1454a;
            kotlin.reflect.d b10 = C5142C.b(String.class);
            Boolean bool3 = Boolean.FALSE;
            C0792a c0792a = (C0792a) c0794c.a().get(new Pair(b10, bool3));
            if (c0792a == null) {
                obj2 = pb.m.class;
                cls = DeletingOptions.class;
                obj = Unit.class;
                c0792a = new C0792a(new Db.M(C5142C.b(String.class), false, C1071y.f7271a));
            } else {
                cls = DeletingOptions.class;
                obj = Unit.class;
                obj2 = pb.m.class;
            }
            C0792a c0792a2 = (C0792a) c0794c.a().get(new Pair(C5142C.b(InfoOptions.class), bool3));
            if (c0792a2 == null) {
                c0792a2 = new C0792a(new Db.M(C5142C.b(InfoOptions.class), false, J.f7187a));
            }
            C0792a[] c0792aArr = {c0792a, c0792a2};
            U u10 = new U();
            Class cls3 = Integer.TYPE;
            bVar.k().put("getInfoAsync", Intrinsics.b(Bundle.class, cls3) ? new wb.k("getInfoAsync", c0792aArr, u10) : Intrinsics.b(Bundle.class, Boolean.TYPE) ? new wb.h("getInfoAsync", c0792aArr, u10) : Intrinsics.b(Bundle.class, Double.TYPE) ? new wb.i("getInfoAsync", c0792aArr, u10) : Intrinsics.b(Bundle.class, Float.TYPE) ? new wb.j("getInfoAsync", c0792aArr, u10) : Intrinsics.b(Bundle.class, String.class) ? new wb.m("getInfoAsync", c0792aArr, u10) : new wb.e("getInfoAsync", c0792aArr, u10));
            C0792a c0792a3 = (C0792a) c0794c.a().get(new Pair(C5142C.b(String.class), bool3));
            if (c0792a3 == null) {
                c0792a3 = new C0792a(new Db.M(C5142C.b(String.class), false, C1045c0.f7212a));
            }
            C0792a c0792a4 = (C0792a) c0794c.a().get(new Pair(C5142C.b(ReadingOptions.class), bool3));
            if (c0792a4 == null) {
                c0792a4 = new C0792a(new Db.M(C5142C.b(ReadingOptions.class), false, C1047d0.f7218a));
            }
            bVar.k().put("readAsStringAsync", new wb.e("readAsStringAsync", new C0792a[]{c0792a3, c0792a4}, new C1049e0()));
            C0792a c0792a5 = (C0792a) c0794c.a().get(new Pair(C5142C.b(String.class), bool3));
            if (c0792a5 == null) {
                c0792a5 = new C0792a(new Db.M(C5142C.b(String.class), false, C1051f0.f7222a));
            }
            C0792a c0792a6 = (C0792a) c0794c.a().get(new Pair(C5142C.b(String.class), bool3));
            if (c0792a6 == null) {
                c0792a6 = new C0792a(new Db.M(C5142C.b(String.class), false, C1053g0.f7225a));
            }
            C0792a c0792a7 = (C0792a) c0794c.a().get(new Pair(C5142C.b(WritingOptions.class), bool3));
            if (c0792a7 == null) {
                c0792a7 = new C0792a(new Db.M(C5142C.b(WritingOptions.class), false, C1055h0.f7227a));
            }
            C0792a[] c0792aArr2 = {c0792a5, c0792a6, c0792a7};
            C1061o c1061o = new C1061o();
            Object obj6 = obj;
            bVar.k().put("writeAsStringAsync", Intrinsics.b(obj6, cls3) ? new wb.k("writeAsStringAsync", c0792aArr2, c1061o) : Intrinsics.b(obj6, Boolean.TYPE) ? new wb.h("writeAsStringAsync", c0792aArr2, c1061o) : Intrinsics.b(obj6, Double.TYPE) ? new wb.i("writeAsStringAsync", c0792aArr2, c1061o) : Intrinsics.b(obj6, Float.TYPE) ? new wb.j("writeAsStringAsync", c0792aArr2, c1061o) : Intrinsics.b(obj6, String.class) ? new wb.m("writeAsStringAsync", c0792aArr2, c1061o) : new wb.e("writeAsStringAsync", c0792aArr2, c1061o));
            C0792a c0792a8 = (C0792a) c0794c.a().get(new Pair(C5142C.b(String.class), bool3));
            if (c0792a8 == null) {
                c0792a8 = new C0792a(new Db.M(C5142C.b(String.class), false, C1062p.f7253a));
            }
            C0792a c0792a9 = (C0792a) c0794c.a().get(new Pair(C5142C.b(cls), bool3));
            if (c0792a9 == null) {
                c0792a9 = new C0792a(new Db.M(C5142C.b(cls), false, C1063q.f7255a));
            }
            C0792a[] c0792aArr3 = {c0792a8, c0792a9};
            C1064r c1064r = new C1064r();
            bVar.k().put("deleteAsync", Intrinsics.b(obj6, cls3) ? new wb.k("deleteAsync", c0792aArr3, c1064r) : Intrinsics.b(obj6, Boolean.TYPE) ? new wb.h("deleteAsync", c0792aArr3, c1064r) : Intrinsics.b(obj6, Double.TYPE) ? new wb.i("deleteAsync", c0792aArr3, c1064r) : Intrinsics.b(obj6, Float.TYPE) ? new wb.j("deleteAsync", c0792aArr3, c1064r) : Intrinsics.b(obj6, String.class) ? new wb.m("deleteAsync", c0792aArr3, c1064r) : new wb.e("deleteAsync", c0792aArr3, c1064r));
            Object obj7 = obj2;
            if (Intrinsics.b(RelocatingOptions.class, obj7)) {
                kVar = new wb.f("moveAsync", new C0792a[0], new C1065s());
                obj3 = Bundle.class;
            } else {
                C0792a c0792a10 = (C0792a) c0794c.a().get(new Pair(C5142C.b(RelocatingOptions.class), bool3));
                if (c0792a10 == null) {
                    obj3 = Bundle.class;
                    c0792a10 = new C0792a(new Db.M(C5142C.b(RelocatingOptions.class), false, C1066t.f7261a));
                } else {
                    obj3 = Bundle.class;
                }
                C0792a[] c0792aArr4 = {c0792a10};
                C1067u c1067u = new C1067u();
                kVar = Intrinsics.b(obj6, cls3) ? new wb.k("moveAsync", c0792aArr4, c1067u) : Intrinsics.b(obj6, Boolean.TYPE) ? new wb.h("moveAsync", c0792aArr4, c1067u) : Intrinsics.b(obj6, Double.TYPE) ? new wb.i("moveAsync", c0792aArr4, c1067u) : Intrinsics.b(obj6, Float.TYPE) ? new wb.j("moveAsync", c0792aArr4, c1067u) : Intrinsics.b(obj6, String.class) ? new wb.m("moveAsync", c0792aArr4, c1067u) : new wb.e("moveAsync", c0792aArr4, c1067u);
            }
            bVar.k().put("moveAsync", kVar);
            if (Intrinsics.b(RelocatingOptions.class, obj7)) {
                kVar2 = new wb.f("copyAsync", new C0792a[0], new C1068v());
            } else {
                C0792a c0792a11 = (C0792a) c0794c.a().get(new Pair(C5142C.b(RelocatingOptions.class), bool3));
                if (c0792a11 == null) {
                    c0792a11 = new C0792a(new Db.M(C5142C.b(RelocatingOptions.class), false, C1069w.f7267a));
                }
                C0792a[] c0792aArr5 = {c0792a11};
                C1070x c1070x = new C1070x();
                kVar2 = Intrinsics.b(Object.class, cls3) ? new wb.k("copyAsync", c0792aArr5, c1070x) : Intrinsics.b(Object.class, Boolean.TYPE) ? new wb.h("copyAsync", c0792aArr5, c1070x) : Intrinsics.b(Object.class, Double.TYPE) ? new wb.i("copyAsync", c0792aArr5, c1070x) : Intrinsics.b(Object.class, Float.TYPE) ? new wb.j("copyAsync", c0792aArr5, c1070x) : Intrinsics.b(Object.class, String.class) ? new wb.m("copyAsync", c0792aArr5, c1070x) : new wb.e("copyAsync", c0792aArr5, c1070x);
            }
            bVar.k().put("copyAsync", kVar2);
            C0792a c0792a12 = (C0792a) c0794c.a().get(new Pair(C5142C.b(String.class), bool3));
            if (c0792a12 == null) {
                c0792a12 = new C0792a(new Db.M(C5142C.b(String.class), false, C1072z.f7273a));
            }
            C0792a c0792a13 = (C0792a) c0794c.a().get(new Pair(C5142C.b(MakeDirectoryOptions.class), bool3));
            if (c0792a13 == null) {
                c0792a13 = new C0792a(new Db.M(C5142C.b(MakeDirectoryOptions.class), false, A.f7170a));
            }
            C0792a[] c0792aArr6 = {c0792a12, c0792a13};
            B b11 = new B();
            bVar.k().put("makeDirectoryAsync", Intrinsics.b(obj6, cls3) ? new wb.k("makeDirectoryAsync", c0792aArr6, b11) : Intrinsics.b(obj6, Boolean.TYPE) ? new wb.h("makeDirectoryAsync", c0792aArr6, b11) : Intrinsics.b(obj6, Double.TYPE) ? new wb.i("makeDirectoryAsync", c0792aArr6, b11) : Intrinsics.b(obj6, Float.TYPE) ? new wb.j("makeDirectoryAsync", c0792aArr6, b11) : Intrinsics.b(obj6, String.class) ? new wb.m("makeDirectoryAsync", c0792aArr6, b11) : new wb.e("makeDirectoryAsync", c0792aArr6, b11));
            if (Intrinsics.b(String.class, obj7)) {
                kVar3 = new wb.f("readDirectoryAsync", new C0792a[0], new C());
            } else {
                C0792a c0792a14 = (C0792a) c0794c.a().get(new Pair(C5142C.b(String.class), Boolean.TRUE));
                if (c0792a14 == null) {
                    c0792a14 = new C0792a(new Db.M(C5142C.b(String.class), true, D.f7176a));
                }
                C0792a[] c0792aArr7 = {c0792a14};
                E e10 = new E();
                kVar3 = Intrinsics.b(List.class, cls3) ? new wb.k("readDirectoryAsync", c0792aArr7, e10) : Intrinsics.b(List.class, Boolean.TYPE) ? new wb.h("readDirectoryAsync", c0792aArr7, e10) : Intrinsics.b(List.class, Double.TYPE) ? new wb.i("readDirectoryAsync", c0792aArr7, e10) : Intrinsics.b(List.class, Float.TYPE) ? new wb.j("readDirectoryAsync", c0792aArr7, e10) : Intrinsics.b(List.class, String.class) ? new wb.m("readDirectoryAsync", c0792aArr7, e10) : new wb.e("readDirectoryAsync", c0792aArr7, e10);
            }
            bVar.k().put("readDirectoryAsync", kVar3);
            C0792a[] c0792aArr8 = new C0792a[0];
            F f10 = new F();
            bVar.k().put("getTotalDiskCapacityAsync", Intrinsics.b(Double.class, cls3) ? new wb.k("getTotalDiskCapacityAsync", c0792aArr8, f10) : Intrinsics.b(Double.class, Boolean.TYPE) ? new wb.h("getTotalDiskCapacityAsync", c0792aArr8, f10) : Intrinsics.b(Double.class, Double.TYPE) ? new wb.i("getTotalDiskCapacityAsync", c0792aArr8, f10) : Intrinsics.b(Double.class, Float.TYPE) ? new wb.j("getTotalDiskCapacityAsync", c0792aArr8, f10) : Intrinsics.b(Double.class, String.class) ? new wb.m("getTotalDiskCapacityAsync", c0792aArr8, f10) : new wb.e("getTotalDiskCapacityAsync", c0792aArr8, f10));
            C0792a[] c0792aArr9 = new C0792a[0];
            G g10 = new G();
            bVar.k().put("getFreeDiskStorageAsync", Intrinsics.b(Double.class, cls3) ? new wb.k("getFreeDiskStorageAsync", c0792aArr9, g10) : Intrinsics.b(Double.class, Boolean.TYPE) ? new wb.h("getFreeDiskStorageAsync", c0792aArr9, g10) : Intrinsics.b(Double.class, Double.TYPE) ? new wb.i("getFreeDiskStorageAsync", c0792aArr9, g10) : Intrinsics.b(Double.class, Float.TYPE) ? new wb.j("getFreeDiskStorageAsync", c0792aArr9, g10) : Intrinsics.b(Double.class, String.class) ? new wb.m("getFreeDiskStorageAsync", c0792aArr9, g10) : new wb.e("getFreeDiskStorageAsync", c0792aArr9, g10));
            if (Intrinsics.b(String.class, obj7)) {
                kVar4 = new wb.f("getContentUriAsync", new C0792a[0], new H());
            } else {
                C0792a c0792a15 = (C0792a) c0794c.a().get(new Pair(C5142C.b(String.class), bool3));
                if (c0792a15 == null) {
                    c0792a15 = new C0792a(new Db.M(C5142C.b(String.class), false, I.f7186a));
                }
                C0792a[] c0792aArr10 = {c0792a15};
                K k10 = new K();
                kVar4 = Intrinsics.b(String.class, cls3) ? new wb.k("getContentUriAsync", c0792aArr10, k10) : Intrinsics.b(String.class, Boolean.TYPE) ? new wb.h("getContentUriAsync", c0792aArr10, k10) : Intrinsics.b(String.class, Double.TYPE) ? new wb.i("getContentUriAsync", c0792aArr10, k10) : Intrinsics.b(String.class, Float.TYPE) ? new wb.j("getContentUriAsync", c0792aArr10, k10) : Intrinsics.b(String.class, String.class) ? new wb.m("getContentUriAsync", c0792aArr10, k10) : new wb.e("getContentUriAsync", c0792aArr10, k10);
            }
            bVar.k().put("getContentUriAsync", kVar4);
            if (Intrinsics.b(String.class, obj7)) {
                kVar5 = new wb.f("readSAFDirectoryAsync", new C0792a[0], new L());
            } else {
                C0792a c0792a16 = (C0792a) c0794c.a().get(new Pair(C5142C.b(String.class), bool3));
                if (c0792a16 == null) {
                    c0792a16 = new C0792a(new Db.M(C5142C.b(String.class), false, M.f7190a));
                }
                C0792a[] c0792aArr11 = {c0792a16};
                N n10 = new N();
                kVar5 = Intrinsics.b(List.class, cls3) ? new wb.k("readSAFDirectoryAsync", c0792aArr11, n10) : Intrinsics.b(List.class, Boolean.TYPE) ? new wb.h("readSAFDirectoryAsync", c0792aArr11, n10) : Intrinsics.b(List.class, Double.TYPE) ? new wb.i("readSAFDirectoryAsync", c0792aArr11, n10) : Intrinsics.b(List.class, Float.TYPE) ? new wb.j("readSAFDirectoryAsync", c0792aArr11, n10) : Intrinsics.b(List.class, String.class) ? new wb.m("readSAFDirectoryAsync", c0792aArr11, n10) : new wb.e("readSAFDirectoryAsync", c0792aArr11, n10);
            }
            bVar.k().put("readSAFDirectoryAsync", kVar5);
            C0792a c0792a17 = (C0792a) c0794c.a().get(new Pair(C5142C.b(String.class), bool3));
            if (c0792a17 == null) {
                c0792a17 = new C0792a(new Db.M(C5142C.b(String.class), false, O.f7192a));
            }
            C0792a c0792a18 = (C0792a) c0794c.a().get(new Pair(C5142C.b(String.class), bool3));
            if (c0792a18 == null) {
                c0792a18 = new C0792a(new Db.M(C5142C.b(String.class), false, P.f7193a));
            }
            C0792a[] c0792aArr12 = {c0792a17, c0792a18};
            Q q10 = new Q();
            bVar.k().put("makeSAFDirectoryAsync", Intrinsics.b(String.class, cls3) ? new wb.k("makeSAFDirectoryAsync", c0792aArr12, q10) : Intrinsics.b(String.class, Boolean.TYPE) ? new wb.h("makeSAFDirectoryAsync", c0792aArr12, q10) : Intrinsics.b(String.class, Double.TYPE) ? new wb.i("makeSAFDirectoryAsync", c0792aArr12, q10) : Intrinsics.b(String.class, Float.TYPE) ? new wb.j("makeSAFDirectoryAsync", c0792aArr12, q10) : Intrinsics.b(String.class, String.class) ? new wb.m("makeSAFDirectoryAsync", c0792aArr12, q10) : new wb.e("makeSAFDirectoryAsync", c0792aArr12, q10));
            C0792a c0792a19 = (C0792a) c0794c.a().get(new Pair(C5142C.b(String.class), bool3));
            if (c0792a19 == null) {
                c0792a19 = new C0792a(new Db.M(C5142C.b(String.class), false, R.f7195a));
            }
            C0792a c0792a20 = (C0792a) c0794c.a().get(new Pair(C5142C.b(String.class), bool3));
            if (c0792a20 == null) {
                c0792a20 = new C0792a(new Db.M(C5142C.b(String.class), false, S.f7196a));
            }
            C0792a c0792a21 = (C0792a) c0794c.a().get(new Pair(C5142C.b(String.class), bool3));
            if (c0792a21 == null) {
                c0792a21 = new C0792a(new Db.M(C5142C.b(String.class), false, T.f7197a));
            }
            C0792a[] c0792aArr13 = {c0792a19, c0792a20, c0792a21};
            V v10 = new V();
            bVar.k().put("createSAFFileAsync", Intrinsics.b(String.class, cls3) ? new wb.k("createSAFFileAsync", c0792aArr13, v10) : Intrinsics.b(String.class, Boolean.TYPE) ? new wb.h("createSAFFileAsync", c0792aArr13, v10) : Intrinsics.b(String.class, Double.TYPE) ? new wb.i("createSAFFileAsync", c0792aArr13, v10) : Intrinsics.b(String.class, Float.TYPE) ? new wb.j("createSAFFileAsync", c0792aArr13, v10) : Intrinsics.b(String.class, String.class) ? new wb.m("createSAFFileAsync", c0792aArr13, v10) : new wb.e("createSAFFileAsync", c0792aArr13, v10));
            kotlin.reflect.d b12 = C5142C.b(String.class);
            Boolean bool4 = Boolean.TRUE;
            C0792a c0792a22 = (C0792a) c0794c.a().get(new Pair(b12, bool4));
            if (c0792a22 == null) {
                c0792a22 = new C0792a(new Db.M(C5142C.b(String.class), true, s0.f7260a));
            }
            bVar.k().put("requestDirectoryPermissionsAsync", new wb.f("requestDirectoryPermissionsAsync", new C0792a[]{c0792a22}, new v0()));
            C0792a c0792a23 = (C0792a) c0794c.a().get(new Pair(C5142C.b(String.class), bool3));
            if (c0792a23 == null) {
                c0792a23 = new C0792a(new Db.M(C5142C.b(String.class), false, w0.f7268a));
            }
            C0792a c0792a24 = (C0792a) c0794c.a().get(new Pair(C5142C.b(String.class), bool3));
            if (c0792a24 == null) {
                cls2 = cls3;
                c0792a24 = new C0792a(new Db.M(C5142C.b(String.class), false, x0.f7270a));
            } else {
                cls2 = cls3;
            }
            C0792a c0792a25 = (C0792a) c0794c.a().get(new Pair(C5142C.b(FileSystemUploadOptions.class), bool3));
            if (c0792a25 == null) {
                obj4 = obj7;
                c0792a25 = new C0792a(new Db.M(C5142C.b(FileSystemUploadOptions.class), false, y0.f7272a));
            } else {
                obj4 = obj7;
            }
            bVar.k().put("uploadAsync", new wb.f("uploadAsync", new C0792a[]{c0792a23, c0792a24, c0792a25}, new z0(bVar)));
            C0792a c0792a26 = (C0792a) c0794c.a().get(new Pair(C5142C.b(String.class), bool3));
            if (c0792a26 == null) {
                c0792a26 = new C0792a(new Db.M(C5142C.b(String.class), false, A0.f7171a));
            }
            C0792a c0792a27 = (C0792a) c0794c.a().get(new Pair(C5142C.b(String.class), bool3));
            if (c0792a27 == null) {
                c0792a27 = new C0792a(new Db.M(C5142C.b(String.class), false, B0.f7173a));
            }
            C0792a c0792a28 = (C0792a) c0794c.a().get(new Pair(C5142C.b(String.class), bool3));
            if (c0792a28 == null) {
                c0792a28 = new C0792a(new Db.M(C5142C.b(String.class), false, C0.f7175a));
            }
            C0792a c0792a29 = (C0792a) c0794c.a().get(new Pair(C5142C.b(FileSystemUploadOptions.class), bool3));
            if (c0792a29 == null) {
                bool = bool4;
                c0792a29 = new C0792a(new Db.M(C5142C.b(FileSystemUploadOptions.class), false, i0.f7230a));
            } else {
                bool = bool4;
            }
            bVar.k().put("uploadTaskStartAsync", new wb.f("uploadTaskStartAsync", new C0792a[]{c0792a26, c0792a27, c0792a28, c0792a29}, new j0()));
            C0792a c0792a30 = (C0792a) c0794c.a().get(new Pair(C5142C.b(String.class), bool3));
            if (c0792a30 == null) {
                c0792a30 = new C0792a(new Db.M(C5142C.b(String.class), false, k0.f7236a));
            }
            Boolean bool5 = bool;
            C0792a c0792a31 = (C0792a) c0794c.a().get(new Pair(C5142C.b(String.class), bool5));
            if (c0792a31 == null) {
                c0792a31 = new C0792a(new Db.M(C5142C.b(String.class), true, l0.f7241a));
            }
            C0792a c0792a32 = (C0792a) c0794c.a().get(new Pair(C5142C.b(DownloadOptions.class), bool3));
            if (c0792a32 == null) {
                c0792a32 = new C0792a(new Db.M(C5142C.b(DownloadOptions.class), false, m0.f7245a));
            }
            bVar.k().put("downloadAsync", new wb.f("downloadAsync", new C0792a[]{c0792a30, c0792a31, c0792a32}, new n0()));
            Object obj8 = obj4;
            if (Intrinsics.b(String.class, obj8)) {
                eVar = new wb.f("networkTaskCancelAsync", new C0792a[0], new W());
            } else {
                C0792a c0792a33 = (C0792a) c0794c.a().get(new Pair(C5142C.b(String.class), bool3));
                if (c0792a33 == null) {
                    c0792a33 = new C0792a(new Db.M(C5142C.b(String.class), false, X.f7201a));
                }
                eVar = new wb.e("networkTaskCancelAsync", new C0792a[]{c0792a33}, new Y());
            }
            bVar.k().put("networkTaskCancelAsync", eVar);
            C0792a c0792a34 = (C0792a) c0794c.a().get(new Pair(C5142C.b(String.class), bool3));
            if (c0792a34 == null) {
                c0792a34 = new C0792a(new Db.M(C5142C.b(String.class), false, o0.f7252a));
            }
            C0792a c0792a35 = (C0792a) c0794c.a().get(new Pair(C5142C.b(String.class), bool3));
            if (c0792a35 == null) {
                c0792a35 = new C0792a(new Db.M(C5142C.b(String.class), false, p0.f7254a));
            }
            C0792a c0792a36 = (C0792a) c0794c.a().get(new Pair(C5142C.b(String.class), bool3));
            if (c0792a36 == null) {
                obj5 = obj8;
                c0792a36 = new C0792a(new Db.M(C5142C.b(String.class), false, q0.f7256a));
            } else {
                obj5 = obj8;
            }
            C0792a c0792a37 = (C0792a) c0794c.a().get(new Pair(C5142C.b(DownloadOptions.class), bool3));
            if (c0792a37 == null) {
                bool2 = bool3;
                c0792a37 = new C0792a(new Db.M(C5142C.b(DownloadOptions.class), false, r0.f7258a));
            } else {
                bool2 = bool3;
            }
            C0792a c0792a38 = (C0792a) c0794c.a().get(new Pair(C5142C.b(String.class), bool5));
            if (c0792a38 == null) {
                c0792a38 = new C0792a(new Db.M(C5142C.b(String.class), true, t0.f7262a));
            }
            bVar.k().put("downloadResumableStartAsync", new wb.f("downloadResumableStartAsync", new C0792a[]{c0792a34, c0792a35, c0792a36, c0792a37, c0792a38}, new u0()));
            if (Intrinsics.b(String.class, obj5)) {
                kVar6 = new wb.f("downloadResumablePauseAsync", new C0792a[0], new Z());
            } else {
                C0792a c0792a39 = (C0792a) c0794c.a().get(new Pair(C5142C.b(String.class), bool2));
                if (c0792a39 == null) {
                    c0792a39 = new C0792a(new Db.M(C5142C.b(String.class), false, C1041a0.f7209a));
                }
                C0792a[] c0792aArr14 = {c0792a39};
                C1043b0 c1043b0 = new C1043b0();
                Object obj9 = obj3;
                kVar6 = Intrinsics.b(obj9, cls2) ? new wb.k("downloadResumablePauseAsync", c0792aArr14, c1043b0) : Intrinsics.b(obj9, Boolean.TYPE) ? new wb.h("downloadResumablePauseAsync", c0792aArr14, c1043b0) : Intrinsics.b(obj9, Double.TYPE) ? new wb.i("downloadResumablePauseAsync", c0792aArr14, c1043b0) : Intrinsics.b(obj9, Float.TYPE) ? new wb.j("downloadResumablePauseAsync", c0792aArr14, c1043b0) : Intrinsics.b(obj9, String.class) ? new wb.m("downloadResumablePauseAsync", c0792aArr14, c1043b0) : new wb.e("downloadResumablePauseAsync", c0792aArr14, c1043b0);
            }
            bVar.k().put("downloadResumablePauseAsync", kVar6);
            Map s11 = bVar.s();
            EnumC5010e enumC5010e2 = EnumC5010e.ON_ACTIVITY_RESULT;
            s11.put(enumC5010e2, new C5009d(enumC5010e2, new D0()));
            Map s12 = bVar.s();
            EnumC5010e enumC5010e3 = EnumC5010e.MODULE_DESTROY;
            s12.put(enumC5010e3, new C5006a(enumC5010e3, new F0()));
            xb.c q11 = bVar.q();
            AbstractC3901a.f();
            return q11;
        } catch (Throwable th) {
            AbstractC3901a.f();
            throw th;
        }
    }
}
