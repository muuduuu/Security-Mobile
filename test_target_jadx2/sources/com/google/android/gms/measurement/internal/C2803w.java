package com.google.android.gms.measurement.internal;

import V6.AbstractC1287s;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.react.modules.appstate.AppStateModule;
import com.google.android.gms.internal.measurement.C2207c3;
import com.google.android.gms.internal.measurement.C2216d3;
import com.google.android.gms.internal.measurement.C2225e3;
import com.google.android.gms.internal.measurement.C2301m7;
import com.google.android.gms.internal.measurement.C2377v3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.conscrypt.BuildConfig;

/* renamed from: com.google.android.gms.measurement.internal.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2803w extends M6 {

    /* renamed from: f, reason: collision with root package name */
    private static final String[] f26421f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* renamed from: g, reason: collision with root package name */
    static final String[] f26422g = {"associated_row_id", "ALTER TABLE upload_queue ADD COLUMN associated_row_id INTEGER;", "last_upload_timestamp", "ALTER TABLE upload_queue ADD COLUMN last_upload_timestamp INTEGER;"};

    /* renamed from: h, reason: collision with root package name */
    private static final String[] f26423h = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* renamed from: i, reason: collision with root package name */
    private static final String[] f26424i = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;", "client_upload_eligibility", "ALTER TABLE apps ADD COLUMN client_upload_eligibility INTEGER;", "gmp_version_for_remote_config", "ALTER TABLE apps ADD COLUMN gmp_version_for_remote_config INTEGER;"};

    /* renamed from: j, reason: collision with root package name */
    private static final String[] f26425j = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* renamed from: k, reason: collision with root package name */
    private static final String[] f26426k = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* renamed from: l, reason: collision with root package name */
    private static final String[] f26427l = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: m, reason: collision with root package name */
    private static final String[] f26428m = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: n, reason: collision with root package name */
    private static final String[] f26429n = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: o, reason: collision with root package name */
    private static final String[] f26430o = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};

    /* renamed from: p, reason: collision with root package name */
    private static final String[] f26431p = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};

    /* renamed from: d, reason: collision with root package name */
    private final C2795v f26432d;

    /* renamed from: e, reason: collision with root package name */
    private final A6 f26433e;

    C2803w(b7 b7Var) {
        super(b7Var);
        this.f26433e = new A6(this.f25694a.f());
        this.f25694a.w();
        this.f26432d = new C2795v(this, this.f25694a.e(), "google_app_measurement.db");
    }

    private final String M(String str, String[] strArr, String str2) {
        Cursor cursor = null;
        try {
            try {
                cursor = u0().rawQuery(str, strArr);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return BuildConfig.FLAVOR;
                }
                String string = cursor.getString(0);
                cursor.close();
                return string;
            } catch (SQLiteException e10) {
                this.f25694a.a().o().c("Database error", str, e10);
                throw e10;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    private final void N(String str, String str2, ContentValues contentValues) {
        try {
            SQLiteDatabase u02 = u0();
            if (contentValues.getAsString("app_id") == null) {
                this.f25694a.a().q().b("Value of the primary key is not set.", C2.x("app_id"));
                return;
            }
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append("app_id");
            sb2.append(" = ?");
            if (u02.update("consent_settings", contentValues, sb2.toString(), new String[]{r2}) == 0 && u02.insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                this.f25694a.a().o().c("Failed to insert/update table (got -1). key", C2.x("consent_settings"), C2.x("app_id"));
            }
        } catch (SQLiteException e10) {
            this.f25694a.a().o().d("Error storing into table. key", C2.x("consent_settings"), C2.x("app_id"), e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final E O(String str, String str2, String str3) {
        Cursor cursor;
        Boolean bool;
        AbstractC1287s.g(str2);
        AbstractC1287s.g(str3);
        h();
        j();
        Cursor cursor2 = null;
        try {
            cursor = u0().query(str, (String[]) new ArrayList(Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count")).toArray(new String[0]), "app_id=? and name=?", new String[]{str2, str3}, null, null, null);
            try {
                try {
                } catch (SQLiteException e10) {
                    e = e10;
                    C2760q3 c2760q3 = this.f25694a;
                    c2760q3.a().o().d("Error querying events. appId", C2.x(str2), c2760q3.D().a(str3), e);
                    if (cursor != null) {
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e11) {
            e = e11;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
            }
            throw th;
        }
        if (!cursor.moveToFirst()) {
            if (cursor != null) {
                cursor.close();
            }
            return null;
        }
        long j10 = cursor.getLong(0);
        long j11 = cursor.getLong(1);
        long j12 = cursor.getLong(2);
        long j13 = cursor.isNull(3) ? 0L : cursor.getLong(3);
        Long valueOf = cursor.isNull(4) ? null : Long.valueOf(cursor.getLong(4));
        Long valueOf2 = cursor.isNull(5) ? null : Long.valueOf(cursor.getLong(5));
        Long valueOf3 = cursor.isNull(6) ? null : Long.valueOf(cursor.getLong(6));
        if (cursor.isNull(7)) {
            bool = null;
        } else {
            bool = Boolean.valueOf(cursor.getLong(7) == 1);
        }
        E e12 = new E(str2, str3, j10, j11, cursor.isNull(8) ? 0L : cursor.getLong(8), j12, j13, valueOf, valueOf2, valueOf3, bool);
        if (cursor.moveToNext()) {
            this.f25694a.a().o().b("Got multiple records for event aggregates, expected one. appId", C2.x(str2));
        }
        cursor.close();
        return e12;
    }

    private final void P(String str, E e10) {
        AbstractC1287s.m(e10);
        h();
        j();
        ContentValues contentValues = new ContentValues();
        String str2 = e10.f25365a;
        contentValues.put("app_id", str2);
        contentValues.put("name", e10.f25366b);
        contentValues.put("lifetime_count", Long.valueOf(e10.f25367c));
        contentValues.put("current_bundle_count", Long.valueOf(e10.f25368d));
        contentValues.put("last_fire_timestamp", Long.valueOf(e10.f25370f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(e10.f25371g));
        contentValues.put("last_bundled_day", e10.f25372h);
        contentValues.put("last_sampled_complex_event_id", e10.f25373i);
        contentValues.put("last_sampling_rate", e10.f25374j);
        contentValues.put("current_session_count", Long.valueOf(e10.f25369e));
        Boolean bool = e10.f25375k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (u0().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                this.f25694a.a().o().b("Failed to insert/update event aggregates (got -1). appId", C2.x(str2));
            }
        } catch (SQLiteException e11) {
            this.f25694a.a().o().c("Error storing event aggregates. appId", C2.x(e10.f25365a), e11);
        }
    }

    private final void Q(String str, String str2) {
        AbstractC1287s.g(str2);
        h();
        j();
        try {
            u0().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e10) {
            this.f25694a.a().o().c("Error deleting snapshot. appId", C2.x(str2), e10);
        }
    }

    private final e7 R(String str, long j10, byte[] bArr, String str2, String str3, int i10, int i11, long j11, long j12, long j13) {
        if (TextUtils.isEmpty(str2)) {
            this.f25694a.a().v().a("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
            return null;
        }
        try {
            com.google.android.gms.internal.measurement.Z2 z22 = (com.google.android.gms.internal.measurement.Z2) g7.W(C2207c3.J(), bArr);
            EnumC2714k5 zzb = EnumC2714k5.zzb(i10);
            if (zzb != EnumC2714k5.GOOGLE_SIGNAL && zzb != EnumC2714k5.GOOGLE_SIGNAL_PENDING && i11 > 0) {
                ArrayList arrayList = new ArrayList();
                Iterator it = z22.y().iterator();
                while (it.hasNext()) {
                    C2216d3 c2216d3 = (C2216d3) ((C2225e3) it.next()).p();
                    c2216d3.H0(i11);
                    arrayList.add((C2225e3) c2216d3.v());
                }
                z22.E();
                z22.D(arrayList);
            }
            HashMap hashMap = new HashMap();
            if (str3 != null) {
                String[] split = str3.split("\r\n");
                int length = split.length;
                int i12 = 0;
                while (true) {
                    if (i12 >= length) {
                        break;
                    }
                    String str4 = split[i12];
                    if (str4.isEmpty()) {
                        break;
                    }
                    String[] split2 = str4.split("=", 2);
                    if (split2.length != 2) {
                        this.f25694a.a().o().b("Invalid upload header: ", str4);
                        break;
                    }
                    hashMap.put(split2[0], split2[1]);
                    i12++;
                }
            }
            d7 d7Var = new d7();
            d7Var.b(j10);
            d7Var.c((C2207c3) z22.v());
            d7Var.d(str2);
            d7Var.e(hashMap);
            d7Var.f(zzb);
            d7Var.g(j11);
            d7Var.h(j12);
            d7Var.i(j13);
            d7Var.j(i11);
            return d7Var.a();
        } catch (IOException e10) {
            this.f25694a.a().o().c("Failed to queued MeasurementBatch from upload_queue. appId", str, e10);
            return null;
        }
    }

    private final String S() {
        C2760q3 c2760q3 = this.f25694a;
        long a10 = c2760q3.f().a();
        Locale locale = Locale.US;
        EnumC2714k5 enumC2714k5 = EnumC2714k5.GOOGLE_SIGNAL;
        Integer valueOf = Integer.valueOf(enumC2714k5.zza());
        Long valueOf2 = Long.valueOf(a10);
        c2760q3.w();
        Long l10 = (Long) AbstractC2671f2.f25973T.b(null);
        l10.longValue();
        String format = String.format(locale, "(upload_type = %d AND ABS(creation_timestamp - %d) > %d)", valueOf, valueOf2, l10);
        Integer valueOf3 = Integer.valueOf(enumC2714k5.zza());
        c2760q3.w();
        String format2 = String.format(locale, "(upload_type != %d AND ABS(creation_timestamp - %d) > %d)", valueOf3, valueOf2, Long.valueOf(C2724m.q()));
        StringBuilder sb2 = new StringBuilder(format.length() + 5 + format2.length() + 1);
        sb2.append("(");
        sb2.append(format);
        sb2.append(" OR ");
        sb2.append(format2);
        sb2.append(")");
        return sb2.toString();
    }

    private static final String T(List list) {
        return list.isEmpty() ? BuildConfig.FLAVOR : String.format(" AND (upload_type IN (%s))", TextUtils.join(", ", list));
    }

    static final void o0(ContentValues contentValues, String str, Object obj) {
        AbstractC1287s.g("value");
        AbstractC1287s.m(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put("value", (Double) obj);
        }
    }

    private final long p0(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = u0().rawQuery(str, strArr);
                if (!rawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j10 = rawQuery.getLong(0);
                rawQuery.close();
                return j10;
            } catch (SQLiteException e10) {
                this.f25694a.a().o().c("Database error", str, e10);
                throw e10;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    private final long q0(String str, String[] strArr, long j10) {
        Cursor cursor = null;
        try {
            try {
                cursor = u0().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    j10 = cursor.getLong(0);
                }
                cursor.close();
                return j10;
            } catch (SQLiteException e10) {
                this.f25694a.a().o().c("Database error", str, e10);
                throw e10;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final long A() {
        return q0("select max(timestamp) from raw_events", null, 0L);
    }

    public final boolean A0(j7 j7Var) {
        AbstractC1287s.m(j7Var);
        h();
        j();
        String str = j7Var.f26134a;
        String str2 = j7Var.f26136c;
        if (B0(str, str2) == null) {
            if (l7.r0(str2)) {
                if (p0("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str}) >= this.f25694a.w().F(str, AbstractC2671f2.f25979W, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(str2)) {
                long p02 = p0("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str, j7Var.f26135b});
                this.f25694a.w();
                if (p02 >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", j7Var.f26135b);
        contentValues.put("name", str2);
        contentValues.put("set_timestamp", Long.valueOf(j7Var.f26137d));
        o0(contentValues, "value", j7Var.f26138e);
        try {
            if (u0().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            this.f25694a.a().o().b("Failed to insert/update user property (got -1). appId", C2.x(str));
            return true;
        } catch (SQLiteException e10) {
            this.f25694a.a().o().c("Error storing user property. appId", C2.x(j7Var.f26134a), e10);
            return true;
        }
    }

    public final boolean B() {
        return p0("select count(1) > 0 from raw_events", null) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final j7 B0(String str, String str2) {
        SQLiteException e10;
        Cursor cursor;
        AbstractC1287s.g(str);
        AbstractC1287s.g(str2);
        h();
        j();
        Cursor cursor2 = null;
        try {
            cursor = u0().query("user_attributes", new String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (cursor.moveToFirst()) {
                        long j10 = cursor.getLong(0);
                        Object x10 = x(cursor, 1);
                        if (x10 != null) {
                            j7 j7Var = new j7(str, cursor.getString(2), str2, j10, x10);
                            if (cursor.moveToNext()) {
                                this.f25694a.a().o().b("Got multiple records for user property, expected one. appId", C2.x(str));
                            }
                            cursor.close();
                            return j7Var;
                        }
                    }
                } catch (SQLiteException e11) {
                    e10 = e11;
                    C2760q3 c2760q3 = this.f25694a;
                    c2760q3.a().o().d("Error querying user property. appId", C2.x(str), c2760q3.D().c(str2), e10);
                    if (cursor != null) {
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e12) {
            e10 = e12;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
            }
            throw th;
        }
        if (cursor != null) {
            cursor.close();
        }
        return null;
    }

    public final boolean C(String str, String str2) {
        return p0("select count(1) from raw_events where app_id = ? and name = ?", new String[]{str, str2}) > 0;
    }

    public final List C0(String str) {
        AbstractC1287s.g(str);
        h();
        j();
        List arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                C2760q3 c2760q3 = this.f25694a;
                c2760q3.w();
                cursor = u0().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (cursor.moveToFirst()) {
                    do {
                        String string = cursor.getString(0);
                        String string2 = cursor.getString(1);
                        if (string2 == null) {
                            string2 = BuildConfig.FLAVOR;
                        }
                        String str2 = string2;
                        long j10 = cursor.getLong(2);
                        Object x10 = x(cursor, 3);
                        if (x10 == null) {
                            c2760q3.a().o().b("Read invalid user property value, ignoring it. appId", C2.x(str));
                        } else {
                            arrayList.add(new j7(str, str2, string, j10, x10));
                        }
                    } while (cursor.moveToNext());
                }
            } catch (SQLiteException e10) {
                this.f25694a.a().o().c("Error querying user properties. appId", C2.x(str), e10);
                arrayList = Collections.emptyList();
            }
            if (cursor != null) {
                cursor.close();
            }
            return arrayList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final boolean D() {
        return p0("select count(1) > 0 from raw_events where realtime = 1", null) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b6, code lost:
    
        r0 = r9.a().o();
        r9.w();
        r0.b("Read more than the max allowed user properties, ignoring excess", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List D0(String str, String str2, String str3) {
        Cursor cursor;
        String str4;
        Cursor cursor2;
        AbstractC1287s.g(str);
        h();
        j();
        List arrayList = new ArrayList();
        try {
            try {
                ArrayList arrayList2 = new ArrayList(3);
                arrayList2.add(str);
                StringBuilder sb2 = new StringBuilder("app_id=?");
                if (TextUtils.isEmpty(str2)) {
                    str4 = str2;
                } else {
                    str4 = str2;
                    try {
                        arrayList2.add(str4);
                        sb2.append(" and origin=?");
                    } catch (SQLiteException e10) {
                        e = e10;
                        cursor = null;
                        try {
                            this.f25694a.a().o().d("(2)Error querying user properties", C2.x(str), str4, e);
                            arrayList = Collections.emptyList();
                            cursor2 = cursor;
                            if (cursor2 != null) {
                            }
                            return arrayList;
                        } catch (Throwable th) {
                            th = th;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                }
                if (!TextUtils.isEmpty(str3)) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 1);
                    sb3.append(str3);
                    sb3.append("*");
                    arrayList2.add(sb3.toString());
                    sb2.append(" and name glob ?");
                }
                String[] strArr = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
                String sb4 = sb2.toString();
                C2760q3 c2760q3 = this.f25694a;
                c2760q3.w();
                cursor2 = u0().query("user_attributes", new String[]{"name", "set_timestamp", "value", "origin"}, sb4, strArr, null, null, "rowid", "1001");
                try {
                    try {
                        if (cursor2.moveToFirst()) {
                            while (true) {
                                int size = arrayList.size();
                                c2760q3.w();
                                if (size >= 1000) {
                                    break;
                                }
                                String string = cursor2.getString(0);
                                long j10 = cursor2.getLong(1);
                                Object x10 = x(cursor2, 2);
                                String string2 = cursor2.getString(3);
                                if (x10 == null) {
                                    try {
                                        c2760q3.a().o().d("(2)Read invalid user property value, ignoring it", C2.x(str), string2, str3);
                                    } catch (SQLiteException e11) {
                                        e = e11;
                                        cursor = cursor2;
                                        str4 = string2;
                                        this.f25694a.a().o().d("(2)Error querying user properties", C2.x(str), str4, e);
                                        arrayList = Collections.emptyList();
                                        cursor2 = cursor;
                                        if (cursor2 != null) {
                                        }
                                        return arrayList;
                                    }
                                } else {
                                    arrayList.add(new j7(str, string2, string, j10, x10));
                                }
                                if (!cursor2.moveToNext()) {
                                    break;
                                }
                                str4 = string2;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = cursor2;
                        if (cursor != null) {
                        }
                        throw th;
                    }
                } catch (SQLiteException e12) {
                    e = e12;
                    cursor = cursor2;
                }
            } catch (SQLiteException e13) {
                e = e13;
                str4 = str2;
            }
            if (cursor2 != null) {
                cursor2.close();
            }
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
    }

    public final long E(String str) {
        AbstractC1287s.g(str);
        return q0("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    public final boolean E0(C2692i c2692i) {
        AbstractC1287s.m(c2692i);
        h();
        j();
        String str = c2692i.f26102a;
        AbstractC1287s.m(str);
        if (B0(str, c2692i.f26104c.f26096b) == null) {
            long p02 = p0("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            this.f25694a.w();
            if (p02 >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", c2692i.f26103b);
        contentValues.put("name", c2692i.f26104c.f26096b);
        o0(contentValues, "value", AbstractC1287s.m(c2692i.f26104c.j()));
        contentValues.put(AppStateModule.APP_STATE_ACTIVE, Boolean.valueOf(c2692i.f26106e));
        contentValues.put("trigger_event_name", c2692i.f26107f);
        contentValues.put("trigger_timeout", Long.valueOf(c2692i.f26109h));
        C2760q3 c2760q3 = this.f25694a;
        contentValues.put("timed_out_event", c2760q3.C().T(c2692i.f26108g));
        contentValues.put("creation_timestamp", Long.valueOf(c2692i.f26105d));
        contentValues.put("triggered_event", c2760q3.C().T(c2692i.f26110i));
        contentValues.put("triggered_timestamp", Long.valueOf(c2692i.f26104c.f26097c));
        contentValues.put("time_to_live", Long.valueOf(c2692i.f26111j));
        contentValues.put("expired_event", c2760q3.C().T(c2692i.f26112k));
        try {
            if (u0().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            c2760q3.a().o().b("Failed to insert/update conditional user property (got -1)", C2.x(str));
            return true;
        } catch (SQLiteException e10) {
            this.f25694a.a().o().c("Error storing conditional user property", C2.x(str), e10);
            return true;
        }
    }

    public final boolean F(String str, Long l10, long j10, com.google.android.gms.internal.measurement.S2 s22) {
        h();
        j();
        AbstractC1287s.m(s22);
        AbstractC1287s.g(str);
        AbstractC1287s.m(l10);
        C2760q3 c2760q3 = this.f25694a;
        byte[] c10 = s22.c();
        c2760q3.a().w().c("Saving complex main event, appId, data size", c2760q3.D().a(str), Integer.valueOf(c10.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l10);
        contentValues.put("children_to_process", Long.valueOf(j10));
        contentValues.put("main_event", c10);
        try {
            if (u0().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            c2760q3.a().o().b("Failed to insert complex main event (got -1). appId", C2.x(str));
            return false;
        } catch (SQLiteException e10) {
            this.f25694a.a().o().c("Error storing complex main event. appId", C2.x(str), e10);
            return false;
        }
    }

    /* JADX WARN: Not initialized variable reg: 10, insn: 0x00f4: MOVE (r9 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]) (LINE:245), block:B:32:0x00f4 */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C2692i F0(String str, String str2) {
        Cursor cursor;
        Cursor cursor2;
        AbstractC1287s.g(str);
        AbstractC1287s.g(str2);
        h();
        j();
        Cursor cursor3 = null;
        try {
            try {
                cursor = u0().query("conditional_properties", new String[]{"origin", "value", AppStateModule.APP_STATE_ACTIVE, "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
                try {
                } catch (SQLiteException e10) {
                    e = e10;
                    C2760q3 c2760q3 = this.f25694a;
                    c2760q3.a().o().d("Error querying conditional property", C2.x(str), c2760q3.D().c(str2), e);
                    if (cursor != null) {
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor3 = cursor2;
                if (cursor3 != null) {
                    cursor3.close();
                }
                throw th;
            }
        } catch (SQLiteException e11) {
            e = e11;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor3 != null) {
            }
            throw th;
        }
        if (!cursor.moveToFirst()) {
            if (cursor != null) {
                cursor.close();
            }
            return null;
        }
        String string = cursor.getString(0);
        if (string == null) {
            string = BuildConfig.FLAVOR;
        }
        String str3 = string;
        Object x10 = x(cursor, 1);
        boolean z10 = cursor.getInt(2) != 0;
        String string2 = cursor.getString(3);
        long j10 = cursor.getLong(4);
        b7 b7Var = this.f25405b;
        g7 K02 = b7Var.K0();
        byte[] blob = cursor.getBlob(5);
        Parcelable.Creator<I> creator = I.CREATOR;
        C2692i c2692i = new C2692i(str, str3, new h7(str2, cursor.getLong(8), x10, str3), cursor.getLong(6), z10, string2, (I) K02.N(blob, creator), j10, (I) b7Var.K0().N(cursor.getBlob(7), creator), cursor.getLong(9), (I) b7Var.K0().N(cursor.getBlob(10), creator));
        if (cursor.moveToNext()) {
            C2760q3 c2760q32 = this.f25694a;
            c2760q32.a().o().c("Got multiple records for conditional property, expected one", C2.x(str), c2760q32.D().c(str2));
        }
        cursor.close();
        return c2692i;
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x006a: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]) (LINE:107), block:B:27:0x006a */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bundle G(String str) {
        Cursor cursor;
        Cursor cursor2;
        h();
        j();
        Cursor cursor3 = null;
        try {
            try {
                cursor = u0().rawQuery("select parameters from default_event_params where app_id=?", new String[]{str});
                try {
                    if (cursor.moveToFirst()) {
                        try {
                            com.google.android.gms.internal.measurement.S2 s22 = (com.google.android.gms.internal.measurement.S2) ((com.google.android.gms.internal.measurement.R2) g7.W(com.google.android.gms.internal.measurement.S2.M(), cursor.getBlob(0))).v();
                            this.f25405b.K0();
                            Bundle q10 = g7.q(s22.C());
                            cursor.close();
                            return q10;
                        } catch (IOException e10) {
                            this.f25694a.a().o().c("Failed to retrieve default event parameters. appId", C2.x(str), e10);
                        }
                    } else {
                        this.f25694a.a().w().a("Default event parameters not found");
                    }
                } catch (SQLiteException e11) {
                    e = e11;
                    this.f25694a.a().o().b("Error selecting default event parameters", e);
                    if (cursor != null) {
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor3 = cursor2;
                if (cursor3 != null) {
                    cursor3.close();
                }
                throw th;
            }
        } catch (SQLiteException e12) {
            e = e12;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor3 != null) {
            }
            throw th;
        }
        if (cursor != null) {
            cursor.close();
        }
        return null;
    }

    public final int G0(String str, String str2) {
        AbstractC1287s.g(str);
        AbstractC1287s.g(str2);
        h();
        j();
        try {
            return u0().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            C2760q3 c2760q3 = this.f25694a;
            c2760q3.a().o().d("Error deleting conditional property", C2.x(str), c2760q3.D().c(str2), e10);
            return 0;
        }
    }

    final boolean H(String str, long j10) {
        try {
            if (q0("select count(*) from raw_events where app_id=? and timestamp >= ? and name not like '!_%' escape '!' limit 1;", new String[]{str, String.valueOf(j10)}, 0L) > 0) {
                return false;
            }
            return q0("select count(*) from raw_events where app_id=? and timestamp >= ? and name like '!_%' escape '!' limit 1;", new String[]{str, String.valueOf(j10)}, 0L) > 0;
        } catch (SQLiteException e10) {
            this.f25694a.a().o().b("Error checking backfill conditions", e10);
            return false;
        }
    }

    public final List H0(String str, String str2, String str3) {
        AbstractC1287s.g(str);
        h();
        j();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb2 = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb2.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb2.append(" and name glob ?");
        }
        return I0(sb2.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02b0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x002e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I(String str, Long l10, String str2, Bundle bundle) {
        String string;
        String str3;
        Bundle bundle2;
        long update;
        C2225e3 c2225e3;
        Cursor query;
        AbstractC1287s.m(bundle);
        h();
        j();
        C2787u c2787u = l10 != null ? new C2787u(this, str, l10.longValue()) : new C2787u(this, str);
        for (List<C2779t> a10 = c2787u.a(); !a10.isEmpty(); a10 = c2787u.a()) {
            for (C2779t c2779t : a10) {
                if (!TextUtils.isEmpty(str2)) {
                    Cursor cursor = null;
                    C2225e3 c2225e32 = null;
                    Cursor cursor2 = null;
                    try {
                        try {
                            query = u0().query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str, Long.toString(c2779t.f26346b)}, null, null, "rowid", "2");
                            try {
                                try {
                                } catch (Throwable th) {
                                    th = th;
                                    cursor = query;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    throw th;
                                }
                            } catch (SQLiteException e10) {
                                e = e10;
                                c2225e3 = null;
                            }
                        } catch (SQLiteException e11) {
                            e = e11;
                            c2225e3 = null;
                        }
                        if (query.moveToFirst()) {
                            try {
                                c2225e3 = (C2225e3) ((C2216d3) g7.W(C2225e3.h0(), query.getBlob(0))).v();
                                try {
                                    if (query.moveToNext()) {
                                        this.f25694a.a().r().b("Get multiple raw event metadata records, expected one. appId", C2.x(str));
                                    }
                                    query.close();
                                    query.close();
                                } catch (SQLiteException e12) {
                                    e = e12;
                                    cursor2 = query;
                                    this.f25694a.a().o().c("Data loss. Error selecting raw event. appId", C2.x(str), e);
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    c2225e32 = c2225e3;
                                    if (c2225e32 != null) {
                                    }
                                    b7 b7Var = this.f25405b;
                                    g7 K02 = b7Var.K0();
                                    com.google.android.gms.internal.measurement.S2 s22 = c2779t.f26348d;
                                    Bundle bundle3 = new Bundle();
                                    while (r4.hasNext()) {
                                    }
                                    string = bundle3.getString("_o");
                                    bundle3.remove("_o");
                                    String F10 = s22.F();
                                    if (string == null) {
                                    }
                                    D2 d22 = new D2(F10, string, bundle3, s22.H());
                                    C2760q3 c2760q3 = this.f25694a;
                                    Bundle bundle4 = d22.f25357d;
                                    str3 = d22.f25354a;
                                    l7 C10 = c2760q3.C();
                                    if (str3.equals("_cmp")) {
                                    }
                                    C10.w(bundle4, bundle2);
                                    D d10 = new D(this.f25694a, d22.f25355b, str, s22.F(), s22.H(), s22.J(), bundle4);
                                    long j10 = c2779t.f26345a;
                                    long j11 = c2779t.f26346b;
                                    boolean z10 = c2779t.f26347c;
                                    h();
                                    j();
                                    AbstractC1287s.m(d10);
                                    String str4 = d10.f25346a;
                                    AbstractC1287s.g(str4);
                                    byte[] c10 = b7Var.K0().J(d10).c();
                                    ContentValues contentValues = new ContentValues();
                                    contentValues.put("app_id", str4);
                                    contentValues.put("name", d10.f25347b);
                                    contentValues.put("timestamp", Long.valueOf(d10.f25349d));
                                    contentValues.put("metadata_fingerprint", Long.valueOf(j11));
                                    contentValues.put("data", c10);
                                    contentValues.put("realtime", Integer.valueOf(z10 ? 1 : 0));
                                    update = u0().update("raw_events", contentValues, "rowid = ?", new String[]{String.valueOf(j10)});
                                    if (update == 1) {
                                    }
                                }
                                c2225e32 = c2225e3;
                            } catch (IOException e13) {
                                this.f25694a.a().o().c("Data loss. Failed to merge raw event metadata. appId", C2.x(str), e13);
                            }
                            if (c2225e32 != null) {
                                Iterator it = c2225e32.n2().iterator();
                                while (it.hasNext()) {
                                    if (((C2377v3) it.next()).E().equals(str2)) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            this.f25694a.a().o().b("Raw event metadata record is missing. appId", C2.x(str));
                        }
                        query.close();
                        if (c2225e32 != null) {
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                b7 b7Var2 = this.f25405b;
                g7 K022 = b7Var2.K0();
                com.google.android.gms.internal.measurement.S2 s222 = c2779t.f26348d;
                Bundle bundle32 = new Bundle();
                for (com.google.android.gms.internal.measurement.W2 w22 : s222.C()) {
                    if (w22.K()) {
                        bundle32.putDouble(w22.D(), w22.L());
                    } else if (w22.I()) {
                        bundle32.putFloat(w22.D(), w22.J());
                    } else if (w22.G()) {
                        bundle32.putLong(w22.D(), w22.H());
                    } else if (w22.E()) {
                        bundle32.putString(w22.D(), w22.F());
                    } else if (w22.M().isEmpty()) {
                        K022.f25694a.a().o().b("Unexpected parameter type for parameter", w22);
                    } else {
                        bundle32.putParcelableArray(w22.D(), g7.Y(w22.M()));
                    }
                }
                string = bundle32.getString("_o");
                bundle32.remove("_o");
                String F102 = s222.F();
                if (string == null) {
                    string = BuildConfig.FLAVOR;
                }
                D2 d222 = new D2(F102, string, bundle32, s222.H());
                C2760q3 c2760q32 = this.f25694a;
                Bundle bundle42 = d222.f25357d;
                str3 = d222.f25354a;
                l7 C102 = c2760q32.C();
                if (str3.equals("_cmp")) {
                    bundle2 = bundle;
                } else {
                    bundle2 = new Bundle(bundle);
                    Iterator<String> it2 = bundle.keySet().iterator();
                    while (it2.hasNext()) {
                        String next = it2.next();
                        Iterator<String> it3 = it2;
                        if (next.startsWith("gad_")) {
                            bundle2.remove(next);
                        }
                        it2 = it3;
                    }
                }
                C102.w(bundle42, bundle2);
                D d102 = new D(this.f25694a, d222.f25355b, str, s222.F(), s222.H(), s222.J(), bundle42);
                long j102 = c2779t.f26345a;
                long j112 = c2779t.f26346b;
                boolean z102 = c2779t.f26347c;
                h();
                j();
                AbstractC1287s.m(d102);
                String str42 = d102.f25346a;
                AbstractC1287s.g(str42);
                byte[] c102 = b7Var2.K0().J(d102).c();
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("app_id", str42);
                contentValues2.put("name", d102.f25347b);
                contentValues2.put("timestamp", Long.valueOf(d102.f25349d));
                contentValues2.put("metadata_fingerprint", Long.valueOf(j112));
                contentValues2.put("data", c102);
                contentValues2.put("realtime", Integer.valueOf(z102 ? 1 : 0));
                try {
                    update = u0().update("raw_events", contentValues2, "rowid = ?", new String[]{String.valueOf(j102)});
                    if (update == 1) {
                        c2760q32.a().o().c("Failed to update raw event. appId, updatedRows", C2.x(str42), Long.valueOf(update));
                    }
                } catch (SQLiteException e14) {
                    this.f25694a.a().o().c("Error updating raw event. appId", C2.x(d102.f25346a), e14);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
    
        r2 = r12.a().o();
        r12.w();
        r2.b("Read more than the max allowed conditional properties, ignoring extra", 1000);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List I0(String str, String[] strArr) {
        h();
        j();
        List arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase u02 = u0();
                String[] strArr2 = {"app_id", "origin", "name", "value", AppStateModule.APP_STATE_ACTIVE, "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"};
                C2760q3 c2760q3 = this.f25694a;
                c2760q3.w();
                cursor = u02.query("conditional_properties", strArr2, str, strArr, null, null, "rowid", "1001");
                if (cursor.moveToFirst()) {
                    while (true) {
                        int size = arrayList.size();
                        c2760q3.w();
                        if (size >= 1000) {
                            break;
                        }
                        String string = cursor.getString(0);
                        String string2 = cursor.getString(1);
                        String string3 = cursor.getString(2);
                        Object x10 = x(cursor, 3);
                        boolean z10 = cursor.getInt(4) != 0;
                        String string4 = cursor.getString(5);
                        long j10 = cursor.getLong(6);
                        b7 b7Var = this.f25405b;
                        g7 K02 = b7Var.K0();
                        byte[] blob = cursor.getBlob(7);
                        Parcelable.Creator<I> creator = I.CREATOR;
                        I i10 = (I) K02.N(blob, creator);
                        arrayList.add(new C2692i(string, string2, new h7(string3, cursor.getLong(10), x10, string2), cursor.getLong(8), z10, string4, i10, j10, (I) b7Var.K0().N(cursor.getBlob(9), creator), cursor.getLong(11), (I) b7Var.K0().N(cursor.getBlob(12), creator)));
                        if (!cursor.moveToNext()) {
                            break;
                        }
                    }
                }
            } catch (SQLiteException e10) {
                this.f25694a.a().o().b("Error querying conditional user property value", e10);
                arrayList = Collections.emptyList();
            }
            if (cursor != null) {
                cursor.close();
            }
            return arrayList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
    
        if (r5 == 0) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v9, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C2633a4 J(String str) {
        Throwable th;
        SQLiteException e10;
        AbstractC1287s.m(str);
        h();
        j();
        ?? r52 = {str};
        Cursor cursor = null;
        r1 = null;
        r1 = null;
        C2633a4 c2633a4 = null;
        try {
            try {
                r52 = u0().rawQuery("select consent_state, consent_source from consent_settings where app_id=? limit 1;", r52);
                try {
                    if (r52.moveToFirst()) {
                        c2633a4 = C2633a4.f(r52.getString(0), r52.getInt(1));
                    } else {
                        this.f25694a.a().w().a("No data found");
                    }
                } catch (SQLiteException e11) {
                    e10 = e11;
                    this.f25694a.a().o().b("Error querying database.", e10);
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = r52;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e12) {
            e10 = e12;
            r52 = 0;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
            }
            throw th;
        }
        r52.close();
        return c2633a4 == null ? C2633a4.f25768c : c2633a4;
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0300  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final I2 J0(String str) {
        Cursor cursor;
        Boolean valueOf;
        AbstractC1287s.g(str);
        h();
        j();
        Cursor cursor2 = null;
        try {
            cursor = u0().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token", "sgtm_upload_enabled", "target_os_version", "session_stitching_token_hash", "ad_services_version", "unmatched_first_open_without_ad_id", "npa_metadata_value", "attribution_eligibility_status", "sgtm_preview_key", "dma_consent_state", "daily_realtime_dcu_count", "bundle_delivery_index", "serialized_npa_metadata", "unmatched_pfo", "unmatched_uwa", "ad_campaign_info", "client_upload_eligibility"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                try {
                } catch (SQLiteException e10) {
                    e = e10;
                    this.f25694a.a().o().c("Error querying app. appId", C2.x(str), e);
                    if (cursor != null) {
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e11) {
            e = e11;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
            }
            throw th;
        }
        if (!cursor.moveToFirst()) {
            if (cursor != null) {
                cursor.close();
            }
            return null;
        }
        b7 b7Var = this.f25405b;
        I2 i22 = new I2(b7Var.g0(), str);
        C2633a4 g10 = b7Var.g(str);
        Z3 z32 = Z3.ANALYTICS_STORAGE;
        if (g10.o(z32)) {
            i22.q0(cursor.getString(0));
        }
        i22.s0(cursor.getString(1));
        if (b7Var.g(str).o(Z3.AD_STORAGE)) {
            i22.w0(cursor.getString(2));
        }
        i22.f(cursor.getLong(3));
        i22.A0(cursor.getLong(4));
        i22.C0(cursor.getLong(5));
        i22.E0(cursor.getString(6));
        i22.I0(cursor.getString(7));
        i22.K0(cursor.getLong(8));
        i22.a(cursor.getLong(9));
        i22.e(cursor.isNull(10) || cursor.getInt(10) != 0);
        i22.o(cursor.getLong(11));
        i22.q(cursor.getLong(12));
        i22.s(cursor.getLong(13));
        i22.u(cursor.getLong(14));
        i22.i(cursor.getLong(15));
        i22.k(cursor.getLong(16));
        i22.G0(cursor.isNull(17) ? -2147483648L : cursor.getInt(17));
        i22.y0(cursor.getString(18));
        i22.y(cursor.getLong(19));
        i22.w(cursor.getLong(20));
        i22.O(cursor.getString(21));
        i22.Q(cursor.isNull(23) || cursor.getInt(23) != 0);
        i22.c(cursor.isNull(25) ? 0L : cursor.getLong(25));
        if (!cursor.isNull(26)) {
            i22.U(Arrays.asList(cursor.getString(26).split(",", -1)));
        }
        if (b7Var.g(str).o(z32)) {
            i22.u0(cursor.getString(28));
        }
        i22.W((cursor.isNull(29) || cursor.getInt(29) == 0) ? false : true);
        i22.F(cursor.getLong(39));
        i22.m0(cursor.getString(36));
        i22.Y(cursor.getLong(30));
        i22.a0(cursor.getLong(31));
        C2301m7.a();
        C2760q3 c2760q3 = this.f25694a;
        if (c2760q3.w().H(str, AbstractC2671f2.f25968Q0)) {
            i22.c0(cursor.getInt(32));
            i22.k0(cursor.getLong(35));
        }
        i22.e0((cursor.isNull(33) || cursor.getInt(33) == 0) ? false : true);
        if (cursor.isNull(34)) {
            valueOf = null;
        } else {
            valueOf = Boolean.valueOf(cursor.getInt(34) != 0);
        }
        i22.S(valueOf);
        i22.C(cursor.getInt(37));
        i22.E(cursor.getInt(38));
        i22.H(cursor.isNull(40) ? BuildConfig.FLAVOR : (String) AbstractC1287s.m(cursor.getString(40)));
        if (!cursor.isNull(41)) {
            i22.g0(Long.valueOf(cursor.getLong(41)));
        }
        if (!cursor.isNull(42)) {
            i22.i0(Long.valueOf(cursor.getLong(42)));
        }
        i22.J(cursor.getBlob(43));
        if (!cursor.isNull(44)) {
            i22.L(cursor.getInt(44));
        }
        i22.n0();
        if (cursor.moveToNext()) {
            c2760q3.a().o().b("Got multiple records for app, expected one. appId", C2.x(str));
        }
        cursor.close();
        return i22;
    }

    public final boolean K(String str, B6 b62) {
        h();
        j();
        AbstractC1287s.m(b62);
        AbstractC1287s.g(str);
        C2760q3 c2760q3 = this.f25694a;
        long a10 = c2760q3.f().a();
        C2663e2 c2663e2 = AbstractC2671f2.f26044w0;
        long longValue = a10 - ((Long) c2663e2.b(null)).longValue();
        long j10 = b62.f25323b;
        if (j10 < longValue || j10 > ((Long) c2663e2.b(null)).longValue() + a10) {
            c2760q3.a().r().d("Storing trigger URI outside of the max retention time span. appId, now, timestamp", C2.x(str), Long.valueOf(a10), Long.valueOf(j10));
        }
        c2760q3.a().w().a("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", b62.f25322a);
        contentValues.put("source", Integer.valueOf(b62.f25324c));
        contentValues.put("timestamp_millis", Long.valueOf(j10));
        try {
            if (u0().insert("trigger_uris", null, contentValues) != -1) {
                return true;
            }
            c2760q3.a().o().b("Failed to insert trigger URI (got -1). appId", C2.x(str));
            return false;
        } catch (SQLiteException e10) {
            this.f25694a.a().o().c("Error storing trigger URI. appId", C2.x(str), e10);
            return false;
        }
    }

    public final void K0(I2 i22, boolean z10, boolean z11) {
        AbstractC1287s.m(i22);
        h();
        j();
        String o02 = i22.o0();
        AbstractC1287s.m(o02);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", o02);
        if (z10) {
            contentValues.put("app_instance_id", (String) null);
        } else if (this.f25405b.g(o02).o(Z3.ANALYTICS_STORAGE)) {
            contentValues.put("app_instance_id", i22.p0());
        }
        contentValues.put("gmp_app_id", i22.r0());
        b7 b7Var = this.f25405b;
        if (b7Var.g(o02).o(Z3.AD_STORAGE)) {
            contentValues.put("resettable_device_id_hash", i22.v0());
        }
        contentValues.put("last_bundle_index", Long.valueOf(i22.g()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(i22.z0()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(i22.B0()));
        contentValues.put("app_version", i22.D0());
        contentValues.put("app_store", i22.H0());
        contentValues.put("gmp_version", Long.valueOf(i22.J0()));
        contentValues.put("dev_cert_hash", Long.valueOf(i22.L0()));
        contentValues.put("measurement_enabled", Boolean.valueOf(i22.d()));
        contentValues.put("day", Long.valueOf(i22.n()));
        contentValues.put("daily_public_events_count", Long.valueOf(i22.p()));
        contentValues.put("daily_events_count", Long.valueOf(i22.r()));
        contentValues.put("daily_conversions_count", Long.valueOf(i22.t()));
        contentValues.put("config_fetched_time", Long.valueOf(i22.h()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(i22.j()));
        contentValues.put("app_version_int", Long.valueOf(i22.F0()));
        contentValues.put("firebase_instance_id", i22.x0());
        contentValues.put("daily_error_events_count", Long.valueOf(i22.x()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(i22.v()));
        contentValues.put("health_monitor_sample", i22.z());
        contentValues.put("android_id", (Long) 0L);
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(i22.P()));
        contentValues.put("dynamite_version", Long.valueOf(i22.b()));
        if (b7Var.g(o02).o(Z3.ANALYTICS_STORAGE)) {
            contentValues.put("session_stitching_token", i22.t0());
        }
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(i22.V()));
        contentValues.put("target_os_version", Long.valueOf(i22.X()));
        contentValues.put("session_stitching_token_hash", Long.valueOf(i22.Z()));
        C2301m7.a();
        C2760q3 c2760q3 = this.f25694a;
        if (c2760q3.w().H(o02, AbstractC2671f2.f25968Q0)) {
            contentValues.put("ad_services_version", Integer.valueOf(i22.b0()));
            contentValues.put("attribution_eligibility_status", Long.valueOf(i22.j0()));
        }
        contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(i22.d0()));
        contentValues.put("npa_metadata_value", i22.R());
        contentValues.put("bundle_delivery_index", Long.valueOf(i22.G()));
        contentValues.put("sgtm_preview_key", i22.l0());
        contentValues.put("dma_consent_state", Integer.valueOf(i22.B()));
        contentValues.put("daily_realtime_dcu_count", Integer.valueOf(i22.D()));
        contentValues.put("serialized_npa_metadata", i22.I());
        contentValues.put("client_upload_eligibility", Integer.valueOf(i22.M()));
        List T10 = i22.T();
        if (T10 != null) {
            if (T10.isEmpty()) {
                c2760q3.a().r().b("Safelisted events should not be an empty list. appId", o02);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", T10));
            }
        }
        com.google.android.gms.internal.measurement.N6.a();
        if (c2760q3.w().H(null, AbstractC2671f2.f25958L0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        contentValues.put("unmatched_pfo", i22.f0());
        contentValues.put("unmatched_uwa", i22.h0());
        contentValues.put("ad_campaign_info", i22.K());
        try {
            SQLiteDatabase u02 = u0();
            if (u02.update("apps", contentValues, "app_id = ?", new String[]{o02}) == 0 && u02.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                c2760q3.a().o().b("Failed to insert/update app (got -1). appId", C2.x(o02));
            }
        } catch (SQLiteException e10) {
            this.f25694a.a().o().c("Error storing app. appId", C2.x(o02), e10);
        }
    }

    public final void L(String str, C2633a4 c2633a4) {
        AbstractC1287s.m(str);
        AbstractC1287s.m(c2633a4);
        h();
        j();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", c2633a4.l());
        contentValues.put("consent_source", Integer.valueOf(c2633a4.b()));
        N("consent_settings", "app_id", contentValues);
    }

    public final C2771s L0(long j10, String str, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        return M0(j10, str, 1L, false, false, z12, false, z14, z15, z16);
    }

    public final C2771s M0(long j10, String str, long j11, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        AbstractC1287s.g(str);
        h();
        j();
        String[] strArr = {str};
        C2771s c2771s = new C2771s();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase u02 = u0();
                cursor = u02.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (cursor.moveToFirst()) {
                    if (cursor.getLong(0) == j10) {
                        c2771s.f26317b = cursor.getLong(1);
                        c2771s.f26316a = cursor.getLong(2);
                        c2771s.f26318c = cursor.getLong(3);
                        c2771s.f26319d = cursor.getLong(4);
                        c2771s.f26320e = cursor.getLong(5);
                        c2771s.f26321f = cursor.getLong(6);
                        c2771s.f26322g = cursor.getLong(7);
                    }
                    if (z10) {
                        c2771s.f26317b += j11;
                    }
                    if (z11) {
                        c2771s.f26316a += j11;
                    }
                    if (z12) {
                        c2771s.f26318c += j11;
                    }
                    if (z13) {
                        c2771s.f26319d += j11;
                    }
                    if (z14) {
                        c2771s.f26320e += j11;
                    }
                    if (z15) {
                        c2771s.f26321f += j11;
                    }
                    if (z16) {
                        c2771s.f26322g += j11;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("day", Long.valueOf(j10));
                    contentValues.put("daily_public_events_count", Long.valueOf(c2771s.f26316a));
                    contentValues.put("daily_events_count", Long.valueOf(c2771s.f26317b));
                    contentValues.put("daily_conversions_count", Long.valueOf(c2771s.f26318c));
                    contentValues.put("daily_error_events_count", Long.valueOf(c2771s.f26319d));
                    contentValues.put("daily_realtime_events_count", Long.valueOf(c2771s.f26320e));
                    contentValues.put("daily_realtime_dcu_count", Long.valueOf(c2771s.f26321f));
                    contentValues.put("daily_registered_triggers_count", Long.valueOf(c2771s.f26322g));
                    u02.update("apps", contentValues, "app_id=?", strArr);
                } else {
                    this.f25694a.a().r().b("Not updating daily counts, app is not known. appId", C2.x(str));
                }
            } catch (SQLiteException e10) {
                this.f25694a.a().o().c("Error updating daily counts. appId", C2.x(str), e10);
            }
            if (cursor != null) {
                cursor.close();
            }
            return c2771s;
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final r N0(String str) {
        SQLiteException e10;
        Cursor cursor;
        AbstractC1287s.g(str);
        h();
        j();
        Cursor cursor2 = null;
        try {
            cursor = u0().query("apps", new String[]{"remote_config", "config_last_modified_time", "e_tag"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                try {
                    if (cursor.moveToFirst()) {
                        byte[] blob = cursor.getBlob(0);
                        String string = cursor.getString(1);
                        String string2 = cursor.getString(2);
                        if (cursor.moveToNext()) {
                            this.f25694a.a().o().b("Got multiple records for app config, expected one. appId", C2.x(str));
                        }
                        if (blob != null) {
                            r rVar = new r(blob, string, string2);
                            cursor.close();
                            return rVar;
                        }
                    }
                } catch (SQLiteException e11) {
                    e10 = e11;
                    this.f25694a.a().o().c("Error querying remote config. appId", C2.x(str), e10);
                    if (cursor != null) {
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e12) {
            e10 = e12;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
            }
            throw th;
        }
        if (cursor != null) {
            cursor.close();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0043, code lost:
    
        if (r3 > (com.google.android.gms.measurement.internal.C2724m.q() + r1)) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean O0(C2225e3 c2225e3, boolean z10) {
        h();
        j();
        AbstractC1287s.m(c2225e3);
        AbstractC1287s.g(c2225e3.C());
        AbstractC1287s.p(c2225e3.u2());
        u();
        C2760q3 c2760q3 = this.f25694a;
        long a10 = c2760q3.f().a();
        long v22 = c2225e3.v2();
        c2760q3.w();
        if (v22 >= a10 - C2724m.q()) {
            long v23 = c2225e3.v2();
            c2760q3.w();
        }
        c2760q3.a().r().d("Storing bundle outside of the max uploading time span. appId, now, timestamp", C2.x(c2225e3.C()), Long.valueOf(a10), Long.valueOf(c2225e3.v2()));
        try {
            byte[] V10 = this.f25405b.K0().V(c2225e3.c());
            C2760q3 c2760q32 = this.f25694a;
            c2760q32.a().w().b("Saving bundle, size", Integer.valueOf(V10.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", c2225e3.C());
            contentValues.put("bundle_end_timestamp", Long.valueOf(c2225e3.v2()));
            contentValues.put("data", V10);
            contentValues.put("has_realtime", Integer.valueOf(z10 ? 1 : 0));
            if (c2225e3.D0()) {
                contentValues.put("retry_count", Integer.valueOf(c2225e3.E0()));
            }
            try {
                if (u0().insert("queue", null, contentValues) != -1) {
                    return true;
                }
                c2760q32.a().o().b("Failed to insert bundle (got -1). appId", C2.x(c2225e3.C()));
                return false;
            } catch (SQLiteException e10) {
                this.f25694a.a().o().c("Error storing bundle. appId", C2.x(c2225e3.C()), e10);
                return false;
            }
        } catch (IOException e11) {
            this.f25694a.a().o().c("Data loss. Failed to serialize bundle. appId", C2.x(c2225e3.C()), e11);
            return false;
        }
    }

    public final A U(String str) {
        AbstractC1287s.m(str);
        h();
        j();
        return A.g(M("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{str}, BuildConfig.FLAVOR));
    }

    public final void V(String str, A a10) {
        AbstractC1287s.m(str);
        AbstractC1287s.m(a10);
        h();
        j();
        C2633a4 J10 = J(str);
        C2633a4 c2633a4 = C2633a4.f25768c;
        if (J10 == c2633a4) {
            L(str, c2633a4);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("dma_consent_settings", a10.e());
        N("consent_settings", "app_id", contentValues);
    }

    public final void W(String str, C2633a4 c2633a4) {
        AbstractC1287s.m(str);
        AbstractC1287s.m(c2633a4);
        h();
        j();
        L(str, J(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("storage_consent_at_bundling", c2633a4.l());
        N("consent_settings", "app_id", contentValues);
    }

    public final C2633a4 X(String str) {
        AbstractC1287s.m(str);
        h();
        j();
        return C2633a4.f(M("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}, BuildConfig.FLAVOR), 100);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0254, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0238, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01e2, code lost:
    
        r0 = r23.f25694a.a().r();
        r10 = com.google.android.gms.measurement.internal.C2.x(r24);
        r12 = java.lang.Integer.valueOf(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01fa, code lost:
    
        if (r11.C() == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01fc, code lost:
    
        r16 = java.lang.Integer.valueOf(r11.D());
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0209, code lost:
    
        r0.d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r10, r12, java.lang.String.valueOf(r16));
        r21 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0207, code lost:
    
        r16 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x029a, code lost:
    
        r21 = r7;
        r0 = r0.E().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02a8, code lost:
    
        if (r0.hasNext() == false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02aa, code lost:
    
        r3 = (com.google.android.gms.internal.measurement.L1) r0.next();
        j();
        h();
        V6.AbstractC1287s.g(r24);
        V6.AbstractC1287s.m(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x02c4, code lost:
    
        if (r3.E().isEmpty() == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x02f6, code lost:
    
        r7 = r3.c();
        r10 = new android.content.ContentValues();
        r10.put("app_id", r24);
        r10.put("audience_id", java.lang.Integer.valueOf(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x030d, code lost:
    
        if (r3.C() == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x030f, code lost:
    
        r11 = java.lang.Integer.valueOf(r3.D());
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0319, code lost:
    
        r10.put("filter_id", r11);
        r22 = r0;
        r10.put("property_name", r3.E());
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x032b, code lost:
    
        if (r3.I() == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x032d, code lost:
    
        r0 = java.lang.Boolean.valueOf(r3.J());
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0337, code lost:
    
        r10.put("session_scoped", r0);
        r10.put("data", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x034b, code lost:
    
        if (u0().insertWithOnConflict("property_filters", null, r10, 5) != (-1)) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0363, code lost:
    
        r0 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x034d, code lost:
    
        r23.f25694a.a().o().b("Failed to insert property filter (got -1). appId", com.google.android.gms.measurement.internal.C2.x(r24));
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0361, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0367, code lost:
    
        r23.f25694a.a().o().c("Error storing property filter. appId", com.google.android.gms.measurement.internal.C2.x(r24), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0336, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0318, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02c6, code lost:
    
        r0 = r23.f25694a.a().r();
        r8 = com.google.android.gms.measurement.internal.C2.x(r24);
        r10 = java.lang.Integer.valueOf(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02de, code lost:
    
        if (r3.C() == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02e0, code lost:
    
        r16 = java.lang.Integer.valueOf(r3.D());
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02ed, code lost:
    
        r0.d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r8, r10, java.lang.String.valueOf(r16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02eb, code lost:
    
        r16 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x017b, code lost:
    
        r10 = r0.E().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0187, code lost:
    
        if (r10.hasNext() == false) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0193, code lost:
    
        if (((com.google.android.gms.internal.measurement.L1) r10.next()).C() != false) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0195, code lost:
    
        r23.f25694a.a().r().c("Property filter with no ID. Audience definition ignored. appId, audienceId", com.google.android.gms.measurement.internal.C2.x(r24), java.lang.Integer.valueOf(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01ae, code lost:
    
        r10 = r0.H().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01c4, code lost:
    
        if (r10.hasNext() == false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01c6, code lost:
    
        r11 = (com.google.android.gms.internal.measurement.D1) r10.next();
        j();
        h();
        V6.AbstractC1287s.g(r24);
        V6.AbstractC1287s.m(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01e0, code lost:
    
        if (r11.E().isEmpty() == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0214, code lost:
    
        r3 = r11.c();
        r21 = r7;
        r7 = new android.content.ContentValues();
        r7.put("app_id", r24);
        r7.put("audience_id", java.lang.Integer.valueOf(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x022d, code lost:
    
        if (r11.C() == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x022f, code lost:
    
        r8 = java.lang.Integer.valueOf(r11.D());
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0239, code lost:
    
        r7.put("filter_id", r8);
        r7.put("event_name", r11.E());
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0249, code lost:
    
        if (r11.M() == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x024b, code lost:
    
        r8 = java.lang.Boolean.valueOf(r11.N());
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0255, code lost:
    
        r7.put("session_scoped", r8);
        r7.put("data", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0269, code lost:
    
        if (u0().insertWithOnConflict("event_filters", null, r7, 5) != (-1)) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x026b, code lost:
    
        r23.f25694a.a().o().b("Failed to insert event filter (got -1). appId", com.google.android.gms.measurement.internal.C2.x(r24));
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x027e, code lost:
    
        r7 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0284, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0285, code lost:
    
        r23.f25694a.a().o().c("Error storing event filter. appId", com.google.android.gms.measurement.internal.C2.x(r24), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x037a, code lost:
    
        j();
        h();
        V6.AbstractC1287s.g(r24);
        r0 = u0();
        r7 = r18;
        r0.delete("property_filters", r7, new java.lang.String[]{r24, java.lang.String.valueOf(r9)});
        r0.delete("event_filters", r7, new java.lang.String[]{r24, java.lang.String.valueOf(r9)});
        r18 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x03a3, code lost:
    
        r7 = r21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void Y(String str, List list) {
        boolean z10;
        String str2 = "app_id=? and audience_id=?";
        AbstractC1287s.m(list);
        int i10 = 0;
        while (i10 < list.size()) {
            com.google.android.gms.internal.measurement.A1 a12 = (com.google.android.gms.internal.measurement.A1) ((com.google.android.gms.internal.measurement.B1) list.get(i10)).p();
            if (a12.B() != 0) {
                int i11 = 0;
                while (i11 < a12.B()) {
                    com.google.android.gms.internal.measurement.C1 c12 = (com.google.android.gms.internal.measurement.C1) a12.C(i11).p();
                    com.google.android.gms.internal.measurement.C1 c13 = (com.google.android.gms.internal.measurement.C1) c12.clone();
                    String b10 = AbstractC2641b4.b(c12.y());
                    if (b10 != null) {
                        c13.z(b10);
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    int i12 = 0;
                    while (i12 < c12.A()) {
                        com.google.android.gms.internal.measurement.F1 B10 = c12.B(i12);
                        com.google.android.gms.internal.measurement.C1 c14 = c12;
                        String str3 = str2;
                        String c10 = AbstractC2722l5.c(B10.J(), AbstractC2649c4.f25860a, AbstractC2649c4.f25861b);
                        if (c10 != null) {
                            com.google.android.gms.internal.measurement.E1 e12 = (com.google.android.gms.internal.measurement.E1) B10.p();
                            e12.y(c10);
                            c13.C(i12, (com.google.android.gms.internal.measurement.F1) e12.v());
                            z10 = true;
                        }
                        i12++;
                        c12 = c14;
                        str2 = str3;
                    }
                    String str4 = str2;
                    if (z10) {
                        a12.D(i11, c13);
                        list.set(i10, (com.google.android.gms.internal.measurement.B1) a12.v());
                    }
                    i11++;
                    str2 = str4;
                }
            }
            String str5 = str2;
            if (a12.y() != 0) {
                for (int i13 = 0; i13 < a12.y(); i13++) {
                    com.google.android.gms.internal.measurement.L1 z11 = a12.z(i13);
                    String c11 = AbstractC2722l5.c(z11.E(), AbstractC2657d4.f25885a, AbstractC2657d4.f25886b);
                    if (c11 != null) {
                        com.google.android.gms.internal.measurement.K1 k12 = (com.google.android.gms.internal.measurement.K1) z11.p();
                        k12.y(c11);
                        a12.A(i13, k12);
                        list.set(i10, (com.google.android.gms.internal.measurement.B1) a12.v());
                    }
                }
            }
            i10++;
            str2 = str5;
        }
        String str6 = str2;
        j();
        h();
        AbstractC1287s.g(str);
        AbstractC1287s.m(list);
        SQLiteDatabase u02 = u0();
        u02.beginTransaction();
        try {
            j();
            h();
            AbstractC1287s.g(str);
            SQLiteDatabase u03 = u0();
            u03.delete("property_filters", "app_id=?", new String[]{str});
            u03.delete("event_filters", "app_id=?", new String[]{str});
            Iterator it = list.iterator();
            while (it.hasNext()) {
                com.google.android.gms.internal.measurement.B1 b12 = (com.google.android.gms.internal.measurement.B1) it.next();
                j();
                h();
                AbstractC1287s.g(str);
                AbstractC1287s.m(b12);
                if (b12.C()) {
                    int D10 = b12.D();
                    Iterator it2 = b12.H().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (!((com.google.android.gms.internal.measurement.D1) it2.next()).C()) {
                                this.f25694a.a().r().c("Event filter with no ID. Audience definition ignored. appId, audienceId", C2.x(str), Integer.valueOf(D10));
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                } else {
                    this.f25694a.a().r().b("Audience with no ID. appId", C2.x(str));
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                com.google.android.gms.internal.measurement.B1 b13 = (com.google.android.gms.internal.measurement.B1) it3.next();
                arrayList.add(b13.C() ? Integer.valueOf(b13.D()) : null);
            }
            AbstractC1287s.g(str);
            j();
            h();
            SQLiteDatabase u04 = u0();
            try {
                long p02 = p0("select count(1) from audience_filter_values where app_id=?", new String[]{str});
                int i14 = 0;
                int max = Math.max(0, Math.min(2000, this.f25694a.w().E(str, AbstractC2671f2.f25977V)));
                if (p02 > max) {
                    ArrayList arrayList2 = new ArrayList();
                    while (true) {
                        if (i14 >= arrayList.size()) {
                            String join = TextUtils.join(",", arrayList2);
                            StringBuilder sb2 = new StringBuilder(String.valueOf(join).length() + 2);
                            sb2.append("(");
                            sb2.append(join);
                            sb2.append(")");
                            String sb3 = sb2.toString();
                            StringBuilder sb4 = new StringBuilder(sb3.length() + 140);
                            sb4.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
                            sb4.append(sb3);
                            sb4.append(" order by rowid desc limit -1 offset ?)");
                            u04.delete("audience_filter_values", sb4.toString(), new String[]{str, Integer.toString(max)});
                            break;
                        }
                        Integer num = (Integer) arrayList.get(i14);
                        if (num == null) {
                            break;
                        }
                        arrayList2.add(Integer.toString(num.intValue()));
                        i14++;
                    }
                }
            } catch (SQLiteException e10) {
                this.f25694a.a().o().c("Database error querying filters. appId", C2.x(str), e10);
            }
            u02.setTransactionSuccessful();
            u02.endTransaction();
        } catch (Throwable th) {
            u02.endTransaction();
            throw th;
        }
    }

    final E Z(String str, com.google.android.gms.internal.measurement.S2 s22, String str2) {
        E O10 = O("events", str, s22.F());
        if (O10 == null) {
            C2760q3 c2760q3 = this.f25694a;
            c2760q3.a().r().c("Event aggregate wasn't created during raw event logging. appId, event", C2.x(str), c2760q3.D().a(str2));
            return new E(str, s22.F(), 1L, 1L, 1L, s22.H(), 0L, null, null, null, null);
        }
        long j10 = O10.f25369e + 1;
        long j11 = O10.f25368d + 1;
        return new E(O10.f25365a, O10.f25366b, O10.f25367c + 1, j11, j10, O10.f25370f, O10.f25371g, O10.f25372h, O10.f25373i, O10.f25374j, O10.f25375k);
    }

    protected final boolean a0() {
        C2760q3 c2760q3 = this.f25694a;
        Context e10 = c2760q3.e();
        c2760q3.w();
        return e10.getDatabasePath("google_app_measurement.db").exists();
    }

    final /* synthetic */ long b0(String str, String[] strArr, long j10) {
        return q0("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", strArr, -1L);
    }

    @Override // com.google.android.gms.measurement.internal.M6
    protected final boolean l() {
        return false;
    }

    public final long m(String str, C2207c3 c2207c3, String str2, Map map, EnumC2714k5 enumC2714k5, Long l10) {
        int delete;
        h();
        j();
        AbstractC1287s.m(c2207c3);
        AbstractC1287s.g(str);
        h();
        j();
        if (a0()) {
            b7 b7Var = this.f25405b;
            long a10 = b7Var.L0().f26074f.a();
            C2760q3 c2760q3 = this.f25694a;
            long c10 = c2760q3.f().c();
            long abs = Math.abs(c10 - a10);
            c2760q3.w();
            if (abs > C2724m.r()) {
                b7Var.L0().f26074f.b(c10);
                h();
                j();
                if (a0() && (delete = u0().delete("upload_queue", S(), new String[0])) > 0) {
                    c2760q3.a().w().b("Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted", Integer.valueOf(delete));
                }
                AbstractC1287s.g(str);
                h();
                j();
                try {
                    int E10 = c2760q3.w().E(str, AbstractC2671f2.f25935A);
                    if (E10 > 0) {
                        u0().delete("upload_queue", "rowid in (SELECT rowid FROM upload_queue WHERE app_id=? ORDER BY rowid DESC LIMIT -1 OFFSET ?)", new String[]{str, String.valueOf(E10)});
                    }
                } catch (SQLiteException e10) {
                    this.f25694a.a().o().c("Error deleting over the limit queued batches. appId", C2.x(str), e10);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length());
            sb2.append(str3);
            sb2.append("=");
            sb2.append(str4);
            arrayList.add(sb2.toString());
        }
        byte[] c11 = c2207c3.c();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("measurement_batch", c11);
        contentValues.put("upload_uri", str2);
        contentValues.put("upload_headers", androidx.camera.core.impl.O0.a("\r\n", arrayList));
        contentValues.put("upload_type", Integer.valueOf(enumC2714k5.zza()));
        C2760q3 c2760q32 = this.f25694a;
        contentValues.put("creation_timestamp", Long.valueOf(c2760q32.f().a()));
        contentValues.put("retry_count", (Integer) 0);
        if (l10 != null) {
            contentValues.put("associated_row_id", l10);
        }
        try {
            long insert = u0().insert("upload_queue", null, contentValues);
            if (insert != -1) {
                return insert;
            }
            c2760q32.a().o().b("Failed to insert MeasurementBatch (got -1) to upload_queue. appId", str);
            return -1L;
        } catch (SQLiteException e11) {
            this.f25694a.a().o().c("Error storing MeasurementBatch to upload_queue. appId", str, e11);
            return -1L;
        }
    }

    final /* synthetic */ A6 m0() {
        return this.f26433e;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final e7 n(long j10) {
        C2803w c2803w;
        Cursor cursor;
        h();
        j();
        Cursor cursor2 = null;
        try {
            cursor = u0().query("upload_queue", new String[]{"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id", "last_upload_timestamp"}, "rowId=?", new String[]{String.valueOf(j10)}, null, null, null, "1");
            try {
            } catch (SQLiteException e10) {
                e = e10;
                c2803w = this;
                try {
                    c2803w.f25694a.a().o().c("Error to querying MeasurementBatch from upload_queue. rowId", Long.valueOf(j10), e);
                    if (cursor != null) {
                    }
                    return null;
                } catch (Throwable th) {
                    th = th;
                    cursor2 = cursor;
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor2 = cursor;
                if (cursor2 != null) {
                }
                throw th;
            }
        } catch (SQLiteException e11) {
            e = e11;
            c2803w = this;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor2 != null) {
            }
            throw th;
        }
        if (cursor.moveToFirst()) {
            e7 R10 = R((String) AbstractC1287s.m(cursor.getString(1)), j10, cursor.getBlob(2), cursor.getString(3), cursor.getString(4), cursor.getInt(5), cursor.getInt(6), cursor.getLong(7), cursor.getLong(8), cursor.getLong(9));
            cursor.close();
            return R10;
        }
        if (cursor != null) {
            cursor.close();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r7v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n0(String str, long j10, long j11, X6 x62) {
        String str2;
        String str3;
        Cursor cursor;
        SQLiteDatabase u02;
        ?? isEmpty;
        String str4;
        String[] strArr;
        String string;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        String str5;
        long j12;
        AbstractC1287s.m(x62);
        h();
        j();
        ?? r62 = 0;
        r6 = null;
        Cursor cursor2 = null;
        try {
            try {
                u02 = u0();
                isEmpty = TextUtils.isEmpty(str);
                str4 = BuildConfig.FLAVOR;
            } catch (SQLiteException e10) {
                e = e10;
                str2 = str;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (isEmpty != 0) {
                String[] strArr5 = j11 != -1 ? new String[]{String.valueOf(j11), String.valueOf(j10)} : new String[]{String.valueOf(j10)};
                if (j11 != -1) {
                    str4 = "rowid <= ? and ";
                }
                StringBuilder sb2 = new StringBuilder(str4.length() + 148);
                sb2.append("select app_id, metadata_fingerprint from raw_events where ");
                sb2.append(str4);
                sb2.append("app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;");
                cursor = u02.rawQuery(sb2.toString(), strArr5);
                try {
                } catch (SQLiteException e11) {
                    e = e11;
                    str3 = str;
                }
                if (!cursor.moveToFirst()) {
                    if (cursor != null) {
                        cursor.close();
                        return;
                    }
                    return;
                }
                str3 = cursor.getString(0);
                try {
                    string = cursor.getString(1);
                    cursor.close();
                } catch (SQLiteException e12) {
                    e = e12;
                    cursor2 = cursor;
                    this.f25694a.a().o().c("Data loss. Error selecting raw event. appId", C2.x(str3), e);
                    cursor = cursor2;
                    if (cursor != null) {
                    }
                }
            } else {
                try {
                    if (j11 != -1) {
                        String str6 = str;
                        strArr = new String[]{str6, String.valueOf(j11)};
                        isEmpty = str6;
                    } else {
                        isEmpty = str;
                        strArr = new String[]{str};
                    }
                    if (j11 != -1) {
                        str4 = " and rowid <= ?";
                    }
                    StringBuilder sb3 = new StringBuilder(str4.length() + 84);
                    sb3.append("select metadata_fingerprint from raw_events where app_id = ?");
                    sb3.append(str4);
                    sb3.append(" order by rowid limit 1;");
                    cursor = u02.rawQuery(sb3.toString(), strArr);
                } catch (SQLiteException e13) {
                    e = e13;
                    str2 = isEmpty;
                }
                try {
                } catch (SQLiteException e14) {
                    e = e14;
                    cursor2 = cursor;
                    str2 = isEmpty;
                    str3 = str2;
                    this.f25694a.a().o().c("Data loss. Error selecting raw event. appId", C2.x(str3), e);
                    cursor = cursor2;
                    if (cursor != null) {
                    }
                }
                if (cursor.moveToFirst()) {
                    string = cursor.getString(0);
                    cursor.close();
                    str3 = isEmpty;
                } else if (cursor != null) {
                }
            }
            cursor = u02.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str3, string}, null, null, "rowid", "2");
            if (cursor.moveToFirst()) {
                try {
                    C2225e3 c2225e3 = (C2225e3) ((C2216d3) g7.W(C2225e3.h0(), cursor.getBlob(0))).v();
                    if (cursor.moveToNext()) {
                        this.f25694a.a().r().b("Get multiple raw event metadata records, expected one. appId", C2.x(str3));
                    }
                    cursor.close();
                    AbstractC1287s.m(c2225e3);
                    x62.f25734a = c2225e3;
                    C2760q3 c2760q3 = this.f25694a;
                    if (c2760q3.w().H(null, AbstractC2671f2.f26022l1)) {
                        long q02 = q0("select (rowid - 1) as max_rowid from raw_events where app_id = ? and metadata_fingerprint != ? order by rowid limit 1;", new String[]{str3, string}, -1L);
                        if (j11 != -1) {
                            j12 = j11;
                        } else if (q02 != -1) {
                            j12 = -1;
                        } else {
                            strArr2 = new String[]{str3, string};
                            strArr4 = strArr2;
                            str5 = "app_id = ? and metadata_fingerprint = ?";
                        }
                        if (j12 != -1 && q02 != -1) {
                            q02 = Math.min(j12, q02);
                        } else if (j12 != -1) {
                            q02 = j12;
                        }
                        strArr3 = new String[]{str3, string, String.valueOf(q02)};
                        strArr4 = strArr3;
                        str5 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                    } else if (j11 != -1) {
                        strArr3 = new String[]{str3, string, String.valueOf(j11)};
                        strArr4 = strArr3;
                        str5 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                    } else {
                        strArr2 = new String[]{str3, string};
                        strArr4 = strArr2;
                        str5 = "app_id = ? and metadata_fingerprint = ?";
                    }
                    cursor = u02.query("raw_events", new String[]{"rowid", "name", "timestamp", "data"}, str5, strArr4, null, null, "rowid", null);
                    if (cursor.moveToFirst()) {
                        do {
                            long j13 = cursor.getLong(0);
                            try {
                                com.google.android.gms.internal.measurement.R2 r22 = (com.google.android.gms.internal.measurement.R2) g7.W(com.google.android.gms.internal.measurement.S2.M(), cursor.getBlob(3));
                                r22.L(cursor.getString(1));
                                r22.O(cursor.getLong(2));
                                if (!x62.a(j13, (com.google.android.gms.internal.measurement.S2) r22.v())) {
                                    break;
                                }
                            } catch (IOException e15) {
                                this.f25694a.a().o().c("Data loss. Failed to merge raw event. appId", C2.x(str3), e15);
                            }
                        } while (cursor.moveToNext());
                    } else {
                        c2760q3.a().r().b("Raw event data disappeared while in transaction. appId", C2.x(str3));
                    }
                } catch (IOException e16) {
                    this.f25694a.a().o().c("Data loss. Failed to merge raw event metadata. appId", C2.x(str3), e16);
                }
            } else {
                this.f25694a.a().o().b("Raw event metadata record is missing. appId", C2.x(str3));
            }
            if (cursor != null) {
            }
        } catch (Throwable th2) {
            th = th2;
            r62 = "select metadata_fingerprint from raw_events where app_id = ?";
            if (r62 != 0) {
                r62.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List o(String str, I6 i62, int i10) {
        List emptyList;
        AbstractC1287s.g(str);
        h();
        j();
        Cursor cursor = null;
        try {
            SQLiteDatabase u02 = u0();
            String[] strArr = {"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id", "last_upload_timestamp"};
            String T10 = T(i62.f25499a);
            String S10 = S();
            StringBuilder sb2 = new StringBuilder(String.valueOf(T10).length() + 17 + S10.length());
            sb2.append("app_id=?");
            sb2.append(T10);
            sb2.append(" AND NOT ");
            sb2.append(S10);
            cursor = u02.query("upload_queue", strArr, sb2.toString(), new String[]{str}, null, null, "creation_timestamp ASC", i10 > 0 ? String.valueOf(i10) : null);
            emptyList = new ArrayList();
            while (cursor.moveToNext()) {
                e7 R10 = R(str, cursor.getLong(0), cursor.getBlob(2), cursor.getString(3), cursor.getString(4), cursor.getInt(5), cursor.getInt(6), cursor.getLong(7), cursor.getLong(8), cursor.getLong(9));
                if (R10 != null) {
                    emptyList.add(R10);
                }
            }
        } catch (SQLiteException e10) {
            try {
                this.f25694a.a().o().c("Error to querying MeasurementBatch from upload_queue. appId", str, e10);
                emptyList = Collections.emptyList();
            } catch (Throwable th) {
                th = th;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
            }
            throw th;
        }
        if (cursor != null) {
            cursor.close();
        }
        return emptyList;
    }

    public final boolean p(String str) {
        EnumC2714k5[] enumC2714k5Arr = {EnumC2714k5.GOOGLE_SIGNAL};
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(enumC2714k5Arr[0].zza()));
        String T10 = T(arrayList);
        String S10 = S();
        StringBuilder sb2 = new StringBuilder(String.valueOf(T10).length() + 61 + S10.length());
        sb2.append("SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=?");
        sb2.append(T10);
        sb2.append(" AND NOT ");
        sb2.append(S10);
        return p0(sb2.toString(), new String[]{str}) != 0;
    }

    public final void q(Long l10) {
        h();
        j();
        AbstractC1287s.m(l10);
        try {
            if (u0().delete("upload_queue", "rowid=?", new String[]{l10.toString()}) != 1) {
                this.f25694a.a().r().a("Deleted fewer rows from upload_queue than expected");
            }
        } catch (SQLiteException e10) {
            this.f25694a.a().o().b("Failed to delete a MeasurementBatch in a upload_queue table", e10);
            throw e10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String r() {
        SQLiteException e10;
        Cursor cursor;
        SQLiteDatabase u02 = u0();
        ?? r12 = 0;
        try {
            try {
                cursor = u02.rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
                try {
                    if (cursor.moveToFirst()) {
                        String string = cursor.getString(0);
                        cursor.close();
                        return string;
                    }
                } catch (SQLiteException e11) {
                    e10 = e11;
                    this.f25694a.a().o().b("Database error getting next bundle app id", e10);
                    if (cursor != null) {
                    }
                    return null;
                }
            } catch (Throwable th) {
                r12 = u02;
                th = th;
                if (r12 != 0) {
                    r12.close();
                }
                throw th;
            }
        } catch (SQLiteException e12) {
            e10 = e12;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (r12 != 0) {
            }
            throw th;
        }
        if (cursor != null) {
            cursor.close();
        }
        return null;
    }

    public final void r0() {
        j();
        u0().beginTransaction();
    }

    public final boolean s() {
        return p0("select count(1) > 0 from queue where has_realtime = 1", null) != 0;
    }

    public final void s0() {
        j();
        u0().setTransactionSuccessful();
    }

    public final void t(long j10) {
        h();
        j();
        try {
            if (u0().delete("queue", "rowid=?", new String[]{String.valueOf(j10)}) == 1) {
            } else {
                throw new SQLiteException("Deleted fewer rows from queue than expected");
            }
        } catch (SQLiteException e10) {
            this.f25694a.a().o().b("Failed to delete a bundle in a queue table", e10);
            throw e10;
        }
    }

    public final void t0() {
        j();
        u0().endTransaction();
    }

    final void u() {
        h();
        j();
        if (a0()) {
            b7 b7Var = this.f25405b;
            long a10 = b7Var.L0().f26073e.a();
            C2760q3 c2760q3 = this.f25694a;
            long c10 = c2760q3.f().c();
            long abs = Math.abs(c10 - a10);
            c2760q3.w();
            if (abs > C2724m.r()) {
                b7Var.L0().f26073e.b(c10);
                h();
                j();
                if (a0()) {
                    SQLiteDatabase u02 = u0();
                    String valueOf = String.valueOf(c2760q3.f().a());
                    c2760q3.w();
                    int delete = u02.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{valueOf, String.valueOf(C2724m.q())});
                    if (delete > 0) {
                        c2760q3.a().w().b("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                    }
                }
            }
        }
    }

    final SQLiteDatabase u0() {
        h();
        try {
            return this.f26432d.getWritableDatabase();
        } catch (SQLiteException e10) {
            this.f25694a.a().r().b("Error opening database", e10);
            throw e10;
        }
    }

    final void v(List list) {
        h();
        j();
        AbstractC1287s.m(list);
        AbstractC1287s.o(list.size());
        if (a0()) {
            String join = TextUtils.join(",", list);
            StringBuilder sb2 = new StringBuilder(String.valueOf(join).length() + 2);
            sb2.append("(");
            sb2.append(join);
            sb2.append(")");
            String sb3 = sb2.toString();
            StringBuilder sb4 = new StringBuilder(sb3.length() + 80);
            sb4.append("SELECT COUNT(1) FROM queue WHERE rowid IN ");
            sb4.append(sb3);
            sb4.append(" AND retry_count =  2147483647 LIMIT 1");
            if (p0(sb4.toString(), null) > 0) {
                this.f25694a.a().r().a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase u02 = u0();
                StringBuilder sb5 = new StringBuilder(sb3.length() + 127);
                sb5.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb5.append(sb3);
                sb5.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                u02.execSQL(sb5.toString());
            } catch (SQLiteException e10) {
                this.f25694a.a().o().b("Error incrementing retry count. error", e10);
            }
        }
    }

    public final E v0(String str, String str2) {
        return O("events", str, str2);
    }

    final void w(Long l10) {
        h();
        j();
        AbstractC1287s.m(l10);
        if (a0()) {
            StringBuilder sb2 = new StringBuilder(l10.toString().length() + 86);
            sb2.append("SELECT COUNT(1) FROM upload_queue WHERE rowid = ");
            sb2.append(l10);
            sb2.append(" AND retry_count =  2147483647 LIMIT 1");
            if (p0(sb2.toString(), null) > 0) {
                this.f25694a.a().r().a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase u02 = u0();
                long a10 = this.f25694a.f().a();
                StringBuilder sb3 = new StringBuilder(String.valueOf(a10).length() + 60);
                sb3.append(" SET retry_count = retry_count + 1, last_upload_timestamp = ");
                sb3.append(a10);
                String sb4 = sb3.toString();
                StringBuilder sb5 = new StringBuilder(sb4.length() + 34 + l10.toString().length() + 29);
                sb5.append("UPDATE upload_queue");
                sb5.append(sb4);
                sb5.append(" WHERE rowid = ");
                sb5.append(l10);
                sb5.append(" AND retry_count < 2147483647");
                u02.execSQL(sb5.toString());
            } catch (SQLiteException e10) {
                this.f25694a.a().o().b("Error incrementing retry count. error", e10);
            }
        }
    }

    public final void w0(E e10) {
        P("events", e10);
    }

    final Object x(Cursor cursor, int i10) {
        int type = cursor.getType(i10);
        if (type == 0) {
            this.f25694a.a().o().a("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i10));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i10));
        }
        if (type == 3) {
            return cursor.getString(i10);
        }
        if (type != 4) {
            this.f25694a.a().o().b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
            return null;
        }
        this.f25694a.a().o().a("Loaded invalid blob type value, ignoring it");
        return null;
    }

    public final void x0(String str) {
        E O10;
        Q("events_snapshot", str);
        Cursor cursor = null;
        try {
            try {
                cursor = u0().query("events", (String[]) Collections.singletonList("name").toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
                if (cursor.moveToFirst()) {
                    do {
                        String string = cursor.getString(0);
                        if (string != null && (O10 = O("events", str, string)) != null) {
                            P("events_snapshot", O10);
                        }
                    } while (cursor.moveToNext());
                }
            } catch (SQLiteException e10) {
                this.f25694a.a().o().c("Error creating snapshot. appId", C2.x(str), e10);
            }
            if (cursor != null) {
                cursor.close();
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final long y() {
        return q0("select max(bundle_end_timestamp) from queue", null, 0L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0059, code lost:
    
        if (r8 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005b, code lost:
    
        P("events", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c0, code lost:
    
        if (r8 != null) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y0(String str) {
        boolean z10;
        E O10;
        ArrayList arrayList = new ArrayList(Arrays.asList("name", "lifetime_count"));
        E O11 = O("events", str, "_f");
        E O12 = O("events", str, "_v");
        Q("events", str);
        Cursor cursor = null;
        boolean z11 = false;
        try {
            cursor = u0().query("events_snapshot", (String[]) arrayList.toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
        } catch (SQLiteException e10) {
            e = e10;
            z10 = false;
        } catch (Throwable th) {
            th = th;
            z10 = false;
        }
        if (!cursor.moveToFirst()) {
            cursor.close();
            if (O11 == null) {
            }
            P("events", O11);
            Q("events_snapshot", str);
        }
        boolean z12 = false;
        z10 = false;
        do {
            try {
                String string = cursor.getString(0);
                if (cursor.getLong(1) >= 1) {
                    if ("_f".equals(string)) {
                        z12 = true;
                    } else if ("_v".equals(string)) {
                        z10 = true;
                    }
                }
                if (string != null && (O10 = O("events_snapshot", str, string)) != null) {
                    P("events", O10);
                }
            } catch (SQLiteException e11) {
                e = e11;
                z11 = z12;
                try {
                    this.f25694a.a().o().c("Error querying snapshot. appId", C2.x(str), e);
                    z12 = z11;
                    if (cursor != null) {
                    }
                    if (!z12) {
                    }
                    if (!z10) {
                    }
                    Q("events_snapshot", str);
                } catch (Throwable th2) {
                    th = th2;
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (z11 && O11 != null) {
                        P("events", O11);
                    } else if (!z10 && O12 != null) {
                        P("events", O12);
                    }
                    Q("events_snapshot", str);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                z11 = z12;
                if (cursor != null) {
                }
                if (z11) {
                }
                if (!z10) {
                    P("events", O12);
                }
                Q("events_snapshot", str);
                throw th;
            }
        } while (cursor.moveToNext());
        if (cursor != null) {
            cursor.close();
        }
        if (!z12 || O11 == null) {
            if (!z10) {
            }
            Q("events_snapshot", str);
        }
        P("events", O11);
        Q("events_snapshot", str);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|2|3|4|(2:6|(3:8|9|10)(1:13))|14|15|(3:17|9|10)(4:18|19|9|10)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ae, code lost:
    
        r3 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b8, code lost:
    
        r13.f25694a.a().o().d("Error inserting column. appId", com.google.android.gms.measurement.internal.C2.x(r14), "first_open_count", r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final long z(String str, String str2) {
        long j10;
        long j11;
        AbstractC1287s.g(str);
        AbstractC1287s.g("first_open_count");
        h();
        j();
        SQLiteDatabase u02 = u0();
        u02.beginTransaction();
        try {
            try {
                StringBuilder sb2 = new StringBuilder(48);
                sb2.append("select ");
                sb2.append("first_open_count");
                sb2.append(" from app2 where app_id=?");
                j11 = -1;
                j10 = q0(sb2.toString(), new String[]{str}, -1L);
            } finally {
                u02.endTransaction();
            }
        } catch (SQLiteException e10) {
            SQLiteException e11 = e10;
            j10 = 0;
        }
        if (j10 == -1) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("first_open_count", (Integer) 0);
            contentValues.put("previous_install_count", (Integer) 0);
            if (u02.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                this.f25694a.a().o().c("Failed to insert column (got -1). appId", C2.x(str), "first_open_count");
                return j11;
            }
            j10 = 0;
        }
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("app_id", str);
        contentValues2.put("first_open_count", Long.valueOf(1 + j10));
        if (u02.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
            this.f25694a.a().o().c("Failed to update column (got 0). appId", C2.x(str), "first_open_count");
            return j11;
        }
        u02.setTransactionSuccessful();
        j11 = j10;
        return j11;
    }

    public final void z0(String str, String str2) {
        AbstractC1287s.g(str);
        AbstractC1287s.g(str2);
        h();
        j();
        try {
            u0().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            C2760q3 c2760q3 = this.f25694a;
            c2760q3.a().o().d("Error deleting user property. appId", C2.x(str), c2760q3.D().c(str2), e10);
        }
    }
}
