package com.groww.ems.EventRequestV2;

import com.google.protobuf.AbstractC2891w;
import com.google.protobuf.O;
import com.google.protobuf.W;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public final class EventRequestV2OuterClass$EventContext extends AbstractC2891w implements O {
    private static final EventRequestV2OuterClass$EventContext DEFAULT_INSTANCE;
    private static volatile W PARSER;
    private int bitField0_;
    private String dpCampaignId_ = BuildConfig.FLAVOR;
    private String campaignMedium_ = BuildConfig.FLAVOR;
    private String campaignSource_ = BuildConfig.FLAVOR;
    private String campaignRefCode_ = BuildConfig.FLAVOR;
    private String dpLandingPage_ = BuildConfig.FLAVOR;
    private String pageTitle_ = BuildConfig.FLAVOR;
    private String referrer_ = BuildConfig.FLAVOR;
    private String referrerType_ = BuildConfig.FLAVOR;
    private String referrerUrl_ = BuildConfig.FLAVOR;
    private String referrerNetwork_ = BuildConfig.FLAVOR;
    private String pageUrl_ = BuildConfig.FLAVOR;
    private String referrerHost_ = BuildConfig.FLAVOR;

    public static final class a extends AbstractC2891w.a implements O {
        /* synthetic */ a(com.groww.ems.EventRequestV2.a aVar) {
            this();
        }

        public a o(String str) {
            i();
            ((EventRequestV2OuterClass$EventContext) this.f28816b).setCampaignMedium(str);
            return this;
        }

        public a p(String str) {
            i();
            ((EventRequestV2OuterClass$EventContext) this.f28816b).setCampaignRefCode(str);
            return this;
        }

        public a q(String str) {
            i();
            ((EventRequestV2OuterClass$EventContext) this.f28816b).setCampaignSource(str);
            return this;
        }

        public a s(String str) {
            i();
            ((EventRequestV2OuterClass$EventContext) this.f28816b).setDpCampaignId(str);
            return this;
        }

        private a() {
            super(EventRequestV2OuterClass$EventContext.DEFAULT_INSTANCE);
        }
    }

    static {
        EventRequestV2OuterClass$EventContext eventRequestV2OuterClass$EventContext = new EventRequestV2OuterClass$EventContext();
        DEFAULT_INSTANCE = eventRequestV2OuterClass$EventContext;
        AbstractC2891w.registerDefaultInstance(EventRequestV2OuterClass$EventContext.class, eventRequestV2OuterClass$EventContext);
    }

    private EventRequestV2OuterClass$EventContext() {
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCampaignMedium(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.campaignMedium_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCampaignRefCode(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.campaignRefCode_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCampaignSource(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.campaignSource_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDpCampaignId(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.dpCampaignId_ = str;
    }

    @Override // com.google.protobuf.AbstractC2891w
    protected final Object dynamicMethod(AbstractC2891w.d dVar, Object obj, Object obj2) {
        com.groww.ems.EventRequestV2.a aVar = null;
        switch (com.groww.ems.EventRequestV2.a.f28826a[dVar.ordinal()]) {
            case 1:
                return new EventRequestV2OuterClass$EventContext();
            case 2:
                return new a(aVar);
            case 3:
                return AbstractC2891w.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006ለ\u0005\u0007ለ\u0006\bለ\u0007\tለ\b\nለ\t\u000bለ\n\fለ\u000b", new Object[]{"bitField0_", "dpCampaignId_", "campaignMedium_", "campaignSource_", "campaignRefCode_", "dpLandingPage_", "pageTitle_", "referrer_", "referrerType_", "referrerUrl_", "referrerNetwork_", "pageUrl_", "referrerHost_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                W w10 = PARSER;
                if (w10 == null) {
                    synchronized (EventRequestV2OuterClass$EventContext.class) {
                        try {
                            w10 = PARSER;
                            if (w10 == null) {
                                w10 = new AbstractC2891w.b(DEFAULT_INSTANCE);
                                PARSER = w10;
                            }
                        } finally {
                        }
                    }
                }
                return w10;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
