package db;

import Jd.AbstractC0909t0;
import android.content.ClipData;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.util.Log;
import android.webkit.MimeTypeMap;
import expo.modules.imagepicker.MediaType;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lc.t;
import yc.InterfaceC5191a;

/* renamed from: db.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3017l {

    /* renamed from: db.l$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31396a;

        static {
            int[] iArr = new int[Bitmap.CompressFormat.values().length];
            try {
                iArr[Bitmap.CompressFormat.PNG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Bitmap.CompressFormat.JPEG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f31396a = iArr;
        }
    }

    /* renamed from: db.l$b */
    static final class b extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ File f31397a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Uri f31398b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ContentResolver f31399c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(File file, Uri uri, ContentResolver contentResolver) {
            super(0);
            this.f31397a = file;
            this.f31398b = uri;
            this.f31399c = contentResolver;
        }

        public final void a() {
            Unit unit;
            if (this.f31398b.compareTo(Uri.fromFile(this.f31397a)) == 0) {
                return;
            }
            List m10 = CollectionsKt.m("ImageLength", "ImageWidth", "PixelXDimension", "PixelYDimension", "Orientation");
            try {
                InputStream openInputStream = this.f31399c.openInputStream(this.f31398b);
                if (openInputStream != null) {
                    File file = this.f31397a;
                    try {
                        androidx.exifinterface.media.a aVar = new androidx.exifinterface.media.a(openInputStream);
                        androidx.exifinterface.media.a aVar2 = new androidx.exifinterface.media.a(file);
                        Iterable a10 = C3014i.f31337a.a();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : a10) {
                            if (!m10.contains((String) ((Pair) obj).getSecond())) {
                                arrayList.add(obj);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.u(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            String str = (String) ((Pair) it.next()).getSecond();
                            arrayList2.add(t.a(str, aVar.g(str)));
                        }
                        ArrayList<Pair> arrayList3 = new ArrayList();
                        for (Object obj2 : arrayList2) {
                            if (((String) ((Pair) obj2).getSecond()) != null) {
                                arrayList3.add(obj2);
                            }
                        }
                        for (Pair pair : arrayList3) {
                            aVar2.b0((String) pair.getFirst(), (String) pair.getSecond());
                        }
                        try {
                            aVar2.W();
                            Unit unit2 = Unit.f36324a;
                            kotlin.io.c.a(openInputStream, null);
                            unit = Unit.f36324a;
                        } catch (IOException e10) {
                            throw new C3012g(file, e10);
                        }
                    } finally {
                    }
                } else {
                    unit = null;
                }
                if (unit == null) {
                    throw new C3011f(v0.b.a(this.f31398b), null, 2, null);
                }
            } catch (FileNotFoundException e11) {
                throw new C3013h(this.f31397a, e11);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f36324a;
        }
    }

    /* renamed from: db.l$c */
    static final class c extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ File f31400a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Uri f31401b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ContentResolver f31402c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(File file, Uri uri, ContentResolver contentResolver) {
            super(0);
            this.f31400a = file;
            this.f31401b = uri;
            this.f31402c = contentResolver;
        }

        public final void a() {
            if (this.f31401b.compareTo(Uri.fromFile(this.f31400a)) == 0) {
                return;
            }
            try {
                InputStream openInputStream = this.f31402c.openInputStream(this.f31401b);
                if (openInputStream == null) {
                    throw new C3011f(v0.b.a(this.f31401b), null, 2, null);
                }
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.f31400a);
                    try {
                        kotlin.io.b.b(openInputStream, fileOutputStream, 0, 2, null);
                        kotlin.io.c.a(fileOutputStream, null);
                        kotlin.io.c.a(openInputStream, null);
                    } finally {
                    }
                } finally {
                }
            } catch (FileNotFoundException e10) {
                throw new C3013h(this.f31400a, e10);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f36324a;
        }
    }

    /* renamed from: db.l$d */
    public static final class d implements Iterable, InterfaceC5191a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ClipData f31403a;

        /* renamed from: db.l$d$a */
        public static final class a implements Iterator, InterfaceC5191a {

            /* renamed from: a, reason: collision with root package name */
            private int f31404a;

            /* renamed from: b, reason: collision with root package name */
            private final int f31405b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ClipData f31406c;

            a(ClipData clipData) {
                this.f31406c = clipData;
                this.f31405b = clipData.getItemCount();
            }

            @Override // java.util.Iterator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ClipData.Item next() {
                ClipData clipData = this.f31406c;
                int i10 = this.f31404a;
                this.f31404a = i10 + 1;
                ClipData.Item itemAt = clipData.getItemAt(i10);
                Intrinsics.checkNotNullExpressionValue(itemAt, "getItemAt(...)");
                return itemAt;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f31404a < this.f31405b;
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        }

        d(ClipData clipData) {
            this.f31403a = clipData;
        }

        @Override // java.lang.Iterable
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public a iterator() {
            return new a(this.f31403a);
        }
    }

    public static final Object a(Uri uri, File file, ContentResolver contentResolver, kotlin.coroutines.d dVar) {
        return AbstractC0909t0.c(null, new b(file, uri, contentResolver), dVar, 1, null);
    }

    public static final Object b(Uri uri, File file, ContentResolver contentResolver, kotlin.coroutines.d dVar) {
        return AbstractC0909t0.c(null, new c(file, uri, contentResolver), dVar, 1, null);
    }

    public static final File c(File cacheDir, String extension) {
        Intrinsics.checkNotNullParameter(cacheDir, "cacheDir");
        Intrinsics.checkNotNullParameter(extension, "extension");
        String b10 = Ha.b.b(cacheDir, "ImagePicker", extension);
        try {
            File file = new File(b10);
            file.createNewFile();
            return file;
        } catch (IOException e10) {
            Intrinsics.d(b10);
            throw new C3007b(b10, e10);
        }
    }

    public static final int d(MediaMetadataRetriever mediaMetadataRetriever, int i10) {
        Intrinsics.checkNotNullParameter(mediaMetadataRetriever, "<this>");
        String extractMetadata = mediaMetadataRetriever.extractMetadata(i10);
        if (extractMetadata != null) {
            return Integer.parseInt(extractMetadata);
        }
        throw new C3009d(null, null, 3, null);
    }

    public static final List e(Intent intent) {
        Iterable f10;
        Intrinsics.checkNotNullParameter(intent, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Uri data = intent.getData();
        if (data != null) {
            linkedHashSet.add(data);
        }
        ClipData clipData = intent.getClipData();
        if (clipData != null && (f10 = f(clipData)) != null) {
            ArrayList arrayList = new ArrayList(CollectionsKt.u(f10, 10));
            Iterator it = f10.iterator();
            while (it.hasNext()) {
                arrayList.add(((ClipData.Item) it.next()).getUri());
            }
            linkedHashSet.addAll(arrayList);
        }
        return CollectionsKt.O0(linkedHashSet);
    }

    public static final Iterable f(ClipData clipData) {
        Intrinsics.checkNotNullParameter(clipData, "<this>");
        return new d(clipData);
    }

    public static final String g(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        if (!l(uri)) {
            return null;
        }
        String documentId = DocumentsContract.getDocumentId(uri);
        Intrinsics.d(documentId);
        return StringsKt.J(documentId, ':', false, 2, null) ? (String) StringsKt.x0(documentId, new char[]{':'}, false, 0, 6, null).get(1) : documentId;
    }

    public static final String h(ContentResolver contentResolver, Uri uri) {
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        Intrinsics.checkNotNullParameter(uri, "uri");
        String type = contentResolver.getType(uri);
        if (type == null) {
            String uri2 = uri.toString();
            Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
            type = i(uri2);
        }
        if (type != null) {
            return type;
        }
        throw new C3008c();
    }

    private static final String i(String str) {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        if (fileExtensionFromUrl != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
        }
        return null;
    }

    public static final boolean j(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        return Intrinsics.b(uri.getAuthority(), "com.android.providers.downloads.documents");
    }

    public static final boolean k(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        return Intrinsics.b(uri.getAuthority(), "com.android.providers.media.documents");
    }

    public static final boolean l(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        if (!k(uri)) {
            if (!j(uri)) {
                return false;
            }
            String documentId = DocumentsContract.getDocumentId(uri);
            Intrinsics.checkNotNullExpressionValue(documentId, "getDocumentId(...)");
            if (!StringsKt.F(documentId, "msf:", false, 2, null)) {
                return false;
            }
        }
        return true;
    }

    public static final Bitmap.CompressFormat m(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return StringsKt.p(kotlin.io.j.u(file), "png", true) ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
    }

    public static final Bitmap.CompressFormat n(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (StringsKt.p(str, "png", true) || StringsKt.p(str, "gif", true) || StringsKt.p(str, "bmp", true) || StringsKt.p(str, "webp", true)) {
            return Bitmap.CompressFormat.PNG;
        }
        if (!StringsKt.p(str, "jpeg", true)) {
            Log.w("ExponentImagePicker", "Image file " + str + " is of unsupported type. Falling back to JPEG instead.");
        }
        return Bitmap.CompressFormat.JPEG;
    }

    public static final Uri o(File file, Context context) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Uri h10 = androidx.core.content.b.h(context, context.getPackageName() + ".ImagePickerFileProvider", file);
            Intrinsics.d(h10);
            return h10;
        } catch (Exception unused) {
            Uri fromFile = Uri.fromFile(file);
            Intrinsics.d(fromFile);
            return fromFile;
        }
    }

    public static final String p(Bitmap.CompressFormat compressFormat) {
        Intrinsics.checkNotNullParameter(compressFormat, "<this>");
        int i10 = a.f31396a[compressFormat.ordinal()];
        if (i10 == 1) {
            return ".png";
        }
        if (i10 == 2) {
            return ".jpeg";
        }
        throw new RuntimeException("Compress format not supported '" + compressFormat.name() + "'");
    }

    public static final String q(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (StringsKt.p(str, "png", true)) {
            return ".png";
        }
        if (StringsKt.p(str, "gif", true)) {
            return ".gif";
        }
        if (StringsKt.p(str, "bmp", true)) {
            return ".bmp";
        }
        if (StringsKt.p(str, "webp", true)) {
            return ".webp";
        }
        if (!StringsKt.p(str, "jpeg", true)) {
            Log.w("ExponentImagePicker", "Image file " + str + " is of unsupported type. Falling back to JPEG instead.");
        }
        return ".jpeg";
    }

    public static final MediaType r(Uri uri, ContentResolver contentResolver) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        String h10 = h(contentResolver, uri);
        if (StringsKt.K(h10, "image/", false, 2, null)) {
            return MediaType.IMAGE;
        }
        if (StringsKt.K(h10, "video/", false, 2, null)) {
            return MediaType.VIDEO;
        }
        throw new C3008c();
    }
}
