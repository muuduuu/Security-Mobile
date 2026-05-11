package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.a;
import android.support.v4.media.b;
import android.support.v4.media.session.MediaSessionCompat;

/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final String f12894a;

    /* renamed from: b, reason: collision with root package name */
    private final CharSequence f12895b;

    /* renamed from: c, reason: collision with root package name */
    private final CharSequence f12896c;

    /* renamed from: d, reason: collision with root package name */
    private final CharSequence f12897d;

    /* renamed from: e, reason: collision with root package name */
    private final Bitmap f12898e;

    /* renamed from: f, reason: collision with root package name */
    private final Uri f12899f;

    /* renamed from: g, reason: collision with root package name */
    private final Bundle f12900g;

    /* renamed from: h, reason: collision with root package name */
    private final Uri f12901h;

    /* renamed from: i, reason: collision with root package name */
    private Object f12902i;

    static class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.a(android.support.v4.media.a.a(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat[] newArray(int i10) {
            return new MediaDescriptionCompat[i10];
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private String f12903a;

        /* renamed from: b, reason: collision with root package name */
        private CharSequence f12904b;

        /* renamed from: c, reason: collision with root package name */
        private CharSequence f12905c;

        /* renamed from: d, reason: collision with root package name */
        private CharSequence f12906d;

        /* renamed from: e, reason: collision with root package name */
        private Bitmap f12907e;

        /* renamed from: f, reason: collision with root package name */
        private Uri f12908f;

        /* renamed from: g, reason: collision with root package name */
        private Bundle f12909g;

        /* renamed from: h, reason: collision with root package name */
        private Uri f12910h;

        public MediaDescriptionCompat a() {
            return new MediaDescriptionCompat(this.f12903a, this.f12904b, this.f12905c, this.f12906d, this.f12907e, this.f12908f, this.f12909g, this.f12910h);
        }

        public b b(CharSequence charSequence) {
            this.f12906d = charSequence;
            return this;
        }

        public b c(Bundle bundle) {
            this.f12909g = bundle;
            return this;
        }

        public b d(Bitmap bitmap) {
            this.f12907e = bitmap;
            return this;
        }

        public b e(Uri uri) {
            this.f12908f = uri;
            return this;
        }

        public b f(String str) {
            this.f12903a = str;
            return this;
        }

        public b g(Uri uri) {
            this.f12910h = uri;
            return this;
        }

        public b h(CharSequence charSequence) {
            this.f12905c = charSequence;
            return this;
        }

        public b i(CharSequence charSequence) {
            this.f12904b = charSequence;
            return this;
        }
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f12894a = str;
        this.f12895b = charSequence;
        this.f12896c = charSequence2;
        this.f12897d = charSequence3;
        this.f12898e = bitmap;
        this.f12899f = uri;
        this.f12900g = bundle;
        this.f12901h = uri2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static MediaDescriptionCompat a(Object obj) {
        Uri uri;
        Bundle bundle = null;
        if (obj == null) {
            return null;
        }
        b bVar = new b();
        bVar.f(android.support.v4.media.a.f(obj));
        bVar.i(android.support.v4.media.a.h(obj));
        bVar.h(android.support.v4.media.a.g(obj));
        bVar.b(android.support.v4.media.a.b(obj));
        bVar.d(android.support.v4.media.a.d(obj));
        bVar.e(android.support.v4.media.a.e(obj));
        Bundle c10 = android.support.v4.media.a.c(obj);
        if (c10 != null) {
            MediaSessionCompat.a(c10);
            uri = (Uri) c10.getParcelable("android.support.v4.media.description.MEDIA_URI");
        } else {
            uri = null;
        }
        if (uri != null) {
            if (!c10.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") || c10.size() != 2) {
                c10.remove("android.support.v4.media.description.MEDIA_URI");
                c10.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
            }
            bVar.c(bundle);
            if (uri == null) {
                bVar.g(uri);
            } else {
                bVar.g(android.support.v4.media.b.a(obj));
            }
            MediaDescriptionCompat a10 = bVar.a();
            a10.f12902i = obj;
            return a10;
        }
        bundle = c10;
        bVar.c(bundle);
        if (uri == null) {
        }
        MediaDescriptionCompat a102 = bVar.a();
        a102.f12902i = obj;
        return a102;
    }

    public Object b() {
        Object obj = this.f12902i;
        if (obj != null) {
            return obj;
        }
        Object b10 = a.C0239a.b();
        a.C0239a.g(b10, this.f12894a);
        a.C0239a.i(b10, this.f12895b);
        a.C0239a.h(b10, this.f12896c);
        a.C0239a.c(b10, this.f12897d);
        a.C0239a.e(b10, this.f12898e);
        a.C0239a.f(b10, this.f12899f);
        a.C0239a.d(b10, this.f12900g);
        b.a.a(b10, this.f12901h);
        Object a10 = a.C0239a.a(b10);
        this.f12902i = a10;
        return a10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return ((Object) this.f12895b) + ", " + ((Object) this.f12896c) + ", " + ((Object) this.f12897d);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        android.support.v4.media.a.i(b(), parcel, i10);
    }
}
