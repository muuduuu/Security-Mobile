package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import j0.C3476a;

/* loaded from: classes.dex */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    static final C3476a f12911b;

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f12912c;

    /* renamed from: d, reason: collision with root package name */
    private static final String[] f12913d;

    /* renamed from: e, reason: collision with root package name */
    private static final String[] f12914e;

    /* renamed from: a, reason: collision with root package name */
    final Bundle f12915a;

    static class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public MediaMetadataCompat createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public MediaMetadataCompat[] newArray(int i10) {
            return new MediaMetadataCompat[i10];
        }
    }

    static {
        C3476a c3476a = new C3476a();
        f12911b = c3476a;
        c3476a.put("android.media.metadata.TITLE", 1);
        c3476a.put("android.media.metadata.ARTIST", 1);
        c3476a.put("android.media.metadata.DURATION", 0);
        c3476a.put("android.media.metadata.ALBUM", 1);
        c3476a.put("android.media.metadata.AUTHOR", 1);
        c3476a.put("android.media.metadata.WRITER", 1);
        c3476a.put("android.media.metadata.COMPOSER", 1);
        c3476a.put("android.media.metadata.COMPILATION", 1);
        c3476a.put("android.media.metadata.DATE", 1);
        c3476a.put("android.media.metadata.YEAR", 0);
        c3476a.put("android.media.metadata.GENRE", 1);
        c3476a.put("android.media.metadata.TRACK_NUMBER", 0);
        c3476a.put("android.media.metadata.NUM_TRACKS", 0);
        c3476a.put("android.media.metadata.DISC_NUMBER", 0);
        c3476a.put("android.media.metadata.ALBUM_ARTIST", 1);
        c3476a.put("android.media.metadata.ART", 2);
        c3476a.put("android.media.metadata.ART_URI", 1);
        c3476a.put("android.media.metadata.ALBUM_ART", 2);
        c3476a.put("android.media.metadata.ALBUM_ART_URI", 1);
        c3476a.put("android.media.metadata.USER_RATING", 3);
        c3476a.put("android.media.metadata.RATING", 3);
        c3476a.put("android.media.metadata.DISPLAY_TITLE", 1);
        c3476a.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        c3476a.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        c3476a.put("android.media.metadata.DISPLAY_ICON", 2);
        c3476a.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        c3476a.put("android.media.metadata.MEDIA_ID", 1);
        c3476a.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        c3476a.put("android.media.metadata.MEDIA_URI", 1);
        c3476a.put("android.media.metadata.ADVERTISEMENT", 0);
        c3476a.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        f12912c = new String[]{"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};
        f12913d = new String[]{"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};
        f12914e = new String[]{"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};
        CREATOR = new a();
    }

    MediaMetadataCompat(Parcel parcel) {
        this.f12915a = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeBundle(this.f12915a);
    }
}
