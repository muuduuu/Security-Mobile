package v9;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;

/* renamed from: v9.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4974c {

    /* renamed from: a, reason: collision with root package name */
    private String f44029a;

    /* renamed from: b, reason: collision with root package name */
    private String f44030b;

    /* renamed from: c, reason: collision with root package name */
    private String f44031c;

    /* renamed from: d, reason: collision with root package name */
    private String f44032d;

    public C4974c(String dpCampaignId, String campaignMedium, String campaignSource, String campaignRefCode) {
        Intrinsics.checkNotNullParameter(dpCampaignId, "dpCampaignId");
        Intrinsics.checkNotNullParameter(campaignMedium, "campaignMedium");
        Intrinsics.checkNotNullParameter(campaignSource, "campaignSource");
        Intrinsics.checkNotNullParameter(campaignRefCode, "campaignRefCode");
        this.f44029a = dpCampaignId;
        this.f44030b = campaignMedium;
        this.f44031c = campaignSource;
        this.f44032d = campaignRefCode;
    }

    public final String a() {
        return this.f44030b;
    }

    public final String b() {
        return this.f44032d;
    }

    public final String c() {
        return this.f44031c;
    }

    public final String d() {
        return this.f44029a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4974c)) {
            return false;
        }
        C4974c c4974c = (C4974c) obj;
        return Intrinsics.b(this.f44029a, c4974c.f44029a) && Intrinsics.b(this.f44030b, c4974c.f44030b) && Intrinsics.b(this.f44031c, c4974c.f44031c) && Intrinsics.b(this.f44032d, c4974c.f44032d);
    }

    public int hashCode() {
        return (((((this.f44029a.hashCode() * 31) + this.f44030b.hashCode()) * 31) + this.f44031c.hashCode()) * 31) + this.f44032d.hashCode();
    }

    public String toString() {
        return "EventContext(dpCampaignId=" + this.f44029a + ", campaignMedium=" + this.f44030b + ", campaignSource=" + this.f44031c + ", campaignRefCode=" + this.f44032d + ")";
    }

    public /* synthetic */ C4974c(String str, String str2, String str3, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? BuildConfig.FLAVOR : str, (i10 & 2) != 0 ? BuildConfig.FLAVOR : str2, (i10 & 4) != 0 ? BuildConfig.FLAVOR : str3, (i10 & 8) != 0 ? BuildConfig.FLAVOR : str4);
    }
}
