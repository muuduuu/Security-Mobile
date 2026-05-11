package l1;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Pair;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public interface h extends Closeable {

    public static abstract class a {

        /* renamed from: b, reason: collision with root package name */
        public static final C0545a f37000b = new C0545a(null);

        /* renamed from: a, reason: collision with root package name */
        public final int f37001a;

        /* renamed from: l1.h$a$a, reason: collision with other inner class name */
        public static final class C0545a {
            public /* synthetic */ C0545a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0545a() {
            }
        }

        public a(int i10) {
            this.f37001a = i10;
        }

        private final void a(String str) {
            if (StringsKt.r(str, ":memory:", true)) {
                return;
            }
            int length = str.length() - 1;
            int i10 = 0;
            boolean z10 = false;
            while (i10 <= length) {
                boolean z11 = Intrinsics.g(str.charAt(!z10 ? i10 : length), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z11) {
                    i10++;
                } else {
                    z10 = true;
                }
            }
            if (str.subSequence(i10, length + 1).toString().length() == 0) {
                return;
            }
            Log.w("SupportSQLite", "deleting the database file: " + str);
            try {
                l1.b.c(new File(str));
            } catch (Exception e10) {
                Log.w("SupportSQLite", "delete failed: ", e10);
            }
        }

        public void b(g db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
        }

        public void c(g db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + db2 + ".path");
            if (!db2.isOpen()) {
                String J10 = db2.J();
                if (J10 != null) {
                    a(J10);
                    return;
                }
                return;
            }
            List list = null;
            try {
                try {
                    list = db2.W();
                } catch (SQLiteException unused) {
                }
                try {
                    db2.close();
                } catch (IOException unused2) {
                }
                if (list != null) {
                    return;
                }
            } finally {
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        Object obj = ((Pair) it.next()).second;
                        Intrinsics.checkNotNullExpressionValue(obj, "p.second");
                        a((String) obj);
                    }
                } else {
                    String J11 = db2.J();
                    if (J11 != null) {
                        a(J11);
                    }
                }
            }
        }

        public abstract void d(g gVar);

        public abstract void e(g gVar, int i10, int i11);

        public void f(g db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
        }

        public abstract void g(g gVar, int i10, int i11);
    }

    public static final class b {

        /* renamed from: f, reason: collision with root package name */
        public static final C0546b f37002f = new C0546b(null);

        /* renamed from: a, reason: collision with root package name */
        public final Context f37003a;

        /* renamed from: b, reason: collision with root package name */
        public final String f37004b;

        /* renamed from: c, reason: collision with root package name */
        public final a f37005c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f37006d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f37007e;

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            private final Context f37008a;

            /* renamed from: b, reason: collision with root package name */
            private String f37009b;

            /* renamed from: c, reason: collision with root package name */
            private a f37010c;

            /* renamed from: d, reason: collision with root package name */
            private boolean f37011d;

            /* renamed from: e, reason: collision with root package name */
            private boolean f37012e;

            public a(Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                this.f37008a = context;
            }

            public a a(boolean z10) {
                this.f37012e = z10;
                return this;
            }

            public b b() {
                String str;
                a aVar = this.f37010c;
                if (aVar == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.");
                }
                if (this.f37011d && ((str = this.f37009b) == null || str.length() == 0)) {
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                }
                return new b(this.f37008a, this.f37009b, aVar, this.f37011d, this.f37012e);
            }

            public a c(a callback) {
                Intrinsics.checkNotNullParameter(callback, "callback");
                this.f37010c = callback;
                return this;
            }

            public a d(String str) {
                this.f37009b = str;
                return this;
            }

            public a e(boolean z10) {
                this.f37011d = z10;
                return this;
            }
        }

        /* renamed from: l1.h$b$b, reason: collision with other inner class name */
        public static final class C0546b {
            public /* synthetic */ C0546b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                return new a(context);
            }

            private C0546b() {
            }
        }

        public b(Context context, String str, a callback, boolean z10, boolean z11) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f37003a = context;
            this.f37004b = str;
            this.f37005c = callback;
            this.f37006d = z10;
            this.f37007e = z11;
        }

        public static final a a(Context context) {
            return f37002f.a(context);
        }
    }

    public interface c {
        h a(b bVar);
    }

    g U0();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean z10);
}
