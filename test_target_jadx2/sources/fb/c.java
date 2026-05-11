package fb;

import Jd.AbstractC0909t0;
import android.content.ContentResolver;
import android.net.Uri;
import android.os.Bundle;
import db.C3011f;
import db.C3014i;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import xc.m;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final int f32968a;

    /* renamed from: b, reason: collision with root package name */
    private final int f32969b;

    /* renamed from: c, reason: collision with root package name */
    private final File f32970c;

    static final class a extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ContentResolver f32971a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f32972b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ContentResolver contentResolver, c cVar) {
            super(0);
            this.f32971a = contentResolver;
            this.f32972b = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ByteArrayOutputStream invoke() {
            InputStream openInputStream = this.f32971a.openInputStream(Uri.fromFile(this.f32972b.f32970c));
            if (openInputStream == null) {
                throw new C3011f(this.f32972b.f32970c, null, 2, null);
            }
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    kotlin.io.b.b(openInputStream, byteArrayOutputStream, 0, 2, null);
                    kotlin.io.c.a(byteArrayOutputStream, null);
                    kotlin.io.c.a(openInputStream, null);
                    return byteArrayOutputStream;
                } finally {
                }
            } finally {
            }
        }
    }

    static final class b extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ContentResolver f32973a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f32974b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ContentResolver contentResolver, c cVar) {
            super(0);
            this.f32973a = contentResolver;
            this.f32974b = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            InputStream openInputStream = this.f32973a.openInputStream(Uri.fromFile(this.f32974b.f32970c));
            if (openInputStream == null) {
                throw new C3011f(this.f32974b.f32970c, null, 2, null);
            }
            try {
                Bundle bundle = new Bundle();
                androidx.exifinterface.media.a aVar = new androidx.exifinterface.media.a(openInputStream);
                Iterable a10 = C3014i.f31337a.a();
                ArrayList<Pair> arrayList = new ArrayList();
                for (Object obj : a10) {
                    if (aVar.g((String) ((Pair) obj).getSecond()) != null) {
                        arrayList.add(obj);
                    }
                }
                for (Pair pair : arrayList) {
                    String str = (String) pair.getFirst();
                    String str2 = (String) pair.getSecond();
                    int hashCode = str.hashCode();
                    if (hashCode != -1325958191) {
                        if (hashCode != -891985903) {
                            if (hashCode == 104431 && str.equals("int")) {
                                bundle.putInt(str2, aVar.i(str2, 0));
                            }
                        } else if (str.equals("string")) {
                            bundle.putString(str2, aVar.g(str2));
                        }
                    } else if (str.equals("double")) {
                        bundle.putDouble(str2, aVar.h(str2, 0.0d));
                    }
                }
                double[] m10 = aVar.m();
                if (m10 != null) {
                    bundle.putDouble("GPSLatitude", m10[0]);
                    bundle.putDouble("GPSLongitude", m10[1]);
                    bundle.putDouble("GPSAltitude", aVar.f(0.0d));
                }
                kotlin.io.c.a(openInputStream, null);
                return bundle;
            } finally {
            }
        }
    }

    public c(int i10, int i11, File imageFile) {
        Intrinsics.checkNotNullParameter(imageFile, "imageFile");
        this.f32968a = i10;
        this.f32969b = i11;
        this.f32970c = imageFile;
    }

    static /* synthetic */ Object c(c cVar, ContentResolver contentResolver, kotlin.coroutines.d dVar) {
        return AbstractC0909t0.c(null, new a(contentResolver, cVar), dVar, 1, null);
    }

    static /* synthetic */ Object e(c cVar, ContentResolver contentResolver, kotlin.coroutines.d dVar) {
        return AbstractC0909t0.c(null, new b(contentResolver, cVar), dVar, 1, null);
    }

    public Object b(ContentResolver contentResolver, kotlin.coroutines.d dVar) {
        return c(this, contentResolver, dVar);
    }

    public Object d(ContentResolver contentResolver, kotlin.coroutines.d dVar) {
        return e(this, contentResolver, dVar);
    }

    public final int f() {
        return this.f32969b;
    }

    public final int g() {
        return this.f32968a;
    }
}
