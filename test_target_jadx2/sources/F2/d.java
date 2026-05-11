package F2;

import android.net.Uri;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class d extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public static final a f2276a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Uri uri) {
            super("crop: Failed to decode image: " + uri, null);
            Intrinsics.checkNotNullParameter(uri, "uri");
        }
    }

    public static final class c extends d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Uri uri, String str) {
            super("crop: Failed to load sampled bitmap: " + uri + "\r\n" + str, null);
            Intrinsics.checkNotNullParameter(uri, "uri");
        }
    }

    public /* synthetic */ d(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private d(String str) {
        super(str);
    }
}
