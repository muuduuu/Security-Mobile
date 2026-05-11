package kotlin.io;

import java.io.File;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.collections.AbstractC3567b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* loaded from: classes3.dex */
public final class i implements Sequence {

    /* renamed from: a, reason: collision with root package name */
    private final File f36389a;

    /* renamed from: b, reason: collision with root package name */
    private final FileWalkDirection f36390b;

    /* renamed from: c, reason: collision with root package name */
    private final Function1 f36391c;

    /* renamed from: d, reason: collision with root package name */
    private final Function1 f36392d;

    /* renamed from: e, reason: collision with root package name */
    private final Function2 f36393e;

    /* renamed from: f, reason: collision with root package name */
    private final int f36394f;

    private static abstract class a extends c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(File rootDir) {
            super(rootDir);
            Intrinsics.checkNotNullParameter(rootDir, "rootDir");
        }
    }

    private final class b extends AbstractC3567b {

        /* renamed from: c, reason: collision with root package name */
        private final ArrayDeque f36395c;

        private final class a extends a {

            /* renamed from: b, reason: collision with root package name */
            private boolean f36397b;

            /* renamed from: c, reason: collision with root package name */
            private File[] f36398c;

            /* renamed from: d, reason: collision with root package name */
            private int f36399d;

            /* renamed from: e, reason: collision with root package name */
            private boolean f36400e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ b f36401f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, File rootDir) {
                super(rootDir);
                Intrinsics.checkNotNullParameter(rootDir, "rootDir");
                this.f36401f = bVar;
            }

            @Override // kotlin.io.i.c
            public File b() {
                if (!this.f36400e && this.f36398c == null) {
                    Function1 function1 = i.this.f36391c;
                    if (function1 != null && !((Boolean) function1.invoke(a())).booleanValue()) {
                        return null;
                    }
                    File[] listFiles = a().listFiles();
                    this.f36398c = listFiles;
                    if (listFiles == null) {
                        Function2 function2 = i.this.f36393e;
                        if (function2 != null) {
                            function2.invoke(a(), new kotlin.io.a(a(), null, "Cannot list files in a directory", 2, null));
                        }
                        this.f36400e = true;
                    }
                }
                File[] fileArr = this.f36398c;
                if (fileArr != null) {
                    int i10 = this.f36399d;
                    Intrinsics.d(fileArr);
                    if (i10 < fileArr.length) {
                        File[] fileArr2 = this.f36398c;
                        Intrinsics.d(fileArr2);
                        int i11 = this.f36399d;
                        this.f36399d = i11 + 1;
                        return fileArr2[i11];
                    }
                }
                if (!this.f36397b) {
                    this.f36397b = true;
                    return a();
                }
                Function1 function12 = i.this.f36392d;
                if (function12 != null) {
                    function12.invoke(a());
                }
                return null;
            }
        }

        /* renamed from: kotlin.io.i$b$b, reason: collision with other inner class name */
        private final class C0528b extends c {

            /* renamed from: b, reason: collision with root package name */
            private boolean f36402b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ b f36403c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0528b(b bVar, File rootFile) {
                super(rootFile);
                Intrinsics.checkNotNullParameter(rootFile, "rootFile");
                this.f36403c = bVar;
            }

            @Override // kotlin.io.i.c
            public File b() {
                if (this.f36402b) {
                    return null;
                }
                this.f36402b = true;
                return a();
            }
        }

        private final class c extends a {

            /* renamed from: b, reason: collision with root package name */
            private boolean f36404b;

            /* renamed from: c, reason: collision with root package name */
            private File[] f36405c;

            /* renamed from: d, reason: collision with root package name */
            private int f36406d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ b f36407e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(b bVar, File rootDir) {
                super(rootDir);
                Intrinsics.checkNotNullParameter(rootDir, "rootDir");
                this.f36407e = bVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:29:0x007f, code lost:
            
                if (r0.length == 0) goto L31;
             */
            @Override // kotlin.io.i.c
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public File b() {
                Function2 function2;
                if (!this.f36404b) {
                    Function1 function1 = i.this.f36391c;
                    if (function1 != null && !((Boolean) function1.invoke(a())).booleanValue()) {
                        return null;
                    }
                    this.f36404b = true;
                    return a();
                }
                File[] fileArr = this.f36405c;
                if (fileArr != null) {
                    int i10 = this.f36406d;
                    Intrinsics.d(fileArr);
                    if (i10 >= fileArr.length) {
                        Function1 function12 = i.this.f36392d;
                        if (function12 != null) {
                            function12.invoke(a());
                        }
                        return null;
                    }
                }
                if (this.f36405c == null) {
                    File[] listFiles = a().listFiles();
                    this.f36405c = listFiles;
                    if (listFiles == null && (function2 = i.this.f36393e) != null) {
                        function2.invoke(a(), new kotlin.io.a(a(), null, "Cannot list files in a directory", 2, null));
                    }
                    File[] fileArr2 = this.f36405c;
                    if (fileArr2 != null) {
                        Intrinsics.d(fileArr2);
                    }
                    Function1 function13 = i.this.f36392d;
                    if (function13 != null) {
                        function13.invoke(a());
                    }
                    return null;
                }
                File[] fileArr3 = this.f36405c;
                Intrinsics.d(fileArr3);
                int i11 = this.f36406d;
                this.f36406d = i11 + 1;
                return fileArr3[i11];
            }
        }

        public /* synthetic */ class d {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f36408a;

            static {
                int[] iArr = new int[FileWalkDirection.values().length];
                try {
                    iArr[FileWalkDirection.TOP_DOWN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[FileWalkDirection.BOTTOM_UP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f36408a = iArr;
            }
        }

        public b() {
            ArrayDeque arrayDeque = new ArrayDeque();
            this.f36395c = arrayDeque;
            if (i.this.f36389a.isDirectory()) {
                arrayDeque.push(f(i.this.f36389a));
            } else if (i.this.f36389a.isFile()) {
                arrayDeque.push(new C0528b(this, i.this.f36389a));
            } else {
                b();
            }
        }

        private final a f(File file) {
            int i10 = d.f36408a[i.this.f36390b.ordinal()];
            if (i10 == 1) {
                return new c(this, file);
            }
            if (i10 == 2) {
                return new a(this, file);
            }
            throw new lc.m();
        }

        private final File g() {
            File b10;
            while (true) {
                c cVar = (c) this.f36395c.peek();
                if (cVar == null) {
                    return null;
                }
                b10 = cVar.b();
                if (b10 == null) {
                    this.f36395c.pop();
                } else {
                    if (Intrinsics.b(b10, cVar.a()) || !b10.isDirectory() || this.f36395c.size() >= i.this.f36394f) {
                        break;
                    }
                    this.f36395c.push(f(b10));
                }
            }
            return b10;
        }

        @Override // kotlin.collections.AbstractC3567b
        protected void a() {
            File g10 = g();
            if (g10 != null) {
                c(g10);
            } else {
                b();
            }
        }
    }

    private static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        private final File f36409a;

        public c(File root) {
            Intrinsics.checkNotNullParameter(root, "root");
            this.f36409a = root;
        }

        public final File a() {
            return this.f36409a;
        }

        public abstract File b();
    }

    private i(File file, FileWalkDirection fileWalkDirection, Function1 function1, Function1 function12, Function2 function2, int i10) {
        this.f36389a = file;
        this.f36390b = fileWalkDirection;
        this.f36391c = function1;
        this.f36392d = function12;
        this.f36393e = function2;
        this.f36394f = i10;
    }

    public final i h(Function2 function) {
        Intrinsics.checkNotNullParameter(function, "function");
        return new i(this.f36389a, this.f36390b, this.f36391c, this.f36392d, function, this.f36394f);
    }

    @Override // kotlin.sequences.Sequence
    public Iterator iterator() {
        return new b();
    }

    /* synthetic */ i(File file, FileWalkDirection fileWalkDirection, Function1 function1, Function1 function12, Function2 function2, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i11 & 2) != 0 ? FileWalkDirection.TOP_DOWN : fileWalkDirection, function1, function12, function2, (i11 & 32) != 0 ? Integer.MAX_VALUE : i10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(File start, FileWalkDirection direction) {
        this(start, direction, null, null, null, 0, 32, null);
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(direction, "direction");
    }
}
