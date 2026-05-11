package kotlin.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.conscrypt.BuildConfig;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class n extends m {

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class a extends xc.m implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f36410a = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(File file, IOException exception) {
            Intrinsics.checkNotNullParameter(file, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(exception, "exception");
            throw exception;
        }
    }

    static final class b extends xc.m implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2 f36411a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Function2 function2) {
            super(2);
            this.f36411a = function2;
        }

        public final void a(File f10, IOException e10) {
            Intrinsics.checkNotNullParameter(f10, "f");
            Intrinsics.checkNotNullParameter(e10, "e");
            if (this.f36411a.invoke(f10, e10) == q.TERMINATE) {
                throw new r(f10);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((File) obj, (IOException) obj2);
            return Unit.f36324a;
        }
    }

    public static final boolean p(File file, File target, boolean z10, Function2 onError) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(onError, "onError");
        if (!file.exists()) {
            return onError.invoke(file, new p(file, null, "The source file doesn't exist.", 2, null)) != q.TERMINATE;
        }
        try {
            Iterator it = m.o(file).h(new b(onError)).iterator();
            while (it.hasNext()) {
                File file2 = (File) it.next();
                if (file2.exists()) {
                    File file3 = new File(target, y(file2, file));
                    if (file3.exists() && (!file2.isDirectory() || !file3.isDirectory())) {
                        if (z10) {
                            if (file3.isDirectory()) {
                                if (!j.t(file3)) {
                                }
                            } else if (!file3.delete()) {
                            }
                        }
                        if (onError.invoke(file3, new f(file2, file3, "The destination file already exists.")) == q.TERMINATE) {
                            return false;
                        }
                    }
                    if (file2.isDirectory()) {
                        file3.mkdirs();
                    } else if (j.s(file2, file3, z10, 0, 4, null).length() != file2.length() && onError.invoke(file2, new IOException("Source file wasn't copied completely, length of destination file differs.")) == q.TERMINATE) {
                        return false;
                    }
                } else if (onError.invoke(file2, new p(file2, null, "The source file doesn't exist.", 2, null)) == q.TERMINATE) {
                    return false;
                }
            }
            return true;
        } catch (r unused) {
            return false;
        }
    }

    public static /* synthetic */ boolean q(File file, File file2, boolean z10, Function2 function2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            function2 = a.f36410a;
        }
        return p(file, file2, z10, function2);
    }

    public static final File r(File file, File target, boolean z10, int i10) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        if (!file.exists()) {
            throw new p(file, null, "The source file doesn't exist.", 2, null);
        }
        if (target.exists()) {
            if (!z10) {
                throw new f(file, target, "The destination file already exists.");
            }
            if (!target.delete()) {
                throw new f(file, target, "Tried to overwrite the destination, but failed to delete it.");
            }
        }
        if (!file.isDirectory()) {
            File parentFile = target.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(target);
                try {
                    kotlin.io.b.a(fileInputStream, fileOutputStream, i10);
                    c.a(fileOutputStream, null);
                    c.a(fileInputStream, null);
                } finally {
                }
            } finally {
            }
        } else if (!target.mkdirs()) {
            throw new h(file, target, "Failed to create target directory.");
        }
        return target;
    }

    public static /* synthetic */ File s(File file, File file2, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 8192;
        }
        return r(file, file2, z10, i10);
    }

    public static boolean t(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        while (true) {
            boolean z10 = true;
            for (File file2 : m.n(file)) {
                if (file2.delete() || !file2.exists()) {
                    if (z10) {
                        break;
                    }
                }
                z10 = false;
            }
            return z10;
        }
    }

    public static String u(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return StringsKt.J0(name, '.', BuildConfig.FLAVOR);
    }

    private static final List v(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            String name = file.getName();
            if (!Intrinsics.b(name, ".")) {
                if (!Intrinsics.b(name, "..")) {
                    arrayList.add(file);
                } else if (arrayList.isEmpty() || Intrinsics.b(((File) CollectionsKt.n0(arrayList)).getName(), "..")) {
                    arrayList.add(file);
                } else {
                    arrayList.remove(arrayList.size() - 1);
                }
            }
        }
        return arrayList;
    }

    private static final g w(g gVar) {
        return new g(gVar.a(), v(gVar.b()));
    }

    public static boolean x(File file, File other) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        g b10 = k.b(file);
        g b11 = k.b(other);
        if (Intrinsics.b(b10.a(), b11.a()) && b10.c() >= b11.c()) {
            return b10.b().subList(0, b11.c()).equals(b11.b());
        }
        return false;
    }

    public static final String y(File file, File base) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(base, "base");
        String z10 = z(file, base);
        if (z10 != null) {
            return z10;
        }
        throw new IllegalArgumentException("this and base files have different roots: " + file + " and " + base + '.');
    }

    private static final String z(File file, File file2) {
        g w10 = w(k.b(file));
        g w11 = w(k.b(file2));
        if (!Intrinsics.b(w10.a(), w11.a())) {
            return null;
        }
        int c10 = w11.c();
        int c11 = w10.c();
        int min = Math.min(c11, c10);
        int i10 = 0;
        while (i10 < min && Intrinsics.b(w10.b().get(i10), w11.b().get(i10))) {
            i10++;
        }
        StringBuilder sb2 = new StringBuilder();
        int i11 = c10 - 1;
        if (i10 <= i11) {
            while (!Intrinsics.b(((File) w11.b().get(i11)).getName(), "..")) {
                sb2.append("..");
                if (i11 != i10) {
                    sb2.append(File.separatorChar);
                }
                if (i11 != i10) {
                    i11--;
                }
            }
            return null;
        }
        if (i10 < c11) {
            if (i10 < c10) {
                sb2.append(File.separatorChar);
            }
            List X10 = CollectionsKt.X(w10.b(), i10);
            String separator = File.separator;
            Intrinsics.checkNotNullExpressionValue(separator, "separator");
            CollectionsKt.j0(X10, sb2, separator, null, null, 0, null, null, 124, null);
        }
        return sb2.toString();
    }
}
